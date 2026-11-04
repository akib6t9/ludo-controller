package c.l.c;

import android.content.DialogInterface;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cu implements DialogInterface.OnClickListener {
    final /* synthetic */ MainActivity a;

    public cu(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.o();
    }
}
