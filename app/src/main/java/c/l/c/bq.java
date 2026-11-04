package c.l.c;

import android.net.Uri;
import android.os.Bundle;
import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;

/* loaded from: classes.dex */
public final class bq implements Runnable {
    final /* synthetic */ MainActivity a;

    public bq(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.a;
        try {
            if (mainActivity.getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(mainActivity, Uri.parse("content://com.ludo.king.dice"))) {
                mainActivity.getContentResolver().call(Uri.parse("content://com.ludo.king.dice"), "resetMatch", (String) null, mainActivity.a("resetMatch", new Bundle()));
            }
        } catch (Throwable th) {
        }
        String m = mainActivity.m();
        boolean n = mainActivity.n();
        mainActivity.a(n ? m : "127.0.0.1", n ? mainActivity.an : 18080, "RESET");
    }
}
