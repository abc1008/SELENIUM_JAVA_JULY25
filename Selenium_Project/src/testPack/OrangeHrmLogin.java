package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Options var1 = driver.manage();
		Window var2 = var1.window();
		var2.maximize();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		 WebElement userName = driver.findElement(By.name("username"));
		 userName.sendKeys("Admin");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-buttonz')]")).click();
		 
		 
		 
		
		
	}

}
