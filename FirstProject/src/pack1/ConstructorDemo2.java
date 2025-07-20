package pack1;

public class ConstructorDemo2 {

	int num;
	boolean result;
	
	ConstructorDemo2(int a, boolean b)
	{
		num = a;
		result = b;
	}
	

	public static void main(String[] args) {
		
		
		ConstructorDemo2 c = new ConstructorDemo2(40,true);

		System.out.println(c.num);
		System.out.println(c.result);
		
		System.out.println();
		
		ConstructorDemo2 c2 = new ConstructorDemo2(50,false);
		System.out.println(c2.num);
		System.out.println(c2.result);
	}
	
	
	
}
