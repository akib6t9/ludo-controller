package c.l.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static final String b = "CloudSyncClient";

    /* renamed from: c, reason: collision with root package name */
    public static final String f0c = "ludo_cloud_sync_prefs";
    public static final String d = "access_token";
    public static final String e = "refresh_token";
    public static final String f = "room_id";
    public static final String g = "pairing_code";
    public static final String h = "target_model";
    public static final long i = 45;
    public static final long j = 1000;
    public static final long k = 30000;
    public static volatile a l;
    public final Context a;
    public volatile s u;
    public volatile Socket vSocket;
    public volatile OutputStream w;
    public volatile InputStream x;
    public volatile ScheduledFuture y;
    public volatile ScheduledFuture z;
    public volatile int A = 0;
    public volatile boolean B = false;
    public volatile int C = -1;
    public final Handler m = new Handler(Looper.getMainLooper());
    public final ExecutorService n = Executors.newCachedThreadPool();
    public final ScheduledExecutorService o = Executors.newSingleThreadScheduledExecutor();
    public final ConcurrentLinkedQueue p = new ConcurrentLinkedQueue();
    public final AtomicInteger q = new AtomicInteger(1);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);

    public a(Context context) {
        this.a = context;
    }

    public static a a(Context context) {
        if (l == null) {
            synchronized (a.class) {
                if (l == null) {
                    l = new a(context.getApplicationContext());
                }
            }
        }
        return l;
    }

    public void a(int i2) {
        if (i2 <= 0 || i2 > 6 || i2 == this.C) {
            return;
        }
        this.C = i2;
        try {
            int andIncrement = this.q.getAndIncrement();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "cmd");
            jSONObject.put("a", "set_dice");
            jSONObject.put("v", i2);
            jSONObject.put("seq", andIncrement);
            jSONObject.put("ts", System.currentTimeMillis());
            a(jSONObject);
        } catch (Exception e2) {
            Log.e(b, "Error formatting dice command: " + e2.getMessage());
        }
    }

    public void a(int i2, boolean z, boolean z2) {
        this.m.post(new e(this, i2, z, z2));
    }

    public void a(int i2, byte[] bArr) {
        switch (i2) {
            case 1:
                a(new String(bArr, StandardCharsets.UTF_8));
                break;
            case 8:
                n();
                break;
            case 9:
                b(10, bArr);
                break;
        }
    }

    public static /* synthetic */ void a(a aVar, t tVar, String str, String str2, String str3) {
        if (tVar != null) {
            aVar.m.post(new i(aVar, tVar, str, str2, str3));
        }
    }

    public static /* synthetic */ void a(a aVar, t tVar, String str, boolean z) {
        if (tVar != null) {
            aVar.m.post(new j(aVar, tVar, str, z));
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2) {
        Socket socket;
        try {
            URI create = URI.create(v.c(aVar.a));
            boolean z = "http".equalsIgnoreCase(create.getScheme()) ? false : true;
            String host = create.getHost();
            int port = create.getPort() != -1 ? create.getPort() : z ? 443 : 80;
            if (z) {
                socket = ((SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket(host, port);
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
                sSLSocket.setSSLParameters(sSLParameters);
                sSLSocket.startHandshake();
                v.a(sSLSocket.getSession().getPeerCertificates());
            } else {
                socket = new Socket(host, port);
            }
            socket.setTcpNoDelay(true);
            socket.setKeepAlive(true);
            socket.setSoTimeout(0);
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            outputStream.write(("GET " + "/api/v1/sync/ws?room=".concat(String.valueOf(Uri.encode(str2 != null ? str2.trim() : ""))) + " HTTP/1.1\r\nHost: " + host + ((port == 80 || port == 443) ? "" : ":".concat(String.valueOf(port))) + "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: " + Base64.encodeToString(bArr, 2) + "\r\nSec-WebSocket-Version: 13\r\nAuthorization: Bearer " + str + "\r\nSec-WebSocket-Protocol: " + str + "\r\nOrigin: https://" + host + "\r\n\r\n").getBytes(StandardCharsets.US_ASCII));
            outputStream.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.US_ASCII));
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new Exception("Handshake failed: empty response from server");
            }
            if (readLine.contains("101") || readLine.contains("200")) {
                while (true) {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 == null || readLine2.isEmpty()) {
                        break;
                    } else if (readLine2.toLowerCase().contains("x-quota-fallback")) {
                        aVar.t.set(true);
                    }
                }
                synchronized (aVar) {
                    aVar.vSocket = socket;
                    aVar.w = outputStream;
                    aVar.x = inputStream;
                    aVar.r.set(true);
                    aVar.s.set(false);
                    aVar.A = 0;
                }
                aVar.b(str2, "normal");
                aVar.k();
                aVar.y = aVar.o.scheduleWithFixedDelay(new o(aVar), i, i, TimeUnit.SECONDS);
                aVar.n.execute(new n(aVar));
                aVar.a(inputStream);
                return;
            }
            if (readLine.contains("429")) {
                aVar.t.set(true);
                aVar.c("Daily free quota (100k requests) exceeded.", "18080");
                throw new Exception("Quota limit exceeded (HTTP 429)");
            }
            if (!readLine.contains("401")) {
                throw new Exception("WebSocket Handshake rejected: ".concat(String.valueOf(readLine)));
            }
            try {
                String b2 = v.getSec(aVar.a(), e, "");
                if (!b2.isEmpty()) {
                    String c2 = v.c(aVar.a);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(e, b2);
                    jSONObject.put("device_id", aVar.p());
                    String a = v.a(c2 + "/api/v1/pairing/refresh", jSONObject.toString());
                    if (a != null) {
                        JSONObject jSONObject2 = new JSONObject(a);
                        if (jSONObject2.optBoolean("success", false)) {
                            v.putSec(aVar.a(), d, jSONObject2.getString(d));
                            String optString = jSONObject2.optString(e, "");
                            if (!optString.isEmpty()) {
                                v.putSec(aVar.a(), e, optString);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
            }
            throw new Exception("Token expired (HTTP 401)");
        } catch (Exception e3) {
            Log.w(b, "WebSocket connection error: " + e3.getMessage());
            e3.getMessage();
            aVar.n();
            aVar.l();
        }
    }

    public void a(s sVar) {
        this.u = sVar;
    }

    public void a(t tVar, String str, String str2, String str3) {
        if (tVar == null) {
            return;
        }
        this.m.post(new i(this, tVar, str, str2, str3));
    }

    public void a(t tVar, String str, boolean z) {
        if (tVar == null) {
            return;
        }
        this.m.post(new j(this, tVar, str, z));
    }

    public void a(InputStream inputStream) {
        int read;
        int read2;
        long j2;
        byte[] bArr;
        int read3;
        try {
            while (this.r.get() && (read = inputStream.read()) != -1 && (read2 = inputStream.read()) != -1) {
                int i2 = read & 15;
                boolean z = (read2 & 128) != 0;
                long j3 = read2 & 127;
                if (j3 == 126) {
                    j2 = ((inputStream.read() & 255) << 8) | (inputStream.read() & 255);
                } else {
                    if (j3 == 127) {
                        byte[] bArrLen = new byte[8];
                        inputStream.read(bArrLen);
                        j3 = 0;
                        for (int i3 = 0; i3 < 8; i3++) {
                            j3 = (j3 << 8) | (bArrLen[i3] & 255);
                        }
                    }
                    j2 = j3;
                }
                if (z) {
                    byte[] bArr2 = new byte[4];
                    inputStream.read(bArr2);
                    bArr = bArr2;
                } else {
                    bArr = null;
                }
                byte[] bArr3 = new byte[(int) j2];
                int i4 = 0;
                while (i4 < j2 && (read3 = inputStream.read(bArr3, i4, ((int) j2) - i4)) != -1) {
                    i4 += read3;
                }
                if (z && bArr != null) {
                    for (int i5 = 0; i5 < bArr3.length; i5++) {
                        bArr3[i5] = (byte) (bArr3[i5] ^ bArr[i5 % 4]);
                    }
                }
                switch (i2) {
                    case 1:
                        a(new String(bArr3, StandardCharsets.UTF_8));
                        break;
                    case 8:
                        n();
                        break;
                    case 9:
                        b(10, bArr3);
                        break;
                }
            }
        } catch (Exception e2) {
            new StringBuilder("Frame reader closed: ").append(e2.getMessage());
        } finally {
            n();
            l();
        }
    }

    public void a(Runnable runnable) {
        h();
        this.n.execute(new k(this, runnable));
    }

    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t", "");
            if ("welcome".equals(optString)) {
                b(f(), jSONObject.optString("quota_mode", "normal"));
            } else if ("presence".equals(optString)) {
                a(jSONObject.optString("role", ""), jSONObject.optString("deviceId", ""), "online".equals(jSONObject.optString("status", "")));
            } else if ("ack".equals(optString)) {
                a(jSONObject.optInt("seq", 0), jSONObject.optBoolean("delivered", false), jSONObject.optBoolean("dup", false));
            } else if ("telemetry".equals(optString) || "state".equals(optString)) {
                b(jSONObject);
            } else if ("quota_exceeded".equals(optString)) {
                this.t.set(true);
                c(jSONObject.optString("error", "Daily quota reached"), "18080");
            }
        } catch (Exception e2) {
            Log.w(b, "Failed parsing server message: ".concat(String.valueOf(str)));
        }
    }

    public void a(String str, String str2) {
        a(this, str, str2);
    }

    public void a(String str, String str2, t tVar) {
        this.n.execute(new b(this, str, str2, tVar));
    }

    public void a(String str, String str2, boolean z) {
        this.m.post(new d(this, str, str2, z));
    }

    public void a(String str, boolean z) {
        try {
            int andIncrement = this.q.getAndIncrement();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "cmd");
            jSONObject.put("a", "lock");
            jSONObject.put("c", str);
            jSONObject.put("v", z ? 1 : 0);
            jSONObject.put("seq", andIncrement);
            a(jSONObject);
        } catch (Exception e2) {
            Log.e(b, "Error formatting lock command: " + e2.getMessage());
        }
    }

    public void a(JSONObject jSONObject) {
        if (this.r.get()) {
            if (b(jSONObject.toString())) {
                return;
            }
            this.p.offer(jSONObject);
        } else {
            this.p.offer(jSONObject);
            if (this.B || this.s.get()) {
                return;
            }
            b();
        }
    }

    public void b(String str, String str2) {
        this.m.post(new r(this, str, str2));
    }

    public void b(JSONObject jSONObject) {
        this.m.post(new f(this, jSONObject));
    }

    public synchronized boolean b(int i2, byte[] bArr) {
        boolean z = false;
        synchronized (this) {
            try {
                if (this.w != null && this.vSocket != null && !this.vSocket.isClosed()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write((i2 & 15) | 128);
                    int length = bArr != null ? bArr.length : 0;
                    if (length <= 125) {
                        byteArrayOutputStream.write(length | 128);
                    } else if (length <= 65535) {
                        byteArrayOutputStream.write(254);
                        byteArrayOutputStream.write((length >> 8) & 255);
                        byteArrayOutputStream.write(length & 255);
                    } else {
                        byteArrayOutputStream.write(255);
                        for (int i3 = 7; i3 >= 0; i3--) {
                            byteArrayOutputStream.write((length >> (i3 * 8)) & 255);
                        }
                    }
                    byte[] bArr2 = new byte[4];
                    new SecureRandom().nextBytes(bArr2);
                    byteArrayOutputStream.write(bArr2);
                    if (bArr != null) {
                        byte[] bArr3 = new byte[bArr.length];
                        for (int i4 = 0; i4 < bArr.length; i4++) {
                            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4 % 4]);
                        }
                        byteArrayOutputStream.write(bArr3);
                    }
                    this.w.write(byteArrayOutputStream.toByteArray());
                    this.w.flush();
                    z = true;
                }
            } catch (Exception e2) {
                Log.w(b, "Send frame failed: " + e2.getMessage());
            }
        }
        return z;
    }

    public synchronized boolean b(String str) {
        return b(1, str.getBytes(StandardCharsets.UTF_8));
    }

    public void c(String str) {
        this.m.post(new c(this, str, true));
    }

    public void c(String str, String str2) {
        this.m.post(new g(this, str, str2));
    }

    public boolean c() {
        return this.r.get();
    }

    public void d(String str) {
        this.m.post(new h(this, str));
    }

    public boolean d() {
        return this.t.get();
    }

    public String e() {
        return v.getSec(a(), g, "");
    }

    public String f() {
        return a().getString(f, "");
    }

    public String g() {
        return a().getString(h, "Android Device");
    }

    public synchronized void h() {
        this.B = true;
        this.s.set(false);
        k();
        m();
        this.n.execute(new m(this));
    }

    public void i() {
        this.n.execute(new n(this));
    }

    public void j() {
        k();
        this.y = this.o.scheduleWithFixedDelay(new o(this), i, i, TimeUnit.SECONDS);
    }

    public void k() {
        if (this.y != null) {
            this.y.cancel(true);
            this.y = null;
        }
    }

    public void l() {
        if (this.B || this.t.get()) {
            return;
        }
        m();
        this.A++;
        long min = (long) Math.min(30000.0d, 1000.0d * Math.pow(1.8d, Math.min(this.A, 6)));
        long max = Math.max(j, min + ((long) ((Math.random() - 0.5d) * min * 0.3d)));
        c("Connection lost. Reconnecting in " + (max / j) + "s...");
        this.z = this.o.schedule(new p(this), max, TimeUnit.MILLISECONDS);
    }

    public void m() {
        if (this.z != null) {
            this.z.cancel(true);
            this.z = null;
        }
    }

    public synchronized void n() {
        this.r.set(false);
        this.s.set(false);
        k();
        try {
            if (this.vSocket != null && !this.vSocket.isClosed()) {
                this.vSocket.close();
            }
        } catch (Exception e2) {
        }
        this.vSocket = null;
        this.w = null;
        this.x = null;
    }

    public void o() {
        try {
            String b2 = v.getSec(a(), e, "");
            if (b2.isEmpty()) {
                return;
            }
            String c2 = v.c(this.a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e, b2);
            jSONObject.put("device_id", p());
            String a = v.a(c2 + "/api/v1/pairing/refresh", jSONObject.toString());
            if (a != null) {
                JSONObject jSONObject2 = new JSONObject(a);
                if (jSONObject2.optBoolean("success", false)) {
                    v.putSec(a(), d, jSONObject2.getString(d));
                    String optString = jSONObject2.optString(e, "");
                    if (optString.isEmpty()) {
                        return;
                    }
                    v.putSec(a(), e, optString);
                }
            }
        } catch (Exception e2) {
        }
    }

    public String p() {
        try {
            String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
            if (string != null && !string.trim().isEmpty()) {
                return "ctrl_" + string.trim();
            }
        } catch (Exception e2) {
        }
        return "ctrl_" + Build.SERIAL;
    }

    public void q() {
        this.m.post(new q(this));
    }

    public final SharedPreferences a() {
        return this.a.getSharedPreferences(f0c, 0);
    }

    public final synchronized void b() {
        this.B = false;
        if (!this.r.get() && !this.s.get()) {
            String b2 = v.getSec(a(), d, "");
            String string = a().getString(f, "");
            if (b2.isEmpty() || string.isEmpty()) {
                this.m.post(new h(this, "Device not paired yet. Please enter pairing code."));
            } else {
                this.s.set(true);
                this.m.post(new q(this));
                this.n.execute(new l(this, b2, string));
            }
        }
    }
}
