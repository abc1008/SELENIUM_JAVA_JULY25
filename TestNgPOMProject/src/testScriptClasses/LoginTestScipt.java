package testScriptClasses;

import pageClasses.LoginPage;
import testSuites.LoginTestSuite;

public class LoginTestScipt extends LoginTestSuite
{
	
	public void performLogin() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
	

}
