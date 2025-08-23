package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_2
{
	public static void m1() throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Excel Fil.xlsx");
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		
		m1();
		
	
		
		
		
		System.out.println("After reading file");
		
	}
	
	
	
}
