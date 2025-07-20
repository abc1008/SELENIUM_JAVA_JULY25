package pack1;

public class ConstructorDemo 
{
	
	int a = 80;
	boolean b = true;
	

	ConstructorDemo()
	{
		System.out.println("0 arg ConstructorDemo");
	}
	
	ConstructorDemo(byte b)
	{
		this(7, false);  // another constructor call
		System.out.println("byte - arg ConstructorDemo");
	}
	
	ConstructorDemo(int b)
	{
		this();
		System.out.println("int - arg ConstructorDemo");
	}
	
	ConstructorDemo(int a, boolean b)
	{
		// constructor body
		
		a = 100;
		b = true;
		
		System.out.println("int,boolean - ConstructorDemo is running");
	}
	

	ConstructorDemo(boolean b, int a)
	{
		// constructor body
		
		a = 100;
		b = true;
		
		System.out.println("boolean,int - ConstructorDemo is running");
	}

	
	
	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(5);
		ConstructorDemo cd3 = new ConstructorDemo(5, false);
		ConstructorDemo cd4 = new ConstructorDemo(false,5);
		
		
		System.out.println();
		System.out.println("*** constructor inside constructor***");
		System.out.println();
		
		byte num = 3;
		ConstructorDemo cd5 = new ConstructorDemo(num);
		
		
		
		System.out.println(cd.a);
		
		
	}
	
	
	

}
