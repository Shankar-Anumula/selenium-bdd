package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id = "name")
	private WebElement txt_username;
	
	@FindBy(id = "password")
	private WebElement txt_password;
	
	@FindBy(id = "login")
	private WebElement btn_login;
	
	@FindBy(id = "logout")
	private WebElement btn_logout;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPasword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btn_login.click();
	}
	
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}

}
