package c.l.c;

import com.ludo.controller.MainActivity;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class db implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f29c;
    final /* synthetic */ MainActivity d;

    public db(MainActivity mainActivity, String str, String str2, long j) {
        this.d = mainActivity;
        this.a = str;
        this.b = str2;
        this.f29c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz dzVar;
        dz dzVar2;
        dz dzVar3;
        dz dzVar4;
        dz dzVar5;
        dz dzVar6;
        dz dzVar7;
        dz dzVar8;
        dz dzVar9;
        dz dzVar10;
        try {
            dzVar = this.d.aC;
            if (dzVar != null) {
                dzVar2 = this.d.aC;
                if (dzVar2.c()) {
                    dzVar3 = this.d.aC;
                    if (!dzVar3.a(16)) {
                        dzVar9 = this.d.aC;
                        if (!dzVar9.a(8)) {
                            dzVar10 = this.d.aC;
                            if (!dzVar10.a(32)) {
                                return;
                            }
                        }
                    }
                    String replaceAll = this.a != null ? this.a.replaceAll("[^0-9A-Za-z_\\-]", "") : "";
                    if (replaceAll.isEmpty()) {
                        return;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(MainActivity.a() + "/cloud_sync/" + replaceAll + "/command.json").openConnection();
                    httpURLConnection.setRequestMethod("PUT");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("X-Device-Id", this.d.c());
                    dzVar4 = this.d.aC;
                    if (dzVar4.a != null) {
                        dzVar7 = this.d.aC;
                        httpURLConnection.setRequestProperty("X-License-Key", dzVar7.a);
                        StringBuilder sb = new StringBuilder("Bearer ");
                        dzVar8 = this.d.aC;
                        httpURLConnection.setRequestProperty("Authorization", sb.append(dzVar8.a).toString());
                    }
                    httpURLConnection.setRequestProperty("X-App-Version", "v10.6.0.416");
                    httpURLConnection.setConnectTimeout(4000);
                    httpURLConnection.setReadTimeout(4000);
                    httpURLConnection.setDoOutput(true);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cmd", this.b.trim());
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put("seq", this.f29c);
                    dzVar5 = this.d.aC;
                    if (dzVar5.a != null) {
                        dzVar6 = this.d.aC;
                        jSONObject.put("license", dzVar6.a);
                    }
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
                    outputStream.flush();
                    outputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (!v.a(httpURLConnection)) {
                        httpURLConnection.disconnect();
                        return;
                    }
                    if (responseCode >= 200 && responseCode < 300) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        while (inputStream.read(new byte[256]) != -1) {
                        }
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                }
            }
        } catch (Throwable th) {
        }
    }
}
