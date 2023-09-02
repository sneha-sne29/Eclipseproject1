package newpkg;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array limit");
		
		int n=sc.nextInt();
		
		int c1=0;
		int c2=0;
		
		
		int [] arr=new int[n];
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				c1++;
			}
			else
			{
				c2++;
			}
		}
		
		System.out.println("even count= "+c1);
		System.out.println("odd count= "+c2);
		

	}

}
