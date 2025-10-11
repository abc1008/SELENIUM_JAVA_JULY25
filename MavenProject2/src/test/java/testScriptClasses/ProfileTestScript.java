package testScriptClasses;

import java.io.IOException;

import basePack.ObjectHelper;
import testSuites.HeaderTestSuite;

public class ProfileTestScript extends HeaderTestSuite {
	
	public void performUpdateProfile() throws InterruptedException, IOException
	{
//		HeaderPage headerPage = new HeaderPage(driver);
//		headerPage.selectOptionFromProfileIcon("Profile");
		
		
		ObjectHelper.headerPage().selectOptionFromProfileIcon("Profile");
		
		
//		ProfilePage profilePage = new ProfilePage(driver);
//		profilePage.updateProfile();
		
		ObjectHelper.profilePage().updateProfile();
		
	}
	

}
