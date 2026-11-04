package c.l.c;

import android.widget.Button;
import android.widget.EditText;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cg implements Runnable {
    final /* synthetic */ Button a;
    final /* synthetic */ EditText b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f17c;

    public cg(MainActivity mainActivity, Button button, EditText editText) {
        this.f17c = mainActivity;
        this.a = button;
        this.b = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f17c;
        Button button = this.a;
        EditText editText = this.b;
        mainActivity.ay.post(new ch(mainActivity, button, mainActivity.a(true), editText));
    }
}
