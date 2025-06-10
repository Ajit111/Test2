package StepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Page.loginpage;
import base.BaseClass;
import base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login extends BaseClass {
	
	
 loginpage L =new loginpage();
 
 public static WebDriver driver; 
 
 @Given("Click on logo Button")
 public void Click_on_logo_Button() throws InterruptedException {

L.Click_on_logo_Button();
	 
 }
  
 @Then ("Enter Shoes for Men in search field")
 public void Enter_Shoes_for_Men_in_search_field() throws InterruptedException {
	L.Enter_Shoes_for_Men_in_search_field();
 }

 @Then ("Click on enter button")
 public void Click_on_enter_button() {
	 L.Click_on_enter_button();
	 
 }
 @Then ("Click on page 2")
 public void Click_on_page_2() throws InterruptedException {
	L.Click_on_page_2(); 
	 }
 
}



 
 
 