package selinium1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Getwindowhandle {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

		  WebDriver driver =new ChromeDriver();
		  
			 
	
	/*driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

	String parentid = driver.getWindowHandle();


	System.out.println("Parent window id is :"+parentid);

	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();


	Set<String> allwindow = driver.getWindowHandles();

	int countofwindow = allwindow.size();

	System.out.println("Total number of windows are: "+countofwindow);


	for(String winid:allwindow)
	{
		System.out.println(winid);

		if(!(parentid.equalsIgnoreCase(winid)))
		{
			driver.switchTo().window(winid);// switching to child id

			driver.findElement(By.xpath("//input[@value='Try OrangeHRM for Free']")).click();

			Thread.sleep(2000);

			driver.switchTo().window(parentid);// switching to parent id


			driver.quit();
		}
	}*/
	 driver.get("https://www.flipkart.com/");
		// driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		 driver.findElement(By.xpath("//*[@class='_30XB9F']")).click();
          WebElement search = driver.findElement(By.xpath("//input[@type='text']"));

	    search.sendKeys("mobile below 5000");
	    Thread.sleep(2000);

	    Actions act = new Actions(driver); 
	    act.sendKeys(search, Keys.ARROW_DOWN).sendKeys
	    (Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	 // driver.findElement(By.xpath("//*[@ alt='Itel A23 Pro (Lake Blue, 8 GB)']")).click();
	    
	    //	}
//			WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
//           driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//	    search.sendKeys("mobiles below 5000");
//	    //Thread.sleep(2000);
	
	  List<WebElement> list = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYsA1']//li/descendant::div[@data-tkid='e32066a8-4972-4a60-a4f8-eb529afd6122.mobiles below 5000|Mobiles']"));
          System.out.println("total no"+list.size());  
//   
//         for(int i=0;i<list.size();i++)
//	 
       // {
//	 System.out.println(list.get(i).getText());
//   if(list.get(i).getText().contains("mobiles below 5000"))
//{        
// 	  list.get(i).click();            
//break;   
//}
//}
	  
//		//driver.findElement(ByXPath("//input[@name='q']")).sendkeys(mobile);
		//WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
			//	search.sendKeys("mobiles below 5000");
	  //ul[@class='col-12-12 _1MRYA1']//li/descendant::div[@data-tkid='e32066a8-4972-4a60-a4f8-eb529afd6122.mobiles below 5000|Mobiles']
			//	Actions act = new Actions(driver);
			   // act.sendKeys(search, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	    
	  
//		driver.get("https://www.flipkart.com/");
////		//driver.findElement(ByXPath("//input[@name='q']")).sendkeys(mobile);
//		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
//				search.sendKeys("mobiles below 5000");
//				Actions act = new Actions(driver);
//			    act.sendKeys(search, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	             //  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         	//driver.get("https://www.google.com/");
         	//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
         	
              //driver.findElement(By.xpath("//input[@class='control']")).sendkeys.("testing");
         	
         	//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbcq_c']"));
         	//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
    
//         	System.out.println("total no"+list.size());  //ul[@class='col-12-12_1MRYA1']
//                
//          for(int i=0;i<list.size();i++)
//         	 
//          {
//         	 System.out.println(list.get(i).getText());
//
//                 if(list.get(i).getText().contains("testing techniques"))
//         	 {
//                   list.get(i).click();
//                        break;
//              }
//                
//          }    

}

		
		
	





}
	
