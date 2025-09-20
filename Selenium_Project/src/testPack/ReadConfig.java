package testPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig
{
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Selenium_JAVA_JULY25_WEEKEND_GIT_LOCAL2\\SELENIUM_JAVA_JULY25\\Selenium_Project\\Config.properties";
		FileInputStream file = new FileInputStream(path);
		Properties prop = new  Properties();
		prop.load(file);   // open/load file
		String data = prop.getProperty("TestSiteUrl");
		
		System.out.println(data);
		
	}
	

}
