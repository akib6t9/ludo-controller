package c.l.c;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cd implements View.OnClickListener {
    final /* synthetic */ Button a;
    final /* synthetic */ EditText b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f15c;

    public cd(MainActivity mainActivity, Button button, EditText editText) {
        this.f15c = mainActivity;
        this.a = button;
        this.b = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.f15c;
        Button button = this.a;
        EditText editText = this.b;
        button.setText("Scanning Network...");
        button.setEnabled(false);
        mainActivity.az.execute(new cg(mainActivity, button, editText));
    }
}
