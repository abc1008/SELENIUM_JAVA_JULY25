package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScriptClasses.HeaderTestScript;
import testScriptClasses.LoginTestScipt;
import utility.CommonMethods;
import utility.ExtentReportHelper;

public class BaseClass 
{
	public static WebDriver driver;
	static String dateTimeStamp;
	
	@BeforeSuite
	public void testSetUp() throws IOException
	{
		// browser launch
		// maximize
		// implicit wait
		// url hit 
		
		
		ZonedDateTime dateTime = ZonedDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("ddMMyyyy_hh_mm_ss");
		dateTimeStamp = dateTime.format(dateFormat);
	
		String browserName = CommonMethods.readConfigData("Browser");
		
		if(browserName.equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("EDGE"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser Name");
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(CommonMethods.readConfigData("TestSiteUrl"));
		ExtentReportHelper extentReportHelper = new ExtentReportHelper(driver,dateTimeStamp);
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		ExtentReportHelper.startTest("Test Case 1");
		LoginTestScipt loginTestScipt = new LoginTestScipt();
		loginTestScipt.performLogin();
	}
	
	
	@AfterMethod
	public void tc_123_LogoutTest() throws InterruptedException, IOException
	{
		HeaderTestScript headerTestScript = new HeaderTestScript();
		headerTestScript.performLogout();
		ExtentReportHelper.endTest();  // report generate
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
