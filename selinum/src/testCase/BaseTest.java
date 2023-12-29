package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.Loginpage;

public class BaseTest {
	static WebDriver driver;
	 Loginpage lp;

	 @BeforeSuite
		public void initBrowser() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

			driver = new ChromeDriver();

		   driver.manage().window().maximize();
		    driver.get("https://opensource-demo.orangehrmlive.com/");

		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		Thread.sleep(9000);
	
		}
	 @BeforeClass
		public void createObject()
		{
			 lp = new Loginpage(driver);
			// db = new Dashbord(driver);
		}

	 @AfterSuite
	public void tearDown() throws InterruptedException		{
		lp.logout();
          driver.quit();
		}




}
