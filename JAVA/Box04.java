/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Box04 {
    double width,height,depth;
    Box04(double w, double h, double d)
    {
    width=w;
    height=h;
    depth=d;

    
    }
    
    double Volume (){
    
    return (width*height*depth);
    
    
    }
}
class MatchBox04 extends Box04{

double weight;
MatchBox04(int w, int h, int d,int wt){

super (w,h,d);
weight=wt;

}

    MatchBox04(int i, int i0, int 1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 void  M1(){
     System.out.println("weight of match Box is"+weight);
 
 
 }

}
  class TestBox04{
      public static void main(String[] args) {
          
          Box04 b1,b2;
          //declare create and initialze objects of m3
          MatchBox04 mb1= new MatchBox04 (2,5,6);
          //assign objects of mb1 to create of b1
         
          
          b1=mb1;
          b2=mb1; new MatchBox04(6,8,12);
          
          System.out.println("Volume of b1"+b1.Volume());
          System.out.println("Volume of b2="+b2.Volume());
          System.out.println("Volume of mb1 ="+mb1.Volume());
          mb1.M1();
      }  
  
  }      















