package testSuites;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;
import testScriptClasses.HeaderTestScript;

public class HeaderTestSuite  extends BaseClass{
	
//	@Test
//	public void tc_123_LogoutTest() throws InterruptedException, IOException
//	{
//		HeaderTestScript headerTestScript = new HeaderTestScript();
//		headerTestScript.performLogout();
//	}
	
	
	@Test
	public void tc_123_ChangePasswordTest() throws InterruptedException, IOException
	{
		Assert.assertTrue(new HeaderTestScript().performChangePassword());
	}
	

}
