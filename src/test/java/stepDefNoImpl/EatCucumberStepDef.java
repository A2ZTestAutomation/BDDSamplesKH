package stepDefNoImpl;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatCucumberStepDef {
	

	@Given("there are {int} cucumbers")
	public void there_are_cucumbers(Integer int1) {
	   System.out.println("There are ..." + int1 + " cucumbers");
	}
	@When("I eat {int} cucumbers")
	public void i_eat_cucumbers(Integer int1) {
	   System.out.println("I eat "+ int1 + " cucumbers");
	}
	
	@Then("I should have {double} cucumber")
	public void i_should_have_cucumber(Double double1) {

	}

	//optional Capture
	@Then("^I (should|should not) have \"([\\w\\s]+)\" cucumber")
	public void i_should_have_cucumber(String key, String strQty) {
	   System.out.println("key......"+ key +"      strQty......"+strQty);
	}
	
//	@Then("I should not have {string} cucumber")
//	public void i_should_not_have_cucumber(String strQty) {
//		 System.out.println("strQty......"+strQty);
//	}

}
