package polymprphism;

public class Class_A 
{
	
	public void m1()
	{
		System.out.println("m1 - Class_A");
	}
	
	public void m1(int a)
	{
		System.out.println("int m1 - Class_A");
	}
	
	
	public static int m1(String a)
	{
		System.out.println("Class_A - String m1");
		
		return 1;
	}

	
	
	public static void main(String[] args)
	{
		
		Class_A a1 = new Class_A();
		a1.m1("ABC");
		
		
		
	}

}
