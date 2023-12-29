
package selinium1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.interactions.ClickAction;

	public class Slideriframe  {
		public static void main(String[] args) {
			
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			
		    ChromeDriver driver =new ChromeDriver();
		    
		    driver.get("https://jqueryui.com/slider/");
			//driver.manage().window().maximize();
		    
		    WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

			driver.switchTo().frame(iframe);

	            
	          WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	    	    Actions  act= new Actions(driver);
	            act.clickAndHold(slider).moveByOffset(300,0).moveByOffset(-100, 0).release().build().perform();

	        //  driver.switchTo().frame(iframe1);

	            

			
}
	}