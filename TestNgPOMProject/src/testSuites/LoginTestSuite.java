package testSuites;

import java.io.IOException;
import org.testng.annotations.Test;

import basePack.BaseClass;
import testScriptClasses.LoginTestScipt;

public class LoginTestSuite extends BaseClass{
	
	@Test
	public void tc_123_LoginTest() throws InterruptedException, IOException
	{
		LoginTestScipt loginTestScipt = new LoginTestScipt();
		loginTestScipt.performLogin();
	}
	


}
