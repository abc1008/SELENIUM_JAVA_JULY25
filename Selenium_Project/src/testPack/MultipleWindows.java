package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		String mainWindowHandle = driver.getWindowHandle();
		
		System.out.println("mainWindowHandle : " + mainWindowHandle);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		System.out.println();
		System.out.println("***** Print all WindowHandle *********");
		System.out.println();
		
		Set<String> allWindows = driver.getWindowHandles(); 
		
		for(String win : allWindows)
		{
			System.out.println(win);
		}
		
		System.out.println();
		System.out.println("***** Print all WindowHandle using List *********");
		System.out.println();
		
		ArrayList<String> list = new ArrayList<>(allWindows);


		for(String winHandle : list)
		{
			System.out.println(winHandle);
		}
		
		System.out.println("Switching selenium focus");
		driver.switchTo().window(list.get(3)); 
		
		Thread.sleep(2000);
		System.out.println("Clicking on Contact Sales");
		driver.findElement(By.xpath("//button[text()='Contact Sales']")).click();
		
//		there are 10 windows open, i want to interact with ele on Nth window ?
		
		
		
	}

}
