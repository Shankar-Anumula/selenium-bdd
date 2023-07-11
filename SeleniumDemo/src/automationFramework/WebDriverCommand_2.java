package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand_2 {

	public static void main(String[] args) {

		String driverExecutablePath = "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/browser-windows";
		
		driver.get(url);
		
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		
		newWindow.click();
		
		//driver.close(); //closes only current focused window
		driver.quit(); //closes all the windows

		
	}

}
