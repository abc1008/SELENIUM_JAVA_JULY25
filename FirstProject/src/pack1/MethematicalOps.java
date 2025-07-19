package pack1;

public class MethematicalOps {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
//		; :  end of statement/line
		
		long a = 10; 
		short b = 20;
		
		long ans = (a + b);    // assignment operator
		
		System.out.println(ans);
		
		int multiply = -50 * 60;
		
		System.out.println(multiply);
		
		double addition = 10.56/20.6;
		
		System.out.println(addition);
		
		
		System.out.println(a * b + 50);
		
		System.out.println();  // ln = new line
		
		
		
		MethodDiscussion d = new MethodDiscussion();
		d.addition();
		
		
//		int a = 10;
//		int b = 20;
//		
//		int ans = a + b;
//		System.out.println(ans);
		
		
		
//		Syntax for Calling Static Method : 
		
//		ClassName.methodName();
		
		MethodDiscussion.multiplication();
		
		
	}
	
	
	

}
