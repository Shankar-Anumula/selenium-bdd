package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside Step - browser is open");
	    
	    String projectPath = System.getProperty("user.dir");
	    
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("Inside Step - user is on google search page");
	    
	    driver.navigate().to("https://google.com");

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    System.out.println("Inside Step - user enters text in search box");
	    
	    driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

	    	

	}

	@When("user hits enter")
	public void user_hits_enter() throws InterruptedException {
	    System.out.println("Inside Step - user hits enter");

	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    System.out.println("Inside Step - user navigated to search results");
	    
	    driver.getPageSource().contains("Online Courses");
	    
	    driver.close();
	    driver.quit();
	    

	}


}
