/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testa;

/**
 *
 * @author USER
 */
class A{
    
    int num = 10;
    
    
    public void display(int x) {
        System.out.println("Value of x in Class A: " + x);
    }
    
    //Overload from above method
    public void display(int x, int y) {
        System.out.println("Value of x and y in Class A: " + x + ", " + y);
    }
}
class B extends A{
    // Overridden display(int x) from class A
    
    public void display(int x) {
        System.out.println("Value of x in Class B: " + x);
    }
}
class C extends B{
    // Additional method 
    public void show(int z) {
        System.out.println("Value of z in Class C: " + z);
    }
    // Overridden Display(it x,int y) from class A
    
    public void display(int x, int y) {
        System.out.println("Value of x and y in Class C: " + x + ", " + y);
    }
}
public class TestA {

    public static void main(String[] args) {
        
        A a = new A();
        a.display(5);  
        a.display(5, 10); 
        B b = new B();
        b.display(5);  
        b.display(5, 10); 
        
        
        C c = new C();
        c.display(5);  
        c.display(5, 10); 
        c.show(15);  
    }
}
