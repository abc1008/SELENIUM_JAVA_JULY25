package pack1;

public class Class1 {

	public static void multiplication() {
		int w = 10;
		int e = 20;

		int ans2 = w * e;
		System.out.println(ans2);
	}

	public static void testStaticMethod2() {
		System.out.println("testNonStaticMethod2");

//		Static method within same class method

		multiplication();

	}
	
	
	public void m4()
	{
		System.out.println("Non-Static method m4");
		VariableDIscussion v1 = new  VariableDIscussion();
		System.out.println(v1.num2);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public void testNonStaticMethod1() {
		System.out.println("testNonStaticMethod1");

//		Non-Static Method of Same Class
		testNonStaticMethod2();

//		Non-Static Method of another Class

		MethodDiscussion m1 = new MethodDiscussion();
		m1.addition();

	}

	public void testNonStaticMethod2() {
		System.out.println("testNonStaticMethod2");

	}

//  Print hello world in console 
	public static void main(String[] args) {
		Class1 ref;

		ref = new Class1(); // object of Class1

		int a = 10;

		String s1 = "";
		String s2 = new String();

//		 int dd = new int();

		System.out.println("Hello World");

		System.out.println("123");

//		  ************ Method Calls Ouside Class ************

//		 Non-Static method call 

//		 MethodDiscussion ref1 = new MethodDiscussion();
//		 ref1.addition();
//		 

//		 Static Method Call

		MethodDiscussion.multiplication();
		testStaticMethod2();

		Class1 c3 = new Class1();
		c3.testNonStaticMethod1();

		System.out.println(VariableDIscussion.num);

		VariableDIscussion v1 = new VariableDIscussion();
		System.out.println(v1.num2);
		
		Class1 c4  = new Class1();
		c4.m4();
		
		
		
		
		MethodCategories.EvenNumber(60);
		
		
	}

}
