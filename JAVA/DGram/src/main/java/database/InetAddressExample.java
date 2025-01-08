
package database;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

    public static void main(String[] args) throws UnknownHostException{
        InetAddress addr1 = InetAddress.getLocalHost();
        System.out.println(addr1);
        InetAddress addr2 = InetAddress.getByName("www.google.com");
        System.out.println(addr2);
        InetAddress[] addr3 = InetAddress.getAllByName("www.yahoo.com");
        for (InetAddress addr : addr3) {
            System.out.println(addr);
        }
    }
}
