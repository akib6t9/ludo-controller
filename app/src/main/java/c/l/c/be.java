package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class be implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public be(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        MainActivity mainActivity = this.a;
        str = this.a.M;
        mainActivity.l("BLUE".equalsIgnoreCase(str) ? "GREEN" : "BLUE");
    }
}
