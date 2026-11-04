package c.l.c;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.ludo.controller.MainActivity;

/* renamed from: c.l.c.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo implements Runnable {
    final /* synthetic */ MainActivity a;

    public Cdo(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        boolean n;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        int a;
        int a2;
        GradientDrawable a3;
        this.a.k();
        textView = this.a.A;
        if (textView != null) {
            n = this.a.n();
            String str = n ? "Remote" : "Connected";
            textView2 = this.a.A;
            textView2.setText(str);
            textView3 = this.a.A;
            textView3.setTextColor(Color.parseColor("#85efac"));
            textView4 = this.a.A;
            int parseColor = Color.parseColor("#09251a");
            a = this.a.a(9);
            a2 = this.a.a(1);
            a3 = MainActivity.a(parseColor, a, a2, Color.parseColor("#137a4a"));
            textView4.setBackground(a3);
        }
    }
}
