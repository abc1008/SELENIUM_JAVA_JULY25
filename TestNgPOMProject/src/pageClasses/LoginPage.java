package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// private variables
	private static final String textBoxUserNameXpath = "//input[@name='username']";
	private static final String textBoxPasswordXpath = "//input[@type='password']";
	private static final String buttonLoginXpath = "//button[contains(@class,'oxd-button oxd-button')]";
	
	
	@FindBy(xpath = textBoxUserNameXpath)
	private WebElement textBoxUserName;
	
	@FindBy(xpath = textBoxPasswordXpath)
	private WebElement textBoxPassword;	
	
	@FindBy(xpath = buttonLoginXpath)
	private WebElement buttonLogin;	
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// methods
	public void login() throws InterruptedException
	{
		textBoxUserName.sendKeys("Admin");
		textBoxPassword.sendKeys("admin123");
		buttonLogin.click();
		
		
		Thread.sleep(5000);
		
	}
	
	

}
