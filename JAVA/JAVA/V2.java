
public class V2 {
    
    protected int i;
    V2(int i){
        this.i=i;
        
    
    }
    //define a method class type as a paramateer
    void Increment (V2 base){
    
    base.i++;
        System.out.println("increment i="+base.i);
    
    }
}
//define a sub class
 class B extends V2{
     int i;
     B(int i){
     super(i);
 }
     //define a method class type as parameter
     void Decrement(B sub){
         sub.i--;
         System.out.println("Decrement i="+sub.i);
     
     }
 }
class TestUpcasting {
    public static void main(String[] args) {
        //declare refernce variable of A
        V2 a1;
        //declare refernce variable of B
        B b1,b2;
        //creaye and intialize objects of B
        b1= new B (100);
        b2 = new B(22);
        //assign objets B to referhce varibale A
        a1= b1;//upcasting
        a1=b2; //upcasting
        a1=new V2(10);
    
        //call incre,ent (through a1)
        a1.Increment (b1);
        //call decrement (though b1;
        b1.Decrement(b2);
        //call increment () though b2
        a1.Increment(b2);
        //call decrement () thorugh a1;
        b2.Decrement(b1);
        
        
    
    
    
    
    
    
    }

}