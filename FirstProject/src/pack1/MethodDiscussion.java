package pack1;

public class MethodDiscussion 
{
	
//	SYNTAX: Non-Static method
	
//	public void methodName()
//	{
		 // body of method
//	}
	
	int a  = 100;
	
	public void testMethod()
	{
		System.out.println("testMethod is running.");
		
	}
	
	public void addition()
	{
		int a = 10;
		int b = 20;
		
		int ans = a + b;
		System.out.println(ans);
	}
	
	public void subtraction()
	{
//		Static method from same class
		multiplication();
		
		
//		Static method from another class
		Class1.multiplication();
		
		
		
		
		int w = 10;
		int e = 20;
		
		int ans2 = w - e;
		System.out.println(ans2);
	}
	
	
//	SYNTAX: Static method
	
//	public static void methodName()
//	{
		 // body of method
//	}
	
	public static void multiplication()
	{
		int w = 10;
		int e = 20;
		
		int ans2 = w * e;
		System.out.println(ans2);
	}
	
	
	public static void testStaticMethod()
	{
		System.out.println("testStaticMethod");
		
//		Calling non-static method from same class
		
		MethodDiscussion m1 = new MethodDiscussion();
		m1.addition();
		
		
//		Calling non-static method from another class
		Class1 c1  = new Class1();
//		c1.testNonStaticMethod();
		
	}
	
	
	public static void main(String[] args) {
		
		
		
//		Syntax for Calling Non-Static Method : 
		
//		ObjectReference.methodName();
		
		
		MethodDiscussion ref = new MethodDiscussion();
		ref.testMethod();   // method call
		
		System.out.println("After method call");
		
		
		ref.addition();
		
		ref.subtraction();
		
		
		
//		Syntax for Calling Static Method : 
		
//		ClassName.methodName();
		
		System.out.println();
		System.out.println("***** Method Calling ******");
		System.out.println();
		
		
		multiplication();
		
		
		ref.subtraction();
		
		
		testStaticMethod();
	
		
		
		
	}
	
	
	

}
