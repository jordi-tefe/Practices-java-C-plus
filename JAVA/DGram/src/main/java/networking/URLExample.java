package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLExample {
    public static void main(String args[]) throws Exception{
        //URL hp = new URL("file://localhost/home/yir/newJavaFile.java");
        URL hp = new URL("http://www.google.com");
        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        BufferedReader in = new BufferedReader(new InputStreamReader(hp.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
