/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatype;

/**
 *
 * @author USER
 */
 import java.util.Scanner;
public class Datatype {

     byte byteVal;
    short shortVal;
    int intVal;
    long longVal;
    float floatVal;
   
    void B(){
        System.out.println("Byte value"+byteVal);
        
    }
    void S(){
        System.out.println("Short vlue"+shortVal);
    }
     void I(){
        System.out.println("Int vlue"+intVal);
        
    }
      void L(){
        System.out.println("Long vlue"+longVal);
    }
       void F(){
        System.out.println("Float vlue"+floatVal);
    }
}
class TestDatatype{
    public static void main(String[] args) {
    Datatype d=new Datatype();
  
    //Creat scanner object
    Scanner input=new Scanner(System.in);
    System.out.println("Enter byte value");
    d.byteVal =input.nextByte();
    System.out.println("Enter short value");
    d.shortVal=input.nextShort();
    System.out.println("Enter int value");
    d.intVal=input.nextInt();
    System.out.println("Enter long value");
    d.longVal=input.nextLong();
    System.out.println("Enter float value");
    d.floatVal=input.nextFloat();
    //print all the variable
   d.B();
   d.S();
   d.I();
   d.L();
   d.F();
    }
}
    

 /*Datatype(byte b,short s,int i,long l,float f){
      this.byteVal=b;
        this.shortVal=s;
        this.intVal=i;
        this.longVal=l;
        this.floatVal=f;
 System.out.println("You have entered byte "+d.byteVal);
     System.out.println("You have entered short  "+d.shortVal);
      System.out.println("You have entered int "+d.intVal);
       System.out.println("You have entered long "+d.longVal);
        System.out.println("You have entered float "+d.floatVal);
       
    }*/