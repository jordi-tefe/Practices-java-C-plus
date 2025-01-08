//Java Program to demonstrate Method overriding. 
//Define a super class by the name A1
class V { 
//Instance variable of super class
int m, n; 
//Parameterized Constructor 
V(int a, int b) { 
m=a; 
n=b; 
} //End of Constructor A1
/*Define dispA() to display i and j when it is called using  super within a sub class */
void M1(){ 
 System.out.println("m =" + m );
 System.out.println("n =" + n );
 
  } //End of dispA()
} //End of class A1
//Define subclass B1 that extends superclass A1
class B extends V { 
int k; 
//Define Parameterized constructor B1
B(int a, int b, int c) { 
//Calling constructor of A1 using super
super(a, b); 
this.k=c; 
 } //End of constructor B1
//This method overrides the method in A1
@Override
  void M1(){
 //Call the superclass version of dispA() using super
  super.M1();
System.out.println("k= " + k); 
  }//End of dispA() 
}//End of Class B1
//Define another class to create objects of sub class
class TestOverRide{
//Main method()
 public static void main(String args[]) { 
 //Declare, create and initialize objects of A1
 V a1=new V(200,400);
 //Declare, create and initialize objects of B1
 B b1 = new B(20, 60, 100); 
 //CalldispA()-the super class version of A1
 a1.M1();
 // This calls dispA() in B1 not in A1
b1.M1(); 
}//End of main () 
} //End of Class
