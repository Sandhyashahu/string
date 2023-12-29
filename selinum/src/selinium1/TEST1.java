package selinium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.StaticInitializerCoercer;

public class TEST1 {
	
	public static void main(String []args) throws InterruptedException
	{
		
	 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\dd\\chromedriver_win32 (6)\\chromedriver.exe");
		   	WebDriver driver= new ChromeDriver();
		   	driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    
		    driver.get("https://www.flipkart.com/");
		    driver.navigate().forward();		   	
			// driver.get("https://www.flipkart.com/");
			 driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


	   
		      WebElement search = driver.findElement(By.xpath("//input[@type='text']"));

		    search.sendKeys("mobile below 6000");
		    Thread.sleep(2000);

		    Actions act = new Actions(driver);
		    
		    act.sendKeys(search, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 // driver.findElement(By.xpath("//*[@ alt='Itel A23 Pro (Lake Blue, 8 GB)']")).click();
		    
		   	
		
		
	}

}
