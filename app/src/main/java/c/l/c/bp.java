package c.l.c;

import android.net.Uri;
import android.os.Bundle;
import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;

/* loaded from: classes.dex */
public final class bp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ MainActivity b;

    public bp(MainActivity mainActivity, String str) {
        this.b = mainActivity;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.b;
        String str = this.a;
        try {
            if (mainActivity.getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(mainActivity, Uri.parse("content://com.ludo.king.dice"))) {
                mainActivity.getContentResolver().call(Uri.parse("content://com.ludo.king.dice"), "setMode", str, mainActivity.a(str != null ? str : "setMode", new Bundle()));
            }
        } catch (Throwable th) {
        }
        String m = mainActivity.m();
        boolean n = mainActivity.n();
        mainActivity.a(n ? m : "127.0.0.1", n ? mainActivity.an : 18080, "SET MODE ".concat(String.valueOf(str)));
    }
}
