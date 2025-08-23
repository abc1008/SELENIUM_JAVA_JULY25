package typecasting;

public class Class_A
{
	
	
	public static void main(String[] args)
	{
//		Implicit Typecasting: 
		
		byte b = 10;     // -- int    // -128 to +127
		
		

		
		int convData = (int)b;
		
		System.out.println(convData);
		
		
		// Explicit Typecasting: 
		
//		-128,-127,-126 .... 0, 1,2,3 .. 127,      128,129,130
		
		
		int num = 130;    // -- byte
		
		byte convData2 = (byte)num;   
		
		System.out.println(convData2);
		
		
		
		
		
	}

}
