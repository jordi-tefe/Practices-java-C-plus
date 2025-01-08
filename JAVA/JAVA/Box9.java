/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Box9 {
    double width,height,depth;
    Box9(double w){
    width=w;
        System.out.println("This is one argumement constructor");
    
    }
    Box9(double w,double h){
    this(w);
    height=h;
        System.out.println("This is 2 argumement constructor");
    }
    Box9(double w,double h,double d){
    this(w,h);
    depth=d;
        System.out.println("This is 3 argumement constructor");
    }
    double volume(){
    return (width*height*depth);
    
    }//end of class
}
    class TestConstructor{
        public static void main(String[] args) {
            //declare ,allocate anf initialize
            Box9 b1=new Box9(10,7,9);
            double vol;
            vol=b1.volume();
            System.out.println("Volume ="+vol);
        }}
    
    
    
    
    
    
    
    
    
    
    
    
    }
