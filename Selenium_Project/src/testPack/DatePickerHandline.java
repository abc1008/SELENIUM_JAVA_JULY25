package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerHandline
{
	/**
	 * Method to click Next or Prev button based on input date.
	 */
	public static void changeMonthYear()
	{
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		
		
		while(true)
		{
			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthYearText = monthYear.getText();
			if(monthYearText.equals("August 2026"))
			{
				// stop the click
				System.out.println("Found");
				break;
			}
			
			driver.findElement(By.xpath("//a[@title='Prev']")).click(); // prev click
//			changeMonthYear();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='10']")).click();
		
		
	}

}
