package c.l.c;

import android.content.Context;
import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ao implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public ao(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a((Context) this.a);
    }
}
