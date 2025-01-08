/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class CallByValue {
    //parameterized method
    void M1(int i,int j){
    i=(i*2);
    j=(j/2);
    }//end of m1()
}//end of class
class TestValue{
    public static void main(String[] args) {
        CallByValue o = new CallByValue();
        int a,b;
        a=15;
        b=20;
        System.out.println("a  before call = "+a);
        System.out.println("b  before call = "+b);
        //call M1
        o.M1(a, b);
        System.out.println("a after call = "+a);
        System.out.println("b after call = "+b);
        
    }
}
