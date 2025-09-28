package pack1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenerClass.class)
public class TestClass2 {
	
	@Test
	public void testCase4()
	{
		System.out.println("testCase4");
	}
	
	@Test
	public void testCase5()
	{
		System.out.println("testCas5");
		Assert.fail();
	}


}
