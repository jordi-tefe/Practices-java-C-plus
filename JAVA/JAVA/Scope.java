
public class Scope {
   	public static void main(String[] args)
	{
		int x=10;
		if (x==10){
		System.out.println("X at this Scope = "+x);
		int y=400;
		System.out.println("Y within this block = "+y);
			x=(y*2);
		System.out.println("X = "+x);	
		}
		System.out.println("X within main = "+x);		
		int z=400;
		System.out.println("Z = " +z);
			if (x==400){
				
				System.out.println("X within this blocj = "+x);
				System.out.println("Z = "+z);
				z=(x+z);
				System.out.println("Z = "+z);
				{
					System.out.println("Z within this block"+z);
					System.out.println("X within this block"+x);
				
				}
	System.out.println("Z Still visible ="+z);				
			}
	System.out.println("X still visible "+x);
}
}