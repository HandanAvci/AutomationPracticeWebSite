Feature: Login validation 

	Description :requirement 

#Background: 

Scenario: Successfully login with valid credential 
	Given User need to open a browser
	And Pass the URL 
	When Click my account 
	And put email 
	And put password 
	And click sign in button 
	Then login will be successful 
	
	

