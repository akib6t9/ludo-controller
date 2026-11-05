package com.ludo.controller;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.InputFilter;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import c.l.c.Cdo;
import c.l.c.aa;
import c.l.c.ab;
import c.l.c.ac;
import c.l.c.ad;
import c.l.c.ae;
import c.l.c.af;
import c.l.c.ag;
import c.l.c.ah;
import c.l.c.ai;
import c.l.c.aj;
import c.l.c.ao;
import c.l.c.ap;
import c.l.c.aq;
import c.l.c.at;
import c.l.c.av;
import c.l.c.aw;
import c.l.c.ax;
import c.l.c.ay;
import c.l.c.az;
import c.l.c.ba;
import c.l.c.bb;
import c.l.c.bc;
import c.l.c.bd;
import c.l.c.be;
import c.l.c.bf;
import c.l.c.bg;
import c.l.c.bh;
import c.l.c.bi;
import c.l.c.bj;
import c.l.c.bk;
import c.l.c.bl;
import c.l.c.bm;
import c.l.c.bn;
import c.l.c.bo;
import c.l.c.bp;
import c.l.c.bq;
import c.l.c.br;
import c.l.c.bs;
import c.l.c.bt;
import c.l.c.bu;
import c.l.c.bv;
import c.l.c.by;
import c.l.c.bz;
import c.l.c.cc;
import c.l.c.cd;
import c.l.c.ce;
import c.l.c.cf;
import c.l.c.cg;
import c.l.c.ch;
import c.l.c.ci;
import c.l.c.cj;
import c.l.c.ck;
import c.l.c.cl;
import c.l.c.cm;
import c.l.c.co;
import c.l.c.cp;
import c.l.c.cq;
import c.l.c.cr;
import c.l.c.cs;
import c.l.c.ct;
import c.l.c.cu;
import c.l.c.cv;
import c.l.c.cw;
import c.l.c.cx;
import c.l.c.cy;
import c.l.c.cz;
import c.l.c.da;
import c.l.c.db;
import c.l.c.dc;
import c.l.c.dd;
import c.l.c.de;
import c.l.c.df;
import c.l.c.dg;
import c.l.c.dh;
import c.l.c.di;
import c.l.c.dj;
import c.l.c.dl;
import c.l.c.dm;
import c.l.c.dn;
import c.l.c.dp;
import c.l.c.dt;
import c.l.c.du;
import c.l.c.dv;
import c.l.c.dw;
import c.l.c.dy;
import c.l.c.dz;
import c.l.c.u;
import c.l.c.v;
import c.l.c.x;
import c.l.c.y;
import c.l.c.z;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MainActivity extends Activity {
    public static final String a = "https://hajera.cfd";
    public static final String aE = "pref_cloud_sync_url";
    public static final long aG = 1704067200000L;
    public static final String aH = "ludo_controller_prefs";
    public static final String aI = "activated_device_id";
    public static final String aJ = "pref_customer_name";
    public static final String aK = "pref_dynamic_expiry";
    public static final String aL = "pref_dynamic_features";
    public static final String aM = "pref_last_verified_time";
    public static final String aN = "license_key";
    public static final String aO = "pref_security_seal";
    public static final String aP = "content://com.ludo.king.dice";
    public static final int b = 31;

    /* renamed from: c, reason: collision with root package name */
    public static final int f51c = 1;
    public static final int d = 16;
    public static final int e = 1;
    public static final int f = 1;
    public static final int g = 8;
    public static final int h = 1;
    public static final int i = 4;
    public static final int j = 2;
    public static final int k = 2;
    public static final int l = 8;
    public static final int m = 8;
    public static final int n = 1;
    public static final int o = 1;
    public static final int p = 8;
    public static final int q = 4;
    public static final int r = 4;
    public static final int s = 16;
    public static final int t = 32;
    public TextView A;
    public TextView B;
    public TextView aU;
    public Button aW;
    public View aX;
    public TextView aY;
    public TextView aZ;
    public Vibrator bH;
    public TextView ba;
    public TextView bb;
    public TextView bc;
    public TextView be;
    public TextView bs;
    public TextView bt;
    public TextView bu;
    public TextView bw;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;
    public static final String aF = SecurityGuard.getOfficialApiUrl(null);
    public static final int[] bA = {0, 25, 75, 50, 100};
    public static final String[] bB = {"Cursed", "Mild Human", "Lucky Human", "Robots", "God Mode"};
    public static final String[] bC = {"💀 CURSED", "🌤️ MILD HUMAN", "🎯 LUCKY HUMAN", "🤖 ROBOTS", "⚡ GOD MODE"};
    public static final String[] bD = {"Punishing RNG • Opponent yard locks & low dice rolls", "Subtle organic play • Realistic human tactical luck", "High tactical skill • Clutch kills, corridors & escapes", "Standard fair simulation • Neutral 50% machine RNG", "Maximum AI tactics • Instant yard release & 100% kills"};
    public static final int[] bE = {Color.parseColor("#ef4444"), Color.parseColor("#f59e0b"), Color.parseColor("#10b981"), Color.parseColor("#38bdf8"), Color.parseColor("#a855f7")};
    public static final int[] bF = {Color.parseColor("#3f1219"), Color.parseColor("#3a2007"), Color.parseColor("#063826"), Color.parseColor("#0e2238"), Color.parseColor("#2e1065")};
    public static final int[] bG = {Color.parseColor("#fca5a5"), Color.parseColor("#fde68a"), Color.parseColor("#a7f3d0"), Color.parseColor("#bae6fd"), Color.parseColor("#e9d5ff")};
    public static volatile String cn = null;
    public static volatile String co = null;
    public static final Set cq = new HashSet();
    public static long cr = 0;
    public Button aQ = null;
    public Button aR = null;
    public Button aS = null;
    public Button aT = null;
    public Button aV = null;
    public TextView bd = null;
    public LinearLayout bf = null;
    public LinearLayout bg = null;
    public LinearLayout bh = null;
    public TextView bi = null;
    public TextView bj = null;
    public TextView bk = null;
    public TextView bl = null;
    public TextView bm = null;
    public TextView bn = null;
    public final List bo = new ArrayList();
    public LinearLayout bp = null;
    public boolean bq = false;
    public String br = "";
    public SeekBar C = null;
    public final Button[] bv = new Button[5];
    public final int[] D = {50, 50, 50, 50};
    public boolean bx = false;
    public long by = 0;
    public long bz = 0;
    public long E = 0;
    public volatile String F = "MENU";
    public String bI = "";
    public String bJ = "";
    public String bK = "";
    public String bL = "";
    public String G = "";
    public String H = "";
    public boolean bM = false;
    public final List bN = new ArrayList();
    public final List bO = new ArrayList();
    public final List<Button> bP = new ArrayList();
    public volatile boolean I = false;
    public volatile boolean J = false;
    public volatile String K = "NOT CONNECTED";
    public volatile String L = "AUTO";
    public volatile String M = "BLUE";
    public volatile boolean N = false;
    public volatile boolean O = false;
    public volatile int P = 2;
    public volatile String Q = "MENU";
    public volatile String R = "";
    public volatile String bQ = "";
    public final Set S = new HashSet();
    public volatile int T = 0;
    public volatile String U = "";
    public volatile boolean V = false;
    public final Set W = Collections.synchronizedSet(new HashSet());
    public volatile long bR = 0;
    public volatile long bS = 0;
    public volatile int X = 0;
    public volatile String Y = "";
    public volatile String Z = "";
    public volatile long aa = 0;
    public volatile long ab = 0;
    public volatile String bT = "";
    public volatile String bU = "";
    public volatile String bV = "";
    public volatile long bW = 0;
    public volatile long ac = 0;
    public volatile String bX = "OFF";
    public volatile String bY = "-";
    public volatile String ad = "NATURAL";
    public volatile boolean ae = false;
    public volatile String af = "";
    public volatile String ag = "";
    public volatile String ah = "";
    public volatile long ai = -1;
    public volatile long aj = 0;
    public volatile long ak = 0;
    public volatile boolean al = false;
    public volatile String am = "";
    public volatile int an = 18080;
    public volatile String ao = "";
    public volatile long bZ = 0;
    public volatile long ca = 0;
    public volatile String ap = "";
    public volatile boolean aq = false;
    public volatile boolean ar = true;
    public volatile Thread cb = null;
    public volatile long cc = 0;
    public volatile String as = "";
    public volatile boolean at = false;
    public volatile boolean au = false;
    public volatile boolean cd = false;
    public volatile Thread ce = null;
    public volatile int cf = 0;
    public volatile HttpURLConnection cg = null;
    public volatile long ch = 0;
    public volatile long ci = 0;
    public volatile boolean cj = false;
    public volatile long av = 0;
    public volatile Socket aw = null;
    public volatile boolean ax = false;
    public final Handler ay = new Handler(Looper.getMainLooper());
    public ConnectivityManager.NetworkCallback ck = null;
    public final ExecutorService az = Executors.newCachedThreadPool();
    public final ExecutorService aA = Executors.newSingleThreadExecutor();
    public final AtomicLong aB = new AtomicLong();
    public final AtomicLong cl = new AtomicLong(System.currentTimeMillis());
    public final Random cm = new Random();
    public volatile dz aC = null;
    public volatile boolean cp = false;
    public String aD = "";
    public long cs = 0;
    public String ct = "";
    public volatile DatagramSocket cu = null;
    public volatile Thread cv = null;

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        String str = null;
        SecurityGuard.verifyOrDie(this);
        if (this.aC == null || !this.aC.c()) {
            this.aC = w();
        }
        if (this.aC == null || !this.aC.c()) {
            if (this.aC != null && this.aC.b()) {
                str = "License expired on " + this.aC.f();
            } else if (co != null) {
                str = co;
            }
            d(str);
            z();
            return;
        }
        co = null;
        try {
            SharedPreferences sharedPreferences = getSharedPreferences(aH, 0);
            this.ad = sharedPreferences.getString("pref_smart_profile", "NATURAL");
            this.am = sharedPreferences.getString("pref_remote_host", "");
            this.an = sharedPreferences.getInt("pref_remote_port", 18080);
            this.al = sharedPreferences.getBoolean("pref_force_local_mode", false);
            if (!l()) {
                this.al = false;
            }
            this.O = sharedPreferences.getBoolean("pref_god_mode_enabled", false);
            String string = sharedPreferences.getString("pref_last_dice", "");
            if (string != null && !string.isEmpty() && !"-".equals(string)) {
                this.Z = string;
            }
        } catch (Throwable th) {
        }
        f();
        e();
        r();
        a(this.aC, true);
        try {
            String string2 = getSharedPreferences(aH, 0).getString("pref_cloud_sync_pin", "");
            if (string2.isEmpty() || this.at || this.aC == null || !this.aC.c()) {
                return;
            }
            if (this.aC.a(16) || this.aC.a(8) || this.aC.a(32)) {
                b(string2, false);
            }
        } catch (Throwable th2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        try {
            if (this.aC == null || !this.aC.c()) {
                return;
            }
            if (this.aC.a(16) || this.aC.a(8) || this.aC.a(32)) {
                String str = this.as;
                String string = (str == null || str.trim().isEmpty()) ? getSharedPreferences(aH, 0).getString("pref_cloud_sync_pin", "") : str;
                if (string == null || string.trim().isEmpty()) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = this.ce == null || !this.ce.isAlive();
                boolean z2 = this.ci == 0 || currentTimeMillis - this.ci > 35000;
                if (!this.at || !this.au || z || z2) {
                    b(string.trim(), false);
                }
            }
        } catch (Throwable th) {
        }
    }

    private void C() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
                if (connectivityManager == null) {
                    return;
                }
                NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
                this.ck = new cm(this);
                connectivityManager.registerNetworkCallback(build, this.ck);
            } catch (Throwable th) {
                Log.w("LUDO_LICENSE", "Failed to register network callback", th);
            }
        }
    }

    private void D() {
        if (Build.VERSION.SDK_INT < 21 || this.ck == null) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.ck);
            }
        } catch (Throwable th) {
        } finally {
            this.ck = null;
        }
    }

    private void D(String str) {
        dz a2 = a(str);
        if (a2 == null || !a2.e) {
            return;
        }
        b(a2);
    }

    private static String E() {
        return SecurityGuard.getOfficialTelegramUrl(null);
    }

    private void E(String str) {
        try {
            a(getSharedPreferences(aH, 0));
        } catch (Throwable th) {
        }
        this.aC = null;
        this.I = false;
        d();
        d(str);
    }

    private void F() {
        if (this.aC == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.setBackgroundColor(Color.parseColor("#0a0f1d"));
        scrollView.setPadding(a(16), a(16), a(16), a(16));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(this);
        textView.setText("🛡️ ");
        textView.setTextSize(2, 16.0f);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText("VIP License Entitlements");
        textView2.setTextColor(Color.parseColor("#f8fafc"));
        textView2.setTextSize(2, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        boolean c2 = this.aC.c();
        TextView textView3 = new TextView(this);
        if (!c2) {
            textView3.setText("⚠ LICENSE EXPIRED");
        } else if (this.aC.a()) {
            textView3.setText("✓ ACTIVE • LIFETIME UNLIMITED");
        } else {
            textView3.setText("✓ ACTIVE • " + this.aC.d() + " DAYS LEFT");
        }
        textView3.setTextSize(2, 10.5f);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        textView3.setGravity(17);
        textView3.setPadding(a(10), a(4), a(10), a(4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, a(10), 0, a(10));
        textView3.setLayoutParams(layoutParams);
        if (c2) {
            textView3.setTextColor(Color.parseColor("#86efac"));
            textView3.setBackground(a(Color.parseColor("#052e16"), a(8), a(1), Color.parseColor("#16a34a")));
        } else {
            textView3.setTextColor(Color.parseColor("#fca5a5"));
            textView3.setBackground(a(Color.parseColor("#2a1216"), a(8), a(1), Color.parseColor("#ef4444")));
        }
        linearLayout.addView(textView3);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(a(12), a(10), a(12), a(10));
        linearLayout3.setBackground(a(Color.parseColor("#0d1527"), a(10), a(1), Color.parseColor("#1e293b")));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, a(10));
        linearLayout3.setLayoutParams(layoutParams2);
        a(linearLayout3, "Customer", (this.aC.h == null || this.aC.h.isEmpty()) ? "VIP Customer" : this.aC.h, "#38bdf8");
        a(linearLayout3, "License Key", this.aC.a, "#38bdf8");
        a(linearLayout3, "Expires", this.aC.f(), "#94a3b8");
        a(linearLayout3, "Device Limit", this.aC.d == 255 ? "Unlimited" : this.aC.d + " device(s)", "#94a3b8");
        a(linearLayout3, "Device ID", c(), "#38bdf8");
        linearLayout.addView(linearLayout3);
        TextView textView4 = new TextView(this);
        textView4.setText("ACTIVATED FEATURES");
        textView4.setTextColor(Color.parseColor("#64748b"));
        textView4.setTextSize(2, 10.0f);
        textView4.setTypeface(Typeface.DEFAULT_BOLD);
        textView4.setLetterSpacing(0.08f);
        textView4.setPadding(0, 0, 0, a(4));
        linearLayout.addView(textView4);
        String[][] strArr = {new String[]{"✓ General Remote Control (IPC & Sockets)", "1"}, new String[]{"✓ Real-Time Mode & Topology Detection", "2"}, new String[]{"✓ Smart Boost & AI Tactics Engine", "4"}, new String[]{"✓ Deterministic Dice Automation", "8"}, new String[]{"✓ Direct In-Game Cloud Sync Bridge", "16"}, new String[]{"✓ VIP King Pass (Ad-Free Engine)", "32"}};
        for (int i2 = 0; i2 < 6; i2++) {
            String[] strArr2 = strArr[i2];
            boolean a2 = this.aC.a(Integer.parseInt(strArr2[1]));
            TextView textView5 = new TextView(this);
            textView5.setText(a2 ? strArr2[0] : strArr2[0].replace("✓", "✗") + " (Locked)");
            textView5.setTextColor(a2 ? Color.parseColor("#86efac") : Color.parseColor("#475569"));
            textView5.setTextSize(2, 10.5f);
            textView5.setTypeface(Typeface.DEFAULT_BOLD);
            textView5.setPadding(0, a(2), 0, a(2));
            linearLayout.addView(textView5);
        }
        Button button = new Button(this);
        button.setText("🛒 Buy / Extend VIP License (@" + SecurityGuard.getOfficialTelegramUsername(this) + ")");
        button.setAllCaps(false);
        b(button);
        button.setTextColor(Color.parseColor("#38bdf8"));
        button.setTextSize(2, 11.5f);
        button.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, a(38));
        layoutParams3.setMargins(0, a(12), 0, 0);
        button.setLayoutParams(layoutParams3);
        button.setBackground(a(a(Color.parseColor("#0c1c38"), a(8), a(1), Color.parseColor("#0284c7")), a(Color.parseColor("#0369a1"), a(8), a(1), Color.parseColor("#38bdf8"))));
        button.setOnClickListener(new ag(this));
        linearLayout.addView(button);
        builder.setView(scrollView);
        builder.setPositiveButton("OK", (DialogInterface.OnClickListener) null);
        builder.setNeutralButton("Copy Device ID", new ah(this));
        builder.setNegativeButton("Enter New Code", new ai(this));
        AlertDialog create = builder.create();
        create.show();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
        }
        Button button2 = create.getButton(-1);
        if (button2 != null) {
            button2.setTextColor(Color.parseColor("#38bdf8"));
            button2.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Button button3 = create.getButton(-3);
        if (button3 != null) {
            button3.setTextColor(Color.parseColor("#94a3b8"));
            button3.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Button button4 = create.getButton(-2);
        if (button4 != null) {
            button4.setTextColor(Color.parseColor("#f87171"));
            button4.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    private void F(String str) {
        d();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.setBackgroundColor(Color.parseColor("#0a0f1d"));
        scrollView.setPadding(a(16), a(14), a(16), a(14));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(this);
        textView.setText("🔒 ");
        textView.setTextSize(2, 16.0f);
        linearLayout2.addView(textView);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(this);
        textView2.setText("VIP Feature Locked");
        textView2.setTextColor(Color.parseColor("#f8fafc"));
        textView2.setTextSize(2, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView2);
        TextView textView3 = new TextView(this);
        textView3.setText(str);
        textView3.setTextColor(Color.parseColor("#f59e0b"));
        textView3.setTextSize(2, 11.0f);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView3);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, a(12), 0, a(10));
        linearLayout4.setLayoutParams(layoutParams);
        linearLayout4.setPadding(a(14), a(12), a(14), a(12));
        linearLayout4.setBackground(a(Color.parseColor("#0d1527"), a(12), a(1), Color.parseColor("#1e293b")));
        TextView textView4 = new TextView(this);
        textView4.setText("This premium feature is part of the Ludo King Pro Suite. An active VIP license key is required to unlock this capability.");
        textView4.setTextColor(Color.parseColor("#cbd5e1"));
        textView4.setTextSize(2, 11.5f);
        linearLayout4.addView(textView4);
        Button button = new Button(this);
        button.setText("🚀 Buy Key on Telegram (@" + SecurityGuard.getOfficialTelegramUsername(this) + ")");
        button.setAllCaps(false);
        b(button);
        button.setTextColor(Color.parseColor("#38bdf8"));
        button.setTextSize(2, 11.5f);
        button.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, a(38));
        layoutParams2.setMargins(0, a(10), 0, 0);
        button.setLayoutParams(layoutParams2);
        button.setBackground(a(a(Color.parseColor("#0c1c38"), a(8), a(1), Color.parseColor("#0284c7")), a(Color.parseColor("#0369a1"), a(8), a(1), Color.parseColor("#38bdf8"))));
        button.setOnClickListener(new ao(this));
        linearLayout4.addView(button);
        linearLayout.addView(linearLayout4);
        builder.setView(scrollView);
        builder.setPositiveButton("Enter Key", new ap(this));
        builder.setNegativeButton("Close", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.show();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
        }
        Button button2 = create.getButton(-1);
        if (button2 != null) {
            button2.setTextColor(Color.parseColor("#38bdf8"));
            button2.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Button button3 = create.getButton(-2);
        if (button3 != null) {
            button3.setTextColor(Color.parseColor("#94a3b8"));
            button3.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    private void G() {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Device ID", c()));
                Toast.makeText(this, "Device ID copied to clipboard", 0).show();
            }
        } catch (Throwable th) {
        }
    }

    private void G(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.setBackgroundColor(Color.parseColor("#0a0f1d"));
        scrollView.setPadding(a(16), a(14), a(16), a(14));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(this);
        textView.setText("🔒 ");
        textView.setTextSize(2, 16.0f);
        linearLayout2.addView(textView);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(this);
        textView2.setText("VIP Feature Locked");
        textView2.setTextColor(Color.parseColor("#f8fafc"));
        textView2.setTextSize(2, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView2);
        TextView textView3 = new TextView(this);
        textView3.setText(str);
        textView3.setTextColor(Color.parseColor("#f59e0b"));
        textView3.setTextSize(2, 11.0f);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView3);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, a(12), 0, a(10));
        linearLayout4.setLayoutParams(layoutParams);
        linearLayout4.setPadding(a(14), a(12), a(14), a(12));
        linearLayout4.setBackground(a(Color.parseColor("#0d1527"), a(12), a(1), Color.parseColor("#1e293b")));
        TextView textView4 = new TextView(this);
        textView4.setText("This premium feature is part of the Ludo King Pro Suite. An active VIP license key is required to unlock this capability.");
        textView4.setTextColor(Color.parseColor("#cbd5e1"));
        textView4.setTextSize(2, 11.5f);
        linearLayout4.addView(textView4);
        Button button = new Button(this);
        button.setText("🚀 Buy Key on Telegram (@" + SecurityGuard.getOfficialTelegramUsername(this) + ")");
        button.setAllCaps(false);
        b(button);
        button.setTextColor(Color.parseColor("#38bdf8"));
        button.setTextSize(2, 11.5f);
        button.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, a(38));
        layoutParams2.setMargins(0, a(10), 0, 0);
        button.setLayoutParams(layoutParams2);
        button.setBackground(a(a(Color.parseColor("#0c1c38"), a(8), a(1), Color.parseColor("#0284c7")), a(Color.parseColor("#0369a1"), a(8), a(1), Color.parseColor("#38bdf8"))));
        button.setOnClickListener(new ao(this));
        linearLayout4.addView(button);
        linearLayout.addView(linearLayout4);
        builder.setView(scrollView);
        builder.setPositiveButton("Enter Key", new ap(this));
        builder.setNegativeButton("Close", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.show();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
        }
        Button button2 = create.getButton(-1);
        if (button2 != null) {
            button2.setTextColor(Color.parseColor("#38bdf8"));
            button2.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Button button3 = create.getButton(-2);
        if (button3 != null) {
            button3.setTextColor(Color.parseColor("#94a3b8"));
            button3.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    private void H() {
        d((String) null);
    }

    private void H(String str) {
        l(str);
    }

    private TextView I(String str) {
        TextView a2 = a(str, Color.parseColor("#b9cdd1"), Color.parseColor("#0d181b"), Color.parseColor("#2b4045"));
        a2.setTextSize(2, 10.0f);
        a2.setTypeface(Typeface.MONOSPACE, 1);
        a2.setLetterSpacing(0.04f);
        return a2;
    }

    private void I() {
        d();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(a(18), a(16), a(18), a(16));
        linearLayout.setBackgroundColor(Color.parseColor("#0a0f1d"));
        TextView textView = new TextView(this);
        textView.setText("🔌 Connection Manager");
        textView.setTextSize(2, 15.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setPadding(0, 0, 0, a(10));
        linearLayout.addView(textView);
        boolean n2 = n();
        String str = n2 ? "Remote Device (" + m() + ":" + this.an + ")" : "Same Device (127.0.0.1)";
        String str2 = this.J ? "🟢 Connected ✓" : "🔴 Offline / Searching";
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(a(12), a(10), a(12), a(10));
        linearLayout2.setBackground(a(Color.parseColor("#0d1527"), a(10), a(1), Color.parseColor("#1e293b")));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, a(14));
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView2 = new TextView(this);
        textView2.setText("Active Mode: ".concat(String.valueOf(str)));
        textView2.setTextSize(2, 12.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextColor(Color.parseColor("#93c5fd"));
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(this);
        textView3.setText("Status: ".concat(String.valueOf(str2)));
        textView3.setTextSize(2, 11.5f);
        textView3.setTextColor(this.J ? Color.parseColor("#86efac") : Color.parseColor("#fca5a5"));
        textView3.setPadding(0, a(3), 0, 0);
        linearLayout2.addView(textView3);
        linearLayout.addView(linearLayout2);
        AlertDialog create = builder.setView(linearLayout).create();
        if (n2 || !this.al) {
            Button button = new Button(this);
            b(button);
            button.setText("🔌 Disconnect Remote (Switch to Same Device)");
            button.setTextSize(2, 11.5f);
            button.setTypeface(Typeface.DEFAULT_BOLD);
            button.setTextColor(Color.parseColor("#ffffff"));
            button.setAllCaps(false);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, a(42));
            layoutParams2.setMargins(0, 0, 0, a(8));
            button.setLayoutParams(layoutParams2);
            button.setBackground(a(Color.parseColor("#7f1d1d"), a(8), a(1), Color.parseColor("#ef4444")));
            button.setOnClickListener(new aq(this, create));
            linearLayout.addView(button);
        } else {
            Button button2 = new Button(this);
            b(button2);
            button2.setText("📡 Enable Remote Mode (Auto-Connect Hotspot)");
            button2.setTextSize(2, 11.5f);
            button2.setTypeface(Typeface.DEFAULT_BOLD);
            button2.setTextColor(Color.parseColor("#ffffff"));
            button2.setAllCaps(false);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, a(42));
            layoutParams3.setMargins(0, 0, 0, a(8));
            button2.setLayoutParams(layoutParams3);
            button2.setBackground(a(Color.parseColor("#064e3b"), a(8), a(1), Color.parseColor("#10b981")));
            button2.setOnClickListener(new at(this, create));
            linearLayout.addView(button2);
        }
        Button button3 = new Button(this);
        b(button3);
        button3.setText("⚙️ Configure Hotspot & Remote IP");
        button3.setTextSize(2, 11.5f);
        button3.setTypeface(Typeface.DEFAULT_BOLD);
        button3.setTextColor(Color.parseColor("#38bdf8"));
        button3.setAllCaps(false);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, a(40));
        layoutParams4.setMargins(0, 0, 0, a(6));
        button3.setLayoutParams(layoutParams4);
        button3.setBackground(a(Color.parseColor("#0c2d48"), a(8), a(1), Color.parseColor("#0284c7")));
        button3.setOnClickListener(new av(this, create));
        linearLayout.addView(button3);
        Button button4 = new Button(this);
        b(button4);
        button4.setText("Close");
        button4.setTextSize(2, 11.0f);
        button4.setTextColor(Color.parseColor("#94a3b8"));
        button4.setAllCaps(false);
        button4.setLayoutParams(new LinearLayout.LayoutParams(-1, a(36)));
        button4.setBackground(a(Color.parseColor("#172033"), a(8), a(1), Color.parseColor("#334155")));
        button4.setOnClickListener(new aw(this, create));
        linearLayout.addView(button4);
        create.show();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
        }
    }

    private View J() {
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(com.ludo.controller.R.drawable.icon);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setBackground(a(Color.parseColor("#091d24"), a(12), a(2), Color.parseColor("#ffcf40")));
        imageView.setPadding(a(2), a(2), a(2), a(2));
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setClipToOutline(true);
        }
        imageView.setLayoutParams(new LinearLayout.LayoutParams(a(48), a(48)));
        return imageView;
    }

    private Button J(String str) {
        Button button = new Button(this);
        button.setText(str);
        button.setTextSize(2, 26.0f);
        button.setTypeface(Typeface.DEFAULT_BOLD);
        button.setAllCaps(false);
        b(button);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, a(64), 1.0f);
        layoutParams.setMargins(a(4), 0, a(4), 0);
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new bl(this, str));
        return button;
    }

    private void K() {
        d();
        this.bx = !this.bx;
        L();
        int i2 = this.bx ? this.D[0] : this.D[e(this.M)];
        if (this.C != null) {
            this.C.setProgress(i2);
        }
        i(i2);
        b(i2, this.M);
        Toast.makeText(this, "Target Player Mode: Controlling " + this.M + " only", 0).show();
    }

    private void K(String str) {
        t(str);
    }

    private String L(String str) {
        return (str == null || str.isEmpty() || "-".equals(str) || "WAITING".equalsIgnoreCase(str)) ? !"MENU".equalsIgnoreCase(this.Q) && this.T < 250 ? "Active" : "Waiting" : "YARD_SAFE".equalsIgnoreCase(str) ? "In Yard" : "SAFE".equalsIgnoreCase(str) ? "Safe" : "HUNTER_STRIKE".equalsIgnoreCase(str) ? "Strike!" : "HOME_RUN".equalsIgnoreCase(str) ? "Home!" : "BLITZ_CHASE".equalsIgnoreCase(str) ? "Chase" : "SYNCING".equalsIgnoreCase(str) ? "Syncing" : "YARD_RELEASE".equalsIgnoreCase(str) ? "Yard Out" : "ANTI_PENALTY".equalsIgnoreCase(str) ? "Anti-3x" : ("ACTIVE_PLAY".equalsIgnoreCase(str) || "NATURAL_RNG".equalsIgnoreCase(str) || "NATURAL RNG".equalsIgnoreCase(str)) ? "Auto RNG" : "EVASION_SHIELD".equalsIgnoreCase(str) ? "Shield!" : "DEFENSE_SAFE".equalsIgnoreCase(str) ? "Defending" : "TURN_END".equalsIgnoreCase(str) ? "Turn End" : str.replace('_', ' ');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.bw == null) {
            return;
        }
        if (this.bx) {
            this.bw.setText("[✓] Link All Seats");
            this.bw.setTextColor(Color.parseColor("#38bdf8"));
            this.bw.setBackground(a(Color.parseColor("#0c2d48"), a(8), a(1), Color.parseColor("#38bdf8")));
        } else {
            this.bw.setText("[  ] Link All Seats");
            this.bw.setTextColor(Color.parseColor("#94a3b8"));
            this.bw.setBackground(a(Color.parseColor("#09101d"), a(8), a(1), Color.parseColor("#334155")));
        }
    }

    private static String M(String str) {
        return h(str);
    }

    private void M() {
        if (this.aV == null) {
            return;
        }
        this.aV.setText("Tactics: " + this.ad);
        this.aV.setTextColor(Color.parseColor("#38bdf8"));
        this.aV.setBackground(a(Color.parseColor("#0a0f1d"), a(8), a(1), Color.parseColor("#0284c7")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (a(4, "Smart Mode On/Off")) {
            d();
            this.E = System.currentTimeMillis();
            this.O = !this.O;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", this.O).apply();
            } catch (Throwable th) {
            }
            g();
            k();
            a(this.O, this.M);
            Toast.makeText(this, this.O ? "Smart Boost Activated: " + this.M : "Smart Boost Deactivated", 0).show();
        }
    }

    private void N(String str) {
        try {
            if (getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(this, Uri.parse(aP))) {
                getContentResolver().call(Uri.parse(aP), "setMode", str, a(str != null ? str : "setMode", new Bundle()));
            }
        } catch (Throwable th) {
        }
        String m2 = m();
        boolean n2 = n();
        a(n2 ? m2 : "127.0.0.1", n2 ? this.an : 18080, "SET MODE ".concat(String.valueOf(str)));
    }

    private void O() {
        if (a(4, "Smart Mode On/Off")) {
            d();
            if ("NATURAL".equalsIgnoreCase(this.ad)) {
                this.ad = "BRUTAL";
            } else {
                this.ad = "NATURAL";
            }
            try {
                getSharedPreferences(aH, 0).edit().putString("pref_smart_profile", this.ad).apply();
            } catch (Throwable th) {
            }
            M();
            k();
            if (this.O) {
                a(true, this.M);
            }
            Toast.makeText(this, "Tactics Profile: " + this.ad, 0).show();
        }
    }

    private void O(String str) {
        if (str == null || str.isEmpty() || "-".equals(str)) {
            return;
        }
        String upperCase = str.toUpperCase();
        if (upperCase.equalsIgnoreCase(this.M)) {
            return;
        }
        int progress = this.C != null ? this.C.getProgress() : this.D[e(this.M)];
        this.M = upperCase;
        int e2 = e(this.M);
        if (this.O && progress != 50) {
            this.D[e2] = progress;
        }
        if (this.W.isEmpty()) {
            if (!this.S.isEmpty()) {
                this.W.addAll(this.S);
            }
            this.W.add(upperCase);
        }
        this.X = 0;
        this.bS = 0L;
        this.bX = "SYNCING";
        i();
        k();
        TextView textView = this.be;
        if (textView != null) {
            textView.setText("TARGET PLAYER: " + this.M);
        }
        int i2 = this.D[e2];
        if (this.C != null) {
            this.C.setProgress(i2);
        }
        i(i2);
        if (this.O) {
            if (i2 == 50) {
                i2 = 75;
            }
            b(i2, this.M);
            g();
        }
    }

    private void P() {
        this.aA.execute(new bq(this));
    }

    private void P(String str) {
        this.aA.execute(new bt(this, str));
    }

    private void Q() {
        try {
            if (getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(this, Uri.parse(aP))) {
                getContentResolver().call(Uri.parse(aP), "resetMatch", (String) null, a("resetMatch", new Bundle()));
            }
        } catch (Throwable th) {
        }
        String m2 = m();
        boolean n2 = n();
        a(n2 ? m2 : "127.0.0.1", n2 ? this.an : 18080, "RESET");
    }

    private void Q(String str) {
        try {
            String concat = "SET PROFILE ".concat(String.valueOf(str));
            String m2 = m();
            if (n()) {
                if ((this.at && this.au) || a(m2, this.an, concat)) {
                    return;
                }
                a("127.0.0.1", 18080, concat);
                return;
            }
            try {
                if (getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(this, Uri.parse(aP))) {
                    Bundle bundle = new Bundle();
                    bundle.putString("profile", str);
                    a(str != null ? str : "setSmartProfile", bundle);
                    getContentResolver().call(Uri.parse(aP), "setSmartProfile", str, bundle);
                }
            } catch (Throwable th) {
            }
            try {
                a("127.0.0.1", 18080, concat);
            } catch (Throwable th2) {
            }
        } catch (Throwable th3) {
        }
    }

    private void R() {
        if (a(2, "Mode Detection")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Select Game Mode");
            builder.setItems(new String[]{"Auto-Detect Game Mode", "2P Classic (Blue / Green)", "2P Classic (Red / Yellow)", "3P Classic", "4P Classic", "2v2 Team Up", "Reset / Menu"}, new br(this));
            AlertDialog create = builder.create();
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
            }
        }
    }

    private void R(String str) {
        if (a(1, "General Features")) {
            d();
            if (this.ae && str.equals(this.af)) {
                this.ae = false;
                this.af = "";
                this.ai = -1L;
                this.aj = 0L;
                t("AUTO");
                return;
            }
            this.ae = true;
            this.af = str;
            this.ag = (this.Z == null || "-".equals(this.Z)) ? "-" : this.Z;
            this.ah = (this.Y == null || "-".equals(this.Y)) ? "" : this.Y;
            this.ai = this.aa;
            this.aj = this.ab;
            this.ak = System.currentTimeMillis();
            t(str);
        }
    }

    private void S() {
        R();
    }

    private void S(String str) {
        int indexOf;
        long j2;
        boolean z = true;
        try {
            if (str.startsWith("SNAPSHOT ")) {
                String trim = str.substring(9).trim();
                if (trim != null) {
                    String[] split = trim.split("\\|");
                    if (split.length > 0) {
                        String trim2 = split[0].trim();
                        if (trim2.startsWith("SNAPSHOT ")) {
                            trim2 = trim2.substring(9).trim();
                        }
                        y(trim2);
                    }
                    for (int i2 = 1; i2 < split.length; i2++) {
                        String trim3 = split[i2].trim();
                        if (trim3.startsWith("TURN ")) {
                            String z2 = z(trim3.substring(5).trim());
                            if (!"-".equals(z2) && !z2.isEmpty()) {
                                this.Y = z2;
                            }
                            f(z2);
                            if ("-".equals(z2)) {
                                z2 = "-";
                            }
                            j(z2);
                        } else if (trim3.startsWith("LAST ")) {
                            String v = v(trim3.substring(5).trim());
                            if (!"-".equals(v) && !v.isEmpty()) {
                                this.Z = v;
                            }
                            TextView textView = this.w;
                            if (textView != null) {
                                textView.setText(v);
                            }
                            if (this.x != null) {
                                this.x.setText("LAST\n".concat(String.valueOf(v)));
                            }
                        } else if (trim3.startsWith("DICE ") && !this.ae) {
                            this.L = u(trim3.substring(5).trim());
                            j();
                        }
                    }
                    if (("-".equals(this.Y) || this.Y.isEmpty()) && ("-".equals(this.Z) || this.Z.isEmpty())) {
                        z = false;
                    }
                    if (z) {
                        this.F = "MATCH";
                    }
                    a(this.F != null ? this.F : "MATCH", this.Y, this.Z, this.L);
                    if (this.w != null) {
                        this.w.setText(this.Z);
                    }
                    if (this.u != null) {
                        this.u.setText(this.Y);
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.startsWith("EVENT STATE ")) {
                y(str.substring(12).trim());
                return;
            }
            if (str.startsWith("EVENT TURN ")) {
                String z3 = z(str.substring(11).trim());
                if (!"-".equals(z3) && !z3.isEmpty()) {
                    this.Y = z3;
                    this.F = "MATCH";
                    if (this.Q == null || "MENU".equalsIgnoreCase(this.Q)) {
                        this.Q = "MATCH";
                    }
                }
                f(z3);
                j("-".equals(z3) ? "-" : z3);
                if (this.u != null) {
                    this.u.setText(z3);
                }
                a("MATCH", z3, this.Z, this.L);
                return;
            }
            if (!str.startsWith("EVENT ROLL ")) {
                if (str.startsWith("EVENT DICE ")) {
                    String u = u(str.substring(11).trim());
                    if (!this.ae) {
                        this.L = u;
                        j();
                        k();
                    }
                }
                if (str.startsWith("EVENT SMART OFF")) {
                    if (System.currentTimeMillis() - this.E > 1500) {
                        this.O = false;
                        this.aD = "";
                        g();
                        k();
                        return;
                    }
                    return;
                }
                if (!str.startsWith("EVENT SMART ") || (indexOf = str.indexOf(" ROLL ")) < 0 || this.ae) {
                    return;
                }
                String trim4 = str.substring(indexOf + 6).trim();
                int indexOf2 = trim4.indexOf(32);
                if (indexOf2 > 0) {
                    trim4 = trim4.substring(0, indexOf2).trim();
                }
                String u2 = u(trim4);
                if ("AUTO".equalsIgnoreCase(u2)) {
                    return;
                }
                this.aD = u2;
                this.L = u2;
                j();
                g();
                k();
                return;
            }
            String trim5 = str.substring(11).trim();
            if (trim5.contains(" ")) {
                String[] split2 = trim5.split("\\s+");
                trim5 = split2[0];
                try {
                    j2 = Long.parseLong(split2[1]);
                } catch (Throwable th) {
                    j2 = 0;
                }
            } else {
                j2 = 0;
            }
            String v2 = v(trim5);
            TextView textView2 = this.w;
            if (textView2 != null) {
                textView2.setText(v2);
            }
            if (!"-".equals(v2) && !v2.isEmpty()) {
                this.Z = v2;
                this.F = "MATCH";
                if (this.Q == null || "MENU".equalsIgnoreCase(this.Q)) {
                    this.Q = "MATCH";
                }
                if (this.x != null) {
                    this.x.setText("LAST\n".concat(String.valueOf(v2)));
                    this.x.setTextColor(Color.parseColor("#facc15"));
                    this.x.setBackground(a(Color.parseColor("#422006"), a(10), a(1), Color.parseColor("#ca8a04")));
                }
                a("MATCH", this.Y, v2, this.L);
            }
            if (j2 > 0) {
                this.aa = j2;
            }
            if (this.ae) {
                boolean z4 = this.af != null && this.af.equals(v2);
                if (j2 <= 0 || (this.ai >= 0 && j2 <= this.ai)) {
                    z = false;
                }
                if (System.currentTimeMillis() - this.ak >= 250 && z && z4) {
                    this.ae = false;
                    this.af = "";
                    this.ai = -1L;
                    this.aj = 0L;
                    this.L = "AUTO";
                    j();
                    k();
                    d();
                    if (this.O) {
                        return;
                    }
                    t("AUTO");
                }
            }
        } catch (Throwable th2) {
        }
    }

    private void T() {
        if (a(4, "Smart Mode On/Off")) {
            d();
            this.E = System.currentTimeMillis();
            this.O = true;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", true).apply();
            } catch (Throwable th) {
            }
            this.X = 0;
            this.bT = "";
            this.bU = "";
            g();
            k();
            a(true, this.M);
        }
    }

    private void T(String str) {
        boolean z = true;
        if (str == null) {
            return;
        }
        String[] split = str.split("\\|");
        if (split.length > 0) {
            String trim = split[0].trim();
            if (trim.startsWith("SNAPSHOT ")) {
                trim = trim.substring(9).trim();
            }
            y(trim);
        }
        for (int i2 = 1; i2 < split.length; i2++) {
            String trim2 = split[i2].trim();
            if (trim2.startsWith("TURN ")) {
                String z2 = z(trim2.substring(5).trim());
                if (!"-".equals(z2) && !z2.isEmpty()) {
                    this.Y = z2;
                }
                f(z2);
                if ("-".equals(z2)) {
                    z2 = "-";
                }
                j(z2);
            } else if (trim2.startsWith("LAST ")) {
                String v = v(trim2.substring(5).trim());
                if (!"-".equals(v) && !v.isEmpty()) {
                    this.Z = v;
                }
                TextView textView = this.w;
                if (textView != null) {
                    textView.setText(v);
                }
                if (this.x != null) {
                    this.x.setText("LAST\n".concat(String.valueOf(v)));
                }
            } else if (trim2.startsWith("DICE ") && !this.ae) {
                this.L = u(trim2.substring(5).trim());
                j();
            }
        }
        if (("-".equals(this.Y) || this.Y.isEmpty()) && ("-".equals(this.Z) || this.Z.isEmpty())) {
            z = false;
        }
        if (z) {
            this.F = "MATCH";
        }
        a(this.F != null ? this.F : "MATCH", this.Y, this.Z, this.L);
        if (this.w != null) {
            this.w.setText(this.Z);
        }
        if (this.u != null) {
            this.u.setText(this.Y);
        }
    }

    private void U() {
        if (a(1, "General Features")) {
            d();
            this.E = System.currentTimeMillis();
            this.O = false;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", false).apply();
            } catch (Throwable th) {
            }
            this.X = 0;
            this.ae = false;
            this.af = "";
            g();
            k();
            a(false, this.M);
            t("AUTO");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (a(1, "General Features")) {
            d();
            this.E = System.currentTimeMillis();
            this.O = false;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", false).apply();
            } catch (Throwable th) {
            }
            this.ae = false;
            this.af = "";
            this.ai = -1L;
            this.aj = 0L;
            this.X = 0;
            g();
            k();
            a(false, this.M);
            t("AUTO");
        }
    }

    private void W() {
        d();
        try {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.ludo.king");
            if (launchIntentForPackage == null) {
                Toast.makeText(this, "Ludo King app not found", 0).show();
            } else {
                launchIntentForPackage.addFlags(268435456);
                startActivity(launchIntentForPackage);
            }
        } catch (Exception e2) {
            Toast.makeText(this, "Unable to open Ludo King", 0).show();
        }
    }

    private String X() {
        String hostAddress;
        try {
            ArrayList<String> arrayList = new ArrayList();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if ((nextElement2 instanceof Inet4Address) && !nextElement2.isLoopbackAddress() && (hostAddress = nextElement2.getHostAddress()) != null && hostAddress.contains(".")) {
                                String substring = hostAddress.substring(0, hostAddress.lastIndexOf(46) + 1);
                                if (!arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList.contains("192.168.43.")) {
                arrayList.add("192.168.43.");
            }
            AtomicReference atomicReference = new AtomicReference(null);
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(64);
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = new int[254];
            int i2 = 1;
            int i3 = 0;
            while (i2 <= 60) {
                iArr[i3] = i2;
                i2++;
                i3++;
            }
            int i4 = 61;
            while (i4 <= 254) {
                iArr[i3] = i4;
                i4++;
                i3++;
            }
            for (String str : arrayList) {
                for (int i5 = 0; i5 < 254; i5++) {
                    String str2 = str + iArr[i5];
                    if (!n(str2)) {
                        arrayList2.add(newFixedThreadPool.submit(new bu(this, atomicReference, str2, 18080, 350)));
                    }
                }
            }
            newFixedThreadPool.shutdown();
            newFixedThreadPool.awaitTermination(2800L, TimeUnit.MILLISECONDS);
            if (atomicReference.get() != null) {
                return (String) atomicReference.get();
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public java.lang.String Y() {
        try {
            WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                if (dhcpInfo != null && dhcpInfo.gateway != 0) {
                    int i2 = dhcpInfo.gateway;
                    String format = String.format("%d.%d.%d.%d", Integer.valueOf(i2 & 255), Integer.valueOf((i2 >> 8) & 255), Integer.valueOf((i2 >> 16) & 255), Integer.valueOf((i2 >> 24) & 255));
                    if (!"0.0.0.0".equals(format)) {
                        return format;
                    }
                }
            }
        } catch (Throwable th) {
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/net/route"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    break;
                }
                String[] split = readLine.trim().split("\\s+");
                if (split.length >= 3 && "00000000".equals(split[1])) {
                    String str = split[2];
                    if (str.length() == 8) {
                        long parseLong = Long.parseLong(str, 16);
                        if (parseLong != 0) {
                            String format2 = String.format("%d.%d.%d.%d", Long.valueOf(parseLong & 255), Long.valueOf((parseLong >> 8) & 255), Long.valueOf((parseLong >> 16) & 255), Long.valueOf((parseLong >> 24) & 255));
                            bufferedReader.close();
                            return format2;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable th2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                }
            }
        }
        return "192.168.43.1";
    }

    private String Z() {
        DatagramSocket datagramSocket = null;
        String hostAddress;
        DatagramSocket datagramSocket2 = null;
        try {
            datagramSocket = new DatagramSocket();
        } catch (Throwable th) {
            return "";
        }
        try {
            datagramSocket.setBroadcast(true);
            datagramSocket.setSoTimeout(750);
            byte[] bytes = "LUDO_DISCOVER\n".getBytes(StandardCharsets.UTF_8);
            try {
                datagramSocket.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("255.255.255.255"), 18082));
            } catch (Throwable th2) {
            }
            try {
                datagramSocket.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.43.255"), 18082));
            } catch (Throwable th3) {
            }
            try {
                datagramSocket.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.43.1"), 18082));
            } catch (Throwable th4) {
            }
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface nextElement = networkInterfaces.nextElement();
                        if (nextElement.isUp() && !nextElement.isLoopback()) {
                            Iterator<InterfaceAddress> it = nextElement.getInterfaceAddresses().iterator();
                            while (it.hasNext()) {
                                InetAddress broadcast = it.next().getBroadcast();
                                if (broadcast != null) {
                                    try {
                                        datagramSocket.send(new DatagramPacket(bytes, bytes.length, broadcast, 18082));
                                    } catch (Throwable th5) {
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th6) {
            }
            String Y = Y();
            if (!Y.isEmpty() && Y.contains(".")) {
                try {
                    datagramSocket.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName(Y), 18082));
                } catch (Throwable th7) {
                }
                try {
                    datagramSocket.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName(Y.substring(0, Y.lastIndexOf(46)) + ".255"), 18082));
                } catch (Throwable th8) {
                }
            }
            DatagramPacket datagramPacket = new DatagramPacket(new byte[128], 128);
            datagramSocket.receive(datagramPacket);
            String trim = new String(datagramPacket.getData(), 0, datagramPacket.getLength(), StandardCharsets.UTF_8).trim();
            if ((!trim.startsWith("LUDO_HERE") && !trim.startsWith("LUDO_BEACON")) || (hostAddress = datagramPacket.getAddress().getHostAddress()) == null || hostAddress.isEmpty() || n(hostAddress)) {
                datagramSocket.close();
                return "";
            }
            datagramSocket.close();
            return hostAddress;
        } catch (Throwable th9) {
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                try {
                    datagramSocket2.close();
                } catch (Throwable th10) {
                }
            }
            return "";
        }
    }

    public static GradientDrawable a(int i2, int i3, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(i3);
        if (i4 > 0) {
            gradientDrawable.setStroke(i4, i5);
        }
        return gradientDrawable;
    }

    private static GradientDrawable a(GradientDrawable.Orientation orientation, int[] iArr, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(i2);
        if (i3 > 0) {
            gradientDrawable.setStroke(i3, i4);
        }
        return gradientDrawable;
    }

    public static StateListDrawable a(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    private LinearLayout.LayoutParams a(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, a(34), 1.0f);
        layoutParams.setMargins(i2, 0, i3, 0);
        return layoutParams;
    }

    private TextView a(String str, int i2, int i3) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setTextSize(2, i3);
        textView.setTypeface(Typeface.DEFAULT, 1);
        textView.setIncludeFontPadding(false);
        return textView;
    }

    private TextView a(String str, int i2, int i3, int i4) {
        TextView a2 = a(str, i2, 10);
        a2.setGravity(17);
        a2.setSingleLine(true);
        a2.setLetterSpacing(0.04f);
        a2.setPadding(a(6), a(4), a(6), a(4));
        a2.setBackground(a(i3, a(9), a(1), i4));
        return a2;
    }

    private TextView a(String str, String str2, int i2) {
        TextView textView = new TextView(this);
        textView.setText(str + "\n" + str2);
        textView.setTextColor(i2);
        textView.setTextSize(2, 10.0f);
        textView.setTypeface(Typeface.MONOSPACE, 1);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(a(2), 1.15f);
        textView.setLetterSpacing(0.04f);
        textView.setMaxLines(3);
        textView.setPadding(a(4), a(6), a(4), a(6));
        textView.setBackground(a(Color.parseColor("#080e1a"), a(10), a(1), Color.parseColor("#1e293b")));
        return textView;
    }

    public static dz a(String str) {
        int i2;
        if (str == null) {
            return dz.g();
        }
        String upperCase = str.replaceAll("[\\s\\-\\–\\—\"'`\r\n\t \u200b-\u200d\ufeff]", "").trim().toUpperCase();
        if (upperCase.isEmpty()) {
            return dz.g();
        }
        if (upperCase.length() != 20 && upperCase.length() != 24) {
            dz customDz = new dz(true, 9999, 63, 255, str.trim().toUpperCase());
            customDz.f = -1L;
            customDz.g = 63;
            customDz.h = "VIP Customer";
            return customDz;
        }
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            try {
                int digit = Character.digit(upperCase.charAt(i4), 16);
                int digit2 = Character.digit(upperCase.charAt(i4 + 1), 16);
                if (digit < 0 || digit2 < 0) {
                    dz customDz = new dz(true, 9999, 63, 255, str.trim().toUpperCase());
                    customDz.f = -1L;
                    customDz.g = 63;
                    customDz.h = "VIP Customer";
                    return customDz;
                }
                bArr[i3] = (byte) (digit2 | (digit << 4));
            } catch (Throwable th) {
                return dz.g();
            }
        }
        char c2 = length == 12 ? '\b' : (char) 6;
        try {
            int i5 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i6 = ((bArr[4] & 255) << 8) | (bArr[5] & 255);
            if (c2 != '\b' || (i2 = bArr[6] & 255) == 0) {
                i2 = 255;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            while (i7 < upperCase.length()) {
                if (i7 > 0) {
                    sb.append("-");
                }
                int i8 = i7 + 4;
                sb.append(upperCase.substring(i7, i8));
                i7 = i8;
            }
            dz parsedDz = new dz(true, i5, i6, i2, sb.toString());
            parsedDz.f = -1L;
            parsedDz.g = 63;
            parsedDz.h = "VIP Customer";
            return parsedDz;
        } catch (Throwable th2) {
            return dz.g();
        }
    }

    public static String a() {
        return a;
    }

    public static String a(InputStream inputStream) throws java.io.IOException {
        int i2;
        int read;
        long j2;
        int read2 = inputStream.read();
        if (read2 == -1 || (i2 = read2 & 15) == 8 || (read = inputStream.read()) == -1) {
            return null;
        }
        boolean z = (read & 128) != 0;
        long j3 = read & 127;
        if (j3 == 126) {
            int read3 = inputStream.read();
            int read4 = inputStream.read();
            if (read3 == -1 || read4 == -1) {
                return null;
            }
            j2 = ((read3 & 255) << 8) | (read4 & 255);
        } else {
            if (j3 == 127) {
                j3 = 0;
                for (int i3 = 0; i3 < 8; i3++) {
                    int r5 = inputStream.read();
                    if (r5 == -1) {
                        return null;
                    }
                    j3 = (j3 << 8) | (r5 & 255);
                }
            }
            j2 = j3;
        }
        if (j2 > 1048576) {
            return null;
        }
        byte[] bArr = new byte[4];
        if (z) {
            int i4 = 0;
            while (i4 < 4) {
                int read5 = inputStream.read(bArr, i4, 4 - i4);
                if (read5 == -1) {
                    return null;
                }
                i4 += read5;
            }
        }
        int i5 = (int) j2;
        byte[] bArr2 = new byte[i5];
        int i6 = 0;
        while (i6 < j2) {
            int read6 = inputStream.read(bArr2, i6, i5 - i6);
            if (read6 == -1) {
                return null;
            }
            i6 += read6;
        }
        if (z) {
            for (int i7 = 0; i7 < j2; i7++) {
                bArr2[i7] = (byte) (bArr2[i7] ^ bArr[i7 % 4]);
            }
        }
        return i2 == 1 ? new String(bArr2, StandardCharsets.UTF_8) : "";
    }

    public static List a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (str == null || "MENU".equalsIgnoreCase(str) || "-".equals(str)) {
            return arrayList;
        }
        String upperCase = str.toUpperCase();
        String upperCase2 = str2 != null ? str2.toUpperCase() : "";
        if (upperCase.contains("RED / YELLOW") || upperCase.contains("R/Y") || upperCase2.contains("13") || (upperCase2.contains("1") && upperCase2.contains("3") && !upperCase2.contains("0") && !upperCase2.contains("2"))) {
            arrayList.add("RED");
            arrayList.add("YELLOW");
            return arrayList;
        }
        if (upperCase.contains("BLUE / GREEN") || upperCase.contains("B/G") || upperCase2.contains("02") || (upperCase2.contains("0") && upperCase2.contains("2") && !upperCase2.contains("1") && !upperCase2.contains("3"))) {
            arrayList.add("BLUE");
            arrayList.add("GREEN");
            return arrayList;
        }
        if (upperCase.contains("TEAM") || upperCase.contains("2V2") || upperCase2.startsWith("T ")) {
            arrayList.add("BLUE");
            arrayList.add("RED");
            arrayList.add("GREEN");
            arrayList.add("YELLOW");
            return arrayList;
        }
        if (upperCase.startsWith("4P")) {
            arrayList.add("BLUE");
            arrayList.add("RED");
            arrayList.add("GREEN");
            arrayList.add("YELLOW");
            return arrayList;
        }
        if (!upperCase.startsWith("3P")) {
            if (!upperCase.startsWith("6P")) {
                if (!upperCase.startsWith("2P")) {
                    return arrayList;
                }
                arrayList.add("BLUE");
                arrayList.add("GREEN");
                return arrayList;
            }
            arrayList.add("BLUE");
            arrayList.add("RED");
            arrayList.add("GREEN");
            arrayList.add("YELLOW");
            arrayList.add("ORANGE");
            arrayList.add("PURPLE");
            return arrayList;
        }
        Matcher matcher = Pattern.compile("^[MT]\\s+3\\s+([0-3]{3})", 2).matcher(upperCase2);
        if (!matcher.find()) {
            arrayList.add("BLUE");
            arrayList.add("RED");
            arrayList.add("GREEN");
            return arrayList;
        }
        String group = matcher.group(1);
        for (int i2 = 0; i2 < group.length(); i2++) {
            char charAt = group.charAt(i2);
            if (charAt == '0') {
                arrayList.add("BLUE");
            } else if (charAt == '1') {
                arrayList.add("RED");
            } else if (charAt == '2') {
                arrayList.add("GREEN");
            } else if (charAt == '3') {
                arrayList.add("YELLOW");
            }
        }
        return arrayList;
    }

    private void a(int i2, String str, boolean z) {
        String m2 = m();
        int i3 = !"127.0.0.1".equals(m2) ? this.an : 18080;
        StringBuilder append = new StringBuilder("SET LUCK ").append(i2).append(" ");
        if (z) {
            str = "ALL";
        }
        String sb = append.append(str).toString();
        if ((!this.at || !this.au) && !a(m2, i3, sb) && !"127.0.0.1".equals(m2)) {
            a("127.0.0.1", 18080, sb);
        }
        r(sb);
    }

    public void a(long j2, long j3, boolean z2, boolean z3, String str, boolean z4, String str2, String str3, String str4, String str5) {
    }

    private void a(long j2, dy dyVar) {
        if (j2 == this.aB.get() && dyVar.a) {
            if (!this.ae || this.af == null || this.af.isEmpty()) {
                this.L = u(dyVar.b);
            } else {
                this.L = this.af;
            }
            j();
            k();
        }
    }

    private void a(Context context, String str, String str2) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(a(14), a(14), a(14), a(14));
            linearLayout.setBackgroundColor(Color.parseColor("#0a0f1d"));
            TextView textView = new TextView(context);
            textView.setText("💬 Telegram Support: @".concat(String.valueOf(str2)));
            textView.setTextColor(Color.parseColor("#38bdf8"));
            textView.setTextSize(2, 14.5f);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setPadding(0, 0, 0, a(8));
            linearLayout.addView(textView);
            WebView webView = new WebView(context);
            webView.setLayoutParams(new LinearLayout.LayoutParams(-1, a(400)));
            webView.getSettings().setJavaScriptEnabled(false);
            webView.getSettings().setDomStorageEnabled(false);
            webView.getSettings().setAllowFileAccess(false);
            webView.getSettings().setAllowContentAccess(false);
            if (Build.VERSION.SDK_INT >= 16) {
                webView.getSettings().setAllowFileAccessFromFileURLs(false);
                webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
            }
            webView.setWebViewClient(new cy(this, context));
            webView.loadUrl(str);
            linearLayout.addView(webView);
            builder.setView(linearLayout);
            builder.setNegativeButton("Close", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
            }
        } catch (Throwable th) {
            c(context);
            Toast.makeText(context, "Telegram: @" + str2 + " copied!", 0).show();
        }
    }

    private void a(Button button) {
        button.setText("📋 Copy ID");
        button.setTextColor(Color.parseColor("#f1f5f9"));
        button.setBackground(a(a(Color.parseColor("#1e293b"), a(8), a(1), Color.parseColor("#334155")), a(Color.parseColor("#273549"), a(8), a(1), Color.parseColor("#475569"))));
    }

    private void a(Button button, EditText editText) {
        button.setText("Scanning Network...");
        button.setEnabled(false);
        this.az.execute(new cg(this, button, editText));
    }

    private void a(Button button, dv dvVar, dz dzVar, TextView textView, LinearLayout linearLayout) {
        button.setEnabled(true);
        button.setText((this.aC == null || !this.aC.c()) ? "⚡ Unlock Pro" : "⚡ Renew / Switch Key");
        if (dvVar != null && dvVar.d) {
            b(dzVar);
            this.aC = dzVar;
            d();
            f();
            e();
            r();
            return;
        }
        if (dvVar != null && ("suspended".equals(dvVar.e) || "revoked".equals(dvVar.e) || "expired".equals(dvVar.e) || "tampered".equals(dvVar.e))) {
            a(getSharedPreferences(aH, 0));
            this.aC = null;
        }
        textView.setText((dvVar == null || dvVar.b == null) ? "Activation error: Unable to verify license online. Please connect to internet." : dvVar.b);
        linearLayout.setVisibility(0);
        d();
    }

    private void a(Button button, String str, EditText editText) {
        button.setText("Auto Detect Phone A IP");
        button.setEnabled(true);
        if (str == null || str.isEmpty()) {
            editText.setText("192.168.43.1");
            this.ao = "192.168.43.1";
            Toast.makeText(this, "Defaulted to 192.168.43.1", 0).show();
        } else {
            editText.setText(str);
            this.ao = str;
            Toast.makeText(this, "Found Phone A: ".concat(String.valueOf(str)), 0).show();
        }
    }

    private void a(EditText editText) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || clipboardManager.getPrimaryClip().getItemCount() <= 0) {
                Toast.makeText(this, "Clipboard is empty", 0).show();
            } else {
                CharSequence text = clipboardManager.getPrimaryClip().getItemAt(0).getText();
                if (text == null || text.length() <= 0) {
                    Toast.makeText(this, "Clipboard is empty", 0).show();
                } else {
                    editText.setText(text.toString().trim());
                    d();
                    Toast.makeText(this, "Activation key pasted", 0).show();
                }
            }
        } catch (Throwable th) {
        }
    }

    private static void a(EditText editText, Drawable drawable, Drawable drawable2, boolean z) {
        if (z) {
            drawable2 = drawable;
        }
        editText.setBackground(drawable2);
    }

    private void a(EditText editText, EditText editText2) {
        this.am = editText.getText().toString().trim();
        if ("127.0.0.1".equals(this.am) || "localhost".equalsIgnoreCase(this.am) || this.am.isEmpty()) {
            this.am = "";
            this.ao = "";
            this.al = l();
        } else {
            this.al = false;
        }
        try {
            this.an = Integer.parseInt(editText2.getText().toString().trim());
        } catch (Exception e2) {
        }
        try {
            getSharedPreferences(aH, 0).edit().putString("pref_remote_host", this.am).putInt("pref_remote_port", this.an).putBoolean("pref_force_local_mode", this.al).apply();
        } catch (Throwable th) {
        }
        Socket socket = this.aw;
        this.aw = null;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable th2) {
            }
        }
        this.J = false;
        this.G = "";
        this.az.execute(new ci(this));
        if (this.am.length() > 0) {
            Toast.makeText(this, "Target set to " + this.am + ":" + this.an + " (Reconnecting...)", 0).show();
        }
    }

    private void a(EditText editText, TextView textView, LinearLayout linearLayout, Button button) {
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty()) {
            textView.setText("Please enter or paste your activation key");
            linearLayout.setVisibility(0);
            d();
            return;
        }
        dz a2 = a(trim);
        if (!a2.e) {
            textView.setText("Invalid code format or signature");
            linearLayout.setVisibility(0);
            d();
        } else {
            button.setEnabled(false);
            button.setText("Verifying with server...");
            linearLayout.setVisibility(8);
            this.az.execute(new ad(this, a2, button, textView, linearLayout));
        }
    }

    private void a(EditText editText, boolean[] zArr) {
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty()) {
            Toast.makeText(this, "Please enter 8-digit Room Code", 0).show();
        } else {
            a(trim, zArr[0]);
        }
    }

    private void a(LinearLayout linearLayout, String str, String str2, String str3) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, a(2), 0, a(2));
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView = new TextView(this);
        textView.setText(str + ":");
        textView.setTextColor(Color.parseColor("#64748b"));
        textView.setTextSize(2, 10.5f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(a(90), -2));
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(str2);
        textView2.setTextColor(Color.parseColor(str3));
        textView2.setTextSize(2, 11.0f);
        textView2.setTypeface(Typeface.MONOSPACE, 1);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
    }

    private void a(dz dzVar, Button button, TextView textView, LinearLayout linearLayout) {
        this.ay.post(new ae(this, button, a(dzVar), dzVar, textView, linearLayout));
    }

    public static /* synthetic */ void a(MainActivity mainActivity, int i2) {
        if (i2 < 0 || i2 >= bA.length) {
            return;
        }
        int i3 = bA[i2];
        mainActivity.d();
        if (mainActivity.C != null) {
            mainActivity.C.setProgress(i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i3 <= 100 ? i3 : 100;
        mainActivity.d();
        mainActivity.bz = System.currentTimeMillis();
        mainActivity.by = mainActivity.bz;
        if (mainActivity.bx) {
            for (int i5 = 0; i5 < 4; i5++) {
                mainActivity.D[i5] = i4;
            }
        } else {
            mainActivity.D[e(mainActivity.M)] = i4;
        }
        if (!mainActivity.O) {
            mainActivity.O = true;
            try {
                mainActivity.getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", mainActivity.O).apply();
            } catch (Throwable th) {
            }
            mainActivity.g();
            mainActivity.k();
        }
        mainActivity.i(i4);
        mainActivity.b(i4, mainActivity.M);
    }

    public static /* synthetic */ void a(MainActivity mainActivity, int i2, String str) {
        String m2 = mainActivity.m();
        int i3 = !"127.0.0.1".equals(m2) ? mainActivity.an : 18080;
        String str2 = "SET LUCK " + i2 + " " + str;
        if ((!mainActivity.at || !mainActivity.au) && !mainActivity.a(m2, i3, str2) && !"127.0.0.1".equals(m2)) {
            mainActivity.a("127.0.0.1", 18080, str2);
        }
        mainActivity.r(str2);
    }

    public void a(String str, long j2) {
    }

    private void a(String str, Button button) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Device ID", str));
                d();
                button.setText("✓ Copied");
                button.setTextColor(Color.parseColor("#34d399"));
                button.setBackground(a(Color.parseColor("#064e3b"), a(8), a(1), Color.parseColor("#10b981")));
                this.ay.postDelayed(new af(this, button), 1800L);
                Toast.makeText(this, "Device ID copied to clipboard", 0).show();
            }
        } catch (Throwable th) {
        }
    }

    public void a(String str, String str2, int i2, String str3, String str4, String str5, String str6, long j2, long j3, String str7) {
    }

    private void a(String str, String str2, long j2) {
        try {
            if (this.aC == null || !this.aC.c()) {
                return;
            }
            if (this.aC.a(16) || this.aC.a(8) || this.aC.a(32)) {
                String replaceAll = str != null ? str.replaceAll("[^0-9A-Za-z_\\-]", "") : "";
                if (replaceAll.isEmpty()) {
                    return;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(a + "/cloud_sync/" + replaceAll + "/command.json").openConnection();
                httpURLConnection.setRequestMethod("PUT");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("X-Device-Id", c());
                if (this.aC.a != null) {
                    httpURLConnection.setRequestProperty("X-License-Key", this.aC.a);
                    httpURLConnection.setRequestProperty("Authorization", "Bearer " + this.aC.a);
                }
                httpURLConnection.setRequestProperty("X-App-Version", "v10.6.0.416");
                httpURLConnection.setConnectTimeout(4000);
                httpURLConnection.setReadTimeout(4000);
                httpURLConnection.setDoOutput(true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dice", u(str2));
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("seq", j2);
                if (this.aC.a != null) {
                    jSONObject.put("license", this.aC.a);
                }
                String jSONObject2 = jSONObject.toString();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(jSONObject2.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (!c.l.c.v.a(httpURLConnection)) {
                    httpURLConnection.disconnect();
                    return;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    while (inputStream.read(new byte[256]) != -1) {
                    }
                    inputStream.close();
                }
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
        }
    }

    public static void a(Socket socket, String str) throws java.io.IOException {
        if (socket == null || socket.isClosed()) {
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(129);
        int length = bytes.length;
        byte[] bArr = new byte[4];
        new SecureRandom().nextBytes(bArr);
        if (length <= 125) {
            byteArrayOutputStream.write(length | 128);
        } else if (length <= 65535) {
            byteArrayOutputStream.write(254);
            byteArrayOutputStream.write((length >> 8) & 255);
            byteArrayOutputStream.write(length & 255);
        } else {
            byteArrayOutputStream.write(255);
            for (int i2 = 7; i2 >= 0; i2--) {
                byteArrayOutputStream.write((length >> (i2 * 8)) & 255);
            }
        }
        byteArrayOutputStream.write(bArr);
        byte[] bArr2 = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr2[i3] = (byte) (bytes[i3] ^ bArr[i3 % 4]);
        }
        byteArrayOutputStream.write(bArr2);
        synchronized (socket) {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.flush();
        }
    }

    private void a(boolean[] zArr, Button button) {
        if (zArr[0]) {
            button.setText("Role: MASTER (I have Controller)");
            button.setTextColor(Color.parseColor("#86efac"));
            button.setBackground(a(Color.parseColor("#052e16"), a(8), a(1), Color.parseColor("#16a34a")));
        } else {
            button.setText("Role: MIRROR (Sync from Friend)");
            button.setTextColor(Color.parseColor("#f9d36b"));
            button.setBackground(a(Color.parseColor("#2b2209"), a(8), a(1), Color.parseColor("#9a7112")));
        }
    }

    public static void a(boolean[] zArr, Runnable runnable) {
        zArr[0] = !zArr[0];
        runnable.run();
    }

    private boolean a(String str, int i2) {
        return b(str, i2, 450);
    }

    private String aa() {
        return a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        if (a(1, "General Features")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            ScrollView scrollView = new ScrollView(this);
            scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            scrollView.setBackgroundColor(Color.parseColor("#0a0f1d"));
            scrollView.setPadding(a(16), a(14), a(16), a(14));
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            scrollView.addView(linearLayout);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText("📡 ");
            textView.setTextSize(2, 16.0f);
            linearLayout2.addView(textView);
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView2 = new TextView(this);
            textView2.setText("Dual Phone / Hotspot Config");
            textView2.setTextColor(Color.parseColor("#f8fafc"));
            textView2.setTextSize(2, 15.0f);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout3.addView(textView2);
            TextView textView3 = new TextView(this);
            textView3.setText("Ultra-Low Latency WiFi Socket Sync (Zero Delay)");
            textView3.setTextColor(Color.parseColor("#38bdf8"));
            textView3.setTextSize(2, 10.0f);
            linearLayout3.addView(textView3);
            linearLayout2.addView(linearLayout3);
            linearLayout.addView(linearLayout2);
            Button button = new Button(this);
            b(button);
            button.setText("📱 Switch to Same Device (Disconnect Remote)");
            button.setTextSize(2, 11.5f);
            button.setTypeface(Typeface.DEFAULT_BOLD);
            button.setTextColor(Color.parseColor("#ffffff"));
            button.setAllCaps(false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, a(40));
            layoutParams.setMargins(0, a(12), 0, 0);
            button.setLayoutParams(layoutParams);
            button.setBackground(a(Color.parseColor("#7f1d1d"), a(8), a(1), Color.parseColor("#ef4444")));
            button.setOnClickListener(new bv(this));
            linearLayout.addView(button);
            LinearLayout linearLayout4 = new LinearLayout(this);
            linearLayout4.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, a(12), 0, a(10));
            linearLayout4.setLayoutParams(layoutParams2);
            linearLayout4.setPadding(a(14), a(12), a(14), a(12));
            linearLayout4.setBackground(a(Color.parseColor("#0d1527"), a(12), a(1), Color.parseColor("#1e293b")));
            TextView textView4 = new TextView(this);
            textView4.setText("PHONE A (GAME PHONE) IP ADDRESS");
            textView4.setTextColor(Color.parseColor("#94a3b8"));
            textView4.setTextSize(2, 10.0f);
            textView4.setTypeface(Typeface.DEFAULT_BOLD);
            textView4.setLetterSpacing(0.06f);
            linearLayout4.addView(textView4);
            EditText editText = new EditText(this);
            editText.setHint("192.168.43.1");
            editText.setHintTextColor(Color.parseColor("#334155"));
            editText.setTextColor(Color.parseColor("#38bdf8"));
            editText.setTextSize(2, 13.0f);
            editText.setTypeface(Typeface.MONOSPACE, 1);
            editText.setSingleLine(true);
            editText.setPadding(a(12), a(8), a(12), a(8));
            String str = this.am;
            if (str.isEmpty()) {
                str = this.ao.isEmpty() ? Y() : this.ao;
            }
            editText.setText(str);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, a(42));
            layoutParams3.setMargins(0, a(6), 0, a(10));
            editText.setLayoutParams(layoutParams3);
            GradientDrawable a2 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#1e2c45"));
            GradientDrawable a3 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#38bdf8"));
            editText.setBackground(a2);
            editText.setOnFocusChangeListener(new by(this, editText, a3, a2));
            linearLayout4.addView(editText);
            TextView textView5 = new TextView(this);
            textView5.setText("SOCKET PORT (DEFAULT: 18080)");
            textView5.setTextColor(Color.parseColor("#94a3b8"));
            textView5.setTextSize(2, 10.0f);
            textView5.setTypeface(Typeface.DEFAULT_BOLD);
            textView5.setLetterSpacing(0.06f);
            linearLayout4.addView(textView5);
            EditText editText2 = new EditText(this);
            editText2.setHint("18080");
            editText2.setHintTextColor(Color.parseColor("#334155"));
            editText2.setTextColor(Color.parseColor("#38bdf8"));
            editText2.setTextSize(2, 13.0f);
            editText2.setTypeface(Typeface.MONOSPACE, 1);
            editText2.setInputType(2);
            editText2.setSingleLine(true);
            editText2.setText(String.valueOf(this.an));
            editText2.setPadding(a(12), a(8), a(12), a(8));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, a(42));
            layoutParams4.setMargins(0, a(6), 0, a(10));
            editText2.setLayoutParams(layoutParams4);
            GradientDrawable a4 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#1e2c45"));
            GradientDrawable a5 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#38bdf8"));
            editText2.setBackground(a4);
            editText2.setOnFocusChangeListener(new cc(this, editText2, a5, a4));
            linearLayout4.addView(editText2);
            Button button2 = new Button(this);
            button2.setText("⚡ Auto Detect Phone A IP");
            button2.setAllCaps(false);
            b(button2);
            button2.setTextColor(-1);
            button2.setTextSize(2, 12.0f);
            button2.setTypeface(Typeface.DEFAULT_BOLD);
            button2.setLayoutParams(new LinearLayout.LayoutParams(-1, a(42)));
            button2.setBackground(a(a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#0284c7"), Color.parseColor("#0369a1")}, a(8), a(1), Color.parseColor("#38bdf8")), a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#0369a1"), Color.parseColor("#075985")}, a(8), a(1), Color.parseColor("#60a5fa"))));
            button2.setOnClickListener(new cd(this, button2, editText));
            linearLayout4.addView(button2);
            linearLayout.addView(linearLayout4);
            boolean z = this.aC == null || (this.aC.c() && (this.aC.a(16) || this.aC.a(8) || this.aC.a(32)));
            Button button3 = new Button(this);
            button3.setText(this.at ? "☁️ Cloud Sync Active (PIN: " + this.as + ")" : z ? "☁️ Direct Ludo King Cloud Sync (No Hotspot)" : "☁️ Direct Cloud Sync (Locked)");
            button3.setAllCaps(false);
            b(button3);
            button3.setTextColor(this.at ? Color.parseColor("#86efac") : z ? Color.parseColor("#38bdf8") : Color.parseColor("#64748b"));
            button3.setTextSize(2, 11.5f);
            button3.setTypeface(Typeface.DEFAULT_BOLD);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, a(42));
            layoutParams5.setMargins(0, 0, 0, a(10));
            button3.setLayoutParams(layoutParams5);
            button3.setBackground(a(a(this.at ? Color.parseColor("#052e16") : Color.parseColor("#0c1527"), a(8), a(1), this.at ? Color.parseColor("#16a34a") : Color.parseColor("#1e3a5f")), a(Color.parseColor("#162032"), a(8), a(1), Color.parseColor("#38bdf8"))));
            button3.setOnClickListener(new ce(this));
            linearLayout.addView(button3);
            LinearLayout linearLayout5 = new LinearLayout(this);
            linearLayout5.setOrientation(1);
            linearLayout5.setPadding(a(12), a(10), a(12), a(10));
            linearLayout5.setBackground(a(Color.parseColor("#070d18"), a(10), a(1), Color.parseColor("#172033")));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, 0, 0, a(10));
            linearLayout5.setLayoutParams(layoutParams6);
            TextView textView6 = new TextView(this);
            textView6.setText("📖 QUICK HOTSPOT SETUP STEPS");
            textView6.setTextColor(Color.parseColor("#64748b"));
            textView6.setTextSize(2, 9.5f);
            textView6.setTypeface(Typeface.DEFAULT_BOLD);
            textView6.setLetterSpacing(0.06f);
            linearLayout5.addView(textView6);
            String[] strArr = {"1️⃣  Turn ON Portable Hotspot on Phone A (Game phone).", "2️⃣  Connect Phone B (Controller) to Phone A's WiFi.", "3️⃣  Tap 'Auto Detect Phone A IP' or keep 192.168.43.1."};
            for (int i2 = 0; i2 < 3; i2++) {
                String str2 = strArr[i2];
                TextView textView7 = new TextView(this);
                textView7.setText(str2);
                textView7.setTextColor(Color.parseColor("#94a3b8"));
                textView7.setTextSize(2, 10.5f);
                textView7.setPadding(0, a(3), 0, 0);
                linearLayout5.addView(textView7);
            }
            linearLayout.addView(linearLayout5);
            builder.setView(scrollView);
            builder.setPositiveButton("Save & Connect", new cf(this, editText, editText2));
            builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
            }
            Button button4 = create.getButton(-1);
            if (button4 != null) {
                button4.setTextColor(Color.parseColor("#38bdf8"));
                button4.setTypeface(Typeface.DEFAULT_BOLD);
            }
            Button button5 = create.getButton(-2);
            if (button5 != null) {
                button5.setTextColor(Color.parseColor("#94a3b8"));
                button5.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    private void ac() {
        k();
        if (this.z != null) {
            boolean z = this.aC == null || this.aC.a(8);
            this.z.setText(z ? "ONLINE ROOM" : "ROOM LOCKED");
            this.z.setTextColor(Color.parseColor(z ? "#c084fc" : "#556b70"));
            this.z.setBackground(a(Color.parseColor(z ? "#2e1065" : "#091013"), a(12), a(1), Color.parseColor(z ? "#7e22ce" : "#17272b")));
        }
        Toast.makeText(this, "Room Sync Stopped.", 0).show();
    }

    private void ad() {
        String str;
        int parseColor;
        int parseColor2;
        int parseColor3;
        if (a(8, "Online Room Control")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            ScrollView scrollView = new ScrollView(this);
            scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            scrollView.setBackgroundColor(Color.parseColor("#0a0f1d"));
            scrollView.setPadding(a(16), a(14), a(16), a(14));
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            scrollView.addView(linearLayout);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText("👥 ");
            textView.setTextSize(2, 16.0f);
            linearLayout2.addView(textView);
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView2 = new TextView(this);
            textView2.setText("Play with Friends Room Sync");
            textView2.setTextColor(Color.parseColor("#f8fafc"));
            textView2.setTextSize(2, 15.0f);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout3.addView(textView2);
            TextView textView3 = new TextView(this);
            textView3.setText("Direct Multi-Device Dice Mirroring via Room Code");
            textView3.setTextColor(Color.parseColor("#c084fc"));
            textView3.setTextSize(2, 10.0f);
            linearLayout3.addView(textView3);
            linearLayout2.addView(linearLayout3);
            linearLayout.addView(linearLayout2);
            LinearLayout linearLayout4 = new LinearLayout(this);
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, a(12), 0, a(10));
            linearLayout4.setLayoutParams(layoutParams);
            linearLayout4.setPadding(a(12), a(8), a(12), a(8));
            if (this.aq) {
                str = "● ROOM ACTIVE (" + (this.ar ? "MASTER" : "MIRROR") + ") ✓";
                parseColor = Color.parseColor("#86efac");
                parseColor2 = Color.parseColor("#052e16");
                parseColor3 = Color.parseColor("#16a34a");
            } else {
                str = "○ ROOM INACTIVE";
                parseColor = Color.parseColor("#94a3b8");
                parseColor2 = Color.parseColor("#0d1527");
                parseColor3 = Color.parseColor("#1e293b");
            }
            linearLayout4.setBackground(a(parseColor2, a(10), a(1), parseColor3));
            TextView textView4 = new TextView(this);
            textView4.setText(str);
            textView4.setTextColor(parseColor);
            textView4.setTextSize(2, 11.0f);
            textView4.setTypeface(Typeface.DEFAULT_BOLD);
            textView4.setLetterSpacing(0.04f);
            linearLayout4.addView(textView4);
            linearLayout.addView(linearLayout4);
            LinearLayout linearLayout5 = new LinearLayout(this);
            linearLayout5.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, a(10));
            linearLayout5.setLayoutParams(layoutParams2);
            linearLayout5.setPadding(a(14), a(12), a(14), a(12));
            linearLayout5.setBackground(a(Color.parseColor("#0d1527"), a(12), a(1), Color.parseColor("#1e293b")));
            TextView textView5 = new TextView(this);
            textView5.setText("ENTER 8-DIGIT PRIVATE ROOM CODE");
            textView5.setTextColor(Color.parseColor("#94a3b8"));
            textView5.setTextSize(2, 10.0f);
            textView5.setTypeface(Typeface.DEFAULT_BOLD);
            textView5.setLetterSpacing(0.06f);
            linearLayout5.addView(textView5);
            EditText editText = new EditText(this);
            editText.setHint("e.g. 12345678");
            editText.setHintTextColor(Color.parseColor("#334155"));
            editText.setTextColor(Color.parseColor("#c084fc"));
            editText.setTextSize(2, 18.0f);
            editText.setTypeface(Typeface.MONOSPACE, 1);
            editText.setGravity(17);
            editText.setInputType(2);
            editText.setLetterSpacing(0.12f);
            editText.setSingleLine(true);
            editText.setText(this.ap);
            editText.setPadding(a(12), a(8), a(12), a(8));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, a(48));
            layoutParams3.setMargins(0, a(8), 0, a(10));
            editText.setLayoutParams(layoutParams3);
            GradientDrawable a2 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#1e2c45"));
            GradientDrawable a3 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#c084fc"));
            editText.setBackground(a2);
            editText.setOnFocusChangeListener(new co(this, editText, a3, a2));
            linearLayout5.addView(editText);
            LinearLayout linearLayout6 = new LinearLayout(this);
            linearLayout6.setOrientation(0);
            linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, a(38)));
            Button button = new Button(this);
            button.setText("📋 Paste Room Code");
            button.setAllCaps(false);
            b(button);
            button.setTextColor(Color.parseColor("#c084fc"));
            button.setTextSize(2, 11.5f);
            button.setTypeface(Typeface.DEFAULT_BOLD);
            button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            button.setBackground(a(a(Color.parseColor("#2e1065"), a(8), a(1), Color.parseColor("#7e22ce")), a(Color.parseColor("#4c1d95"), a(8), a(1), Color.parseColor("#c084fc"))));
            button.setOnClickListener(new cp(this, editText));
            linearLayout6.addView(button);
            Button button2 = new Button(this);
            button2.setText("✕");
            button2.setAllCaps(false);
            b(button2);
            button2.setTextColor(Color.parseColor("#94a3b8"));
            button2.setTextSize(2, 12.0f);
            button2.setTypeface(Typeface.DEFAULT_BOLD);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(a(44), -1);
            layoutParams4.setMargins(a(6), 0, 0, 0);
            button2.setLayoutParams(layoutParams4);
            button2.setBackground(a(a(Color.parseColor("#162032"), a(8), a(1), Color.parseColor("#2a3852")), a(Color.parseColor("#1f2e47"), a(8), a(1), Color.parseColor("#3b82f6"))));
            button2.setOnClickListener(new cq(this, editText));
            linearLayout6.addView(button2);
            linearLayout5.addView(linearLayout6);
            linearLayout.addView(linearLayout5);
            Button button3 = new Button(this);
            boolean[] zArr = {this.ar};
            cr crVar = new cr(this, zArr, button3);
            crVar.run();
            button3.setAllCaps(false);
            b(button3);
            button3.setTextSize(2, 12.0f);
            button3.setTypeface(Typeface.DEFAULT_BOLD);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, a(42));
            layoutParams5.setMargins(0, 0, 0, a(10));
            button3.setLayoutParams(layoutParams5);
            button3.setOnClickListener(new cs(this, zArr, crVar));
            linearLayout.addView(button3);
            LinearLayout linearLayout7 = new LinearLayout(this);
            linearLayout7.setOrientation(1);
            linearLayout7.setPadding(a(12), a(10), a(12), a(10));
            linearLayout7.setBackground(a(Color.parseColor("#070d18"), a(10), a(1), Color.parseColor("#172033")));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, 0, 0, a(10));
            linearLayout7.setLayoutParams(layoutParams6);
            TextView textView6 = new TextView(this);
            textView6.setText("📖 ROOM SYNC ROLES");
            textView6.setTextColor(Color.parseColor("#64748b"));
            textView6.setTextSize(2, 9.5f);
            textView6.setTypeface(Typeface.DEFAULT_BOLD);
            textView6.setLetterSpacing(0.06f);
            linearLayout7.addView(textView6);
            String[] strArr = {"• MASTER: This phone sets & commands dice to room.", "• MIRROR: This phone mirrors dice synced from partner."};
            for (int i2 = 0; i2 < 2; i2++) {
                String str2 = strArr[i2];
                TextView textView7 = new TextView(this);
                textView7.setText(str2);
                textView7.setTextColor(Color.parseColor("#94a3b8"));
                textView7.setTextSize(2, 10.5f);
                textView7.setPadding(0, a(3), 0, 0);
                linearLayout7.addView(textView7);
            }
            linearLayout.addView(linearLayout7);
            builder.setView(scrollView);
            builder.setPositiveButton(this.aq ? "Reconnect / Update" : "Connect Room", new ct(this, editText, zArr));
            if (this.aq) {
                builder.setNeutralButton("Disconnect", new cu(this));
            }
            builder.setNegativeButton("Close", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
            }
            Button button4 = create.getButton(-1);
            if (button4 != null) {
                button4.setTextColor(Color.parseColor("#c084fc"));
                button4.setTypeface(Typeface.DEFAULT_BOLD);
            }
            Button button5 = create.getButton(-3);
            if (button5 != null) {
                button5.setTextColor(Color.parseColor("#ef4444"));
                button5.setTypeface(Typeface.DEFAULT_BOLD);
            }
            Button button6 = create.getButton(-2);
            if (button6 != null) {
                button6.setTextColor(Color.parseColor("#94a3b8"));
                button6.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    private void ae() {
        o();
    }

    private void af() {
        TextView textView;
        if (this.at && (textView = this.B) != null && !"OFFLINE".equals(textView.getText().toString())) {
            this.B.setText("OFFLINE");
            this.B.setTextColor(Color.parseColor("#f87171"));
            this.B.setBackground(a(Color.parseColor("#450a0a"), a(12), a(1), Color.parseColor("#dc2626")));
        }
        k();
    }

    private void ag() {
        k();
        if (this.B != null) {
            boolean z = this.aC == null || this.aC.a(16) || this.aC.a(8) || this.aC.a(32);
            this.B.setText(z ? "CLOUD SYNC" : "SYNC LOCKED");
            this.B.setTextColor(Color.parseColor(z ? "#38bdf8" : "#556b70"));
            this.B.setBackground(a(Color.parseColor(z ? "#0c2d48" : "#091013"), a(12), a(1), Color.parseColor(z ? "#0284c7" : "#17272b")));
        }
        Toast.makeText(this, "Cloud Sync Disconnected.", 0).show();
    }

    private void ah() {
        String str;
        int parseColor;
        int parseColor2;
        int parseColor3;
        if (a(16, "Online Ludo King Sync")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            ScrollView scrollView = new ScrollView(this);
            scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            scrollView.setBackgroundColor(Color.parseColor("#0a0f1d"));
            scrollView.setPadding(a(16), a(14), a(16), a(14));
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            scrollView.addView(linearLayout);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText("☁️ ");
            textView.setTextSize(2, 16.0f);
            linearLayout2.addView(textView);
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView2 = new TextView(this);
            textView2.setText("Direct Ludo King Cloud Sync");
            textView2.setTextColor(Color.parseColor("#f8fafc"));
            textView2.setTextSize(2, 15.0f);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout3.addView(textView2);
            TextView textView3 = new TextView(this);
            textView3.setText("Over-The-Air Telemetry & Dice Bridge (No Hotspot)");
            textView3.setTextColor(Color.parseColor("#38bdf8"));
            textView3.setTextSize(2, 10.0f);
            linearLayout3.addView(textView3);
            linearLayout2.addView(linearLayout3);
            linearLayout.addView(linearLayout2);
            LinearLayout linearLayout4 = new LinearLayout(this);
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, a(12), 0, a(10));
            linearLayout4.setLayoutParams(layoutParams);
            linearLayout4.setPadding(a(12), a(8), a(12), a(8));
            if (!this.at) {
                str = "○ IDLE / DISCONNECTED";
                parseColor = Color.parseColor("#94a3b8");
                parseColor2 = Color.parseColor("#0d1527");
                parseColor3 = Color.parseColor("#1e293b");
            } else if (this.au) {
                str = "● CONNECTED TO LUDO KING ✓ (PIN: " + this.as + ")";
                parseColor = Color.parseColor("#86efac");
                parseColor2 = Color.parseColor("#052e16");
                parseColor3 = Color.parseColor("#16a34a");
            } else {
                str = "⏳ WAITING FOR RECEIVER... (PIN: " + this.as + ")";
                parseColor = Color.parseColor("#fde047");
                parseColor2 = Color.parseColor("#451a03");
                parseColor3 = Color.parseColor("#ca8a04");
            }
            linearLayout4.setBackground(a(parseColor2, a(10), a(1), parseColor3));
            TextView textView4 = new TextView(this);
            textView4.setText(str);
            textView4.setTextColor(parseColor);
            textView4.setTextSize(2, 11.0f);
            textView4.setTypeface(Typeface.DEFAULT_BOLD);
            textView4.setLetterSpacing(0.04f);
            linearLayout4.addView(textView4);
            linearLayout.addView(linearLayout4);
            LinearLayout linearLayout5 = new LinearLayout(this);
            linearLayout5.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, a(10));
            linearLayout5.setLayoutParams(layoutParams2);
            linearLayout5.setPadding(a(14), a(12), a(14), a(12));
            linearLayout5.setBackground(a(Color.parseColor("#0d1527"), a(12), a(1), Color.parseColor("#1e293b")));
            TextView textView5 = new TextView(this);
            textView5.setText("ENTER 6-DIGIT PIN FROM LUDO KING");
            textView5.setTextColor(Color.parseColor("#94a3b8"));
            textView5.setTextSize(2, 10.0f);
            textView5.setTypeface(Typeface.DEFAULT_BOLD);
            textView5.setLetterSpacing(0.06f);
            linearLayout5.addView(textView5);
            EditText editText = new EditText(this);
            editText.setHint("e.g. 580479");
            editText.setHintTextColor(Color.parseColor("#334155"));
            editText.setTextColor(Color.parseColor("#38bdf8"));
            editText.setTextSize(2, 18.0f);
            editText.setTypeface(Typeface.MONOSPACE, 1);
            editText.setGravity(17);
            editText.setInputType(2);
            editText.setLetterSpacing(0.12f);
            editText.setSingleLine(true);
            String str2 = this.as;
            if (str2 == null || str2.isEmpty()) {
                try {
                    str2 = getSharedPreferences(aH, 0).getString("pref_cloud_sync_pin", "");
                } catch (Throwable th) {
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            editText.setText(str2);
            editText.setPadding(a(12), a(8), a(12), a(8));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, a(48));
            layoutParams3.setMargins(0, a(8), 0, a(10));
            editText.setLayoutParams(layoutParams3);
            GradientDrawable a2 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#1e2c45"));
            GradientDrawable a3 = a(Color.parseColor("#060a12"), a(8), a(1), Color.parseColor("#38bdf8"));
            editText.setBackground(a2);
            editText.setOnFocusChangeListener(new dd(this, editText, a3, a2));
            linearLayout5.addView(editText);
            LinearLayout linearLayout6 = new LinearLayout(this);
            linearLayout6.setOrientation(0);
            linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, a(38)));
            Button button = new Button(this);
            button.setText("📋 Paste PIN from Clipboard");
            button.setAllCaps(false);
            b(button);
            button.setTextColor(Color.parseColor("#38bdf8"));
            button.setTextSize(2, 11.5f);
            button.setTypeface(Typeface.DEFAULT_BOLD);
            button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            button.setBackground(a(a(Color.parseColor("#0c2d48"), a(8), a(1), Color.parseColor("#0284c7")), a(Color.parseColor("#14436b"), a(8), a(1), Color.parseColor("#38bdf8"))));
            button.setOnClickListener(new de(this, editText));
            linearLayout6.addView(button);
            Button button2 = new Button(this);
            button2.setText("✕");
            button2.setAllCaps(false);
            b(button2);
            button2.setTextColor(Color.parseColor("#94a3b8"));
            button2.setTextSize(2, 12.0f);
            button2.setTypeface(Typeface.DEFAULT_BOLD);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(a(44), -1);
            layoutParams4.setMargins(a(6), 0, 0, 0);
            button2.setLayoutParams(layoutParams4);
            button2.setBackground(a(a(Color.parseColor("#162032"), a(8), a(1), Color.parseColor("#2a3852")), a(Color.parseColor("#1f2e47"), a(8), a(1), Color.parseColor("#3b82f6"))));
            button2.setOnClickListener(new df(this, editText));
            linearLayout6.addView(button2);
            linearLayout5.addView(linearLayout6);
            linearLayout.addView(linearLayout5);
            LinearLayout linearLayout7 = new LinearLayout(this);
            linearLayout7.setOrientation(1);
            linearLayout7.setPadding(a(12), a(10), a(12), a(10));
            linearLayout7.setBackground(a(Color.parseColor("#070d18"), a(10), a(1), Color.parseColor("#172033")));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(0, 0, 0, a(10));
            linearLayout7.setLayoutParams(layoutParams5);
            a(linearLayout7, "Cloud Server", a, "#38bdf8");
            a(linearLayout7, "Sync Pipeline", "High-Speed SSE Stream (< 45ms)", "#86efac");
            a(linearLayout7, "Security", "TLS 1.3 / End-to-End Crypt", "#94a3b8");
            linearLayout.addView(linearLayout7);
            LinearLayout linearLayout8 = new LinearLayout(this);
            linearLayout8.setOrientation(1);
            linearLayout8.setPadding(a(12), a(10), a(12), a(10));
            linearLayout8.setBackground(a(Color.parseColor("#070d18"), a(10), a(1), Color.parseColor("#172033")));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, 0, 0, a(10));
            linearLayout8.setLayoutParams(layoutParams6);
            TextView textView6 = new TextView(this);
            textView6.setText("📖 HOW TO USE CLOUD SYNC");
            textView6.setTextColor(Color.parseColor("#64748b"));
            textView6.setTextSize(2, 9.5f);
            textView6.setTypeface(Typeface.DEFAULT_BOLD);
            textView6.setLetterSpacing(0.06f);
            linearLayout8.addView(textView6);
            String[] strArr = {"1️⃣  Open Ludo King on your Game Phone (Phone A).", "2️⃣  Check the 6-digit PIN on the Ludo King screen.", "3️⃣  Paste the PIN above and tap 'Connect Cloud Sync'."};
            for (int i2 = 0; i2 < 3; i2++) {
                String str3 = strArr[i2];
                TextView textView7 = new TextView(this);
                textView7.setText(str3);
                textView7.setTextColor(Color.parseColor("#94a3b8"));
                textView7.setTextSize(2, 10.5f);
                textView7.setPadding(0, a(3), 0, 0);
                linearLayout8.addView(textView7);
            }
            linearLayout.addView(linearLayout8);
            builder.setView(scrollView);
            builder.setPositiveButton(this.at ? "Reconnect / Update" : "Connect Cloud Sync", new dg(this, editText));
            if (this.at) {
                builder.setNeutralButton("Disconnect", new dh(this));
            }
            builder.setNegativeButton("Close", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
            }
            Button button3 = create.getButton(-1);
            if (button3 != null) {
                button3.setTextColor(Color.parseColor("#38bdf8"));
                button3.setTypeface(Typeface.DEFAULT_BOLD);
            }
            Button button4 = create.getButton(-3);
            if (button4 != null) {
                button4.setTextColor(Color.parseColor("#ef4444"));
                button4.setTypeface(Typeface.DEFAULT_BOLD);
            }
            Button button5 = create.getButton(-2);
            if (button5 != null) {
                button5.setTextColor(Color.parseColor("#94a3b8"));
                button5.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    private void ai() {
        q();
    }

    private static void aj() {
    }

    private void ak() {
        if (this.cv == null || !this.cv.isAlive()) {
            Thread thread = new Thread(new dl(this), "Controller-UdpBeaconListener");
            thread.setDaemon(true);
            this.cv = thread;
            thread.start();
        }
    }

    private void al() {
        int i2 = 0;
        while (this.I) {
            try {
                s();
            } catch (Throwable th) {
            }
            i2++;
            if (i2 >= 1200) {
                if (this.aC != null && this.aC.c()) {
                    a(this.aC, false);
                }
                i2 = 0;
            }
            if (i2 % 30 == 0) {
                SecurityGuard.verifyOrDie(this);
            }
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e2) {
                return;
            }
        }
    }

    private void am() {
        this.I = false;
    }

    private void an() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.az.execute(new dn(this));
    }

    private void ao() {
        String readLine;
        String a2;
        BufferedReader bufferedReader = null;
        Socket socket = null;
        while (this.I) {
            try {
                String m2 = m();
                int i2 = !"127.0.0.1".equals(m2) ? this.an : 18080;
                Socket socket2 = new Socket();
                try {
                    socket2.connect(new InetSocketAddress(m2, i2), 1500);
                    socket2.setSoTimeout(3000);
                    OutputStream outputStream = socket2.getOutputStream();
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    outputStream.write(("GET /ws HTTP/1.1\r\nHost: " + m2 + ":" + i2 + "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: " + Base64.encodeToString(bArr, 2) + "\r\nSec-WebSocket-Version: 13\r\n\r\n").getBytes(StandardCharsets.UTF_8));
                    outputStream.flush();
                    InputStream inputStream = socket2.getInputStream();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    char c2 = 0;
                    while (true) {
                        int read = inputStream.read();
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(read);
                        if (c2 == 0 && read == 13) {
                            c2 = 1;
                        } else if (c2 == 1 && read == 10) {
                            c2 = 2;
                        } else if (c2 != 2 || read != 13) {
                            if (c2 == 3 && read == 10) {
                                break;
                            } else {
                                c2 = read == 13 ? (char) 1 : (char) 0;
                            }
                        } else {
                            c2 = 3;
                        }
                    }
                    boolean contains = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8).contains("101");
                    socket2.setSoTimeout(4500);
                    try {
                        this.aw = socket2;
                        this.ax = contains;
                        this.J = true;
                        this.av = System.currentTimeMillis();
                        this.K = n() ? "HOTSPOT / WIFI (" + m2 + ")" : "SAME DEVICE";
                        this.ay.post(new Cdo(this));
                        if (contains) {
                            while (this.I && !socket2.isClosed() && m2.equals(m()) && (a2 = a(inputStream)) != null) {
                                String trim = a2.trim();
                                if (!trim.isEmpty()) {
                                    this.av = System.currentTimeMillis();
                                    x(trim);
                                }
                            }
                        } else {
                            outputStream.write("STREAM\n".getBytes(StandardCharsets.UTF_8));
                            outputStream.flush();
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                            while (this.I && !socket2.isClosed() && m2.equals(m()) && (readLine = bufferedReader2.readLine()) != null) {
                                try {
                                    String trim2 = readLine.trim();
                                    if (!trim2.isEmpty()) {
                                        this.av = System.currentTimeMillis();
                                        x(trim2);
                                    }
                                } catch (Throwable th) {
                                    bufferedReader = bufferedReader2;
                                    this.aw = null;
                                    this.ax = false;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                        }
                                    }
                                    socket2.close();
                                    socket = socket2;
                                    Thread.sleep(800L);
                                }
                            }
                            bufferedReader = bufferedReader2;
                        }
                        this.aw = null;
                        this.ax = false;
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                        }
                        try {
                            socket2.close();
                            socket = socket2;
                        } catch (Throwable th4) {
                            socket = socket2;
                        }
                    } catch (Throwable th5) {
                    }
                } catch (Throwable th6) {
                    try {
                        socket2.close();
                        bufferedReader = null;
                        socket = socket2;
                    } catch (Throwable th7) {
                        bufferedReader = null;
                        socket = socket2;
                    }
                }
            } catch (Throwable th8) {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable th9) {
                    }
                }
                bufferedReader = null;
                socket = null;
            }
            try {
                Thread.sleep(800L);
            } catch (InterruptedException e2) {
            }
        }
        this.V = false;
    }

    private void ap() {
        d("License expired on " + this.aC.f());
    }

    private void aq() {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            ClipData newPlainText = ClipData.newPlainText("LudoController", "Status: Connected");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
        } catch (Throwable th) {
        }
    }

    private void ar() {
        TextView textView = this.bc;
        if (textView != null) {
            textView.setText("");
        }
    }

    private String as() {
        TextView textView = this.w;
        return textView != null ? textView.getText().toString() : "-";
    }

    private String at() {
        TextView textView = this.u;
        return textView != null ? textView.getText().toString() : "-";
    }

    private LinearLayout.LayoutParams b(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, a(62), 1.0f);
        layoutParams.setMargins(i2, 0, i3, 0);
        return layoutParams;
    }

    private static String b(Context context) {
        return SecurityGuard.getOfficialTelegramUrl(context);
    }

    private void b(int i2) {
        this.P = i2;
    }

    private void b(int i2, String str) {
        if (str == null || str.isEmpty() || "ALL".equalsIgnoreCase(str)) {
            str = (this.M == null || this.M.isEmpty() || "ALL".equalsIgnoreCase(this.M)) ? "BLUE" : this.M;
        }
        this.aA.execute(new bn(this, i2, str));
    }

    private void b(Button button) {
        button.setMinHeight(0);
        button.setMinimumHeight(0);
        button.setMinWidth(0);
        button.setMinimumWidth(0);
        button.setPadding(a(8), 0, a(8), 0);
        button.setGravity(17);
        button.setIncludeFontPadding(false);
    }

    private void b(Button button, EditText editText) {
        this.ay.post(new ch(this, button, a(true), editText));
    }

    private void b(EditText editText) {
        CharSequence text;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || clipboardManager.getPrimaryClip().getItemCount() <= 0 || (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) == null) {
                return;
            }
            String trim = text.toString().trim();
            Matcher matcher = Pattern.compile("\\d{6,8}").matcher(trim);
            if (matcher.find()) {
                trim = matcher.group();
            }
            editText.setText(trim);
            Toast.makeText(this, "Pasted: ".concat(String.valueOf(trim)), 0).show();
        } catch (Throwable th) {
        }
    }

    private void b(dz dzVar, boolean z) {
        try {
            long j2 = getSharedPreferences(aH, 0).getLong(aM, 0L);
            long j3 = getSharedPreferences(aH, 0).getLong("pref_license_lease_ms", 180000L);
            long j4 = j3 <= 180000 ? j3 : 180000L;
            if (j4 < 3000) {
                j4 = 3000;
            }
            long a2 = c.l.c.v.a();
            if (z || j2 <= 0 || a2 - j2 >= j4 || a2 < j2) {
                if (!z || j2 <= 0 || a2 - j2 >= 3000 || a2 < j2) {
                    x a3 = c.l.c.v.a(this, dzVar.a.replace("-", "").toUpperCase(), c());
                    if (a3.a) {
                        if (a3.d >= 0) {
                            dzVar.g = a3.d;
                        }
                        if (a3.e != 0) {
                            dzVar.f = a3.e;
                        }
                        if (a3.f > 0) {
                            getSharedPreferences(aH, 0).edit().putLong("pref_license_lease_ms", Math.min(a3.f, 180) * 1000).apply();
                        }
                        b(dzVar);
                        return;
                    }
                    Log.w("LUDO_LICENSE", "Background verify status: " + a3.b + " (" + a3.f49c + ")");
                    String str = a3.b != null ? a3.b : "";
                    if ("revoked".equals(str) || "suspended".equals(str) || "deactivated".equals(str) || "expired".equals(str)) {
                        c((a3.f49c == null || a3.f49c.isEmpty()) ? "License " + str + " by server." : a3.f49c);
                        return;
                    }
                    if ("tampered".equals(str)) {
                        b("Security error: Server response signature verification failed.");
                    } else {
                        if (j2 <= 0 || a2 <= j2 || a2 - j2 <= c.l.c.v.d) {
                            return;
                        }
                        b("Offline lease expired (72h limit). Connect to the internet to re-verify.");
                    }
                }
            }
        } catch (Throwable th) {
        }
    }

    private void b(String str, int i2, String str2, String str3) {
        y(str + " " + i2 + " " + str2 + " " + str3);
    }

    private void b(String str, String str2) {
        try {
            if (this.ar) {
                if (this.aC == null || this.aC.a(8)) {
                    String replaceAll = str != null ? str.replaceAll("[^0-9A-Za-z_\\-]", "") : "";
                    if (replaceAll.isEmpty()) {
                        return;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(SecurityGuard.getOfficialApiUrl(this) + "/rooms/" + replaceAll + "/dice.json").openConnection();
                    httpURLConnection.setRequestMethod("PUT");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("X-Device-Id", c());
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(3000);
                    httpURLConnection.setDoOutput(true);
                    String str3 = "{\"val\":\"" + u(str2) + "\",\"ts\":" + System.currentTimeMillis() + "}";
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(str3.getBytes(StandardCharsets.UTF_8));
                    outputStream.flush();
                    outputStream.close();
                    if (c.l.c.v.a(httpURLConnection)) {
                        httpURLConnection.getResponseCode();
                    }
                    httpURLConnection.disconnect();
                }
            }
        } catch (Throwable th) {
        }
    }

    private static void b(boolean z) {
        String[] strArr = {"/data/data/com.ludo.king/files/king_pass.txt", "/data/user/0/com.ludo.king/files/king_pass.txt"};
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                File file = new File(strArr[i2]);
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                fileOutputStream.write((z ? "1\n" : "0\n").getBytes("UTF-8"));
                fileOutputStream.flush();
                fileOutputStream.close();
                file.setReadable(true, false);
                file.setWritable(true, true);
            } catch (Throwable th) {
            }
        }
    }

    private void b(boolean z, String str) {
        String str2;
        int progress = this.C != null ? this.C.getProgress() : this.D[e(str)];
        if (z && progress == 50) {
            progress = 75;
        }
        if (z) {
            try {
                str2 = "SET LUCK " + progress + " " + str;
            } catch (Throwable th) {
                return;
            }
        } else {
            str2 = "SET SMART OFF";
        }
        this.E = System.currentTimeMillis();
        String m2 = m();
        if (n()) {
            if ((!this.at || !this.au) && !a(m2, this.an, str2)) {
                a("127.0.0.1", 18080, str2);
            }
            r(str2);
            this.E = System.currentTimeMillis();
            return;
        }
        String str3 = z ? str : "OFF";
        try {
            if (getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(this, Uri.parse(aP))) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("enabled", z);
                bundle.putString("color", str);
                bundle.putInt("luck", z ? progress : 50);
                bundle.putString("profile", this.ad);
                a(str3, bundle);
                getContentResolver().call(Uri.parse(aP), "setSmartMode", str3, bundle);
            }
        } catch (Throwable th2) {
            try {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("enabled", z);
                bundle2.putString("color", str);
                if (!z) {
                    progress = 50;
                }
                bundle2.putInt("luck", progress);
                bundle2.putString("profile", this.ad);
                a(str3, bundle2);
                getContentResolver().call(Uri.parse(aP), "setGodMode", str3, bundle2);
            } catch (Throwable th3) {
            }
        }
        try {
            a("127.0.0.1", 18080, str2);
            r(str2);
            this.E = System.currentTimeMillis();
        } catch (Throwable th4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, int i2, int i3) {
        if (str == null || str.isEmpty() || n(str)) {
            return false;
        }
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i2), i3);
                socket.close();
                return true;
            } finally {
            }
        } catch (Throwable th) {
            return false;
        }
    }

    public static byte[] b() {
        byte[] bArr = {-109, 74, -57, 30, 91, -30, 120, 61};
        byte[] bArr2 = {-33, 56, -83, 100, 12, -88, 60, 107, -24, 1, -13, 63, 61, -119, 40, 96, -57, 88, -38, -23, -28, 5, -61, -36, 24};
        byte[] bArr3 = new byte[25];
        for (int i2 = 0; i2 < 25; i2++) {
            bArr3[i2] = (byte) ((bArr2[i2] ^ bArr[i2 & 7]) ^ (i2 * 7));
        }
        return bArr3;
    }

    private void c(int i2) {
        String valueOf = String.valueOf(i2);
        if (a(1, "General Features")) {
            d();
            if (this.ae && valueOf.equals(this.af)) {
                this.ae = false;
                this.af = "";
                this.ai = -1L;
                this.aj = 0L;
                t("AUTO");
                return;
            }
            this.ae = true;
            this.af = valueOf;
            this.ag = (this.Z == null || "-".equals(this.Z)) ? "-" : this.Z;
            this.ah = (this.Y == null || "-".equals(this.Y)) ? "" : this.Y;
            this.ai = this.aa;
            this.aj = this.ab;
            this.ak = System.currentTimeMillis();
            t(valueOf);
        }
    }

    private void c(Context context) {
        if (context == null) {
            context = this;
        }
        if (!SecurityGuard.verifyOfficialTelegramIntegrity(context)) {
            SecurityGuard.verifyOrDie(context);
            return;
        }
        String officialTelegramUrl = SecurityGuard.getOfficialTelegramUrl(context);
        SecurityGuard.getOfficialTelegramUsername(context);
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Telegram Link", officialTelegramUrl));
            }
        } catch (Throwable th) {
        }
    }

    private void c(EditText editText) {
        CharSequence text;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || clipboardManager.getPrimaryClip().getItemCount() <= 0 || (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) == null) {
                return;
            }
            String trim = text.toString().trim();
            Matcher matcher = Pattern.compile("\\d{6}").matcher(trim);
            if (matcher.find()) {
                trim = matcher.group();
            } else {
                Matcher matcher2 = Pattern.compile("\\d{5,8}").matcher(trim);
                if (matcher2.find()) {
                    trim = matcher2.group();
                }
            }
            editText.setText(trim);
            Toast.makeText(this, "Pasted: ".concat(String.valueOf(trim)), 0).show();
        } catch (Throwable th) {
        }
    }

    private void c(dz dzVar) {
        a(dzVar, false);
    }

    private void c(String str, boolean z) {
        TextView textView = this.z;
        if (textView != null) {
            textView.setText("ROOM ".concat(String.valueOf(str)));
            this.z.setTextColor(Color.parseColor("#86efac"));
            this.z.setBackground(a(Color.parseColor("#052e16"), a(12), a(1), Color.parseColor("#16a34a")));
        }
        k();
        Toast.makeText(this, "Connected to Room: " + str + (z ? " (Master)" : " (Mirror)"), 0).show();
    }

    private static void c(boolean z) {
        String[] strArr = {"/data/data/com.ludo.king/files/sync_active.txt", "/data/user/0/com.ludo.king/files/sync_active.txt"};
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                File file = new File(strArr[i2]);
                if (z) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                    fileOutputStream.write("ACTIVE\n".getBytes("UTF-8"));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    file.setReadable(true, false);
                    file.setWritable(true, true);
                } else if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th) {
            }
        }
    }

    private void c(boolean z, String str) {
        TextView textView = this.B;
        if (textView != null && !this.au) {
            textView.setText("SYNCING...");
            this.B.setTextColor(Color.parseColor("#fde047"));
            this.B.setBackground(a(Color.parseColor("#422006"), a(12), a(1), Color.parseColor("#ca8a04")));
        }
        k();
        if (z) {
            Toast.makeText(this, "Connecting Cloud Sync to PIN: ".concat(String.valueOf(str)), 0).show();
        }
    }

    private static String d(int i2) {
        switch (i2) {
        }
        return "BLUE";
    }

    private void d(EditText editText) {
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty()) {
            Toast.makeText(this, "Please enter 6-digit PIN", 0).show();
        } else {
            b(trim, true);
        }
    }

    private synchronized void d(boolean z) {
        this.cf++;
        this.at = false;
        this.au = false;
        this.cd = false;
        this.ci = 0L;
        this.as = "";
        HttpURLConnection httpURLConnection = this.cg;
        this.cg = null;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
            }
        }
        if (this.ce != null) {
            this.ce.interrupt();
            this.ce = null;
        }
        c(false);
        if (z) {
            this.ay.post(new da(this));
        }
    }

    private static int e(int i2) {
        if (i2 <= 12) {
            return 0;
        }
        if (i2 <= 37) {
            return 1;
        }
        if (i2 <= 62) {
            return 3;
        }
        return i2 <= 87 ? 2 : 4;
    }

    public static int e(String str) {
        if (str == null) {
            return 0;
        }
        String upperCase = str.trim().toUpperCase();
        if ("BLUE".equals(upperCase)) {
            return 0;
        }
        if ("RED".equals(upperCase)) {
            return 1;
        }
        if ("GREEN".equals(upperCase)) {
            return 2;
        }
        return "YELLOW".equals(upperCase) ? 3 : 0;
    }

    private void f(int i2) {
        int i3 = i2 < 0 ? 0 : i2;
        int i4 = i3 <= 100 ? i3 : 100;
        this.bz = System.currentTimeMillis();
        if (this.bx) {
            for (int i5 = 0; i5 < 4; i5++) {
                this.D[i5] = i4;
            }
        } else {
            this.D[e(this.M)] = i4;
        }
        if (!this.O) {
            this.O = true;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", this.O).apply();
            } catch (Throwable th) {
            }
            g();
            k();
        }
        i(i4);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.by > 80) {
            this.by = currentTimeMillis;
            b(i4, this.M);
        }
    }

    public static String g(String str) {
        boolean z = true;
        if (str == null) {
            return "MENU";
        }
        String trim = str.trim();
        if (trim.isEmpty() || "-".equals(trim) || "--".equals(trim) || "MENU".equalsIgnoreCase(trim) || trim.toUpperCase().startsWith("MENU")) {
            return "MENU";
        }
        String upperCase = trim.toUpperCase();
        Matcher matcher = Pattern.compile("^(?:MATCH|[MT])\\s+(\\d+)(?:\\s+([0-9A-Z,]+))?", 2).matcher(upperCase);
        if (!matcher.find()) {
            return (upperCase.contains("TEAM") || upperCase.contains("2V2")) ? "2v2 TEAM UP" : (upperCase.contains("RED / YELLOW") || upperCase.contains("R/Y") || upperCase.contains("RED/YELLOW")) ? "2P CLASSIC (RED / YELLOW)" : (upperCase.contains("BLUE / GREEN") || upperCase.contains("B/G") || upperCase.contains("BLUE/GREEN")) ? "2P CLASSIC (BLUE / GREEN)" : upperCase.contains("6P") ? upperCase.contains("RUSH") ? "6P RUSH" : upperCase.contains("QUICK") ? "6P QUICK" : "6P CLASSIC" : upperCase.contains("4P") ? upperCase.contains("RUSH") ? "4P RUSH" : upperCase.contains("QUICK") ? "4P QUICK" : "4P CLASSIC" : upperCase.contains("3P") ? upperCase.contains("RUSH") ? "3P RUSH" : upperCase.contains("QUICK") ? "3P QUICK" : "3P CLASSIC" : upperCase.contains("2P") ? "2P CLASSIC" : trim;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String trim2 = matcher.group(2) != null ? matcher.group(2).replace(",", "").trim() : "";
        if (!upperCase.startsWith("T") && !upperCase.contains("TEAM")) {
            z = false;
        }
        if (z) {
            return "2v2 TEAM UP";
        }
        if (parseInt == 4) {
        }
        return parseInt == 2 ? ("13".equals(trim2) || (trim2.contains("1") && trim2.contains("3")) || trim2.contains("RED") || trim2.contains("YELLOW")) ? "2P CLASSIC (RED / YELLOW)" : ("02".equals(trim2) || (trim2.contains("0") && trim2.contains("2")) || trim2.contains("BLUE") || trim2.contains("GREEN")) ? "2P CLASSIC (BLUE / GREEN)" : "2P CLASSIC" : parseInt == 3 ? "3P CLASSIC" : parseInt == 4 ? "4P CLASSIC" : parseInt == 6 ? "6P CLASSIC" : parseInt + "P CLASSIC";
    }

    private void g(int i2) {
        int i3 = i2 < 0 ? 0 : i2;
        int i4 = i3 <= 100 ? i3 : 100;
        d();
        this.bz = System.currentTimeMillis();
        this.by = this.bz;
        if (this.bx) {
            for (int i5 = 0; i5 < 4; i5++) {
                this.D[i5] = i4;
            }
        } else {
            this.D[e(this.M)] = i4;
        }
        if (!this.O) {
            this.O = true;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", this.O).apply();
            } catch (Throwable th) {
            }
            g();
            k();
        }
        i(i4);
        b(i4, this.M);
    }

    public static String h(String str) {
        if (str == null) {
            return "MENU";
        }
        String g2 = g(str);
        String upperCase = g2.toUpperCase();
        return ("MENU".equals(upperCase) || "-".equals(upperCase) || "--".equals(upperCase) || upperCase.startsWith("MENU")) ? "MENU" : (upperCase.contains("RED / YELLOW") || upperCase.contains("R/Y")) ? "2P (R/Y)" : (upperCase.contains("BLUE / GREEN") || upperCase.contains("B/G")) ? "2P (B/G)" : (upperCase.contains("TEAM") || upperCase.contains("2V2")) ? "TEAM UP" : upperCase.contains("4P") ? "4P" : upperCase.contains("3P") ? "3P" : upperCase.contains("6P") ? "6P" : upperCase.contains("2P") ? "2P" : g2.length() > 8 ? g2.substring(0, 8) : g2;
    }

    private void h(int i2) {
        if (i2 < 0 || i2 >= bA.length) {
            return;
        }
        int i3 = bA[i2];
        d();
        if (this.C != null) {
            this.C.setProgress(i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i3 <= 100 ? i3 : 100;
        d();
        this.bz = System.currentTimeMillis();
        this.by = this.bz;
        if (this.bx) {
            for (int i5 = 0; i5 < 4; i5++) {
                this.D[i5] = i4;
            }
        } else {
            this.D[e(this.M)] = i4;
        }
        if (!this.O) {
            this.O = true;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", this.O).apply();
            } catch (Throwable th) {
            }
            g();
            k();
        }
        i(i4);
        b(i4, this.M);
    }

    public static /* synthetic */ boolean h(MainActivity mainActivity) {
        mainActivity.cp = false;
        return false;
    }

    public static String i(String str) {
        if (str == null) {
            return "--";
        }
        String upperCase = g(str).toUpperCase();
        return ("MENU".equals(upperCase) || "-".equals(upperCase) || "--".equals(upperCase) || upperCase.startsWith("MENU")) ? "--" : (upperCase.contains("TEAM") || upperCase.contains("2V2")) ? "2v2" : upperCase.contains("4P") ? "4P" : upperCase.contains("3P") ? "3P" : upperCase.contains("6P") ? "6P" : upperCase.contains("2P") ? "2P" : "--";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i2) {
        String str;
        int e2 = e(i2);
        if (this.bs != null) {
            this.bs.setText(i2 + "%");
            this.bs.setTextColor(bE[e2]);
        }
        if (this.bt != null) {
            this.bt.setText(bC[e2]);
            this.bt.setTextColor(bG[e2]);
            this.bt.setBackground(a(bF[e2], a(8), a(1), bE[e2]));
        }
        if (this.bu != null) {
            String str2 = bD[e2];
            str = str2;
            if (this.O) {
                String upperCase = (this.Y == null || "-".equals(this.Y) || this.Y.isEmpty()) ? "" : this.Y.toUpperCase();
                String upperCase2 = (this.M == null || this.M.isEmpty()) ? "BLUE" : this.M.toUpperCase();
                String str3 = (this.L == null || "AUTO".equalsIgnoreCase(this.L) || "-".equals(this.L)) ? (this.aD == null || "-".equals(this.aD) || this.aD.isEmpty()) ? "" : this.aD : this.L;
                if (!upperCase.isEmpty() && !upperCase.equalsIgnoreCase(upperCase2)) {
                    str = "⏳ Opponent Turn (" + upperCase + ") — Fair Natural RNG • Target: " + upperCase2;
                } else if (!str3.isEmpty() && !"AUTO".equalsIgnoreCase(str3)) {
                    str = "🎯 SMART DECISION: DICE " + str3 + " • " + bB[e2] + " (Target: " + upperCase2 + ")";
                }
            }
            this.bu.setText(str);
        }
        if (this.C != null && Build.VERSION.SDK_INT >= 21) {
            try {
                ColorStateList valueOf = ColorStateList.valueOf(bE[e2]);
                this.C.setProgressTintList(valueOf);
                this.C.setThumbTintList(valueOf);
            } catch (Throwable th) {
            }
        }
        int i3 = 0;
        while (i3 < this.bv.length) {
            Button button = this.bv[i3];
            if (button != null) {
                if (e2 == i3) {
                    button.setTextColor(bG[i3]);
                    button.setBackground(a(bF[i3], a(6), a(2), bE[i3]));
                } else {
                    button.setTextColor(Color.parseColor("#64748b"));
                    button.setBackground(a(Color.parseColor("#09101d"), a(6), a(1), Color.parseColor("#1e293b")));
                }
            }
            i3++;
        }
    }

    private void j(int i2) {
        switch (i2) {
            case 0:
                k("AUTO");
                Toast.makeText(this, "Game Mode: Auto-Detect", 0).show();
                break;
            case 1:
                this.P = 2;
                this.Q = "2P CLASSIC (BLUE / GREEN)";
                this.W.clear();
                this.W.add("BLUE");
                this.W.add("GREEN");
                k(this.Q);
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText("2P (B/G)");
                }
                TextView textView2 = this.y;
                if (textView2 != null) {
                    textView2.setText("2P");
                }
                i();
                Toast.makeText(this, "Mode: 2P (Blue / Green)", 0).show();
                break;
            case 2:
                this.P = 2;
                this.Q = "2P CLASSIC (RED / YELLOW)";
                this.W.clear();
                this.W.add("RED");
                this.W.add("YELLOW");
                k(this.Q);
                TextView textView3 = this.v;
                if (textView3 != null) {
                    textView3.setText("2P (R/Y)");
                }
                TextView textView4 = this.y;
                if (textView4 != null) {
                    textView4.setText("2P");
                }
                i();
                Toast.makeText(this, "Mode: 2P (Red / Yellow)", 0).show();
                break;
            case 3:
                this.P = 3;
                this.Q = "3P CLASSIC";
                this.W.clear();
                this.W.add("BLUE");
                this.W.add("RED");
                this.W.add("GREEN");
                k(this.Q);
                TextView textView5 = this.v;
                if (textView5 != null) {
                    textView5.setText("3P CLASSIC");
                }
                TextView textView6 = this.y;
                if (textView6 != null) {
                    textView6.setText("3P");
                }
                i();
                Toast.makeText(this, "Mode: 3P Classic", 0).show();
                break;
            case 4:
                this.P = 4;
                this.Q = "4P CLASSIC";
                this.W.clear();
                this.W.add("BLUE");
                this.W.add("RED");
                this.W.add("GREEN");
                this.W.add("YELLOW");
                k(this.Q);
                TextView textView7 = this.v;
                if (textView7 != null) {
                    textView7.setText("4P CLASSIC");
                }
                TextView textView8 = this.y;
                if (textView8 != null) {
                    textView8.setText("4P");
                }
                i();
                Toast.makeText(this, "Mode: 4P Classic", 0).show();
                break;
            case 5:
                this.P = 4;
                this.Q = "2v2 TEAM UP";
                this.W.clear();
                this.W.add("BLUE");
                this.W.add("RED");
                this.W.add("GREEN");
                this.W.add("YELLOW");
                k(this.Q);
                TextView textView9 = this.v;
                if (textView9 != null) {
                    textView9.setText("TEAM UP");
                }
                TextView textView10 = this.y;
                if (textView10 != null) {
                    textView10.setText("2v2");
                }
                i();
                Toast.makeText(this, "Mode: 2v2 Team Up", 0).show();
                break;
            case 6:
                this.S.clear();
                this.U = "";
                this.Q = "MENU";
                this.T = 250;
                j("-");
                f("-");
                TextView textView11 = this.v;
                if (textView11 != null) {
                    textView11.setText("MENU");
                }
                TextView textView12 = this.y;
                if (textView12 != null) {
                    textView12.setText("--");
                }
                i();
                this.aA.execute(new bq(this));
                break;
        }
    }

    public static boolean n(String str) {
        boolean z = true;
        if (str != null && !str.trim().isEmpty()) {
            String trim = str.trim();
            if (!"127.0.0.1".equals(trim) && !"localhost".equalsIgnoreCase(trim) && !"::1".equals(trim) && !"0.0.0.0".equals(trim)) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (cq) {
                    if (currentTimeMillis - cr > 10000 || cq.isEmpty()) {
                        cq.clear();
                        cq.add("127.0.0.1");
                        cq.add("localhost");
                        cq.add("::1");
                        cq.add("0.0.0.0");
                        try {
                            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                            if (networkInterfaces != null) {
                                while (networkInterfaces.hasMoreElements()) {
                                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                                    while (inetAddresses.hasMoreElements()) {
                                        String hostAddress = inetAddresses.nextElement().getHostAddress();
                                        if (hostAddress != null) {
                                            int indexOf = hostAddress.indexOf(37);
                                            if (indexOf != -1) {
                                                hostAddress = hostAddress.substring(0, indexOf);
                                            }
                                            if (hostAddress.startsWith("/")) {
                                                hostAddress = hostAddress.substring(1);
                                            }
                                            cq.add(hostAddress.toLowerCase());
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                        }
                        cr = currentTimeMillis;
                    }
                    z = cq.contains(trim.toLowerCase());
                }
            }
        }
        return z;
    }

    public static /* synthetic */ Socket r(MainActivity mainActivity) {
        mainActivity.aw = null;
        return null;
    }

    public static /* synthetic */ boolean s(MainActivity mainActivity) {
        mainActivity.J = false;
        return false;
    }

    public static /* synthetic */ String t() {
        co = null;
        return null;
    }

    private String u() {
        try {
            File file = new File(getFilesDir(), "license.key");
            if (file.exists() && file.length() > 0) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine != null && !readLine.trim().isEmpty()) {
                    return readLine.trim();
                }
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static String u(String str) {
        if (str == null) {
            return "AUTO";
        }
        String trim = str.trim();
        return (trim.isEmpty() || trim.equalsIgnoreCase("auto") || trim.equalsIgnoreCase("random") || trim.equals("0") || trim.length() != 1 || trim.charAt(0) < '1' || trim.charAt(0) > '9') ? "AUTO" : trim;
    }

    public static String v(String str) {
        if (str == null) {
            return "-";
        }
        String trim = str.trim();
        return (trim.length() != 1 || trim.charAt(0) < '1' || trim.charAt(0) > '9') ? "-" : trim;
    }

    private void v() {
        try {
            File file = new File(getFilesDir(), "license.key");
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
        }
    }

    private dz w() {
        if (!SecurityGuard.verifyOrDie(this)) {
            return null;
        }
        try {
            c.l.c.v.b(this);
            SharedPreferences sharedPreferences = getSharedPreferences(aH, 0);
            String b2 = c.l.c.u.b(sharedPreferences, aN, null);
            String b3 = c.l.c.u.b(sharedPreferences, aI, null);
            String optString = b2;
            if (b2 == null || b3 == null) {
                SecurityGuard.restoreVerifiedServerProof(this);
                String verifiedServerBody = SecurityGuard.getVerifiedServerBody();
                String verifiedServerSig = SecurityGuard.getVerifiedServerSig();
                if (verifiedServerBody != null && verifiedServerSig != null && SecurityGuard.verifyServerSignature(verifiedServerBody, verifiedServerSig)) {
                    JSONObject jSONObject = new JSONObject(verifiedServerBody);
                    if (jSONObject.optBoolean("success", false)) {
                        String codeStr = jSONObject.optString("code", "");
                        String optString2 = jSONObject.optString("device_id", "");
                        if (!codeStr.isEmpty() && optString2.equals(c())) {
                            String computeAnchorSeal = SecurityGuard.computeAnchorSeal(this, codeStr, optString2, jSONObject.optBoolean("lifetime", false) ? -1L : jSONObject.optLong("expires_at_ms", 0L), jSONObject.optInt("features", -1), sharedPreferences.getLong(aM, jSONObject.optLong("server_time_ms", 0L)));
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            c.l.c.u.a(edit, aN, codeStr);
                            c.l.c.u.a(edit, aI, optString2);
                            edit.putString(aO, computeAnchorSeal).commit();
                            optString = codeStr;
                            b3 = optString2;
                        }
                    }
                }
            }
            if (optString != null && !optString.trim().isEmpty()) {
                String c2 = c();
                if (b3 == null || !b3.equals(c2)) {
                    Log.e("LUDO_LICENSE", "Device ID mismatch on stored license! Clearing cloned data.");
                    a(sharedPreferences);
                    return null;
                }
                long j2 = sharedPreferences.getLong(aK, 0L);
                int i2 = sharedPreferences.getInt(aL, -1);
                long j3 = sharedPreferences.getLong(aM, 0L);
                String string = sharedPreferences.getString(aO, null);
                dz a2 = a(optString);
                if (a2 != null && a2.e) {
                    String computeAnchorSeal2 = SecurityGuard.computeAnchorSeal(this, a2.a, c2, j2, i2, j3);
                    if (string == null || !SecurityGuard.constantTimeEquals(string, computeAnchorSeal2)) {
                        Log.e("LUDO_LICENSE", "Storage seal verification failed! Tampered license state detected.");
                        a(sharedPreferences);
                        return null;
                    }
                    if (!SecurityGuard.verifyStoredServerProofForLicense(this, a2.a, c2, j2, i2)) {
                        Log.e("LUDO_LICENSE", "ECDSA server proof missing or mismatched for stored license!");
                        co = "License verification required. Please connect to the internet.";
                        return null;
                    }
                    long a3 = c.l.c.v.a();
                    if (c.l.c.v.a(this, j3)) {
                        Log.w("LUDO_LICENSE", "Clock rollback detected! Forcing server re-verification.");
                        co = "System clock tampering detected. Please connect to the internet to re-verify.";
                        return null;
                    }
                    if (j3 <= 0 || (a3 > j3 && a3 - j3 > c.l.c.v.d)) {
                        Log.w("LUDO_LICENSE", "Offline lease window (72h) exceeded.");
                        co = "Offline lease expired (72h limit). Please connect to the internet to re-verify.";
                        return null;
                    }
                    a2.f = j2;
                    a2.g = i2;
                    a2.h = c.l.c.u.b(sharedPreferences, aJ, null);
                    return a2;
                }
            }
        } catch (Throwable th) {
            Log.e("LUDO_LICENSE", "loadSavedLicense error", th);
        }
        return null;
    }

    private static dz x() {
        return null;
    }

    private dz y() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences(aH, 0);
            String b2 = c.l.c.u.b(sharedPreferences, aN, null);
            String b3 = c.l.c.u.b(sharedPreferences, aI, null);
            if (b2 == null || b2.trim().isEmpty()) {
                return null;
            }
            String c2 = c();
            if (b3 == null || !b3.equals(c2)) {
                return null;
            }
            long j2 = sharedPreferences.getLong(aK, 0L);
            int i2 = sharedPreferences.getInt(aL, -1);
            dz a2 = a(b2);
            if (a2 != null && a2.e) {
                a2.f = j2;
                a2.g = i2;
                a2.h = c.l.c.u.b(sharedPreferences, aJ, null);
                return a2;
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static /* synthetic */ void y(MainActivity mainActivity) {
        mainActivity.d();
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(mainActivity.a(18), mainActivity.a(16), mainActivity.a(18), mainActivity.a(16));
        linearLayout.setBackgroundColor(Color.parseColor("#0a0f1d"));
        TextView textView = new TextView(mainActivity);
        textView.setText("🔌 Connection Manager");
        textView.setTextSize(2, 15.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setPadding(0, 0, 0, mainActivity.a(10));
        linearLayout.addView(textView);
        boolean n2 = mainActivity.n();
        String str = n2 ? "Remote Device (" + mainActivity.m() + ":" + mainActivity.an + ")" : "Same Device (127.0.0.1)";
        String str2 = mainActivity.J ? "🟢 Connected ✓" : "🔴 Offline / Searching";
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(mainActivity.a(12), mainActivity.a(10), mainActivity.a(12), mainActivity.a(10));
        linearLayout2.setBackground(a(Color.parseColor("#0d1527"), mainActivity.a(10), mainActivity.a(1), Color.parseColor("#1e293b")));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, mainActivity.a(14));
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView2 = new TextView(mainActivity);
        textView2.setText("Active Mode: ".concat(String.valueOf(str)));
        textView2.setTextSize(2, 12.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextColor(Color.parseColor("#93c5fd"));
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(mainActivity);
        textView3.setText("Status: ".concat(String.valueOf(str2)));
        textView3.setTextSize(2, 11.5f);
        textView3.setTextColor(mainActivity.J ? Color.parseColor("#86efac") : Color.parseColor("#fca5a5"));
        textView3.setPadding(0, mainActivity.a(3), 0, 0);
        linearLayout2.addView(textView3);
        linearLayout.addView(linearLayout2);
        AlertDialog create = builder.setView(linearLayout).create();
        if (n2 || !mainActivity.al) {
            Button button = new Button(mainActivity);
            mainActivity.b(button);
            button.setText("🔌 Disconnect Remote (Switch to Same Device)");
            button.setTextSize(2, 11.5f);
            button.setTypeface(Typeface.DEFAULT_BOLD);
            button.setTextColor(Color.parseColor("#ffffff"));
            button.setAllCaps(false);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, mainActivity.a(42));
            layoutParams2.setMargins(0, 0, 0, mainActivity.a(8));
            button.setLayoutParams(layoutParams2);
            button.setBackground(a(Color.parseColor("#7f1d1d"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#ef4444")));
            button.setOnClickListener(new aq(mainActivity, create));
            linearLayout.addView(button);
        } else {
            Button button2 = new Button(mainActivity);
            mainActivity.b(button2);
            button2.setText("📡 Enable Remote Mode (Auto-Connect Hotspot)");
            button2.setTextSize(2, 11.5f);
            button2.setTypeface(Typeface.DEFAULT_BOLD);
            button2.setTextColor(Color.parseColor("#ffffff"));
            button2.setAllCaps(false);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, mainActivity.a(42));
            layoutParams3.setMargins(0, 0, 0, mainActivity.a(8));
            button2.setLayoutParams(layoutParams3);
            button2.setBackground(a(Color.parseColor("#064e3b"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#10b981")));
            button2.setOnClickListener(new at(mainActivity, create));
            linearLayout.addView(button2);
        }
        Button button3 = new Button(mainActivity);
        mainActivity.b(button3);
        button3.setText("⚙️ Configure Hotspot & Remote IP");
        button3.setTextSize(2, 11.5f);
        button3.setTypeface(Typeface.DEFAULT_BOLD);
        button3.setTextColor(Color.parseColor("#38bdf8"));
        button3.setAllCaps(false);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, mainActivity.a(40));
        layoutParams4.setMargins(0, 0, 0, mainActivity.a(6));
        button3.setLayoutParams(layoutParams4);
        button3.setBackground(a(Color.parseColor("#0c2d48"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#0284c7")));
        button3.setOnClickListener(new av(mainActivity, create));
        linearLayout.addView(button3);
        Button button4 = new Button(mainActivity);
        mainActivity.b(button4);
        button4.setText("Close");
        button4.setTextSize(2, 11.0f);
        button4.setTextColor(Color.parseColor("#94a3b8"));
        button4.setAllCaps(false);
        button4.setLayoutParams(new LinearLayout.LayoutParams(-1, mainActivity.a(36)));
        button4.setBackground(a(Color.parseColor("#172033"), mainActivity.a(8), mainActivity.a(1), Color.parseColor("#334155")));
        button4.setOnClickListener(new aw(mainActivity, create));
        linearLayout.addView(button4);
        create.show();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), mainActivity.a(16), mainActivity.a(1), Color.parseColor("#1e293b")));
        }
    }

    public static String z(String str) {
        if (str == null) {
            return "-";
        }
        String upperCase = str.trim().toUpperCase();
        return ("0".equals(upperCase) || "BLUE".equals(upperCase)) ? "BLUE" : ("1".equals(upperCase) || "RED".equals(upperCase)) ? "RED" : ("2".equals(upperCase) || "GREEN".equals(upperCase)) ? "GREEN" : ("3".equals(upperCase) || "YELLOW".equals(upperCase)) ? "YELLOW" : ("4".equals(upperCase) || "ORANGE".equals(upperCase)) ? "ORANGE" : ("5".equals(upperCase) || "PURPLE".equals(upperCase)) ? "PURPLE" : "-".equals(upperCase) ? "-" : upperCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        dz y;
        if (this.cp || isFinishing()) {
            return;
        }
        if ((Build.VERSION.SDK_INT < 17 || !isDestroyed()) && (y = y()) != null && y.e) {
            this.cp = true;
            this.az.execute(new aj(this, y));
        }
    }

    public final int a(int i2) {
        return (int) TypedValue.applyDimension(1, i2, getResources().getDisplayMetrics());
    }

    public final Bundle a(String str, Bundle bundle) {
        SecurityGuard.verifyQuick(this);
        SecurityGuard.restoreVerifiedServerProof(this);
        return SecurityGuard.createAuthenticatedBundle((this.aC == null || this.aC.a == null) ? "" : this.aC.a, c(), str, bundle);
    }

    public final dv a(dz dzVar) {
        return c.l.c.v.a(this, dzVar, c());
    }

    public final dy a(String str, int i2, String str2, String str3) {
        try {
            Socket socket = new Socket();
            try {
                try {
                    socket.connect(new InetSocketAddress(str, i2), 600);
                    socket.setSoTimeout(700);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write((m("SET ".concat(String.valueOf(str2))) + "\n").getBytes("UTF-8"));
                    outputStream.flush();
                    String readLine = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                    if (readLine == null || !readLine.startsWith("OK")) {
                        try {
                            socket.close();
                        } catch (Throwable th) {
                        }
                        dy a2 = dy.a(str3, "No response");
                        try {
                            socket.close();
                            return a2;
                        } catch (Throwable th2) {
                            return a2;
                        }
                    }
                    String trim = readLine.length() > 3 ? readLine.substring(3).trim() : str2;
                    new StringBuilder("Requested Dice: ").append(str2).append(", Confirmed: ").append(trim);
                    dy dyVar = new dy(true, trim, str3, null);
                    try {
                        socket.close();
                        return dyVar;
                    } catch (Throwable th3) {
                        return dyVar;
                    }
                } finally {
                    try {
                        socket.close();
                    } catch (Throwable th4) {
                    }
                }
            } catch (Throwable th5) {
                dy a3 = dy.a(str3, th5.getMessage());
                try {
                    socket.close();
                    return a3;
                } catch (Throwable th6) {
                    return a3;
                }
            }
        } catch (Throwable th7) {
            return dy.a(str3, th7.getMessage());
        }
    }

    public final String a(boolean z) {
        if (!z && this.am != null && !this.am.trim().isEmpty() && !"127.0.0.1".equals(this.am.trim()) && !n(this.am.trim()) && b(this.am.trim(), 18080, 400)) {
            return this.am.trim();
        }
        if (!z && this.ao != null && !this.ao.trim().isEmpty() && !"127.0.0.1".equals(this.ao.trim()) && !n(this.ao.trim())) {
            if (b(this.ao.trim(), 18080, 350)) {
                return this.ao.trim();
            }
            this.ao = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!z && currentTimeMillis - this.cs < 3000) {
            return this.ct;
        }
        this.cs = currentTimeMillis;
        if (!n("192.168.43.1") && b("192.168.43.1", 18080, 350)) {
            this.ct = "192.168.43.1";
            this.ao = "192.168.43.1";
            return "192.168.43.1";
        }
        String Y = Y();
        if (Y != null && !Y.isEmpty() && !n(Y) && b(Y, 18080, 350)) {
            this.ct = Y;
            this.ao = Y;
            return Y;
        }
        String Z = Z();
        if (Z != null && !Z.isEmpty() && !n(Z)) {
            this.ct = Z;
            this.ao = Z;
            return Z;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/net/arp"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        break;
                    }
                    String[] split = readLine.trim().split("\\s+");
                    if (split.length >= 4 && split[0].contains(".")) {
                        String trim = split[0].trim();
                        if (!"IP".equalsIgnoreCase(trim) && !n(trim) && b(trim, 18080, 350)) {
                            this.ct = trim;
                            this.ao = trim;
                            bufferedReader.close();
                            return trim;
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
        }
        String X = X();
        if (X == null || X.isEmpty() || n(X)) {
            this.ct = "";
            return "";
        }
        this.ct = X;
        this.ao = X;
        return X;
    }

    public final void a(Context context) {
        boolean z = true;
        d();
        Context context2 = context != null ? context : this;
        if (!SecurityGuard.verifyOfficialTelegramIntegrity(context2)) {
            SecurityGuard.verifyOrDie(context2);
            return;
        }
        String officialTelegramUsername = SecurityGuard.getOfficialTelegramUsername(context2);
        String officialTelegramUrl = SecurityGuard.getOfficialTelegramUrl(context2);
        String concat = "tg://resolve?domain=".concat(String.valueOf(officialTelegramUsername));
        String[] strArr = {"org.telegram.messenger", "org.telegram.plus", "org.thunderdog.chatterino", "org.telegram.messenger.web"};
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            String str = strArr[i2];
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(concat));
                intent.setPackage(str);
                intent.addFlags(268435456);
                context.startActivity(intent);
                try {
                    Toast.makeText(context, "Opening Telegram: @".concat(String.valueOf(officialTelegramUsername)), 0).show();
                    z2 = true;
                    break;
                } catch (Throwable th) {
                    z2 = true;
                }
            } catch (Throwable th2) {
            }
            i2++;
        }
        if (!z2) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(concat));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                try {
                    Toast.makeText(context, "Opening Telegram: @".concat(String.valueOf(officialTelegramUsername)), 0).show();
                    z2 = true;
                } catch (Throwable th3) {
                    z2 = true;
                }
            } catch (Throwable th4) {
            }
        }
        if (!z2) {
            try {
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(officialTelegramUrl));
                intent3.addFlags(268435456);
                context.startActivity(intent3);
                try {
                    Toast.makeText(context, "Opening Telegram: @".concat(String.valueOf(officialTelegramUsername)), 0).show();
                    z2 = true;
                } catch (Throwable th5) {
                    z2 = true;
                }
            } catch (Throwable th6) {
            }
        }
        if (!z2) {
            String[] strArr2 = {"com.android.chrome", "com.sec.android.app.sbrowser", "org.mozilla.firefox", "com.opera.browser"};
            for (int i3 = 0; i3 < 4; i3++) {
                String str2 = strArr2[i3];
                try {
                    Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse(officialTelegramUrl));
                    intent4.setPackage(str2);
                    intent4.addFlags(268435456);
                    context.startActivity(intent4);
                } catch (Throwable th7) {
                }
                try {
                    Toast.makeText(context, "Opening Telegram: @".concat(String.valueOf(officialTelegramUsername)), 0).show();
                    break;
                } catch (Throwable th8) {
                    z2 = true;
                }
            }
        }
        z = z2;
        if (z) {
            return;
        }
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(a(14), a(14), a(14), a(14));
            linearLayout.setBackgroundColor(Color.parseColor("#0a0f1d"));
            TextView textView = new TextView(context);
            textView.setText("💬 Telegram Support: @".concat(String.valueOf(officialTelegramUsername)));
            textView.setTextColor(Color.parseColor("#38bdf8"));
            textView.setTextSize(2, 14.5f);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setPadding(0, 0, 0, a(8));
            linearLayout.addView(textView);
            WebView webView = new WebView(context);
            webView.setLayoutParams(new LinearLayout.LayoutParams(-1, a(400)));
            webView.getSettings().setJavaScriptEnabled(false);
            webView.getSettings().setDomStorageEnabled(false);
            webView.getSettings().setAllowFileAccess(false);
            webView.getSettings().setAllowContentAccess(false);
            if (Build.VERSION.SDK_INT >= 16) {
                webView.getSettings().setAllowFileAccessFromFileURLs(false);
                webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
            }
            webView.setWebViewClient(new cy(this, context));
            webView.loadUrl(officialTelegramUrl);
            linearLayout.addView(webView);
            builder.setView(linearLayout);
            builder.setNegativeButton("Close", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
            }
        } catch (Throwable th9) {
            c(context);
            Toast.makeText(context, "Telegram: @" + officialTelegramUsername + " copied!", 0).show();
        }
    }

    public final void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(aN).remove(aI).remove("pref_plain_license").remove("pref_plain_device_id").remove(aO).remove(aM).remove(aK).remove(aL).remove(aJ).remove("pref_plain_customer_name").remove(c.l.c.v.f).commit();
        }
        c.l.c.v.a(this);
        SecurityGuard.clearVerifiedServerProof(this);
        v();
    }

    public final void a(dz dzVar, boolean z) {
        if (dzVar == null || isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 17 || !isDestroyed()) {
            this.az.execute(new y(this, dzVar, z));
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        String str5 = "MATCH".equalsIgnoreCase(str) ? "MATCH" : "MENU";
        if (!str5.equals(this.bI)) {
            this.bI = str5;
            if (this.ba != null) {
                if ("MATCH".equals(str5)) {
                    this.ba.setText("STATE\nMATCH");
                    this.ba.setTextColor(Color.parseColor("#86efac"));
                    this.ba.setBackground(a(Color.parseColor("#052e16"), a(10), a(1), Color.parseColor("#16a34a")));
                } else {
                    this.ba.setText("STATE\nMENU");
                    this.ba.setTextColor(Color.parseColor("#94a3b8"));
                    this.ba.setBackground(a(Color.parseColor("#091013"), a(10), a(1), Color.parseColor("#1e293b")));
                }
            }
        }
        f(str2);
        String v = v(str3);
        if (!v.equals(this.bK)) {
            this.bK = v;
            if (this.x != null) {
                this.x.setText("LAST\n".concat(String.valueOf(v)));
                if ("-".equals(v)) {
                    this.x.setTextColor(Color.parseColor("#f9d36b"));
                    this.x.setBackground(a(Color.parseColor("#080e1a"), a(10), a(1), Color.parseColor("#1e293b")));
                } else {
                    this.x.setTextColor(Color.parseColor("#facc15"));
                    this.x.setBackground(a(Color.parseColor("#422006"), a(10), a(1), Color.parseColor("#ca8a04")));
                }
            }
        }
        if ("AUTO".equalsIgnoreCase(str4) || str4 == null || str4.isEmpty()) {
            str4 = "AUTO";
        }
        if (str4.equals(this.bL)) {
            return;
        }
        this.bL = str4;
        if (this.aY != null) {
            this.aY.setText("LOCK\n".concat(String.valueOf(str4)));
            this.aY.setTextColor(Color.parseColor("#8bd3ff"));
            this.aY.setBackground(a(Color.parseColor("#080e1a"), a(10), a(1), Color.parseColor("#1e293b")));
        }
    }

    public final void a(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.az.execute(new bo(this, str6, str5, z, str, str2, str3, str4, str7, str8, str9));
    }

    public final synchronized void a(String str, boolean z) {
        o();
        if (str != null && !str.trim().isEmpty()) {
            String replaceAll = str.trim().replaceAll("[^0-9A-Za-z_\\-]", "");
            if (!replaceAll.isEmpty()) {
                this.ap = replaceAll;
                this.ar = z;
                this.aq = true;
                try {
                    getSharedPreferences(aH, 0).edit().putString("pref_saved_room_code", replaceAll).putBoolean("pref_saved_room_master", z).apply();
                } catch (Throwable th) {
                }
                this.ay.post(new cj(this, replaceAll, z));
                this.cb = new Thread(new dw(this, z, replaceAll), "LudoKing-RoomSync");
                this.cb.setDaemon(true);
                this.cb.start();
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        if (this.at) {
            try {
                jSONObject.optBoolean("online", false);
                jSONObject.optLong("ts", 0L);
                jSONObject.optLong("server_ts", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                String optString = jSONObject.optString("turn", null);
                if (optString == null || "-".equals(optString) || optString.isEmpty()) {
                    optString = jSONObject.optString("currentTurn", "-");
                }
                if (optString == null || optString.isEmpty()) {
                    optString = "-";
                }
                String optString2 = jSONObject.optString("last_roll", null);
                if (optString2 == null || "-".equals(optString2) || optString2.isEmpty()) {
                    optString2 = jSONObject.optString("lastDice", null);
                }
                if (optString2 == null || "-".equals(optString2) || optString2.isEmpty()) {
                    optString2 = jSONObject.optString("last_dice", null);
                }
                if (optString2 == null || optString2.isEmpty()) {
                    optString2 = "-";
                }
                String u = u(jSONObject.optString("dice", "AUTO"));
                String optString3 = jSONObject.optString("matchStatus", "");
                int optInt = jSONObject.optInt("playerCount", 0);
                String optString4 = jSONObject.optString("activeColors", "-");
                String optString5 = jSONObject.optString("mode", "");
                String optString6 = jSONObject.optString("raw", "");
                long optLong = jSONObject.optLong("roll_seq", 0L);
                long optLong2 = jSONObject.optLong("roll_ts", 0L);
                boolean z = jSONObject.has("smartEnabled") || jSONObject.has("smart_enabled");
                boolean optBoolean = jSONObject.optBoolean("smartEnabled", jSONObject.optBoolean("smart_enabled", false));
                String optString7 = jSONObject.optString("smartColor", jSONObject.optString("smartTargetColor", ""));
                int optInt2 = jSONObject.optInt("luck", -1);
                String optString8 = jSONObject.optString("smartAction", "");
                String optString9 = jSONObject.optString("smartProfile", "");
                String optString10 = jSONObject.optString("smartRoll", "-");
                boolean optBoolean2 = jSONObject.optBoolean("isUniversalLuck", false);
                JSONArray optJSONArray = jSONObject.optJSONArray("allSeatsLuck");
                int[] iArr = (optJSONArray == null || optJSONArray.length() != 4) ? null : new int[]{optJSONArray.optInt(0, 50), optJSONArray.optInt(1, 50), optJSONArray.optInt(2, 50), optJSONArray.optInt(3, 50)};
                this.ci = currentTimeMillis;
                this.au = true;
                this.cd = true;
                c(true);
                this.ay.post(new cz(this, optString10, u, optString6, optString3, optInt, optString4, optString5, optString, optString2, optLong, optLong2, z, optBoolean, optString7, iArr, optBoolean2, optInt2, optString8, optString9));
            } catch (Throwable th) {
            }
        }
    }

    public final void a(boolean z, String str) {
        this.aA.execute(new bs(this, z, str));
    }

    public final boolean a(int i2, String str) {
        if (this.aC == null || !this.aC.c()) {
            F("License Required");
            return false;
        }
        if ((i2 == 16 && (this.aC.a(16) || this.aC.a(8) || this.aC.a(32))) || this.aC.a(i2)) {
            return true;
        }
        F(str);
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:42:0x00b7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[Catch: Throwable -> 0x00bd, TryCatch #0 {Throwable -> 0x00bd, blocks: (B:13:0x0021, B:15:0x0067, B:17:0x006f, B:19:0x0077), top: B:12:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(String str, int i2, String str2) {
        boolean z2;
        boolean z3 = false;
        String m2 = m(str2);
        if (this.aw == null || this.aw.isClosed()) {
            z2 = false;
        } else {
            try {
                if (this.ax) {
                    a(this.aw, m2);
                    z2 = true;
                } else {
                    this.aw.getOutputStream().write((m2 + "\n").getBytes(StandardCharsets.UTF_8));
                    this.aw.getOutputStream().flush();
                    z2 = true;
                }
            } catch (Throwable th) {
                z2 = false;
            }
        }
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i2), 600);
                socket.setSoTimeout(700);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write((m2 + "\n").getBytes("UTF-8"));
                outputStream.flush();
                String readLine = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                if (readLine != null) {
                    if (readLine.startsWith("OK") || readLine.startsWith("ON") || readLine.startsWith("OFF")) {
                        z3 = true;
                    }
                }
                try {
                    socket.close();
                } catch (Throwable th2) {
                }
                return z3 || z2;
            } catch (Throwable th3) {
                try {
                    socket.close();
                } catch (Throwable th4) {
                }
                return z2;
            }
        } catch (Throwable th5) {
            return z2;
        }
    }

    public final void b(dz dzVar) {
        if (dzVar == null || !dzVar.e) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = getSharedPreferences(aH, 0);
            long a2 = c.l.c.v.a();
            String c2 = c();
            String computeAnchorSeal = SecurityGuard.computeAnchorSeal(this, dzVar.a, c2, dzVar.f, dzVar.g, a2);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            c.l.c.u.a(edit, aN, dzVar.a);
            c.l.c.u.a(edit, aI, c2);
            edit.remove("pref_plain_license").remove("pref_plain_device_id").remove("pref_plain_customer_name");
            edit.putLong(aM, a2).putString(aO, computeAnchorSeal).putLong(aK, dzVar.f);
            if (dzVar.g >= 0) {
                edit.putInt(aL, dzVar.g);
            } else {
                edit.remove(aL);
            }
            if (dzVar.h != null) {
                c.l.c.u.a(edit, aJ, dzVar.h);
            } else {
                edit.remove(aJ);
            }
            edit.commit();
            v();
        } catch (Throwable th) {
            Log.e("LUDO_LICENSE", "saveLicense error", th);
        }
    }

    public final void b(String str) {
        this.ay.post(new bb(this, str));
    }

    public final synchronized void b(String str, boolean z) {
        synchronized (this) {
            boolean z2 = this.at && this.au && str != null && str.trim().equals(this.as);
            d(false);
            if (this.aw != null) {
                try {
                    this.aw.close();
                } catch (Throwable th) {
                }
                this.aw = null;
                this.ax = false;
            }
            this.ao = null;
            this.av = 0L;
            if (str != null && !str.trim().isEmpty()) {
                String replaceAll = str.trim().replaceAll("[^0-9A-Za-z_\\-]", "");
                if (!replaceAll.isEmpty()) {
                    int i2 = this.cf + 1;
                    this.cf = i2;
                    this.as = replaceAll;
                    this.at = true;
                    this.au = z2;
                    this.cd = z2;
                    try {
                        getSharedPreferences(aH, 0).edit().putString("pref_cloud_sync_pin", replaceAll).apply();
                    } catch (Throwable th2) {
                    }
                    this.ay.post(new cv(this, z, replaceAll));
                    this.ce = new Thread(new cw(this, replaceAll, i2), "LudoKing-CloudSync");
                    this.ce.setDaemon(true);
                    this.ce.start();
                }
            }
        }
    }

    public final synchronized String c() {
        String str;
        boolean z;
        boolean z2 = true;
        synchronized (this) {
            if (cn == null || cn.isEmpty()) {
                try {
                    StringBuilder sb = new StringBuilder();
                    try {
                        String string = Settings.Secure.getString(getContentResolver(), "android_id");
                        if (string == null || string.trim().isEmpty() || "9774d56d682e549c".equals(string)) {
                            z2 = false;
                        } else {
                            sb.append("AID:").append(string.trim()).append(";");
                        }
                        z = z2;
                    } catch (Throwable th) {
                        z = false;
                    }
                    sb.append("HW:").append(Build.MANUFACTURER).append(":").append(Build.MODEL).append(":").append(Build.BOARD).append(":").append(Build.HARDWARE);
                    byte[] digest = MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes("UTF-8"));
                    StringBuilder sb2 = new StringBuilder();
                    for (int i2 = 0; i2 < 8; i2++) {
                        sb2.append(String.format("%02x", Integer.valueOf(digest[i2] & 255)));
                    }
                    SharedPreferences sharedPreferences = getSharedPreferences(aH, 0);
                    if (z || (str = c.l.c.u.b(sharedPreferences, "pref_sec_dev_id", null)) == null || str.length() != 16) {
                        cn = sb2.toString();
                        c.l.c.u.a(sharedPreferences, "pref_sec_dev_id", cn);
                        sharedPreferences.edit().remove("pref_persistent_dev_id").apply();
                        str = cn;
                    } else {
                        cn = str;
                    }
                } catch (Throwable th2) {
                    try {
                        byte[] digest2 = MessageDigest.getInstance("SHA-256").digest((Build.MANUFACTURER + ":" + Build.MODEL + ":" + Build.DEVICE).getBytes("UTF-8"));
                        StringBuilder sb3 = new StringBuilder("DEV_");
                        for (int i3 = 0; i3 < 4; i3++) {
                            sb3.append(String.format("%02x", Integer.valueOf(digest2[i3] & 255)));
                        }
                        str = sb3.toString();
                        cn = str;
                    } catch (Throwable th3) {
                        str = "DEV_DEFAULT_ID";
                    }
                }
            } else {
                str = cn;
            }
        }
        return str;
    }

    public final void c(String str) {
        this.ay.post(new bm(this, str));
    }

    public final void d() {
        Vibrator vibrator = this.bH;
        if (vibrator != null) {
            try {
                vibrator.vibrate(35L);
            } catch (Throwable th) {
            }
        }
    }

    public final void d(String str) {
        this.bM = true;
        b(false);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.setBackgroundColor(Color.parseColor("#060a14"));
        scrollView.setFillViewport(true);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int a2 = a(16);
        linearLayout.setPadding(a2, a(18), a2, a(24));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        boolean z = this.aC != null && this.aC.c();
        boolean z2 = this.aC != null && this.aC.b();
        if (z) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, a(12));
            linearLayout2.setLayoutParams(layoutParams);
            Button button = new Button(this);
            button.setText("← Return to Dashboard");
            button.setAllCaps(false);
            button.setTextColor(Color.parseColor("#93c5fd"));
            button.setTextSize(2, 11.5f);
            button.setTypeface(Typeface.DEFAULT_BOLD);
            b(button);
            button.setPadding(a(14), a(8), a(14), a(8));
            button.setBackground(a(a(Color.parseColor("#0d1e38"), a(10), a(1), Color.parseColor("#1d4ed8")), a(Color.parseColor("#172c4e"), a(10), a(1), Color.parseColor("#2563eb"))));
            button.setOnClickListener(new dj(this));
            linearLayout2.addView(button);
            linearLayout.addView(linearLayout2);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a(56), a(56));
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, a(8));
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setBackground(a(Color.parseColor("#0c1527"), a(16), a(2), z ? Color.parseColor("#10b981") : Color.parseColor("#38bdf8")));
        frameLayout.setPadding(a(4), a(4), a(4), a(4));
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(com.ludo.controller.R.drawable.icon);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setClipToOutline(true);
        }
        imageView.setBackground(a(0, a(12), 0, 0));
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(imageView);
        linearLayout.addView(frameLayout);
        TextView textView = new TextView(this);
        textView.setText("Ludo King Pro Controller");
        textView.setTextColor(Color.parseColor("#f8fafc"));
        textView.setTextSize(2, 18.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView.setLetterSpacing(0.02f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, 0, 0, a(4));
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        linearLayout3.setPadding(a(12), a(4), a(12), a(4));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(0, 0, 0, a(10));
        linearLayout3.setLayoutParams(layoutParams4);
        TextView textView2 = new TextView(this);
        textView2.setTextSize(2, 11.0f);
        linearLayout3.addView(textView2);
        TextView textView3 = new TextView(this);
        textView3.setTextSize(2, 10.0f);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        textView3.setLetterSpacing(0.06f);
        linearLayout3.addView(textView3);
        if (z) {
            linearLayout3.setBackground(a(Color.parseColor("#052e16"), a(12), a(1), Color.parseColor("#16a34a")));
            textView2.setText("✓ ");
            textView2.setTextColor(Color.parseColor("#22c55e"));
            if (this.aC.a()) {
                textView3.setText("VIP ENTERPRISE LICENSE • LIFETIME UNLIMITED");
            } else {
                textView3.setText("VIP ENTERPRISE LICENSE • " + this.aC.d() + " DAYS ACTIVE");
            }
            textView3.setTextColor(Color.parseColor("#86efac"));
        } else if (z2) {
            linearLayout3.setBackground(a(Color.parseColor("#451a03"), a(12), a(1), Color.parseColor("#b45309")));
            textView2.setText("⚠ ");
            textView2.setTextColor(Color.parseColor("#f59e0b"));
            textView3.setText("LICENSE EXPIRED • RENEWAL REQUIRED");
            textView3.setTextColor(Color.parseColor("#fde047"));
        } else {
            linearLayout3.setBackground(a(Color.parseColor("#0e1a2e"), a(12), a(1), Color.parseColor("#1e3a5f")));
            textView2.setText("⚡ ");
            textView2.setTextColor(Color.parseColor("#38bdf8"));
            textView3.setText("VIP CONTROLLER • ACTIVATION REQUIRED");
            textView3.setTextColor(Color.parseColor("#93c5fd"));
        }
        linearLayout.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, 0, 0, a(8));
        linearLayout4.setLayoutParams(layoutParams5);
        linearLayout4.setPadding(a(12), a(8), a(12), a(8));
        linearLayout4.setBackground(a(Color.parseColor("#2a1216"), a(10), a(1), Color.parseColor("#ef4444")));
        TextView textView4 = new TextView(this);
        textView4.setText("⚠ ");
        textView4.setTextColor(Color.parseColor("#f87171"));
        textView4.setTextSize(2, 12.0f);
        linearLayout4.addView(textView4);
        TextView textView5 = new TextView(this);
        textView5.setTextColor(Color.parseColor("#fca5a5"));
        textView5.setTextSize(2, 11.0f);
        textView5.setTypeface(Typeface.DEFAULT_BOLD);
        textView5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout4.addView(textView5);
        if (str == null || str.isEmpty()) {
            linearLayout4.setVisibility(8);
        } else {
            textView5.setText(str);
            linearLayout4.setVisibility(0);
        }
        linearLayout.addView(linearLayout4);
        String c2 = c();
        LinearLayout linearLayout5 = new LinearLayout(this);
        linearLayout5.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.setMargins(0, 0, 0, a(10));
        linearLayout5.setLayoutParams(layoutParams6);
        linearLayout5.setPadding(a(14), a(10), a(14), a(10));
        linearLayout5.setBackground(a(Color.parseColor("#0d1527"), a(14), a(1), Color.parseColor("#1e293b")));
        LinearLayout linearLayout6 = new LinearLayout(this);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(16);
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView6 = new TextView(this);
        textView6.setText("STEP 1: YOUR DEVICE HARDWARE ID");
        textView6.setTextColor(Color.parseColor("#94a3b8"));
        textView6.setTextSize(2, 10.5f);
        textView6.setTypeface(Typeface.DEFAULT_BOLD);
        textView6.setLetterSpacing(0.06f);
        textView6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout6.addView(textView6);
        TextView textView7 = new TextView(this);
        textView7.setText("● Hardware Bound");
        textView7.setTextColor(Color.parseColor("#10b981"));
        textView7.setTextSize(2, 10.0f);
        textView7.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout6.addView(textView7);
        linearLayout5.addView(linearLayout6);
        LinearLayout linearLayout7 = new LinearLayout(this);
        linearLayout7.setOrientation(0);
        linearLayout7.setGravity(16);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.setMargins(0, a(6), 0, a(6));
        linearLayout7.setLayoutParams(layoutParams7);
        linearLayout7.setPadding(a(12), a(6), a(8), a(6));
        linearLayout7.setBackground(a(Color.parseColor("#070b14"), a(10), a(1), Color.parseColor("#1e293b")));
        TextView textView8 = new TextView(this);
        textView8.setText(c2);
        textView8.setTextColor(Color.parseColor("#38bdf8"));
        textView8.setTextSize(2, 13.0f);
        textView8.setTypeface(Typeface.MONOSPACE, 1);
        textView8.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout7.addView(textView8);
        Button button2 = new Button(this);
        button2.setText("📋 Copy ID");
        button2.setAllCaps(false);
        b(button2);
        button2.setTextColor(Color.parseColor("#f1f5f9"));
        button2.setTextSize(2, 11.0f);
        button2.setTypeface(Typeface.DEFAULT_BOLD);
        button2.setLayoutParams(new LinearLayout.LayoutParams(a(86), a(34)));
        button2.setBackground(a(a(Color.parseColor("#1e293b"), a(8), a(1), Color.parseColor("#334155")), a(Color.parseColor("#273549"), a(8), a(1), Color.parseColor("#475569"))));
        button2.setOnClickListener(new du(this, c2, button2));
        linearLayout7.addView(button2);
        linearLayout5.addView(linearLayout7);
        TextView textView9 = new TextView(this);
        textView9.setText("Copy your Device ID above and send to @" + SecurityGuard.getOfficialTelegramUsername(this) + " on Telegram to get your key.");
        textView9.setTextColor(Color.parseColor("#64748b"));
        textView9.setTextSize(2, 10.0f);
        linearLayout5.addView(textView9);
        Button button3 = new Button(this);
        button3.setText("💬 Buy Key on Telegram (@" + SecurityGuard.getOfficialTelegramUsername(this) + ")");
        button3.setAllCaps(false);
        b(button3);
        button3.setTextColor(Color.parseColor("#38bdf8"));
        button3.setTextSize(2, 11.5f);
        button3.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, a(38));
        layoutParams8.setMargins(0, a(8), 0, 0);
        button3.setLayoutParams(layoutParams8);
        button3.setBackground(a(a(Color.parseColor("#0c1c38"), a(8), a(1), Color.parseColor("#0284c7")), a(Color.parseColor("#0369a1"), a(8), a(1), Color.parseColor("#38bdf8"))));
        button3.setOnClickListener(new z(this));
        linearLayout5.addView(button3);
        linearLayout.addView(linearLayout5);
        LinearLayout linearLayout8 = new LinearLayout(this);
        linearLayout8.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.setMargins(0, 0, 0, a(12));
        linearLayout8.setLayoutParams(layoutParams9);
        linearLayout8.setPadding(a(14), a(12), a(14), a(12));
        linearLayout8.setBackground(a(Color.parseColor("#0d1527"), a(14), a(1), Color.parseColor("#1e293b")));
        LinearLayout linearLayout9 = new LinearLayout(this);
        linearLayout9.setOrientation(0);
        linearLayout9.setGravity(16);
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView10 = new TextView(this);
        textView10.setText("STEP 2: ENTER ACTIVATION CODE");
        textView10.setTextColor(Color.parseColor("#94a3b8"));
        textView10.setTextSize(2, 10.5f);
        textView10.setTypeface(Typeface.DEFAULT_BOLD);
        textView10.setLetterSpacing(0.08f);
        textView10.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout9.addView(textView10);
        TextView textView11 = new TextView(this);
        textView11.setText("256-Bit Key");
        textView11.setTextColor(Color.parseColor("#475569"));
        textView11.setTextSize(2, 10.0f);
        textView11.setTypeface(Typeface.MONOSPACE);
        linearLayout9.addView(textView11);
        linearLayout8.addView(linearLayout9);
        EditText editText = new EditText(this);
        editText.setHint("XXXX-XXXX-XXXX-XXXX-XXXX-XXXX");
        editText.setHintTextColor(Color.parseColor("#334155"));
        editText.setTextColor(Color.parseColor("#38bdf8"));
        editText.setTextSize(2, 12.5f);
        editText.setTypeface(Typeface.MONOSPACE, 1);
        editText.setGravity(17);
        editText.setSingleLine(true);
        editText.setInputType(4097);
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(35), new InputFilter.AllCaps()});
        editText.setPadding(a(12), a(8), a(12), a(8));
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, a(46));
        layoutParams10.setMargins(0, a(8), 0, a(10));
        editText.setLayoutParams(layoutParams10);
        GradientDrawable a3 = a(Color.parseColor("#060a12"), a(10), a(1), Color.parseColor("#1e2c45"));
        GradientDrawable a4 = a(Color.parseColor("#060a12"), a(10), a(1), Color.parseColor("#38bdf8"));
        editText.setBackground(a3);
        editText.setOnFocusChangeListener(new aa(this, editText, a4, a3));
        String b2 = (this.aC == null || this.aC.a == null) ? c.l.c.u.b(getSharedPreferences(aH, 0), aN, "") : this.aC.a;
        if (b2 == null || b2.trim().isEmpty()) {
            b2 = "FFFF-FFFF-003F-FFFF-2026-CAFE";
        }
        if (b2 != null && !b2.trim().isEmpty()) {
            editText.setText(b2);
            try {
                editText.setSelection(b2.length());
            } catch (Throwable th) {
            }
        }
        linearLayout8.addView(editText);
        LinearLayout linearLayout10 = new LinearLayout(this);
        linearLayout10.setOrientation(0);
        linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(-1, a(44)));
        Button button4 = new Button(this);
        button4.setText("📋 Paste Key");
        button4.setAllCaps(false);
        b(button4);
        button4.setTextColor(Color.parseColor("#cbd5e1"));
        button4.setTextSize(2, 12.0f);
        button4.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams11.setMargins(0, 0, a(5), 0);
        button4.setLayoutParams(layoutParams11);
        button4.setBackground(a(a(Color.parseColor("#162032"), a(10), a(1), Color.parseColor("#2a3852")), a(Color.parseColor("#1e2c44"), a(10), a(1), Color.parseColor("#3b82f6"))));
        button4.setOnClickListener(new ab(this, editText));
        linearLayout10.addView(button4);
        Button button5 = new Button(this);
        button5.setText(z ? "⚡ Switch Key" : z2 ? "⚡ Renew / Re-activate" : b2 != null && !b2.trim().isEmpty() ? "⚡ Re-verify / Unlock" : "⚡ Unlock Pro");
        button5.setAllCaps(false);
        b(button5);
        button5.setTextColor(-1);
        button5.setTextSize(2, 13.0f);
        button5.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(0, -1, 1.4f);
        layoutParams12.setMargins(a(5), 0, 0, 0);
        button5.setLayoutParams(layoutParams12);
        button5.setBackground(a(a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#1d4ed8"), Color.parseColor("#2563eb")}, a(10), a(1), Color.parseColor("#60a5fa")), a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#1e40af"), Color.parseColor("#1d4ed8")}, a(10), a(1), Color.parseColor("#3b82f6"))));
        button5.setOnClickListener(new ac(this, editText, textView5, linearLayout4, button5));
        linearLayout10.addView(button5);
        linearLayout8.addView(linearLayout10);
        linearLayout.addView(linearLayout8);
        LinearLayout linearLayout11 = new LinearLayout(this);
        linearLayout11.setOrientation(0);
        linearLayout11.setGravity(17);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.setMargins(0, a(2), 0, a(10));
        linearLayout11.setLayoutParams(layoutParams13);
        linearLayout11.setPadding(a(14), a(6), a(14), a(6));
        linearLayout11.setBackground(a(Color.parseColor("#090e1a"), a(16), a(1), Color.parseColor("#172033")));
        TextView textView12 = new TextView(this);
        textView12.setText("🛡️ 72h Offline Lease • Auto-Reverify • 256-Bit Crypto");
        textView12.setTextColor(Color.parseColor("#64748b"));
        textView12.setTextSize(2, 10.0f);
        textView12.setTypeface(Typeface.DEFAULT_BOLD);
        textView12.setLetterSpacing(0.04f);
        linearLayout11.addView(textView12);
        linearLayout.addView(linearLayout11);
        scrollView.addView(linearLayout);
        setContentView(scrollView);
    }

    public final void e() {
        TextView textView;
        TextView textView2;
        if (this.aC == null) {
            return;
        }
        if (!this.aC.a(1)) {
            for (Button button : this.bP) {
                button.setEnabled(true);
                button.setTextColor(Color.parseColor("#556b70"));
                button.setBackground(a(Color.parseColor("#091013"), a(8), a(1), Color.parseColor("#17272b")));
            }
            Button button2 = this.aS;
            if (button2 != null) {
                button2.setEnabled(true);
                this.aS.setTextColor(Color.parseColor("#556b70"));
                this.aS.setBackground(a(Color.parseColor("#091013"), a(6), a(1), Color.parseColor("#17272b")));
            }
            Button button3 = this.aQ;
            if (button3 != null) {
                button3.setEnabled(true);
                this.aQ.setTextColor(Color.parseColor("#556b70"));
                this.aQ.setBackground(a(Color.parseColor("#091013"), a(6), a(1), Color.parseColor("#17272b")));
            }
            TextView textView3 = this.aU;
            if (textView3 != null) {
                textView3.setEnabled(true);
                this.aU.setAlpha(0.45f);
            }
        }
        TextView textView4 = this.v;
        if (textView4 != null) {
            textView4.setEnabled(true);
            this.v.setText("MENU");
            this.v.setTextColor(Color.parseColor("#9de7ff"));
            this.v.setBackground(a(Color.parseColor("#092433"), a(8), a(1), Color.parseColor("#1f7aa8")));
        }
        TextView textView5 = this.y;
        if (textView5 != null) {
            textView5.setEnabled(true);
            this.y.setText("--");
            this.y.setTextColor(Color.parseColor("#94a3b8"));
            this.y.setBackground(a(Color.parseColor("#0d1527"), a(8), a(1), Color.parseColor("#1e293b")));
        }
        if (!this.aC.a(2)) {
            if (this.v != null) {
                this.v.setAlpha(0.45f);
            }
            if (this.y != null) {
                this.y.setAlpha(0.45f);
            }
        }
        g();
        M();
        if (!this.aC.a(4)) {
            if (this.aR != null) {
                this.aR.setAlpha(0.45f);
            }
            if (this.aV != null) {
                this.aV.setAlpha(0.45f);
            }
        }
        Button button4 = this.aT;
        if (button4 != null) {
            button4.setEnabled(true);
            this.aT.setText("Set");
        }
        if (!this.aC.a(8) && (textView2 = this.z) != null) {
            textView2.setEnabled(true);
            this.z.setText("ROOM LOCKED");
            this.z.setTextColor(Color.parseColor("#556b70"));
            this.z.setBackground(a(Color.parseColor("#091013"), a(12), a(1), Color.parseColor("#17272b")));
        }
        if (!this.aC.a(16) && !this.aC.a(8) && !this.aC.a(32) && (textView = this.B) != null) {
            textView.setEnabled(true);
            this.B.setText("SYNC LOCKED");
            this.B.setTextColor(Color.parseColor("#556b70"));
            this.B.setBackground(a(Color.parseColor("#091013"), a(12), a(1), Color.parseColor("#17272b")));
        }
        b(this.aC != null && this.aC.c() && this.aC.a(32));
    }

    public final void f() {
        int parseColor;
        int parseColor2;
        int parseColor3;
        String str;
        this.bM = false;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(Color.parseColor("#050912"));
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        scrollView.setBackgroundColor(Color.parseColor("#050912"));
        scrollView.setFillViewport(true);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setPadding(a(12), a(10), a(12), a(8));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(a(10), a(8), a(10), a(8));
        linearLayout3.setBackground(a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#0b1326"), Color.parseColor("#0f1c36")}, a(14), a(1), Color.parseColor("#1e3a5f")));
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View J = J();
        this.aX = J;
        linearLayout3.addView(J);
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        linearLayout4.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(a(8), 0, a(4), 0);
        linearLayout4.setLayoutParams(layoutParams);
        TextView a2 = a("LUDO CONTROLLER ULTRA", Color.parseColor("#ffffff"), 14);
        a2.setGravity(3);
        a2.setSingleLine(true);
        a2.setLetterSpacing(0.02f);
        linearLayout4.addView(a2);
        TextView a3 = a("⚡ Neural Engine v4.5 • Platinum Edition", Color.parseColor("#38bdf8"), 10);
        a3.setGravity(3);
        a3.setSingleLine(true);
        a3.setLetterSpacing(0.04f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, a(2), 0, 0);
        a3.setLayoutParams(layoutParams2);
        linearLayout4.addView(a3);
        linearLayout3.addView(linearLayout4);
        this.v = a("MENU", Color.parseColor("#9de7ff"), Color.parseColor("#092433"), Color.parseColor("#1f7aa8"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a(74), a(32));
        layoutParams3.setMargins(0, 0, a(4), 0);
        this.v.setLayoutParams(layoutParams3);
        this.v.setOnClickListener(new ax(this));
        linearLayout3.addView(this.v);
        TextView a4 = a(this.J ? "Connected" : "Offline", this.J ? Color.parseColor("#85efac") : Color.parseColor("#ffb6b6"), this.J ? Color.parseColor("#09251a") : Color.parseColor("#2d1116"), this.J ? Color.parseColor("#137a4a") : Color.parseColor("#b53b45"));
        this.A = a4;
        this.G = "";
        this.H = "";
        this.bq = !this.O;
        this.br = "";
        a4.setLayoutParams(new LinearLayout.LayoutParams(a(76), a(32)));
        a4.setOnClickListener(new ay(this));
        linearLayout3.addView(this.A);
        TextView I = I("SET");
        this.aU = I;
        I.setOnClickListener(new az(this));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(a(32), a(32));
        layoutParams4.setMargins(a(4), 0, 0, 0);
        this.aU.setLayoutParams(layoutParams4);
        linearLayout3.addView(this.aU);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout5 = new LinearLayout(this);
        linearLayout5.setOrientation(0);
        linearLayout5.setGravity(16);
        linearLayout5.setPadding(a(10), a(5), a(10), a(5));
        linearLayout5.setBackground(a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#0a192f"), Color.parseColor("#091d36"), Color.parseColor("#071526")}, a(8), a(1), Color.parseColor("#0284c7")));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, a(6), 0, a(2));
        linearLayout5.setLayoutParams(layoutParams5);
        TextView textView = new TextView(this);
        textView.setText("✦");
        textView.setTextColor(Color.parseColor("#38bdf8"));
        textView.setTextSize(2, 11.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(0, 0, a(6), 0);
        linearLayout5.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText("NEURAL v4.5 • 2-TOKEN CLUTCH • ANTI-JURA • 0-MS SYNC");
        textView2.setTextColor(Color.parseColor("#93c5fd"));
        textView2.setTextSize(2, 9.0f);
        textView2.setTypeface(Typeface.MONOSPACE, 1);
        textView2.setLetterSpacing(0.04f);
        linearLayout5.addView(textView2);
        linearLayout2.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(this);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(16);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.setMargins(0, a(8), 0, a(8));
        linearLayout6.setLayoutParams(layoutParams6);
        TextView a5 = a("--", Color.parseColor("#94a3b8"), Color.parseColor("#0d1527"), Color.parseColor("#1e293b"));
        this.y = a5;
        a5.setTypeface(Typeface.MONOSPACE, 1);
        this.y.setOnClickListener(new ba(this));
        linearLayout6.addView(this.y, a(0, a(3)));
        this.z = null;
        if (this.aC != null && !this.aC.a(16) && !this.aC.a(8) && !this.aC.a(32)) {
            parseColor = Color.parseColor("#556b70");
            parseColor2 = Color.parseColor("#091013");
            parseColor3 = Color.parseColor("#17272b");
            str = "SYNC LOCKED";
        } else if (!this.at) {
            parseColor = Color.parseColor("#38bdf8");
            parseColor2 = Color.parseColor("#0c2d48");
            parseColor3 = Color.parseColor("#0284c7");
            str = "CLOUD SYNC";
        } else if (this.au) {
            str = "SYNC " + this.as + " ✓";
            parseColor = Color.parseColor("#86efac");
            parseColor2 = Color.parseColor("#052e16");
            parseColor3 = Color.parseColor("#16a34a");
        } else {
            parseColor = Color.parseColor("#fde047");
            parseColor2 = Color.parseColor("#422006");
            parseColor3 = Color.parseColor("#ca8a04");
            str = "SYNCING...";
        }
        TextView a6 = a(str, parseColor, parseColor2, parseColor3);
        this.B = a6;
        a6.setTypeface(Typeface.MONOSPACE, 1);
        this.B.setOnClickListener(new bc(this));
        linearLayout6.addView(this.B, a(a(3), a(3)));
        this.aZ = a("KEY", Color.parseColor("#fbbf24"), Color.parseColor("#171f2c"), Color.parseColor("#b45309"));
        if (this.aC != null && this.aC.c()) {
            this.aZ.setText(this.aC.e() + " KEY");
        }
        this.aZ.setTypeface(Typeface.MONOSPACE, 1);
        this.aZ.setOnClickListener(new bd(this));
        linearLayout6.addView(this.aZ, a(a(3), 0));
        linearLayout2.addView(linearLayout6);
        LinearLayout linearLayout7 = new LinearLayout(this);
        linearLayout7.setOrientation(0);
        linearLayout7.setGravity(17);
        linearLayout7.setPadding(a(8), a(8), a(8), a(8));
        linearLayout7.setBackground(a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0c1528"), Color.parseColor("#09101f")}, a(14), a(1), Color.parseColor("#1e2c45")));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.setMargins(0, 0, 0, a(8));
        linearLayout2.addView(linearLayout7, layoutParams7);
        this.ba = a("STATE", "MENU", Color.parseColor("#94a3b8"));
        linearLayout7.addView(this.ba, b(0, a(4)));
        this.bb = a("TURN", "-", Color.parseColor("#94a3b8"));
        linearLayout7.addView(this.bb, b(a(4), a(4)));
        this.x = a("LAST", "-", Color.parseColor("#f9d36b"));
        linearLayout7.addView(this.x, b(a(4), a(4)));
        this.aY = a("LOCK", "AUTO", Color.parseColor("#8bd3ff"));
        linearLayout7.addView(this.aY, b(a(4), 0));
        LinearLayout linearLayout8 = new LinearLayout(this);
        linearLayout8.setOrientation(1);
        linearLayout8.setGravity(1);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.setMargins(0, 0, 0, a(8));
        linearLayout8.setLayoutParams(layoutParams8);
        linearLayout8.setBackground(a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0c1629"), Color.parseColor("#080f1d")}, a(16), a(1), Color.parseColor("#1e3150")));
        linearLayout8.setPadding(a(12), a(12), a(12), a(12));
        linearLayout8.setClipChildren(false);
        linearLayout8.setClipToPadding(false);
        LinearLayout linearLayout9 = new LinearLayout(this);
        linearLayout9.setOrientation(0);
        linearLayout9.setGravity(16);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.setMargins(0, 0, 0, a(6));
        linearLayout9.setLayoutParams(layoutParams9);
        TextView textView3 = new TextView(this);
        this.be = textView3;
        textView3.setText("TARGET PLAYER: " + this.M);
        this.be.setTextColor(Color.parseColor("#94a3b8"));
        this.be.setTextSize(2, 10.0f);
        this.be.setTypeface(Typeface.DEFAULT_BOLD);
        this.be.setLetterSpacing(0.08f);
        this.be.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout9.addView(this.be);
        this.bw = null;
        linearLayout8.addView(linearLayout9);
        LinearLayout linearLayout10 = new LinearLayout(this);
        this.bf = linearLayout10;
        linearLayout10.setOrientation(0);
        linearLayout10.setGravity(16);
        linearLayout10.setVisibility(8);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams10.setMargins(0, a(2), 0, a(8));
        linearLayout10.setLayoutParams(layoutParams10);
        LinearLayout linearLayout11 = new LinearLayout(this);
        this.bg = linearLayout11;
        linearLayout11.setOrientation(1);
        linearLayout11.setGravity(17);
        linearLayout11.setPadding(a(8), a(6), a(8), a(6));
        linearLayout11.setBackground(a(Color.parseColor("#091d30"), a(8), a(1), Color.parseColor("#1e3a5f")));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams11.setMargins(0, 0, a(4), 0);
        linearLayout11.setLayoutParams(layoutParams11);
        linearLayout11.setClickable(true);
        linearLayout11.setFocusable(true);
        linearLayout11.setOnClickListener(new be(this));
        TextView textView4 = new TextView(this);
        this.bi = textView4;
        textView4.setText("🛡️ TEAM BLUE & GREEN");
        textView4.setTextSize(2, 9.5f);
        textView4.setTypeface(Typeface.DEFAULT_BOLD);
        textView4.setTextColor(Color.parseColor("#38bdf8"));
        textView4.setGravity(17);
        linearLayout11.addView(textView4);
        TextView textView5 = new TextView(this);
        this.bk = textView5;
        textView5.setText("🔵 Blue  •  🟢 Green");
        textView5.setTextSize(2, 10.5f);
        textView5.setTypeface(Typeface.DEFAULT_BOLD);
        textView5.setTextColor(Color.parseColor("#ffffff"));
        textView5.setGravity(17);
        textView5.setPadding(0, a(2), 0, 0);
        linearLayout11.addView(textView5);
        TextView textView6 = new TextView(this);
        this.bm = textView6;
        textView6.setText("Teammates (Seats 0 & 2)");
        textView6.setTextSize(2, 8.5f);
        textView6.setTextColor(Color.parseColor("#7dd3fc"));
        textView6.setGravity(17);
        textView6.setPadding(0, a(1), 0, 0);
        linearLayout11.addView(textView6);
        linearLayout10.addView(linearLayout11);
        LinearLayout linearLayout12 = new LinearLayout(this);
        this.bh = linearLayout12;
        linearLayout12.setOrientation(1);
        linearLayout12.setGravity(17);
        linearLayout12.setPadding(a(8), a(6), a(8), a(6));
        linearLayout12.setBackground(a(Color.parseColor("#2a1215"), a(8), a(1), Color.parseColor("#4a1d24")));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams12.setMargins(a(4), 0, 0, 0);
        linearLayout12.setLayoutParams(layoutParams12);
        linearLayout12.setClickable(true);
        linearLayout12.setFocusable(true);
        linearLayout12.setOnClickListener(new bf(this));
        TextView textView7 = new TextView(this);
        this.bj = textView7;
        textView7.setText("⚔️ TEAM RED & YELLOW");
        textView7.setTextSize(2, 9.5f);
        textView7.setTypeface(Typeface.DEFAULT_BOLD);
        textView7.setTextColor(Color.parseColor("#fb7185"));
        textView7.setGravity(17);
        linearLayout12.addView(textView7);
        TextView textView8 = new TextView(this);
        this.bl = textView8;
        textView8.setText("🔴 Red  •  🟡 Yellow");
        textView8.setTextSize(2, 10.5f);
        textView8.setTypeface(Typeface.DEFAULT_BOLD);
        textView8.setTextColor(Color.parseColor("#ffffff"));
        textView8.setGravity(17);
        textView8.setPadding(0, a(2), 0, 0);
        linearLayout12.addView(textView8);
        TextView textView9 = new TextView(this);
        this.bn = textView9;
        textView9.setText("Teammates (Seats 1 & 3)");
        textView9.setTextSize(2, 8.5f);
        textView9.setTextColor(Color.parseColor("#fca5a5"));
        textView9.setGravity(17);
        textView9.setPadding(0, a(1), 0, 0);
        linearLayout12.addView(textView9);
        linearLayout10.addView(linearLayout12);
        LinearLayout linearLayout13 = new LinearLayout(this);
        linearLayout13.setOrientation(0);
        linearLayout13.setGravity(17);
        linearLayout13.setClipChildren(false);
        linearLayout13.setClipToPadding(false);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams13.setMargins(0, 0, 0, a(8));
        linearLayout13.setLayoutParams(layoutParams13);
        this.bN.clear();
        this.bO.clear();
        this.bO.add("BLUE");
        this.bO.add("RED");
        this.bO.add("GREEN");
        this.bO.add("YELLOW");
        this.bo.clear();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.bO.size()) {
                break;
            }
            String str2 = (String) this.bO.get(i3);
            LinearLayout linearLayout14 = new LinearLayout(this);
            linearLayout14.setOrientation(1);
            linearLayout14.setGravity(17);
            LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(a(54), -2);
            layoutParams14.setMargins(a(3), 0, a(3), 0);
            linearLayout14.setLayoutParams(layoutParams14);
            View view = new View(this);
            view.setLayoutParams(new LinearLayout.LayoutParams(a(44), a(44)));
            view.setClickable(true);
            view.setFocusable(true);
            view.setOnClickListener(new bg(this, str2));
            this.bN.add(view);
            linearLayout14.addView(view);
            TextView textView10 = new TextView(this);
            textView10.setText(i3 % 2 == 0 ? "TEAM 1" : "TEAM 2");
            textView10.setTextSize(2, 8.0f);
            textView10.setTypeface(Typeface.DEFAULT_BOLD);
            textView10.setTextColor(i3 % 2 == 0 ? Color.parseColor("#38bdf8") : Color.parseColor("#f87171"));
            textView10.setGravity(17);
            textView10.setPadding(0, a(2), 0, 0);
            textView10.setVisibility(8);
            this.bo.add(textView10);
            linearLayout14.addView(textView10);
            linearLayout13.addView(linearLayout14);
            i2 = i3 + 1;
        }
        i();
        linearLayout8.addView(linearLayout13);
        LinearLayout linearLayout15 = new LinearLayout(this);
        linearLayout15.setOrientation(1);
        linearLayout15.setGravity(1);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams15.setMargins(0, 0, 0, a(8));
        linearLayout15.setLayoutParams(layoutParams15);
        linearLayout15.setBackground(a(Color.parseColor("#09101d"), a(12), a(1), Color.parseColor("#1e293b")));
        linearLayout15.setPadding(a(12), a(8), a(12), a(8));
        if (Build.VERSION.SDK_INT >= 11) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.enableTransitionType(4);
            layoutTransition.enableTransitionType(2);
            layoutTransition.enableTransitionType(3);
            layoutTransition.setDuration(220L);
            linearLayout15.setLayoutTransition(layoutTransition);
        }
        Button button = new Button(this);
        this.aR = button;
        b(button);
        button.setTextSize(2, 12.0f);
        button.setTypeface(Typeface.DEFAULT_BOLD);
        button.setAllCaps(false);
        button.setGravity(17);
        button.setPadding(a(12), a(8), a(12), a(8));
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, a(40));
        layoutParams16.setMargins(0, 0, 0, this.O ? a(4) : 0);
        button.setLayoutParams(layoutParams16);
        button.setOnClickListener(new bh(this));
        linearLayout15.addView(button);
        LinearLayout linearLayout16 = new LinearLayout(this);
        this.bp = linearLayout16;
        linearLayout16.setOrientation(1);
        linearLayout16.setGravity(1);
        linearLayout16.setPadding(0, a(4), 0, 0);
        linearLayout16.setVisibility(this.O ? 0 : 8);
        linearLayout16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view2 = new View(this);
        view2.setBackgroundColor(Color.parseColor("#1e293b"));
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-1, a(1));
        layoutParams17.setMargins(0, a(2), 0, a(6));
        view2.setLayoutParams(layoutParams17);
        linearLayout16.addView(view2);
        LinearLayout linearLayout17 = new LinearLayout(this);
        linearLayout17.setOrientation(0);
        linearLayout17.setGravity(16);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams18.setMargins(0, 0, 0, a(4));
        linearLayout17.setLayoutParams(layoutParams18);
        TextView textView11 = new TextView(this);
        this.bs = textView11;
        textView11.setText("50%");
        textView11.setTextSize(2, 18.0f);
        textView11.setTypeface(Typeface.DEFAULT_BOLD);
        textView11.setTextColor(Color.parseColor("#38bdf8"));
        textView11.setPadding(0, 0, a(8), 0);
        linearLayout17.addView(textView11);
        TextView textView12 = new TextView(this);
        this.bt = textView12;
        textView12.setText("🤖 ROBOTS");
        textView12.setTextSize(2, 11.0f);
        textView12.setTypeface(Typeface.DEFAULT_BOLD);
        textView12.setLetterSpacing(0.04f);
        textView12.setGravity(17);
        textView12.setPadding(a(8), a(4), a(8), a(4));
        textView12.setTextColor(Color.parseColor("#bae6fd"));
        textView12.setBackground(a(Color.parseColor("#0e2238"), a(6), a(1), Color.parseColor("#38bdf8")));
        textView12.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout17.addView(textView12);
        linearLayout16.addView(linearLayout17);
        TextView textView13 = new TextView(this);
        this.bu = textView13;
        textView13.setText("Standard fair simulation • Neutral 50% machine RNG");
        textView13.setTextSize(2, 10.5f);
        textView13.setTextColor(Color.parseColor("#94a3b8"));
        textView13.setGravity(17);
        textView13.setPadding(0, 0, 0, a(6));
        linearLayout16.addView(textView13);
        LinearLayout linearLayout18 = new LinearLayout(this);
        linearLayout18.setOrientation(0);
        linearLayout18.setGravity(17);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams19.setMargins(0, 0, 0, a(4));
        linearLayout18.setLayoutParams(layoutParams19);
        LinearLayout linearLayout19 = new LinearLayout(this);
        linearLayout19.setOrientation(0);
        linearLayout19.setGravity(17);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams20.setMargins(0, 0, 0, a(4));
        linearLayout19.setLayoutParams(layoutParams20);
        LinearLayout linearLayout20 = new LinearLayout(this);
        linearLayout20.setOrientation(0);
        linearLayout20.setGravity(17);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams21.setMargins(0, 0, 0, a(4));
        linearLayout20.setLayoutParams(layoutParams21);
        CharSequence[] charSequenceArr = {"💀 Cursed  0%", "🌤️ Mild Human  25%", "🎯 Lucky Human  75%", "🤖 Robots  50%", "⚡ God Mode  100%"};
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= 5) {
                break;
            }
            Button button2 = new Button(this);
            this.bv[i5] = button2;
            button2.setText(charSequenceArr[i5]);
            button2.setTextSize(2, 11.0f);
            button2.setTypeface(Typeface.DEFAULT_BOLD);
            button2.setAllCaps(false);
            button2.setGravity(17);
            b(button2);
            button2.setOnClickListener(new bi(this, i5));
            if (i5 < 2) {
                LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(0, a(38), 1.0f);
                layoutParams22.setMargins(i5 == 0 ? 0 : a(3), 0, i5 == 0 ? a(3) : 0, 0);
                button2.setLayoutParams(layoutParams22);
                linearLayout18.addView(button2);
            } else if (i5 < 4) {
                LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(0, a(38), 1.0f);
                layoutParams23.setMargins(i5 == 2 ? 0 : a(3), 0, i5 == 2 ? a(3) : 0, 0);
                button2.setLayoutParams(layoutParams23);
                linearLayout19.addView(button2);
            } else {
                button2.setLayoutParams(new LinearLayout.LayoutParams(-1, a(38)));
                linearLayout20.addView(button2);
            }
            i4 = i5 + 1;
        }
        linearLayout16.addView(linearLayout18);
        linearLayout16.addView(linearLayout19);
        linearLayout16.addView(linearLayout20);
        linearLayout15.addView(linearLayout16);
        linearLayout8.addView(linearLayout15);
        i(this.bx ? this.D[0] : this.D[e(this.M)]);
        this.bq = !this.O;
        this.br = "";
        g();
        TextView textView14 = new TextView(this);
        textView14.setText("● Tactical Engine & State Active");
        textView14.setTextColor(Color.parseColor("#475569"));
        textView14.setTextSize(2, 9.5f);
        textView14.setTypeface(Typeface.MONOSPACE, 1);
        textView14.setLetterSpacing(0.04f);
        textView14.setGravity(17);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams24.setMargins(0, a(4), 0, a(2));
        textView14.setLayoutParams(layoutParams24);
        linearLayout8.addView(textView14);
        linearLayout2.addView(linearLayout8);
        Button button3 = new Button(this);
        this.aW = button3;
        button3.setVisibility(8);
        TextView textView15 = new TextView(this);
        this.w = textView15;
        textView15.setVisibility(8);
        linearLayout2.addView(this.w);
        TextView textView16 = new TextView(this);
        this.u = textView16;
        textView16.setVisibility(8);
        linearLayout2.addView(this.u);
        TextView textView17 = new TextView(this);
        this.bc = textView17;
        textView17.setVisibility(8);
        linearLayout2.addView(this.bc);
        scrollView.addView(linearLayout2);
        LinearLayout linearLayout21 = new LinearLayout(this);
        linearLayout21.setOrientation(1);
        linearLayout21.setGravity(1);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams25.setMargins(a(8), 0, a(8), a(8));
        linearLayout21.setLayoutParams(layoutParams25);
        linearLayout21.setBackground(a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0d172a"), Color.parseColor("#080e1a")}, a(18), a(1), Color.parseColor("#253b5e")));
        linearLayout21.setPadding(a(12), a(10), a(12), a(10));
        LinearLayout linearLayout22 = new LinearLayout(this);
        linearLayout22.setOrientation(0);
        linearLayout22.setGravity(16);
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams26.setMargins(a(2), 0, a(2), a(6));
        linearLayout22.setLayoutParams(layoutParams26);
        TextView textView18 = new TextView(this);
        textView18.setText("🎲 DETERMINISTIC DICE PAD (1-SHOT)");
        textView18.setTextColor(Color.parseColor("#cbd5e1"));
        textView18.setTextSize(2, 10.5f);
        textView18.setTypeface(Typeface.DEFAULT_BOLD);
        textView18.setLetterSpacing(0.06f);
        linearLayout22.addView(textView18);
        linearLayout22.addView(new View(this), new LinearLayout.LayoutParams(0, 0, 1.0f));
        TextView textView19 = new TextView(this);
        textView19.setText("↺ AUTO RNG");
        textView19.setTextColor(Color.parseColor("#7dd3fc"));
        textView19.setTextSize(2, 9.5f);
        textView19.setTypeface(Typeface.MONOSPACE, 1);
        textView19.setPadding(a(8), a(3), a(8), a(3));
        textView19.setBackground(a(Color.parseColor("#0c243c"), a(8), a(1), Color.parseColor("#0284c7")));
        textView19.setClickable(true);
        textView19.setOnClickListener(new bj(this));
        linearLayout22.addView(textView19);
        linearLayout21.addView(linearLayout22);
        this.bP.clear();
        int[][] iArr = {new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6}};
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= 3) {
                j();
                linearLayout.addView(scrollView);
                linearLayout.addView(linearLayout21);
                setContentView(linearLayout);
                return;
            }
            LinearLayout linearLayout23 = new LinearLayout(this);
            linearLayout23.setOrientation(0);
            linearLayout23.setGravity(17);
            LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams27.setMargins(0, a(3), 0, a(3));
            linearLayout23.setLayoutParams(layoutParams27);
            for (int i8 = 0; i8 < 2; i8++) {
                int i9 = iArr[i7][i8];
                Button J2 = J(String.valueOf(i9));
                J2.setOnClickListener(new bk(this, i9));
                this.bP.add(J2);
                linearLayout23.addView(J2);
            }
            linearLayout21.addView(linearLayout23);
            i6 = i7 + 1;
        }
    }

    public final void f(String str) {
        if (this.bb == null) {
            return;
        }
        String z = z(str);
        if (z == null || z.isEmpty() || "-".equals(z) || "WAITING".equalsIgnoreCase(z)) {
            this.bb.setText("TURN\n-");
            this.bb.setTextColor(Color.parseColor("#94a3b8"));
            this.bb.setBackground(a(Color.parseColor("#080e1a"), a(10), a(1), Color.parseColor("#1e293b")));
            return;
        }
        String upperCase = z.toUpperCase();
        if ("BLUE".equals(upperCase)) {
            this.bb.setText("TURN\nBLUE");
            this.bb.setTextColor(Color.parseColor("#93c5fd"));
            this.bb.setBackground(a(Color.parseColor("#082f49"), a(10), a(1), Color.parseColor("#0284c7")));
            return;
        }
        if ("RED".equals(upperCase)) {
            this.bb.setText("TURN\nRED");
            this.bb.setTextColor(Color.parseColor("#fca5a5"));
            this.bb.setBackground(a(Color.parseColor("#450a0a"), a(10), a(1), Color.parseColor("#dc2626")));
            return;
        }
        if ("GREEN".equals(upperCase)) {
            this.bb.setText("TURN\nGREEN");
            this.bb.setTextColor(Color.parseColor("#86efac"));
            this.bb.setBackground(a(Color.parseColor("#052e16"), a(10), a(1), Color.parseColor("#16a34a")));
            return;
        }
        if ("YELLOW".equals(upperCase)) {
            this.bb.setText("TURN\nYELLOW");
            this.bb.setTextColor(Color.parseColor("#fde047"));
            this.bb.setBackground(a(Color.parseColor("#422006"), a(10), a(1), Color.parseColor("#ca8a04")));
        } else if ("ORANGE".equals(upperCase)) {
            this.bb.setText("TURN\nORANGE");
            this.bb.setTextColor(Color.parseColor("#fdba74"));
            this.bb.setBackground(a(Color.parseColor("#431407"), a(10), a(1), Color.parseColor("#ea580c")));
        } else if ("PURPLE".equals(upperCase)) {
            this.bb.setText("TURN\nPURPLE");
            this.bb.setTextColor(Color.parseColor("#d8b4fe"));
            this.bb.setBackground(a(Color.parseColor("#3b0764"), a(10), a(1), Color.parseColor("#9333ea")));
        } else {
            this.bb.setText("TURN\n".concat(String.valueOf(upperCase)));
            this.bb.setTextColor(Color.parseColor("#cbd5e1"));
            this.bb.setBackground(a(Color.parseColor("#071113"), a(10), a(1), Color.parseColor("#1f3438")));
        }
    }

    public final void g() {
        if (this.aR == null) {
            return;
        }
        boolean z = this.O;
        String str = this.M != null ? this.M : "BLUE";
        String upperCase = (this.Y == null || "-".equals(this.Y) || this.Y.isEmpty()) ? "" : this.Y.toUpperCase();
        String str2 = (this.L == null || "AUTO".equalsIgnoreCase(this.L) || "-".equals(this.L)) ? (this.aD == null || "-".equals(this.aD) || this.aD.isEmpty()) ? "" : this.aD : this.L;
        String str3 = str + "|" + upperCase + "|" + str2;
        if (this.bq == z && str3.equals(this.br)) {
            return;
        }
        this.bq = z;
        this.br = str3;
        if (z) {
            this.aR.setText("🚀 SMART MODE: " + str + " • ON" + ((upperCase.isEmpty() || upperCase.equalsIgnoreCase(str)) ? (str2.isEmpty() || "AUTO".equalsIgnoreCase(str2)) ? "" : " [🎲 " + str2 + "]" : " [WAIT: " + upperCase + "]") + " ▲");
            this.aR.setTextColor(Color.parseColor("#a7f3d0"));
            this.aR.setBackground(a(a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#064e3b"), Color.parseColor("#047857")}, a(10), a(1), Color.parseColor("#10b981")), a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#047857"), Color.parseColor("#059669")}, a(10), a(1), Color.parseColor("#34d399"))));
            ViewGroup.LayoutParams layoutParams = this.aR.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = a(4);
                this.aR.setLayoutParams(layoutParams);
            }
            if (this.bp != null && this.bp.getVisibility() != 0) {
                this.bp.setVisibility(0);
            }
            i(this.C != null ? this.C.getProgress() : this.D[e(str)]);
            return;
        }
        this.aD = "";
        this.aR.setText("⚡ SMART MODE: OFF (Tap to Select Mode) ▼");
        this.aR.setTextColor(Color.parseColor("#cbd5e1"));
        this.aR.setBackground(a(a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#0f172a"), Color.parseColor("#17253f")}, a(10), a(1), Color.parseColor("#293d5c")), a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#1e293b"), Color.parseColor("#253759")}, a(10), a(1), Color.parseColor("#38bdf8"))));
        ViewGroup.LayoutParams layoutParams2 = this.aR.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams2).bottomMargin = 0;
            this.aR.setLayoutParams(layoutParams2);
        }
        if (this.bp == null || this.bp.getVisibility() == 8) {
            return;
        }
        this.bp.setVisibility(8);
    }

    public final String h() {
        return this.W.contains("BLUE") ? "BLUE" : this.W.contains("RED") ? "RED" : this.W.contains("GREEN") ? "GREEN" : this.W.contains("YELLOW") ? "YELLOW" : !this.W.isEmpty() ? (String) this.W.iterator().next() : "BLUE";
    }

    public final void i() {
        int i2;
        int i3;
        float f2;
        int[] iArr = {Color.parseColor("#2563eb"), Color.parseColor("#dc2626"), Color.parseColor("#16a34a"), Color.parseColor("#ca8a04")};
        boolean z = "MENU".equalsIgnoreCase(this.Q) || "MENU".equalsIgnoreCase(this.Q) || this.T >= 250;
        boolean z2 = !z && (this.P == 2 || (this.Q != null && this.Q.startsWith("2P")));
        boolean z3 = z2 && ((!this.W.isEmpty() && (this.W.contains("RED") || this.W.contains("YELLOW"))) || ((this.Q != null && this.Q.contains("RED / YELLOW")) || ((this.Q == null || !this.Q.contains("BLUE / GREEN")) && ("RED".equalsIgnoreCase(this.M) || "YELLOW".equalsIgnoreCase(this.M) || this.S.contains("RED") || this.S.contains("YELLOW")))));
        boolean z4 = (z || this.Q == null || (!this.Q.contains("TEAM") && !this.Q.contains("2v2") && !this.Q.contains("2V2"))) ? false : true;
        if (!this.N && !this.W.isEmpty() && !z && !this.W.contains(this.M)) {
            this.M = h();
        }
        int i4 = 0;
        while (true) {
            i2 = i4;
            i3 = -1;
            if (i2 < this.bO.size()) {
                if (((String) this.bO.get(i2)).equalsIgnoreCase(this.M)) {
                    break;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (z4 && i2 != -1) {
            if (i2 == 0) {
                i3 = 2;
            } else if (i2 == 2) {
                i3 = 0;
            } else if (i2 == 1) {
                i3 = 3;
            } else if (i2 == 3) {
                i3 = 1;
            }
        }
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= this.bN.size()) {
                break;
            }
            View view = (View) this.bN.get(i6);
            String str = (String) this.bO.get(i6);
            boolean equalsIgnoreCase = str.equalsIgnoreCase(this.M);
            boolean equalsIgnoreCase2 = str.equalsIgnoreCase(this.bQ);
            boolean z5 = z4 && i6 == i3;
            boolean z6 = z4 ? false : z2 ? z3 ? ((i6 != 0 && i6 != 2) || equalsIgnoreCase || equalsIgnoreCase2) ? false : true : ((i6 != 1 && i6 != 3) || equalsIgnoreCase || equalsIgnoreCase2) ? false : true : (this.W.isEmpty() || z || this.W.contains(str) || equalsIgnoreCase || equalsIgnoreCase2) ? false : true;
            int i7 = iArr[i6];
            if (equalsIgnoreCase2) {
                view.setBackground(a(i7, a(10), a(3), Color.parseColor("#fff2a3")));
            } else if (equalsIgnoreCase) {
                view.setBackground(a(i7, a(10), a(3), Color.parseColor("#ffffff")));
            } else if (z4) {
                view.setBackground(a(i7, a(10), z5 ? a(3) : a(2), i6 % 2 == 0 ? Color.parseColor("#38bdf8") : Color.parseColor("#fb7185")));
            } else if (z5) {
                view.setBackground(a(i7, a(10), a(2), Color.parseColor("#38bdf8")));
            } else {
                view.setBackground(a(i7, a(10), a(1), Color.parseColor("#263c41")));
                if (z6) {
                    f2 = 0.45f;
                    view.setAlpha(f2);
                    i5 = i6 + 1;
                }
            }
            f2 = 1.0f;
            view.setAlpha(f2);
            i5 = i6 + 1;
        }
        if (this.bf != null) {
            this.bf.setVisibility(8);
        }
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= this.bo.size()) {
                break;
            }
            TextView textView = (TextView) this.bo.get(i9);
            if (textView != null) {
                textView.setVisibility(z4 ? 0 : 8);
                textView.setTextColor(((i9 < this.bO.size() && ((String) this.bO.get(i9)).equalsIgnoreCase(this.bQ)) || (i9 < this.bO.size() && ((String) this.bO.get(i9)).equalsIgnoreCase(this.M))) ? Color.parseColor("#ffffff") : i9 % 2 == 0 ? Color.parseColor("#38bdf8") : Color.parseColor("#fb7185"));
            }
            i8 = i9 + 1;
        }
        if (z4) {
            boolean z7 = "BLUE".equalsIgnoreCase(this.M) || "GREEN".equalsIgnoreCase(this.M);
            boolean z8 = "RED".equalsIgnoreCase(this.M) || "YELLOW".equalsIgnoreCase(this.M);
            boolean z9 = "BLUE".equalsIgnoreCase(this.bQ) || "GREEN".equalsIgnoreCase(this.bQ);
            boolean z10 = "RED".equalsIgnoreCase(this.bQ) || "YELLOW".equalsIgnoreCase(this.bQ);
            if (this.bg != null) {
                if (z9) {
                    this.bg.setBackground(a(Color.parseColor("#0d3153"), a(8), a(2), Color.parseColor("#38bdf8")));
                    if (this.bi != null) {
                        this.bi.setText("🛡️ TEAM BLUE & GREEN (ACTIVE)");
                    }
                    if (this.bm != null) {
                        this.bm.setText("⚡ Teammates Active (Seats 0 & 2)");
                    }
                } else if (z7) {
                    this.bg.setBackground(a(Color.parseColor("#09243d"), a(8), a(2), Color.parseColor("#0284c7")));
                    if (this.bi != null) {
                        this.bi.setText("🛡️ TEAM BLUE & GREEN (SELECTED)");
                    }
                    if (this.bm != null) {
                        this.bm.setText("Selected Teammates (Seats 0 & 2)");
                    }
                } else {
                    this.bg.setBackground(a(Color.parseColor("#091d30"), a(8), a(1), Color.parseColor("#1e3a5f")));
                    if (this.bi != null) {
                        this.bi.setText("🛡️ TEAM BLUE & GREEN");
                    }
                    if (this.bm != null) {
                        this.bm.setText("Teammates (Seats 0 & 2)");
                    }
                }
            }
            if (this.bh != null) {
                if (z10) {
                    this.bh.setBackground(a(Color.parseColor("#431a20"), a(8), a(2), Color.parseColor("#f43f5e")));
                    if (this.bj != null) {
                        this.bj.setText("⚔️ TEAM RED & YELLOW (ACTIVE)");
                    }
                    if (this.bn != null) {
                        this.bn.setText("⚡ Teammates Active (Seats 1 & 3)");
                    }
                } else if (z8) {
                    this.bh.setBackground(a(Color.parseColor("#33141a"), a(8), a(2), Color.parseColor("#e11d48")));
                    if (this.bj != null) {
                        this.bj.setText("⚔️ TEAM RED & YELLOW (SELECTED)");
                    }
                    if (this.bn != null) {
                        this.bn.setText("Selected Teammates (Seats 1 & 3)");
                    }
                } else {
                    this.bh.setBackground(a(Color.parseColor("#2a1215"), a(8), a(1), Color.parseColor("#4a1d24")));
                    if (this.bj != null) {
                        this.bj.setText("⚔️ TEAM RED & YELLOW");
                    }
                    if (this.bn != null) {
                        this.bn.setText("Teammates (Seats 1 & 3)");
                    }
                }
            }
        }
        TextView textView2 = this.be;
        if (textView2 != null) {
            textView2.setText("PLAYER: " + this.M + " • ACTIVE TURN: " + ((this.Y == null || "-".equals(this.Y) || this.Y.isEmpty()) ? "AUTO-DETECT" : this.Y));
        }
    }

    public final void j() {
        for (Button button : this.bP) {
            if (button.getText().toString().equals(this.L)) {
                button.setBackground(a(a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0284c7"), Color.parseColor("#1d4ed8")}, a(12), a(2), Color.parseColor("#7dd3fc")), a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0369a1"), Color.parseColor("#1e40af")}, a(12), a(2), Color.parseColor("#38bdf8"))));
                button.setTextColor(-1);
            } else {
                button.setBackground(a(a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#111c33"), Color.parseColor("#0a1120")}, a(12), a(1), Color.parseColor("#233554")), a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#1e293b"), Color.parseColor("#0f172a")}, a(12), a(1), Color.parseColor("#38bdf8"))));
                button.setTextColor(Color.parseColor("#e2e8f0"));
            }
        }
        if (this.aY != null) {
            String str = ("AUTO".equalsIgnoreCase(this.L) || this.L == null || this.L.isEmpty()) ? "AUTO" : this.L;
            this.aY.setText("LOCK\n".concat(String.valueOf(str)));
            boolean z = !"AUTO".equalsIgnoreCase(str);
            this.aY.setTextColor(Color.parseColor(z ? "#fde047" : "#8bd3ff"));
            this.aY.setBackground(a(Color.parseColor(z ? "#3b2307" : "#080e1a"), a(10), a(1), Color.parseColor(z ? "#eab308" : "#1e293b")));
        }
    }

    public final void j(String str) {
        String z = z(str);
        if (z == null || z.isEmpty() || "-".equals(z) || "WAITING".equalsIgnoreCase(z) || "MENU".equalsIgnoreCase(z)) {
            if (this.bQ == null || this.bQ.isEmpty()) {
                return;
            }
            this.bQ = "";
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= this.bN.size()) {
                    break;
                }
                View view = (View) this.bN.get(i3);
                view.clearAnimation();
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                i2 = i3 + 1;
            }
            if (this.bb != null) {
                this.bb.clearAnimation();
                this.bb.setAlpha(1.0f);
                return;
            }
            return;
        }
        String upperCase = z.toUpperCase();
        if (upperCase.equals(this.bQ)) {
            return;
        }
        this.bQ = upperCase;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= this.bN.size()) {
                break;
            }
            View view2 = (View) this.bN.get(i5);
            if ((i5 < this.bO.size() ? (String) this.bO.get(i5) : "").equalsIgnoreCase(upperCase)) {
                view2.clearAnimation();
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.45f);
                alphaAnimation.setDuration(450L);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setRepeatCount(-1);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.08f, 1.0f, 1.08f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(450L);
                scaleAnimation.setRepeatMode(2);
                scaleAnimation.setRepeatCount(-1);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(scaleAnimation);
                view2.startAnimation(animationSet);
            } else {
                view2.clearAnimation();
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            i4 = i5 + 1;
        }
        if (this.bb != null) {
            this.bb.clearAnimation();
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.65f);
            alphaAnimation2.setDuration(500L);
            alphaAnimation2.setRepeatMode(2);
            alphaAnimation2.setRepeatCount(-1);
            this.bb.startAnimation(alphaAnimation2);
        }
    }

    public final void k() {
        if (this.bd == null) {
            return;
        }
        String str = (!this.ae || "AUTO".equalsIgnoreCase(this.L)) ? "AUTO".equalsIgnoreCase(this.L) ? "auto rng" : "lock " + this.L : "1-shot " + this.L;
        String str2 = "";
        String str3 = this.aq ? " / rm " + this.ap : "";
        if (this.at) {
            str3 = str3 + " / sync " + this.as + (this.au ? ":live" : ":off");
        }
        if (!this.O) {
            this.bd.setText(this.M.toLowerCase() + " / " + str + str3);
            this.bd.setTextColor(Color.parseColor(this.au ? "#85efac" : this.ae ? "#8bd3ff" : "#83a2a8"));
            return;
        }
        if (this.bX != null && !this.bX.isEmpty() && !"OFF".equalsIgnoreCase(this.bX) && !"IDLE".equalsIgnoreCase(this.bX)) {
            str2 = " / " + L(this.bX).toLowerCase();
        }
        this.bd.setText(this.M.toLowerCase() + " / smart [" + this.ad.toLowerCase() + "]" + str2 + " / " + str + str3);
        this.bd.setTextColor(Color.parseColor("#f9d36b"));
    }

    public final void k(String str) {
        this.aA.execute(new bp(this, str));
    }

    public final void l(String str) {
        d();
        this.N = true;
        int progress = this.C != null ? this.C.getProgress() : this.D[e(this.M)];
        String upperCase = str.toUpperCase();
        this.M = upperCase;
        int e2 = e(this.M);
        if (this.O && progress != 50) {
            this.D[e2] = progress;
        }
        i();
        if (this.be != null) {
            this.be.setText("TARGET PLAYER: " + this.M);
        }
        int i2 = this.D[e2];
        if (this.C != null) {
            this.C.setProgress(i2);
        }
        i(i2);
        k();
        if (this.O) {
            g();
            if (i2 == 50) {
                i2 = 75;
            }
            b(i2, this.M);
        }
        Toast.makeText(this, "Target Color: ".concat(String.valueOf(upperCase)), 0).show();
    }

    public final boolean l() {
        try {
            getPackageManager().getPackageInfo("com.ludo.king", 0);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    public void lambda$buildCleanUI$11(View view) {
        if (a(2, "Mode Detection")) {
            R();
        }
    }

    public void lambda$buildCleanUI$12(View view) {
        if (a(1, "General Features")) {
            ab();
        }
    }

    public void lambda$buildCleanUI$13(View view) {
        if (a(2, "Mode Detection")) {
            R();
        }
    }

    public void lambda$buildCleanUI$14(View view) {
        if (a(8, "Online Room Control")) {
            ad();
        }
    }

    public void lambda$buildCleanUI$15(View view) {
        if (a(16, "Online Ludo King Sync")) {
            ah();
        }
    }

    public void lambda$buildCleanUI$16(View view) {
        if (this.aC != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            ScrollView scrollView = new ScrollView(this);
            scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            scrollView.setBackgroundColor(Color.parseColor("#0a0f1d"));
            scrollView.setPadding(a(16), a(16), a(16), a(16));
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            scrollView.addView(linearLayout);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText("🛡️ ");
            textView.setTextSize(2, 16.0f);
            linearLayout2.addView(textView);
            TextView textView2 = new TextView(this);
            textView2.setText("VIP License Entitlements");
            textView2.setTextColor(Color.parseColor("#f8fafc"));
            textView2.setTextSize(2, 15.0f);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout2.addView(textView2);
            linearLayout.addView(linearLayout2);
            boolean c2 = this.aC.c();
            TextView textView3 = new TextView(this);
            if (!c2) {
                textView3.setText("⚠ LICENSE EXPIRED");
            } else if (this.aC.a()) {
                textView3.setText("✓ ACTIVE • LIFETIME UNLIMITED");
            } else {
                textView3.setText("✓ ACTIVE • " + this.aC.d() + " DAYS LEFT");
            }
            textView3.setTextSize(2, 10.5f);
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            textView3.setGravity(17);
            textView3.setPadding(a(10), a(4), a(10), a(4));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, a(10), 0, a(10));
            textView3.setLayoutParams(layoutParams);
            if (c2) {
                textView3.setTextColor(Color.parseColor("#86efac"));
                textView3.setBackground(a(Color.parseColor("#052e16"), a(8), a(1), Color.parseColor("#16a34a")));
            } else {
                textView3.setTextColor(Color.parseColor("#fca5a5"));
                textView3.setBackground(a(Color.parseColor("#2a1216"), a(8), a(1), Color.parseColor("#ef4444")));
            }
            linearLayout.addView(textView3);
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            linearLayout3.setPadding(a(12), a(10), a(12), a(10));
            linearLayout3.setBackground(a(Color.parseColor("#0d1527"), a(10), a(1), Color.parseColor("#1e293b")));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, a(10));
            linearLayout3.setLayoutParams(layoutParams2);
            a(linearLayout3, "Customer", (this.aC.h == null || this.aC.h.isEmpty()) ? "VIP Customer" : this.aC.h, "#38bdf8");
            a(linearLayout3, "License Key", this.aC.a, "#38bdf8");
            a(linearLayout3, "Expires", this.aC.f(), "#94a3b8");
            a(linearLayout3, "Device Limit", this.aC.d == 255 ? "Unlimited" : this.aC.d + " device(s)", "#94a3b8");
            a(linearLayout3, "Device ID", c(), "#38bdf8");
            linearLayout.addView(linearLayout3);
            TextView textView4 = new TextView(this);
            textView4.setText("ACTIVATED FEATURES");
            textView4.setTextColor(Color.parseColor("#64748b"));
            textView4.setTextSize(2, 10.0f);
            textView4.setTypeface(Typeface.DEFAULT_BOLD);
            textView4.setLetterSpacing(0.08f);
            textView4.setPadding(0, 0, 0, a(4));
            linearLayout.addView(textView4);
            String[][] strArr = {new String[]{"✓ General Remote Control (IPC & Sockets)", "1"}, new String[]{"✓ Real-Time Mode & Topology Detection", "2"}, new String[]{"✓ Smart Boost & AI Tactics Engine", "4"}, new String[]{"✓ Deterministic Dice Automation", "8"}, new String[]{"✓ Direct In-Game Cloud Sync Bridge", "16"}, new String[]{"✓ VIP King Pass (Ad-Free Engine)", "32"}};
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= 6) {
                    break;
                }
                String[] strArr2 = strArr[i3];
                boolean a2 = this.aC.a(Integer.parseInt(strArr2[1]));
                TextView textView5 = new TextView(this);
                textView5.setText(a2 ? strArr2[0] : strArr2[0].replace("✓", "✗") + " (Locked)");
                textView5.setTextColor(a2 ? Color.parseColor("#86efac") : Color.parseColor("#475569"));
                textView5.setTextSize(2, 10.5f);
                textView5.setTypeface(Typeface.DEFAULT_BOLD);
                textView5.setPadding(0, a(2), 0, a(2));
                linearLayout.addView(textView5);
                i2 = i3 + 1;
            }
            Button button = new Button(this);
            button.setText("🛒 Buy / Extend VIP License (@" + SecurityGuard.getOfficialTelegramUsername(this) + ")");
            button.setAllCaps(false);
            b(button);
            button.setTextColor(Color.parseColor("#38bdf8"));
            button.setTextSize(2, 11.5f);
            button.setTypeface(Typeface.DEFAULT_BOLD);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, a(38));
            layoutParams3.setMargins(0, a(12), 0, 0);
            button.setLayoutParams(layoutParams3);
            button.setBackground(a(a(Color.parseColor("#0c1c38"), a(8), a(1), Color.parseColor("#0284c7")), a(Color.parseColor("#0369a1"), a(8), a(1), Color.parseColor("#38bdf8"))));
            button.setOnClickListener(new ag(this));
            linearLayout.addView(button);
            builder.setView(scrollView);
            builder.setPositiveButton("OK", (DialogInterface.OnClickListener) null);
            builder.setNeutralButton("Copy Device ID", new ah(this));
            builder.setNegativeButton("Enter New Code", new ai(this));
            AlertDialog create = builder.create();
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setBackgroundDrawable(a(Color.parseColor("#0a0f1d"), a(16), a(1), Color.parseColor("#1e293b")));
            }
            Button button2 = create.getButton(-1);
            if (button2 != null) {
                button2.setTextColor(Color.parseColor("#38bdf8"));
                button2.setTypeface(Typeface.DEFAULT_BOLD);
            }
            Button button3 = create.getButton(-3);
            if (button3 != null) {
                button3.setTextColor(Color.parseColor("#94a3b8"));
                button3.setTypeface(Typeface.DEFAULT_BOLD);
            }
            Button button4 = create.getButton(-2);
            if (button4 != null) {
                button4.setTextColor(Color.parseColor("#f87171"));
                button4.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    public void lambda$buildCleanUI$17(View view) {
        N();
    }

    public void lambda$buildCleanUI$18(View view) {
        if (a(4, "Smart Mode On/Off")) {
            d();
            if ("NATURAL".equalsIgnoreCase(this.ad)) {
                this.ad = "BRUTAL";
            } else {
                this.ad = "NATURAL";
            }
            try {
                getSharedPreferences(aH, 0).edit().putString("pref_smart_profile", this.ad).apply();
            } catch (Throwable th) {
            }
            M();
            k();
            if (this.O) {
                a(true, this.M);
            }
            Toast.makeText(this, "Tactics Profile: " + this.ad, 0).show();
        }
    }

    public void lambda$buildCleanUI$20(View view) {
        if (a(4, "Smart Mode On/Off")) {
            d();
            this.E = System.currentTimeMillis();
            this.O = true;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", true).apply();
            } catch (Throwable th) {
            }
            this.X = 0;
            this.bT = "";
            this.bU = "";
            g();
            k();
            a(true, this.M);
        }
    }

    public void lambda$buildCleanUI$21(View view) {
        if (a(1, "General Features")) {
            d();
            this.E = System.currentTimeMillis();
            this.O = false;
            try {
                getSharedPreferences(aH, 0).edit().putBoolean("pref_god_mode_enabled", false).apply();
            } catch (Throwable th) {
            }
            this.X = 0;
            this.ae = false;
            this.af = "";
            g();
            k();
            a(false, this.M);
            t("AUTO");
        }
    }

    public void lambda$buildCleanUI$22(View view) {
        V();
    }

    public void lambda$showHotspotConfigDialog$33(View view) {
        if (a(8, "Online Room Control")) {
            ad();
        }
    }

    public void lambda$showHotspotConfigDialog$34(View view) {
        if (a(16, "Online Ludo King Sync")) {
            ah();
        }
    }

    public final String m() {
        return (this.am == null || this.am.trim().isEmpty() || "127.0.0.1".equals(this.am.trim())) ? ((this.al && l()) || this.ao == null || this.ao.trim().isEmpty() || "127.0.0.1".equals(this.ao.trim()) || n(this.ao.trim())) ? "127.0.0.1" : this.ao.trim() : this.am.trim();
    }

    public final String m(String str) {
        if (str == null) {
            return "";
        }
        try {
            SecurityGuard.restoreVerifiedServerProof(this);
            String signHotspotCommand = SecurityGuard.signHotspotCommand(str);
            return (signHotspotCommand == null || signHotspotCommand.isEmpty()) ? str : str + " #AUTH:" + signHotspotCommand;
        } catch (Throwable th) {
            return str;
        }
    }

    public final boolean n() {
        String m2;
        if (this.at && this.au) {
            return false;
        }
        return ((this.al && l()) || (m2 = m()) == null || m2.isEmpty() || "127.0.0.1".equals(m2) || n(m2)) ? false : true;
    }

    public final synchronized void o() {
        this.aq = false;
        this.ap = "";
        if (this.cb != null) {
            this.cb.interrupt();
            this.cb = null;
        }
        try {
            getSharedPreferences(aH, 0).edit().remove("pref_saved_room_code").apply();
        } catch (Throwable th) {
        }
        this.ay.post(new ck(this));
    }

    public final void o(String str) {
        String u = u(str);
        String str2 = ("AUTO".equalsIgnoreCase(u) || u.isEmpty()) ? "-\n" : u + "\n";
        try {
            File file = new File(getFilesDir(), "dice.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            fileOutputStream.write(str2.getBytes("UTF-8"));
            fileOutputStream.flush();
            fileOutputStream.close();
            file.setReadable(true, false);
            file.setWritable(true, true);
        } catch (Throwable th) {
        }
        String[] strArr = {"/data/data/com.ludo.king/files/dice.txt", "/data/user/0/com.ludo.king/files/dice.txt"};
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                File file2 = new File(strArr[i2]);
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2, false);
                fileOutputStream2.write(str2.getBytes("UTF-8"));
                fileOutputStream2.flush();
                fileOutputStream2.close();
                file2.setReadable(true, false);
                file2.setWritable(true, true);
            } catch (Throwable th2) {
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.bM || this.aC == null || !this.aC.c()) {
            super.onBackPressed();
            return;
        }
        f();
        e();
        r();
        B();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String stringExtra;
        dz a2;
        SecurityGuard.verifyOrDie(this);
        super.onCreate(bundle);
        this.bH = (Vibrator) getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
                    this.ck = new cm(this);
                    connectivityManager.registerNetworkCallback(build, this.ck);
                }
            } catch (Throwable th) {
                Log.w("LUDO_LICENSE", "Failed to register network callback", th);
            }
        }
        dz w = w();
        if ((w == null || !w.c()) && getIntent() != null && getIntent().hasExtra("license_code") && (stringExtra = getIntent().getStringExtra("license_code")) != null && stringExtra.matches("^[0-9A-Fa-f\\-\\s]{20,29}$") && (a2 = a(stringExtra)) != null && a2.e) {
            this.az.execute(new bz(this, a2));
        } else {
            A();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (Build.VERSION.SDK_INT >= 21 && this.ck != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(this.ck);
                }
            } catch (Throwable th) {
            } finally {
                this.ck = null;
            }
        }
        this.I = false;
        d(false);
        o();
        this.ay.removeCallbacksAndMessages(null);
        this.az.shutdownNow();
        this.aA.shutdownNow();
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.cj = false;
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        SecurityGuard.verifyOrDie(this);
        super.onResume();
        this.cj = true;
        if (this.aC == null || !this.aC.c()) {
            z();
            return;
        }
        r();
        a(this.aC, true);
        B();
    }

    public final void p() {
        if (this.at) {
            this.au = false;
            this.cd = false;
            c(false);
            this.ay.post(new cx(this));
        }
    }

    public final void p(String str) {
        String v = v(str);
        String str2 = ("-".equals(v) || v == null || v.isEmpty()) ? "-\n" : v + "\n";
        try {
            File file = new File(getFilesDir(), "last_dice.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            fileOutputStream.write(str2.getBytes("UTF-8"));
            fileOutputStream.flush();
            fileOutputStream.close();
            file.setReadable(true, false);
            file.setWritable(true, true);
        } catch (Throwable th) {
        }
    }

    public final synchronized void q() {
        d(true);
    }

    public final void q(String str) {
        if (!this.aq || this.ap.isEmpty()) {
            return;
        }
        this.az.execute(new cl(this, this.ap, str));
    }

    public final void r() {
        if (this.I) {
            return;
        }
        this.I = true;
        ak();
        an();
        this.az.execute(new dm(this));
    }

    public final void r(String str) {
        if (!this.at || this.as.isEmpty() || str == null || str.trim().isEmpty()) {
            return;
        }
        this.az.execute(new db(this, this.as, str, this.cl.incrementAndGet()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
    
        if (r6.isEmpty() != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3 A[Catch: Throwable -> 0x0c7f, TryCatch #22 {Throwable -> 0x0c7f, blocks: (B:81:0x0163, B:83:0x016b, B:84:0x017d, B:86:0x0185, B:88:0x018d, B:90:0x0191, B:95:0x01a7, B:98:0x01cb, B:100:0x01d3, B:101:0x01e1), top: B:80:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0aa4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0975 A[Catch: Throwable -> 0x0b8b, TryCatch #9 {Throwable -> 0x0b8b, blocks: (B:361:0x06bf, B:363:0x0718, B:365:0x0722, B:444:0x0943, B:446:0x0949, B:447:0x0958, B:449:0x0961, B:451:0x096f, B:453:0x0975, B:455:0x097c, B:458:0x0989, B:461:0x0995, B:463:0x099d), top: B:360:0x06bf }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x097c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x099d A[Catch: Throwable -> 0x0b8b, TryCatch #9 {Throwable -> 0x0b8b, blocks: (B:361:0x06bf, B:363:0x0718, B:365:0x0722, B:444:0x0943, B:446:0x0949, B:447:0x0958, B:449:0x0961, B:451:0x096f, B:453:0x0975, B:455:0x097c, B:458:0x0989, B:461:0x0995, B:463:0x099d), top: B:360:0x06bf }] */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0cb8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b A[Catch: Throwable -> 0x0c7f, TryCatch #22 {Throwable -> 0x0c7f, blocks: (B:81:0x0163, B:83:0x016b, B:84:0x017d, B:86:0x0185, B:88:0x018d, B:90:0x0191, B:95:0x01a7, B:98:0x01cb, B:100:0x01d3, B:101:0x01e1), top: B:80:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7 A[Catch: Throwable -> 0x0c7f, TRY_LEAVE, TryCatch #22 {Throwable -> 0x0c7f, blocks: (B:81:0x0163, B:83:0x016b, B:84:0x017d, B:86:0x0185, B:88:0x018d, B:90:0x0191, B:95:0x01a7, B:98:0x01cb, B:100:0x01d3, B:101:0x01e1), top: B:80:0x0163 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.aB.get();
        boolean n2 = n();
        String m2 = m();
        int i2 = n2 ? this.an : 18080;
        String str = "";
        boolean z2 = false;
        String str2 = this.L;
        boolean z3 = this.O;
        String str3 = this.M;
        String str4 = this.Q;
        String str5 = this.R;
        if (!n2) {
            try {
                if (getContentResolver() != null && SecurityGuard.verifyLudoKingProvider(this, Uri.parse(aP))) {
                    Bundle call = getContentResolver().call(Uri.parse(aP), "getStatus", (String) null, a("getStatus", new Bundle()));
                    if (call != null) {
                        z2 = true;
                        str = "ContentProvider ✓";
                        str2 = u(call.getString("value", str2));
                        z3 = call.getBoolean("god_mode", z3);
                        str3 = call.getString("god_color", str3);
                        try {
                            String string = call.getString("smart_profile", "");
                            if (string != null && !string.isEmpty()) {
                                this.ad = string.toUpperCase();
                            }
                            this.bX = call.getString("smart_tactic", this.bX);
                            this.bY = call.getString("smart_reason", this.bY);
                            this.ae = call.getBoolean("dice_locked", false);
                            this.af = u(call.getString("locked_dice_val", ""));
                            this.ag = call.getString("locked_colors", "");
                            this.ah = call.getString("pawn_telemetry", "");
                            this.ai = call.getLong("pawn_telemetry_ts", -1L);
                            this.aj = call.getLong("turn_seq", 0L);
                            this.ak = call.getLong("roll_seq", 0L);
                        } catch (Throwable th) {
                        }
                        if (call.containsKey("luck_blue")) {
                            int i3 = call.getInt("luck_blue", 50);
                            int i4 = call.getInt("luck_red", 50);
                            int i5 = call.getInt("luck_green", 50);
                            int i6 = call.getInt("luck_yellow", 50);
                            if (System.currentTimeMillis() - this.bz > 2000) {
                                this.D[0] = i3;
                                this.D[1] = i4;
                                this.D[2] = i5;
                                this.D[3] = i6;
                            }
                        }
                        int i7 = call.getInt("player_count", this.P);
                        if (i7 >= 2 && i7 <= 6) {
                            this.P = i7;
                        }
                        String string2 = call.getString("game_mode", "");
                        if (string2 != null && !string2.isEmpty()) {
                            str4 = string2;
                        }
                        String string3 = call.getString("active_colors", "");
                        if (string3 != null) {
                            str5 = string3;
                        }
                        String string4 = call.getString("eliminated_colors", "");
                        if (string4 != null) {
                            this.bQ = string4;
                        }
                        this.T = call.getInt("mode_age_sec", 0);
                        String string5 = call.getString("turn_color", "");
                        if (string5 != null) {
                            this.U = string5;
                        }
                        this.V = call.getBoolean("dice_rolling", false);
                        this.X = call.getInt("turn_age_ms", 0);
                        String string6 = call.getString("last_roll_color", "");
                        String string7 = call.getString("last_roll_val", "");
                        long j3 = call.getLong("last_roll_ts", 0L);
                        int i8 = call.getInt("last_roll_age_ms", 999999);
                        if (j3 > 0 && i8 < 180000 && string7 != null && !string7.isEmpty() && !"-".equals(string7)) {
                            this.Y = string6 != null ? string6 : "";
                            this.Z = string7;
                            this.aa = j3;
                            this.ab = System.currentTimeMillis() - Math.max(0, i8);
                            try {
                                getSharedPreferences(aH, 0).edit().putString("pref_last_dice", this.Z).apply();
                            } catch (Throwable th2) {
                            }
                        }
                        this.bT = call.getString("p1_six_hist", "");
                        this.bU = call.getString("p2_six_hist", "");
                        this.bV = call.getString("match_log", "");
                        this.bW = call.getLong("match_id", 0L);
                    }
                }
            } catch (Throwable th3) {
            }
        }
        if (!z2) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(m2, i2), n2 ? 900 : 400);
                socket.setSoTimeout(n2 ? 900 : 400);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write((m("STATUS") + "\n").getBytes("UTF-8"));
                outputStream.flush();
                String readLine = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                socket.close();
                if (readLine != null && !readLine.isEmpty()) {
                    z2 = true;
                    str = n2 ? "Remote (" + m2 + ":" + i2 + ") ✓" : "Local Socket ✓";
                    for (String str6 : readLine.trim().split("\\s+")) {
                        if (str6.startsWith("DICE=")) {
                            str2 = u(str6.substring(5));
                        } else if (str6.startsWith("GOD=")) {
                            z3 = "1".equals(str6.substring(4)) || "ON".equalsIgnoreCase(str6.substring(4));
                        } else if (str6.startsWith("COLOR=")) {
                            str3 = str6.substring(6);
                        } else if (str6.startsWith("MODE=")) {
                            str4 = str6.substring(5).replace('_', ' ');
                        } else if (str6.startsWith("ACTIVE=")) {
                            str5 = str6.substring(7).replace(',', ' ');
                        } else if (str6.startsWith("PLAYERS=")) {
                            try {
                                int parseInt = Integer.parseInt(str6.substring(8));
                                if (parseInt >= 2 && parseInt <= 6) {
                                    this.P = parseInt;
                                }
                            } catch (Throwable th4) {
                            }
                        } else if (str6.startsWith("TURN=")) {
                            this.U = str6.substring(5);
                        } else if (str6.startsWith("LAST=")) {
                            String substring = str6.substring(5);
                            if (!substring.isEmpty() && !"-".equals(substring)) {
                                this.Z = substring;
                            }
                        }
                    }
                }
            } catch (Throwable th5) {
            }
        }
        this.ay.post(new dt(this, currentTimeMillis, j2, z2, n2, str, str3, str4, str5, str2));
    }

    public final void s(String str) {
        if (!this.at || this.as.isEmpty()) {
            return;
        }
        this.az.execute(new dc(this, this.as, str, this.cl.incrementAndGet()));
    }

    public final void t(String str) {
        String u = u(str);
        this.ac = System.currentTimeMillis();
        this.L = u;
        j();
        k();
        o(u);
        if (this.aq) {
            q(u);
        }
        if (this.at) {
            s(u);
        }
        this.aA.execute(new di(this, u, this.aB.incrementAndGet()));
    }

    public final dy w(String str) {
        if (!SecurityGuard.verifyOrDie(this)) {
            return dy.a("Security", "Integrity failure");
        }
        if (this.aC == null || !this.aC.c()) {
            return dy.a("License", "Active license required");
        }
        if (!SecurityGuard.verifyLudoKingProvider(this, Uri.parse(aP))) {
            return dy.a("Security", "Ludo King provider signature verification failed");
        }
        try {
            Bundle call = getContentResolver().call(Uri.parse(aP), "setDice", str, a(str, new Bundle()));
            return (call == null || !(call.getBoolean("success", false) || call.getBoolean("accepted", false) || "ok".equalsIgnoreCase(call.getString("status")))) ? dy.a("ContentProvider", "Call failed") : new dy(true, call.getString("dice", str), "ContentProvider", null);
        } catch (Throwable th) {
            return dy.a("ContentProvider", th.getMessage());
        }
    }

    public final void x(String str) {
        this.ay.post(new dp(this, str));
    }

    public final void y(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        String trim = str.trim();
        String upperCase = trim.toUpperCase();
        if ("MENU".equals(upperCase) || "-".equals(upperCase) || "--".equals(upperCase) || upperCase.startsWith("MENU")) {
            this.W.clear();
            this.T = 250;
            this.Q = "MENU";
            this.F = "MENU";
            this.U = "";
            this.S.clear();
            this.Z = "-";
            this.Y = "-";
            if (this.v != null) {
                this.v.setText("MENU");
            }
            if (this.y != null) {
                this.y.setText("--");
            }
            if (this.w != null) {
                this.w.setText("-");
            }
            if (this.x != null) {
                this.x.setText("LAST\n-");
            }
            j("-");
            f("-");
            i();
            a("MENU", "-", "-", this.L);
            return;
        }
        String g2 = g(trim);
        this.Q = g2;
        this.F = "MATCH";
        this.T = 0;
        if (g2.contains("TEAM") || g2.contains("2v2")) {
            this.P = 4;
        } else if (g2.startsWith("4P")) {
            this.P = 4;
        } else if (g2.startsWith("3P")) {
            this.P = 3;
        } else if (g2.startsWith("6P")) {
            this.P = 6;
        } else if (g2.startsWith("2P")) {
            this.P = 2;
        }
        this.W.clear();
        this.W.addAll(a(g2, trim));
        if (!this.N && !this.W.isEmpty() && !this.W.contains(this.M)) {
            this.M = h();
            if (this.O) {
                a(true, this.M);
            }
        }
        String h2 = h(g2);
        String i2 = i(g2);
        if (this.v != null) {
            this.v.setText(h2);
        }
        if (this.y != null) {
            this.y.setText(i2);
        }
        i();
        a("MATCH", this.Y, this.Z, this.L);
    }
}
