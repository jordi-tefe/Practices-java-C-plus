/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class PassOb {
    int a,b;
    PassOb(int a,int b){
    this.a=a;
    this.b=b;
    
    }
    //define a method
    boolean equals(PassOb o){
        if ((o.a==a)&&(o.b==b)) {
        return true;
        }
        else {
        return false;
        }
    }//end of equals
}//end of class

//define another class
    class TestOb{
        public static void main(String[] args) {
            //declare,allocate and initialize objects
            PassOb ob1=new PassOb(100,20);
            PassOb ob2=new PassOb(100,20);
            PassOb ob3=new PassOb(2,2);
            
            System.out.println("Ob1==ob2"+ob1.equals(2));
            System.out.println("Ob1==ob3"+ob1.equals(3));
            System.out.println("Ob2==ob3"+ob2.equals(3));
        }
    
    }










