package c.l.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class k implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ a b;

    k(a aVar, Runnable runnable) {
        this.b = aVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences a;
        Handler handler;
        SharedPreferences a2;
        Handler handler2;
        Context context;
        SharedPreferences a3;
        Handler handler3;
        String p;
        try {
            context = this.b.a;
            String c2 = v.c(context);
            String b = u.b(this.b.a(), "pairing_code", "");
            if (!b.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pairing_code", b);
                p = this.b.p();
                jSONObject.put("device_id", p);
                v.a(c2 + "/api/v1/pairing/unpair", jSONObject.toString());
            }
            a3 = this.b.a();
            a3.edit().clear().apply();
            if (this.a != null) {
                handler3 = this.b.m;
                handler3.post(this.a);
            }
        } catch (Exception e) {
            a2 = this.b.a();
            a2.edit().clear().apply();
            if (this.a != null) {
                handler2 = this.b.m;
                handler2.post(this.a);
            }
        } catch (Throwable th) {
            a = this.b.a();
            a.edit().clear().apply();
            if (this.a != null) {
                handler = this.b.m;
                handler.post(this.a);
            }
            throw th;
        }
    }
}
