/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Area3 {
    //define overloaded method
    
    int M1(int a, int b){
        return (b*a);
    
    }
    
    double M1(double a, double b){
        return (0.5*(a*b));
        
        
    }
 
    double M1(double a){
        return (3.14*a*a);
    }
}//end of class
//define another 
class Testoverloaded{
    public static void main(String[] args) {
        //declare and create objects
        Area3 ob= new Area3();
        //call each version of overloaded method
        
       
        double o;
        o=ob.M1(20,40);
        System.out.println("Fuckn Rectangle is"+o);
       
        o=ob.M1(20.4,36.8);
        System.out.println("Triangle is"+o);
    
            o=ob.M1(69);
        System.out.println("Circle is "+o);
    
    }

}
