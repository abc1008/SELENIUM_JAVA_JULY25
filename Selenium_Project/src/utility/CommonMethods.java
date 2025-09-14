package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class CommonMethods
{
	
	/**
	 * Method to capture screenshot
	 * @param driver
	 * @throws IOException
	 */
	public static void captureScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
		File screenShot = screen.getScreenshotAs(OutputType.FILE);
		File filePath = new File("D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Screenshots\\testScreen2.png");
		Files.copy(screenShot, filePath);
	}

}
