package c.l.c;

import android.graphics.Color;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ck implements Runnable {
    final /* synthetic */ MainActivity a;

    public ck(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.a;
        mainActivity.k();
        if (mainActivity.z != null) {
            boolean z = mainActivity.aC == null || mainActivity.aC.a(8);
            mainActivity.z.setText(z ? "ONLINE ROOM" : "ROOM LOCKED");
            mainActivity.z.setTextColor(Color.parseColor(z ? "#c084fc" : "#556b70"));
            mainActivity.z.setBackground(MainActivity.a(Color.parseColor(z ? "#2e1065" : "#091013"), mainActivity.a(12), mainActivity.a(1), Color.parseColor(z ? "#7e22ce" : "#17272b")));
        }
        Toast.makeText(mainActivity, "Room Sync Stopped.", 0).show();
    }
}
