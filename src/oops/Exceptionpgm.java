package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		//arithmetic exception
		int a=20,b=0;
		
		try
		{
			int c=a/b;
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		//array index out of bounds exception
		int [] ar=new int [4];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		try {
			System.out.println(ar[4]);
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println(x.getMessage());
		}
		
		//file not found exception
		
		FileInputStream f=new FileInputStream("D://Book1.xlsx");
		
		
		
		

	}

}
