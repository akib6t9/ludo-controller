package c.l.c;

import android.graphics.Color;
import com.ludo.controller.MainActivity;

public final class cz implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String f27c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;
    final /* synthetic */ String i;
    final /* synthetic */ long j;
    final /* synthetic */ long k;
    final /* synthetic */ boolean l;
    final /* synthetic */ boolean m;
    final /* synthetic */ String n;
    final /* synthetic */ int[] o;
    final /* synthetic */ boolean p;
    final /* synthetic */ int q;
    final /* synthetic */ String r;
    final /* synthetic */ String s;
    final /* synthetic */ MainActivity t;

    public cz(MainActivity mainActivity, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, long j, long j2, boolean z, boolean z2, String str9, int[] iArr, boolean z3, int i2, String str10, String str11) {
        this.t = mainActivity;
        this.a = str;
        this.b = str2;
        this.f27c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j;
        this.k = j2;
        this.l = z;
        this.m = z2;
        this.n = str9;
        this.o = iArr;
        this.p = z3;
        this.q = i2;
        this.r = str10;
        this.s = str11;
    }

    @Override
    public final void run() {
        if (!this.a.isEmpty() && !this.a.equals(this.t.ao)) {
            this.t.ao = this.a;
        }
        if (this.b != null && !this.b.isEmpty()) {
            this.t.au = true;
            this.t.J = true;
            this.t.ch = System.currentTimeMillis();
        }
        MainActivity ma = this.t;
        String str = this.f27c;
        String str2 = this.d;
        int i2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        String str6 = this.i;
        long j2 = this.j;
        long j3 = this.k;
        String str7 = this.b;

        if (ma.B != null && ma.at) {
            ma.B.setText("☁ Cloud Sync Active (Room: " + ma.as + ") • Target Connected!");
            ma.B.setTextColor(Color.parseColor("#34d399"));
        }
        if (ma.A != null && ma.at) {
            ma.G = "Cloud Live";
            ma.A.setText("Cloud Live");
            ma.A.setTextColor(Color.parseColor("#85efac"));
            ma.A.setBackground(MainActivity.a(Color.parseColor("#09251a"), ma.a(9), ma.a(1), Color.parseColor("#137a4a")));
        }
        ma.k();
        if (!str.isEmpty()) {
            ma.y(str);
        } else if (!str2.isEmpty()) {
            ma.y(str2 + " " + i2 + " " + str3 + " " + str4);
        }
        if (!"-".equals(str5) && !str5.isEmpty()) {
            String z = MainActivity.z(str5);
            ma.Y = z;
            ma.f(z);
            ma.j(z);
        } else if ("-".equals(str5)) {
            ma.j("-");
        }
        if (!"-".equals(str6) && !str6.isEmpty()) {
            ma.Z = str6;
            if (ma.w != null) {
                ma.w.setText(str6);
            }
            if (ma.x != null) {
                ma.x.setText("LAST\n".concat(String.valueOf(str6)));
            }
        }
        if (j2 > 0) {
            ma.aa = j2;
        }
        if (j3 > 0) {
            ma.ab = j3;
        }
        if (ma.ae) {
            long elapsed = System.currentTimeMillis() - ma.ak;
            if (ma.ai < 0 && j2 >= 0) {
                ma.ai = j2;
            }
            boolean z2 = ma.ai >= 0 && j2 > ma.ai;
            boolean z3 = ma.af != null && ma.af.equals(str6);
            boolean z4 = ma.Y != null && !"-".equals(ma.Y) && !ma.Y.equals(ma.ah) && ma.ah != null && !"-".equals(ma.ah) && !ma.ah.isEmpty();
            boolean shouldClear = false;
            if (elapsed >= 350L) {
                if ((z3 && z2) || (z4 && z2)) {
                    shouldClear = true;
                }
            }
            if (elapsed > 30000L) {
                shouldClear = true;
            }
            if (shouldClear) {
                ma.ae = false;
                ma.af = "";
                ma.ai = -1L;
                ma.aj = 0L;
                String nextL = (ma.O && str7 != null && !str7.isEmpty()) ? str7 : "AUTO";
                ma.L = nextL;
                ma.j();
                ma.k();
                ma.d();
                if (!ma.O) {
                    ma.s("AUTO");
                    if (ma.aq) {
                        ma.q("AUTO");
                    }
                }
            }
        } else if (str7 != null && !str7.isEmpty() && System.currentTimeMillis() - ma.ac >= 650L) {
            ma.L = str7;
            ma.j();
            ma.k();
        }
        if (!"-".equals(str5) && !str5.isEmpty()) {
            ma.Y = MainActivity.z(str5);
        }
        if (!"-".equals(str6) && !str6.isEmpty()) {
            ma.Z = str6;
        }
        boolean hasTurnOrDice = (!"-".equals(ma.Y) && !ma.Y.isEmpty()) || (!"-".equals(ma.Z) && !ma.Z.isEmpty());
        String matchState = ("MATCH".equalsIgnoreCase(str2) || hasTurnOrDice || (ma.Q != null && !"MENU".equals(ma.Q))) ? "MATCH" : "MENU";
        ma.F = matchState;
        if (ma.w != null) {
            ma.w.setText(ma.Z);
        }
        if (ma.u != null) {
            ma.u.setText(ma.Y);
        }
        ma.f(ma.Y);
        ma.j(ma.Y);
        ma.a(matchState, ma.Y, ma.Z, ma.L);

        if (this.l && System.currentTimeMillis() - this.t.E > 2500L && this.t.O != this.m) {
            this.t.O = this.m;
            try {
                this.t.getSharedPreferences("ludo_controller_prefs", 0).edit().putBoolean("pref_god_mode_enabled", this.m).apply();
            } catch (Throwable th) {
            }
            this.t.g();
            this.t.k();
        }
        if (this.n != null && !this.n.isEmpty() && !"ALL".equalsIgnoreCase(this.n) && !this.t.N && !this.n.equalsIgnoreCase(this.t.M)) {
            this.t.M = this.n.toUpperCase();
            this.t.i();
        }
        if (this.o != null && System.currentTimeMillis() - this.t.bz > 2500L) {
            for (int idx = 0; idx < 4; idx++) {
                this.t.D[idx] = this.o[idx];
            }
            this.t.bx = this.p;
            this.t.L();
            int seatIdx = MainActivity.e(this.t.M);
            int prog = this.t.bx ? this.t.D[0] : this.t.D[seatIdx];
            if (this.t.C != null) {
                this.t.C.setProgress(prog);
            }
            this.t.i(prog);
        } else if (this.q >= 0 && System.currentTimeMillis() - this.t.bz > 2500L) {
            int seatIdx2 = MainActivity.e(this.t.M);
            this.t.D[seatIdx2] = this.q;
            if (this.t.C != null) {
                this.t.C.setProgress(this.q);
            }
            this.t.i(this.q);
        }
        if (this.r != null && !this.r.isEmpty()) {
            this.t.bX = this.r;
        }
        if (this.s != null && !this.s.isEmpty()) {
            this.t.ad = this.s;
        }
    }
}
