package c.l.c;

import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
final class cn implements Runnable {
    final /* synthetic */ cm a;

    cn(cm cmVar) {
        this.a = cmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz dzVar;
        dz dzVar2;
        dz dzVar3;
        dzVar = this.a.a.aC;
        if (dzVar != null) {
            dzVar2 = this.a.a.aC;
            if (dzVar2.c()) {
                MainActivity mainActivity = this.a.a;
                dzVar3 = this.a.a.aC;
                mainActivity.a(dzVar3, true);
                this.a.a.B();
                return;
            }
        }
        this.a.a.z();
    }
}
