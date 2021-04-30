Feature: Login Action

Scenario: Successful login with valid credentials
	Given User is on Home Page
	When User Navigate to Login Page
	And User enter UserName and Password
	Then Message displayed Login Successfully