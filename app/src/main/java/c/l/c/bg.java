package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class bg implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ MainActivity b;

    public bg(MainActivity mainActivity, String str) {
        this.b = mainActivity;
        this.a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.l(this.a);
    }
}
