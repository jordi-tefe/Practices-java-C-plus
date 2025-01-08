/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class BOX5 {
    //instance variable
    double width,height,depth;
    //instance method
    double volume(){
       return (width*height*depth);
    }//end of volume
    
    
}//end of class
class TestBox{
    public static void main(String[] args) {
        BOX5.mybox1=new Box__();
        Bomybox2=new Box__();
        //assign values of myBox's instance varable
        mybox1.width=2;
        mybox1.height=10;
        mybox1.depth=20;
       //assign values to my bo x 2 linstance variable
       mybox2.width=5;
       mybox2.height=6;
       mybox2.depth=7;
       
       double vol;
       vol=mybox1.Volume();
        System.out.println("Volume 1"+vol);
        //System.out.println("Volume 1 "+mybox1.Volume());
        vol =mybox2.Volume();
        System.out.println("Volume 1"+vol);
    }
   
}
