package stepDefNoImpl;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {

	@Before(value="@SmokeTest", order=1)
	public void readPropertyForSmokeTest() {
		System.out.println("Read from property file smoke......");
	}
	
	@Before(value="@SmokeTest",order=2)
	public void setupDBForSmokeTest() {
		System.out.println("Setup DB Smoke......");
	}
	@Before(value="@RegressionTest",order=1)
	public void readPropertyForRegTest() {
		System.out.println("Read from property file Reg......");
	}
	
	@Before(value="@RegressionTest", order=2)
	public void setupDBForRegTest() {
		System.out.println("Setup DB Reg......");
	}
	
	
	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");
	}
	
	@When("User create a new contact")
	public void user_create_a_new_contact() {
	   System.out.println("User create a new contact");
	}
	

	@When("User update a contact")
	public void user_update_a_contact() {
	   System.out.println("User update a contact");
	}

	@When("User view the contact details")
	public void user_view_the_contact_details() {
	    System.out.println("User view the contact details");
	}

	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");
	}

	@When("User create a new Deals")
	public void user_create_a_new_deals() {
	   System.out.println("User create a new Deals");
	}

	@When("User update a Deals")
	public void user_update_a_deals() {
	  System.out.println("User update a Deals");
	}
	
	@When("User view the Deals details")
	public void user_view_the_deals_details() {
	   System.out.println("User view the Deals details");
	}
	
	@When("User delete a Deals")
	public void user_delete_a_deals() {
		System.out.println("User delete a Deals");
	}
	
	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User create a new Tasks");
	}

	@When("User update a Tasks")
	public void user_update_a_tasks() {
	   System.out.println("User update a Tasks");
	}
	

	@When("User view the Tasks details")
	public void user_view_the_tasks_details() {
		System.out.println("User view the Tasks details");
	}
	
	@When("User delete a Tasks")
	public void user_delete_a_tasks() {
	   System.out.println("User delete a Tasks");
	}

}