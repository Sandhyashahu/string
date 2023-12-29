import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class testCase {
	
	
	public static void main(String [] args)
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver_win32 (15)\\chromedriver.exe");
    ChromeDriver xyz =new ChromeDriver();

    xyz.get("https://www.google.com/");
   List<WebElement> count1 = xyz.findElements(By.tagName("a"));
   System.out.println(count1.size());
   
	/*
	 * for(int i=0;i<count1.size();i++) { String abc=count1.get(i).getText();
	 * System.out.println(abc); }
	 */

}
}