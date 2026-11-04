package c.l.c;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ah implements DialogInterface.OnClickListener {
    final /* synthetic */ MainActivity a;

    public ah(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.a;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) mainActivity.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Device ID", mainActivity.c()));
                Toast.makeText(mainActivity, "Device ID copied to clipboard", 0).show();
            }
        } catch (Throwable th) {
        }
    }
}
