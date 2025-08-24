package typecasting;

public class Class_2 extends Class_1
{
	
	public void m1()
	{
		System.out.println("m1 Child");
	}
	
	
	
	public static void main(String[] args)
	{

		Class_2 childRef = new Class_2();
		
		Class_1 convRef = (Class_1)childRef; // converting type of childRef into Parent type
		
//		Class_1 convRef = new Class_2();   // Parent Ref + Child Obj
		
		convRef.m1();
		
		
		
		
		
		Class_1 parentRef = new Class_1();
		
		Class_2 convParent = (Class_2)parentRef;   // converting type of parentRef into Child type
		
//		Class_2 convParent = new Class_1();   // Child Ref + Parent Obj   Not possible in java
		 
		convParent.m1();
		
		
	}
	

}
