package c.l.c;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dz {
    public final String a;
    final int b;

    /* renamed from: c, reason: collision with root package name */
    final int f39c;
    public final int d;
    public final boolean e;
    public long f = 0;
    public int g = -1;
    public String h = null;

    public dz(boolean z, int i, int i2, int i3, String str) {
        this.e = z;
        this.b = i;
        this.f39c = i2;
        this.d = i3;
        this.a = str;
    }

    public static dz g() {
        return new dz(false, 0, 0, 0, null);
    }

    public final boolean a() {
        return this.f == -1;
    }

    public final boolean a(int i) {
        int i2 = this.g;
        return i2 >= 0 && (i2 & i) != 0;
    }

    public final boolean b() {
        if (a()) {
            return false;
        }
        return this.f <= 0 || v.a() > this.f;
    }

    public final boolean c() {
        return this.e && !b();
    }

    public final int d() {
        if (a()) {
            return 9999;
        }
        long j = this.f;
        if (j <= 0) {
            j = (this.b * 86400000) + v.f47c;
        }
        long a = j - v.a();
        if (a > 0) {
            return (int) ((a + 86399999) / 86400000);
        }
        return 0;
    }

    public final String e() {
        if (a()) {
            return "LIFETIME";
        }
        long j = this.f;
        if (j <= 0) {
            j = (this.b * 86400000) + v.f47c;
        }
        long a = j - v.a();
        if (a <= 0) {
            return "0D";
        }
        long j2 = a / 3600000;
        return j2 >= 24 ? ((j2 + 23) / 24) + "D" : j2 > 0 ? j2 + "H" : Math.max(1L, (a % 3600000) / 60000) + "M";
    }

    public final String f() {
        if (a()) {
            return "Lifetime (Never Expires)";
        }
        long j = this.f;
        if (j <= 0) {
            j = (this.b * 86400000) + v.f47c;
        }
        return new SimpleDateFormat("dd MMM yyyy, HH:mm", Locale.ENGLISH).format(new Date(j));
    }
}
