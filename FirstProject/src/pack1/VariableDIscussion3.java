package pack1;

public class VariableDIscussion3 
{
	int num = 50; // non-static 
	static int num2 = 800;
	
	public static void main(String[] args) 
	{

		VariableDIscussion3 ref = new  VariableDIscussion3();
		System.out.println(ref.num);

		ref.num = 60; // re-initialization
		System.out.println(ref.num);
		
		
		VariableDIscussion3 ref2 = new  VariableDIscussion3();
		System.out.println(ref2.num);
		
		
		VariableDIscussion3 ref3 = new  VariableDIscussion3();
		System.out.println(ref3.num);
		
		
		System.out.println();
		System.out.println("******* STATIC VARIABLE ********");
		System.out.println();
		
		
		System.out.println(ref.num2);
		ref.num2 = 900;
		
		System.out.println(ref.num2);
		
		
		System.out.println(ref2.num2);
		System.out.println(ref3.num2);
		
	}
	

}
