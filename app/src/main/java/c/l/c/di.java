package c.l.c;

import com.ludo.controller.MainActivity;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public final class di implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ MainActivity f32c;

    public di(MainActivity mainActivity, String str, long j) {
        this.f32c = mainActivity;
        this.a = str;
        this.b = j;
    }

    @Override
    public final void run() {
        MainActivity mainActivity = this.f32c;
        String str = this.a;
        long j = this.b;
        try {
            mainActivity.o(str);
            dy a2 = dy.a("None", "Not executed");
            String m = mainActivity.n() ? mainActivity.m() : "";
            boolean z = false;
            if (m.length() > 0 && !"127.0.0.1".equals(m) && (!mainActivity.at || !mainActivity.au)) {
                if (mainActivity.aw != null && !mainActivity.aw.isClosed()) {
                    try {
                        String m2 = mainActivity.m("SET ".concat(String.valueOf(str)));
                        if (mainActivity.ax) {
                            MainActivity.a(mainActivity.aw, m2);
                        } else {
                            OutputStream outputStream = mainActivity.aw.getOutputStream();
                            outputStream.write((m2 + "\n").getBytes(StandardCharsets.UTF_8));
                            mainActivity.aw.getOutputStream().flush();
                        }
                        a2 = new dy(true, str, mainActivity.ax ? "WebSocket" : "Hotspot Stream", null);
                        z = true;
                    } catch (Throwable th) {
                    }
                }
                dy a3 = mainActivity.a(m, mainActivity.an, str, "Hotspot ".concat(String.valueOf(m)));
                if (a3.a || !z) {
                    a2 = a3;
                }
            }
            if (mainActivity.at && mainActivity.au) {
                mainActivity.s(str);
                a2 = new dy(true, str, "Cloud (" + mainActivity.as + ")", null);
            } else if (!a2.a && mainActivity.aq && !mainActivity.ap.isEmpty()) {
                a2 = new dy(true, str, "Room (" + mainActivity.ap + ")", null);
            }
            if (!a2.a || mainActivity.l()) {
                dy w = mainActivity.w(str);
                dy dyVar = w.a ? w : a2;
                if (mainActivity.aw != null && !mainActivity.aw.isClosed()) {
                    try {
                        String m3 = mainActivity.m("SET ".concat(String.valueOf(str)));
                        if (mainActivity.ax) {
                            MainActivity.a(mainActivity.aw, m3);
                        } else {
                            OutputStream outputStream2 = mainActivity.aw.getOutputStream();
                            outputStream2.write((m3 + "\n").getBytes(StandardCharsets.UTF_8));
                            mainActivity.aw.getOutputStream().flush();
                        }
                    } catch (Throwable th2) {
                    }
                }
                try {
                    dy a4 = mainActivity.a("127.0.0.1", 18080, str, "Local Socket");
                    a2 = (!a4.a || w.a) ? dyVar : a4;
                } catch (Throwable th3) {
                    a2 = dyVar;
                }
            }
            mainActivity.ay.post(new dk(mainActivity, j, a2));
        } catch (Throwable th4) {
        }
    }
}
