package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class First {
	
	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (12)\\chromedriver.exe");

	ChromeDriver driver =new ChromeDriver();
	//driver.get("https://github.com/");
	
	//driver.navigate().back();
	driver.manage().window().maximize();  
	//Thread.sleep(2000);
	//driver.get("https://www.facebook.com/");
	//driver.get("https://github.com/");
	
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().back();

	//driver.close();
driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//driver.findElement(By.id("btnLogin")).click();
    //driver.findElement(By.linkText("Forgot your password?")).click();
  
	driver.findElement(By.partialLinkText("Forgot")).click();
	}
	
	

}
                            