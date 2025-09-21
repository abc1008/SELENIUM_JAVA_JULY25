package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InclusionExclusion
{
	
	@Test
	public void xestCase1()
	{
		System.out.println("testCase1");
		Assert.fail();
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	
	@Test(dependsOnMethods = {"xestCase1", "cestCase4"})
	public void festCase3()
	{
		System.out.println("testCase3");
	}
	
	
	@Test
	public void cestCase4()
	{
		System.out.println("testCase3");
//		Assert.fail();
	}
	
	
}
