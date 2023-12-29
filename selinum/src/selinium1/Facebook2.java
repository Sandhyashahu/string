package selinium1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Excelhandaler;

public class Facebook2 {
	
	public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    WebElement username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
	  // username.sendKeys(Excelhandaler.readData(0, 0));

	    
	 
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Excelhandaler.readData(0, 1));

	   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	   //driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	   //driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_27']")).click();
	 
    driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
    driver.findElement(By.xpath("//input[@id='actionValidatingForm__csrf_token']")).click();
  driver.findElement(By.xpath("//input[@class='calendar hasDatepicker valid']")) .click();
 
 
 
	}

}
