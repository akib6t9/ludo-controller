package c.l.c;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public final class u {
    private static final String a = "CryptoStorage";
    private static final String b = "AES/GCM/NoPadding";

    /* renamed from: c, reason: collision with root package name */
    private static final String f46c = "ENC_V2:";
    private static final int d = 12;
    private static final int e = 128;
    private static final String f = "ludo_controller_storage_v3";
    private static volatile SecretKey g = null;

    private u() {
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            SecretKey a2 = a();
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(1, a2);
            byte[] iv = cipher.getIV();
            if (iv == null || iv.length != d) {
                return null;
            }
            byte[] doFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
            byte[] bArr = new byte[doFinal.length + d];
            System.arraycopy(iv, 0, bArr, 0, d);
            System.arraycopy(doFinal, 0, bArr, d, doFinal.length);
            return f46c + Base64.encodeToString(bArr, 2);
        } catch (Throwable th) {
            Log.e(a, "Encryption failed", th);
            return null;
        }
    }

    private static String a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (!str.startsWith(f46c)) {
            Log.w(a, "Rejected unencrypted preference value");
            return str2;
        }
        try {
            byte[] decode = Base64.decode(str.substring(7), 2);
            if (decode.length <= 28) {
                return str2;
            }
            byte[] bArr = new byte[d];
            System.arraycopy(decode, 0, bArr, 0, d);
            int length = decode.length - 12;
            byte[] bArr2 = new byte[length];
            System.arraycopy(decode, d, bArr2, 0, length);
            SecretKey a2 = a();
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(e, bArr);
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(2, a2, gCMParameterSpec);
            return new String(cipher.doFinal(bArr2), StandardCharsets.UTF_8);
        } catch (Throwable th) {
            Log.w(a, "AEAD GCM decryption failed (tampered or cloned data)");
            return str2;
        }
    }

    private static synchronized SecretKey a() throws Exception {
        SecretKey generateKey;
        synchronized (u.class) {
            if (g != null) {
                generateKey = g;
            } else {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                Key key = keyStore.getKey(f, null);
                if (key instanceof SecretKey) {
                    generateKey = (SecretKey) key;
                    g = generateKey;
                } else {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(new KeyGenParameterSpec.Builder(f, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                    generateKey = keyGenerator.generateKey();
                    g = generateKey;
                }
            }
        }
        return generateKey;
    }

    public static void a(SharedPreferences.Editor editor, String str, String str2) {
        if (editor == null) {
            return;
        }
        if (str2 == null) {
            editor.remove(str);
            return;
        }
        String a2 = a(str2);
        if (a2 == null) {
            editor.remove(str);
        } else {
            editor.putString(str, a2);
        }
    }

    public static void a(SharedPreferences sharedPreferences, String str, String str2) {
        if (sharedPreferences == null) {
            return;
        }
        if (str2 == null) {
            sharedPreferences.edit().remove(str).commit();
            return;
        }
        String a2 = a(str2);
        if (a2 == null) {
            sharedPreferences.edit().remove(str).commit();
        } else {
            sharedPreferences.edit().putString(str, a2).commit();
        }
    }

    public static String b(SharedPreferences sharedPreferences, String str, String str2) {
        String string;
        return (sharedPreferences == null || (string = sharedPreferences.getString(str, null)) == null) ? str2 : a(string, str2);
    }
}
