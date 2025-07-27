package pack1;

public class LoopsDiscussion 
{
	int n= 0;  
	
	
	public static void main(String[] args) {
		
		
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");

		System.out.println();
		System.out.println("****  While Loop ********");
		System.out.println();
		
		
		
//		SYNTAX:  while loop
		
		
//		while(boolean condition)
//		{
//			// code to repeat
//		}
		
		int counter = 5;
		
		while(counter >= 1)
		{
			System.out.println("ABC : "+ counter);
			counter--;
			
			if(counter == 3)
			{
				System.out.println("Counter is 3");
				break;
			}
			
		}
		
		System.out.println("Out of while loop");
		
//		5 4 3 2 1 
		
		
		System.out.println();
		System.out.println("****  Do - While Loop ********");
		System.out.println();
		
		
//		SYNTAX:
		
//		do
//		{
			// code to repeat
//		}
//		while(boolean condition);
		
		
		int counter2 = 0;
		
		do
		{
			System.out.println("ABC : "+ counter2);
			counter2++;
			
		}
		while(counter2 < 5);
		
		
		System.out.println();
		System.out.println("****  For Loop ********");
		System.out.println();
		
		
//		SYNTAX: 
		
//				1			2,5,8			4,7,10
//		for(intialization; condition; increment/decrement)
//		{
//						3,6,9
				// code to repeat
//		}
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("ABC : "+ i);
		}
		
		
		System.out.println();
		System.out.println("****  Print array using for Loop ********");
		System.out.println();
		
		int [] arr = {4,5,7,9,6,3};
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		
		
		for(int index = 0; index <= 5; index++)
		{
			System.out.println(arr[index]);
		}
		
		System.out.println();
		System.out.println("****  ForEach Loop ********");
		System.out.println();
		
		
//		for(dataType variableName : dataStructure)
//		{
			// code to repeat
//		}
		
//		int [] arr = {4,5,7,9,6,3};
		
		for(int num : arr)
		{
			if((num == 9) || (num == 6))
			{
				continue; // to skip current repetition/condition and jump onto the next one.
			}
			
			System.out.println(num);
		}
		
	
		
	}
	
	
	
	
	

}
