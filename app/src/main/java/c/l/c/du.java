package c.l.c;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class du implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ Button b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f35c;

    public du(MainActivity mainActivity, String str, Button button) {
        this.f35c = mainActivity;
        this.a = str;
        this.b = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.f35c;
        String str = this.a;
        Button button = this.b;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) mainActivity.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Device ID", str));
                mainActivity.d();
                button.setText("✓ Copied");
                button.setTextColor(Color.parseColor("#34d399"));
                button.setBackground(MainActivity.a(Color.parseColor("#064e3b"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#10b981")));
                mainActivity.ay.postDelayed(new af(mainActivity, button), 1800L);
                Toast.makeText(mainActivity, "Device ID copied to clipboard", 0).show();
            }
        } catch (Throwable th) {
        }
    }
}
