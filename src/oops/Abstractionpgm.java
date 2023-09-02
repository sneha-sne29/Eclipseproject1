
package oops;

abstract class Animals
{
	abstract public void dog();
	
	public void elephant()
	{
		System.out.println("i'm elephant & my clr is black");
	}
}

class Animal1 extends Animals
{

	@Override
	public void dog() {
		
		System.out.println("i'm labrador and i'm white in clr");
		// TODO Auto-generated method stub
		
	}
	
	public void lion()
	{
		System.out.println("i'm lion and i'm brown clr");
		
	}
	
}

class Animal2 extends Animals
{

	@Override
	public void dog() {
		
		System.out.println("i'm rottwheeler and i'm brown in clr");
		// TODO Auto-generated method stub
		
	}
	
	public void panda()
	{
		System.out.println("i'm  panda and i'm white and black in clr");
	}
	
}



public class Abstractionpgm {

	
	public static void main(String[] args) {
		
		Animal1 ob=new Animal1();
		ob.dog();
		ob.elephant();
		ob.lion();
		
		Animal2 ob1=new Animal2();
		ob1.dog();
		ob1.elephant();
		ob1.panda();

	}

}
