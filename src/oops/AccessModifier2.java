package oops;

public class AccessModifier2 {

	public static void main(String[] args) {
		AccessModifier2 ob=new AccessModifier2();
		//ob.a;  not accessible in different cls in one pkg
		//ob.b;
		
		AccessModifier ob2=new AccessModifier();
		ob2.c=89;
		System.out.println(ob2.c);
		
		
		NewCls obj=new NewCls();
		obj.x=87;

	}

}
