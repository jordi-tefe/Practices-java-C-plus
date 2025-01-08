/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herarci;

/**
 *
 * @author USER
 */
public class Herarci {

    double width,height,depth,r;
    double Volume(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
        return width*height*depth;
    }
}
class RectArea extends Herarci{
   double  RectArea(double w,double h){
       width=w;
       height=h;
       return height*width;
   }
}
class TrigArea extends Herarci{
    double TrigArea(double w,double h){
        width=w;
        height=h;
        return 0.5*width*height;
    }
}
class CircleArea extends Herarci{
    double CirArea(double rad){
        r=rad;
        return r*r* Math.PI;
    }
}
class HeraTest{
    public static void main(String[] args) {
        Herarci z=new Herarci();
       RectArea a=new RectArea();
       TrigArea b=new TrigArea();
       CircleArea c=new CircleArea();
      double a1= a.RectArea(4, 5);
        System.out.println("Rect area="+a1);
      double a2= a.Volume(3, 4, 5);
        System.out.println("Volume of box="+a2);
      double a3= b.TrigArea(3, 4);
        System.out.println("Trig area="+a3);
      double a4= c.CirArea(4);
        System.out.println("Circle Area="+a4);
    }
}