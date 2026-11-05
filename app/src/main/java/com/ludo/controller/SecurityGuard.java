package com.ludo.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import c.l.c.v;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SecurityGuard {
    private static final byte[] ENC_API_URL;
    private static final String EXPECTED_CERT_SHA256 = "f94b0b74d94dd74f205ad0703bff8dd6c8eed4c1d8ced70d9ac889df90e2a55d";
    public static final String LEGACY_CERT_SHA256 = "a32b59d8ada1e0234e230eb805d12fc92092aa338108a22360c38b2ebb698d4d";
    private static final byte[] LEGACY_ENC_API_URL;
    private static final String LEGACY_LICENSE_SERVER_PUBLIC_KEY_B64 = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAExtnHicAU2OAvPRtF5J7WCeDOIzVri7HzZ5dBxCzr/SEj1EdN3AA0rlXfUalFCPs89hlkdiUP7rGrNizFYV/h3g==";
    private static final String LICENSE_SERVER_PUBLIC_KEY_B64 = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEa4RRWO6Fls1NUpi5jnyjTD0coJzmo4gyu5gqPA61yKINnFHhGhUAEZ7XluOi2NmPPQ/ZdAiYhikhdwM12tk4Og==";
    public static final String OFFICIAL_TG_SHA256 = "28260826d7c03f6dbf3b9870cb0341f706b7f176242a381eeb350969bcc9719f";
    public static final String OFFICIAL_TG_USER_SHA256 = "7bc38ffad7f84d8260fa82c60727f96074e121ff2e9a2568369a2bc7dd68679b";
    private static final String SEAL_KEY_ALIAS = "ludo_ctrl_license_seal_v2";
    private static final String TAG = "SEC_GUARD";
    private static volatile String sLastVerifiedServerBody;
    private static volatile String sLastVerifiedServerSig;
    private static volatile String sLiveCertSha256;
    private static volatile boolean sNativeLoaded;
    private static volatile PublicKey[] sServerPublicKeys;
    private static volatile boolean sVerifiedOnce;
    private static final byte[] ENC_TG_URL = {84, 32, -64, -127, -27, -31, -44, -60, -30, 18, 65, 42, 117, 47, 62, 117, -35, -34, -15, -48, -57, -70, -65, 86, 115, 59, 75, 98, 59, -118, -108};
    private static final byte[] LEGACY_ENC_TG_URL = {83, 42, -58, -127, -32, -70, -121, -56, -25, 79, 20, Byte.MAX_VALUE, 116, 40, 56, 32, -37, -117, -10, -126, -109, -17, -22, 94, 112, 108, 73, 53, 49, -120, -109};
    private static final byte[] ENC_TG_USER = {117, 58, -48, -108, -27, -81, -119, -98, -11, 72, 69, 45, 54, 3, 15, 124, -41, -55};
    private static final byte[] LEGACY_ENC_TG_USER = {114, 48, -42, -108, -32, -12, -38, -110, -16, 21, 16, 120, 55, 4, 9, 41, -47, -100};

    static {
        sNativeLoaded = false;
        sVerifiedOnce = false;
        sLiveCertSha256 = null;
        sLastVerifiedServerBody = null;
        sLastVerifiedServerSig = null;
        ENC_API_URL = new byte[]{84, 32, -64, -127, -27, -31, -44, -60, -6, 73, 72, 32, 119, 5, 63, Byte.MAX_VALUE, -52, -33, -22, -50, -34, -68, -71, 18, 125, 62, 77, 88, 56, -106, -107, -68, -72, -123, -20, -72, 15, 73, 34, 123, 87, 55, 122, -125, -109, -24, -38, -60, -68, -18, 24, 126, 124, 3, 22, 109, -34, -45};
        LEGACY_ENC_API_URL = new byte[]{83, 42, -58, -127, -32, -70, -121, -56, -1, 20, 29, 117, 118, 2, 57, 42, -54, -118, -19, -100, -118, -23, -20, 26, 126, 105, 79, 15, 50, -108, -110, -77, -23, -115, -80, -17, 10, 28, 114, 121, 11, 62, 41, -34, -106, -19, -40, -109, -77, -65, 24, 117, 124, 88, 64, 110, -123, -127};
        sServerPublicKeys = null;
    }

    private SecurityGuard() {
    }

    public static void clearVerifiedServerProof(Context context) {
        sLastVerifiedServerBody = null;
        sLastVerifiedServerSig = null;
        if (context != null) {
            try {
                context.getSharedPreferences("ludo_controller_prefs", 0).edit().remove("pref_srv_proof_body").remove("pref_srv_proof_sig").commit();
            } catch (Throwable th) {
            }
        }
    }

    public static String computeAnchorSeal(Context context, String str, String str2, long j, int i) {
        return computeAnchorSeal(context, str, str2, j, i, 0L);
    }

    public static String computeAnchorSeal(Context context, String str, String str2, long j, int i, long j2) {
        byte[] bArr;
        byte[] doFinal;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 28 ? packageManager.getPackageInfo(context.getPackageName(), 134217728) : packageManager.getPackageInfo(context.getPackageName(), 64);
            Signature[] apkContentsSigners = (Build.VERSION.SDK_INT < 28 || packageInfo.signingInfo == null) ? packageInfo.signatures != null ? packageInfo.signatures : null : packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
            if (apkContentsSigners == null || apkContentsSigners.length == 0) {
                return "INVALID_CERT";
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            int length = apkContentsSigners.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    bArr = null;
                    break;
                }
                bArr = apkContentsSigners[i2].toByteArray();
                byte[] digest = messageDigest.digest(bArr);
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", Integer.valueOf(b & 255)));
                }
                if (EXPECTED_CERT_SHA256.equalsIgnoreCase(sb.toString()) || LEGACY_CERT_SHA256.equalsIgnoreCase(sb.toString())) {
                    break;
                }
                i2++;
            }
            if (bArr == null) {
                bArr = EXPECTED_CERT_SHA256.getBytes(StandardCharsets.UTF_8);
            }
            String str3 = str + "|" + str2 + "|" + j + "|" + i + "|" + j2;
            if (Build.VERSION.SDK_INT >= 23) {
                SecretKey orCreateSealKey = getOrCreateSealKey();
                if (orCreateSealKey == null) {
                    return "KEYSTORE_UNAVAILABLE";
                }
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(orCreateSealKey);
                doFinal = mac.doFinal(str3.getBytes("UTF-8"));
            } else {
                Mac mac2 = Mac.getInstance("HmacSHA256");
                mac2.init(new SecretKeySpec(bArr, "HmacSHA256"));
                doFinal = mac2.doFinal(str3.getBytes("UTF-8"));
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < 16; i3++) {
                sb2.append(String.format("%02x", Integer.valueOf(doFinal[i3] & 255)));
            }
            return sb2.toString();
        } catch (Throwable th) {
            return "ERROR_" + System.currentTimeMillis();
        }
    }

    public static boolean constantTimeEquals(String str, String str2) {
        if (str == null || str2 == null || str.length() != str2.length()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i |= str.charAt(i2) ^ str2.charAt(i2);
        }
        return i == 0;
    }

    public static Bundle createAuthenticatedBundle(String str, String str2, String str3, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String trim = str != null ? str.trim() : "";
        String trim2 = str2 != null ? str2.trim() : "";
        bundle.putString("auth_token", generateIpcToken(trim, trim2, str3 != null ? str3.trim() : ""));
        bundle.putString("license_code", trim);
        bundle.putString("device_id", trim2);
        if (sLastVerifiedServerBody != null && sLastVerifiedServerSig != null) {
            bundle.putString("server_body", sLastVerifiedServerBody);
            bundle.putString("server_sig", sLastVerifiedServerSig);
        }
        bundle.putLong("timestamp", System.currentTimeMillis());
        return bundle;
    }

    private static byte[] derInt(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        while (i < i3 - 1 && bArr[i] == 0) {
            i++;
        }
        boolean z = (bArr[i] & 128) != 0;
        byte[] bArr2 = new byte[(z ? 1 : 0) + (i3 - i)];
        System.arraycopy(bArr, i, bArr2, z ? 1 : 0, i3 - i);
        return bArr2;
    }

    public static byte[] deriveIpcKey() {
        Throwable th;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = null;
        try {
            bArr2 = MainActivity.b();
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                Arrays.fill(bArr2, (byte) 0);
                bArr3 = mac.doFinal(("IPC_SESSION_V2|" + getLiveCertSha256(null) + "|" + getOfficialApiUrl(null) + "|MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEa4RRWO6Fls1NUpi5jnyjTD0coJzmo4gyu5gqPA61yKINnFHhGhUAEZ7XluOi2NmPPQ/ZdAiYhikhdwM12tk4Og==").getBytes("UTF-8"));
                Arrays.fill(bArr2, (byte) 0);
            } catch (Throwable th2) {
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
                return bArr3;
            }
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
        return bArr3;
    }

    public static String generateIpcToken(String str, String str2, String str3) {
        Throwable th;
        byte[] bArr;
        byte[] bArr2;
        String str4 = "ERR_TOKEN";
        try {
            long currentTimeMillis = System.currentTimeMillis() / 30000;
            bArr2 = deriveIpcKey();
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                Arrays.fill(bArr2, (byte) 0);
                byte[] doFinal = mac.doFinal(((str != null ? str.trim() : "") + "|" + (str2 != null ? str2.trim() : "") + "|" + currentTimeMillis + "|" + (str3 != null ? str3.trim() : "")).getBytes("UTF-8"));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 16; i++) {
                    sb.append(String.format("%02x", Integer.valueOf(doFinal[i] & 255)));
                }
                str4 = sb.toString();
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
            } catch (Throwable th2) {
                str4 = "ERR_TOKEN";
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
                return str4;
            }
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
        return str4;
    }

    public static String getLiveCertSha256(Context context) {
        sLiveCertSha256 = EXPECTED_CERT_SHA256;
        return EXPECTED_CERT_SHA256;
    }

    public static String getOfficialApiUrl(Context context) {
        String liveCertSha256 = getLiveCertSha256(context);
        if (liveCertSha256 != null && liveCertSha256.length() == 64) {
            byte[] bytes = liveCertSha256.getBytes(StandardCharsets.UTF_8);
            byte[] bArr = new byte[ENC_API_URL.length];
            for (int i = 0; i < ENC_API_URL.length; i++) {
                bArr[i] = (byte) (((ENC_API_URL[i] & 255) ^ (bytes[i % bytes.length] & 255)) ^ (((i * 19) + 90) & 255));
            }
            String str = new String(bArr, StandardCharsets.UTF_8);
            if (str.startsWith("https://")) {
                return str;
            }
            byte[] bArr2 = new byte[LEGACY_ENC_API_URL.length];
            for (int i2 = 0; i2 < LEGACY_ENC_API_URL.length; i2++) {
                bArr2[i2] = (byte) (((LEGACY_ENC_API_URL[i2] & 255) ^ (bytes[i2 % bytes.length] & 255)) ^ (((i2 * 19) + 90) & 255));
            }
            String str2 = new String(bArr2, StandardCharsets.UTF_8);
            if (str2.startsWith("https://")) {
                return str2;
            }
        }
        byte[] bytes2 = EXPECTED_CERT_SHA256.getBytes(StandardCharsets.UTF_8);
        byte[] bArr3 = new byte[ENC_API_URL.length];
        for (int i3 = 0; i3 < ENC_API_URL.length; i3++) {
            bArr3[i3] = (byte) (((ENC_API_URL[i3] & 255) ^ (bytes2[i3 % bytes2.length] & 255)) ^ (((i3 * 19) + 90) & 255));
        }
        String str3 = new String(bArr3, StandardCharsets.UTF_8);
        if (str3.startsWith("https://")) {
            return str3;
        }
        byte[] bytes3 = LEGACY_CERT_SHA256.getBytes(StandardCharsets.UTF_8);
        byte[] bArr4 = new byte[LEGACY_ENC_API_URL.length];
        for (int i4 = 0; i4 < LEGACY_ENC_API_URL.length; i4++) {
            bArr4[i4] = (byte) (((LEGACY_ENC_API_URL[i4] & 255) ^ (bytes3[i4 % bytes3.length] & 255)) ^ (((i4 * 19) + 90) & 255));
        }
        String str4 = new String(bArr4, StandardCharsets.UTF_8);
        return !str4.startsWith("https://") ? "https://ludo-controller-license-api.mdmuajamin.workers.dev" : str4;
    }

    public static String getOfficialTelegramUrl(Context context) {
        if (sNativeLoaded) {
            try {
                String nativeGetTelegramUrl = nativeGetTelegramUrl();
                if (nativeGetTelegramUrl != null) {
                    if (verifyOfficialTelegramLinkIntegrity(nativeGetTelegramUrl)) {
                        return nativeGetTelegramUrl;
                    }
                }
            } catch (Throwable th) {
            }
        }
        byte[] bytes = getLiveCertSha256(context).getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 0) {
            byte[] bArr = new byte[ENC_TG_URL.length];
            for (int i = 0; i < ENC_TG_URL.length; i++) {
                bArr[i] = (byte) (((ENC_TG_URL[i] & 255) ^ (bytes[i % bytes.length] & 255)) ^ (((i * 19) + 90) & 255));
            }
            String str = new String(bArr, StandardCharsets.UTF_8);
            if (verifyOfficialTelegramLinkIntegrity(str)) {
                return str;
            }
        }
        byte[] bytes2 = LEGACY_CERT_SHA256.getBytes(StandardCharsets.UTF_8);
        byte[] bArr2 = new byte[LEGACY_ENC_TG_URL.length];
        for (int i2 = 0; i2 < LEGACY_ENC_TG_URL.length; i2++) {
            bArr2[i2] = (byte) (((LEGACY_ENC_TG_URL[i2] & 255) ^ (bytes2[i2 % bytes2.length] & 255)) ^ (((i2 * 19) + 90) & 255));
        }
        String str2 = new String(bArr2, StandardCharsets.UTF_8);
        if (verifyOfficialTelegramLinkIntegrity(str2)) {
            return str2;
        }
        terminateImmediately();
        return "";
    }

    public static String getOfficialTelegramUsername(Context context) {
        if (sNativeLoaded) {
            try {
                String nativeGetTelegramUsername = nativeGetTelegramUsername();
                if (nativeGetTelegramUsername != null) {
                    if (verifyOfficialTelegramUserIntegrity(nativeGetTelegramUsername)) {
                        return nativeGetTelegramUsername;
                    }
                }
            } catch (Throwable th) {
            }
        }
        byte[] bytes = getLiveCertSha256(context).getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 0) {
            byte[] bArr = new byte[ENC_TG_USER.length];
            for (int i = 0; i < ENC_TG_USER.length; i++) {
                bArr[i] = (byte) (((ENC_TG_USER[i] & 255) ^ (bytes[i % bytes.length] & 255)) ^ (((i * 19) + 90) & 255));
            }
            String str = new String(bArr, StandardCharsets.UTF_8);
            if (verifyOfficialTelegramUserIntegrity(str)) {
                return str;
            }
        }
        byte[] bytes2 = LEGACY_CERT_SHA256.getBytes(StandardCharsets.UTF_8);
        byte[] bArr2 = new byte[LEGACY_ENC_TG_USER.length];
        for (int i2 = 0; i2 < LEGACY_ENC_TG_USER.length; i2++) {
            bArr2[i2] = (byte) (((LEGACY_ENC_TG_USER[i2] & 255) ^ (bytes2[i2 % bytes2.length] & 255)) ^ (((i2 * 19) + 90) & 255));
        }
        String str2 = new String(bArr2, StandardCharsets.UTF_8);
        if (verifyOfficialTelegramUserIntegrity(str2)) {
            return str2;
        }
        terminateImmediately();
        return "";
    }

    private static synchronized SecretKey getOrCreateSealKey() {
        SecretKey secretKey;
        synchronized (SecurityGuard.class) {
            if (Build.VERSION.SDK_INT < 23) {
                secretKey = null;
            } else {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    Key key = keyStore.getKey(SEAL_KEY_ALIAS, null);
                    if (key instanceof SecretKey) {
                        secretKey = (SecretKey) key;
                    } else {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256", "AndroidKeyStore");
                        keyGenerator.init(new KeyGenParameterSpec.Builder(SEAL_KEY_ALIAS, 4).build());
                        secretKey = keyGenerator.generateKey();
                    }
                } catch (Throwable th) {
                    Log.w(TAG, "Keystore seal key unavailable: " + th.getMessage());
                    secretKey = null;
                }
            }
        }
        return secretKey;
    }

    private static PublicKey getServerPublicKey() {
        PublicKey[] serverPublicKeys = getServerPublicKeys();
        if (serverPublicKeys == null || serverPublicKeys.length <= 0) {
            return null;
        }
        return serverPublicKeys[0];
    }

    private static PublicKey[] getServerPublicKeys() {
        if (sServerPublicKeys != null) {
            return sServerPublicKeys;
        }
        ArrayList arrayList = new ArrayList();
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            String[] strArr = {LICENSE_SERVER_PUBLIC_KEY_B64, LEGACY_LICENSE_SERVER_PUBLIC_KEY_B64};
            for (int i = 0; i < 2; i++) {
                try {
                    arrayList.add(keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(strArr[i], 2))));
                } catch (Throwable th) {
                }
            }
        } catch (Throwable th2) {
        }
        PublicKey[] publicKeyArr = (PublicKey[]) arrayList.toArray(new PublicKey[0]);
        sServerPublicKeys = publicKeyArr;
        return publicKeyArr;
    }

    public static String getVerifiedServerBody() {
        return sLastVerifiedServerBody;
    }

    public static String getVerifiedServerSig() {
        return sLastVerifiedServerSig;
    }

    private static boolean isHookingFrameworkLoaded() {
        BufferedReader bufferedReader;
        String lowerCase;
        String[] strArr = {"bin.mt.apksignaturekiller.Hook", "bin.mt.signature.Killer", "bin.mt.plus.Hook", "bin.mt.plus.Signature", "bin.mt.apksignaturekiller", "com.chelpus.Common", "com.chelpus.CheckApk", "org.lsposed.hiddenapi.HiddenApiBridge", "org.lsposed.lspd.core.LSPosed", "io.github.lsposed.lspd.core.LSPosed", "com.elderdrivers.riru.edxp.core.EdXposed", "top.canyie.pine.Pine", "com.swift.sandhook.SandHook", "top.niunaijun.blackbox.BlackBoxCore", "io.virtualapp.VirtualCore", "me.weishu.epic.art.Epic", "de.robv.android.xposed.XposedBridge"};
        for (int i = 0; i < 17; i++) {
            try {
                Class.forName(strArr[i]);
                return true;
            } catch (ClassNotFoundException e) {
            }
        }
        int[] iArr = {27042, 27043, 27044, 27045};
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress("127.0.0.1", i3), 30);
                socket.close();
                return true;
            } catch (Throwable th) {
            }
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/self/status"));
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.startsWith("TracerPid:")) {
                    String[] split = readLine.split(":");
                    if (split.length > 1 && Integer.parseInt(split[1].trim()) > 0) {
                        bufferedReader2.close();
                        return true;
                    }
                }
            }
            bufferedReader2.close();
        } catch (Throwable th2) {
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    bufferedReader.close();
                    break;
                }
                lowerCase = readLine2.toLowerCase();
                if (lowerCase.contains("frida") || lowerCase.contains("xposed") || lowerCase.contains("edxposed") || lowerCase.contains("lsposed") || lowerCase.contains("liblsp") || lowerCase.contains("substrate") || lowerCase.contains("libinject") || lowerCase.contains("libriru") || lowerCase.contains("zygisk") || lowerCase.contains("sandhook") || lowerCase.contains("libepic") || lowerCase.contains("gameguardian") || lowerCase.contains("catch_me_if_you_can") || lowerCase.contains("memfd:frida") || lowerCase.contains("gum-js-loop") || lowerCase.contains("gadget") || lowerCase.contains("libpine")) {
                    bufferedReader.close();
                    return true;
                }
            }
        } catch (Throwable th3) {
        }
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                String lowerCase2 = stackTraceElement.getClassName().toLowerCase();
                if (lowerCase2.contains("de.robv.android.xposed") || lowerCase2.contains("org.lsposed") || lowerCase2.contains("io.github.lsposed") || lowerCase2.contains("top.canyie.pine") || lowerCase2.contains("me.weishu.epic") || lowerCase2.contains("catch_me_if_you_can") || lowerCase2.contains("com.swift.sandhook")) {
                    return true;
                }
            }
        } catch (Throwable th4) {
        }
        return false;
    }

    public static boolean isNativeGuardLoaded() {
        return sNativeLoaded;
    }

    public static boolean isVerified() {
        return sVerifiedOnce;
    }

    public static native String nativeGetTelegramUrl();

    public static native String nativeGetTelegramUsername();

    public static native boolean nativeVerifyOrDie(Context context, String str);

    static byte[] p1363ToDer(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || bArr.length % 2 != 0) {
            return null;
        }
        int length = bArr.length / 2;
        byte[] derInt = derInt(bArr, 0, length);
        byte[] derInt2 = derInt(bArr, length, length);
        int length2 = derInt.length + 2 + 2 + derInt2.length;
        if (length2 > 127) {
            return null;
        }
        byte[] bArr2 = new byte[length2 + 2];
        bArr2[0] = 48;
        bArr2[1] = (byte) length2;
        bArr2[2] = 2;
        bArr2[3] = (byte) derInt.length;
        System.arraycopy(derInt, 0, bArr2, 4, derInt.length);
        int length3 = derInt.length + 4;
        int i = length3 + 1;
        bArr2[length3] = 2;
        bArr2[i] = (byte) derInt2.length;
        System.arraycopy(derInt2, 0, bArr2, i + 1, derInt2.length);
        return bArr2;
    }

    public static void restoreVerifiedServerProof(Context context) {
        if ((sLastVerifiedServerBody == null || sLastVerifiedServerSig == null) && context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("ludo_controller_prefs", 0);
                String string = sharedPreferences.getString("pref_srv_proof_body", null);
                String string2 = sharedPreferences.getString("pref_srv_proof_sig", null);
                if (string == null || string2 == null || !verifyServerSignature(string, string2)) {
                    return;
                }
                sLastVerifiedServerBody = string;
                sLastVerifiedServerSig = string2;
            } catch (Throwable th) {
            }
        }
    }

    public static String signHotspotCommand(String str) {
        byte[] deriveIpcKey;
        if (str == null) {
            return "";
        }
        String str2 = sLastVerifiedServerBody;
        String str3 = sLastVerifiedServerSig;
        if (str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty() || (deriveIpcKey = deriveIpcKey()) == null) {
            return "";
        }
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(deriveIpcKey, "HmacSHA256"));
            byte[] doFinal = mac.doFinal(("HOTSPOT_CMD_V2:" + str.trim()).getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                sb.append(String.format("%02x", Integer.valueOf(doFinal[i] & 255)));
            }
            String str4 = sb.toString() + "|" + Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 2) + "|" + str3.trim();
            return str4;
        } catch (Throwable th) {
            return "";
        } finally {
            Arrays.fill(deriveIpcKey, (byte) 0);
        }
    }

    public static void storeVerifiedServerProof(Context context, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        sLastVerifiedServerBody = str;
        sLastVerifiedServerSig = str2;
        if (context != null) {
            try {
                context.getSharedPreferences("ludo_controller_prefs", 0).edit().putString("pref_srv_proof_body", str).putString("pref_srv_proof_sig", str2).commit();
            } catch (Throwable th) {
            }
        }
    }

    public static void terminateImmediately() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
        }
        try {
            System.exit(0);
        } catch (Throwable th2) {
        }
    }

    public static JSONObject verifyAndParseSignedJson(Context context, String str, String str2, String str3, String str4, String str5) {
        byte[] p1363ToDer;
        java.security.Signature signature;
        boolean z = false;
        if (str == null || str2 == null || str2.trim().isEmpty()) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str2.trim(), 2);
            if (decode == null || decode.length != 64 || (p1363ToDer = p1363ToDer(decode)) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PublicKey[] serverPublicKeys = getServerPublicKeys();
            int length = serverPublicKeys.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                PublicKey publicKey = serverPublicKeys[i];
                try {
                    signature = java.security.Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(publicKey);
                    signature.update(bytes);
                    if (signature.verify(p1363ToDer)) {
                        z = true;
                        break;
                    }
                } catch (Throwable th) {
                }
                i++;
            }
            if (!z) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (str3 != null && !str3.equals(jSONObject.optString("challenge", ""))) {
                return null;
            }
            if (str4 != null && !str4.equals(jSONObject.optString("code", ""))) {
                return null;
            }
            if (str5 != null && !str5.equals(jSONObject.optString("device_id", ""))) {
                return null;
            }
            if (jSONObject.optBoolean("success", false)) {
                storeVerifiedServerProof(context, str, str2.trim());
            }
            return jSONObject;
        } catch (Throwable th2) {
            Log.e(TAG, "verifyAndParseSignedJson error", th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        r1 = com.ludo.controller.SecurityGuard.TAG;
        android.util.Log.e(com.ludo.controller.SecurityGuard.TAG, "Unauthorized certificate found in META-INF: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ee, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x014f, code lost:
    
        r2.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean verifyApkArchiveSignatures(android.content.Context context) {
        return true;
    }

    private static boolean verifyApkSignature(Context context) {
        return true;
    }

    public static boolean verifyIpcToken(String str, String str2, String str3, String str4) {
        if (str == null || str.length() != 32) {
            return false;
        }
        byte[] bArr = null;
        try {
            long currentTimeMillis = System.currentTimeMillis() / 30000;
            bArr = deriveIpcKey();
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            String s1 = str2 != null ? str2.trim() : "";
            String s2 = str3 != null ? str3.trim() : "";
            String s3 = str4 != null ? str4.trim() : "";
            for (long j = -1; j <= 1; j++) {
                byte[] doFinal = mac.doFinal((s1 + "|" + s2 + "|" + (currentTimeMillis + j) + "|" + s3).getBytes("UTF-8"));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 16; i++) {
                    sb.append(String.format("%02x", Integer.valueOf(doFinal[i] & 255)));
                }
                if (constantTimeEquals(str, sb.toString())) {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    return true;
                }
            }
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
            return false;
        } catch (Throwable th) {
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
            return false;
        }
    }

    public static boolean verifyLudoKingProvider(Context context, Uri uri) {
        String str;
        Signature[] signatureArr;
        if (context == null || uri == null) {
            return false;
        }
        try {
            String authority = uri.getAuthority();
            if (authority == null) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(authority, 0);
            if (resolveContentProvider == null || resolveContentProvider.packageName == null) {
                if (!"com.ludo.king.dice".equals(authority)) {
                    return false;
                }
                str = "com.ludo.king";
            } else {
                str = resolveContentProvider.packageName;
            }
            if (!"com.ludo.king".equals(str)) {
                Log.w(TAG, "ContentProvider authority " + authority + " owned by untrusted package: " + str);
                return false;
            }
            Signature[] signatureArr2 = null;
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo != null && packageInfo.signingInfo != null) {
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    signatureArr2 = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                }
                signatureArr = signatureArr2;
            } else {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
                signatureArr = packageInfo2 != null ? packageInfo2.signatures : null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                for (Signature signature : signatureArr) {
                    byte[] digest = messageDigest.digest(signature.toByteArray());
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", Integer.valueOf(b & 255)));
                    }
                    if (EXPECTED_CERT_SHA256.equalsIgnoreCase(sb.toString()) || LEGACY_CERT_SHA256.equalsIgnoreCase(sb.toString())) {
                        return true;
                    }
                }
            }
            Log.w(TAG, "Ludo King provider signature verification failed!");
            return false;
        } catch (Throwable th) {
            Log.w(TAG, "verifyLudoKingProvider exception: " + th.getMessage());
            return false;
        }
    }

    public static boolean verifyOfficialTelegramIntegrity(Context context) {
        return verifyOfficialTelegramLinkIntegrity(getOfficialTelegramUrl(context)) && verifyOfficialTelegramUserIntegrity(getOfficialTelegramUsername(context));
    }

    public static boolean verifyOfficialTelegramLinkIntegrity(String str) {
        if (str == null || str.length() != 31) {
            return false;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return OFFICIAL_TG_SHA256.equalsIgnoreCase(sb.toString());
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean verifyOfficialTelegramUserIntegrity(String str) {
        if (str == null || str.length() != 18) {
            return false;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return OFFICIAL_TG_USER_SHA256.equalsIgnoreCase(sb.toString());
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean verifyOrDie(Context context) {
        if (context == null) {
            terminateImmediately();
            return false;
        }
        if (sNativeLoaded) {
            try {
                if (!nativeVerifyOrDie(context, getLiveCertSha256(context))) {
                    terminateImmediately();
                    return false;
                }
            } catch (Throwable th) {
            }
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            Log.e(TAG, "Debugger detected.");
            terminateImmediately();
            return false;
        }
        if (isHookingFrameworkLoaded()) {
            Log.e(TAG, "Runtime hook detected.");
            terminateImmediately();
            return false;
        }
        if (!verifyApkSignature(context)) {
            Log.e(TAG, "Signature integrity mismatch. Repackaged APK detected.");
            terminateImmediately();
            return false;
        }
        if (!verifyOfficialTelegramIntegrity(context)) {
            Log.e(TAG, "Branding integrity violation. Modded APK detected.");
            terminateImmediately();
            return false;
        }
        getLiveCertSha256(context);
        restoreVerifiedServerProof(context);
        sVerifiedOnce = true;
        return true;
    }

    public static boolean verifyQuick(Context context) {
        if (!sVerifiedOnce || sLiveCertSha256 == null || (!EXPECTED_CERT_SHA256.equalsIgnoreCase(sLiveCertSha256) && !LEGACY_CERT_SHA256.equalsIgnoreCase(sLiveCertSha256))) {
            return verifyOrDie(context);
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return true;
        }
        terminateImmediately();
        return false;
    }

    public static boolean verifyServerSignature(String str, String str2) {
        byte[] p1363ToDer;
        java.security.Signature signature;
        if (str == null || str2 == null || str2.trim().isEmpty()) {
            return false;
        }
        try {
            byte[] decode = Base64.decode(str2.trim(), 2);
            if (decode == null || decode.length != 64 || (p1363ToDer = p1363ToDer(decode)) == null) {
                return false;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (PublicKey publicKey : getServerPublicKeys()) {
                try {
                    signature = java.security.Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(publicKey);
                    signature.update(bytes);
                    if (signature.verify(p1363ToDer)) {
                        return true;
                    }
                } catch (Throwable th) {
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.e(TAG, "verifyServerSignature error", th2);
            return false;
        }
    }

    public static boolean verifyStoredServerProofForLicense(Context context, String str, String str2, long j, int i) {
        return str != null && !str.trim().isEmpty();
    }
}
