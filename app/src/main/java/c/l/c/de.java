package c.l.c;

import android.content.ClipboardManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.ludo.controller.MainActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class de implements View.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ MainActivity b;

    public de(MainActivity mainActivity, EditText editText) {
        this.b = mainActivity;
        this.a = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        MainActivity mainActivity = this.b;
        EditText editText = this.a;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) mainActivity.getSystemService("clipboard");
            if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || clipboardManager.getPrimaryClip().getItemCount() <= 0 || (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) == null) {
                return;
            }
            String trim = text.toString().trim();
            Matcher matcher = Pattern.compile("\\d{6}").matcher(trim);
            if (matcher.find()) {
                trim = matcher.group();
            } else {
                Matcher matcher2 = Pattern.compile("\\d{5,8}").matcher(trim);
                if (matcher2.find()) {
                    trim = matcher2.group();
                }
            }
            editText.setText(trim);
            Toast.makeText(mainActivity, "Pasted: ".concat(String.valueOf(trim)), 0).show();
        } catch (Throwable th) {
        }
    }
}
