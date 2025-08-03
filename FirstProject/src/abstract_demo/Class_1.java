package abstract_demo;

public abstract class Class_1
{
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
	
	public static void main(String[] args)
	{
		m5();
	}
	

}
