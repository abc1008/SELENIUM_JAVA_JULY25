package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;
import utility.ExplicitWait;

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
		textBoxUserName.sendKeys(CommonMethods.readConfigData("UserId"));
		textBoxPassword.sendKeys(CommonMethods.readConfigData("Password"));
		buttonLogin.click();
		
		ExplicitWait.waitUntilElementVisible(driver, buttonDashboard);
		
		
		if(buttonDashboard.isDisplayed())
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
	}
}
