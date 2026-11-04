package c.l.c;

import android.graphics.Color;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class da implements Runnable {
    final /* synthetic */ MainActivity a;

    public da(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.a;
        mainActivity.k();
        if (mainActivity.B != null) {
            boolean z = mainActivity.aC == null || mainActivity.aC.a(16) || mainActivity.aC.a(8) || mainActivity.aC.a(32);
            mainActivity.B.setText(z ? "CLOUD SYNC" : "SYNC LOCKED");
            mainActivity.B.setTextColor(Color.parseColor(z ? "#38bdf8" : "#556b70"));
            mainActivity.B.setBackground(MainActivity.a(Color.parseColor(z ? "#0c2d48" : "#091013"), mainActivity.a(12), mainActivity.a(1), Color.parseColor(z ? "#0284c7" : "#17272b")));
        }
        Toast.makeText(mainActivity, "Cloud Sync Disconnected.", 0).show();
    }
}
