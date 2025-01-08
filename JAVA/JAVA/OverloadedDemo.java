/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class OverloadedDemo {
    //define overloaded method
    void M1(){
        System.out.println("No Parameter");
        
    }
    void M1(int a){
        System.out.println(" a = "+a);
    }
    void M1(int a,int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        
    
    }
    double M1(double a){
        return (a*a)+100;
    
    }
    
}//end of class
//define another 
class Testoverloaded{
    public static void main(String[] args) {
        //declare and create objects
        OverloadedDemo ob= new OverloadedDemo();
        //call each version of overloaded method
        
        ob.M1();
        ob.M1(200);
        ob.M1(400,600);
        double o;
        o=ob.M1(100.5);
        System.out.println("a double "+o);
        
    }

}
