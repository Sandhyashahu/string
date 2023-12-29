package utility;

import java.io.File;
import java.io.IOException;

import utility.Takescreenshoot ;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

public class Takescreenshoot {
	
	
		public static void caputre(WebDriver driver,String filename)throws IOException
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
         ChromeDriver driver2=new ChromeDriver();

             driver.get("https://www.google.com/");
		 TakesScreenshot scren = (TakesScreenshot)driver;
         File source = scren.getScreenshotAs(OutputType.FILE);
        File distination=new File ("C:\\Users\\raje\\Desktop\\tk\\img.` png");
        FileHandler.copy(source, distination);
         

		
		
	}

}
