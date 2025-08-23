package exception_handling;

public class Class_4
{
	
	public static void main(String[] args)
	{
		
		int a = 10;
		
		if(a > 7)
		{
			throw new NullPointerException("a is greater than 7");
		}
		else
		{
			System.out.println(a);
		}
		
		
	}

}
