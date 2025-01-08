package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerExample {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("server is waiting ");
        Socket s = ss.accept();
        
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        DataInputStream dis = new DataInputStream(is);
        DataOutputStream dos = new DataOutputStream(os);
        System.out.println(dis.readUTF());
        dos.writeUTF("Hello dear client, u r welcome");
        ss.close();       
    }
}
