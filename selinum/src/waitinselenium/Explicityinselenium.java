package waitinselenium;

import java.util.List;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicityinselenium {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\dd\\chromedriver_win32 (6)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (12)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  

	    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	   List<WebElement> Count = driver.findElements(By.tagName("a"));
	   System.out.println(Count.size());
	   for(int i=0;i<Count.size();i++)
	   {
		  String abc=Count.get(i).getText();  
		  System.out.println(abc);
	   }
	    driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
	    driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	    
	  //*[@id="capture"]/div[1]/header/div[1]/div/div[2]/nav/div/ul/li[2]/a
	    
	  //*[@id="capture"]/div[1]/header/div[1]/div/div[2]/nav/div/ul/li[2]/a
	   // {activeClass: state.includes(viewStates.RELATIONSHIP_CHART)}
	    

	}
	
	

}



