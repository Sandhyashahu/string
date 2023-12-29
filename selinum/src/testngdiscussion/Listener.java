package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Listener {
	@Test
	public void login() throws InterruptedException
	{
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

	     
		
	      WebDriver driver = new ChromeDriver();
	      
	      
	     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		//driver.findElement(By.xpath("//*[@id='userid']")).sendkeys.("DAA677");
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
	}

}
