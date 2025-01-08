//define a class
class Cosc{
//define instance variable	
	byte a,b;
	short x,y;
	int width,height;
	float wid,len;
	
	double num1, num2;
//main method
	public static void main(String args []){
//declare and create objects		
		Cosc ob= new Cosc();
//assign a vlaue to byte's variable		
		ob.a=(byte) 400;
		ob.b=(byte) 600;
		byte s;
		s= (byte) (ob.a+ob.b);
		System.out.println("s="+s);

		///////////
		ob.x=700;
		ob.y=800;
		short z;
		z= (byte) (ob.x+ob.y);
		System.out.println("z="+z);
		///////////
		ob.num1=200;
		ob.num2=400;
		int  t;
		t=(int) (double) (ob.num1*ob.num2);
		System.out.println("T="+t);
		ob.len=300;
		ob.wid=100;
		int f;
		f=(int) (ob.len*ob.wid);
		System.out.println("F="+f);
		
		
		
	}
}