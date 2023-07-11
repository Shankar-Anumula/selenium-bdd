package functionDefinitions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Reusabables {
	
	
	public void waitUntilVisible(WebDriver driver, WebElement element, String elementName) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element))
		;

		
	}
	
	
public void fluentWait(WebDriver driver, WebElement element, String elementName) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.pollingEvery(Duration.ofSeconds(10))
				.withTimeout(Duration.ofSeconds(300))
				.ignoring(ElementNotVisibleException.class);
		
		WebElement element2 = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.xpath("//name"));
			}
		});

	}
	
	public void selectElement(WebDriver driver, WebElement element, String elementName) {
		
		Select options = new Select(element);
		options.selectByIndex(1);
		

		
	}
	
	public void moveElement(WebDriver driver, WebElement element, String elementName) {
		
		Actions action = new Actions(driver);
		action.moveToElement(element);

		
	}
	
	
	

}
