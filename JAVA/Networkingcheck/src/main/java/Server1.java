import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Writer implements Runnable{
    Socket socket;
    Scanner sc;
    DataOutputStream dos;
    Writer(Socket s){
        socket = s;
        try{
            sc = new Scanner(System.in);
            dos = new DataOutputStream(socket.getOutputStream());
        }catch(IOException e){}
    }
    public void run(){
        try{
            String msg;
            do{
                msg = sc.nextLine();
                dos.writeUTF(msg);
            }while(msg.compareTo("quit")!=0);
        }catch(IOException e){}
    }
}
public class Server1 {
    public static void main(String args[]) throws IOException{
        ServerSocket ss = new ServerSocket(8080);//seerver create yaregal
        System.out.println("Server is waiting for connection");
        Socket s = ss.accept();
        System.out.println("a new client accepted");
        Writer mw = new Writer(s);
        Thread t1 = new Thread(mw);
        t1.start();
        DataInputStream dis = new DataInputStream(s.getInputStream()); 
        String msg;
        do{
            msg = dis.readUTF();
            System.out.println("Client >> " +msg);
        }while(msg.compareTo("quit")!=0);
    }
}
