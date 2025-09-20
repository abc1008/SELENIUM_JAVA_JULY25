package testPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utility.CommonMethods;

public class OrangeHrmLogin {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
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
	
		
		
//		Options var1 = driver.manage();
//		Window var2 = var1.window();
//		var2.maximize();
		
		driver.manage().window().maximize();
	
		
//		System.out.println(data);
		
		driver.get(CommonMethods.readConfigData("TestSiteUrl"));
		
//		Thread.sleep(3000);
		
		 WebElement userName = driver.findElement(By.name("username"));
		 userName.sendKeys(CommonMethods.readConfigData("UserId"));
		 
//		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(CommonMethods.readConfigData("Password"));
		 
//		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button')]")).click();
		 
		 
	
		
		
		
		
	}

}
