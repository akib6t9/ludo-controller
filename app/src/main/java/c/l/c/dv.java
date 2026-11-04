package c.l.c;

/* loaded from: classes.dex */
public final class dv {
    final int a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    final int f36c;
    public final boolean d;
    public final String e;

    dv(String str, int i, int i2) {
        this(false, str, i, i2, "error");
    }

    dv(boolean z, String str, int i, int i2, String str2) {
        this.d = z;
        this.b = str;
        this.a = i;
        this.f36c = i2;
        this.e = str2 == null ? z ? "active" : "error" : str2;
    }
}
