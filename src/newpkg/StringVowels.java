package newpkg;

import java.util.Scanner;

public class StringVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		String str=sc.next();
		
		StringVowels ob=new StringVowels();
		
		ob.vowels(str);
		
		

	}
	
	public void vowels(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				c=c+1;
			}
		}
		System.out.println("Vowel count is "+c);
	}

}
