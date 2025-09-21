package pack1;

import org.testng.annotations.Test;

public class InclusionExclusion2
{
	
	@Test
	public void xestCase5()
	{
		System.out.println("xestCase5");
	}
	
	@Test
	public void testCase6()
	{
		System.out.println("testCase6");
	}
	
	@Test(dependsOnMethods = "pack1.InclusionExclusion.xestCase1")
	public void festCase7()
	{
		System.out.println("festCase7");
	}
	
	
	@Test
	public void cestCase8()
	{
		System.out.println("cestCase8");
	}
	
	
}
