Feature: Login function validation 

Scenario: Successful Login with Valid Credentials 

	Given User able to open any browser 
	And  Put URL and go to login page 
		|http://automationpractice.com/index.php?|
	When User able to click my account 
	And User able to use valid userName 
		|masalkale@gmail.com|
	And User able to put valid password 
		|12345|
	And User able to click submit button 
	Then User able to validate Login status 
	And close the browser 
	