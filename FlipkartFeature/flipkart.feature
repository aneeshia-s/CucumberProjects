Feature: Flipkart add to cart

Scenario: Successful adding to cart in Flipkart
	Given User is on Flipcart Home Page
	When User Navigate to Login Page
	And User enter UserName and Password
	And User search the item
	And User select the item
	Then Message displayed item is added to cart successfully