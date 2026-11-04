package c.l.c;

import android.graphics.Color;
import android.widget.Button;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class af implements Runnable {
    final /* synthetic */ Button a;
    final /* synthetic */ MainActivity b;

    public af(MainActivity mainActivity, Button button) {
        this.b = mainActivity;
        this.a = button;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.b;
        Button button = this.a;
        button.setText("📋 Copy ID");
        button.setTextColor(Color.parseColor("#f1f5f9"));
        button.setBackground(MainActivity.a(MainActivity.a(Color.parseColor("#1e293b"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#334155")), MainActivity.a(Color.parseColor("#273549"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#475569"))));
    }
}
