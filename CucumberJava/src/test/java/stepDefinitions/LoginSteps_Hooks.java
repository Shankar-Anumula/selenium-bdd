package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage_PF;

public class LoginSteps_Hooks {

	/*
	WebDriver driver;
	LoginPage_PF login;
	
	@Before(order=0)
	public void browserSetup() {
		
		System.out.println("Inside Before Scenario Hook");
		
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	   
	}
	
	@SuppressWarnings("deprecation")
	@Before(order=1)
	public void browserSetup2() {
		
		System.out.println("Inside Before Scenario Hook2");

	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.manage().window().maximize();
	    
	}
	

	@Given("user is on login page")
	public void openLoginPage() {		
		driver.navigate().to("https://example.testproject.io/web/");
		
	}
	
	@When("^user enters (.*) and (.*)$")
	public void inputUserDetails(String username, String password) {
				
	    login = new LoginPage_PF(driver);
	    login.enterUserName(username);
	    login.enterPasword(password);

	}

	@And("clicks on login button")
	public void clickonLoginButton() throws InterruptedException {		
	    login.clickOnLogin();		
		Thread.sleep(3000);
		
	}

	@Then("user is navigated to the homepage")
	public void navigateToHomePage() {
		login.checkLogoutIsDisplayed();		
	}
	
	@After
	public void tearDown() {
		
		System.out.println("Inside After Scenario Hook");

		driver.close();
		driver.quit();
	}
	
	//@BeforeStep
	public void beforeSteps() {
		
		System.out.println("Inside Before Step Hook");
	}
	
	
	//@AfterStep
	public void afterSteps() {
		
		System.out.println("Inside After Step Hook");

	}
*/
}
