package c.l.c;

import android.net.Uri;
import android.os.Bundle;
import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;

/* loaded from: classes.dex */
public final class bs implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f9c;

    public bs(MainActivity mainActivity, boolean z, String str) {
        this.f9c = mainActivity;
        this.a = z;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        MainActivity mainActivity = this.f9c;
        boolean z = this.a;
        String str2 = this.b;
        int progress = mainActivity.C != null ? mainActivity.C.getProgress() : mainActivity.D[MainActivity.e(str2)];
        if (z && progress == 50) {
            progress = 75;
        }
        if (z) {
            try {
                str = "SET LUCK " + progress + " " + str2;
            } catch (Throwable th) {
                return;
            }
        } else {
            str = "SET SMART OFF";
        }
        mainActivity.E = System.currentTimeMillis();
        String m = mainActivity.m();
        if (mainActivity.n()) {
            if ((!mainActivity.at || !mainActivity.au) && !mainActivity.a(m, mainActivity.an, str)) {
                mainActivity.a("127.0.0.1", 18080, str);
            }
            mainActivity.r(str);
            mainActivity.E = System.currentTimeMillis();
            return;
        }
        String str3 = z ? str2 : "OFF";
        try {
            if (mainActivity.getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(mainActivity, Uri.parse("content://com.ludo.king.dice"))) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("enabled", z);
                bundle.putString("color", str2);
                bundle.putInt("luck", z ? progress : 50);
                bundle.putString("profile", mainActivity.ad);
                mainActivity.a(str3, bundle);
                mainActivity.getContentResolver().call(Uri.parse("content://com.ludo.king.dice"), "setSmartMode", str3, bundle);
            }
        } catch (Throwable th2) {
            try {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("enabled", z);
                bundle2.putString("color", str2);
                bundle2.putInt("luck", z ? progress : 50);
                bundle2.putString("profile", mainActivity.ad);
                mainActivity.a(str3, bundle2);
                mainActivity.getContentResolver().call(Uri.parse("content://com.ludo.king.dice"), "setGodMode", str3, bundle2);
            } catch (Throwable th3) {
            }
        }
        try {
            mainActivity.a("127.0.0.1", 18080, str);
            mainActivity.r(str);
            mainActivity.E = System.currentTimeMillis();
        } catch (Throwable th4) {
        }
    }
}
