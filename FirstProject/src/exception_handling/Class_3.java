package exception_handling;


public class Class_3
{

	public static void m1(int num)
	{
		
		System.out.println("num : "+num);
		
		if(num > 0)
		{
			num = num + 1;   //3,4,5,6,7
			m1(num);
		}
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		m1(2);
		
		System.out.println("After m1 call");
		
	}
	
	
	
}
