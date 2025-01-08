
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author USER
 */
public class TCPClientExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)throws Exception{
        InetAddress addr = InetAddress.getLocalHost();
        Socket s = new Socket(addr, 8888);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        DataInputStream dis = new DataInputStream(is);
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("Hello server, I need your help");
        System.out.println(dis.readUTF());
        s.close();
        /*String str = "MHProfessional.com";
        byte [] b = str.getBytes();
        os.write(b); // Read and display response.
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();*/
    }
}
