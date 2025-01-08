

//Super class
public class AA {
//Define instance variable of a super class
int a, b, c;
//Define instance method of a super class
void M1(){
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
}//End of M1()
}//End of super class
//Define a subclass
class B extends AA{
 //Define instance variable of subclass
    int k;
    //Define instance method of  asubclass
    void M2(){
   System.out.println("k="+k);
    }//End of M2()
}//End of subclass
//Define another class to create objects of super and sub class
class Inheritance{
 //Main method ()
    public static void main(String[] args) {
  //Declare and create objects of a superclas
  AA sper=new AA();
  //Declare and create objects of a subclass
  B sub =new B();
  //Assign a value to each instance variable of a class
  sper.a=100;
  sper.b=200;
  sper.c=300;
 //Call M1() through objects of a super class
 sper.M1();
 //Assign a value to each instance variable of super and sub class
 sub.a=600;
 sub.b=800;
 sub.c=700;
 sub.k=1000;
 //Call M1() and M2()
 sub.M1();
 sub.M2();
    }
}

