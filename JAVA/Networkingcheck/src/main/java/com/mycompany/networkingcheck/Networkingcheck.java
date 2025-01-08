/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.networkingcheck;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author USER
 */
public class Networkingcheck {

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
