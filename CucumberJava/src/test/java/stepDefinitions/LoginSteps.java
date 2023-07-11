package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	/*WebDriver driver = null;
	

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
		
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("clicks on login button")
	public void clickonLoginButton() throws InterruptedException {
		System.out.println("user clicks on login button");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
	}

	@Then("user is navigated to the homepage")
	public void navigateToHomePage() {
		System.out.println("user is navigated to homepage");
		
		if(driver.findElement(By.id("logout")).isDisplayed()) {
			
			driver.findElement(By.id("logout")).click();

		}
		
		driver.close();
		
	}
*/
}
