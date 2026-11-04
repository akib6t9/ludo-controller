package c.l.c;

/* loaded from: classes.dex */
final class bw implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bv f11c;

    bw(bv bvVar, String str, int i) {
        this.f11c = bvVar;
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11c.a.a(this.a, this.b, "SET SMART OFF");
        this.f11c.a.a(this.a, this.b, "SET AUTO");
    }
}
