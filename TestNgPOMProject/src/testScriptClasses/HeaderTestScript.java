package testScriptClasses;

import java.io.IOException;

import pageClasses.HeaderPage;
import testSuites.HeaderTestSuite;

public class HeaderTestScript extends HeaderTestSuite {
	
	public void performLogout() throws InterruptedException, IOException
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.logout();
		
	}
	
	public boolean performChangePassword() throws InterruptedException, IOException
	{
		
		boolean testResult = false;
		
		HeaderPage headerPage = new HeaderPage(driver);
		
		if(headerPage.changePassword() == true)
		{
			testResult = true;
		}
		
		
		return testResult;
	}

}
