package c.l.c;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.EditText;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class dd implements View.OnFocusChangeListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ GradientDrawable b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ GradientDrawable f31c;
    final /* synthetic */ MainActivity d;

    public dd(MainActivity mainActivity, EditText editText, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        this.d = mainActivity;
        this.a = editText;
        this.b = gradientDrawable;
        this.f31c = gradientDrawable2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.setBackground(z ? this.b : this.f31c);
    }
}
