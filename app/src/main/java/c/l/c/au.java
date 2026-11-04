package c.l.c;

import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
final class au implements Runnable {
    final /* synthetic */ at a;

    au(at atVar) {
        this.a = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String a;
        boolean n;
        a = this.a.b.a(true);
        if (a != null && !a.isEmpty()) {
            n = MainActivity.n(a);
            if (!n) {
                this.a.b.ao = a;
            }
        }
        this.a.b.s();
    }
}
