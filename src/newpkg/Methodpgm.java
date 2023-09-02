package newpkg;

public class Methodpgm {

	public static void main(String[] args) {
		
		Methodpgm ob=new Methodpgm();
		int s=ob.add();
		System.out.println("sum is "+s);
		
		ob.sub(50, 20);
		
		int m=ob.mul(32, 23);
		System.out.println("product is "+m);
		
		ob.div();
		

	}
	
	public int add()
	{
		int a=20,b=40;
		int c=a+b;
		return c;
	}
	
	public void sub(int c,int d)
	{
		int x=c-d;
		System.out.println("difference is "+x);
	}
	
	public int mul(int x,int y)
	{
		int z=x*y;
		return z;
	}
	
	public void div()
	{
		double d1=50,d2=20;
		double d3=d1/d2;
		System.out.println("quotient is "+d3);
	}

}
