package c.l.c;

import com.ludo.controller.MainActivity;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bu implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f10c = 18080;
    final /* synthetic */ int d = 350;
    final /* synthetic */ MainActivity e;

    public bu(MainActivity mainActivity, AtomicReference atomicReference, String str, int i, int i2) {
        this.e = mainActivity;
        this.a = atomicReference;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b;
        if (this.a.get() != null) {
            return;
        }
        MainActivity mainActivity = this.e;
        b = MainActivity.b(this.b, this.f10c, this.d);
        if (b) {
            this.a.compareAndSet(null, this.b);
        }
    }
}
