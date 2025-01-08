package networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class datagramClient {
    public static void main(String args[]) throws Exception{
        DatagramSocket dgs = new DatagramSocket();
        String str = "Hello server, I need your help";
        byte [] b = str.getBytes();
        InetAddress addr = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b, b.length, addr, 8888);
        dgs.send(dp);
        System.out.println("client is waiting for response");
        dgs.receive(dp);
        //String res = new String(dp.getData(), 0, dp.getLength());
        System.out.println(new String(dp.getData(), 0, dp.getLength()));
    }
}
