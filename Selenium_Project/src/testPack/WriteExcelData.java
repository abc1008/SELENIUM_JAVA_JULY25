package testPack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData
{
	
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(path); // locate 
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  // open/load the file 
		XSSFSheet sheet = wb.getSheet("Sheet5");  // open sheet
		XSSFRow row = sheet.getRow(0); // decide row
		XSSFCell cell = row.getCell(1);  // decide cell
		
		
		
		// write 
		FileOutputStream fout = new FileOutputStream(path);
		cell.setCellValue(963);  // update cell value
		wb.write(fout);  // Save the excel
		
		System.out.println("Completed");
		
		
	}
}
