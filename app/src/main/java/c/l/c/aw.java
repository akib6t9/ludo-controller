package c.l.c;

import android.app.AlertDialog;
import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class aw implements View.OnClickListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ MainActivity b;

    public aw(MainActivity mainActivity, AlertDialog alertDialog) {
        this.b = mainActivity;
        this.a = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismiss();
    }
}
