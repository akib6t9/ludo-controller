package c.l.c;

import android.os.Handler;
import android.util.Log;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class aj implements Runnable {
    final /* synthetic */ dz a;
    final /* synthetic */ MainActivity b;

    public aj(MainActivity mainActivity, dz dzVar) {
        this.b = mainActivity;
        this.a = dzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        try {
            x a = v.a(this.b, this.a.a.replace("-", "").toUpperCase(), this.b.c());
            if (a.a) {
                if (a.d >= 0) {
                    this.a.g = a.d;
                }
                if (a.e != 0) {
                    this.a.f = a.e;
                }
                if (a.f > 0) {
                    this.b.getSharedPreferences("ludo_controller_prefs", 0).edit().putLong("pref_license_lease_ms", Math.min(a.f, 180) * 1000).apply();
                }
                this.b.b(this.a);
                MainActivity.t();
                handler3 = this.b.ay;
                handler3.post(new ak(this));
            } else {
                Log.w("LUDO_LICENSE", "Background auto-reverify status: " + a.b);
                String str = a.b != null ? a.b : "";
                if ("revoked".equals(str) || "suspended".equals(str) || "deactivated".equals(str) || "expired".equals(str)) {
                    this.b.c((a.f49c == null || a.f49c.isEmpty()) ? "License " + str + " by server." : a.f49c);
                } else if ("network_error".equals(str) || "offline".equals(str)) {
                    handler2 = this.b.ay;
                    handler2.postDelayed(new al(this), 2000L);
                }
            }
        } catch (Throwable th) {
            handler = this.b.ay;
            handler.postDelayed(new an(this), 2000L);
        } finally {
            MainActivity.h(this.b);
        }
    }
}
