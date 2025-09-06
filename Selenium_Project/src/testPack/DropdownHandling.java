package testPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandling
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		
		Thread.sleep(3000);
		
		List<WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		
		for( WebElement ele : allDays)
		{
			System.out.println(ele.getText()); // print the text attached with web element
		
			if(ele.getText().equals("100"))
			{
				ele.click();
				break;
			}
		
		}
		
		
		
		
		
	}
}
