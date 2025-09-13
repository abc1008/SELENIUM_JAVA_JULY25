package testPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups
{

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(2000);
		
		
		 Alert alertPopup = driver.switchTo().alert();
		 
		 alertPopup.accept();
		 
		Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		
		 driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		Thread.sleep(2000);
		 
		 Alert alertPopup2 = driver.switchTo().alert();
		 
		 alertPopup2.dismiss();
		
		
	}
}
