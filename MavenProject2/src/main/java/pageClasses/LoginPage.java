package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;
import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class LoginPage {
	// private variables
	private WebDriver driver;
	private static final String textBoxUserNameXpath = "//input[@placeholder='Email']";
	private static final String textBoxPasswordXpath = "//input[@placeholder='Password']";
	private static final String buttonLoginXpath = "//button[@type='submit']";
	private static final String buttonDashboardXpath = "//span[text()='Dashboard']";
	
	
	@FindBy(xpath = textBoxUserNameXpath)
	private WebElement textBoxUserName;
	
	@FindBy(xpath = textBoxPasswordXpath)
	private WebElement textBoxPassword;	
	
	@FindBy(xpath = buttonLoginXpath)
	private WebElement buttonLogin;	
	
	@FindBy(xpath = buttonDashboardXpath)
	private WebElement buttonDashboard;	
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// methods
	public void login() throws InterruptedException, IOException
	{
		String userId = CommonMethods.readConfigData("UserId");
		String password  = CommonMethods.readConfigData("Password");
		
		textBoxUserName.sendKeys(userId);
		ExtentReportHelper.logInfo("Entered user id : "+userId);
		
		textBoxPassword.sendKeys(password);
		ExtentReportHelper.logInfo("Entered password : "+password);
		
		buttonLogin.click();
		ExtentReportHelper.logInfo("Clicked on login button");
		
		ExplicitWait.waitUntilElementVisible(driver, buttonDashboard);
		
		
		if(buttonDashboard.isDisplayed())
		{
			ExtentReportHelper.logPass("Login Successful");
		}
		else
		{
			ExtentReportHelper.logFail("Login Failed");
		}
	}
}
