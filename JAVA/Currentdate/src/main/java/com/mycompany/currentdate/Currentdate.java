/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.currentdate;

/**
 *
 * @author USER
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Currentdate {

    public static void main(String[] args) {
        int i;
        long millis= System.currentTimeMillis();
        for(i=1;i<=7;i++){
            switch(i){
                case 1:System.out.println("Monday");
                break;
                case 2:System.out.println("Tuesday");
                break;
                case 3:System.out.println("Wednesday");
                break;
                case 4:System.out.println("Thursday");
                break;
                case 5:System.out.println("Friday");
                break;
                case 6:System.out.println("Saturday");
                break;
                case 7:System.out.println("Sunday");
                break;
                    
            }
            
        }
        System.out.println("++++++Current Date+++++");
        java.util.Date cDate=new java.util.Date(millis);
            System.out.println(cDate);
        
    }
}
