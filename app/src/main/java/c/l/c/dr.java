package c.l.c;

import android.widget.SeekBar;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class dr implements Runnable {
    final /* synthetic */ MainActivity a;

    public dr(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int e;
        boolean z;
        int[] iArr;
        int i;
        SeekBar seekBar;
        SeekBar seekBar2;
        int[] iArr2;
        this.a.L();
        str = this.a.M;
        e = MainActivity.e(str);
        z = this.a.bx;
        if (z) {
            iArr2 = this.a.D;
            i = iArr2[0];
        } else {
            iArr = this.a.D;
            i = iArr[e];
        }
        seekBar = this.a.C;
        if (seekBar != null) {
            seekBar2 = this.a.C;
            seekBar2.setProgress(i);
        }
        this.a.i(i);
    }
}
