package c.l.c;

import com.ludo.controller.MainActivity;
import java.net.Socket;

public final class ds implements Runnable {
    final /* synthetic */ MainActivity a;

    public ds(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override
    public final void run() {
        String a2 = this.a.a(true);
        if (a2 != null && !a2.isEmpty() && !MainActivity.n(a2)) {
            String str = this.a.ao;
            this.a.ao = a2;
            if (!a2.equals(str)) {
                Socket socket = this.a.aw;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable th) {
                    }
                }
            }
        }
    }
}
