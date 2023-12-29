package selinium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Methodselect {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raje\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			
		    ChromeDriver driver =new ChromeDriver();
		    
		    driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();  


		    WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		   WebElement username1=driver.findElement(By.xpath("//input[@type='password']"));
		   username1.sendKeys("admin123");
		   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		   driver.findElement(By.xpath("//*[@id='welcome']")).click();
		   Thread.sleep(2000);
		  // driver.findElement(By.xpath("Text().Logout")).click();
		   driver.findElement(By.linkText("Logout")).click();
		   
		   
		  // driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		   //driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_27']")).click();
		   
	
		// WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_41']"));
		
		// boolean ischecked = checkbox.isSelected();
		//System.out.println("before click:"+ischecked);
	
	    //checkbox.click();
	     
		//boolean afterchechk = checkbox.isSelected();
		//System.out.println("after click:"+afterchechk);
		   
		   
		
}
}
 

