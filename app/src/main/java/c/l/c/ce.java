package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ce implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public ce(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.lambda$showHotspotConfigDialog$34(view);
    }
}
