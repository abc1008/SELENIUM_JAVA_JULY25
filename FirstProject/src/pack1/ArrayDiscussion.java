package pack1;


public class ArrayDiscussion {

	int num = 80;
	
	ArrayDiscussion()
	{
		
	}
	
	public static void main(String[] args) {
		
		int anyNum = 0;
		
		System.out.println(anyNum);
		
		
		int num = 10;
		String name = "ABC";
		boolean result = false;
		
		
		
		String day = "Sunday";
		
		
//		SYNTAX 1 : 
//		DataType [] arrayName = { comma separated values  };
		
		String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
		
//		Array Length = 4
		System.out.println(days.length);
		
		System.out.println(days[2]);
		
		days[2] = "Thursday";
		
		System.out.println(days[2]);
		
		
//		days[100] = "Thursday";
		
		
		int [] nums = {3,6,2,7,5};
		
		
		System.out.println(nums[4]);
		
		System.out.println(nums[3]);
		
		nums[3] = 600;
		
		System.out.println(nums[3]);
		
//		SYNTAX 2 :
		
//		DataType [] arrayName = new DataType[Total num of ele present in array];
		
		int [] arr = new int[6];
		
		arr[0] = 50;
		arr[1] = 60;
		arr[2] = 70;
		arr[3] = 80;
		arr[4] = 90;
		arr[5] = 100;
		
		
		System.out.println("4th ele of array : " + arr[4]);
		
		
		
//		Array Length: Total num of ele present in array
		
		int arrayLength = arr.length;
		System.out.println(arrayLength);
		
		
//		Last index of array = Array Length - 1
//		Start from 0 to (Array Length - 1)
		
		System.out.println();
		System.out.println(" ***  new array ***");
		System.out.println();
		
		int [] num2Arr = new int[5];
		
		
		System.out.println(num2Arr[0]);
		System.out.println(num2Arr[1]);
		System.out.println(num2Arr[2]);
		System.out.println(num2Arr[3]);
		System.out.println(num2Arr[4]);

		
		
		String s1 = "ABC";
		
		System.out.println(s1);
		
		
		// + is concatenation operator
		System.out.println(s1 + " PQR");
		System.out.println(s1 + " " + 5);
		
		
		String s3 = "353h&&&@@#$klmlk009";
		
	    String random = "ghhhh";
		
		
		
		
		
		
		
	}
	
	
	
	
}
