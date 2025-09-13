package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		Thread.sleep(3000);

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3); // switch selenium focus from main webpage to given iframe
		System.out.println("switched to frame3");
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("ABC");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent(); //  switch selenium focus from current iframe to main webpage 
		System.out.println("switched to defaultContent");
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4); // switch selenium focus from main webpage to given iframe
		System.out.println("Switched to frame4");
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("PQR");
		
		driver.switchTo().defaultContent(); //  switch selenium focus from current iframe to main webpage 
		System.out.println("switched to defaultContent");
		driver.switchTo().frame(frame3); 
		System.out.println("switched to frame3");
		
		WebElement iframeInsideFrame3 = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/')]"));
		driver.switchTo().frame(iframeInsideFrame3); 
		System.out.println("switched to iframeInsideFrame3");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();  //  switch selenium focus from current iframe to immediate parent frame
		System.out.println("switched to parentFrame");
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("XYZ");
	}

}
