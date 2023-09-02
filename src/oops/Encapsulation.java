package oops;

class Emp
{
	String empname;
	String designation;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
		
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Emp ob=new Emp();
		ob.setEmpname("Monkey");
		System.out.println("Heyyy I'm "+ob.getEmpname());
		
		ob.setEmpname("donkey");
		System.out.println(ob.getEmpname());
		
		ob.setDesignation("Tree climber");
		System.out.println("I'm a "+ob.getDesignation());
		
	}

}
