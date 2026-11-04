package c.l.c;

import android.net.Uri;
import android.os.Bundle;
import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;

/* loaded from: classes.dex */
public final class bt implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ MainActivity b;

    public bt(MainActivity mainActivity, String str) {
        this.b = mainActivity;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.b;
        String str = this.a;
        try {
            String concat = "SET PROFILE ".concat(String.valueOf(str));
            String m = mainActivity.m();
            if (mainActivity.n()) {
                if ((mainActivity.at && mainActivity.au) || mainActivity.a(m, mainActivity.an, concat)) {
                    return;
                }
                mainActivity.a("127.0.0.1", 18080, concat);
                return;
            }
            try {
                if (mainActivity.getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(mainActivity, Uri.parse("content://com.ludo.king.dice"))) {
                    Bundle bundle = new Bundle();
                    bundle.putString("profile", str);
                    mainActivity.a(str != null ? str : "setSmartProfile", bundle);
                    mainActivity.getContentResolver().call(Uri.parse("content://com.ludo.king.dice"), "setSmartProfile", str, bundle);
                }
            } catch (Throwable th) {
            }
            try {
                mainActivity.a("127.0.0.1", 18080, concat);
            } catch (Throwable th2) {
            }
        } catch (Throwable th3) {
        }
    }
}
