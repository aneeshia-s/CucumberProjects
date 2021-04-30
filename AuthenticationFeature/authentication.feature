Feature: User Authentication
Scenario Outline: Login with Valid Credentials
	Given User is on Home page
	When User navigate to login page
	When User Enters Username "<username>" and Password "<password>"
	Then Message displayed login successfully
	But Error message displayed
	
Examples:

|username|password|
|mngr319998|UjazAvE|
|mngr31999|UjazAvE|
|mngr319998|UjazAv|
|mngr31999|UjazAv|