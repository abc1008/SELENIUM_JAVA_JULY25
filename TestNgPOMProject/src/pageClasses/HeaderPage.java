package pageClasses;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;
import utility.ExplicitWait;

public class HeaderPage 
{
	// private variables
	private WebDriver driver;
	private static final String buttonProfileIconById = "page-header-user-dropdown";
	private static final String buttonLogoutXpath = "//span[text()='Logout']";
	private static final String buttonProfileXpath = "//span[text()='Profile']";
	private static final String buttonLoginXpath = "//button[@type='submit']";
	private static final String buttonChangePasswordXpath = "//span[text()='Change Password']";
	private static final String textBoxPasswordXpath = "//input[@placeholder='Enter password']";
	private static final String textBoxConfPasswordXpath = "//input[@placeholder='Enter confirm password.']";
	private static final String buttonUpdateXpath = "//button[@type='submit' and text()='Update']";
	private static final String popupSuccessXpath = "//span[@class='jconfirm-titl']";
	
	
	@FindBy(id =  buttonProfileIconById)
	private WebElement buttonProfileIcon;
	
	@FindBy(xpath = buttonLogoutXpath)
	private WebElement buttonLogout;	
	
	@FindBy(xpath = buttonLoginXpath)
	private WebElement buttonLogin;	
	
	@FindBy(xpath = buttonChangePasswordXpath)
	private WebElement buttonChangePassword;	
	
	@FindBy(xpath = textBoxPasswordXpath)
	private WebElement textBoxPassword;	
	
	@FindBy(xpath = textBoxConfPasswordXpath)
	private WebElement textBoxConfPassword;	
	
	@FindBy(xpath = buttonUpdateXpath)
	private WebElement buttonUpdate;	
	
	@FindBy(xpath = popupSuccessXpath)
	private WebElement popupSuccess;	

	
	@FindBy(xpath = buttonProfileXpath)
	private WebElement buttonProfile;	
	
	
	// constructor
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// methods
	public void logout() throws InterruptedException, IOException
	{
		try 
		{
			buttonProfileIcon.click();
			buttonLogout.click();
			ExplicitWait.waitUntilElementVisible(driver, buttonLogin);
			
			if(buttonLogin.isDisplayed())
			{
				System.out.println("Logout Successful");
			}
			else
			{
				System.out.println("Logout Failed");
			}
		} 
		catch (Exception ex) 
		{
			System.out.println("Excepton in method 'logout' : "+ ex.getMessage());
		}
		
	}
	
	public boolean changePassword() throws IOException
	{
		boolean testResult = true;
		
		try
		{
			selectOptionFromProfileIcon("Change Password");
			ExplicitWait.waitUntilElementVisible(driver, textBoxPassword);
			
			textBoxPassword.sendKeys(CommonMethods.readConfigData("Password"));
			textBoxConfPassword.sendKeys(CommonMethods.readConfigData("Password"));
			
			buttonUpdate.click();
			
			if(popupSuccess.isDisplayed())
			{
				System.out.println("Password Changed Successfully");
			}
			else
			{
				System.out.println("Password Changed Failed");
				testResult = false;
			}
			
			ExplicitWait.waitUntilElementInVisible(driver, popupSuccess);
		}
		catch(Exception ex)
		{
			System.out.println("Excepton in method 'changePassword' : "+ ex.getMessage());
		}
		
		return testResult;
	}
	
	
	public void selectOptionFromProfileIcon(String option)
	{
		
		try
		{
			System.out.println("Selecting option '"+ option +"' from Profile icon");
			
			buttonProfileIcon.click();
			
			if(option.equals("Profile"))
			{
				buttonProfile.click();
			}
			else if(option.equals("Change Password"))
			{
				buttonChangePassword.click();
			}
			else if(option.equals("Logout"))
			{
				buttonLogout.click();
			}
		} 
		catch (Exception ex) 
		{
			System.out.println("Excepton in method 'selectOptionFromProfileIcon' : "+ ex.getMessage());
		}
			
	}
}
