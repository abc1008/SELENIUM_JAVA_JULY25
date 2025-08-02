package polymprphism;

public class Class_B extends Class_A
{

	
	public void m1(boolean b)
	{
		System.out.println("m1");
	}
	
	public int m1(String a)
	{
		System.out.println("Class_B - String m1");
		
		return 7;
	}
	
	public int car(String a)
	{
		System.out.println("Class_A - String m1");
		
		return 1;
	}
	

	public static void main(String[] args)
	{

		
		
		
	}

}
