package selinium1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Googelassinment {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();*/
		
	    WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.pantene.in/en-in/");
		/*driver.manage().window().maximize();
		 WebElement Search = driver.findElement(By.xpath("//*[@name='q']"));
		 Search.sendKeys("cowin");*/
		List<WebElement> allimage = driver.findElements(By.tagName("img"));
		
		int count =1;
		for(WebElement image:allimage)
		{
		
			String src=image.getAttribute("src");
			System.out.println(allimage.size());
			//String src1=
			URL imageUrl=new URL(src);
			
			BufferedImage saveImage =ImageIO.read(imageUrl);
			//ImageIO.write(saveImage,"jpg",new File (count+"jpg"));
			ImageIO.write(saveImage,"jpg",new File(count+"jpg"));
			count++;
			
			
			
		}

		
		
		
	/*for( WebElement cowin:covidinform)
		{
			String c1 = cowin.getText();
			System.out.println(c1);
			//driver.findElement(By.xpath("//ul[@class='erkvQe']//li[@class='sbct'][1]")).click();
			driver.findElement(By.xpath("//ul[@class='erkvQe']//li[@class='sbct'][1]")).click();


	if(c1.equalsIgnoreCase("cowin app"));
	
	          {
				cowin.click();	
			}
	    //System.out.println();

		}
	
	*/
	}
	
}
