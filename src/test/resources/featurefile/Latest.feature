Feature: Latest Card Scenarios

  Scenario: 15.5 Card - Default GPR Program - Load Reversal - Card Load Reverse Allowed If The Card Is Paused
    Given user login as GPR Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR second with default pocket second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user login with Admin user
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card second
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client bulk default second
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message bulk
    Given user navigate to Card
    When user click on Load Reversal Report
    And user search for reversal report second

  Scenario: 15.6 Card - Default GPR Program - Load Reversal - Card Load Reverse Allowed If The Card Is Blocked
    Given user login as GPR Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR second with default pocket second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user login with Admin user
    Given user navigate to Card
    Then user click on Card List
    And user can able to block card
    Given user navigate to Card
    Then user click on Card List
    And user can able to block card second
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client bulk default second
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message bulk
    Given user navigate to Card
    When user click on Load Reversal Report
    And user search for reversal report second

Scenario: 15.9 Card - Retailer GPR Program - Load Reversal - Card Load Reverse Is Possible If KITs Are From 2 Different Retailer Under Same Program
    Given user login as GPR Retailer user1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for retailer GPR client2
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login as GPR Retailer user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default pocket second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for retailer GPR client bulk
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message bulk
    Given user navigate to Card
    When user click on Load Reversal Report
    And user search for reversal report
    Given user navigate to Card
    When user click on Load Reversal Report
    And user search for reversal report second

  Scenario: 15.12 Card - Default GC Program - Card Issuance - Fee Management
    Given user login with Admin user
    Given user navigate to Fee Or Revenue Management
    When user navigate to Fee Configuration
    Then user can able to update card issuance fee for default GC
    Given user login as GC Default Program user
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue
    Given user navigate to Customer
    When user click on Add Customer
    Then user must reached to Add Customer page validate by URL
    When user fill required data for Add Customer
    And user click on Add Customer Submit button
    Then user must be see Add Customer success message
    And user click on Ok button
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
    And update Kit Status to Card Issued
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue
    Given user navigate to Card
    When user click on Card List
    And user search for customer details
    Then user must be able to see searched card details
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
    Given user navigate to Card
    When user click on Card List
    And user search for customer details
    Then user must be able to see searched card details
    And update Kit Status to Card Issued

  Scenario: 15.13 Card - Default GC Program - Card Issuance - Fee Management - 0 Fee
    Given user login with Admin user
    Given user navigate to Fee Or Revenue Management
    When user navigate to Fee Configuration
    Then user can able to update card issuance fee for default GC 0 fee
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before card issue
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue
    Given user navigate to Customer
    When user click on Add Customer
    Then user must reached to Add Customer page validate by URL
    When user fill required data for Add Customer
    And user click on Add Customer Submit button
    Then user must be see Add Customer success message
    And user click on Ok button
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after card issue
    And user can verify before balance is equal to after balance
    And update Kit Status to Card Issued
    Then user must be able to view program balance data before card issue
    Given user navigate to Card
    When user click on Card List
    And user search for customer details
    Then user must be able to see searched card details
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue
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
    Given user navigate to Dashboard
    Then user must be able to view program balance data after card issue
    And user can verify before balance is equal to after balance
    And update Kit Status to Card Issued

  Scenario: 15.14 Card - Default GC Program - Load Card - Fee Management
    Given user login with Admin user
    Given user navigate to Fee Or Revenue Management
    When user navigate to Fee Configuration
    Then user can able to update card issuance fee for default GC
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before card issue
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue
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
     Given user navigate to Dashboard
    Then user must be able to view program balance data after card issue
    And user can verify before balance is equal to after balance
    And update Kit Status to Card Issued
    Then user must be able to view program balance data before card issue
    Given user navigate to Card
    When user click on Card List
    And user search for customer details
    Then user must be able to see searched card details
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue second
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance second
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
     Given user navigate to Dashboard
    Then user must be able to view program balance data after card issue
    And user can verify before balance is equal to after balance
    And update Kit Status to Card Issued second
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    When user click on Card List
    And user search for customer details
    Then user must be able to see searched card details
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
     Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And update Kit Status to Card Loaded
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 15.14
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And update Kit Status to Card Loaded

  Scenario: 15.15 Card - Default GC Program - Load Card - Fee Management - 0 Fee
    Given user login with Admin user
    Given user navigate to Fee Or Revenue Management
    When user navigate to Fee Configuration
    Then user can able to update card issuance fee for default GC 0 fee
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data after card issue
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue
    Given user navigate to Customer
    When user click on Add Customer
    Then user must reached to Add Customer page validate by URL
    When user fill required data for Add Customer
    And user click on Add Customer Submit button
    Then user must be see Add Customer success message
    And user click on Ok button
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
        Given user navigate to Dashboard
    Then user must be able to view program balance data after card issue
    And user can verify before balance is equal to after balance
    And update Kit Status to Card Issued
     Then user must be able to view program balance data before card issue
    Given user navigate to Card
    When user click on Card List
    And user search for customer details
    Then user must be able to see searched card details
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    Then user can able to check status of Default GC Kit No is assigned for Card Issue second
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance second
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
      Given user navigate to Dashboard
    Then user must be able to view program balance data after card issue
    And user can verify before balance is equal to after balance
    And update Kit Status to Card Issued second
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    When user click on Card List
    And user search for customer details
    Then user must be able to see searched card details
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And update Kit Status to Card Loaded
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 15.14
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And update Kit Status to Card Loaded
