package c.l.c;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ch implements Runnable {
    final /* synthetic */ Button a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EditText f18c;
    final /* synthetic */ MainActivity d;

    public ch(MainActivity mainActivity, Button button, String str, EditText editText) {
        this.d = mainActivity;
        this.a = button;
        this.b = str;
        this.f18c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.d;
        Button button = this.a;
        String str = this.b;
        EditText editText = this.f18c;
        button.setText("Auto Detect Phone A IP");
        button.setEnabled(true);
        if (str == null || str.isEmpty()) {
            editText.setText("192.168.43.1");
            mainActivity.ao = "192.168.43.1";
            Toast.makeText(mainActivity, "Defaulted to 192.168.43.1", 0).show();
        } else {
            editText.setText(str);
            mainActivity.ao = str;
            Toast.makeText(mainActivity, "Found Phone A: ".concat(String.valueOf(str)), 0).show();
        }
    }
}
