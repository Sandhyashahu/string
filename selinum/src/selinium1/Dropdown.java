package selinium1;

import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (14)\\chromedriver.exe");

	    ChromeDriver driver =new ChromeDriver();

		//driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
      driver.get("https://en-gb.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C231327397082%7Ce%7Cfacebook%20english%7C&placement&creative=231327397082&keyword=facebook%20english&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006255091%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302991057522%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIwqOr_vL_8QIViTArCh1Jwgo3EAAYASAAEgJp6vD_BwE"); 
      	driver.get(	"https://omajya.blogspot.com");
      	
      	WebElement day1 = driver.findElement(By.xpath("//*[@id='day']"));
		Select sel =new Select(day1);
		sel.selectByVisibleText("6");
		
		//WebElement day1 = driver.findElement(By.xpath("//*[@id='day']"));
		//Select sel =new Select(day1);
		//ssel.selectByVisibleText("6");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selmonth =new Select(month);
		
		selmonth.selectByValue("4");
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select selyear= new Select(year);
		selyear.selectByIndex(29);
	 driver.findElement(By.xpath("//input[@value='-1']")).click();

		
		//*[@id="u_0_o_H+"]/span[1]/label
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
