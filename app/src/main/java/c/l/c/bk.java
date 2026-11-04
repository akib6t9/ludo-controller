package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class bk implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ MainActivity b;

    public bk(MainActivity mainActivity, int i) {
        this.b = mainActivity;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.b;
        String valueOf = String.valueOf(this.a);
        if (mainActivity.a(1, "General Features")) {
            mainActivity.d();
            if (mainActivity.ae && valueOf.equals(mainActivity.af)) {
                mainActivity.ae = false;
                mainActivity.af = "";
                mainActivity.ai = -1L;
                mainActivity.aj = 0L;
                mainActivity.t("AUTO");
                return;
            }
            mainActivity.ae = true;
            mainActivity.af = valueOf;
            mainActivity.ag = (mainActivity.Z == null || "-".equals(mainActivity.Z)) ? "-" : mainActivity.Z;
            mainActivity.ah = (mainActivity.Y == null || "-".equals(mainActivity.Y)) ? "" : mainActivity.Y;
            mainActivity.ai = mainActivity.aa;
            mainActivity.aj = mainActivity.ab;
            mainActivity.ak = System.currentTimeMillis();
            mainActivity.t(valueOf);
        }
    }
}
