package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Loginpage {
	
	

		WebDriver driver;
			
		
		By text_username_login=By.id("user-name");
		By text_password_login=By.id("password");
		By btn_login=By.id("login-button");
		By btn_menu=By.id("react-burger-menu-btn");
		By btn_logout=By.id("logout_sidebar_link");
		
		public Loginpage(WebDriver driver) {
			
			this.driver=driver;
		}
		
		public void enterUsername(String username) {
			
			driver.findElement(text_username_login).sendKeys(username);
		}
		
		public void enterPassword(String password) {
			
			driver.findElement(text_password_login).sendKeys(password);
		}
		
		public void clickLoginButton() {
			
			driver.findElement(btn_login).click();
		}
		
		public void clickMenuButton() {
			
			driver.findElement(btn_menu).click();
		}
		
		public void clickLogoutButton() {
			
			driver.findElement(btn_logout).click();
		}

}
