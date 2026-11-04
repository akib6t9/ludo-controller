package c.l.c;

import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;

/* loaded from: classes.dex */
public final class dm implements Runnable {
    final /* synthetic */ MainActivity a;

    public dm(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.a;
        int i = 0;
        while (mainActivity.I) {
            try {
                mainActivity.s();
            } catch (Throwable th) {
            }
            i++;
            if (i >= 1200) {
                if (mainActivity.aC != null && mainActivity.aC.c()) {
                    mainActivity.a(mainActivity.aC, false);
                }
                i = 0;
            }
            if (i % 30 == 0) {
                SecurityGuard.verifyOrDie(mainActivity);
            }
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
