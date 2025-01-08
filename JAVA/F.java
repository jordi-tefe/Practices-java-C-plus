
public class F {
    //Declaration of instance variable of a class
    
 
int i; // public by default
// private to F
public  int j; 
//Allows to be accessed in a sub class
protected int m, n;
//Define parameterized Method of F
void M1(int x, int y) {
i=x;
j=y;
System.out.println("i in Super="+i);
System.out.println("j in Super="+j);
}//End of M1()
//Define protected instance method of a superclass M2()
protected void M2(int m, int n){
    this.m=m;
    this.n=n;
 System.out.println("m in Super="+m); 
System.out.println("n in Super="+n); 
}//End of M2()

}//End of F
//Define a subclass by the name B 
class B extends F{
//Define Instance method of B sum()
int  Sum(int a, int b) {
    i=a;
    j=b;//ERROR, j is not accessible here
 //Declaration of instance Variable of class B
int total;
total= (i+j); // ERROR, j is not accessible here
return (total);
}//End of Sum()
}//End of  class B


//Define another class to create objects of A and B
class AccessModifiers {
public static void main(String args[]) {
//Declare and create objects of A and B
F a1=new F();
B b1 = new B();
int sum;
//call Super class method M1 through a1 
a1.M1(40, 80);
//Call Super-class method M1() through b1 
b1.M1(10, 12);
//Call a sub-class Name 
sum= b1.Sum(30,40);
System.out.println("Total is " +sum);
//Call Super-class method M2() through b1
b1.M2(400, 600);
}//End of main ()
}//End of class

