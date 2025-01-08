/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
//define a class
 class CallRef {
    int a,b;
    //define para,eterized constructor
    CallRef(int i,int j){
    a=i;
    b=j;
    } //end of constructor
    //
    /*define parameterized method object as class type*/
    
    void M1(CallRef o){
    o.a=((o.a)*2);
    o.b=((o.b)/2);
    
    
    }//end of M!
    
}////end of class
class TestRef{
    public static void main(String[] args) {
        //declare alocator and intialize objects
        CallRef ob1= new CallRef(15,20);
      
        System.out.println("ob1.a before call="+ob1.a);
        System.out.println("ob1.b before call ="+ob1.b);
        
        //call M1()
        ob1.M1(ob1);
        System.out.println("ob1.a after call="+ob1.a);
        System.out.println("ob1.b after call ="+ob1.b);
    }
    
}