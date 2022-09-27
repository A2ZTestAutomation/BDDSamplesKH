@PhaseOne
Feature: Contact Management

Background: User Login
 Given User is logged in

@SmokeTest
Scenario: Create new contact
When User create a new contact

@RegressionTest
Scenario: Update existing contact
	When User update a contact


Scenario: View contact details
	When User view the contact details

@RegressionTest
Scenario: Delete contact
	When User delete a contact


