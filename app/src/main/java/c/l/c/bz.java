package c.l.c;

import android.os.Handler;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class bz implements Runnable {
    final /* synthetic */ dz a;
    final /* synthetic */ MainActivity b;

    public bz(MainActivity mainActivity, dz dzVar) {
        this.b = mainActivity;
        this.a = dzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dv a;
        Handler handler;
        Handler handler2;
        a = this.b.a(this.a);
        if (a == null || !a.d) {
            handler = this.b.ay;
            handler.post(new cb(this));
        } else {
            this.b.b(this.a);
            handler2 = this.b.ay;
            handler2.post(new ca(this));
        }
    }
}
