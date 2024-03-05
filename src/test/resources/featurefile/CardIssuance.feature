Feature: Card Issuance Scenarios

Scenario: 3.4 - Card Issuance - Retailer User - GC Program Card Issued Using Bulk Upload To Customer Uploaded By Bulk Upload - Positive
	Given user login as GC Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Kit No is assigned for Card Issue
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
	Then user must be able to fetch min kyc customer hash id
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details

Scenario: 3.5 - Card Issuance - Retailer User - GC Program Card Issued To Already Registered Customer - Positive
	Given user login as GC Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card List
	Then user can able to fetch existing active customer details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance success message
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details

Scenario: 3.12 - Card Issuance - Default User - GC Default Program Card Issued Using Bulk Upload To Customer Uploaded By Bulk Upload - Positive
	Given user login as GC Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GC Kit No is assigned for Card Issue
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
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Card
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	And update Kit Status to Card Issued

Scenario: 3.13 - Card Issuance - Default User - GC Default Program Card Issued To Already Registered Customer - Positive
	Given user login as GC Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GC Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card List
	Then user can able to fetch existing active customer details
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance success message
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details

Scenario: 3.19 - Card Issuance - Default GPR Program User - GPR Default Program Card Registered Customer - Positive
	Given user login as GPR Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GPR Kit No is assigned for Card Issue
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user login with Admin user
	Given user navigate to Customer in Admin
	When user click on List Customer
	Then user must be able to see field KYC Type
	When user click on Upgrade KYC
	Then status must be changed
	Given user login as GPR Default Program user
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance success message
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details

Scenario: 3.20 - Card Issuance - Default User - Default GPR Program Card Issued To Min KYC Registered Customer - Positive
	Given user login as GPR Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GPR Kit No is assigned for Card Issue
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user can able to fetch existing active Min KYC customer details
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch min kyc customer hash id
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record is failed
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find failure reason for bulk card upload

Scenario: 4.3 - Card Issuance - Default User - GC1 Default Program Card Issued To Customer - Positive
	Given user login as GC1 Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GC1 Kit No is assigned for Card Issue
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance success message
	And update Kit Status to Card Issued
	Given user navigate to Card
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is activated

Scenario: 4.4 - Card Issuance - Default User - GC1 Default Program Card Issued Using Bulk Upload To Customer Uploaded By Bulk Upload - Positive
	Given user login as GC1 Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GC1 Kit No is assigned for Card Issue
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
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Card
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	And update Kit Status to Card Issued

Scenario: 4.5 - Card Issuance - Default User - GC1 Default Program Card Issued To Already Registered Customer - Positive
	Given user login as GC1 Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GC1 Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card List
	Then user can able to fetch existing active customer details
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance success message
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details

Scenario: 4.12 - Card Issuance - Retailer User - GC1 Program Card Issued To Customer - Positive
	Given user login as GC1 Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for Card Issue
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance success message
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is activated

Scenario: 4.13 - Card Issuance - Retailer User - GC1 Program Card Issued Using Bulk Upload To Customer Uploaded By Bulk Upload - Positive
	Given user login as GC1 Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for Card Issue
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
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Card
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user fill required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	And update Kit Status to Card Issued

Scenario: 4.14 - Card Issuance - Retailer User - GC1 Program Card Issued To Already Registered Customer - Positive
	Given user login as GC1 Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card List
	Then user can able to fetch existing active customer details
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance success message
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details

Scenario: 4.15 - Card Issuance - Retailer User - GPR Program Card Issued To Already Having One Card Issued Customer - Positive
	Given user login as GPR Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GPR Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card List
	Then user can able to fetch existing active customer details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance multiple GPR cards not allowed message
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user not be able to see searched card details

Scenario: 4.16 - Card Issuance - Default User - GPR Default Program Card Issued To Already Having One Card Issued Customer - Positive
	Given user login as GPR Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GPR Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card List
	Then user can able to fetch existing active customer details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to fetch assigned kit details
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance multiple GPR cards not allowed message
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user not be able to see searched card details

Scenario: 4.17 - Card Issuance - Default User - Default GC Program More Than 6 Cards Issue To One Customer - Positive
	Given user login as GC Default Program user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch Default GC Client1 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user login as GC Default Program user1
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch Default GC Client2 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GC Client2 Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance maximum card limit exceeded message
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user not be able to see searched card details

Scenario: 4.18 - Card Issuance - Default User - Default GC1 Program More Than 6 Cards Issue To One Customer - Positive
	Given user login as GC1 Default Program user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch Default GC1 Client1 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user login as GC1 Default Program user1
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch Default GC1 Client2 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Default GC1 Client2 Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance maximum card limit exceeded message
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user not be able to see searched card details

Scenario: 4.19 - Card Issuance - Retailer User - GC Program More Than 6 Cards Issue To One Customer - Positive
	Given user login as GC Retailer user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch GC Client1 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user login as GC Retailer user1
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch GC Client2 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC Client2 Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance maximum card limit exceeded message
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user not be able to see searched card details

Scenario: 4.20 - Card Issuance - Retailer User - GC1 Program More Than 6 Cards Issue To One Customer - Positive
	Given user login as GC1 Retailer user
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch GC1 Client1 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user login as GC1 Retailer user1
	Given user navigate to Customer
	When user click on Add Customer
	Then user must reached to Add Customer page validate by URL
	When user enter required data for Add Customer with same details
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	And user click on Ok button
	Given user navigate to Customer
	When user click on List Customer
	Then user must be able to fetch customer hash id for GC Program
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user fetch GC1 Client2 Kit Nos for Card Issue
	Given user navigate to Bulk Operations
	When user click on Bulk Upload
	Then user must reached to Bulk Upload page validate by URL
	When user enter required data for bulk card creation upload
	And user click on Bulk Upload submit button
	Then user must be see success message
	Given user navigate to Bulk Operations
	When user click on Card Upload Summary
	And user search for card details in card upload summary
	Then user must be see searched card record
	Given user navigate to Bulk Operations
	And user click on Bulk Card Report
	When user search for card details in bulk card report
	Then user can able to find card result and failure reason if bulk upload failed
	And update Kit Status to Card Issued
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user must be able to see searched card details
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Client2 Kit No is assigned for Card Issue
	Given user navigate to Card
	When user click on Card Issuance
	Then user must reached to Card Issuance page validate by URL
	When user fill required data for Card Issuance
	And user click on Card Issuance submit button
	Then user must be see Card Issuance maximum card limit exceeded message
	Given user navigate to Card
	When user click on Card List
	And user search for customer details
	Then user not be able to see searched card details