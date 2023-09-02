package oops;

class Fruits
{
	public void fruitdt()
	{
		System.out.println("Class of fruits");
	}
}

class Tomato extends Fruits
{
	public void tomdt()
	{
		System.out.println("Class of tomatoes");
	}
}

class Mango extends Tomato
{
	public void mangodt()
	{
		System.out.println("class of mangoes");
	}
}



public class Multilvlinheritance {

	public static void main(String[] args) {
		Mango mg=new Mango();
		mg.fruitdt();
		mg.tomdt();
		mg.mangodt();
		
		

	}

}
