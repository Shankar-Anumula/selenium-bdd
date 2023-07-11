import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementXpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/* XPATH
		
		//tagName[@attributeName='attributeValue']
		//*[@attributeName='attributeValue']
		
		
		*/
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']"));
		driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		driver.findElement(By.xpath("//input[@id='Login']"));
		
		

	}

}
