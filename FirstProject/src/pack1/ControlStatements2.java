package pack1;

public class ControlStatements2 {

	public static void main(String[] args) {

//		switch(expression)
//		{
//			
//			case a:
		// code to execute
//			break;

//		    case b:
		// code to execute
//		    break;

//		    case c:
		// code to execute
//		    break;

//			default :
		// code to excute
//		}

//		int dayNum = 5;
		
		String day = "Tuesday";

		switch (day) 
		{
		case "userType":
			System.out.println(1);
			break;

		case "Tuesday":
			System.out.println(2);
			break;

		case "Wednesday":
			System.out.println(3);
			break;

		case "Thursday":
			System.out.println(4);
			break;

		case "Friday":
			System.out.println(5);
			break;

		case "Saturday":
			System.out.println(6);
			break;

		case "Sunday":
			System.out.println(7);
			break;

		default:
			System.out.println("Day is incorrect");
		}
		System.out.println("Out of switch case");

	}

}
