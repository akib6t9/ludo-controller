package c.l.c;

import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class cl implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f20c;

    public cl(MainActivity mainActivity, String str, String str2) {
        this.f20c = mainActivity;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f20c;
        String str = this.a;
        String str2 = this.b;
        try {
            if (mainActivity.ar) {
                if (mainActivity.aC == null || mainActivity.aC.a(8)) {
                    String replaceAll = str != null ? str.replaceAll("[^0-9A-Za-z_\\-]", "") : "";
                    if (replaceAll.isEmpty()) {
                        return;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(SecurityGuard.getOfficialApiUrl(mainActivity) + "/rooms/" + replaceAll + "/dice.json").openConnection();
                    httpURLConnection.setRequestMethod("PUT");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("X-Device-Id", mainActivity.c());
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(3000);
                    httpURLConnection.setDoOutput(true);
                    String str3 = "{\"val\":\"" + MainActivity.u(str2) + "\",\"ts\":" + System.currentTimeMillis() + "}";
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(str3.getBytes(StandardCharsets.UTF_8));
                    outputStream.flush();
                    outputStream.close();
                    if (v.a(httpURLConnection)) {
                        httpURLConnection.getResponseCode();
                    }
                    httpURLConnection.disconnect();
                }
            }
        } catch (Throwable th) {
        }
    }
}
