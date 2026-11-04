package c.l.c;

import android.graphics.Color;
import android.widget.TextView;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class dp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ MainActivity b;

    public dp(MainActivity mainActivity, String str) {
        this.b = mainActivity;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        long j;
        boolean z = true;
        MainActivity mainActivity = this.b;
        String str = this.a;
        try {
            if (str.startsWith("SNAPSHOT ")) {
                String trim = str.substring(9).trim();
                if (trim != null) {
                    String[] split = trim.split("\\|");
                    if (split.length > 0) {
                        String trim2 = split[0].trim();
                        if (trim2.startsWith("SNAPSHOT ")) {
                            trim2 = trim2.substring(9).trim();
                        }
                        mainActivity.y(trim2);
                    }
                    for (int i = 1; i < split.length; i++) {
                        String trim3 = split[i].trim();
                        if (trim3.startsWith("TURN ")) {
                            String z2 = MainActivity.z(trim3.substring(5).trim());
                            if (!"-".equals(z2) && !z2.isEmpty()) {
                                mainActivity.Y = z2;
                            }
                            mainActivity.f(z2);
                            if ("-".equals(z2)) {
                                z2 = "-";
                            }
                            mainActivity.j(z2);
                        } else if (trim3.startsWith("LAST ")) {
                            String v = MainActivity.v(trim3.substring(5).trim());
                            if (!"-".equals(v) && !v.isEmpty()) {
                                mainActivity.Z = v;
                            }
                            TextView textView = mainActivity.w;
                            if (textView != null) {
                                textView.setText(v);
                            }
                            if (mainActivity.x != null) {
                                mainActivity.x.setText("LAST\n".concat(String.valueOf(v)));
                            }
                        } else if (trim3.startsWith("DICE ") && !mainActivity.ae) {
                            mainActivity.L = MainActivity.u(trim3.substring(5).trim());
                            mainActivity.j();
                        }
                    }
                    if (("-".equals(mainActivity.Y) || mainActivity.Y.isEmpty()) && ("-".equals(mainActivity.Z) || mainActivity.Z.isEmpty())) {
                        z = false;
                    }
                    if (z) {
                        mainActivity.F = "MATCH";
                    }
                    mainActivity.a(mainActivity.F != null ? mainActivity.F : "MATCH", mainActivity.Y, mainActivity.Z, mainActivity.L);
                    if (mainActivity.w != null) {
                        mainActivity.w.setText(mainActivity.Z);
                    }
                    if (mainActivity.u != null) {
                        mainActivity.u.setText(mainActivity.Y);
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.startsWith("EVENT STATE ")) {
                mainActivity.y(str.substring(12).trim());
                return;
            }
            if (str.startsWith("EVENT TURN ")) {
                String z3 = MainActivity.z(str.substring(11).trim());
                if (!"-".equals(z3) && !z3.isEmpty()) {
                    mainActivity.Y = z3;
                    mainActivity.F = "MATCH";
                    if (mainActivity.Q == null || "MENU".equalsIgnoreCase(mainActivity.Q)) {
                        mainActivity.Q = "MATCH";
                    }
                }
                mainActivity.f(z3);
                mainActivity.j("-".equals(z3) ? "-" : z3);
                if (mainActivity.u != null) {
                    mainActivity.u.setText(z3);
                }
                mainActivity.a("MATCH", z3, mainActivity.Z, mainActivity.L);
                return;
            }
            if (!str.startsWith("EVENT ROLL ")) {
                if (str.startsWith("EVENT DICE ")) {
                    String u = MainActivity.u(str.substring(11).trim());
                    if (!mainActivity.ae) {
                        mainActivity.L = u;
                        mainActivity.j();
                        mainActivity.k();
                    }
                }
                if (str.startsWith("EVENT SMART OFF")) {
                    if (System.currentTimeMillis() - mainActivity.E > 1500) {
                        mainActivity.O = false;
                        mainActivity.aD = "";
                        mainActivity.g();
                        mainActivity.k();
                        return;
                    }
                    return;
                }
                if (!str.startsWith("EVENT SMART ") || (indexOf = str.indexOf(" ROLL ")) < 0 || mainActivity.ae) {
                    return;
                }
                String trim4 = str.substring(indexOf + 6).trim();
                int indexOf2 = trim4.indexOf(32);
                if (indexOf2 > 0) {
                    trim4 = trim4.substring(0, indexOf2).trim();
                }
                String u2 = MainActivity.u(trim4);
                if ("AUTO".equalsIgnoreCase(u2)) {
                    return;
                }
                mainActivity.aD = u2;
                mainActivity.L = u2;
                mainActivity.j();
                mainActivity.g();
                mainActivity.k();
                return;
            }
            String trim5 = str.substring(11).trim();
            if (trim5.contains(" ")) {
                String[] split2 = trim5.split("\\s+");
                trim5 = split2[0];
                try {
                    j = Long.parseLong(split2[1]);
                } catch (Throwable th) {
                    j = 0;
                }
            } else {
                j = 0;
            }
            String v2 = MainActivity.v(trim5);
            TextView textView2 = mainActivity.w;
            if (textView2 != null) {
                textView2.setText(v2);
            }
            if (!"-".equals(v2) && !v2.isEmpty()) {
                mainActivity.Z = v2;
                mainActivity.F = "MATCH";
                if (mainActivity.Q == null || "MENU".equalsIgnoreCase(mainActivity.Q)) {
                    mainActivity.Q = "MATCH";
                }
                if (mainActivity.x != null) {
                    mainActivity.x.setText("LAST\n".concat(String.valueOf(v2)));
                    mainActivity.x.setTextColor(Color.parseColor("#facc15"));
                    mainActivity.x.setBackground(MainActivity.a(Color.parseColor("#422006"), mainActivity.a(10), mainActivity.a(1), Color.parseColor("#ca8a04")));
                }
                mainActivity.a("MATCH", mainActivity.Y, v2, mainActivity.L);
            }
            if (j > 0) {
                mainActivity.aa = j;
            }
            if (mainActivity.ae) {
                boolean z4 = mainActivity.af != null && mainActivity.af.equals(v2);
                if (j <= 0 || (mainActivity.ai >= 0 && j <= mainActivity.ai)) {
                    z = false;
                }
                if (System.currentTimeMillis() - mainActivity.ak >= 250 && z && z4) {
                    mainActivity.ae = false;
                    mainActivity.af = "";
                    mainActivity.ai = -1L;
                    mainActivity.aj = 0L;
                    mainActivity.L = "AUTO";
                    mainActivity.j();
                    mainActivity.k();
                    mainActivity.d();
                    if (mainActivity.O) {
                        return;
                    }
                    mainActivity.t("AUTO");
                }
            }
        } catch (Throwable th2) {
        }
    }
}
