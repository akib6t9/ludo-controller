package c.l.c;

import com.ludo.controller.MainActivity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import org.json.JSONObject;

public final class cw implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ MainActivity f26c;

    public cw(MainActivity mainActivity, String str, int i) {
        this.f26c = mainActivity;
        this.a = str;
        this.b = i;
    }

    @Override
    public final void run() {
        JSONObject jSONObject = new JSONObject();
        String a2 = MainActivity.a();
        String c2 = this.f26c.c();
        long sleepMs = 500L;
        int failCount = 0;

        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(a2 + "/cloud_sync/" + this.a + "/status.json").openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("X-Device-Id", c2);
            if (this.f26c.aC != null && this.f26c.aC.a != null) {
                conn.setRequestProperty("X-License-Key", this.f26c.aC.a);
                conn.setRequestProperty("Authorization", "Bearer " + this.f26c.aC.a);
            }
            conn.setRequestProperty("X-App-Version", "v10.6.0.416");
            conn.setConnectTimeout(4000);
            conn.setReadTimeout(4000);
            if (conn.getResponseCode() == 200 && v.a(conn)) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();
                String trim = sb.toString().trim();
                if (!"null".equals(trim) && !trim.isEmpty()) {
                    JSONObject parsed = new JSONObject(trim);
                    Iterator<String> keys = parsed.keys();
                    while (keys.hasNext()) {
                        String k = keys.next();
                        jSONObject.put(k, parsed.get(k));
                    }
                    if (this.b == this.f26c.cf) {
                        this.f26c.a(jSONObject);
                    }
                }
                this.f26c.ci = System.currentTimeMillis();
            }
            conn.disconnect();
        } catch (Throwable th) {
        }

        while (this.f26c.at && this.b == this.f26c.cf && this.a.equals(this.f26c.as)) {
            HttpURLConnection sseConn = null;
            try {
                sseConn = (HttpURLConnection) new URL(a2 + "/cloud_sync/" + this.a + "/status.json").openConnection();
                this.f26c.cg = sseConn;
                sseConn.setRequestMethod("GET");
                sseConn.setRequestProperty("Accept", "text/event-stream");
                sseConn.setRequestProperty("Cache-Control", "no-cache");
                sseConn.setRequestProperty("X-Device-Id", c2);
                if (this.f26c.aC != null && this.f26c.aC.a != null) {
                    sseConn.setRequestProperty("X-License-Key", this.f26c.aC.a);
                    sseConn.setRequestProperty("Authorization", "Bearer " + this.f26c.aC.a);
                }
                sseConn.setRequestProperty("X-App-Version", "v10.6.0.416");
                sseConn.setConnectTimeout(5000);
                sseConn.setReadTimeout(20000);
                if (sseConn.getResponseCode() == 200 && v.a(sseConn)) {
                    sleepMs = 500L;
                    failCount = 0;
                    this.f26c.ci = System.currentTimeMillis();
                    BufferedReader br2 = new BufferedReader(new InputStreamReader(sseConn.getInputStream(), StandardCharsets.UTF_8));
                    while (this.f26c.at && this.b == this.f26c.cf && this.a.equals(this.f26c.as)) {
                        String line2 = br2.readLine();
                        if (line2 == null) {
                            break;
                        }
                        String trimmed = line2.trim();
                        if (trimmed.startsWith("event: keep-alive")) {
                            this.f26c.ci = System.currentTimeMillis();
                        } else if (trimmed.startsWith("data:")) {
                            this.f26c.ci = System.currentTimeMillis();
                            String dataStr = trimmed.substring(5).trim();
                            if (!"null".equals(dataStr) && !dataStr.isEmpty()) {
                                try {
                                    JSONObject evt = new JSONObject(dataStr);
                                    String path = evt.optString("path", "/");
                                    Object dataObj = evt.opt("data");
                                    if ("/".equals(path) || !evt.has("path")) {
                                        JSONObject src = (dataObj instanceof JSONObject) ? (JSONObject) dataObj : evt;
                                        Iterator<String> keys2 = src.keys();
                                        while (keys2.hasNext()) {
                                            String k2 = keys2.next();
                                            jSONObject.put(k2, src.get(k2));
                                        }
                                        if (this.b == this.f26c.cf) {
                                            this.f26c.a(jSONObject);
                                        }
                                    } else {
                                        if (path.startsWith("/")) {
                                            path = path.substring(1);
                                        }
                                        jSONObject.put(path, dataObj);
                                        if (this.b == this.f26c.cf) {
                                            this.f26c.a(jSONObject);
                                        }
                                    }
                                } catch (Throwable th2) {
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
            } finally {
                if (sseConn != null) {
                    try {
                        sseConn.disconnect();
                    } catch (Throwable th4) {
                    }
                }
                if (this.f26c.cg == sseConn) {
                    this.f26c.cg = null;
                }
            }

            if (this.f26c.at && this.b == this.f26c.cf && this.a.equals(this.f26c.as)) {
                try {
                    HttpURLConnection pollConn = (HttpURLConnection) new URL(a2 + "/cloud_sync/" + this.a + "/status.json").openConnection();
                    pollConn.setRequestMethod("GET");
                    pollConn.setRequestProperty("X-Device-Id", c2);
                    if (this.f26c.aC != null && this.f26c.aC.a != null) {
                        pollConn.setRequestProperty("X-License-Key", this.f26c.aC.a);
                        pollConn.setRequestProperty("Authorization", "Bearer " + this.f26c.aC.a);
                    }
                    pollConn.setRequestProperty("X-App-Version", "v10.6.0.416");
                    pollConn.setConnectTimeout(4000);
                    pollConn.setReadTimeout(4000);
                    if (pollConn.getResponseCode() == 200 && v.a(pollConn)) {
                        failCount = 0;
                        this.f26c.ci = System.currentTimeMillis();
                        BufferedReader br3 = new BufferedReader(new InputStreamReader(pollConn.getInputStream(), StandardCharsets.UTF_8));
                        StringBuilder sb2 = new StringBuilder();
                        String line3;
                        while ((line3 = br3.readLine()) != null) {
                            sb2.append(line3);
                        }
                        br3.close();
                        String trim2 = sb2.toString().trim();
                        if (!"null".equals(trim2) && !trim2.isEmpty()) {
                            JSONObject parsed2 = new JSONObject(trim2);
                            Iterator<String> keys3 = parsed2.keys();
                            while (keys3.hasNext()) {
                                String k3 = keys3.next();
                                jSONObject.put(k3, parsed2.get(k3));
                            }
                            if (this.b == this.f26c.cf) {
                                this.f26c.a(jSONObject);
                            }
                        }
                        sleepMs = 500L;
                    } else {
                        failCount++;
                        if (this.b == this.f26c.cf && this.f26c.cj && failCount >= 8 && System.currentTimeMillis() - this.f26c.ci > 35000L) {
                            this.f26c.p();
                        }
                    }
                    pollConn.disconnect();
                } catch (Throwable th5) {
                    failCount++;
                    if (this.b == this.f26c.cf && this.f26c.cj && failCount >= 8 && System.currentTimeMillis() - this.f26c.ci > 35000L) {
                        this.f26c.p();
                    }
                }
            }

            if (this.f26c.at && this.b == this.f26c.cf && this.a.equals(this.f26c.as)) {
                try {
                    Thread.sleep(sleepMs);
                    sleepMs = Math.min(sleepMs * 2L, 1500L);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
