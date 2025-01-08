
public class N {
    int i;
    
    
}
class B extends N{

int i; //i hides i in A

B(int a, int b){
    super.i =a; //this i is i in A
i=b;
}
void M1(){
    System.out.println(" i in super class A="+super.i);
    System.out.println("i in subclass B"+i);
    
}}
class Test{
    public static void main(String[] args) {
        B b1=new B(20,400);
        b1.M1();
        
    }
}




