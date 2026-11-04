package c.l.c;

import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class ci implements Runnable {
    final /* synthetic */ MainActivity a;

    public ci(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.s();
    }
}
