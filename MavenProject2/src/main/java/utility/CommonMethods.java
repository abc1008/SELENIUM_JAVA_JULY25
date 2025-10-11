package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
	
	
	public static String readConfigData(String key) throws IOException
	{
		String path = "D:\\TRAININGS\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Selenium_JAVA_JULY25_WEEKEND_GIT_LOCAL2\\SELENIUM_JAVA_JULY25\\MavenProject2\\Config.properties";
		FileInputStream file = new FileInputStream(path);
		Properties prop = new  Properties();
		prop.load(file);   // open/load file
		String value = prop.getProperty(key);
		
		return value;
	}

}
