package selinium1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handlechekbox {
	
public  static  void main (String [] args) throws IOException
	
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
      
	
	   ChromeDriver driver =new ChromeDriver();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	   driver.findElement(By.xpath("//*[@style='color: #082b71; padding-right: 29px;']")).click();
      
	 

	   List<WebElement> ch = driver.findElements(By.xpath("//div[@class='col-xs-12 remove-padding']"));

         for(WebElement ch1:ch )
        	 
         {
        	 System.out.println(ch1.getText());
        	 
         }
         
  	   driver.findElement(By.xpath("//*[@style='color: #082b71; padding-right: 29px;']")).click();

	}   


	

}

