package c.l.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ludo.controller.MainActivity;

/* loaded from: classes.dex */
public final class cy extends WebViewClient {
    final /* synthetic */ Context a;
    final /* synthetic */ MainActivity b;

    public cy(MainActivity mainActivity, Context context) {
        this.b = mainActivity;
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str != null && str.startsWith("tg:")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                this.a.startActivity(intent);
                return true;
            } catch (Throwable th) {
            }
        }
        if (str != null) {
            return (str.startsWith("https://t.me/") || str.startsWith("https://telegram.me/")) ? false : true;
        }
        return true;
    }
}
