package selinium1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Autoaction {
	
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chrome-win32 jully\\chrome-win32\\chrome-win32.exe");
    ChromeDriver driver =new ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");

      WebElement search = driver.findElement(By.xpath("//*[@name ='q']"));

    search.sendKeys("mobile under 5000");
    Thread.sleep(2000);

    Actions act = new Actions(driver);
    
    act.sendKeys(search, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
}
}