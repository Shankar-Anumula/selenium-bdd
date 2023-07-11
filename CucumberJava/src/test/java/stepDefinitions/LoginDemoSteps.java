package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps {
	
/*	WebDriver driver = null;
	LoginPage login;
	

	@Given("user is on login page")
	public void openLoginPage() {
		System.out.println("user is on login page");
		
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    
		driver.navigate().to("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

	}
	
	@When("^user enters (.*) and (.*)$")
	public void inputUserDetails(String username, String password) {
		
		System.out.println("user enters username and password");
		
	    login = new LoginPage(driver);
	    login.enterUsername(username);
	    login.enterPassword(password);

	}

	@And("clicks on login button")
	public void clickonLoginButton() throws InterruptedException {
		System.out.println("user clicks on login button");
		
	    login.clickOnLogin();		
		Thread.sleep(3000);
	}

	@Then("user is navigated to the homepage")
	public void navigateToHomePage() {
		System.out.println("user is navigated to homepage");
		
		login.checkLogoutIsDisplayed();
		
		driver.close();
		
	}
	
	*/

}
