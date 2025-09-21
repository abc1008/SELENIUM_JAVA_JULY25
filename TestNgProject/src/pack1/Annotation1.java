package pack1;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Annotation1
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
	public void xestCase1()
	{
		System.out.println("testCase1");
	}
	
	@Test(priority = -3)
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
