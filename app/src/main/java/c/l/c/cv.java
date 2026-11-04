package c.l.c;

import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cv implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f25c;

    public cv(MainActivity mainActivity, boolean z, String str) {
        this.f25c = mainActivity;
        this.a = z;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f25c;
        boolean z = this.a;
        String str = this.b;
        TextView textView = mainActivity.B;
        if (textView != null && !mainActivity.au) {
            textView.setText("SYNCING...");
            mainActivity.B.setTextColor(Color.parseColor("#fde047"));
            mainActivity.B.setBackground(MainActivity.a(Color.parseColor("#422006"), mainActivity.a(12), mainActivity.a(1), Color.parseColor("#ca8a04")));
        }
        mainActivity.k();
        if (z) {
            Toast.makeText(mainActivity, "Connecting Cloud Sync to PIN: ".concat(String.valueOf(str)), 0).show();
        }
    }
}
