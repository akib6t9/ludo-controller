package c.l.c;

import com.ludo.controller.MainActivity;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dc implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f30c;
    final /* synthetic */ MainActivity d;

    public dc(MainActivity mainActivity, String str, String str2, long j) {
        this.d = mainActivity;
        this.a = str;
        this.b = str2;
        this.f30c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.d;
        String str = this.a;
        String str2 = this.b;
        long j = this.f30c;
        try {
            if (mainActivity.aC == null || !mainActivity.aC.c()) {
                return;
            }
            if (mainActivity.aC.a(16) || mainActivity.aC.a(8) || mainActivity.aC.a(32)) {
                String replaceAll = str != null ? str.replaceAll("[^0-9A-Za-z_\\-]", "") : "";
                if (replaceAll.isEmpty()) {
                    return;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(MainActivity.a() + "/cloud_sync/" + replaceAll + "/command.json").openConnection();
                httpURLConnection.setRequestMethod("PUT");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("X-Device-Id", mainActivity.c());
                if (mainActivity.aC.a != null) {
                    httpURLConnection.setRequestProperty("X-License-Key", mainActivity.aC.a);
                    httpURLConnection.setRequestProperty("Authorization", "Bearer " + mainActivity.aC.a);
                }
                httpURLConnection.setRequestProperty("X-App-Version", "v10.6.0.416");
                httpURLConnection.setConnectTimeout(4000);
                httpURLConnection.setReadTimeout(4000);
                httpURLConnection.setDoOutput(true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dice", MainActivity.u(str2));
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("seq", j);
                if (mainActivity.aC.a != null) {
                    jSONObject.put("license", mainActivity.aC.a);
                }
                String jSONObject2 = jSONObject.toString();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(jSONObject2.getBytes(StandardCharsets.UTF_8));
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
        } catch (Throwable th) {
        }
    }
}
