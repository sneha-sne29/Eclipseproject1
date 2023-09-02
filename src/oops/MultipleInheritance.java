package oops;

interface A1
{
	public void display();
	
}

interface A2
{
	public void display2();
}


class B1 implements A1,A2
{

	@Override
	public void display2() {
		System.out.println("this is cls A2 ");
		
	}

	@Override
	public void display() {
		System.out.println("this is cls A1");
		
	}
	
}


public class MultipleInheritance {

	public static void main(String[] args) {
		B1 ob=new B1();
		ob.display();
		ob.display2();

	}

}
