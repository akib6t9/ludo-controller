package c.l.c;

import com.ludo.controller.MainActivity;
import java.io.File;
import java.io.FileWriter;

/* loaded from: classes.dex */
public final class bo implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f8c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;
    final /* synthetic */ String i;
    final /* synthetic */ String j;
    final /* synthetic */ MainActivity k;

    public bo(MainActivity mainActivity, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.k = mainActivity;
        this.a = str;
        this.b = str2;
        this.f8c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        String str2;
        String str3;
        try {
            String str4 = (this.a == null || this.a.isEmpty() || "-".equals(this.a)) ? "AUTO" : this.a;
            String str5 = (this.b == null || this.b.isEmpty()) ? "-" : this.b;
            if ("-".equals(str5) && this.f8c) {
                str = this.k.Z;
                if (str != null) {
                    str2 = this.k.Z;
                    if (!"-".equals(str2)) {
                        str3 = this.k.Z;
                        if (!str3.isEmpty()) {
                            str5 = this.k.Z;
                        }
                    }
                }
            }
            FileWriter fileWriter = new FileWriter(new File(this.k.getFilesDir(), "controller_state.txt"));
            StringBuilder append = new StringBuilder("STATUS_TEXT=").append(this.d).append("\nMATCH_STATE=").append(this.e).append("\nIN_MATCH=").append(this.f8c).append("\nBADGE=").append(this.f).append("\nTURN=").append(this.g).append("\nLAST_DICE=").append(str5).append("\nLOCK_DICE=").append(str4).append("\nMODE=").append(this.h).append("\nPLAYERS=").append(this.i).append("\nSELECTED_COLOR=").append(this.j).append("\nSMART_ENABLED=");
            z = this.k.O;
            fileWriter.write(append.append(z).append("\n").toString());
            fileWriter.close();
            this.k.p(str5);
            try {
                this.k.getSharedPreferences("ludo_controller_prefs", 0).edit().putString("pref_last_dice", str5).apply();
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
        }
    }
}
