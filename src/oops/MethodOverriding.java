package oops;

class Parent
{
	public void phone()
	{
		System.out.println("Parent phone is samsung");
	}
	public void job()
	{
		System.out.println("Parent job is doctor");
	}
}

class Child extends Parent
{

	@Override
	public void phone() {
		
		System.out.println("Child phone is iphone");
		super.phone();//gets the value of methods in immediate parent cls
	}

	@Override
	public void job() {
		
		System.out.println("Child job is Software Engineer");
		super.job();
		
		
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		Child ob=new Child();
		ob.phone();
		ob.job();
		
	

	}

}
