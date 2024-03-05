Feature: Failed Scenarios

  @Kit_Assign
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

  @Card_Load
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

  @Create_Offer
  Scenario: 1.4 - Create Offer - Positive
    Given user login with Admin user
    Given user navigate to Merchant
    When user click on Add Brand
    Then user must reached to Add Brand page validate by URL
    When user fill required data for Add Brand
    And user click on Merchant Submit button
    Then user must be see Add Brand success message
    And user click on Ok button
    Given user navigate to Merchant
    When user click on List Brand
    Then user must reached to List Brand page validate by URL
    And user must be see added branch record
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant
    And user click on Merchant Submit button
    Then user must be see Add Merchant success message
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record

  Scenario: 1.5 - Add Merchant - Negative
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant negative
    And user click on Merchant Submit button
    Then user must be see Add Merchant failure message

  Scenario: 1.6 - Create Offer - Negative
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer
    And user click on Offer Submit button
    Then user must be see Create Offer failure message

  Scenario: 11.16 - Add Merchant - Blank Terminal Id
    Given user navigate to Merchant
    When user click on Add Brand
    Then user must reached to Add Brand page validate by URL
    When user fill required data for Add Brand
    And user click on Merchant Submit button
    Then user must be see Add Brand success message
    And user click on Ok button
    Given user navigate to Merchant
    When user click on List Brand
    Then user must reached to List Brand page validate by URL
    And user must be see added branch record
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant without terminal
    And user click on Merchant Submit button
    Then user must be see Add Merchant success message
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    And verify no terminal added under merchant
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer Percentage
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    And user add terminal
    And user click on Merchant Submit button
    And user must be see Update Merchant success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record

  Scenario: 11.17 - Merchant - Can Not Add Same MID & TID combination In 2 Different Brands
    Given user navigate to Merchant
    When user click on Add Brand
    Then user must reached to Add Brand page validate by URL
    When user fill required data for Add Brand
    And user click on Merchant Submit button
    Then user must be see Add Brand success message
    And user click on Ok button
    Given user navigate to Merchant
    When user click on List Brand
    Then user must reached to List Brand page validate by URL
    And user must be see added branch record
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant
    And user click on Merchant Submit button
    Then user must be see Add Merchant success message
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    Given user navigate to Merchant
    When user click on Add Brand
    Then user must reached to Add Brand page validate by URL
    When user fill required data for Add Brand
    And user click on Merchant Submit button
    Then user must be see Add Brand success message
    And user click on Ok button
    Given user navigate to Merchant
    When user click on List Brand
    Then user must reached to List Brand page validate by URL
    And user must be see added branch record
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant existing Terminals under Mechant
    And user click on Merchant Submit button
    Then user must be see merchant id comibination error message

  Scenario: 11.18 - Merchant - Can Add Same Merchant In 2 Different Brands with Different TerminalIds & Can Create Offer
    Given user navigate to Merchant
    When user click on Add Brand
    Then user must reached to Add Brand page validate by URL
    When user fill required data for Add Brand
    And user click on Merchant Submit button
    Then user must be see Add Brand success message
    And user click on Ok button
    Given user navigate to Merchant
    When user click on List Brand
    Then user must reached to List Brand page validate by URL
    And user must be see added branch record
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant
    And user click on Merchant Submit button
    Then user must be see Add Merchant success message
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record
    Given user navigate to Merchant
    When user click on Add Brand
    Then user must reached to Add Brand page validate by URL
    When user fill required data for Add Brand
    And user click on Merchant Submit button
    Then user must be see Add Brand success message
    And user click on Ok button
    Given user navigate to Merchant
    When user click on List Brand
    Then user must reached to List Brand page validate by URL
    And user must be see added branch record
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant with new terminal
    And user click on Merchant Submit button
    Then user must be see Add Merchant success message
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    And user add existig terminal
    And user click on Merchant Submit button
    Then user must be see update merchant id comibination error message

  Scenario: 11.19 - Merchant - Can Not add Existing Merchant with new Terminals under Same Brand But Can Edit Merchant With New TerminalID & Can Create Offer
    Given user navigate to Merchant
    When user click on Add Brand
    Then user must reached to Add Brand page validate by URL
    When user fill required data for Add Brand
    And user click on Merchant Submit button
    Then user must be see Add Brand success message
    And user click on Ok button
    Given user navigate to Merchant
    When user click on List Brand
    Then user must reached to List Brand page validate by URL
    And user must be see added branch record
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant
    And user click on Merchant Submit button
    Then user must be see Add Merchant success message
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant with new terminal
    And user click on Merchant Submit button
    Then user must be see Add Merchant failure message
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    And user add new terminal
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record

  Scenario: 11.20 - Merchant - Can Add New Merchant With Existing Terminal Id Of Existing Merchant Of Same Brand & Can Create Offer
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant
    And user click on Merchant Submit button
    And user stop
    Then user must be see Add Merchant success message
    Given user navigate to Merchant
    When user click on List Merchant
    Then user must reached to List Merchant page validate by URL
    And user must be see added merchant record
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record
