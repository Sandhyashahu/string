package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedtestExecution {
	@Test
	public void login() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	
    ChromeDriver driver =new ChromeDriver();
    
    driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();  


    WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
      boolean display = username.isDisplayed();
      System.out.println("displaying return true:"+display);
	    username.sendKeys("Admin");
	  WebElement username1=driver.findElement(By.xpath("//input[@type='password']"));
		   username1.sendKeys("admin123");
		   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  
			driver.findElement(By.xpath("(//*[@id='welcome'])[1]")).click();

			Thread.sleep(2000);


			driver.findElement(By.linkText("Logout")).click();

	}

	@Test(dependsOnMethods = "login")
	public void testCase2()
	{
	System.out.println("Testcase2 ");	
	}

	@Test
    public void Testcase()
    {
    	System.out.println("Testcase2 ");	
    	Assert.fail();

	}
}
