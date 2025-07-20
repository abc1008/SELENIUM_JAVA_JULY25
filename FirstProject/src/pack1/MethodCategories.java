package pack1;

public class MethodCategories {

	public void addition(byte num1, long num2) {
		long ans = num1 + num2;

		System.out.println(ans);
	}

//	void = nothing
	public static void printUserName(String firstName) {
		System.out.println(firstName + " UserName");
	}

	public static void printZerothindexArray(int[] arr) {
		System.out.println(arr[0]);
	}

//	SYNTAX

//	public DataType methodName()
//	{
//		
//		return valueOftype = DataType
//	}

	public int multiplication(int a, int b) {
		int ans = a * b;

		return ans;
	}

	public int subtract(int num, int a, int b) {
//		 int mul = a  * b;

		int mul = multiplication(a, b);

		int sub = mul - num;

		return sub;
	}

	public static boolean EvenNumber(int num) 
	{
		boolean result;
		
		int rem = num % 2;

		if (rem == 0) 
		{
			System.out.println(num + " is even.");
			result = true;
		} 
		else 
		{
			System.out.println(num + " is odd.");
			result = false;
		}

		return result;
	}
	
	public static String EvenNumber2(int num) 
	{
		String result;
		
		int rem = num % 2;

		if (rem == 0) 
		{
			result = num + " is even.";
		} 
		else 
		{
			result = num + " is odd.";
		}

		return result;
	}

	public static void main(String[] args) {
		MethodCategories m = new MethodCategories();

		byte num = 120;
		m.addition(num, 207l);
		printUserName(null);
		int[] array1 = { 3, 4, 5, 7 };
		printZerothindexArray(array1);

		int finalAns = m.multiplication(4, 6);
		System.out.println("finalAns : " + finalAns);

		m.multiplication(8, 7);
		
		
		boolean isEven = EvenNumber(52);
		System.out.println(isEven);
		
		EvenNumber2(60);

	}

}
