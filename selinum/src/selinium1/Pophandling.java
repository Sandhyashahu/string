package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pophandling {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
		driver.get("https://groww.in/");
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']")).click();
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("velocity.ctc@gmail.com");
		driver.findElement(By.xpath("(//*[@class='btn51Btn btn51RipplePrimary btn51Primary'])[2]")).click();
		
	}

}
