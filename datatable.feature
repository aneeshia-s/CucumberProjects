Feature: Login Functionality
Scenario: Successful login with valid credentials
	Given User is on home page
	When User Navigate to login page
	And User enter credentials to login
	|mngr319998|UjazAvE|
	Then Message displayed login successfully
	