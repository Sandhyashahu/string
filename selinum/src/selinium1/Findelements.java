package selinium1;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Findelements {
	

public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (12)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (12)\\chromedriver.exe");

		ChromeDriver driver =new ChromeDriver();
		    
		    driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();  


		    WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		      boolean display = username.isDisplayed();
		      System.out.println("displaying return true:"+display);
			    username.sendKeys("Admin");
		   WebElement username1=driver.findElement(By.xpath("//input[@type='password']"));
		   username1.sendKeys("admin123");
		   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		   driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		   //driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_27']")).click();
		   
	
		   List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
		  // int nuofcheckbox=checkboxes.size();
		  // System.out.println("there are "+nuofcheckbox+" checkboxnumber of");
		   
		  // for ( WebElement check:checkboxes)
		  // {
		//	   check.click();
		  //}
		   


}
}