package pack1;

public class VariableDIscussion 
{
	
	
//	static DataType variableName = value;
	
//	int num5 = 80;
	static int num = 10;
	static boolean result = false;  // variable initialization
	
	
//	Non-Static Variable:   DataType variableName = value;
	
	int num2 = 50;
	double num4;  // default value
	
	
	public void m1()
	{
		System.out.println(num);
		
		
//		non-static property inside non-static method
		System.out.println(num2);
	}
	
	public static void m2()
	{
		System.out.println("Static Method m2");
		System.out.println(num);
		
		int num5 = 80;
//		non-static property inside static method
		
		VariableDIscussion v1 = new VariableDIscussion();
		System.out.println(v1.num2);
	}
	
	
	public void m6()
	{
		int num = 90;   // local variable
		
//		System.out.println(num5);
		
		int ans = num + 10;
	}
	
	
	public static void main(String[] args) 
	{
//		System.out.println(num5);
		System.out.println(num);
		
		result = true;   // variable declaration
		
		System.out.println(result);
		
		VariableDIscussion v1 = new VariableDIscussion();
		System.out.println(v1.num2);
		
		int newVar = v1.num2;
		
		System.out.println(newVar);
		
		System.out.println(v1.num4);
		
		System.out.println();
		
		v1.m1();
		
		m2();
		
		System.out.println();
		
		v1.m6();
		
		
	}
	

}
