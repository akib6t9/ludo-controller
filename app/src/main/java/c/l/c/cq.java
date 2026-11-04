package c.l.c;

import android.view.View;
import android.widget.EditText;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cq implements View.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ MainActivity b;

    public cq(MainActivity mainActivity, EditText editText) {
        this.b = mainActivity;
        this.a = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.setText("");
    }
}
