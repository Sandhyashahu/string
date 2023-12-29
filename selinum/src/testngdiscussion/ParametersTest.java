package testngdiscussion;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
//WebDriver driver;
@Parameters("browser")
	@Test
	public  void brwoserselection(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			
	       WebDriver driver = new ChromeDriver();
	     driver.get("http://goole.com/");
		}
		//@Parameters("browser1")

	      if (browsername.equalsIgnoreCase("firefox"))
	      {
	    	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\raje\\Desktop\\selenium\\gechodriver_win32\\gecko.Driver.exe");
				WebDriver driver = new ChromeDriver();
			     driver.get("https://opensource-demo.orangehrmlive.com/");

		      
	      }
	      
	
	      
	      
		
	}
	
	

}
