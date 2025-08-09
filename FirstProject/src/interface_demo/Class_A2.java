package interface_demo;

public class Class_A2 extends Class_A
{

	@Override
	public void m3()
	{
		System.out.println("m3 implementation");
	}

	
	public static void main(String[] args)
	{
		
		System.out.println();
		System.out.println("*** parent ref + child obj ***");
		System.out.println();
		
		Class_A2 a2 = new Class_A2();
		a2.m1();
		a2.m2();
		a2.m3();
		
		
		System.out.println();
		System.out.println("*** parent ref + child obj ***");
		System.out.println();
		
		Class_A a3 = new Class_A2();
		a3.m1();
		a3.m2();
		a3.m3();
		
		
		System.out.println();
		System.out.println("*** interfece ref + child obj ***");
		System.out.println();
		
//		Interface ref can hold object of its implementation class
		Interface_1 a4 = new Class_A2();
		a4.m1();
		a4.m2();
		a4.m3();
		
		
		
	}
}
