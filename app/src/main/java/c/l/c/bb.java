package c.l.c;

import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class bb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ MainActivity b;

    public bb(MainActivity mainActivity, String str) {
        this.b = mainActivity;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.aC = null;
        this.b.I = false;
        this.b.d();
        this.b.d(this.a);
        this.b.z();
    }
}
