package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class dj implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public dj(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d();
        this.a.f();
        this.a.e();
        this.a.r();
    }
}
