package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverExecutablePath = "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.demoqa.com";
		
		driver.get(url);
		
		String title = driver.getTitle();
		int titleLength = title.length();
		
		System.out.println("Title of the page is : "+title);
		System.out.println("Length of the title is : "+titleLength);
		
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals(url)) {
			System.out.println("Verification successful : Correct URL opened");
		}
		else {
			System.out.println("Verification failed : Incorrect URL opened ");
		
			System.out.println("Actual URL is : " + actualUrl); 
			System.out.println("Expected URL is : " + url);
		}
		
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		
		System.out.println("Length of the pageSource is : "+pageSourceLength);

		//driver.close();
		driver.quit();

	}

}
