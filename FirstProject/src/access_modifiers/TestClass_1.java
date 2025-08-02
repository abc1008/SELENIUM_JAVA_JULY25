package access_modifiers;

public class TestClass_1 {

	
	static int num = 10;
	
	public static int num2 = 12;
	
	protected static int num3 = 30;
	
	protected  int num4 = 30;
	
	
	public void m1()
	{
		System.out.println("m1 in TestClass_1");
	}
	
	
	public static void m2()
	{
		System.out.println("m2 in TestClass_1");
	}
	
	
	protected void m3()
	{
		System.out.println("m3 in TestClass_1");
	}
	
	
	public static void main(String[] args) {
		
		
		TestClass_1 t1 = new TestClass_1();
		t1.m1();
		
		
		m2();
		
		System.out.println(num2);
		
		
	}
	
	
	
}
