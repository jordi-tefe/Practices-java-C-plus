public class Thiskeyword {
    int m;
    int n;
     Thiskeyword(int m, int n){
        this.m = m;
        this.n=n;
    }
    public int squareOne(){
    return m*m;
}

    public int Square() {
        return n * n;
    }
    }
    class ThisKeyWordTest {
       public static void main(String[] args) {
       Thiskeyword td1 = new Thiskeyword (10,6);
        int a =td1.squareOne();
        int b= td1.Square();
        System.out.println(a + "\t"+ b);
           }
}

