package pack1;

import org.testng.annotations.*;

public class AnnotationsOrder
{
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@Test(priority = 1)
	public void testCase1()
	{
		System.out.println("testCase1");
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
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	
}
