package c.l.c;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ae implements Runnable {
    final /* synthetic */ Button a;
    final /* synthetic */ dv b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dz f4c;
    final /* synthetic */ TextView d;
    final /* synthetic */ LinearLayout e;
    final /* synthetic */ MainActivity f;

    public ae(MainActivity mainActivity, Button button, dv dvVar, dz dzVar, TextView textView, LinearLayout linearLayout) {
        this.f = mainActivity;
        this.a = button;
        this.b = dvVar;
        this.f4c = dzVar;
        this.d = textView;
        this.e = linearLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f;
        Button button = this.a;
        dv dvVar = this.b;
        dz dzVar = this.f4c;
        TextView textView = this.d;
        LinearLayout linearLayout = this.e;
        button.setEnabled(true);
        button.setText((mainActivity.aC == null || !mainActivity.aC.c()) ? "⚡ Unlock Pro" : "⚡ Renew / Switch Key");
        if (dvVar != null && dvVar.d) {
            mainActivity.b(dzVar);
            mainActivity.aC = dzVar;
            mainActivity.d();
            mainActivity.f();
            mainActivity.e();
            mainActivity.r();
            return;
        }
        if (dvVar != null && ("suspended".equals(dvVar.e) || "revoked".equals(dvVar.e) || "expired".equals(dvVar.e) || "tampered".equals(dvVar.e))) {
            mainActivity.a(mainActivity.getSharedPreferences("ludo_controller_prefs", 0));
            mainActivity.aC = null;
        }
        textView.setText((dvVar == null || dvVar.b == null) ? "Activation error: Unable to verify license online. Please connect to internet." : dvVar.b);
        linearLayout.setVisibility(0);
        mainActivity.d();
    }
}
