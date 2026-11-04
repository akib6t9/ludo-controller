package c.l.c;

import android.os.Build;

/* loaded from: classes.dex */
final class al implements Runnable {
    final /* synthetic */ aj a;

    al(aj ajVar) {
        this.a = ajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz dzVar;
        dzVar = this.a.b.aC;
        if (dzVar != null || this.a.b.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 17 || !this.a.b.isDestroyed()) {
            this.a.b.z();
        }
    }
}
