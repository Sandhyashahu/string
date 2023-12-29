

package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Actionclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
   
	//ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Actions act =new Actions(driver);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Firstname");
	
     act.sendKeys(Keys.TAB).sendKeys("Lastname").sendKeys(Keys.TAB).sendKeys("123312").build().perform();
    WebElement passwd = driver.findElement(By.xpath("//input[@data-type='password']"));
       act.sendKeys(passwd,"pass key").perform();

       WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
        act.click(gender).perform();
       
	
       
       
       
}
}