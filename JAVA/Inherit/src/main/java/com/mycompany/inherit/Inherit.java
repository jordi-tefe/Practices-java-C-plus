/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inherit;

/**
 *
 * @author USER
 */
 class Inherit {

    int Width,Height,Depth;
    double r;
    public int Vol(int w,int h,int d){
        int V;
        this.Width=w;
        this.Height=h;
        this.Depth=d;
        V=Width*Height*Depth;
        return V;
    }
}
class Arear extends Inherit{
    int rArea(int w,int h){
        this.Width=w;
        this.Height=h;
        return (Width*Height);
    }
}
  class Areat extends Inherit{
      int tArea(int w,int h){
          this.Width=w;
          this.Height=h;
          return (Width*Height)/2;
      }
  }
class Areac extends Inherit{
    double cArea(double R){
        this.r=R;
        return (r*r)*Math.PI;
        
    }
}
class TestInherit{
   
    public static void main(String[] args) {
        Arear a1=new Arear();
        Areat a2=new Areat();
        Areac a3=new Areac();
        System.out.println("Rectangle Area"+a1.rArea(2, 5));
        System.out.println("Triangle Area"+a2.tArea(4, 5));
        System.out.println("Circle Area"+a3.cArea(5));
                
    }
}

     
