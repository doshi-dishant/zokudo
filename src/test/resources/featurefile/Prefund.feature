Feature: Prefund Scenarios 

Scenario: 1.13 - Prefund - Prefund List - Default Client User
	Given user login as GC Default Program user
	When user navigate to Prefund
	And user click on Prefund List
	Then user must able to view Prefund List
	Given user login as GC Distributor user
	When user navigate to Prefund
	And user click on Prefund List
	Then user must able to view Prefund List

Scenario: 1.14 - Prefund - Prefund List Action
	Given user login with Admin user
	Given user navigate to Prefund
	When user click on Prefund List
	Then user must able to view Action button
	And user must be able to see Approve/Reject label on Action Button
	When user click on Action button
	And user enter remarks and do ACCEPT/REJECT
	Then status must be changed as per selection
	
Scenario: 1.15 - Prefund - Prefund List Action - Negative
	Given user login as GC Default Program user
	Given user navigate to Prefund
	When user click on Prefund List
	Then user can not be able to view Action button
	#And user can not be able to see Approve/Reject label on Action Button
