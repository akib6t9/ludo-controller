package c.l.c;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Toast;
import com.ludo.controller.MainActivity;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class at implements View.OnClickListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ MainActivity b;

    public at(MainActivity mainActivity, AlertDialog alertDialog) {
        this.b = mainActivity;
        this.a = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Socket socket;
        Socket socket2;
        ExecutorService executorService;
        this.b.al = false;
        this.b.cs = 0L;
        this.b.ct = "";
        try {
            this.b.getSharedPreferences("ludo_controller_prefs", 0).edit().putBoolean("pref_force_local_mode", false).apply();
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
        executorService = this.b.az;
        executorService.execute(new au(this));
        Toast.makeText(this.b, "Remote Mode Enabled (Scanning...)", 0).show();
        this.a.dismiss();
    }
}
