package c.l.c;

import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cj implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f19c;

    public cj(MainActivity mainActivity, String str, boolean z) {
        this.f19c = mainActivity;
        this.a = str;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f19c;
        String str = this.a;
        boolean z = this.b;
        TextView textView = mainActivity.z;
        if (textView != null) {
            textView.setText("ROOM ".concat(String.valueOf(str)));
            mainActivity.z.setTextColor(Color.parseColor("#86efac"));
            mainActivity.z.setBackground(MainActivity.a(Color.parseColor("#052e16"), mainActivity.a(12), mainActivity.a(1), Color.parseColor("#16a34a")));
        }
        mainActivity.k();
        Toast.makeText(mainActivity, "Connected to Room: " + str + (z ? " (Master)" : " (Mirror)"), 0).show();
    }
}
