package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ax implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public ax(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.lambda$buildCleanUI$11(view);
    }
}
