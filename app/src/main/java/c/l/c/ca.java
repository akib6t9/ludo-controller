package c.l.c;

/* loaded from: classes.dex */
final class ca implements Runnable {
    final /* synthetic */ bz a;

    ca(bz bzVar) {
        this.a = bzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.aC = this.a.a;
        this.a.b.f();
        this.a.b.e();
        this.a.b.r();
        this.a.b.B();
    }
}
