package StringClass;

public class StringDemo3
{

	static int a = 10;
	
	public static void main(String[] args)
	{
		String s1 = "Testometer";    
//		1. length
		int stringLength = s1.length();
		System.out.println(stringLength);
		
//		2. concat();
		
		String s2 = s1.concat(" Institute");
		System.out.println(s2);
		
//		3. charAt();
		char c = s1.charAt(5);
		System.out.println(c);
		
//		System.out.println(s1.charAt(0));
		
//		for(int i = 0; i <= s1.length(); i++)
//		{
//			System.out.println(s1.charAt(i));
//		}
		
//		4.equals
		String s3 = "TestomeTer";
		boolean result =  s1.equals(s3);
		System.out.println(result);
		
//		5. equalsIgnoreCase
		boolean result2 =  s1.equalsIgnoreCase(s3);
		System.out.println(result2);
		
//		Testometer
		
//		6. substring();  - Continuous part of string
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 8));
		
//		7. replace
		System.out.println(s1.replace('T', 'z'));
		
//		8. toUpperCase and toLowerCase
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
//		9. trim()
		String s5 = "     Testometer Institute  ";
		System.out.println(s5);
		System.out.println(s5.trim());
		
		
//		10. indexOf : index of 1st occurrence
		System.out.println(s1.indexOf('t'));
		
		
//		11. lastIndexOf :  index of last occurrence
		System.out.println(s1.lastIndexOf('t'));
		
//		12. contains
		System.out.println(s1.contains("meter"));
		
//		13 toCharArray
		char[] ch = s1.toCharArray();
		
		for(char chh: ch)
		{
			System.out.println(chh);
		}
		
//		14. split
		String[] sArray = s1.split("o");
		
		for(String s : sArray)
		{
			System.out.println(s);
		}
		
	}
	
}
