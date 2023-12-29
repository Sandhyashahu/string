package selinium1;


import org.apache.batik.bridge.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iviewlogic {
	
	
	public static void main (String [] args) throws InterruptedException
	{
		
	 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Downloads\\chrome-win32 (3).exe");

		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		//driver.get("https://www.flipkart.com/travel/flights?param=FKHPtravelHPWBOOKNOW35OFFGOFIRST3&otracker=hp_bannerads_1_2.bannerAdCard.BANNERADS_dt%2Bint_ZCS1HOZIHQPC");
		//driver.findElementById("id=user-name").sendKeys("standard_user");
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); 
		
         //***first scenario user name and password correct*******
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElement(By.id( "login-button")).click();

		
		 //***second scenario user name correct but  password wrong*******
		//driver.findElement(By.id("user-name")).sendKeys("problem_user");
		//driver.findElementById("password").sendKeys("secret_");
		//driver.findElement(By.id( "login-button")).click();

		
	/*	//***Third scenario user name wrong and password correct*******
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElementById("password").sendKeys("secret_");
		driver.findElement(By.id( "login-button")).click();
		
		//***Forth  scenario user name and password incorrect*******
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElementById("password").sendKeys("secret_");
		driver.findElement(By.id( "login-button")).click();


		//***Forth  scenario user name and password correct but login button not work*******
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElement(By.id("-button")).click();

*/

		//driver.get("https://demoqa.com/automation-practice-form");
		//driver.findElement(By.id("firstName")).sendKeys("sandhya");
		//driver.findElement(By.id("lastName")).sendKeys("jadhav");
		//driver.findElement(By.id("userEmail")).sendKeys("sandhyajadhav145@gmail.com");
		//driver.findElement(By.id("userNumber")).sendKeys("9527239545");
		//driver.findElement(By.id("currentAddress")).sendKeys("A/p =shelgaon");
		//driver.findElement(By.id("custom-control-label")).click();
        //driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
        //driver.findElement(By.xpath("//*[@id='hobbies-checkbox-1']")).click();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(2000,1000)");
		//Thread.sleep(2000);
		
		//js.executeScript("window.scrollBy(-800,-400)");

		





		
		
}

}