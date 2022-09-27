package stepDefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStepDef {
	
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	  
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.cssSelector(".radius")).click();
//	}
	

//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUser, String strPwd) {
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector(".radius")).click();
//	}
//	
	
	//Using lists
//	@When("User enters login credential")
//	public void user_enters_login_credential(io.cucumber.datatable.DataTable dataTable) {
//		driver.get("http://the-internet.herokuapp.com/login");
//		List<List<String>> userCreds = dataTable.asLists();
//		String strUser = userCreds.get(0).get(0);
//		String strPwd = userCreds.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector(".radius")).click();
//	}
	
	//Using Maps
//	@When("User enters login credential")
//	public void user_enters_login_credential(io.cucumber.datatable.DataTable dataTable) {
//		driver.get("http://the-internet.herokuapp.com/login");
//		List<Map<String, String>> userCreds = dataTable.asMaps();
//		String strUser = userCreds.get(0).get("username");
//		String strPwd = userCreds.get(0).get("password");
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector(".radius")).click();
//	}
	
	//Using list find diff in DataTable content
	@When("User enters login credential")
	public void user_enters_login_credential(DataTable dataTable) {
		driver.get("http://the-internet.herokuapp.com/login");
		List<List<String>> userCreds = dataTable.asLists();
		
		List<List<String>> actual = new ArrayList<List<String>>();
		actual.add(Arrays.asList("username", "password"));
		actual.add(Arrays.asList("tomsmith","SuperSecretPassword!"));
		actual.add(Arrays.asList("testuser1","welcome1"));
		actual.add(Arrays.asList("testuser2","welcome2"));
//		actual.add(Arrays.asList("testuser3","welcome3"));
		
		DataTable apiData = DataTable.create(actual);
		dataTable.diff(apiData);
		
		boolean isSameData = dataTable.equals(apiData);
		Assert.assertTrue(isSameData);
			
//		String strUser = userCreds.get(0).get(0);
//		String strPwd = userCreds.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector(".radius")).click();
}
	

	@Then("Should display Home Page")
	public void should_display_home_page() {
//	 boolean isValidUser = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
//	 Assert.assertTrue(isValidUser);
	 
	}




}
