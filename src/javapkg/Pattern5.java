package javapkg;

public class Pattern5 {

	public static void main(String[] args) {
		/* A
		 * B C
		 * D E F
		 * G H I J
		 */
		
		int a=65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(a)+" ");
				a=a+1;
			}
			System.out.println();
		}

	}

}
