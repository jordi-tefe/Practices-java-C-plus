/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorial;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
            int F = 1;  
        int i = 1; 
        Scanner sc = new Scanner(System.in);  
 
        System.out.println("Enter a number whose factorial is to be found: ");  
        int num = sc.nextInt();  
          
        while( i <= num ){  
            F = F * i;   
            i++; 
        }     
  
         System.out.println("\nFactorial of " + num + " is: " + F);  
       
    }
}
