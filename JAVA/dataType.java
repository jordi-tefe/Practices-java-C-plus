import java.util.Scanner;
public class dataType {
    public static void main(String[] args) {
    // Declare  all data type
    byte byteVal;
    short shortVal;
    int intVal;
    long longVal;
    float floatVal;
    //Creat scanner object
    Scanner input=new Scanner(System.in);
    System.out.println("Enter byte value");
    byteVal=input.nextByte();
    System.out.println("Enter short value");
    shortVal=input.nextShort();
    System.out.println("Enter int value");
    intVal=input.nextInt();
    System.out.println("Enter long value");
    longVal=input.nextLong();
    System.out.println("Enter float value");
    floatVal=input.nextFloat();
    //print all the variable
    System.out.println("You have entered byte "+byteVal);
     System.out.println("You have entered short  "+shortVal);
      System.out.println("You have entered int "+intVal);
       System.out.println("You have entered long "+longVal);
        System.out.println("You have entered float "+floatVal);
    }
}