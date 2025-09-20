package testPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.CommonMethods;

public class ActionsClass2
{
	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		String url = CommonMethods.readConfigData("TestSiteUrl");
//		String userId = CommonMethods.readConfigData("userId");
//		String password = CommonMethods.readConfigData("Password");
//		String browserName = CommonMethods.readConfigData("Browser");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		 WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		 
		 Actions act = new Actions(driver);
		 act.contextClick(rightClickButton).build().perform();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Copy']")).click();
		 
		
	}

}
