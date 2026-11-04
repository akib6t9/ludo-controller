package c.l.c;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;
import com.ludo.controller.MainActivity;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class bv implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public bv(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i;
        boolean l;
        Socket socket;
        Socket socket2;
        ExecutorService executorService;
        boolean z;
        ExecutorService executorService2;
        str = this.a.am;
        i = this.a.an;
        if (str != null && !str.isEmpty() && !"127.0.0.1".equals(str)) {
            executorService2 = this.a.aA;
            executorService2.execute(new bw(this, str, i));
        }
        this.a.O = false;
        this.a.L = "AUTO";
        l = this.a.l();
        if (l) {
            this.a.al = true;
        } else {
            this.a.al = false;
        }
        this.a.am = "";
        this.a.ao = "";
        this.a.cs = 0L;
        this.a.ct = "";
        try {
            SharedPreferences.Editor putBoolean = this.a.getSharedPreferences("ludo_controller_prefs", 0).edit().putBoolean("pref_god_mode_enabled", false);
            z = this.a.al;
            putBoolean.putBoolean("pref_force_local_mode", z).putString("pref_remote_host", "").apply();
        } catch (Throwable th) {
        }
        socket = this.a.aw;
        if (socket != null) {
            try {
                socket2 = this.a.aw;
                socket2.close();
            } catch (Throwable th2) {
            }
            MainActivity.r(this.a);
        }
        MainActivity.s(this.a);
        this.a.G = "";
        this.a.g();
        this.a.j();
        this.a.k();
        executorService = this.a.az;
        executorService.execute(new bx(this));
        Toast.makeText(this.a, "Disconnected Remote (Reset to Normal Fair Play)", 0).show();
    }
}
