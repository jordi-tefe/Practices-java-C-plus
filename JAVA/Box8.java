/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Box8 {
    double width,height,depth;
    //define parameterized constructor
    Box8(double w,double h, double d){
    width=w;
    height=h;
    depth=d;
    }//end of constructor
   double volume(){
   return (width*height*depth);
   } 
}//end of class
class TestConstructor{
    public static void main(String[] args) {
    //declare and initialize object
    Box8 b1=new Box8(10,8,9);
    Box8 b2=new Box8(5,6,20);
    double vol;
    vol=b1.volume();
   System.out.println("Volume 1="+vol);
    vol=b2.volume();
        System.out.println("Volume 2="+vol);
    }
    
}
