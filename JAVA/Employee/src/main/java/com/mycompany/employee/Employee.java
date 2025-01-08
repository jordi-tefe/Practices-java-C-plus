/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employee;

/**
 *
 * @author USER
 */
public class Employee {

   
    String fName;
    String lName;
    static int count;
    public Employee(String fn, String ln){
        fName= fn;
        lName= ln;
        count++;
    }
    protected void finalize()
    {
    System.out.println("Name:"+ fName + " "+lName+ " "+count);
        count--;
    }
    }
class TestFinalize{
        public static void main(String[] args) {
        
       Employee e1, e2;
      e1= new  Employee("Nigussie", "Teferi");
      e2= new  Employee("Zelalem", "Getahun");
      e2= new  Employee("Zinash", "Getachew");
      //If the system.gc() method is not included, there is no output displayed
  //so we have to add this method to display an output
      System.gc();
          }
}

