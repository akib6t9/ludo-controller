package c.l.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

final class b implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ t f6c;
    final /* synthetic */ a d;

    b(a aVar, String str, String str2, t tVar) {
        this.d = aVar;
        this.a = str;
        this.b = str2;
        this.f6c = tVar;
    }

    @Override
    public final void run() {
        try {
            Context context = this.d.a;
            String str = v.c(context) + "/api/v1/pairing/pair";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("license_key", this.a.trim());
            jSONObject.put("controller_device_id", this.d.p());
            jSONObject.put("pairing_code", this.b.trim());
            jSONObject.put("model", Build.MANUFACTURER + " " + Build.MODEL);
            String a5 = v.a(str, jSONObject.toString());
            if (a5 == null || a5.trim().isEmpty()) {
                this.d.a(this.f6c, "Connection failed: No response from licensing server", false);
            } else {
                JSONObject jSONObject2 = new JSONObject(a5);
                if (jSONObject2.optBoolean("success", false)) {
                    String string = jSONObject2.getString("access_token");
                    String string2 = jSONObject2.getString("refresh_token");
                    String string3 = jSONObject2.getString("room_id");
                    String optString = jSONObject2.optString("target_model", "Android Device");
                    SharedPreferences prefs = this.d.a();
                    u.a(prefs, "access_token", string);
                    u.a(prefs, "refresh_token", string2);
                    u.a(prefs, "pairing_code", this.b.trim());
                    prefs.edit().putString("room_id", string3).putString("target_model", optString).apply();
                    this.d.t.set(false);
                    this.d.a(this.f6c, string3, this.b.trim(), optString);
                    this.d.b();
                } else {
                    this.d.a(this.f6c, jSONObject2.optString("error", "Pairing failed"), jSONObject2.optBoolean("locked", false));
                }
            }
        } catch (Exception e) {
            Log.e("CloudSyncClient", "Pairing exception: " + e.getMessage(), e);
            this.d.a(this.f6c, "Pairing error: " + e.getMessage(), false);
        }
    }
}
