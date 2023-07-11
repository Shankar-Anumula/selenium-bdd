package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public By txtUserName = By.id("email");
	public By txtPassword = By.id("pass");
	public By btnLogin = By.name("login");
	
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void enterUserName(String username) {
		
		driver.findElement(txtUserName).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txtPassword).sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		
		driver.findElement(btnLogin).click();
		
	}
	
	public void login(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLoginButton();
	}
	
	

}
