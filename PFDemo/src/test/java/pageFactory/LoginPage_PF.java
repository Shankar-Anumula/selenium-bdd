package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	WebDriver driver = null;
	
	public LoginPage_PF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public void enterUserName(String username) {
		txtUserName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
		
	}
	
	public void login(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLoginButton();
	}
	

}
