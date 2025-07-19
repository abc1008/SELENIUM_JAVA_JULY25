package pack1;

public class VariableDIscussion2 
{
	int num2 = 50;
	int num = 80;
	String name = "ABC";
	
	
	public void m1()
	{
		int num2 = 60;
		System.out.println(num2); // local 
		
		
		System.out.println(this.num2);  // non-static 
		
		System.out.println(num);  // non-static 
		System.out.println(name);  // non-static 
	}

	
	public static void main(String[] args) 
	{

		VariableDIscussion2 ref = new  VariableDIscussion2();
		
		ref.m1();
		
	}
	

}
