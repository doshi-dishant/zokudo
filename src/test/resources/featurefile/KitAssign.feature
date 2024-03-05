Feature: Kit Assign Scenarios 

Scenario: 2.2 - Kit Assign - Admin User - GC Program Kit Assign To Client - Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is unassigned for Single Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for single kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for single assign
	And update Kit Status to Assigned
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for Program
	Then user must be see updated Kit details
	Given user login as GC Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	And user search for Kit No in Assigned Kit
	Then user must be see searched records
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is unassigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Assigned
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for Program
	Then user must be see updated Kit details
	Given user login as GC Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	And user search for Kit No
	Then user must be see searched records

Scenario: 2.13 - Kit Assign - Super Distributor User - GC Program Single Kit Assigned To Distributor - Positive
	Given user login as GC Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check assigned kit no for distributor
	#Given user navigate to Distributor
	#When user navigate to Add Distributor
	#Then user must reached to Add Distributor page validate by URL
	#When user fill required data for Add Distributor
	#And user click on Add Distributor Submit button
	#Then user must be see Add Distributor success message
	#When user navigate to List Distributor
	#Then user must reached to List Distributor page validate by URL
	#When user search for distributor
	#Then user must be able to see searched distributor details
	Given user navigate to Kit Assign
	When user click on Kit Assign Distributor
	Then user must reached to Kit Assign Distributor page validate by URL
	When user fill required data for kit assign to distributor
	And user click on distributor kit assign submit button
	Then user must be see Kit Assign success message for kit assign distributor
	And update Kit Status to Assigned To Distributor
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Kit No is assigned for distributor
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for distributor
	
Scenario: 2.15 - Kit Assign - Distributor User - GC Program Single Kit Assigned To Retailer - Positive
	Given user login as GC Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check assigned kit no for retailer
	#Given user navigate to Retailer
	#When user navigate to Add Retailer
	#Then user must reached to Add Retailer page validate by URL
	#When user fill required data for Add Retailer
	#And user click on Add Retailer Submit button
	#Then user must be see Add Retailer success message
	#When user navigate to List Retailer
	#Then user must reached to List Retailer page validate by URL
	#When user search for retailer
	#Then user must be able to see searched retailer details
	Given user navigate to Kit Assign
	When user click on Kit Assign Retailer
	Then user must reached to Kit Assign Retailer page validate by URL
	When user fill required data for kit assign to retailer
	And user click on retailer kit assign submit button
	Then user must be see Kit Assign success message for kit assign retailer
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Kit No is assigned for retailer
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer

Scenario: 2.14 - Kit Assign - Super Distributor User - GC Program Bulk Kit Assigned To Distributor - Positive
	Given user login as GC Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check assigned kit no for distributor bulk
	#Given user navigate to Distributor
	#When user navigate to Add Distributor
	#Then user must reached to Add Distributor page validate by URL
	#When user fill required data for Add Distributor
	#And user click on Add Distributor Submit button
	#Then user must be see Add Distributor success message
	#When user navigate to List Distributor
	#Then user must reached to List Distributor page validate by URL
	#When user search for distributor
	#Then user must be able to see searched distributor details
	Given user navigate to Kit Assign
	When user click on Kit Assign Distributor
	Then user must reached to Kit Assign Distributor page validate by URL
	When user fill required data for kit assign to distributor bulk
	And user click on distributor kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Assigned To Distributor
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Kit No is assigned for distributor
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for distributor
	Given user login as GC Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for distributor
	
Scenario: 2.16 - Kit Assign - Distributor User - GC Program Bulk Kit Assigned To Retailer - Positive
	Given user login as GC Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to fetch assigned kit no for retailer bulk
	#Given user navigate to Retailer
	#When user navigate to Add Retailer
	#Then user must reached to Add Retailer page validate by URL
	#When user fill required data for Add Retailer
	#And user click on Add Retailer Submit button
	#Then user must be see Add Retailer success message
	#When user navigate to List Retailer
	#Then user must reached to List Retailer page validate by URL
	#When user search for retailer
	#Then user must be able to see searched retailer details
	Given user navigate to Kit Assign
	When user click on Kit Assign Retailer
	Then user must reached to Kit Assign Retailer page validate by URL
	When user fill required data for kit assign to retailer bulk
	And user click on retailer kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of Kit No is assigned for retailer
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer
	Given user login as GC Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer
	
Scenario: 2.8 - Kit Assign - Admin User - Already Assigned Kit Assign To Client - Negative
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign failure message for bulk assign
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to see kit status not changed
	
Scenario: 2.9 - Kit Assign - Admin User - Mix Kit Assign To Client - Negative
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned and unassigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign failure message for bulk assign
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to see kit status not changed
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to see kit status not changed
	
Scenario: 2.10 - Kit Assign - Admin User - Empty Kit Assign To Client - Negative
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for bulk kit assign with empty sheet
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	
Scenario: 2.11 - Kit Assign - Admin User - Invalid Kit Assign To Client - Negative
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for bulk kit assign with Invalid Kit No
	And user click on kit assign submit button
	Then user must be see Kit Assign failure message for bulk assign
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to see kit number is not listed
	
Scenario: 2.12 - Kit Assign - Admin User - Kit Assign To Client With Blank Expiry Date - Negative
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit Number is unassigned for Bulk Kit for blank exp date
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for bulk kit assign with blank expiry date
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must be able to see kit number is not listed

Scenario: 2.19 Kit Assign - Admin User - GPR Program Single Kit Assign To Client - Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No for GPR program is unassigned for Single Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GPR program single kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for single assign
	And update Kit Status to Assigned
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for Program
	Then user must be see updated Kit details
	Given user login as GPR Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	And user search for Kit No in Assigned Kit
	Then user must be see searched records
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of GPR program Kit No is unassigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GPR program bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Assigned
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GPR Program
	Then user must be see updated Kit details
	Given user login as GPR Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	And user search for Kit No
	Then user must be see searched records

Scenario: 2.20 - Kit Assign - Super Distributor User - GPR Program Single Kit Assigned To Distributor - Positive
	Given user login as GPR Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check assigned kit no for GPR program for distributor
	#Given user navigate to Distributor
	#When user navigate to Add Distributor
	#Then user must reached to Add Distributor page validate by URL
	#When user fill required data for Add Distributor
	#And user click on Add Distributor Submit button
	#Then user must be see Add Distributor success message
	#When user navigate to List Distributor
	#Then user must reached to List Distributor page validate by URL
	#When user search for distributor
	#Then user must be able to see searched distributor details
	Given user navigate to Kit Assign
	When user click on Kit Assign Distributor
	Then user must reached to Kit Assign Distributor page validate by URL
	When user fill required data for GPR program kit assign to distributor
	And user click on distributor kit assign submit button
	Then user must be see Kit Assign success message for kit assign distributor
	And update Kit Status to Assigned To Distributor
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GPR Kit No is assigned for distributor
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GPR Kit No is assigned for distributor

Scenario: 3.2 - Kit Assign - Distributor User - GPR Program Single Kit Assigned To Retailer - Positive
	Given user login as GPR Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check GPR assigned kit no for retailer
	Given user navigate to Kit Assign
	When user click on Kit Assign Retailer
	Then user must reached to Kit Assign Retailer page validate by URL
	When user fill required data for GPR kit assign to retailer
	And user click on retailer kit assign submit button
	Then user must be see Kit Assign success message for kit assign retailer
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GPR Kit No is assigned for retailer
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer
	
Scenario: 3.1 - Kit Assign - Super Distributor User - GPR Program Bulk Kit Assigned To Distributor - Positive
	Given user login as GPR Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check GPR assigned kit no for distributor bulk
	Given user navigate to Kit Assign
	When user click on Kit Assign Distributor
	Then user must reached to Kit Assign Distributor page validate by URL
	When user fill required data for GPR kit assign to distributor bulk
	And user click on distributor kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Assigned To Distributor
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GPR Kit No is assigned for distributor
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for distributor
	Given user login as GPR Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for distributor
	
Scenario: 3.3 - Kit Assign - Distributor User - GPR Program Bulk Kit Assigned To Retailer - Positive
	Given user login as GPR Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to fetch assigned GPR kit no for retailer bulk
	Given user navigate to Kit Assign
	When user click on Kit Assign Retailer
	Then user must reached to Kit Assign Retailer page validate by URL
	When user fill required data for GPR kit assign to retailer bulk
	And user click on retailer kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GPR Kit No is assigned for retailer
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer
	Given user login as GPR Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer
	
Scenario: 3.10 - Kit Assign - Admin User - GC Default Program Single Kit Assign To Client - Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No for GC Default program is unassigned for Single Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GC Default program single kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for single assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GC Default Program
	Then user must be see updated Kit details
	Given user login as GC Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of GC Default program Kit No is unassigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GC Default program bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GC Default Program
	Then user must be see updated Kit details
	Given user login as GC Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	
Scenario: 3.15 - Kit Assign - Admin User - GPR Default Program Single Kit Assign To Client - Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No for GPR Default program is unassigned for Single Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GPR Default program single kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for single assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GPR Default Program
	Then user must be see updated Kit details
	Given user login as GPR Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of GPR Default program Kit No is unassigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GPR Default program bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GPR Default Program
	Then user must be see updated Kit details
	Given user login as GPR Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned

Scenario: 4.2 - Kit Assign - Admin User - GC1 Default Program Single Kit Assign To Client - Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No for GC1 Default program is unassigned for Single Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GC1 Default program single kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for single assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GC1 Default Program
	Then user must be see updated Kit details
	Given user login as GC1 Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of GC1 Default program Kit No is unassigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GC1 Default program bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GC1 Default Program
	Then user must be see updated Kit details
	Given user login as GC1 Default Program user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	
Scenario: 4.7 - Kit Assign - Admin User - GC1 Program Single Kit Assign To Client - Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No for GC1 program is unassigned for Single Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GC1 program single kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for single assign
	And update Kit Status to Assigned
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GC1 Program
	Then user must be see updated Kit details
	Given user login as GC1 Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of GC1 program Kit No is unassigned for Bulk Kit
	Given user navigate to Kit Assign
	When user click on Single/Bulk Kit Assign
	Then user must reached to Single/Bulk Kit Assign page validate by URL
	When user fill required data for GC1 program bulk kit assign
	And user click on kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Assigned
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is assigned
	Given user navigate to Card Inventory
	When user navigate to Inventory Summary
	And user search for GC1 Program
	Then user must be see updated Kit details
	Given user login as GC1 Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user must reached to List Assigned Kit page validate by URL
	When user search for Kit No
	Then user must be see result and Kit No status is assigned

Scenario: 4.8 - Kit Assign - Super Distributor User - GC1 Program Single Kit Assigned To Distributor - Positive
	Given user login as GC1 Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check assigned kit no for GC1 program for distributor
	Given user navigate to Kit Assign
	When user click on Kit Assign Distributor
	Then user must reached to Kit Assign Distributor page validate by URL
	When user fill required data for GC1 program kit assign to distributor
	And user click on distributor kit assign submit button
	Then user must be see Kit Assign success message for kit assign distributor
	And update Kit Status to Assigned To Distributor
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for distributor
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for distributor
	
Scenario: 4.10 - Kit Assign - Distributor User - GC1 Program Single Kit Assigned To Retailer - Positive
	Given user login as GC1 Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check GC1 assigned kit no for retailer
	Given user navigate to Kit Assign
	When user click on Kit Assign Retailer
	Then user must reached to Kit Assign Retailer page validate by URL
	When user fill required data for GC1 kit assign to retailer
	And user click on retailer kit assign submit button
	Then user must be see Kit Assign success message for kit assign retailer
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for retailer
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer
	
Scenario: 4.9 - Kit Assign - Super Distributor User - GC1 Program Bulk Kit Assigned To Distributor - Positive
	Given user login as GC1 Super Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check GC1 assigned kit no for distributor bulk
	Given user navigate to Kit Assign
	When user click on Kit Assign Distributor
	Then user must reached to Kit Assign Distributor page validate by URL
	When user fill required data for GC1 kit assign to distributor bulk
	And user click on distributor kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Assigned To Distributor
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for distributor
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for distributor
	
Scenario: 4.11 - Kit Assign - Distributor User - GC1 Program Bulk Kit Assigned To Retailer - Positive
	Given user login as GC1 Distributor user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to fetch assigned GC1 kit no for retailer bulk
	Given user navigate to Kit Assign
	When user click on Kit Assign Retailer
	Then user must reached to Kit Assign Retailer page validate by URL
	When user fill required data for GC1 kit assign to retailer bulk
	And user click on retailer kit assign submit button
	Then user must be see Kit Assign success message for bulk assign
	And update Kit Status to Ready To Card Issuance
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to check status of GC1 Kit No is assigned for retailer
	Given user login with Admin user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer
	Given user login as GC1 Retailer user
	Given user navigate to Kit Assign
	When user click on List Assigned Kit
	Then user can able to verify status of Kit No is assigned for retailer