package c.l.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import com.ludo.controller.SecurityGuard;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {
    public static final String b = "http://10.0.2.2:8787";

    /* renamed from: c, reason: collision with root package name */
    public static final long f47c = 1704067200000L;
    public static final long d = 259200000;
    public static final long e = 300000;
    public static final String f = "pref_max_observed_time";
    private static final String g = "LUDO_LICENSE";
    private static final String h = "ludo_controller_prefs";
    private static final String i = "pref_license_api_url";
    private static final String j = "pref_anchor_server_ms";
    private static final String k = "pref_anchor_elapsed_ms";
    private static final String l = "pref_anchor_boot_count";
    private static final String m = "pref_anchor_boot_id";
    public static final String a = SecurityGuard.getOfficialApiUrl(null);
    private static volatile long n = 0;
    private static volatile long o = 0;
    private static final String[] p = {"brzvtCELCIZUo4sD/qPX0ccRtPsd3DY6RfmxpOU9oB4=", "sCkq5UWXjg+7mKu9lMhhYF5bGLsy7VI/UNW3tccdR7w=", "s/tdAOmUzd8syaTuqfgGvFcn6DzA5Cmb+Vby1ST+U3Y=", "C5+lpZ7tcVwmwQIMcRtPbsQtWLABXhQzejna0wHFr8M=", "diGVwiVYbubAI3RW4hB9xU8e/CH2GnkuvVFZE8zmgzI=", "hxqRlPTu1bMS/0DITB1SSu0vd4u/8l8TjPgfaAp63Gc=", "QXnt2YHvdHR3tJYmQIr0Paosp6t/nggsEGD4QJZ3Q0g=", "mEflZT5enoR1FuXLgYYGqnVEoZvmf9c2bVBpiOjYQ0c=", "oyD01TTXvpfBro3QSZc1vIlcMjrdLTiL/M9mLCPX+Zo=", "0cRTd+vc1hjNFlHcLgLCHXUeWqn80bNDH/bs9qMTSPo=", "G/ANXI8TwJTdF+AFBM8IiIUPEv0Gf6H5LA/b9guG4yE=", "K89VOmb1cJAN3TK6bf4ezAbJGC1mLcG2Dh97dnwr3VQ="};

    public static long a() {
        long j2 = n;
        return j2 > 0 ? j2 + (SystemClock.elapsedRealtime() - o) : System.currentTimeMillis();
    }

    public static void putSec(SharedPreferences sharedPreferences, String str, String str2) {
        u.a(sharedPreferences, str, str2);
    }

    public static String getSec(SharedPreferences sharedPreferences, String str, String str2) {
        return u.b(sharedPreferences, str, str2);
    }

    public static dv a(Context context, dz dzVar, String str) {
        if (dzVar == null || !dzVar.e) {
            return new dv("Invalid license code format or checksum", 0, 1);
        }
        String c2 = c(context);
        String str2 = Build.MANUFACTURER + " " + Build.MODEL;
        String upperCase = dzVar.a.replace("-", "").replace(" ", "").replace("\"", "").replace("'", "").trim().toUpperCase();
        Log.i(g, "Attempting activation against: " + c2 + " for code: " + (upperCase.length() > 4 ? upperCase.substring(0, 4) + "****" : "****") + " dev: " + ((str == null || str.length() <= 4) ? "****" : str.substring(0, 4) + "****"));
        String str3 = null;
        try {
            try {
                String a2 = a(c2 + "/api/v1/license/nonce");
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject(a2);
                    if (jSONObject.optBoolean("success", false)) {
                        str3 = jSONObject.optString("nonce", null);
                    }
                }
            } catch (IOException e2) {
                Log.e(g, "Network error during activation", e2);
                return new dv("Network error: Unable to verify license with server. Please check your internet connection.", 0, dzVar.d);
            } catch (Throwable th) {
                Log.w(g, "Nonce fetch error: " + th.getMessage());
            }
            if (str3 == null || str3.trim().isEmpty()) {
                return new dv("Security error: Failed to obtain cryptographic nonce from license server.", 0, dzVar.d);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", upperCase);
            jSONObject2.put("device_id", str);
            jSONObject2.put("model", str2);
            jSONObject2.put("app_version", "v10.6.0.416");
            jSONObject2.put("nonce", str3);
            String d2 = d();
            jSONObject2.put("challenge", d2);
            w b2 = b(c2 + "/api/v1/license/activate", jSONObject2.toString());
            if (b2.b == null || b2.b.isEmpty()) {
                return new dv("Server unreachable. Please check internet connection.", 0, dzVar.d);
            }
            String str4 = b2.b;
            JSONObject jSONObject3 = new JSONObject(str4);
            boolean optBoolean = jSONObject3.optBoolean("success", false);
            int optInt = jSONObject3.optInt("devices_used", 1);
            int optInt2 = jSONObject3.optInt("device_limit", dzVar.d);
            JSONObject verifyAndParseSignedJson = SecurityGuard.verifyAndParseSignedJson(context, str4, b2.f48c, d2, upperCase, str);
            boolean z = verifyAndParseSignedJson != null && SecurityGuard.verifyServerSignature(str4, b2.f48c) && a(jSONObject3, d2, upperCase, str);
            if (!optBoolean) {
                String optString = jSONObject3.optString("error", "Activation was rejected by license server.");
                String optString2 = jSONObject3.optString("status", "rejected");
                if (!z && ("suspended".equals(optString2) || "revoked".equals(optString2) || "expired".equals(optString2))) {
                    optString2 = "tampered";
                }
                return new dv(false, optString, optInt, optInt2, optString2);
            }
            if (!z || verifyAndParseSignedJson == null) {
                Log.e(g, "Server signature / binding verification failed on activation response!");
                return new dv("Security error: Response tampering detected (invalid server signature).", optInt, optInt2);
            }
            b(context, verifyAndParseSignedJson.optLong("server_time_ms", 0L));
            dzVar.h = verifyAndParseSignedJson.optString("customer_name", "Valued Customer");
            int optInt3 = verifyAndParseSignedJson.optInt("features", -1);
            if (optInt3 >= 0) {
                dzVar.g = optInt3;
            }
            long optLong = verifyAndParseSignedJson.optLong("expires_at_ms", 0L);
            if (optLong > 0) {
                dzVar.f = optLong;
            } else {
                String optString3 = verifyAndParseSignedJson.optString("expires_at", null);
                if (optString3 != null && !optString3.isEmpty() && !optString3.equals("null")) {
                    dzVar.f = b(optString3);
                } else {
                    if (!verifyAndParseSignedJson.optBoolean("lifetime", false)) {
                        Log.e(g, "Server returned missing or null expiry for a non-lifetime license key!");
                        return new dv(false, "Security error: Missing valid expiry date from license server.", optInt, optInt2, "error");
                    }
                    dzVar.f = -1L;
                }
            }
            return new dv(true, null, optInt, optInt2, "active");
        } catch (IOException e3) {
            Log.e(g, "Network error during activation", e3);
            return new dv("Network error: Unable to verify license with server. Please check your internet connection.", 0, dzVar.d);
        } catch (Throwable th2) {
            Log.e(g, "Activation verification error", th2);
            return new dv("Verification error: " + th2.getMessage(), 0, dzVar.d);
        }
    }

    public static x a(Context context, String str, String str2) {
        String c2 = c(context);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", str);
            jSONObject.put("device_id", str2);
            jSONObject.put("app_version", "v10.6.0.416");
            String d2 = d();
            jSONObject.put("challenge", d2);
            w b2 = b(c2 + "/api/v1/license/verify", jSONObject.toString());
            if (b2.b == null || b2.b.isEmpty()) {
                return new x("offline", "Server returned empty response");
            }
            String str3 = b2.b;
            JSONObject jSONObject2 = new JSONObject(str3);
            boolean optBoolean = jSONObject2.optBoolean("success", false);
            String optString = jSONObject2.optString("status", "unknown");
            String optString2 = jSONObject2.optString("error", null);
            int optInt = jSONObject2.optInt("features", -1);
            long optLong = jSONObject2.optLong("expires_at_ms", 0L);
            if (optLong <= 0) {
                String optString3 = jSONObject2.optString("expires_at", null);
                optLong = (optString3 == null || optString3.isEmpty() || optString3.equals("null")) ? jSONObject2.optBoolean("lifetime", false) ? -1L : 0L : b(optString3);
            }
            JSONObject verifyAndParseSignedJson = SecurityGuard.verifyAndParseSignedJson(context, str3, b2.f48c, d2, str, str2);
            boolean z = verifyAndParseSignedJson != null && SecurityGuard.verifyServerSignature(str3, b2.f48c) && a(jSONObject2, d2, str, str2);
            if (optBoolean) {
                if (!z || verifyAndParseSignedJson == null) {
                    Log.e(g, "Server signature verification failed on verify response!");
                    return new x("tampered", "Invalid server signature");
                }
                b(context, verifyAndParseSignedJson.optLong("server_time_ms", 0L));
            } else if (("revoked".equals(optString) || "suspended".equals(optString) || "deactivated".equals(optString) || "expired".equals(optString)) && !z) {
                Log.w(g, "Unsigned or invalid revocation response ignored (potential MITM spoofing)!");
                return new x("untrusted", "Untrusted server response signature");
            }
            return new x(optBoolean, optString, optString2, optInt, optLong, jSONObject2.optInt("lease_seconds", 1800));
        } catch (IOException e2) {
            return new x("network_error", e2.getMessage());
        } catch (Throwable th) {
            return new x("error", th.getMessage());
        }
    }

    private static String a(String str) throws IOException {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setConnectTimeout(8000);
            httpURLConnection.setReadTimeout(8000);
            if (httpURLConnection instanceof HttpsURLConnection) {
                ((HttpsURLConnection) httpURLConnection).connect();
                a(httpURLConnection);
            }
            int responseCode = httpURLConnection.getResponseCode();
            a(httpURLConnection);
            BufferedReader bufferedReader;
            if (responseCode >= 200 && responseCode < 400) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
            } else {
                if (httpURLConnection.getErrorStream() == null) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream(), StandardCharsets.UTF_8));
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String trim = sb.toString().trim();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return trim;
        } catch (IOException e2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw e2;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw new IOException(th);
        }
    }

    public static String a(String str, String str2) throws IOException {
        return b(str, str2).b;
    }

    public static synchronized void a(Context context) {
        synchronized (v.class) {
            n = 0L;
            o = 0L;
            try {
                context.getSharedPreferences(h, 0).edit().remove(j).remove(k).remove(l).remove(m).remove(f).commit();
            } catch (Throwable th) {
            }
        }
    }

    public static void a(Certificate[] certificateArr) {
        MessageDigest messageDigest;
        byte[] encoded;
        if (certificateArr == null || certificateArr.length == 0) {
            throw new SecurityException("Empty TLS certificate chain");
        }
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (Throwable th) {
            messageDigest = null;
        }
        boolean z = false;
        for (int i2 = 0; i2 < certificateArr.length; i2++) {
            Certificate certificate = certificateArr[i2];
            if (certificate instanceof X509Certificate) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                try {
                    x509Certificate.checkValidity();
                    String lowerCase = (x509Certificate.getSubjectDN() != null ? x509Certificate.getSubjectDN().getName() : "").toLowerCase();
                    String lowerCase2 = (x509Certificate.getIssuerDN() != null ? x509Certificate.getIssuerDN().getName() : "").toLowerCase();
                    if (lowerCase.contains("httpcanary") || lowerCase2.contains("httpcanary") || lowerCase.contains("charles") || lowerCase2.contains("charles") || lowerCase.contains("portswigger") || lowerCase2.contains("portswigger") || lowerCase.contains("mitmproxy") || lowerCase2.contains("mitmproxy") || lowerCase.contains("reqable") || lowerCase2.contains("reqable") || lowerCase.contains("fiddler") || lowerCase2.contains("fiddler") || lowerCase.contains("burp") || lowerCase2.contains("burp") || lowerCase.contains("proxyman") || lowerCase2.contains("proxyman") || lowerCase.contains("adguard") || lowerCase2.contains("adguard") || lowerCase.contains("packet capture") || lowerCase2.contains("packet capture") || lowerCase.contains("interceptor") || lowerCase2.contains("interceptor")) {
                        throw new SecurityException("MITM proxy certificate detected: ".concat(String.valueOf(lowerCase2)));
                    }
                    if (i2 == 0 && x509Certificate.getSubjectDN() != null && x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN())) {
                        throw new SecurityException("Untrusted self-signed leaf certificate detected in TLS chain: ".concat(String.valueOf(lowerCase)));
                    }
                    if (!z && messageDigest != null && x509Certificate.getPublicKey() != null && (encoded = x509Certificate.getPublicKey().getEncoded()) != null && encoded.length > 0) {
                        messageDigest.reset();
                        String encodeToString = Base64.encodeToString(messageDigest.digest(encoded), 2);
                        String[] strArr = p;
                        int length = strArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            if (strArr[i3].equals(encodeToString)) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    }
                } catch (Exception e2) {
                    throw new SecurityException("Expired or not-yet-valid TLS certificate: " + e2.getMessage());
                }
            }
        }
    }

    public static synchronized boolean a(Context context, long j2) {
        boolean z;
        synchronized (v.class) {
            if (context == null) {
                z = false;
            } else {
                try {
                    long a2 = a();
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h, 0);
                    long j3 = sharedPreferences.getLong(f, 0L);
                    if (j2 > 0 && a2 < j2 - e) {
                        Log.w(g, "Clock rollback detected: current time (" + a2 + ") < last verified (" + j2 + ")");
                        z = true;
                    } else if (j3 <= 0 || a2 >= j3 - e) {
                        if (a2 > j3) {
                            sharedPreferences.edit().putLong(f, a2).commit();
                        }
                        z = false;
                    } else {
                        Log.w(g, "Clock rollback detected: current time (" + a2 + ") < max seen (" + j3 + ")");
                        z = true;
                    }
                } catch (Throwable th) {
                    Log.w(g, "Error checking clock rollback", th);
                    z = false;
                }
            }
        }
        return z;
    }

    public static boolean a(HttpURLConnection httpURLConnection) {
        if (!(httpURLConnection instanceof HttpsURLConnection)) {
            return true;
        }
        try {
            Certificate[] serverCertificates = ((HttpsURLConnection) httpURLConnection).getServerCertificates();
            if (serverCertificates == null || serverCertificates.length == 0) {
                return false;
            }
            a(serverCertificates);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean a(JSONObject jSONObject, String str, String str2, String str3) {
        return str != null && str.equals(jSONObject.optString("challenge", "")) && str2 != null && str2.equals(jSONObject.optString("code", "")) && str3 != null && str3.equals(jSONObject.optString("device_id", ""));
    }

    private static long b(String str) {
        if (str == null || str.trim().isEmpty() || "null".equalsIgnoreCase(str.trim())) {
            return 0L;
        }
        String trim = str.trim();
        if (trim.endsWith("Z") || trim.endsWith("z")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        int lastIndexOf = trim.lastIndexOf(46);
        if (lastIndexOf > 0 && lastIndexOf < trim.length() - 1) {
            trim = trim.substring(0, lastIndexOf);
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date parse = simpleDateFormat.parse(trim);
            if (parse != null) {
                return parse.getTime();
            }
        } catch (Throwable th) {
        }
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date parse2 = simpleDateFormat2.parse(trim);
            if (parse2 != null) {
                return parse2.getTime();
            }
        } catch (Throwable th2) {
        }
        try {
            return Long.parseLong(trim);
        } catch (Throwable th3) {
            return 0L;
        }
    }

    private static w b(String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setConnectTimeout(8000);
            httpURLConnection.setReadTimeout(8000);
            httpURLConnection.setDoOutput(true);
            if (httpURLConnection instanceof HttpsURLConnection) {
                ((HttpsURLConnection) httpURLConnection).connect();
                a(httpURLConnection);
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes, 0, bytes.length);
            outputStream.flush();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            a(httpURLConnection);
            String headerField = httpURLConnection.getHeaderField("X-License-Sig-V2");
            BufferedReader bufferedReader;
            if (responseCode >= 200 && responseCode < 400) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
            } else {
                if (httpURLConnection.getErrorStream() == null) {
                    w wVar = new w(responseCode, null, headerField);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return wVar;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream(), StandardCharsets.UTF_8));
            }
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            bufferedReader.close();
            w wVar2 = new w(responseCode, sb.toString().trim(), headerField);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return wVar2;
        } catch (IOException e2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw e2;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw new IOException(th);
        }
    }

    private static String b() {
        BufferedReader bufferedReader = null;
        try {
            File file = new File("/proc/sys/kernel/random/boot_id");
            if (file.exists() && file.canRead()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    try {
                        bufferedReader.close();
                    } catch (Throwable th) {
                    }
                    return trim;
                }
            }
        } catch (Throwable th2) {
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                }
            }
        }
        return "";
    }

    private static synchronized void b(Context context, long j2) {
        synchronized (v.class) {
            if (j2 > 0) {
                n = j2;
                o = SystemClock.elapsedRealtime();
                if (context != null) {
                    try {
                        context.getSharedPreferences(h, 0).edit().putLong(j, n).putLong(k, o).putInt(l, d(context)).putString(m, b()).putLong(f, j2).commit();
                    } catch (Throwable th) {
                    }
                }
            }
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (v.class) {
            if (n > 0) {
                z = true;
            } else {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h, 0);
                    long j2 = sharedPreferences.getLong(j, 0L);
                    long j3 = sharedPreferences.getLong(k, 0L);
                    int i2 = sharedPreferences.getInt(l, -1);
                    String string = sharedPreferences.getString(m, "");
                    int d2 = d(context);
                    String b2 = b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z2 = false;
                    if (i2 >= 0 && d2 >= 0) {
                        z2 = i2 == d2;
                    } else if (!string.isEmpty() && !b2.isEmpty()) {
                        z2 = string.equals(b2);
                    }
                    if (j2 > 0 && z2 && elapsedRealtime >= j3) {
                        n = j2;
                        o = j3;
                        z = true;
                    }
                } catch (Throwable th) {
                }
                z = false;
            }
        }
        return z;
    }

    private static boolean b(Context context, String str, String str2) {
        return a(context, str, str2).a;
    }

    private static long c() {
        if (n > 0) {
            return SystemClock.elapsedRealtime() - o;
        }
        return -1L;
    }

    public static String c(Context context) {
        if (context != null) {
            SecurityGuard.verifyOrDie(context);
        }
        return SecurityGuard.getOfficialApiUrl(context);
    }

    private static int d(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "boot_count", -1);
        } catch (Throwable th) {
            return -1;
        }
    }

    private static String d() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 16; i2++) {
            sb.append(String.format("%02x", Integer.valueOf(bArr[i2] & 255)));
        }
        return sb.toString();
    }

    private static void e() {
    }
}
