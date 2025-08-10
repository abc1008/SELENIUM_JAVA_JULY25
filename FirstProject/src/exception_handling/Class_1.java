package exception_handling;

public class Class_1
{
	
	public static void main(String[] args)
	{
		int a = 10;
		int b = 0;
		
		System.out.println(a);
		System.out.println(b);
		
		try
		{
			int c = a/b;
		}
		catch (Exception ex) 
		{
			System.out.println("Exception cought : "+ ex.getMessage());
		}
	
		System.out.println("After try-catch");
	}
	
	

}
