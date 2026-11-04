package c.l.c;

import android.net.wifi.WifiManager;
import com.ludo.controller.MainActivity;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public final class dl implements Runnable {
    final /* synthetic */ MainActivity a;

    public dl(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override
    public final void run() {
        try {
            WifiManager wifiManager = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock("ControllerUdpMulticast");
                createMulticastLock.setReferenceCounted(false);
                createMulticastLock.acquire();
            }
        } catch (Throwable th) {
        }
        try {
            DatagramSocket datagramSocket = new DatagramSocket((java.net.SocketAddress) null);
            datagramSocket.setReuseAddress(true);
            datagramSocket.setBroadcast(true);
            datagramSocket.bind(new InetSocketAddress(18082));
            this.a.cu = datagramSocket;
            byte[] bArr = new byte[256];
            while (this.a.I && !datagramSocket.isClosed()) {
                try {
                    DatagramPacket datagramPacket = new DatagramPacket(bArr, 256);
                    datagramSocket.receive(datagramPacket);
                    String trim = new String(datagramPacket.getData(), 0, datagramPacket.getLength(), StandardCharsets.UTF_8).trim();
                    if (trim.startsWith("LUDO_BEACON") || trim.startsWith("LUDO_HERE")) {
                        String hostAddress = datagramPacket.getAddress().getHostAddress();
                        if (hostAddress != null && !hostAddress.isEmpty() && !MainActivity.n(hostAddress)) {
                            String str = this.a.ao;
                            this.a.ao = hostAddress;
                            this.a.ct = hostAddress;
                            this.a.cs = System.currentTimeMillis();
                            if (!hostAddress.equals(str) && !this.a.al && (this.a.am == null || this.a.am.trim().isEmpty())) {
                                Socket socket = this.a.aw;
                                if (socket != null) {
                                    try {
                                        socket.close();
                                    } catch (Throwable th2) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                }
            }
            if (this.a.cu != null) {
                try {
                    this.a.cu.close();
                } catch (Throwable th4) {
                }
                this.a.cu = null;
            }
        } catch (Throwable th5) {
        }
    }
}
