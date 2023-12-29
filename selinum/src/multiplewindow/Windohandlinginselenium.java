package multiplewindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windohandlinginselenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");


		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\newselenium\\chromedriver.exe");
		
	  WebDriver driver =new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();  
	    String parentid = driver.getWindowHandle();
		 
		
		System.out.println("Parent window is:"+parentid);
		Thread.sleep(5000);
	   // driver.get("https://google.com/");
		//driver.findElement(By.xpath("//a['http://www.orangehrm.com'][2]")).click();
        driver.findElement(By.linkText("//*[text()='OrangeHRM, Inc']")).click();      

		//driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		//driver.findElement(By.("//*[text()='OrangeHRM, Inc']")).click();
		//driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	    driver.get("https://google.com/");

        // driver.findElement(By.linkText("//*[text()='OrangeHRM Inc']")).click();
          
          Set<String> allwindow = driver.getWindowHandles();
          
          int countwindow = allwindow.size();
  		System.out.println("total number id window:"+countwindow);
  		
  		
  		for(String windoid:allwindow)
  		{
  		    if(!(parentid.equalsIgnoreCase(windoid)));
  		    driver.switchTo().window(windoid);
  		    
  		    driver.findElement(By.xpath("//*[@value='Try OrangeHRM for Free']")).click();
  		    
  		    
  		    Thread.sleep(2000);
  		    
  		    driver.switchTo().window(parentid); 
  		   
	  
  		}
  		
  		
		
		
		
		
		
	}
	

}
