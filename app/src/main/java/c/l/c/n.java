package c.l.c;

import org.json.JSONObject;

final class n implements Runnable {
    final /* synthetic */ a a;

    n(a aVar) {
        this.a = aVar;
    }

    @Override
    public final void run() {
        while (this.a.r.get()) {
            JSONObject jSONObject = (JSONObject) this.a.p.poll();
            if (jSONObject == null) {
                return;
            }
            this.a.b(jSONObject.toString());
        }
    }
}
