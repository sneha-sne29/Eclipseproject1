package oops;

class A{
	int s;
	public void sum()
	{
		int a=20,b=30;
		s=a+b;
		System.out.println("sum is "+s);
	}
}

class B extends A
{
	public void avg()
	{
		System.out.println("average is "+ (s/2));
	}
}



public class Singlelvlinheritance {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.sum();
		obj.avg();
		

	}

}
