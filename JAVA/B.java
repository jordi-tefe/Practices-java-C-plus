public class B extends B {
//define instance variable ofsuper class
    int i,j;
    //define instance method of suer class
void M1(){
    System.out.println("i = "+i);
    System.out.println(" j ="+j);
}//end of M1()
}//end of super class
class C extends B{
    //define instance variable of sub class
   int m,n;
   //define instance method of sub class
   void M2(){
       System.out.println("m = "+m);
       System.out.println("n = "+n);
  
   }// end of M3 method
   
}//end of subclass
    //define another class
    class TestInheritance {
           //main method
        public static void main(String[] args) {
            /*declare and create objects of both supe and sub class*/
            B b1=new B();
            C c1=new C();
            //initialize a1's inst
            b1.i=200;
            b1.j=300;
            //call M1() through b1
            b1.M1();
            
            //intialize b1'w instance variable
            c1.i=400;
            c1.j=500;
            c1.m=600;
            c1.n=700;
            //call M1() thorugh c1
            c1.M1();
            //call M2() through c1
            c1.M2();  
        }
    }
