class M{
 int i;
 public M(int i){
this.i=i;
}//End of Constructor A
 void M1(){
System.out.println("This is from A");
    }//End of M1()
}//End of A
class B extends M{
 int j; //variables of B class
//Initialize the super class members i using super()
 B(int i, int j){
super(i); //calling the constructor of the super class
this.j = j;
}//End of Constructor
 void M2(){
     System.out.println("This from B");
 }     
}
class C extends B{
int k;
C (int i, int j, int k){

super (i,j);
this.k=k;

}
void M3(){
    System.out.println("This is from C");

}
      
}
class UsingSuper{
//Main Method
public static void main(String args[]){
B b1=new  B(20, 400);
C o1 = new C(40, 60, 100);
//Call M1() and M2() using objects of B
b1.M1();
b1.M2();
System.out.println("i in A= " + b1.i);
System.out.println("j in B= " + b1.j);
//Call all versions of Classes using objects of C 
o1.M1();
o1.M2();
o1.M3();
System.out.println("i in A= " + o1.i);
System.out.println("j in B = " + o1.j);
System.out.println("k in C = " + o1.k);
 }//End of main ()
}//End of class

