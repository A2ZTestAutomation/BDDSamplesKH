@PhaseOne
Feature: Deals Management

@SmokeTest
Scenario: Create new Deals
Given User is logged in
When User create a new Deals


Scenario: Update existing Deals
Given User is logged in
When User update a Deals

@E2ETest
Scenario: View Deals details
Given User is logged in
When User view the Deals details

Scenario: Delete Deals
Given User is logged in
When User delete a Deals
