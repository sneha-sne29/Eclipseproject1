package newpkg;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		Area ob=new Area();
		ob.rect();
		
		ob.tri(20, 13);
		
		System.out.println("Enter a number");
		int x=sc.nextInt();
		
		System.out.println("Area of circle is "+ob.cir(x));
		
		System.out.println("Area of square is "+ob.squ(x));
		
		
		
		
	}
	
	public void rect()
	{
		int l=20,b=5;
		int a=l*b;
		System.out.println("Area of rectangle is "+a);
	}
	
	public void tri(int b,int h)
	{
		double a1=0.5*b*h;
		System.out.println("Area of triangle is "+a1);
	}
	
	public double cir(int r)
	{
		double y=3.14*r*r;
		return y;
	}
	
	public int squ(int a)
	{
		int sq=a*a;
		return sq;
	}

}
