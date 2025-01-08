public class W {
//define instance variable ofsuper class
    int a,b;
    //define instance method of suer class
void M1(){
    System.out.println("a = "+a);
    System.out.println(" b ="+b);
}//end of M1()
}//end of super class
class X extends W{
    //define instance variable of sub class
   int m,n;
   //define instance method of sub class
   void M2(){
       System.out.println("m = "+m);
       System.out.println("n = "+n);
  
   }// end of M3 method
   class Y extends W{
       
   int i,j,k;
    void M3() {
        System.out.println("i="+i);
       System.out.println(" j = +j");
       System.out.println("k="+k); } 
       
   } 
   
   
   
}//end of subclass
    //define another class
    class TestInheritance {
           //main method
        public static void main(String[] args) {
            /*declare and create objects of both supe and sub class*/
            W w1=new W();
            X x1=new X();
            Y y1=new Y();
            
            //initialize a1's inst
            w1.a=100;
            w1.b=200;
            //call M1() through b1
            w1.M1();
            y1.M3();
            
            
            //intialize b1'w instance variable
            x1.a=400;
            x1.b=500;
            x1.m=600;
            x1.n=700;
            //call M1() thorugh c1
            x1.M1();
            //call M2() through c1
            x1.M2();  
            x1.M3();
        }
    }
