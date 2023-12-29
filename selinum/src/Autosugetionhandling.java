import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selinium1.Actionclass;

public class Autosugetionhandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder (2)\\chrome version 98\\chromedriver.exes");
	    ChromeDriver driver =new ChromeDriver();
		driver.get("");

		  driver.findElement(By.xpath("//div[@id='root']")).click();

//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		 WebElement Search = driver.findElement(By.xpath("//*[@name='q']"));
//		 Search.sendKeys("ind");
//		 
//		 Thread.sleep(2000);
//		 
//		    Actions act=new Actions(driver);
//		    
//		    act.sendKeys(Search, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//	

		
		
	}

}
