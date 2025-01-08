import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Buffer{
    List<String> messages;
    Map<Socket, DataOutputStream> clients;
    public Buffer(){
        messages = Collections.synchronizedList(new LinkedList<>());
        clients = Collections.synchronizedMap(new HashMap<>());//it store socket and data outputstring
    }
    synchronized void addMessage(String msg){
        messages.add(msg);
        notify();
    }
    void addClient(Socket s){
        try{
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            clients.put(s, dos);
        }catch(IOException e){}
        
    }
    synchronized void sendMessages(){
        try{
            while(messages.isEmpty())
                wait();
            String msg = messages.removeFirst();
            Collection<DataOutputStream> set = clients.values();
            for(DataOutputStream dos: set)
                dos.writeUTF(msg);
        }catch(IOException | InterruptedException e){}
    }
}
class Receiver implements Runnable{
    DataInputStream dis;
    Buffer buffer;
    Socket socket;
    Receiver(Socket s, Buffer b){
        try{
            socket = s;
            dis = new DataInputStream(socket.getInputStream());
            buffer = b;
        }catch(IOException e){}
    }
    public void run(){
        String msg;
        try{
            do{
                msg = dis.readUTF();
                buffer.addMessage(msg);
            }while(msg.compareTo("quit")!=0);
            buffer.clients.remove(socket);
            socket.close();
        }catch(IOException e){}
    }
}
class Sender implements Runnable{
    Buffer buffer;
    Sender(Buffer b){
        buffer = b;
    }
    public void run(){
        while(true)
            buffer.sendMessages();
    }
}   
public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);//server create
        System.out.println("Server is waiting for connection");
        Buffer b = new Buffer();// create a buffer
        new Thread(new Sender(b)).start();//thread creation and b is buffer
        Thread t;
        Socket s;
        
        while(true){
            s = ss.accept();//accept the client socket
            System.out.println("a new client accepted");
            t = new Thread(new Receiver(s, b));//another thread created for each connection
            t.start();
            b.addClient(s);
        }
    }
}
