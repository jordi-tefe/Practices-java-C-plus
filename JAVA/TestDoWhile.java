import java.util.Scanner;
class TestDoWhile {

 public static void main(String[] args) {
int num;
 int sum = 0;
Scanner input = new Scanner(System.in);
do {
System.out.println("Enter an integer : ");
num = input.nextInt();
sum=(sum+num);
} 
while (num != 0);
System.out.println("Sum=" + sum);
}
 } 
