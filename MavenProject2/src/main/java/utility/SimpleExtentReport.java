package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SimpleExtentReport {
	
	
	public static void main(String[] args) {
		
		
		ExtentReports extentReport = new ExtentReports();
		
		String path = "D:\\TRAININGS\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Reports\\testReport3.html";
		ExtentSparkReporter extentSparkReporter  = new ExtentSparkReporter(path);
		
		extentReport.attachReporter(extentSparkReporter);
		
		
		
		
		ExtentTest testCase = extentReport.createTest("Test Case 1");
		
		testCase.log(Status.PASS, "Logout Pass");
		
		testCase.log(Status.FAIL, "Logout Failed");
		
		testCase.log(Status.INFO, "Button Clicked");
		extentReport.flush();  
		
	}
	
	

}
