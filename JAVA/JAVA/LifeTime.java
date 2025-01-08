
public class LifeTime {
	//main Method
   	public static void main(String[] args)
	{
		//define a variable
		int x;
		//for loop;
		for (x=0; x<3; x++){
			//y initialized each time block is entered
			int y=10;
			System.out.println("Y = "+y);
			y=100;
			System.out.println("Y = "+y);
			
		}//end of for..loop
		System.out.println("X = "+x);
		
}
}