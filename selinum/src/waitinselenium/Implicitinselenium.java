package waitinselenium;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicitinselenium {
	

		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (14)\\chromedriver.exe");

		    ChromeDriver driver =new ChromeDriver();
		     
			driver.manage().window().maximize();  

		   // driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

			
		   // driver.get("https://groww.in/");
		    
		    
		    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// dynamic wait

         //  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			   driver.get("https://google.com/");

		    WebElement search = driver.findElement(By.xpath("//*[@name ='q']"));

		    search.sendKeys("India");

		    
		    Actions act = new Actions(driver);
		    
     act.sendKeys(search, Keys.ENTER).build().perform();
     
     Thread.sleep(10000);
	   // driver.findElement(By.xpath("//*[text()='Sbi.co.in']")).click();
    driver.findElement(By.xpath("//*[text()='Sbi.co.in']")).click();
		
    // driver.findElement(By.xpath("//*[text()='rbi.org.in']")).click();
		
	}

}
