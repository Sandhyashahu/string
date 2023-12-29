package selinium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
  
}
	
}	