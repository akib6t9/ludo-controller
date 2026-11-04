package c.l.c;

import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

public final class dw implements Runnable {
    final boolean a;
    final String b;
    final /* synthetic */ MainActivity f37c;

    public dw(MainActivity mainActivity, boolean z, String str) {
        this.f37c = mainActivity;
        this.a = z;
        this.b = str;
    }

    public final void a(String str) {
        this.f37c.L = str;
        this.f37c.j();
        this.f37c.k();
    }

    @Override
    public final void run() {
        String c2 = this.f37c.c();
        String role = this.a ? "master" : "mirror";
        String officialApiUrl = SecurityGuard.getOfficialApiUrl(this.f37c);
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(officialApiUrl + "/rooms/" + this.b + "/" + role + ".json").openConnection();
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("X-Device-Id", c2);
            conn.setConnectTimeout(4000);
            conn.setReadTimeout(4000);
            conn.setDoOutput(true);
            String payload = "{\"active\":true,\"device\":\"" + c2 + "\",\"ts\":" + System.currentTimeMillis() + "}";
            OutputStream os = conn.getOutputStream();
            os.write(payload.getBytes(StandardCharsets.UTF_8));
            os.flush();
            os.close();
            if (!v.a(conn)) {
                conn.disconnect();
                return;
            }
            conn.getResponseCode();
            conn.disconnect();
        } catch (Throwable th) {
        }

        while (this.f37c.aq && this.b.equals(this.f37c.ap)) {
            if (!this.a) {
                try {
                    HttpURLConnection conn2 = (HttpURLConnection) new URL(officialApiUrl + "/rooms/" + this.b + "/dice.json").openConnection();
                    conn2.setRequestMethod("GET");
                    conn2.setRequestProperty("X-Device-Id", c2);
                    conn2.setConnectTimeout(2500);
                    conn2.setReadTimeout(2500);
                    if (conn2.getResponseCode() == 200 && v.a(conn2)) {
                        BufferedReader br = new BufferedReader(new InputStreamReader(conn2.getInputStream(), StandardCharsets.UTF_8));
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = br.readLine()) != null) {
                            sb.append(line);
                        }
                        br.close();
                        String body = sb.toString().trim();
                        if (!"null".equals(body) && !body.isEmpty()) {
                            JSONObject json = new JSONObject(body);
                            String val = MainActivity.u(json.optString("val", ""));
                            long ts = json.optLong("ts", 0L);
                            if (ts > this.f37c.cc && !val.isEmpty()) {
                                this.f37c.cc = ts;
                                this.f37c.ay.post(new dx(this, val));
                                this.f37c.w(val);
                                this.f37c.a("127.0.0.1", 18080, val, "Mirror Sync");
                            }
                        }
                    }
                    conn2.disconnect();
                } catch (Throwable th2) {
                }
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
            }
        }

        try {
            HttpURLConnection conn3 = (HttpURLConnection) new URL(officialApiUrl + "/rooms/" + this.b + "/" + role + ".json").openConnection();
            conn3.setRequestMethod("DELETE");
            conn3.setRequestProperty("X-Device-Id", c2);
            conn3.setConnectTimeout(3000);
            conn3.setReadTimeout(3000);
            conn3.getResponseCode();
            conn3.disconnect();
        } catch (Throwable th3) {
        }
    }
}
