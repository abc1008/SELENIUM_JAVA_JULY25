package interface_demo;

public interface Interface_1
{
	
	int num1 = 100;
	boolean result = false;   // public static final
	
	
	// 100 % abstract methods
	
	void m1();   // by default public, abstract
	
	public void m2();
	
	public void m3();
	
	public static void m4()
	{
		System.out.println("m4");
	}
	
	public static void main(String[] args)
	{
		m4();
		
		
		System.out.println(num1);
		System.out.println(result);
		
		// Object : instance of class
	}

}
