package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		
		String driverExecutablePath = "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com";
		
		driver.get(url);
		
		WebElement registrationLink = driver.findElement(By.xpath(".//*[@id='menu-item-374']/a"));
		
		registrationLink.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(url);
		driver.navigate().refresh();
		
		driver.close();
		
		
	}

}
