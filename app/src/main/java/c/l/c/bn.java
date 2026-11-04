package c.l.c;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.ludo.controller.MainActivity;
import com.ludo.controller.SecurityGuard;

/* loaded from: classes.dex */
public final class bn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainActivity f7c;

    public bn(MainActivity mainActivity, int i, String str) {
        this.f7c = mainActivity;
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e;
        boolean z;
        int[] iArr;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("luck", this.a);
            bundle.putString("color", this.b);
            e = MainActivity.e(this.b);
            bundle.putInt("seat", e);
            bundle.putBoolean("universal", false);
            z = this.f7c.O;
            bundle.putBoolean("enabled", z);
            iArr = this.f7c.D;
            bundle.putIntArray("seatLuck", iArr);
            String valueOf = String.valueOf(this.a);
            this.f7c.a(valueOf, bundle);
            if (this.f7c.getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(this.f7c, Uri.parse("content://com.ludo.king.dice"))) {
                this.f7c.getContentResolver().call(Uri.parse("content://com.ludo.king.dice"), "setSmartLuck", valueOf, bundle);
            }
            MainActivity.a(this.f7c, this.a, this.b);
        } catch (Throwable th) {
            Log.w("LudoController", "setSmartLuck error: " + th.getMessage());
        }
    }
}
