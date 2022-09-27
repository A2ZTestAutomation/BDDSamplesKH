package stepDefNoImpl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GooglePageStepDef {
	WebDriver driver;
//	@Given("User is on Google Home Page")
//	public void user_is_on_google_home_page1() {
//		System.out.println("User is on Google Home Page");
//	}
	@Given("^User is on Google (.*?) Page")
	public void user_is_on_google_home_page2(String str) {
		System.out.println("User is on Google Home Page");
	}
//	@When("User search Java Tutorial")
//	public void user_search_java_tutorial() {
//	  System.out.println("User search Java Tutorial");
//	 
//	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		
	   System.out.println("Should display Java result page");
	}
	@When("User search {string} Tutorial")
	public void user_search_selenium_tutorial(String strSearchTxt) {
		
		System.out.println("User search Selenium Tutorial");
	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
		
		System.out.println("Should display Selenium result page");
	}
}
