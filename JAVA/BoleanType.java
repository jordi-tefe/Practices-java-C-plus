class BoleanType{
	public static void main(String args[]){
		boolean b;
		b=false;
		System.out.println("b is :"+b);
		b=true;
		System.out.println("b="+b);
		if (b){
			System.out.println("This is executed");
			
			
		}
		b=false;
		if (b){
			System.out.println("This part is not executed");
			
		}
		System.out.println("10>9="+(10>9));
		System.out.println("5>9="+(5>9));
		
	}
	
	
}