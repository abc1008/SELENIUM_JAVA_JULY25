package polymprphism;

public class Class_B extends Class_A
{
	
	public void m1(boolean b)
	{
		System.out.println("m1 - Class_B");
	}
	
	public static int m1(String a)
	{
		System.out.println("Class_B - String m1");
		
		return 7;
	}
	
	public void m6()
	{
		System.out.println("m6 - Class_B");
	}

	public static void main(String[] args)
	{
//		int a = 10;
		Class_B cb = new Class_B();  // child ref + child object
		cb.m1(true); 
		cb.m6();
		cb.m1();
		cb.m1(5);
		cb.m1("ABC");    // overidden method hence, object will decide.
		
		System.out.println();
		
		Class_A ca = new Class_A(); 	//  parent ref + parent object
		ca.m1();
		ca.m1(5);
		ca.m1("ABC");
		
		System.out.println();
		
		Class_A ca2 = new Class_B();  //  parent ref + child object
		ca2.m1("ABC"); // overidden method hence, object will decide.
		ca2.m1();     // overloaded 
		ca2.m1(5); 	 // overloaded 
		
		
//		Class_B cb2 = new Class_A();				   // child ref + parent object - NOT POSSIBLE
		
		
		
		
		
	}

}
