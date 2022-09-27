package stepDefNoImpl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MovieTicketStepDef {
	
	@Given("There are {int} tickets")
	public void there_are_tickets(Integer int1) {
	  
	}
//	@When("I sit in 1st row")
//	public void i_sit_in_1st_row() {
//	   
//	}
//	@When("She sit in 4th row")
//	public void she_sit_in_4th_row() {
//	    
//	}
//	@When("He sit in 2nd row")
//	public void he_sit_in_2nd_row() {
//	    
//	}
	
	@When("^(?:I|She|He) sit in ([0-9]+)(?:st|th|nd) row")
	public void he_sit_in_2nd_row(int rowNum) {
	    System.out.println("Row Number ...."+rowNum);
	}


}
