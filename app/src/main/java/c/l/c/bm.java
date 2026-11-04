package c.l.c;

import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class bm implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ MainActivity b;

    public bm(MainActivity mainActivity, String str) {
        this.b = mainActivity;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.b;
        String str = this.a;
        try {
            mainActivity.a(mainActivity.getSharedPreferences("ludo_controller_prefs", 0));
        } catch (Throwable th) {
        }
        mainActivity.aC = null;
        mainActivity.I = false;
        mainActivity.d();
        mainActivity.d(str);
    }
}
