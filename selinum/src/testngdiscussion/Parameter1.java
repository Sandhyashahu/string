package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameter1 {
	
	 WebDriver driver;
	@Test
	public void brwoserselection(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder (2)\\chrome version 98\\chromedriver.exe");
				
		    WebDriver driver = new ChromeDriver();
		    driver.get("google.com")	;
		    }
		    if (browsername.equalsIgnoreCase("firefox"))
		    	
		      {
		    	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\raje\\Desktop\\selenium\\gechodriver_win32\\gecko.Driver.exe");   		      
			       driver=new FirefoxDriver();
				    driver.get("google.com")	;

                  }
             }
}
	
	 
	