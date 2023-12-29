import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class ONlineTest {
	
	public static void main(String []args)
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\dd\\chromedriver_win32 (6)\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	    driver.get("https://nichethyself.com/tourism/home.html");
		//driver.findElement(By.linkText("Customized tours")).click();
		JavascriptExecutor jsr=(JavascriptExecutor)driver;
			
			jsr.executeScript("arguments[0].click();",driver.findElement(By.linkText("Customized tours")));
			
			//WebElement wd = driver.findElement(By.xpath("//*[@id='days']"));
              // Select sp = new Select(wd);
               //sp.selectByValue("Homestay");
               
               WebElement day1 = driver.findElement(By.xpath("//*[@id='days']"));
       		Select sel =new Select(day1);
       		sel.selectByVisibleText("3-star Hotel");
       		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	   //  driver.findElement(By.linkText("//*[text(),target='_blank']")).click();
	  //   driver.findElement(By.tagName("a")).click();
	     
	     
	      
	       
	     //driver.close();
	}
	
}
	
	