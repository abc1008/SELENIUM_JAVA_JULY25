package exception_handling;

public class Class_1
{
	
	static Class_1 ref;   // null  non-primitive primitive
	static Class_1 ref2;  //null 
	int a;     // 0  primitive 
	boolean result;  // false  primitive
	
	
	public static void main(String[] args)
	{
		
		
//		
//		System.out.println(ref);
//		
//		System.out.println(ref2.a);
//		System.out.println(ref2.result);
		
		
		
		try
		{
			int a = 10;
			int b = 0;
			
			System.out.println(a);
			System.out.println(b);
			int c = a/b;
			// locate excel 
			// open the excel
			// read data -- exception
			
		}
		catch (RuntimeException ex) 
		{
			System.out.println("Exception caught");
		}
		finally 
		{
			System.out.println("Finally block");
			// close the file
		}
	
		System.out.println("After try-catch");
	}
	
	

}
