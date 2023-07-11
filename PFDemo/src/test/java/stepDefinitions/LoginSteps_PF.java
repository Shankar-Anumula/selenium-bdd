package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage_PF;

public class LoginSteps_PF {
	
	WebDriver driver = null;
	
	
	@When("Browser is Open")
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Then("Login to Facebook")
	public void login() {
		
		LoginPage_PF login = new LoginPage_PF(driver);
		login.login("name", "password");
		
	}
	
	@Then("Close the browser")
	public void closeBrowser() {
		driver.quit();
		
	}

}
