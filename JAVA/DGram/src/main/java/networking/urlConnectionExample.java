package com.mycompany.networking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class urlConnectionExample{
    public static void main(String args[]) throws Exception{
        //URL hp = new URL("http://www.google.com");
        URL hp = new URL("file://localhost/home/yir/newJavaFile.java");
        URLConnection hpCon = hp.openConnection();
        long d = hpCon.getDate();
        System.out.println("Date: " + new Date(d));
        System.out.println("Content-Type: " + hpCon.getContentType());
        d = hpCon.getExpiration();
        System.out.println("Expires: " + new Date(d));
        d = hpCon.getLastModified();
        System.out.println("Last-Modified: " + new Date(d));
        long len = hpCon.getContentLengthLong();
        System.out.println("Content-Length: " + len);
        int c;
        if(len != 0) {
            System.out.println("=== Content ===");
            InputStream input = hpCon.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("No content available.");
        }
    }
}
