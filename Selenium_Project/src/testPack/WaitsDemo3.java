package testPack;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utility.JSMethods;

public class WaitsDemo3
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement ele = driver.findElement(By.id("timerAlertButton"));
		JSMethods.scroll(driver, ele);
		ele.click();   // to enable alert timer of 5 seconds
		
//		Faluent Wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(250))
				.ignoring(NullPointerException.class);
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		System.out.println("Alert handlled");
		
		
		
	}

}
