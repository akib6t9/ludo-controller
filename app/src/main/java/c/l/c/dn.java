package c.l.c;

import android.util.Base64;
import com.ludo.controller.MainActivity;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class dn implements Runnable {
    final /* synthetic */ MainActivity a;

    public dn(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String readLine;
        String a;
        MainActivity mainActivity = this.a;
        BufferedReader bufferedReader = null;
        Socket socket = null;
        while (mainActivity.I) {
            try {
                String m = mainActivity.m();
                int i = !"127.0.0.1".equals(m) ? mainActivity.an : 18080;
                Socket socket2 = new Socket();
                try {
                    socket2.connect(new InetSocketAddress(m, i), 1500);
                    socket2.setSoTimeout(3000);
                    OutputStream outputStream = socket2.getOutputStream();
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    outputStream.write(("GET /ws HTTP/1.1\r\nHost: " + m + ":" + i + "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: " + Base64.encodeToString(bArr, 2) + "\r\nSec-WebSocket-Version: 13\r\n\r\n").getBytes(StandardCharsets.UTF_8));
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
                        mainActivity.aw = socket2;
                        mainActivity.ax = contains;
                        mainActivity.J = true;
                        mainActivity.av = System.currentTimeMillis();
                        mainActivity.K = mainActivity.n() ? "HOTSPOT / WIFI (" + m + ")" : "SAME DEVICE";
                        mainActivity.ay.post(new Cdo(mainActivity));
                        if (contains) {
                            while (mainActivity.I && !socket2.isClosed() && m.equals(mainActivity.m()) && (a = MainActivity.a(inputStream)) != null) {
                                String trim = a.trim();
                                if (!trim.isEmpty()) {
                                    mainActivity.av = System.currentTimeMillis();
                                    mainActivity.x(trim);
                                }
                            }
                        } else {
                            outputStream.write("STREAM\n".getBytes(StandardCharsets.UTF_8));
                            outputStream.flush();
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                            while (mainActivity.I && !socket2.isClosed() && m.equals(mainActivity.m()) && (readLine = bufferedReader2.readLine()) != null) {
                                try {
                                    String trim2 = readLine.trim();
                                    if (!trim2.isEmpty()) {
                                        mainActivity.av = System.currentTimeMillis();
                                        mainActivity.x(trim2);
                                    }
                                } catch (Throwable th) {
                                    bufferedReader = bufferedReader2;
                                    mainActivity.aw = null;
                                    mainActivity.ax = false;
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
                        mainActivity.aw = null;
                        mainActivity.ax = false;
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
            } catch (InterruptedException e) {
            }
        }
        mainActivity.V = false;
    }
}
