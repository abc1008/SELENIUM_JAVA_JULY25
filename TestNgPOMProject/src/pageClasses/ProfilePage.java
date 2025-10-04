package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;
import utility.ExplicitWait;

public class ProfilePage {
	// private variables
	private WebDriver driver;
	private static final String textBoxMobileById = "mobile";
	private static final String buttonUpdateXpath = "//button[@type='submit' and text()='Update']";
	private static final String popupSuccessXpath = "//span[@class='jconfirm-title']";
	
	
	
	@FindBy(id =  textBoxMobileById)
	private WebElement textBoxMobile;
	
	@FindBy(xpath = buttonUpdateXpath)
	private WebElement buttonUpdate;	
	
	@FindBy(xpath = popupSuccessXpath)
	private WebElement popupSuccess;	
	
	
	// constructor
	public ProfilePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// methods
	public void updateProfile() throws InterruptedException, IOException
	{
		textBoxMobile.clear();
		textBoxMobile.sendKeys("1234567890");
		
		buttonUpdate.click();
		
		
		if(popupSuccess.isDisplayed())
		{
			System.out.println("Mobile number Changed Successfully");
		}
		else
		{
			System.out.println("Mobile number Change Failed");
		}
		
		ExplicitWait.waitUntilElementInVisible(driver, popupSuccess);
	}

}
