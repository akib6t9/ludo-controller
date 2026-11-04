package c.l.c;

import android.graphics.Color;
import android.widget.TextView;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cx implements Runnable {
    final /* synthetic */ MainActivity a;

    public cx(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        MainActivity mainActivity = this.a;
        if (mainActivity.at && (textView = mainActivity.B) != null && !"OFFLINE".equals(textView.getText().toString())) {
            mainActivity.B.setText("OFFLINE");
            mainActivity.B.setTextColor(Color.parseColor("#f87171"));
            mainActivity.B.setBackground(MainActivity.a(Color.parseColor("#450a0a"), mainActivity.a(12), mainActivity.a(1), Color.parseColor("#dc2626")));
        }
        mainActivity.k();
    }
}
