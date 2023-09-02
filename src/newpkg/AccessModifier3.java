package newpkg;

import oops.AccessModifier;

public class AccessModifier3 extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier3 ob2=new AccessModifier3();
		//ob2.a; not accessible
		
		ob2.c=87;
		System.out.println(ob2.c);
		
		
		

	}

}
