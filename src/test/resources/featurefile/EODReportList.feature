Feature: EOD Report List Scenarios 

Scenario: 1.7 - EOD Report List - Report List
	Given user login with Admin user
	Given user navigate to EOD Report List
	When user click on Report List
	Then user verify Created At date sequence
	When user click on Server Path
	Then user must be see downloaded  report
