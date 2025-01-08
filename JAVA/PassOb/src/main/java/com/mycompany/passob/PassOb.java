/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.passob;

/**
 *
 * @author USER
 */
public class PassOb {

   int a, b;
 public PassOb(int a, int b) {
     this.a = a;
     this.b = b;
    }//End of Constructor
boolean Equals (PassOb o) {
if((o.a== a) && (o.b == b)) {
    return true;
}//End of if()
else {
    return false;
}//End of else()
}//End of equals()
}//End of Class
//Define another class to create objects of a class
class TestPassOb {
//Main Method
public static void main(String[] args) {
        
PassOb ob1 = new PassOb(100, 22);
PassOb ob2 = new PassOb(100, 22);
PassOb ob3 = new PassOb(-1, -1);

System.out.println("ob1 == ob2: " + ob1.Equals(ob2));
System.out.println("ob1 == ob3: " + ob1.Equals(ob3));
System.out.println("ob2 == ob3: " + ob2.Equals(ob3));
}
}
