package testPack;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
	
		
		String browserName = "CHROME";
		
		if(browserName.equals("CHROME"))
		{
			driver  = new ChromeDriver();
		}
		else if(browserName.equals("EDGE"))
		{
			driver  = new EdgeDriver();
		}
			
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google website"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		Thread.sleep(3000);
		
//		driver.close();  // Close currently focused window
		
		driver.quit();   // close entire browser
		
		
	}
	
	
	
	
	
	

}
