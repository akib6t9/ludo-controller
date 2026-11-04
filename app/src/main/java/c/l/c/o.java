package c.l.c;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class o implements Runnable {
    final /* synthetic */ a a;

    o(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.r;
        if (atomicBoolean.get()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("t", "ping");
                jSONObject.put("ts", System.currentTimeMillis());
                this.a.b(jSONObject.toString());
            } catch (Exception e) {
            }
        }
    }
}
