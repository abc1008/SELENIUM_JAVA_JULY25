package pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_1
{
	@Test(priority = 1)
	public void xestCase1()
	{
		System.out.println("testCase1");
	}
	
	@Test(priority = -3, invocationCount = -5)
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	
	@Test(priority = 2, enabled = false)
	public void festCase3()
	{
		System.out.println("testCase3");
	}
	
	
	@Test(priority = 2)
	public void cestCase3()
	{
		System.out.println("testCase3");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	
}
