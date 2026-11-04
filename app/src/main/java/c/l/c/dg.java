package c.l.c;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class dg implements DialogInterface.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ MainActivity b;

    public dg(MainActivity mainActivity, EditText editText) {
        this.b = mainActivity;
        this.a = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.b;
        String trim = this.a.getText().toString().trim();
        if (trim.isEmpty()) {
            Toast.makeText(mainActivity, "Please enter 6-digit PIN", 0).show();
        } else {
            mainActivity.b(trim, true);
        }
    }
}
