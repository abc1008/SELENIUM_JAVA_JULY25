package testPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
			if(ele.getText().equals("10"))
			{
				ele.click();
				break;
			}
		}
		
		
//		2nd way - using Select class
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sel = new Select(month);  // dropdowns created using select tagname
//		sel.selectByIndex(5); 
		
//		sel.selectByValue("3");
		
		sel.selectByVisibleText("Nov");
		
		
		
		
		
	}
}
