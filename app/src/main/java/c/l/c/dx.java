package c.l.c;

/* loaded from: classes.dex */
final class dx implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ dw b;

    dx(dw dwVar, String str) {
        this.b = dwVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f37c.L = this.a;
        this.b.f37c.j();
        this.b.f37c.k();
    }
}
