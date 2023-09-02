package newpkg;

public class Insertword {
	
	String s="Java 3.0";
	String s2;
	
	

	public static void main(String[] args) {
		
		Insertword ob=new Insertword();
		ob.insert();
		

	}
	
	public void insert()
	{	
		s2=s.substring(0, 4)+" Tutorial "+s.substring(5, 8);
		System.out.println(s2);

	}

}
