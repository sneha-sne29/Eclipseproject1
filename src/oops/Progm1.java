package oops;

interface BasicAnimal
{
	public void eat();
	
	public void sleep();
}

class Monkey
{
	public void jump()
	{
		System.out.println("monkey jumps");
	}
	public void bite()
	{
		System.out.println("monkey bites");
	}
}

class Human extends Monkey implements BasicAnimal
{
	public void speak()
	{
		System.out.println("humans speak");
	}

	@Override
	public void jump() {
		
		super.jump();
	}

	@Override
	public void bite() {
		
		super.bite();
	}

	@Override
	public void eat() {
		System.out.println("animals eat");
		
	}

	@Override
	public void sleep() {
	System.out.println("animals sleep");
		
	}
	
}




public class Progm1 {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.jump();
		ob.bite();
		ob.eat();
		ob.sleep();
		ob.speak();

	}

}
