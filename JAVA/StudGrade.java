	//NAFYAD DACHASA
	
	import java.util.Scanner;
	public class StudGrade {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Students mark:");
		int StudMark = Integer.valueOf(input.nextLine());
	if (StudMark>=91 && StudMark <=100)
	{
		System.out.println(" You've Got A");
	}
	else if (StudMark>=80 && StudMark <=90)
	{
		System.out.println(" You've Got B");
	}
	else if (StudMark>=50 && StudMark<80)
	{
		System.out.println(" You've Got C");
	}
	else if (StudMark>=40 && StudMark<50)
	{
		System.out.println(" You've Got D");
	}
	else if (StudMark>=20 && StudMark <40)
	{
		System.out.println(" You've Got F");
	}
	else
	{
		System.out.println("I");
	}
	}	
	}
