package testScriptClasses;

import java.io.IOException;
import testSuites.HeaderTestSuite;
import utility.ObjectHelper;

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
