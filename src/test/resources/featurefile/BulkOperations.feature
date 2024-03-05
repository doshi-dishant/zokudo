Feature: Bulk Operations Scenarios 

@Ignore @failed_confirm
Scenario: 1.19 - Bulk Operations - Positive
	Given user login as GC Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to search assigned kit
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	And Download Card Creation Format
	When user fill required data for file upload positive
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	And user click on Card Upload Summary
	When user search for positive record
	Then user must be see searched record is passed
	
Scenario: 1.20 - Bulk Operations - Negative
	#Given user login as GC Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to search assigned kit for negative
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload negative
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	And user click on Card Upload Summary
	When user search for negative record
	Then user must be see searched record is failed