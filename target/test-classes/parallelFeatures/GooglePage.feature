Feature: Google Page Search
This feature is to do various search actions in Google page

Scenario: Java search
Given User is on Google Home Page
When User search Java Tutorial
Then Should display Java result page
#But Should not include Selenium Java tutorial PDF
#And Should include Java tutorial PDF

Scenario: Selenium search
Given User is on Google Home Page
When User search Selenium Tutorial
Then Should display Selenium result page