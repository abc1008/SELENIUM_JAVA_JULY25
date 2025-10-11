package basePack;

import pageClasses.HeaderPage;
import pageClasses.ProfilePage;

public class ObjectHelper extends BaseClass
{
	// to return the objects of page classes
	
	private static HeaderPage _headerPage;
	public static HeaderPage headerPage()
	{
		if(_headerPage == null)
		{
			_headerPage = new HeaderPage(driver);
		}
		
		return _headerPage;
	}
	
	
	private static ProfilePage _profilePage;
	public static ProfilePage profilePage()
	{
		if(_profilePage == null)
		{
			_profilePage = new ProfilePage(driver);
		}
		
		return _profilePage;
	}
	
	
	
}
