package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Zerodalogin2 {
	
		@Test
		public void login() throws InterruptedException
		{
		 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		     
			    ChromeOptions op = new ChromeOptions();
			   
		       op.addArguments("--disable-notifications");
		     
		      WebDriver driver = new ChromeDriver(op);
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		 	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

			/*//driver.findElement(By.xpath("//*[@id='userid']")).sendkeys.("DAA677");
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("992101");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			   Actions act = new  Actions(driver);

			  WebElement gold = driver.findElement(By.xpath("//*[@class='nice-name'][1]"));
			  act.moveToElement(gold).perform();
			  Thread.sleep(2000);
			  
			  WebElement buy = driver.findElement(By.xpath("//*[@class='button-blue buy']"));
			  act.moveToElement(buy).perform();
			  driver.findElement(By.xpath("//*[@class='button-blue buy']")).click();
*/
			  
			  
			
			
			 
		}

	}


