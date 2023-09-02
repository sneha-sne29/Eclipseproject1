package newpkg;

public class Employee {
	
	String empname;
	String empdesignation;
	int empid;
	
	public Employee(String empname,String empdesignation,int empid)//parameterized constructor
	{
		this.empname=empname;
		this.empdesignation=empdesignation;
		this.empid=empid;
	}
	
	
	
	public void display()
	{
		System.out.println("Name= "+empname);
		System.out.println("Designation= "+empdesignation);
		System.out.println("ID= "+empid);
	}

	public static void main(String[] args) {
		
		Employee ob1=new Employee("Anu","Developer",101);
		Employee ob2=new Employee("Ammu","Tester",102);		
		
		ob1.display();
		ob2.display();
		
		
		

	}

}
