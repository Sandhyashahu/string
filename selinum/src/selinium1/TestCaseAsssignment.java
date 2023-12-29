package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;



public class TestCaseAsssignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\dd\\chromedriver_win32 (6)\\chromedriver.exe");
		
	        WebDriver driver = new  ChromeDriver();  
	        
	        
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://staging.instacred.me/simulation/tpsl/e2e-transaction.jsp");
	        WebElement gatway = driver.findElement(By.xpath("//*[@id='GID']"));

		      Select del =new Select(gatway);
		      del.selectByValue("1");
		      
	        
	        driver.findElement(By.xpath("//*[@id='CI']")).sendKeys("9988998899"); 
	        
	        driver.findElement(By.xpath("//*[@onclick='proceedWithInstaEmi()']")).click();
	        
	        driver.findElement(By.xpath("//*[@id='emi']/div[1]/div[1]]")).click();
	      
	        driver.findElement(By.xpath("//*[@class='lenderHeaderContainer__2WJ-j']")).click();
	    	
	        driver.findElement(By.xpath("//*[@id='1001181']")).click();
	        driver.findElement(By.xpath("//[@id='submitButton']")).click();
	
	
	}
	

}
