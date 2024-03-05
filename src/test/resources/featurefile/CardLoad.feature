Feature: Card Load Scenarios

  Scenario: 5.19 - Card - Default GC User - Load Card - Negative
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card Negative for default GC
    And user click on Load Card submit button
    And user must be see Load Card failure message
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC for file upload
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card negative for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed

  Scenario: 5.20 - Card - Default GPR User - Load Card - Negative
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card Negative for default GPR
    And user click on Load Card submit button
    And user must be see Load Card failure message
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR for file upload
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card negative for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed

  Scenario: 6.2 - Card - Default GC Program - Load Card
    Given user login with Admin user
    Given user navigate to Virtual Account
    When user navigate to List Virtual Account
    Then user can fetch account number
    When user navigate to Prefund
    And user click on Prefund Request
    When user fill required data for prefund request
    And user click on submit prefund request
    Then user can able to see prefund success message
    When user navigate to Prefund
    And user click on Prefund List
    Then user can able to see added prefund request
    And user can able to see action button for added prefund request
    When user approved request
    Then user can able to see approved status
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 6.3 - Card - Default GPR Program - Load Card
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for defult GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 6.4 - Card - Default GC & Default GPR User - Load Card Using File Upload
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card
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
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
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
    And user can verify before balance is not equal to after balance

  Scenario: 6.5 - Card - Default GC Program - Load Card - GC Can Be Loaded One Time
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC
    And user click on Load Card submit button
    And user must be see Load Card program can be loaded one time error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for default GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.6 - Card - Default GC Program - Load Card - Limit
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
    When user fill required data for Load Card for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card
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

  Scenario: 6.7 - Card - Default GPR Program - Load Card
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
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 6.8 - Card - Default GC Program - Load Card - Pocket MCC Max Limit Exceeded
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
    When user fill required data for Load Card max limit
    And user click on Load Card submit button
    And user must be see Load Card max mcc error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card max limit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.9 - Card - Default GPR Program - Load Card - Pocket MCC Max Limit Exceeded
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card max limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card max mcc error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card max limit for default GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.10 - Card - Default GC1 User - Load Card - Negative
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card Negative for default GC1
    And user click on Load Card submit button
    And user must be see Load Card failure message
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card negative for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed

  Scenario: 6.11 - Card - Default GC1 Program - Load Card
    Given user login with Admin user
    Given user navigate to Virtual Account
    When user navigate to List Virtual Account
    Then user can fetch account number
    When user navigate to Prefund
    And user click on Prefund Request
    When user fill required data for prefund request for client2
    And user click on submit prefund request
    Then user can able to see prefund success message
    When user navigate to Prefund
    And user click on Prefund List
    Then user can able to see added prefund request
    And user can able to see action button for added prefund request
    When user approved request
    Then user can able to see approved status
    Given user navigate to Pocket
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC1
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 6.12 - Card - Default GC1 User - Load Card Using File Upload
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for default GC1
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

  Scenario: 6.13 - Card - Default GC1 Program - Load Card - Pocket MCC Max Limit Exceeded
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card max limit for default GC1
    And user click on Load Card submit button
    And user must be see Load Card max mcc error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card max limit for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.14 - Card - Default GC Program - Load Card - More Than Balance Limit
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
    When user fill required data for Load Card more than balance limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card GC load limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card more than balance limit for default GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.15 - Card - Default GC1 Program - Load Card - More Than Balance Limit
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card more than balance limit for default GC1
    And user click on Load Card submit button
    And user must be see Load Card GC load limit exceeded error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card more than balance limit for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.16 - Card - Default GC1 Program - Load Card - GC1 Can Be Loaded One Time
    Given user login as GC1 Default Program user1
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GC1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for default GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC1
    And user click on Load Card submit button
    And user must be see Load Card program can be loaded one time error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for default GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for default GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.17 - Card - Default GC1 Program - Load Card
    Given user login with Admin user
    Given user navigate to Limit
    When user navigate to Set KYC Limit
    Given user click on edit kyc limit
    Then user must be reached on set kyc limit page
    When user fill updated min kyc limits
    And user click on submit button for kyc limit
    Then user can able to see success message for kyc limit
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC1
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for default GC1
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

  Scenario: 6.18 - Card - Default GC Program - Load Card - Load Limit Exceeded
    Given user login with Admin user
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC client for update limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user can able to update max limit for GC update pocket limit
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user can able to update max limit for GC update pocket limit
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card load limit update pocket limit
    And user click on Load Card submit button
    And user must be see Load Card max load error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card load limit update pocket limit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.19 - Card - Default GC1 Program - Load Card - Load Limit Exceeded
    Given user login with Admin user
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC1 client update pocket limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user can able to update max limit for GC1
    Given user login as GC1 Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user can able to update max limit for GC1 update pocket limit
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card load limit update pocket limit
    And user click on Load Card submit button
    And user must be see Load Card max load error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card load limit update pocket limit
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 6.20 - Prefund & Pocket
    Given user login as GC Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    And user search pocket for GC
    Then user can able to see searched pocket
    And user can able to view mcc list for default GC
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user login as GPR Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    And user search for Expense pocket
    Then user can able to see searched pocket
    And user can able to view mcc list for default GPR
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user login as GC1 Default Program user1
    Given user navigate to Pocket
    When user click on List Pocket
    And user search pocket for GC1
    Then user can able to see searched pocket
    And user can able to view mcc list for default GC1
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List

  Scenario: 7.1 - Card - Retailer GC User - Load Card - Negative
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card Negative for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card failure message
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card negative for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason

  Scenario: 7.2 - Card - Retailer GPR User - Load Card - Negative
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card Negative for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card failure message
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card negative for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason

  Scenario: 7.3 - Card - Retailer GC Program - Load Card
    Given user login with Admin user
    Given user navigate to Virtual Account
    When user navigate to List Virtual Account
    Then user can fetch account number
    When user navigate to Prefund
    And user click on Prefund Request
    When user fill required data for prefund request
    And user click on submit prefund request
    Then user can able to see prefund success message
    When user navigate to Prefund
    And user click on Prefund List
    Then user can able to see added prefund request
    And user can able to see action button for added prefund request
    When user approved request
    Then user can able to see approved status
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 7.4 - Card - Retailer GPR Program - Load Card
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 7.5 - Card - Retailer GC & Retailer GPR User - Load Card Using File Upload
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GC
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
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 7.6 - Card - Retailer GC Program - Load Card - GC Can Be Loaded One Time
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card program can be loaded one time error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for GC for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 7.7 - Card - Retailer GC Program - Load Card - Limit
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
    When user fill required data for Load Card for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
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
    When user fill required data for file upload for load card for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And update Kit Status to Card Loaded

  Scenario: 7.8 - Card - Retailer GC Program - Load Card - Pocket MCC Max Limit Exceeded
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
    When user fill required data for Load Card max limit for retailer GC
    And user click on Load Card submit button
    And user must be see Load Card max mcc error message
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
    When user fill required data for file upload for load card max limit for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 7.9 - Card - Retailer GPR Program - Load Card - Limit
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
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 7.10 - Card - Retailer GPR Program - Load Card - Pocket MCC Max Limit Exceeded
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card max limit for retailer GPR
    And user click on Load Card submit button
    And user must be see Load Card max mcc error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card max limit for retailer GPR
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 7.11 - Card - Retailer GC Program - Load Card - More Than Balance Limit
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
    When user fill required data for Load Card more than balance limit for retailer GC
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
    When user fill required data for file upload for load card more than balance limit for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 7.12 - Card - Retailer GC Program - Load Card - More Than Balance Limit - With Pocket
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
    When user fill required data for Load Card more than balance limit for retailer GC
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
    When user fill required data for file upload for load card more than balance limit for retailer GC
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 7.13 - Card - Retailer GC1 User - Load Card - Negative
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card Negative for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card failure message
    Given user navigate to Dashboard
    Then user must be able to view program balance data
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card negative for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason

  Scenario: 7.14 - Card - Retailer GC1 Program - Load Card
    Given user login with Admin user
    Given user navigate to Virtual Account
    When user navigate to List Virtual Account
    Then user can fetch account number
    When user navigate to Prefund
    And user click on Prefund Request
    When user fill required data for prefund request for client2
    And user click on submit prefund request
    Then user can able to see prefund success message
    When user navigate to Prefund
    And user click on Prefund List
    Then user can able to see added prefund request
    And user can able to see action button for added prefund request
    When user approved request
    Then user can able to see approved status
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    When user navigate to Prefund
    And user click on Prefund List
    Then user must able to view Prefund List
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance

  Scenario: 7.15 - Card - Retailer GC1 User - Load Card Using File Upload
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GC1
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

  Scenario: 7.18 - Card - Retailer GC1 Program - Load Card - Pocket MCC Max Limit Exceeded
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card max limit for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card max mcc error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card max limit for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason if failed
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 7.16 - Card - Retailer GC1 Program - Load Card - GC1 Can Be Loaded One Time
    Given user login as GC1 Retailer user
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GC1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for GC1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card program can be loaded one time error message
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch used kit details and customer details for GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GC1
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Bulk Operations
    And user click on Bulk Card Load Report
    When user search for card load status
    Then user can able to find result and failure reason
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is equal to after balance

  Scenario: 7.17 - Card - Retailer GC1 Program - Load Card - Limit
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
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1 for file upload
    Given user navigate to Customer
    When user click on List Customer
    Then user can be able to fetch customer hash id from mobile number
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for load card for retailer GC1
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
