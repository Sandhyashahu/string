package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelhandaler {

	public static void main(String[] args) throws IOException {
		/*
	
/public static String readData(int row,int column) throws IOException
	
		String path = System.getProperty("user.dir")+"//Book1.xlsx"; 

		File src =new File(path);
		
		FileInputStream  fis=new FileInputStream(src);
		
		XSSFWorkbook bk=new XSSFWorkbook(fis);
		
		
	    XSSFSheet sh = bk.getSheet("Testdata");
		
		String value = sh.getRow(row).getCell(column).getStringCellValue();
		//System.out.println(value);
		//DataFormatter df=new DataFormatter();
		//String formatedvalue = df.formatCellValue(sh.getRow(row).getCell(column));
		return;*/

		
	
	
	//public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

        ChromeDriver driver =new ChromeDriver();

		String path = System.getProperty("user.dir")+"//Book1.xlsx"; 

		//File src =new File("C:\\\\Users\\\\raje\\\\Desktop\\\\Book1.xlsx");
		File src =new File(path);

		FileInputStream  fis=new FileInputStream(src);
		
		XSSFWorkbook bk=new XSSFWorkbook(fis);
		
	    XSSFSheet sh = bk.getSheet("Testdata");
		
		String value = sh.getRow(0).getCell(0).getStringCellValue();
		 driver.get(value);
		  
		//System.out.println(value);
	}
		
	}

