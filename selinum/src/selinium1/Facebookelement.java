package selinium1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;

public class Facebookelement {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

    ChromeDriver driver =new ChromeDriver();
    //driver.get("https://github.com/");
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   // Thread.sleep(5000);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
  WebElement username1=driver.findElement(By.xpath("//input[@type='password']"));
     username1.sendKeys("admin123");
driver.findElement(By.xpath("//*[@type='submit']")).click();




driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();


driver.findElement(By.xpath("//*[/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div]")).click();
for(int i=1; i<=37; i++)
{
 driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
if(i%2==0)
{
	
   driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();

}
else 
{
	
     System.out.println( "Not click");
}
	
}


	}
}
