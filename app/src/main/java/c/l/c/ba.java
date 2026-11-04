package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ba implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    public ba(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.lambda$buildCleanUI$13(view);
    }
}
