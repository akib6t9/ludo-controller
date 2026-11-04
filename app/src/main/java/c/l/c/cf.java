package c.l.c;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.ludo.controller.MainActivity;
import java.net.Socket;

/* loaded from: classes.dex */
public final class cf implements DialogInterface.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ EditText b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f16c;

    public cf(MainActivity mainActivity, EditText editText, EditText editText2) {
        this.f16c = mainActivity;
        this.a = editText;
        this.b = editText2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.f16c;
        EditText editText = this.a;
        EditText editText2 = this.b;
        mainActivity.am = editText.getText().toString().trim();
        if ("127.0.0.1".equals(mainActivity.am) || "localhost".equalsIgnoreCase(mainActivity.am) || mainActivity.am.isEmpty()) {
            mainActivity.am = "";
            mainActivity.ao = "";
            mainActivity.al = mainActivity.l();
        } else {
            mainActivity.al = false;
        }
        try {
            mainActivity.an = Integer.parseInt(editText2.getText().toString().trim());
        } catch (Exception e) {
        }
        try {
            mainActivity.getSharedPreferences("ludo_controller_prefs", 0).edit().putString("pref_remote_host", mainActivity.am).putInt("pref_remote_port", mainActivity.an).putBoolean("pref_force_local_mode", mainActivity.al).apply();
        } catch (Throwable th) {
        }
        Socket socket = mainActivity.aw;
        mainActivity.aw = null;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable th2) {
            }
        }
        mainActivity.J = false;
        mainActivity.G = "";
        mainActivity.az.execute(new ci(mainActivity));
        if (mainActivity.am.length() > 0) {
            Toast.makeText(mainActivity, "Target set to " + mainActivity.am + ":" + mainActivity.an + " (Reconnecting...)", 0).show();
        }
    }
}
