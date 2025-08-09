package abstract_demo;

public class Class_3 extends Class_2
{

	public void m4(int a)
	{
			System.out.println("m4");
	}
	
	public static void main(String[] args)
	{
//		Class_1 c1 = new Class_1();  
		
		System.out.println();
		System.out.println(" ****** child ref + child obj ******** ");
		System.out.println();
		
		Class_2 c2 = new Class_3();
		
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4(5);
		
		System.out.println();
		System.out.println(" ****** parent ref + child obj ******** ");
		System.out.println();

		
		
		Class_1 c1 = new Class_3();   // parent ref + child obj
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4(6);

		System.out.println();
		System.out.println(" ****** variables ******** ");
		System.out.println();
		
		System.out.println(num2);
		System.out.println(c2.num1);
		
		
	}
	
	
	
}
