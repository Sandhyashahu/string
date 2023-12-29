package selinium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowmultihandlingarray {

	
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\dd\\chromedriver_win32 (6)\\chromedriver.exe");
		
		
	    ChromeDriver driver =new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();  
                
		String parentid = driver.getWindowHandle();
		System.out.println("Parent window is:"+parentid);
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();

		

		
            
		     Set<String> allwindow = driver.getWindowHandles();
		    int countdwind = allwindow.size();
		    
		    System.out.println("the total number of size"+countdwind);
		    
		   String id[] =new String[countdwind];
		   
		   
		   
		   int i=0;
		   
		   for(String ids:allwindow)
			   
		   {
			   id[i]=ids;
			    i++;
		   }
		    		 
		   driver.switchTo().window(id[2]);
		   
			driver.findElement(By.xpath("//*[@value='Try OrangeHRM for Free']")).click();
			
			Thread.sleep(2000);
			 driver.switchTo().window(parentid);

			WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		   WebElement username1=driver.findElement(By.xpath("//input[@type='password']"));
		   username1.sendKeys("admin123");
		   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		   
			

//		    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//
//			boolean isdisplay = username.isDisplayed();
//
//			System.out.println("displaying username retuns :" + isdisplay);
//
//			username.sendKeys("Admin");
//			
//			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//
//			driver.findElement(By.xpath("//input[@name='Submit']")).click();


		    
		
		
		
		
		
		
}
}
