package testSuites;

import java.io.IOException;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScriptClasses.ProfileTestScript;

public class ProfileTestSuite extends BaseClass{
	
	
	@Test
	public void tc_123_updateProfileTest() throws InterruptedException, IOException
	{
		ProfileTestScript profileTestScript = new ProfileTestScript();
		profileTestScript.performUpdateProfile();
		
	}

}
