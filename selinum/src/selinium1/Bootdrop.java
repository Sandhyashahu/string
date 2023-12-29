package selinium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Bootdrop {
	
	
public static String readData(int row, int column) throws IOException {
		
         
		
	//	String path = "C:\\Users\\raje\\Desktop\\selenium\\Book1.xlsx"; 
		File src=new File("C:\\\\Users\\\\raje\\\\Desktop\\\\selenium\\\\Book1.xlsx");		
					
//	// to load the excel filein
		 FileInputStream fis = new FileInputStream(src);
	


		
	 XSSFWorkbook bk = new XSSFWorkbook(fis);
	
     XSSFSheet sh= bk.getSheet("Testdata");

	  
     String value = sh.getRow(row).getCell(column).getStringCellValue();
	
	System.out.println(value);
	
	System.out.println(readData(1,0));
	return (value);

}
}