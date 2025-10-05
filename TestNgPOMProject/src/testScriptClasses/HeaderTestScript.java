package testScriptClasses;

import java.io.IOException;

import pageClasses.HeaderPage;
import testSuites.HeaderTestSuite;
import utility.ExtentReportHelper;

public class HeaderTestScript extends HeaderTestSuite {
	
	public void performLogout() throws InterruptedException, IOException
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.logout();
		
	}
	
	public boolean performChangePassword() throws InterruptedException, IOException
	{
		
		boolean testResult = false;
		
		ExtentReportHelper.logInfo("performChangePassword method");
		
		HeaderPage headerPage = new HeaderPage(driver);
		
		if(headerPage.changePassword() == true)
		{
			ExtentReportHelper.logPass("Password Changed Successfully.");
			testResult = true;
		}
		else
		{
			ExtentReportHelper.logFail("Password Change Failed.");
		}
		
		return testResult;
	}

}
