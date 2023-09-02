package oops;

interface Cardetails
{
	public void speedlimit();
	
	public void acceleration();
}

class BMW implements Cardetails
{

	@Override
	public void speedlimit() {
		System.out.println("speed limit of BMW");
		
	}

	@Override
	public void acceleration() {
		System.out.println("acceleation of BMW");
		
	}
	
}


public class Interfacepgm {

	public static void main(String[] args) {
		
		BMW obj=new BMW();
		obj.speedlimit();
		obj.acceleration();

	}

}
