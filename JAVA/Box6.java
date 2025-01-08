/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Box6 {
    double width,height,depth;
    double Volume (double w, double h,double d ){
    width=w;
    height=h;
    depth=d;
    double v;
    v=(width*height*depth);
     return (v);
    
    }
}
class TestBox{
        public static void main(String[] args) {
        Box6 mybox1=new Box6();
        Box6 mybox2=new Box6();
        double vol;
        //call volume
        vol=mybox1.Volume(20, 5, 6);
            System.out.println("Volume 1= "+vol);
        vol=mybox2.Volume(2, 7, 8);
         System.out.println("Volume 2="+vol);
            
            
            
    }

}
