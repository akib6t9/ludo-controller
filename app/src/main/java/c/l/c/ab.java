package c.l.c;

import android.content.ClipboardManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ab implements View.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ MainActivity b;

    public ab(MainActivity mainActivity, EditText editText) {
        this.b = mainActivity;
        this.a = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.b;
        EditText editText = this.a;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) mainActivity.getSystemService("clipboard");
            if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || clipboardManager.getPrimaryClip().getItemCount() <= 0) {
                Toast.makeText(mainActivity, "Clipboard is empty", 0).show();
            } else {
                CharSequence text = clipboardManager.getPrimaryClip().getItemAt(0).getText();
                if (text == null || text.length() <= 0) {
                    Toast.makeText(mainActivity, "Clipboard is empty", 0).show();
                } else {
                    editText.setText(text.toString().trim());
                    mainActivity.d();
                    Toast.makeText(mainActivity, "Activation key pasted", 0).show();
                }
            }
        } catch (Throwable th) {
        }
    }
}
