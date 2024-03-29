package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private By txt_username = By.id("name");
	private By txt_passwor = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");
	
	protected WebDriver driver = null;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			
			throw new IllegalStateException("This is not Login Page, The current page is :"+driver.getTitle());			
		}
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_passwor).sendKeys(password);
	}
	
	public void clickOnLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void login(String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_passwor).sendKeys(password);
		driver.findElement(btn_login).click();
		
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
		
	}
	
	
	

}
