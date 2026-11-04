package c.l.c;

import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class dq implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ MainActivity b;

    public dq(MainActivity mainActivity, boolean z) {
        this.b = mainActivity;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        j = this.b.E;
        if (currentTimeMillis - j > 3000) {
            z = this.b.O;
            if (z != this.a) {
                this.b.O = this.a;
                this.b.g();
                this.b.k();
            }
        }
    }
}
