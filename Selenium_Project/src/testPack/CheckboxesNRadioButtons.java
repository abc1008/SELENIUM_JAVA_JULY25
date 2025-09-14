package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.JSMethods;

public class CheckboxesNRadioButtons
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formstone.it/components/checkbox/");
		
//		Thread.sleep(3000);
		
		
		// perform scroll
		
		
//		JavascriptExecutor
		
		
		WebElement demo = driver.findElement(By.xpath("//a[@name='demo']"));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", demo);
		
//							js command
		
		JSMethods.scroll(driver, demo);
		
		
		Thread.sleep(3000);
		
		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='checkbox-3']"));
		
		boolean isenabled = checkBox3.isEnabled();
		
		
		if(isenabled == false)
		{
			System.out.println("Checkbox is not enabled.");
		}
		else 
		{
			System.out.println("Checkbox is enabled.");
		}
		
		
		
		
	}

}
