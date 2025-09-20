package testPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData
{
	
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(path); // locate 
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  // open/load the file 
		XSSFSheet sheet = wb.getSheet("Sheet5");  // open sheet
		XSSFRow row = sheet.getRow(1); // decide row
		XSSFCell cell = row.getCell(1);  // decide cell
		
//		String data = cell.getStringCellValue();  // read data from String cell
		double numdata = cell.getNumericCellValue();  // read data from Numeric cell
		Date datedata = cell.getDateCellValue();  // read data from Date cell
		
		System.out.println(numdata);
		
		
		
		
	}
}
