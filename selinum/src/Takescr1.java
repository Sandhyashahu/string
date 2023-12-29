

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescr1 {

	
	public static void captureScreenShot(WebDriver driver, String filename) throws IOException
	{
		
		TakesScreenshot	scrshot	= (TakesScreenshot)driver;
	
		
	
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	

	File destination = new File("C:\\Users\\raje\\eclipse-workspace\\selinum\\ss2"+filename+".png");
		
	org.openqa.selenium.io.FileHandler.copy(source, destination);
		
	}



	}

