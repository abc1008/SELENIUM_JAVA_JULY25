package abstract_demo;

public abstract class Class_1
{
	int num1 = 10;
	static int num2 = 20;
	
	Class_1(int a)
	{
		System.out.println("Abstract class contructor");
	}
	
	
//	vague, unclear 
	public abstract void m1();  // abstract method
	
	public void m2()   // concrete/complete method
	{
		System.out.println("m2");
		
		int a = 10;
	}
	
	public abstract void m3();  // abstract method
	
	public abstract void m4(int a);  // abstract method
	
	public static void m5()
	{
		System.out.println("m5 static");
	}
	
	public void m7()
	{

	}
	
	public static void main(String[] args)
	{
		m5();
		
		System.out.println(num2);
		
		
//		Class_1 c1 = new Class_1();
		
	}
	

}
