package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass4
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ABC");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).sendKeys("PQR").build().perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
		
		
	}

}
