package pageClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;
import utility.ExplicitWait;
import utility.ExtentReportHelper;

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
	private static final String popupSuccessXpath = "//span[@class='jconfirm-title']";
	
	
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
	private List<WebElement> popupSuccess;	

	
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
			System.out.println("Cliked on profile icon");
			buttonLogout.click();
			ExplicitWait.waitUntilElementVisible(driver, buttonLogin);
			
			if(buttonLogin.isDisplayed())
			{
				ExtentReportHelper.logPass("Logout Successful");
			}
			else
			{
				ExtentReportHelper.logFail("Logout Failed");
			}
		} 
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Excepton in method 'logout' : "+ ex.getMessage());
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
			ExtentReportHelper.logInfo("Entered password and confirm password on Change Password popup.");
			buttonUpdate.click();
			ExtentReportHelper.logInfo("Clicked on Update button");
			
			if(popupSuccess.size() > 0)
			{
				ExtentReportHelper.logPass("Password Changed Successfully");
			}
			else
			{
				ExtentReportHelper.logFail("Password Change Failed");
				testResult = false;
			}
			
			ExplicitWait.waitUntilElementInVisible(driver, popupSuccess.get(0));
		}
		catch(Exception ex)
		{
			ExtentReportHelper.logFail("Excepton in method 'changePassword' : "+ ex.getMessage());
		}
		
		return testResult;
	}
	
	
	public void selectOptionFromProfileIcon(String option) throws IOException
	{
		
		try
		{
			ExtentReportHelper.logInfo("Selecting option '"+ option +"' from Profile icon");
			
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
			ExtentReportHelper.logFail("Excepton in method 'selectOptionFromProfileIcon' : "+ ex.getMessage());
		}
			
	}
}
