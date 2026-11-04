package c.l.c;

import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class dk implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ dy b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f33c;

    public dk(MainActivity mainActivity, long j, dy dyVar) {
        this.f33c = mainActivity;
        this.a = j;
        this.b = dyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f33c;
        long j = this.a;
        dy dyVar = this.b;
        if (j == mainActivity.aB.get() && dyVar.a) {
            if (!mainActivity.ae || mainActivity.af == null || mainActivity.af.isEmpty()) {
                mainActivity.L = MainActivity.u(dyVar.b);
            } else {
                mainActivity.L = mainActivity.af;
            }
            mainActivity.j();
            mainActivity.k();
        }
    }
}
