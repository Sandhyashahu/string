package stefDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;

public class Login {
	
	
	WebDriver driver = null;
	Loginpage login;
	
	@Given("^User on login page$")
	public void user_on_login_page_for_india() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\software\\chromedriver_win32 (12)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	
	}
	@When("^User enter (.) and (.)$")
	public void user_enter_username_and_password_for_india(String username, String password) {
		
		login = new Loginpage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}
	
	@And("^User click on login button$")
	public void user_click_on_india_login_button() {
		
		login.clickLoginButton();
	}

	@Then("^User logout home page$")
	public void user_navigate_to_india_home_page() {
		
		login.clickMenuButton();
		login.clickLogoutButton();
		driver.close();
	}


}
