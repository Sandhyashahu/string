package selinium1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Takescreenshoot;

public class Recomnded {

	
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
       driver.findElement(By.xpath("//*[@name='alert']")).click();
       driver.switchTo().alert().accept();
       
       Takescreenshoot.caputre(driver,"secondscreenshot");
       
       
		
		
		

		
	

}

}
