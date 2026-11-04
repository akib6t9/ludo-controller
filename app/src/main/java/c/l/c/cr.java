package c.l.c;

import android.graphics.Color;
import android.widget.Button;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cr implements Runnable {
    final /* synthetic */ boolean[] a;
    final /* synthetic */ Button b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f22c;

    public cr(MainActivity mainActivity, boolean[] zArr, Button button) {
        this.f22c = mainActivity;
        this.a = zArr;
        this.b = button;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f22c;
        boolean[] zArr = this.a;
        Button button = this.b;
        if (zArr[0]) {
            button.setText("Role: MASTER (I have Controller)");
            button.setTextColor(Color.parseColor("#86efac"));
            button.setBackground(MainActivity.a(Color.parseColor("#052e16"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#16a34a")));
        } else {
            button.setText("Role: MIRROR (Sync from Friend)");
            button.setTextColor(Color.parseColor("#f9d36b"));
            button.setBackground(MainActivity.a(Color.parseColor("#2b2209"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#9a7112")));
        }
    }
}
