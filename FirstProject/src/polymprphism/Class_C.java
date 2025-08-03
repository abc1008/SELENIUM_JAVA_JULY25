package polymprphism;

public class Class_C
{
	static final protected int num = 20;
	protected final int num2 = 90;
	
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public void m1(int a)
	{
		System.out.println("m1");
	}
	
	
	public static void main(String[] args)
	{
		
		
		Class_C c1 = new Class_C();
//		c1.num2 = 400;
		
		System.out.println(num);
		
		
		
	}
	
	
}
