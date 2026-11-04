package c.l.c;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.ludo.controller.MainActivity;

public final class dt implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean f34c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;
    final /* synthetic */ String i;
    final /* synthetic */ MainActivity j;

    public dt(MainActivity mainActivity, long j, long j2, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.j = mainActivity;
        this.a = j;
        this.b = j2;
        this.f34c = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    @Override
    public final void run() {
        MainActivity ma = this.j;
        long j2 = this.a;
        long j3 = this.b;
        boolean z = this.f34c || this.d;
        boolean z2 = this.f34c;
        String str = this.e;
        boolean z3 = this.d;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        String str5 = this.i;

        if (j2 > 0) {
            ma.aa = j2;
        }
        if (j3 > 0) {
            ma.ab = j3;
        }
        ma.J = z;
        String badgeText;
        int badgeColor;
        GradientDrawable badgeBg;
        if (z) {
            if (z3 && ma.at && ma.au) {
                badgeText = "Cloud Live";
            } else if (z2) {
                badgeText = (!"127.0.0.1".equals(str) && !str.isEmpty()) ? "Hotspot (" + str + ")" : "Local Live";
            } else {
                badgeText = "Cloud Wait";
            }
            badgeColor = Color.parseColor("#85efac");
            badgeBg = MainActivity.a(Color.parseColor("#09251a"), ma.a(9), ma.a(1), Color.parseColor("#137a4a"));
        } else {
            badgeText = "Searching";
            badgeColor = Color.parseColor("#fcd34d");
            badgeBg = MainActivity.a(Color.parseColor("#2c1d0b"), ma.a(9), ma.a(1), Color.parseColor("#8f5b14"));
        }
        if (ma.A != null && !badgeText.equals(ma.G)) {
            ma.G = badgeText;
            ma.A.setText(badgeText);
            ma.A.setTextColor(badgeColor);
            ma.A.setBackground(badgeBg);
        }

        try {
            boolean hasTurn = str2 != null && !"-".equals(str2) && !str2.isEmpty();
            boolean hasLastDice = str3 != null && !"-".equals(str3) && !str3.isEmpty();
            String g2 = MainActivity.g(str4);
            boolean isInMatch = !"MENU".equals(g2);
            if (!isInMatch && (hasTurn || hasLastDice)) {
                g2 = (ma.Q != null && !"MENU".equals(ma.Q)) ? ma.Q : "MATCH";
                isInMatch = true;
            }
            ma.F = isInMatch ? "MATCH" : "MENU";
            if (!isInMatch) {
                ma.Q = "MENU";
                ma.S.clear();
                ma.U = "";
                ma.T = 250;
                ma.W.clear();
                ma.Z = "-";
                if (ma.v != null && !"MENU".equals(ma.H)) {
                    ma.H = "MENU";
                    ma.v.setText("MENU");
                }
                if (ma.y != null) {
                    ma.y.setText("--");
                }
                if (ma.ae && ma.af != null && !ma.af.isEmpty()) {
                    ma.L = ma.af;
                } else if (str5 != null && !str5.isEmpty() && System.currentTimeMillis() - ma.ac >= 650L) {
                    ma.L = str5;
                }
                if (ma.w != null && !"-".equals(ma.w.getText().toString())) {
                    ma.w.setText("-");
                }
                if (ma.u != null && !"-".equals(ma.u.getText().toString())) {
                    ma.u.setText("-");
                }
                ma.f("-");
                ma.j("-");
                ma.i();
                ma.g();
                ma.k();
                String diceVal = (ma.L != null && !ma.L.isEmpty()) ? ma.L : "AUTO";
                ma.a("MENU", "-", "-", diceVal);
                String statusStr = ma.A != null ? ma.A.getText().toString() : "Connected";
                ma.a(statusStr, "MENU", false, "MENU", "-", "-", diceVal, str4, "--", ma.M);
            } else {
                ma.Q = g2;
                ma.T = 0;
                if (hasTurn) {
                    ma.U = str2;
                    ma.S.add(str2);
                }
                if (g2.contains("TEAM") || g2.contains("2v2") || g2.startsWith("4P")) {
                    ma.P = 4;
                } else if (g2.startsWith("3P")) {
                    ma.P = 3;
                } else if (g2.startsWith("6P")) {
                    ma.P = 6;
                } else if (g2.startsWith("2P")) {
                    ma.P = 2;
                }
                ma.W.clear();
                ma.W.addAll(MainActivity.a(g2, ma.R != null ? ma.R : str4));
                if (ma.W.isEmpty() && ma.P == 2) {
                    if (g2.contains("RED / YELLOW")) {
                        ma.W.add("RED");
                        ma.W.add("YELLOW");
                    } else {
                        ma.W.add("BLUE");
                        ma.W.add("GREEN");
                    }
                }
                if (!ma.N && !ma.W.isEmpty() && !ma.W.contains(ma.M)) {
                    ma.M = ma.h();
                    if (ma.O) {
                        ma.a(true, ma.M);
                    }
                }
                String h2 = MainActivity.h(g2);
                String i2 = MainActivity.i(g2);
                if (ma.v != null && !h2.equals(ma.H)) {
                    ma.H = h2;
                    ma.v.setText(h2);
                }
                if (ma.y != null) {
                    ma.y.setText(i2);
                }
                String turnVal = hasTurn ? str2 : ma.Y;
                if (turnVal == null || turnVal.isEmpty()) {
                    turnVal = "-";
                }
                if (ma.Y != null && !"-".equals(ma.Y) && !ma.Y.equals(turnVal)) {
                    ma.X = 0;
                }
                ma.Y = turnVal;
                String lastVal = hasLastDice ? str3 : ma.Z;
                if (lastVal == null || lastVal.isEmpty()) {
                    lastVal = "-";
                }
                if (hasLastDice) {
                    if (!str3.equals(ma.Z)) {
                        if ("6".equals(str3)) {
                            ma.X++;
                        } else {
                            ma.X = 0;
                        }
                    }
                    ma.Z = str3;
                    ma.p(str3);
                }
                if (ma.ae) {
                    long elapsed = System.currentTimeMillis() - ma.ak;
                    if (ma.ai < 0 && j2 >= 0) {
                        ma.ai = j2;
                    }
                    if (ma.aj <= 0 && j3 > 0) {
                        ma.aj = j3;
                    }
                    boolean seqAdvanced = (ma.ai >= 0 && j2 > ma.ai) || (ma.aj > 0 && j3 > ma.aj) || (ma.ak > 0 && j3 >= ma.ak);
                    boolean diceMatched = ma.af != null && ma.af.equals(lastVal);
                    boolean turnChanged = !"-".equals(turnVal) && !turnVal.equals(ma.ah) && ma.ah != null && !"-".equals(ma.ah) && !ma.ah.isEmpty();
                    boolean shouldClear = false;
                    if (elapsed >= 350L) {
                        if ((diceMatched && seqAdvanced) || (turnChanged && seqAdvanced)) {
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
                        ma.L = (ma.O && str5 != null && !str5.isEmpty()) ? str5 : "AUTO";
                        ma.j();
                        ma.k();
                        ma.d();
                        if (!ma.O) {
                            ma.t("AUTO");
                        }
                    } else if (ma.af != null && !ma.af.isEmpty()) {
                        ma.L = ma.af;
                    }
                }
                boolean recentUserAction = System.currentTimeMillis() - ma.ac < 650L;
                String currentDice = ma.L;
                if (ma.ae && ma.af != null && !ma.af.isEmpty()) {
                    if (!ma.af.equals(ma.L)) {
                        ma.L = ma.af;
                        ma.j();
                        ma.k();
                    }
                    currentDice = ma.L;
                } else if (!recentUserAction && str5 != null && !str5.isEmpty()) {
                    ma.L = str5;
                    ma.j();
                    ma.k();
                    currentDice = ma.L;
                }
                if (ma.w != null) {
                    ma.w.setText(lastVal);
                }
                if (ma.u != null) {
                    ma.u.setText(turnVal);
                }
                ma.j(turnVal);
                ma.f(turnVal);
                ma.i();
                ma.g();
                ma.k();
                ma.a("MATCH", turnVal, lastVal, currentDice);
                String statusStr2 = ma.A != null ? ma.A.getText().toString() : "Connected";
                ma.a(statusStr2, "MATCH", true, h2, turnVal, lastVal, currentDice, str4, i2, ma.M);
            }
        } catch (Throwable th) {
        }
        ma.r();
        ma.e();
    }
}
