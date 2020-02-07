@Smoke 
Feature: Automation Practice login feature testing 
	Description: password must be more than 8 characters

#Background:Given open browser/login

@TC001_to_TC007 
Scenario: As a Automation Practice user, i can successfully login with valid credetials 
	Given User need to open a browser 
	And Put Automation Practice shop URL 
	When Click my account 
	And put email 
	And put password 
	And click sign in button 
	Then login will be successful 
