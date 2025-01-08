/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studentgrade;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class StudentGrade
{
    public static void main(String args[])
    {
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
        
        Scanner sc = new Scanner(System.in);
		
        
    
           System.out.print("Enter Marks of Subject:");
           int marks=sc.nextInt();
           
        
        
        //Calculating average here
    
        System.out.print("The student Grade is: ");
        if(marks>=90 && marks<=100)
        {
            System.out.print("A");
        }
        else if(marks>=80 && marks<90)
        {
           System.out.print("B");
        } 
        else if(marks>=50 && marks<80)
        {
            System.out.print("C");
        }
        else if(marks>=40 && marks<50)
        {
            System.out.print("D");
        }
        else if(marks>=20 && marks<40)
        {
            System.out.print("F");
        }
        else
        {
            System.out.print("I");
        }
    }
}

