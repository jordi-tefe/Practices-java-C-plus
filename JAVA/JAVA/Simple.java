public class Simple {
    int m, n;
 
    void dispA(){
    System.out.println("m="+m);
     System.out.println("n="+n);
  }
}
class Sam extends Simple{
    int a,b, k;
  void dispB(){
    System.out.println("k="+k);
     System.out.println("a="+a); 
      System.out.println("b="+b);
    }//End of dispB()
void Sum(){
System.out.println("m+n+k="+(m+n+k));  
System.out.println("a+b+k="+(a+b+k));
}
}
class TestSimple{
public static void main(String[] args) {

Sam b1=new Sam();

b1.m=20;
b1.n=30;
b1.a=40;
b1.b=50;
b1.k=60;
//CalldispA(), dispB() and Sum() method by a subclass
b1.dispA();
b1.dispB();
b1.Sum();

}
}
