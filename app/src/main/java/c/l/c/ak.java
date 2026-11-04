package c.l.c;

import android.os.Build;
import android.widget.Toast;

/* loaded from: classes.dex */
final class ak implements Runnable {
    final /* synthetic */ aj a;

    ak(aj ajVar) {
        this.a = ajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 17 || !this.a.b.isDestroyed()) {
            this.a.b.aC = this.a.a;
            Toast.makeText(this.a.b, "License re-verified automatically", 0).show();
            this.a.b.f();
            this.a.b.e();
            this.a.b.r();
            this.a.b.B();
        }
    }
}
