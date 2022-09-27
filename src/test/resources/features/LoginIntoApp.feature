Feature: Login into Application

 
#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Home Page

#Examples:

# 	| username | password |
#	| tomsmith | SuperSecretPassword! |
# 	| testuser1 | welcome1 |
# 	| testuser2 | welcome2 |
 
 
Scenario: Valid Login
Given User is on Login Page
When User enters login credential
	| username | password |
	| tomsmith | SuperSecretPassword! |
	| testuser1 | welcome1 |
	| testuser2 | welcome2 |
 
Then Should display Home Page
 
 