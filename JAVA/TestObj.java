/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class TestObj {
    //define  instance variable
    int a;
    //define parametrized construcutor 
    TestObj(int i){
    
    a=i;
    }//end of constructor
    //define a method that returns objects of constructor
    TestObj incryByTen(){
    //declare allocate and initialize objects
    TestObj temp= new TestObj(a+10);
    return (temp);
    
    }//end of incryByTen()

    
}//end of class
class RetObj{
    public static void main(String[] args) {
        //declare allocate and intialize objects
        TestObj ob1= new TestObj(2);
        //declare reference variable
        TestObj ob2;
        //display the value of a before any call
        System.out.println("Ob1.a before call ="+ob1.a);
        //call incryByTen()
        ob2=ob1.incryByTen();
        System.out.println("ob2.a = "+ob2.a);
        //call incryByTen()
        ob2=ob2.incryByTen();
        System.out.println("Ob2 after call = "+ob2.a);
        
        
        
    }//end of main

}//end of class
