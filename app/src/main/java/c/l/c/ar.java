package c.l.c;

/* loaded from: classes.dex */
final class ar implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aq f5c;

    ar(aq aqVar, String str, int i) {
        this.f5c = aqVar;
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5c.b.a(this.a, this.b, "SET SMART OFF");
        this.f5c.b.a(this.a, this.b, "SET AUTO");
    }
}
