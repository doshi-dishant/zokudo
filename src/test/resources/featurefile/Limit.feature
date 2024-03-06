Feature: Limit Scenarios 

@Ignore
Scenario: 6.1 - Limit - Set Limits For Wallet And KYC
	Given user login with Admin user
	Given user navigate to Limit
	When user navigate to Set Wallet Limit
	Given user click on edit wallet limit
	Then user must be reached on set wallet limit page
	When user fill updated wallet limits
	And user click on submit button for wallet limit
	Then user can able to see success message for wallet limit
	Given user navigate to Limit
	When user navigate to Set KYC Limit
	Given user click on edit kyc limit
	Then user must be reached on set kyc limit page
	When user fill updated full kyc limits
	And user click on submit button for kyc limit
	Then user can able to see success message for kyc limit
	Given user navigate to Limit
	When user navigate to Set KYC Limit
	Given user click on edit kyc limit
	Then user must be reached on set kyc limit page
	When user fill updated min kyc limits
	And user click on submit button for kyc limit
	Then user can able to see success message for kyc limit
	Given user login as GC Retailer user
	Given user navigate to Customer
	When user click on Add Customer 
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user login as GPR Retailer user
	Given user navigate to Customer
	When user click on Add Customer 
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user login as GC1 Retailer user
	Given user navigate to Customer
	When user click on Add Customer 
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record