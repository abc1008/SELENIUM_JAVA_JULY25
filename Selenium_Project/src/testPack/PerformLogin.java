package testPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import utility.CommonMethods;
import utility.JSMethods;

public class PerformLogin {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		Thread.sleep(3000);
		
		WebElement textBoxUserName = driver.findElement(By.id("input-email"));  // locate the webelement
		textBoxUserName.sendKeys("ag89111@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement textBoxPassword = driver.findElement(By.name("password"));
		textBoxPassword.sendKeys("Unlock@456");
		
//		TakeScreenshot   - interface which contains getScreenshotAs();
//		JavaScriptExecutor -  interface which contains executeScript();
		
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		JSMethods.click(driver, loginButton);
		
		
		Thread.sleep(2000);
		
		WebElement warningMsg = driver.findElement(By.xpath("//div[contains(text(),'Warning:')]"));
		
		if(warningMsg.isDisplayed()) // login failed
		{
			System.out.println("Login failed");  
			
			// code to take screenshot
			
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			File screenShot = screen.getScreenshotAs(OutputType.FILE);
//			File filePath = new File("D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Screenshots\\testScreen2.png");
//			Files.copy(screenShot, filePath);
			
			
			CommonMethods.captureScreen(driver);
			
			
		}
		else
		{
			System.out.println("Login Success");
			
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			File screenShot = screen.getScreenshotAs(OutputType.FILE);
//			File filePath = new File("D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Screenshots\\testScreen2.png");
//			Files.copy(screenShot, filePath);
			
			CommonMethods.captureScreen(driver);
			
		}
		
		
		

		
		
		
		
		

		

		
		
	}

}
