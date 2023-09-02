package javapkg;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		
		int c=0;
		
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				c=c+1;
			}
			
		}
		if(c==2)
		{
			System.out.println(x+" is a prime number");
		}
		else
		{
			System.out.println(x+" is not a prime number");
		}
	}

}
