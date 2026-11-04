package c.l.c;

import android.view.View;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cs implements View.OnClickListener {
    final /* synthetic */ boolean[] a;
    final /* synthetic */ Runnable b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f23c;

    public cs(MainActivity mainActivity, boolean[] zArr, Runnable runnable) {
        this.f23c = mainActivity;
        this.a = zArr;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity.a(this.a, this.b);
    }
}
