package c.l.c;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;
import com.ludo.controller.MainActivity;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class aq implements View.OnClickListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ MainActivity b;

    public aq(MainActivity mainActivity, AlertDialog alertDialog) {
        this.b = mainActivity;
        this.a = alertDialog;
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
        str = this.b.am;
        i = this.b.an;
        if (str != null && !str.isEmpty() && !"127.0.0.1".equals(str)) {
            executorService2 = this.b.aA;
            executorService2.execute(new ar(this, str, i));
        }
        this.b.O = false;
        this.b.L = "AUTO";
        l = this.b.l();
        if (l) {
            this.b.al = true;
        } else {
            this.b.al = false;
        }
        this.b.am = "";
        this.b.ao = "";
        this.b.cs = 0L;
        this.b.ct = "";
        try {
            SharedPreferences.Editor putBoolean = this.b.getSharedPreferences("ludo_controller_prefs", 0).edit().putBoolean("pref_god_mode_enabled", false);
            z = this.b.al;
            putBoolean.putBoolean("pref_force_local_mode", z).putString("pref_remote_host", "").apply();
        } catch (Throwable th) {
        }
        socket = this.b.aw;
        if (socket != null) {
            try {
                socket2 = this.b.aw;
                socket2.close();
            } catch (Throwable th2) {
            }
            MainActivity.r(this.b);
        }
        MainActivity.s(this.b);
        this.b.G = "";
        this.b.g();
        this.b.j();
        this.b.k();
        executorService = this.b.az;
        executorService.execute(new as(this));
        Toast.makeText(this.b, "Disconnected Remote (Reset to Normal Fair Play)", 0).show();
        this.a.dismiss();
    }
}
