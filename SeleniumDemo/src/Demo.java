import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configure Driver Path for various browser drivers
		//System.setProperty("webdriver.gecko.driver", "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\All_WorkSpace\\Work\\Eclipse\\browser drivers\\IEDriverServer.exe");

		//Create WebDriver instance
			//-> Interface which can be instantiated with any of the drivercalss
		
		//WebDriver ffdriver = new FirefoxDriver();		
		WebDriver driver = new ChromeDriver();		
		//WebDriver iedriver = new InternetExplorerDriver();		

		
		//Navigate to 
		//ffdriver.get("http://google.com");
		//ffdriver.close();
		//iedriver.get("http://google.com");
		//iedriver.close();
		
		driver.get("http://google.com");
		System.out.println("Current URL is:"+driver.getCurrentUrl());
		//System.out.println("Current PageSource is:"+driver.getPageSource());
		System.out.println("Current Class is:"+driver.getClass());
		System.out.println("Current Page Title is:"+driver.getTitle());
		
		
		//Maximize the browser window
		driver.manage().window().maximize();

		//navigate to new page		
		driver.navigate().to("http://yahoo.com");

		//navigate backwards in browser
		driver.navigate().back(); //bug - not working in chrome

		//navigate forward
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		driver.close(); //closes only current open/focused window
		driver.quit(); //closes all windows including child windows

	}

}
