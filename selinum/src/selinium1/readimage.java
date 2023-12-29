package selinium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readimage {
	
public static String readData(int row, int column) throws IOException {
		
         
		
		String path = "C:\\Users\\raje\\Desktop\\selenium\\Book1.xlsx"; 
		File src=new File(path);		
					
//	// to load the excel filein
		FileInputStream fis =new FileInputStream(src);
	


		
	XSSFWorkbook bk=new XSSFWorkbook(fis);
	
     XSSFSheet sh= bk.getSheet("Testdata");

	  
     String value = sh.getRow(row).getCell(column).getStringCellValue();
	
	System.out.println(value);
	
	System.out.println(readData(1,0));
	return (value);
	
/*public static List<String> readUrlsFromExcel(String ExcelFilePath) throws IOException {  
		
	 List<String> urls = new ArryaList<String>();
		
	Workbook bk=new XSSFWorkbook(urls);
	
     Sheet sh= bk.getSheetAt(0);
     for(Row row:sh)
     {
	 Cell cell= row.getcell(0);
	 if (cell!=null){
		 urls.add(cell.getStringCellValue());
	 }
 }
	  
    
	return urls;
	*/


}
}
