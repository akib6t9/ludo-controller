package c.l.c;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ct implements DialogInterface.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ boolean[] b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f24c;

    public ct(MainActivity mainActivity, EditText editText, boolean[] zArr) {
        this.f24c = mainActivity;
        this.a = editText;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.f24c;
        EditText editText = this.a;
        boolean[] zArr = this.b;
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty()) {
            Toast.makeText(mainActivity, "Please enter 8-digit Room Code", 0).show();
        } else {
            mainActivity.a(trim, zArr[0]);
        }
    }
}
