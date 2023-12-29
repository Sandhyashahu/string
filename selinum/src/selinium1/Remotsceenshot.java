
package selinium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Remotsceenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
       driver.findElement(By.xpath("//*[@name='alert']")).click();
       
		driver.switchTo().alert().accept();
		  TakesScreenshot scren = (TakesScreenshot) driver;
                 File source = scren.getScreenshotAs(OutputType.FILE);
		  File distination=new File("C:\\Users\\raje\\Desktop\\selenium\\alertscreenshot.png");
		  //File source = scrshot.getScreenshotAs(OutputType.FILE);

	//		File destination = new File(System.getProperty("user.dir")+"\\screenshots\\"+filename+".png");

		  FileHandler.copy(source, distination);
	       	
	
		  
	}
}
