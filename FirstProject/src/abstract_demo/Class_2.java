package abstract_demo;

public class Class_2 extends Class_1
{
	public void m1()
	{
		System.out.println("m1 implementation");
	}

	public void m3()
	{
		System.out.println("m3 implementation");
	}

	public void m4(int a)
	{
		System.out.println("m4 implementation");
	}
	
	public static void main(String[] args)
	{
//		Class_1 c1 = new Class_1();  
		
		Class_2 c2 = new Class_2();
		
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4(5);
		
		System.out.println();
		System.out.println(" ****** parent ref + child obj ******** ");
		System.out.println();
		
		
		Class_1 c1 = new Class_2();   // parent ref + child obj
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4(6);
		
		
		
	}
	

}
