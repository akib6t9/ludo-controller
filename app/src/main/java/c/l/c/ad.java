package c.l.c;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ad implements Runnable {
    final /* synthetic */ dz a;
    final /* synthetic */ Button b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextView f3c;
    final /* synthetic */ LinearLayout d;
    final /* synthetic */ MainActivity e;

    public ad(MainActivity mainActivity, dz dzVar, Button button, TextView textView, LinearLayout linearLayout) {
        this.e = mainActivity;
        this.a = dzVar;
        this.b = button;
        this.f3c = textView;
        this.d = linearLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.e;
        dz dzVar = this.a;
        Button button = this.b;
        TextView textView = this.f3c;
        LinearLayout linearLayout = this.d;
        mainActivity.ay.post(new ae(mainActivity, button, mainActivity.a(dzVar), dzVar, textView, linearLayout));
    }
}
