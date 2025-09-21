package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions
{
	
	@Test
	public void testCase1()
	{
		boolean actualAesult = true;
		System.out.println("testCase1");
		
		
		String expectedText = "test";
		
		String textFromUI = "test";
		
		if(expectedText.equals(textFromUI))
		{
			actualAesult = true;
		}
		else
		{
			actualAesult = false;
		}
		
//		Assert.assertEquals(textFromUI, expectedText);
//		Assert.assertNotEquals(textFromUI, expectedText);
//		Assert.assertTrue(actualAesult);
		
		Assert.assertFalse(actualAesult);
	}
	


}
