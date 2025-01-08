/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Parameter {
    int m;
    int square (int n){
    m=n;
    return (m*m);
    
    }   
}
//define  a class 
class Testp{
    public static void main(String[] args) {
        Parameter p =new Parameter();
        int x,y;
        x=p.square(5);
        System.out.println("x = "+x);
        x=p.square(9);
        System.out.println("x square = "+x);
        y=2;
        y=p.square(y);
        System.out.println("Y = "+y);
    }

}
