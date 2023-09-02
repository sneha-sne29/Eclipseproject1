package oops;

class Member
{
	String empna;
	int empage;
	int empphone;
	String empaddr;
	int empsal;
	
	public void printdetails()
	{
		/*empna="Manu";
		empage=23;
		empphone=987654267;
		empaddr="Pkd";
		empsal=24000;*/
		
		/*managerna="Arun";
		managerage=28;
		managerph=98765435;
		manageraddr="kochi";
		managersal=35000;*/
		
		System.out.println(" name="+empna);
		System.out.println(" age="+empage);
		System.out.println(" phone="+empphone);
		System.out.println(" addr="+empaddr);
		System.out.println(" sal="+empsal);
		
		
		
	
		
	}
}

class Employee extends Member
{
	String Specialization;
	
	/*public void specialisationdt()
	{
		Specialization ="Tester";
		
		System.out.println("Employee details : "+empna+" "+empage+" "+empphone+" "+empaddr+" "+empsal);
		
		System.out.println("Specialisation : "+Specialization);
	}*/
}

class Manager extends Member
{
	String Department;
	
	/*public void dptdt()
	{
		Department ="Manager";
		
		System.out.println("Manager details : "+managerna+" "+managerage+" "+managerph+" "+manageraddr+" "+managersal);
		
		System.out.println("Department : "+Department);
	}*/
}


public class Inheritancepgm {

	public static void main(String[] args) {
		
		Employee ob1=new Employee();
		ob1.empna="abc";
		ob1.empage=24;
		ob1.empaddr="pkd";
		ob1.empphone=98766788;
		ob1.empsal=23000;
		ob1.Specialization="tester";
		
		//ob1.specialisationdt();
		
		/*Manager ob2=new Manager();
		ob2.empna="aaa";
		ob2.empage=35;
		ob2.empaddr="kochi";
		ob2.empsal=45000;
		ob2.empphone=765578899;
		ob2.Department="manager";*/
		//ob2.dptdt();
		

	}

}
