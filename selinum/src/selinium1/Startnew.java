package selinium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Startnew {
	
	
	public static void main (String [] argStrings) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium2\\chromedriver_win32 (7)\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium2\\chromedriver_win32 (7)\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver"," C:\\Users\\raje\\Desktop\\selenium2\\chromedriver_win32 (7)\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	
}
}