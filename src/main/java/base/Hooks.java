
package base;
 
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Hooks extends BaseClass {
	
 
	@Before
	 public static void mysetup() {
		
		 	
			String browserName= prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
		//	WebDriverManager.chromedriver().setup();
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			/*options.addArguments("--disable-gpu");
			options.addArguments("--disable-extensions");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--headless");
			options.addArguments("--window-size=1580,1280");*/
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			}
			else if(browserName.equals("firefox"))
			{
			//	WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options= new FirefoxOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--incognito");
				driver = new FirefoxDriver(options);
			}
			else if (browserName.equals("edge"))
			{
				//	WebDriverManager.edgedriver().setup(); //Code commented.
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--incognito");
				driver = new EdgeDriver(options);
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			}
 
	
	@After
	public void tearDown(Scenario s) {
	        if (s.isFailed()) {
	            if (driver instanceof TakesScreenshot) {
	                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	                s.attach(screenshot, "image/png", "Failure Test Case Screenshot");
	            }
	        }
	      //  driver.quit();
	  	}		
}
 