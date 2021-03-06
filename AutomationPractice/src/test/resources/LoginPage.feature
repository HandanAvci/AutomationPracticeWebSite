Feature: Page features

Scenario: Verify that user can navigate to Login Page 
	Given user opens browser 
	When user launches the url 
	When user clicks on Sign in function 
	And user enters login id 
	And user enters password 
	And user click on sign in button 
	And user verify to page title
	When User click on the dresses 
	And User able to see all the prices for dresses 
	And User click on second dress 
	And User chose pink dresses 
	And User get Medium dresses 
	And User add two dresses to the shopping cart 
	And Dresses should be appear in the results 
	
	Given User able to see shopping cart 
	When User click on checkout 
	And Go to the shopping cart summary page 
	And User check the item in the shopping cart 
	And User verify terms of service 
	Then Two dress should be in the shopping cart 
	
	Given Select the check payment and proceed 
	When Confirm the order 
	Then User sign out 
	
