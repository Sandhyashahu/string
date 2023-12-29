package utility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescr {

	
	public static void captureScreenShot(WebDriver driver, String filename) throws IOException
	{
		
		TakesScreenshot	scrshot	= (TakesScreenshot)driver;
	
		
	
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	

	File destination = new File(System.getProperty("user.dir")+"\\screenshots\\"+filename+".png");
		//FileHandler.copy(source, destination);
		
	}



	}

