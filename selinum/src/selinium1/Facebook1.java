package selinium1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot scrshot=(TakesScreenshot) driver;
		
		String path="C:\\Users\\raje\\Desktop\\tk\\img.` png";
		
		File source =scrshot.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileHandler.copy(source, destination);
		/*
	driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	//https://www.facebook.com/r.php?locale=en_GB&display=page
	//WebElement name1 = driver.findElement(By.xpath("//input[@name='firstname']"));

	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sandhya");
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jadhav");
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9527239545");
    driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("sandhya@21");

       List<WebElement> daysvalue = driver.findElements(By.xpath("//*[@id='day']//option"));


       
	for( WebElement day:daysvalue)
    {
		String daysoption=day.getText();
    
	if(daysoption.equalsIgnoreCase("32"))
          {
	     day.click();
	      }
   
            
          System.out.println(daysoption);
	}   */
}
}