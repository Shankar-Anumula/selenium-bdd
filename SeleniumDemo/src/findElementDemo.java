import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		//Find Element by Id
		driver.findElement(By.id("username")).sendKeys("Dummy");
		//driver.findElement(By.id("password")).sendKeys("Sarojana");		
		
		//Find Element by Name
		//driver.findElement(By.name("username")).sendKeys("cool.mate89@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("123456");	
		
		//Find Element by Class Name
		
		//Error - spaces not allowed in class name - compound name not allowed
		//driver.findElement(By.className("button r4 wide primary")).click(); 
		
		//Find Element by Link Text
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		
		
		
	}

}
