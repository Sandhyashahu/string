package selinium1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiccompont {
	

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		//  WebDriver driver =new ChromeDriver();
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (12)\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\raje\\Desktop\\IView\\chrome-win32 (3)\\chrome-win32");
		  ChromeDriver driver =new ChromeDriver();
	
		    //WebDriver driver =new ChromeDriver();
		//	driver.get("https://github.com/");
			//driver.get("https://github.com/Vimannagar/KatrajMayJavaBasics");
			//String title=driver.getTitle();
			
			//System.out.println(title);
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
       Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sandhya");
	        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jadhav");
	        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9527239545");
	        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("sandhya@21");
	        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("6");
	       driver.findElement(By.xpath("//select[@id='month']")).sendKeys("April");
	        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1993");
	        driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
	        driver.findElement(By.xpath("//*[@name='websubmit']")).click();
	        JavascriptExecutor js1=(JavascriptExecutor)driver;
	        
	        js1.executeScript("window.scrollBy(0,800)");
	        js1.executeScript("window.scrollBy(0,-200)");

	       
	    

	        
	        
	}
	
}
