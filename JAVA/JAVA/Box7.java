/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Box7 {
    double width,height,depth;
    Box7(){
    width=10;
    height=10;
    depth=10;
    }//end of constructor
   double volume(){
   return (width*height*depth);
   } 
}//end of class
class Test{
    public static void main(String[] args) {
    //declare and initialize object
    Box7 b1=new Box7();
    Box7 b2=new Box7();
    double vol;
    vol=b1.volume();
   System.out.println("Volume 1="+vol);
    vol=b2.volume();
    
        System.out.println("Volume 2="+vol);
    }
    
}
