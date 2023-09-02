package oops;

class NewCls
{
	private int b;
	
	int x;//default
}

public class AccessModifier {
	
	private int a;
	
	protected int c;

	public static void main(String[] args) {
		
		AccessModifier ob=new AccessModifier();
		ob.a=20;//can access within this cls
		
		NewCls ob1=new NewCls();
		//ob1.b;//not accessible
		
		ob1.x=54;//can be accessed
		
		ob.c=87;
		

	}

}
