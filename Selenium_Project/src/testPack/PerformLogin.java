package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLogin {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
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
		
		
//		 screen = (TakesScreenshot)driver;
		
		
		
		
//		JavaScriptExecutor -  interface which contains executeScript;
		

		
		
	}

}
