package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;


public class loginpage extends BaseClass  {
//	public static WebDriver driver; 


//	public void i_open_the_chrome_browser() throws InterruptedException {
//		
//		setUp();
		
//		WebDriverManager.edgedriver().setup();
//
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--remote-allow-origins=*");
//
//		driver = new EdgeDriver(options);
//		//	driver.get("http://adbc4806fc81c4f3a980a0aedb189b77-2042542790.us-east-1.elb.amazonaws.com/#/");
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		Thread.sleep(600);

//}




//	public void enter_username() throws InterruptedException {

		//driver.findElement(By.xpath("/html/body/app-root/body/app-sign-in/div/form/div/div/div[2]/div/div[1]/div/input")).sendKeys("alok@gmail.com");
//		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username"));
//

 
public void Click_on_logo_Button() throws InterruptedException {
	
	Thread.sleep(900);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/header/div[1]/div[1]/a/picture/img")).click();
	
}

public void Enter_Shoes_for_Men_in_search_field() throws InterruptedException{
	Thread.sleep(8000);
 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/header/div[1]/div[2]/form/div/div/input")).sendKeys("Shoes for Men");	

}
public void Click_on_enter_button() {
//	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/header/div[1]/div[2]/form/div/div/input"));
	
	WebElement textbox = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/header/div[1]/div[2]/form/div/div/input")); 
	textbox. sendKeys(Keys. RETURN);
}
public void Click_on_page_2() throws InterruptedException {
	
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[12]/div/div/nav/a[2]")).click();	 
    Thread.sleep(10000);
}



}

