package newpkg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		int c=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			}
		}
		
		if(c==2)
		{
			System.out.println("Number enterd is Prime");
		}
		else
		{
			System.out.println("Number enterd is not prime");
		}

	}

}
