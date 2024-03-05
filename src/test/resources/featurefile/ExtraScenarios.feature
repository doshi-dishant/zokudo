Feature: Extra Scenarios 

  Scenario Outline: 8.1 - Card - Default GPR Program - Load Card - KYC Limit Check
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit

  Scenario: 8.2 - Card - Retailer GPR Program - Load Card - KYC Limit Check
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit

  Scenario: 8.3 - Card - Lending GPR Program - Load Card - KYC Limit Check
    Given user login as GPR Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for lending GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit

  Scenario: 8.4 - Card - Default GC Program - Load Card - KYC Limit Check
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 8.5 - Card - Retailer GC Program - Load Card - KYC Limit Check
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 8.6 - Card - Default GPR Program - Load Card - Balance Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 8.7 - Card - Retailer GPR Program - Load Card - Balance Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 8.8 - Card - Lending GPR Program - Load Card - Balance Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for lending GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 8.9 - Card - Default GC Program - Load Card - Balance Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc balance limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card GC load limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card more than balance limit bunch8 for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 8.10 - Card - Retailer GC Program - Load Card - Balance Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc balance limit for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card GC load limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card more than balance limit bunch8 for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 9.1 - Card - Default GPR Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.2 - Card - Default GC Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.3 - Card - Default GC1 Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC1 Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for default GC1
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.4 - Card - Retailer GPR Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.5 - Card - Retailer GC Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.6 - Card - Retailer GC1 Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.7 - Card - Lending GC Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for lending GC
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.8 - Card - Lending GPR Program - Load Card - Monthly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than kyc allowed limit for lending GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.9 - Card - Default GPR Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.10 - Card - Default GC Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.11 - Card - Default GC1 Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC1 Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for default GC1
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.12 - Card - Retailer GPR Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.13 - Card - Retailer GC Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.14 - Card - Retailer GC1 Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.15 - Card - Lending GPR Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GPR Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GPR
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for lending GPR
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 9.16 - Card - Lending GC Program - Load Card - Yearly Limit Exceeded Message
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GC
    And user check kyc limit before transaction
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for more than yearly allowed limit for lending GC
    And user click on Load Card submit button
    And user must be see Load Card Balance limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated

  Scenario: 12.1 - Card - Default GPR User - Load Card - Single Card Can Be Loaded With More Than 1 Pocket But Should Not Exceed Program Balance
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for default GPR client 3 times program balance
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GPR
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GPR bunch12
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for 2 different pocket with same kit for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for default pocket with same kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.2 - Card - Retailer GPR User - Load Card - Single Card Can Be Loaded With More Than 1 Pocket But Should Not Exceed Program Balance
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for GPR client 3 times program balance
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GPR
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    Given user login with Admin user
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for 2 different pocket with same kit for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for default pocket with same kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.3 - Card - Default GPR User - Load Card - Same Card Can Be Loaded With The Same Pocket More Than Once But Should Not Exceed the Pocket Limit
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with 3 same record for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.4 - Card - Retailer GPR User - Load Card - Same Card Can Be Loaded With The Same Pocket More Than Once But Should Not Exceed the Pocket Limit
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with 3 same record for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.5 - Card - Default GC User - Load Card - More Than 1 Cards Can Be Loaded At A Time But Should Not Exceed The Program Balance
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC client 3 times program balance
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GC
    Given user login as GC Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    And update Kit Status to Card In Progress
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    And update Kit Status to Card In Progress second
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC third
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number3
    And update Kit Status to Card In Progress third
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC forth
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number4
    And update Kit Status to Card In Progress forth
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.5 first 2 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.5 last 2 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.6 - Card - Default GC1 User - Load Card - More Than 1 Cards Can Be Loaded At A Time But Should Not Exceed The Program Balance
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC1 client 3 times program balance
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GC1
    Given user login as GC1 Default Program user1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    And update Kit Status to Card In Progress
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    And update Kit Status to Card In Progress second
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 third
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number3
    And update Kit Status to Card In Progress third
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 forth
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number4
    And update Kit Status to Card In Progress forth
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 fifth
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number5
    And update Kit Status to Card In Progress fifth
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.5 first 2 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.6 last 3 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.7 - Card - Retailer GC User - Load Card - More Than 1 Cards Can Be Loaded At A Time But Should Not Exceed The Program Balance
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for GC client 3 times program balance
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GC
    Given user login as GC Retailer user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    And update Kit Status to Card In Progress
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    And update Kit Status to Card In Progress second
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC third
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number3
    And update Kit Status to Card In Progress third
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC forth
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number4
    And update Kit Status to Card In Progress forth
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC fifth
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number5
    And update Kit Status to Card In Progress fifth
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.5 first 2 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.6 last 3 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.8 - Card - Retailer GC1 User - Load Card - More Than 1 Cards Can Be Loaded At A Time But Should Not Exceed The Program Balance
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for GC1 client 3 times program balance
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GC1
    Given user login as GC1 Retailer user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    And update Kit Status to Card In Progress
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 second
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number2
    And update Kit Status to Card In Progress second
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 third
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number3
    And update Kit Status to Card In Progress third
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 forth
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number4
    And update Kit Status to Card In Progress forth
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 fifth
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number5
    And update Kit Status to Card In Progress fifth
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.5 first 2 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card 12.6 last 3 kit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 12.10 - Card - Default GPR User - Load Card - Arguments Are Invalid
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for default GPR with 0 max limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GPR
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card 0 amount
    And user click on Load Card submit button
    And user must be see Load Card argument invalid error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with 0 amount
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.11 - Card - Default GC1 User - Load Card - Arguments Are Invalid
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC1 with 0 max limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GC1
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card 0 amount
    And user click on Load Card submit button
    And user must be see Load Card argument invalid error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with 0 amount
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.12 - Card - Retailer GC User - Load Card - Arguments Are Invalid
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for GC with 0 max limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GC
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card 0 amount
    And user click on Load Card submit button
    And user must be see Load Card argument invalid error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with 0 amount
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.13 - Card - Retailer GPR User - Load Card - Arguments Are Invalid
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for GPR with 0 max limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GPR
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card 0 amount
    And user click on Load Card submit button
    And user must be see Load Card argument invalid error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with 0 amount
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.14 - Card - Retailer GC1 User - Load Card - Arguments Are Invalid
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for GC1 with 0 max limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GC1
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card 0 amount
    And user click on Load Card submit button
    And user must be see Load Card argument invalid error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with 0 amount
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.15 - Card - Default GC User - Load Card - Invalid Customer
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid customer for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.16 - Card - Default GC User - Load Card - Invalid Kit
    Given user login with Admin user
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC client
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GPR
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid kit for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.17 - Card - Default GC User - Load Card - Invalid Funding Channel
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid funding channel for defalt GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.18 - Card - Default GC User - Load Card - Pocket Configured For Other Program
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid pocket for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.19 - Card - Default GC User - Load Card - Invalid Currecy Code
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid currency code for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 12.20 - Card - Default GC User - Load Card - Invalid Currecy Code
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with incomplete details for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.1 - Card - Default GPR Program - Load Card - Customer Details Not Found For A Given CustomerHashId
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid customerHashId for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.2 - Card - Default GPR Program - Load Card - Invalid ProxyCardNumber
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid kit for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.3 - Card - Default GPR Program - Load Card - Invalid Fund Channel
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid funding channel for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.4 - Card - Default GPR Program - Load Card - Invalid Pocket
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid pocket for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.5 - Card - Default GPR Program - Load Card - Invalid Currency Code
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid currency code for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.6 - Card - Default GC1 Program - Load Card - Customer Details Not Found For A Given CustomerHashId
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid customerHashId for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.7 - Card - Default GC1 Program - Load Card - Invalid ProxyCardNumber
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid kit for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.8 - Card - Default GC1 Program - Load Card - Invalid Fund Channel
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid funding channel for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.9 - Card - Default GC1 Program - Load Card - Invalid Pocket
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid pocket for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.10 - Card - Default GC1 Program - Load Card - Invalid Currency Code
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid currency code for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.11 - Card - Default GC Program - Load Card - Different Program ProxyCardNumber
    Given user login as GPR Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.12 - Card - Default GPR Program - Load Card - Different Program ProxyCardNumber
    Given user login as GC Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.13 - Card - Retailer GC Program - Load Card - Customer Details Not Found For A Given CustomerHashId
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid customerHashId for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.14 - Card - Retailer GC Program - Load Card - Invalid ProxyCardNumber
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid kit for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.15- Card - Retailer GC Program - Load Card - Invalid Funding Channel
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid funding channel for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.16- Card - Retailer GC Program - Load Card - Invalid Pocket
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid pocket for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.17- Card - Retailer GC Program - Load Card - Invalid Currency Code
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid currency code for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.18 - Card - Retailer GPR Program - Load Card - Customer Details Not Found For A Given CustomerHashId
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid customerHashId for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.19 - Card - Retailer GPR Program - Load Card - Invalid ProxyCardNumber
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid kit for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 13.20 - Card - Retailer GPR Program - Load Card - Invalid Funding Channel
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid funding channel for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.1 - Card - Retailer GPR Program - Load Card - Other Program Pocket
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with differnet pocket name
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.2 - Card - Retailer GPR Program - Load Card - Invalid Currency Code
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid currency code for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.3 - Card - Retailer GC1 Program - Load Card - Invalid Customer HashId
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid customerHashId for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.4 - Card - Retailer GC1 Program - Load Card - Invalid Proxy Card Number
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid kit for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.5 - Card - Retailer GC1 Program - Load Card - Invalid Funding Channel
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid funding channel for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.6 - Card - Retailer GC1 Program - Load Card - Invalid Pocket
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid pocket for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.7 - Card - Retailer GC1 Program - Load Card - Invalid Currency Code
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card with invalid currency code for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.8 - Card - Retailer GC Program - Load Card - Retailer Is Not Authorised To Load This Card Hash Id
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user login as GC Retailer user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.9 - Card - Retailer GPR Program - Load Card - Retailer Is Not Authorised To Load This Card Hash Id
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    And user must be see added pocket record for GPR
    Given user login as GPR Retailer user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 14.10 - Card - Retailer GC1 Program - Load Card - Retailer Is Not Authorised To Load This Card Hash Id
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Customer
    When user click on List Customer
    And user can be able to fetch customer hash id from mobile number
    Given user login as GC1 Retailer user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed for failured
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
