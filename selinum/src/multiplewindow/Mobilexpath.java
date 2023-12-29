package multiplewindow;

import org.openqa.selenium.By.ByXPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import com.google.common.annotations.VisibleForTesting;

public class Mobilexpath {
	       


public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\IView\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	//setProperty("webdriver.chrome.driver",river_win32 (2)\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	  
		 driver.get("https://qaportal.intelligencenode.com/?app_key=2244a55adbf218a1c0407fd6e0c995a6#!/compare/new/item/");
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// dynamic wait

		
		// WebElement cap = driver.findElement(By.xpath("//*[@id=\"capture\"]/div[1]/header/div[1]/div/div[2]/nav/div/ul/li[3]/a"));
		            //cap.click();
		            
		           // WebElement item= driver.findElement(By.xpath("//*[@id=\"capture\"]/div[1]/header/div[1]/div/div[2]/nav/div/ul/li[3]/ul/li/a"));   
		              
		             // item.click();
		     
		         //    System.out.println(item.size());
		 
		
}

		
		
	
}

