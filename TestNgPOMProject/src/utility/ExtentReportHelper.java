package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import basePack.BaseClass;

public class ExtentReportHelper extends BaseClass
{
	static ExtentReports extentReport;
	static ExtentTest testCase; // null
	
	public ExtentReportHelper()
	{
		extentReport = new ExtentReports();
		String path = "D:\\TRAININGS\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Reports\\testReport3.html";
		ExtentSparkReporter extentSparkReporter  = new ExtentSparkReporter(path);
		extentReport.attachReporter(extentSparkReporter);
	}
	
	
	public static void startTest(String testCaseName)
	{
		testCase = extentReport.createTest(testCaseName);
	}
	
	public static void logPass(String msg)
	{
		testCase.log(Status.PASS, msg);
	}
	
	public static void logFail(String msg) throws IOException
	{
		testCase.log(Status.FAIL, msg, captureScreen(driver));
	}
	
	public static void logInfo(String msg)
	{
		testCase.log(Status.INFO, msg);
	}
	
	public static void endTest()
	{
		extentReport.flush();
	}
	
	/**
	 * Method to capture screenshot
	 * @param driver
	 * @throws IOException
	 */
	public static Media captureScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
		String screenShot = screen.getScreenshotAs(OutputType.BASE64);
		
		MediaEntityBuilder mediaEntityBuilder = MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot);

		Media mediaScreenshot = mediaEntityBuilder.build();
		
		return mediaScreenshot;
	}
	
	

}
