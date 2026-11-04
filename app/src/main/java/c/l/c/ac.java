package c.l.c;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ac implements View.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ TextView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LinearLayout f2c;
    final /* synthetic */ Button d;
    final /* synthetic */ MainActivity e;

    public ac(MainActivity mainActivity, EditText editText, TextView textView, LinearLayout linearLayout, Button button) {
        this.e = mainActivity;
        this.a = editText;
        this.b = textView;
        this.f2c = linearLayout;
        this.d = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.e;
        EditText editText = this.a;
        TextView textView = this.b;
        LinearLayout linearLayout = this.f2c;
        Button button = this.d;
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty()) {
            textView.setText("Please enter or paste your activation key");
            linearLayout.setVisibility(0);
            mainActivity.d();
            return;
        }
        dz a = MainActivity.a(trim);
        if (!a.e) {
            textView.setText("Invalid code format or signature");
            linearLayout.setVisibility(0);
            mainActivity.d();
        } else {
            button.setEnabled(false);
            button.setText("Verifying with server...");
            linearLayout.setVisibility(8);
            mainActivity.az.execute(new ad(mainActivity, a, button, textView, linearLayout));
        }
    }
}
