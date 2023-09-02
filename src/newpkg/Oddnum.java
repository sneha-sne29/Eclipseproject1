package newpkg;

public class Oddnum {

	public static void main(String[] args) {
		
		Oddnum ob=new Oddnum();
		ob.odd();
		

	}
	
	public void odd()
	{
		for(int i=1;i<=99;i=i+2)
		{
			System.out.println(i);
		}
		
	}

}
