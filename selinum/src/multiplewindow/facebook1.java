package multiplewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook1 {
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\newselenium\\chromedriver.exe");

	  WebDriver driver =new ChromeDriver();
	    
	  
		driver.get("https://www.facebook1.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sandhyajadhav164@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9527239545");
		driver.findElement(By.xpath("//*[@name='login']")).click();


}
}