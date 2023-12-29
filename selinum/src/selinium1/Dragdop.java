package selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class Dragdop {
	public static void main(String[] args) {
		
     //System.setProperty("webdriver.chrome.driver", "
	  //  ChromeDriver driver =new ChromeDriver();
	    
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\dd\\chromedriver_win32 (6)\\chromedriver.exe");
	    
		    ChromeDriver driver =new ChromeDriver();

		//  WebDriver driver =new ChromeDriver();
		  
			
	    driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();  

		//driver.switchTo().frame(iframe);
		
		WebElement dragable = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		WebElement droble= driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions act= new Actions(driver);

            act.dragAndDrop(dragable, droble).perform();
            
            driver.switchTo().parentFrame();
           driver.findElement(By.xpath("//*[text()='Slider']")).click();
           
   		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']']"));

		driver.switchTo().frame(iframe);

            
            WebElement iframe1 = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
    		//driver.switchTo().frame(iframe1);

            
            Actions act1=new Actions(driver);
            act1.clickAndHold(iframe1).moveByOffset(500, -200).release().build().perform();
            
            
		
		
		
		
	}
	

}
