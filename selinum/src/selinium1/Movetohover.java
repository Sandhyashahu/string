
package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetohover {
	
	public static void main(String[] args) {
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedr"
		//		+ "iver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (12)\\chromedriver.exe");

		
	    ChromeDriver driver =new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();  


	    WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
             username.sendKeys("Admin");
	   
	   WebElement username1=driver.findElement(By.xpath("//input[@type='password']"));
	   username1.sendKeys("admin123");
	   
	   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	   
	   Actions act = new  Actions(driver);
	   
	    WebElement admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		   act.moveToElement(admin).perform();

	    
	   WebElement usermanage = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	   act.moveToElement(usermanage).perform();
	   
	  WebElement user = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
	  act.moveToElement(user)
	   .perform();
	  WebElement maintaince = driver.findElement(By.xpath("//*[@id='menu_maintenance_purgeEmployee'][1]"));
	   act.moveToElement(maintaince).contextClick().build().perform();
	   

	   
		
	}

}
