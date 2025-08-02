package polymprphism;

public class Class_A 
{
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public static void m1(int a)
	{
		System.out.println("int m1");
	}
	
	
	int m1(String a)
	{
		System.out.println("Class_A - String m1");
		
		return 1;
	}
	
	protected int car(String a)
	{
		System.out.println("Class_A - String m1");
		
		return 1;
		
	}
	
	private void m1(byte a)
	{
		System.out.println("Class_A - byte m1");
		
	}
	

	
	
	public static void main(String[] args)
	{
		
		Class_A a1 = new Class_A();
		a1.m1("ABC");
		
		
		
	}

}
