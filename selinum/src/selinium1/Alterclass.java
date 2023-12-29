package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterclass {
	
	
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
		//driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	    driver.get("https://www.google.com/");
       driver.findElement(By.xpath("//*[@name='alert']")).click();
       
		String textOnalert = driver.switchTo().alert().getText();
		System.out.println("string on Alert is:"+textOnalert);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	       driver.findElement(By.xpath("//*[@name='confirmation']")).click();
	        String conformation = driver.switchTo().alert().getText();
	       driver.switchTo().alert().dismiss();
            System.out.println("string on alert :"+conformation);
           driver.findElement(By.xpath("//*[@name='upload']")).sendKeys("C:\\Users\\raje\\Desktop\\selenium");
            
		
	}

}



