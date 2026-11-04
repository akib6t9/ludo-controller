package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class bi implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ MainActivity b;

    public bi(MainActivity mainActivity, int i) {
        this.b = mainActivity;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity.a(this.b, this.a);
    }
}
