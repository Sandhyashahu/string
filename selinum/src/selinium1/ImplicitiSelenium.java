
package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitiSelenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver =new ChromeDriver();
	     
		driver.manage().window().maximize();  

	    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

	    driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
	    driver.findElement(By.xpath("//*[@id='enable-button']")).click();

	}
	
	

}
