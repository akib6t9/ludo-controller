package c.l.c;

import android.util.Log;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class y implements Runnable {
    final /* synthetic */ dz a;
    final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f50c;

    public y(MainActivity mainActivity, dz dzVar, boolean z) {
        this.f50c = mainActivity;
        this.a = dzVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f50c;
        dz dzVar = this.a;
        boolean z = this.b;
        try {
            long j = mainActivity.getSharedPreferences("ludo_controller_prefs", 0).getLong("pref_last_verified_time", 0L);
            long j2 = mainActivity.getSharedPreferences("ludo_controller_prefs", 0).getLong("pref_license_lease_ms", 180000L);
            if (j2 > 180000) {
                j2 = 180000;
            }
            if (j2 < 3000) {
                j2 = 3000;
            }
            long a = v.a();
            if (z || j <= 0 || a - j >= j2 || a < j) {
                if (!z || j <= 0 || a - j >= 3000 || a < j) {
                    x a2 = v.a(mainActivity, dzVar.a.replace("-", "").toUpperCase(), mainActivity.c());
                    if (a2.a) {
                        if (a2.d >= 0) {
                            dzVar.g = a2.d;
                        }
                        if (a2.e != 0) {
                            dzVar.f = a2.e;
                        }
                        if (a2.f > 0) {
                            mainActivity.getSharedPreferences("ludo_controller_prefs", 0).edit().putLong("pref_license_lease_ms", Math.min(a2.f, 180) * 1000).apply();
                        }
                        mainActivity.b(dzVar);
                        return;
                    }
                    Log.w("LUDO_LICENSE", "Background verify status: " + a2.b + " (" + a2.f49c + ")");
                    String str = a2.b != null ? a2.b : "";
                    if ("revoked".equals(str) || "suspended".equals(str) || "deactivated".equals(str) || "expired".equals(str)) {
                        mainActivity.c((a2.f49c == null || a2.f49c.isEmpty()) ? "License " + str + " by server." : a2.f49c);
                        return;
                    }
                    if ("tampered".equals(str)) {
                        mainActivity.b("Security error: Server response signature verification failed.");
                    } else {
                        if (j <= 0 || a <= j || a - j <= v.d) {
                            return;
                        }
                        mainActivity.b("Offline lease expired (72h limit). Connect to the internet to re-verify.");
                    }
                }
            }
        } catch (Throwable th) {
        }
    }
}
