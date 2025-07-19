package pack1;

public class ControlStatements {

	public void isEven() {
		
		int num = 566;

		int rem = num % 2;

		boolean isZero = (rem == 0);

		if (isZero == true) {
			System.out.println("num is even");
		}

	}

	public static void main(String[] args) {

//		SYNTAX: 

//		if(boolean codition)
//		{
		// code to execute when condition is true
//		}
//		else
//		{
		// code to execute when condition is false
//		}

//		System.out.println("num is odd");

//		SYNTAX: 

//		if(boolean codition)
//		{
		// code to execute when condition is true
//		}
//		else if(boolean codition2)
//		{
		// code to execute when condition2 is true
//		}
//		else if(boolean codition3)
//		{
		// code to execute when codition3 is true
//		}
//		else
//		{
		// code to execute when all above conditions are false
//		}
		
		
		ControlStatements c= new  ControlStatements();
		c.isEven();

	}

}
