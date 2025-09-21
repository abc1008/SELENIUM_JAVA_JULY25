package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utility.CommonMethods;

public class OrangeHrmLogin_TestNg {
	
	static WebDriver driver;
	
	@BeforeSuite
	public void initTest() throws IOException
	{
		if(CommonMethods.readConfigData("Browser").equals("CHROME"))
		{
			driver = new ChromeDriver();
		}
		else if(CommonMethods.readConfigData("Browser").equals("EDGE"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
			
		
//		Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get(CommonMethods.readConfigData("TestSiteUrl"));
	}
	
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		 WebElement userName = driver.findElement(By.name("username"));
		 userName.sendKeys(CommonMethods.readConfigData("UserId"));
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(CommonMethods.readConfigData("Password"));
		 
		 driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button')]")).click();
	
		 Thread.sleep(3000);
	
	
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
