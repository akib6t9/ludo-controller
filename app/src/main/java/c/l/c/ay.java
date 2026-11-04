package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ay implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public ay(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity.y(this.a);
    }
}
