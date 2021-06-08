Feature: To Automate End2End Tests
 
Description: The purpose of this features is automate end to end scenario.


Scenario: Customer is placing an order
	Given User hits the URL 
	When User inputs username
	And User input Password
	And User click on login button
	Then User lands on Home page

