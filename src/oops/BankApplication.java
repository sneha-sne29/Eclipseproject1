package oops;

import java.util.Scanner;

interface BankDetails
{
	public void accountdt(String na,int ac,int bal);
	public void withdraw(int w,int b);
	public void balance(int b1,int b2);
	public void deposit(int d,int d1,int z);
}

class Sbi implements BankDetails
{
	
	@Override
	public void accountdt(String Name,int AccNo,int Bal) {
		
		System.out.println("Name : "+Name);
		System.out.println("Account No : "+AccNo);
		System.out.println("Available Balance : "+Bal);
		
	}

	@Override
	public void withdraw(int w,int b) {
		
		if(w<b)
		{
			System.out.println("Amount to be withdrawed : "+w);
		}
		else
		{
			System.out.println("No sufficient balance");
		}
				
	
		
		
	}

	@Override
	public void balance(int b1,int b2) {
		

		int b3=b1-b2;
		
		if(b2<b1)
		{
			System.out.println("Balance after withdrawing :"+b3);
		}
	
		
	}

	@Override
	public void deposit(int d,int d1,int z) {
		
		System.out.println("Enter amount to be depostited :"+d);
		if(z<d1)
		{
			int d2=d+(d1-z);
			System.out.println("Balance after deposit :"+d2);
		}
		else
		{
			System.out.println("Balance after deposting :"+(d1+d));
		}
		
	
		
	}
	
}


public class BankApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int b1=12000;
		
		System.out.println("Enter Name");
		String s=sc.next();
		
		System.out.println("Enter Account Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter amount to be withdrawed ");
		int z= sc.nextInt();
		
		
		System.out.println("Enter amount to be deposited ");
		
		int d=sc.nextInt();

		
		Sbi ob=new Sbi();
		ob.accountdt(s, a, b1);
		
		ob.withdraw(z,b1);
		
		ob.balance(b1,z);
		
		ob.deposit(d,b1,z);
				
	}

}
