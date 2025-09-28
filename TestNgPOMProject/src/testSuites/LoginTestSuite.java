package testSuites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import testScriptClasses.LoginTestScipt;

public class LoginTestSuite {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void testSetUp()
	{
		// browser launch
		// maximize
		// implicit wait
		// url hit 
	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test
	public void tc_123_LoginTest() throws InterruptedException
	{
		LoginTestScipt loginTestScipt = new LoginTestScipt();
		loginTestScipt.performLogin();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
