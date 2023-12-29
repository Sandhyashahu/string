




package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;

	@FindBy(xpath = "//input [@name='username']")
	private WebElement username;

	@FindBy(xpath = "//input [@name='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginbutton;
	

     @FindBy(xpath = "(//*[@id='welcome'])[1]")
    private WebElement welcome;

    @FindBy(linkText = "Logout")
     private WebElement logoutlink;   

     
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	

	public void loginToApp() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
	}

	public void logout() throws InterruptedException {
		welcome.click();

		Thread.sleep(2000);

		logoutlink.click();

	}


	
}
 