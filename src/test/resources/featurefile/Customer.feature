Feature: Customer Scenarios 
	
Scenario: 1.8 - Customer - Add Customer
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
	
@Ignore
Scenario: 1.9 - Customer - Field KYC Type 
	Given user navigate to Customer
	When user click on List Customer 
	Then user must be able to see field KYC Type
	And Field should show Full-KYC and MIN-KYC only
	And user must not be able to see Upgrade KYC button
	And user search in customer list and verify result

Scenario: 1.10 - Customer - Upgrade KYC Type 
	Given user login with Admin user
	Given user navigate to Customer in Admin
	When user click on List Customer 
	Then user must be able to see field KYC Type
	And Field should show Full-KYC and MIN-KYC only
	And user must be able to see Upgrade KYC button
	And user search in customer list and verify result
	When user click on Upgrade KYC
	Then status must be changed
	
Scenario: 5.8 - Customer - Add Customer With 3 Char In Firstname And 3 Char In Lastname And With Same Details
	Given user login as GC Retailer user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer With 3 Char In Firstname And 3 Char In Lastname
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer duplicate details error message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer positive
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can able to find searched customer
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record

Scenario: 5.9 - Customer - Add Customer With 2 Char In Firstname Or In Lastname
	Given user login as GC Retailer user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer With 2 Char In Firstname
	And user click on Add Customer Submit button
	Then user verify first name error message in alert
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer With 2 Char In Lastname
	And user click on Add Customer Submit button
	Then user verify last name error message in alert
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	
Scenario: 5.10 - Customer - Add Customer Using File Upload With 2 Char In Firstname Or In Lastname
	Given user login as GC Retailer user
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer with 2 char in first name or in lastname
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can not able to find searched customer
	And user can able to see failure reason if failed
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	
Scenario: 5.12 - Customer - Add 101 Customers With Same Firstname Using File Upload
	Given user login as GC Retailer user
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for 101 customers
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can able to find searched customer
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer 101 firstname exits error message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer same details
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can not able to find searched customer
	And user can able to see failure reason if failed
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record
	
Scenario: 5.11 - Customer - Add Customer Using File Upload With Special Char
	Given user login as GC Retailer user
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer with special char
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can not able to find searched customer
	And user can able to see failure reason if failed
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	
Scenario: 5.13 - Customer - Add Customer With 3 Char In Firstname And 3 Char In Lastname And With Same Details For GC1
	Given user login as GC1 Retailer user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer With 3 Char In Firstname And 3 Char In Lastname
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer duplicate details error message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer positive
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can able to find searched customer
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record
	
Scenario: 5.14 - Customer - Add Customer With 2 Char In Firstname Or In Lastname For GC1
	Given user login as GC1 Retailer user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer With 2 Char In Firstname
	And user click on Add Customer Submit button
	Then user verify first name error message in alert
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer With 2 Char In Lastname
	And user click on Add Customer Submit button
	Then user verify last name error message in alert
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	
Scenario: 5.15 - Customer - Add Customer Using File Upload With 2 Char In Firstname Or In Lastname For GC1
	Given user login as GC1 Retailer user
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer with 2 char in first name or in lastname
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can not able to find searched customer
	And user can able to see failure reason if failed
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	
@Ignore
Scenario: 5.16 - Customer - Add Customer Using File Upload With Special Char For GC1
	Given user login as GC1 Retailer user
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer with special char
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can not able to find searched customer
	And user can able to see failure reason if failed
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	
Scenario: 5.17 - Customer - Add 101 Customers With Same Firstname Using File Upload For GC1
	Given user login as GC1 Retailer user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer With 3 Char In Firstname And 3 Char In Lastname
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL 
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer duplicate details error message
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer positive
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can able to find searched customer
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see more than one customer record
	
Scenario: 5.18 - Customer - Add Customer Using File Upload With Number
	Given user login as GC Retailer user
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer with number
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can not able to find searched customer
	And user can able to see failure reason if failed
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record
	Given user login as GC1 Retailer user
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for file upload for customer with number
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Customer Upload Summary
	And user search for uploaded customers
	Then user can be able to see total count is equal to success count and failure count
	Given user navigate to Bulk Operations
	When user click on Bulk Customer Report
	And user search for added customer details
	Then user can not able to find searched customer
	And user can able to see failure reason if failed
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must not able to see added customer record