package c.l.c;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cm extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ MainActivity a;

    public cm(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Handler handler;
        handler = this.a.ay;
        handler.post(new cn(this));
    }
}
