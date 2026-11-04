package c.l.c;

import android.content.DialogInterface;
import android.widget.TextView;
import android.widget.Toast;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class br implements DialogInterface.OnClickListener {
    final /* synthetic */ MainActivity a;

    public br(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.a;
        switch (i) {
            case 0:
                mainActivity.k("AUTO");
                Toast.makeText(mainActivity, "Game Mode: Auto-Detect", 0).show();
                break;
            case 1:
                mainActivity.P = 2;
                mainActivity.Q = "2P CLASSIC (BLUE / GREEN)";
                mainActivity.W.clear();
                mainActivity.W.add("BLUE");
                mainActivity.W.add("GREEN");
                mainActivity.k(mainActivity.Q);
                TextView textView = mainActivity.v;
                if (textView != null) {
                    textView.setText("2P (B/G)");
                }
                TextView textView2 = mainActivity.y;
                if (textView2 != null) {
                    textView2.setText("2P");
                }
                mainActivity.i();
                Toast.makeText(mainActivity, "Mode: 2P (Blue / Green)", 0).show();
                break;
            case 2:
                mainActivity.P = 2;
                mainActivity.Q = "2P CLASSIC (RED / YELLOW)";
                mainActivity.W.clear();
                mainActivity.W.add("RED");
                mainActivity.W.add("YELLOW");
                mainActivity.k(mainActivity.Q);
                TextView textView3 = mainActivity.v;
                if (textView3 != null) {
                    textView3.setText("2P (R/Y)");
                }
                TextView textView4 = mainActivity.y;
                if (textView4 != null) {
                    textView4.setText("2P");
                }
                mainActivity.i();
                Toast.makeText(mainActivity, "Mode: 2P (Red / Yellow)", 0).show();
                break;
            case 3:
                mainActivity.P = 3;
                mainActivity.Q = "3P CLASSIC";
                mainActivity.W.clear();
                mainActivity.W.add("BLUE");
                mainActivity.W.add("RED");
                mainActivity.W.add("GREEN");
                mainActivity.k(mainActivity.Q);
                TextView textView5 = mainActivity.v;
                if (textView5 != null) {
                    textView5.setText("3P CLASSIC");
                }
                TextView textView6 = mainActivity.y;
                if (textView6 != null) {
                    textView6.setText("3P");
                }
                mainActivity.i();
                Toast.makeText(mainActivity, "Mode: 3P Classic", 0).show();
                break;
            case 4:
                mainActivity.P = 4;
                mainActivity.Q = "4P CLASSIC";
                mainActivity.W.clear();
                mainActivity.W.add("BLUE");
                mainActivity.W.add("RED");
                mainActivity.W.add("GREEN");
                mainActivity.W.add("YELLOW");
                mainActivity.k(mainActivity.Q);
                TextView textView7 = mainActivity.v;
                if (textView7 != null) {
                    textView7.setText("4P CLASSIC");
                }
                TextView textView8 = mainActivity.y;
                if (textView8 != null) {
                    textView8.setText("4P");
                }
                mainActivity.i();
                Toast.makeText(mainActivity, "Mode: 4P Classic", 0).show();
                break;
            case 5:
                mainActivity.P = 4;
                mainActivity.Q = "2v2 TEAM UP";
                mainActivity.W.clear();
                mainActivity.W.add("BLUE");
                mainActivity.W.add("RED");
                mainActivity.W.add("GREEN");
                mainActivity.W.add("YELLOW");
                mainActivity.k(mainActivity.Q);
                TextView textView9 = mainActivity.v;
                if (textView9 != null) {
                    textView9.setText("TEAM UP");
                }
                TextView textView10 = mainActivity.y;
                if (textView10 != null) {
                    textView10.setText("2v2");
                }
                mainActivity.i();
                Toast.makeText(mainActivity, "Mode: 2v2 Team Up", 0).show();
                break;
            case 6:
                mainActivity.S.clear();
                mainActivity.U = "";
                mainActivity.Q = "MENU";
                mainActivity.T = 250;
                mainActivity.j("-");
                mainActivity.f("-");
                TextView textView11 = mainActivity.v;
                if (textView11 != null) {
                    textView11.setText("MENU");
                }
                TextView textView12 = mainActivity.y;
                if (textView12 != null) {
                    textView12.setText("--");
                }
                mainActivity.i();
                mainActivity.aA.execute(new bq(mainActivity));
                break;
        }
    }
}
