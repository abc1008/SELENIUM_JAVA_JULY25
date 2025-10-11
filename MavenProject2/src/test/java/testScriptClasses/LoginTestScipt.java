package testScriptClasses;

import java.io.IOException;

import pageClasses.LoginPage;
import testSuites.LoginTestSuite;

public class LoginTestScipt extends LoginTestSuite
{
	
	public void performLogin() throws InterruptedException, IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
	

}
