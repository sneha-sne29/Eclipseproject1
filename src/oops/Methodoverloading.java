package oops;

public class Methodoverloading {
	
	public void sum()
	{
		int a=12,b=23;
		int c=a+b;
		System.out.println("value of c is "+c);
	}
	
	public void sum(int x,int y)
	{
		int z=x+y;
		System.out.println("value of z is "+z);
	}
	
	public void sum(int n,double m)
	{
		double p=n+m;
		System.out.println("value of p is "+p);
	}
	
	public void sum(double r,int s)
	{
		double t=r+s;
		System.out.println("value of t is "+t);
	}

	public static void main(String[] args) {
		
		Methodoverloading ob=new Methodoverloading();
		
		ob.sum();
		ob.sum(3.5, 6);
		ob.sum(56, 5.2);
		ob.sum(34, 20);
		

	}

}
