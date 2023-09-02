package javapkg;

public class Pattern4 {

	public static void main(String[] args) {
		/* 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a+1;
			}
			System.out.println();
		}
		
		
		/* 2
		 * 4 6
		 * 8 10 12
		 * 14 16 18 20
		 */
		
		int b=2;
		 for(int i=1;i<=4;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(b+" ");
				 b=b+2;
			 }
			 System.out.println();
		 }
		

	}

}
