//define a class
	class Pol{
	//define overloaded method
	void M1(){
		
		System.out.println("NO Parameter");
}
	void M1(int a){
		System.out.println("a="+a);
	
}
void M1(int a, int b){
	System.out.println("a="+a);
	System.out.println("b="+b);

}
void M1(int a, int b,int c){
	System.out.println("a & b"+a+" "+b);
	System.out.println("c="+c);
}
double M1(double a){
	return (a*a)+1000;
	
}}
/*define another class to create objects of Pol class*/
	class TestPol{
		//main method
		public static void main(String args[]){
		//declare and create objects of pol class
		Pol ob=new Pol();
		//call each version of M1()
		ob.M1();
		ob.M1(90);
		ob.M1(20,40);
		ob.M1(60,50,69);
		double r;
		r=ob.M1(20.5);
		System.out.println("Double="+r);

		}//end of main()
	} //end of class

