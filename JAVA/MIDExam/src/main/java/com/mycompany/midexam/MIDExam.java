/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.midexam;

/**
 *
 * @author USER
 */
public class MIDExam {
  
  /** Main method
     * @param args */
    public static void main(String[] args) {
        
 // Display the table heading
System.out.println("           Multiplication Table");
 // For Loop to Display the number title
for (int j = 1; j <= 6; j++){
System.out.print("   " + j);
}
System.out.println("\n———————");

for (int i = 1; i<= 6; i++) {
System.out.print(i + " | ");
for (int j = 1; j <= 6; j++) {

System.out.printf("%4d", i * j);
 }
System.out.println();
}
    }
}


