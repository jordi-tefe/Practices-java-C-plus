package networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class datagramServer {
    public static void main(String args[]) throws Exception {
        DatagramSocket dgs =new DatagramSocket(8888);//bing port to socket
        byte [] buf = new byte[1024];
        DatagramPacket dgp = new DatagramPacket(buf, buf.length);
        System.out.println("server is waiting for message");
        dgs.receive(dgp);
        System.out.println(new String(dgp.getData(), 0, dgp.getLength()));
        String str = "Hello client, you are welcome";
        byte [] bb = str.getBytes();
        DatagramPacket dgp1 = new DatagramPacket(bb, bb.length, dgp.getAddress(),dgp.getPort());
        dgs.send(dgp1);
    }
}
