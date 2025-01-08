/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midt3;

/**
 *
 * @author USER
 */
public class MIDT3 {

  
int a;
int b;
int c;
int d;

   
MIDT3(int a, int b, int c, int d){
this.a=a;
this.b=b;
this.a=c;
this.d=c;
    }
    public int M1(){
    return (a*a);
}
public int M2() {
        return (b*b);
    }
public int M3() {
        return (c*c);
    }
public int M4() {
        return (d*d);
    }
}
 class TestMIDT3 {
 public static void main(String[] args) {
MIDT3 p = new MIDT3(10,6,15,30);
int m, n,k,j;
   m=p.M1();
System.out.println("m="+m);
   n=p.M2();
System.out.println("n="+n);
   k=p.M3();
System.out.println("k="+k);
   j=p.M4();
System.out.println("j="+j);

           }
}


    

