/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class For2 {

    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
         System.out.println("Enter");
        int n=a.nextInt();
        System.out.println("/n---------");
        int sum=0;
        for(int i=1;i<=n;i++){
            
            System.out.println(""+i);
            sum+=n;
        }
         System.out.println("Sum"+n+"N no"+sum);
    }
    
}
