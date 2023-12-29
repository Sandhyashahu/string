package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandlerwitedata {
	
	private static XSSFWorkbook bk;



	public static String readData(int row,int column) throws IOException
	{
		String path = System.getProperty("user.dir")+"//Book1.xlsx"; 

		File src =new File(path);
		
		FileInputStream  fis=new FileInputStream(src);
		
		bk = new XSSFWorkbook(fis);
		
	    XSSFSheet sh = bk.getSheet("Testdata");
		
		String value = sh.getRow(row).getCell(column).getStringCellValue();
		System.out.println(value);
		DataFormatter df=new DataFormatter();
		String formatedvalue = df.formatCellValue(sh.getRow(row).getCell(column));
		return(formatedvalue);
	}
	
	public  static void writeData() throws IOException
	{
		String path = System.getProperty("user.dir")+"//Book1.xlsx"; 

		File src =new File(path);
		
		FileInputStream  fis=new FileInputStream(src);
		XSSFWorkbook bk=new XSSFWorkbook(fis);
		
	       XSSFSheet sh = bk.getSheet("Testdata");
		
	       File four= new File(path);
	       
	       FileOutputStream wr= new FileOutputStream(four);
	       
	       sh.getRow(8).getCell(1).setCellValue("write opration");
	       
	       bk.write(wr);
		
	}
	

	
public static void main(String[] args) throws IOException {
		
//		String path = System.getProperty("user.dir")+"//Book1.xlsx"; 
//
//		File src =new File(path);
//		
//		FileInputStream  fis=new FileInputStream(src);
//		
//		XSSFWorkbook bk=new XSSFWorkbook(fis);
//		
//	    XSSFSheet sh = bk.getSheet("Testdata");
//		
//		String value = sh.getRow(2).getCell(1).getStringCellValue();
//		System.out.println(value);
//		
//		
	
	readData(1, 0);
       writeData();
		
	}
}
