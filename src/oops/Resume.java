package oops;

import java.util.Scanner;

interface Candidate
{
	public void profile(String cname,String dob,String loc);
	public void education(String ug,String hss);
	public void skills(String skill1,String skill2,String skill3);
	public void projects(String ptitle);
}

class Res implements Candidate
{
	String name;
	String dob;
	String loc;
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void profile(String name,String dob,String loc) {
		System.out.println("Name :"+name);
		System.out.println("DOB :"+dob);
		System.out.println("location :"+loc);
		
	}

	@Override
	public void education(String ug,String hss) {
		System.out.println();
		System.out.println("----Education Details---");
		System.out.println("UG ---"+ug);
		System.out.println("HSS ---"+hss);
	}

	@Override
	public void skills(String skill1,String skill2,String skill3) {
		System.out.println();
		System.out.println("----Skills---");
		System.out.println(skill1);
		System.out.println(skill2);
		System.out.println(skill3);
		
	}

	@Override
	public void projects(String ptitle) {
		System.out.println();
	System.out.println("----Projects---");
	System.out.println("Project Title :"+ptitle);

		
	}
	
}

public class Resume {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String cname=sc.nextLine();
		System.out.println("enter dob");
		String cdob=sc.next();
		System.out.println("enter loc");
		String cloc=sc.next();
		
		System.out.println("enter ug details");
		String cudt=sc.next();
		System.out.println("enter hss details");
		String chssdt=sc.next();
		
		System.out.println("enter first skill");
		String sk1=sc.next();
		System.out.println("enter second skill");
		String sk2=sc.next();		
		System.out.println("enter third skill");
		String sk3=sc.next();
		
		System.out.println("enter project  title");
		String pt=sc.next();
		
		
		
		Res obj=new Res();
		obj.profile(cname, cdob, cloc);
		
		obj.education(cudt, chssdt);
		
		obj.skills(sk1, sk2, sk3);
		
		obj.projects(pt);
		

	}

}
