package pack1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenerClass.class)
public class TestClass1 {
	
	@Test
	public void testCase1()
	{
		System.out.println("testCase1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("testCase2");
		Assert.fail();
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("testCase3");
	}

}
