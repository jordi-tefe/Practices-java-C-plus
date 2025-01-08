import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

class Reader implements Runnable{
    DataInputStream dis;
    Socket socket;
    Reader(Socket s){
        try{
            dis = new DataInputStream(s.getInputStream());
        }catch(Exception e){}
        socket =s;
    }
    public void run(){
        String msg;
        try{
            while(!socket.isClosed()){
                msg = dis.readUTF();
                System.out.println("Client >> " +msg);
            }
        }catch(IOException e){}
    }
}
public class Client {
    public static void main(String args[]) { 
        try{
            InetAddress add = InetAddress.getLocalHost();
            //System.out.println(add);
            Socket s = new Socket(add, 8080);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            Reader mr = new Reader(s);
            Thread t1 = new Thread(mr);
            t1.start();
            Scanner sc = new Scanner(System.in);
            String msg;
            do{
                msg = sc.nextLine();
                dos.writeUTF(msg);
            }while(msg.compareTo("quit")!=0);
            s.close();
        }catch(IOException e){}
    }
}
