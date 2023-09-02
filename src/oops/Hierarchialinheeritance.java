package oops;

class Animal
{
	public void ani()
	{
		System.out.println("animal cls");
	}
}

class Dog extends Animal
{
	public void dogdt()
	{
		System.out.println("Dog cls");
	}
}

class Elephant extends Animal
{
	public void eledt()
	{
		System.out.println("elephant cls");
	}
}


public class Hierarchialinheeritance {

	public static void main(String[] args) {
		
		Dog ob1=new Dog();
		ob1.ani();
		ob1.dogdt();
		
		Elephant ob2=new Elephant();
		ob2.ani();
		ob2.eledt();
	

	}

}
