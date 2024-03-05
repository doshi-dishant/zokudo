Feature: Card To Card Transfer Scenarios

  Scenario: 8.11 - Card - Default GC Program - Card To Card Transfer
    Given user login as GC Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for default GC To Card
    And user check kyc limit before transaction for To Card
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
    Given user login with Admin user
    And user check kyc limit before transaction for To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And user check kyc limit after transaction for To Card
    Then user can verify limit for To Card

  Scenario: 8.12 - Card - Default GC1 Program - Card To Card Transfer
    Given user login as GC1 Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC1 8 bunch
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for default GC1 To Card
    And user check kyc limit before transaction for To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GC1
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GC1
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message

  Scenario: 8.13 - Card - Default GPR Program - Card To Card Transfer
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for default GPR To Card
    And user check kyc limit before transaction for To Card
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
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message

  Scenario: 8.14 - Card - Retailer GC Program - Card To Card Transfer
    Given user login as GC Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for GC To Card
    And user check kyc limit before transaction for To Card
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
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for retailer GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message

  Scenario: 8.15 - Card - Retailer GC1 Program - Card To Card Transfer
    Given user login as GC1 Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GC1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GC1
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for GC1 To Card
    And user check kyc limit before transaction for To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for retailer GC1
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for retailer GC1
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message

  Scenario: 8.16 - Card - Retailer GPR Program - Card To Card Transfer
    Given user login as GPR Retailer user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for GPR To Card
    And user check kyc limit before transaction for To Card
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
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for retailer GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And user check kyc limit after transaction for To Card
    Then user can verify limit for To Card

  Scenario: 8.17 - Card - Lending GC Program - Card To Card Transfer
    And user must be see added pocket record for lending GC
    Given user login as GC Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GC
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for lending GC To Card
    And user check kyc limit before transaction for To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for lending GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    And user check kyc limit after transaction
    Then user can verify limit is not updated
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for lending GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And user check kyc limit after transaction for To Card
    Then user can verify limit for To Card

  Scenario: 8.18 - Card - Lending GPR Program - Card To Card Transfer
    And user must be see added pocket record for lending GPR
    Given user login as GPR Lending user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for lending GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for lending GPR
    And update Kit Status to Card In Progress
    And user check kyc limit before transaction
    And user can fetch kit details and customer details for lending GPR To Card
    And user check kyc limit before transaction for To Card
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
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for lending GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And user check kyc limit after transaction for To Card
    Then user can verify limit for To Card

  Scenario: 10.1 - Card - Default GC Program - Card To Card Transfer - Pocket MCC Max Limit Exceeded For Pocket
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for max pocket limit for default GC pocket2
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Pocket
    When user click on List Pocket
    When user can able to update max limit for GC client2
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer Transfer More than max limit for default GC pocket2
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer pocket limit message

  Scenario: 10.2 - Card - Default GC Program - Card To Card Transfer - Insufficient Balance In Debit
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer max limit with default pocket
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer Insufficient balance in debit message

  Scenario: 10.3 - Card - Default GC Program - Card To Card Transfer - Insufficient Balance In Debit 2
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for greater than debit card balance for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer Insufficient balance in debit message

  Scenario: 10.4 - Card - Default GC Program - Card To Card Transfer - Invalid Pocket Name
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for invalid pocket
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer invalid pocket name message
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for different pocket
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer invalid pocket name message

  Scenario: 10.5 - Card - Default GC Program - Card To Card Transfer - 2 Different Programs
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login as GC Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC card
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer debit card and credit card program ids is not same message
    Given user login as GPR Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR card
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer debit card and credit card program ids is not same message

  Scenario: 10.6 - Card - Default GC Program - Card To Card Transfer - Credit Card Already Loaded
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC second client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit second for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer 10.6 for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer GC can be loaded only one time for Pocket message

  Scenario: 10.7 - Card - Default GC Program - Card To Card Transfer - Paused Card
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for pause card for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card

  Scenario: 10.8 - Card - Default GC Program - Card To Card Transfer - GC Can Be Loaded Once
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be see added pocket record for default GC client2
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card after update limit for default GC client2
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer GC can be loaded only one time for Pocket message

  Scenario: 10.9 - Card - Default GC Program - Card To Card Transfer - Reversed
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be see added pocket record for default GC client2
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer Reversed 10.9 for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer GC can be loaded only one time for Pocket message

  Scenario: 10.10 - Card - Default GC Program - Card To Card Transfer - C2C Perform More Than 1 On Same Credit
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    And user must be see added pocket record for default GC client2
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC second client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card after update limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC To Card client2
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer second
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer GC can be loaded only one time for Pocket message

  Scenario: 10.11 - Card - Default GC Program - Card To Card Transfer - 3 Cards
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    And user must be see added pocket record for default GC client2
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    And update Kit Status to Card In Progress To Card
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
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC second client2
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit second
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded second

  Scenario: 10.12 - Card - Default GC Program - Card To Card Transfer - 3 Cards - GC Can Be Loaded Only Once
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    And user must be see added pocket record for default GC client2
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC second client2
    And update Kit Status to Card In Progress client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC To Card client2
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer to first card
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer GC can be loaded only one time for Pocket message
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC
    And user click on Load Card submit button
    And user must be see Load Card program can be loaded one time error message

  Scenario: 10.13 - Card - Default GC Program - Card To Card Transfer - From & To Card Same
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GC
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card after update limit for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer For Same Cards for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer sender and receiver cards can't be same message

  Scenario: 10.14 - Card - Default GC Program - Card To Card Transfer - 3 Cards - Same Customer
    Given user login as GC Default Program user1
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    And user must be see added pocket record for default GC client2
    Given user navigate to Bulk Operations
    When user click on Bulk Upload
    Then user must reached to Bulk Upload page validate by URL
    When user fill required data for file upload for customer positive
    And user click on Bulk Upload submit button
    Then user must be see success message
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    And user can fetch kit details for card issuance for default GC client2
    And update Kit Status to Card In Progress For Card Issuance
    And user can fetch kit details for card issuance for default GC second client2
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
    And update Kit Status to Card Issued
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance second
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
    And update Kit Status to Card Issued second
    Given user navigate to Kit Assign
    When user click on List Assigned Kit
    And user can fetch kit details for card issuance for default GC To Card client2
    Given user navigate to Card
    When user click on Card Issuance
    Then user must reached to Card Issuance page validate by URL
    When user fill required data for Card Issuance To Card
    And user click on Card Issuance submit button
    Then user must be see Card Issuance success message
    And update Kit Status to Card Issued To Card
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GC To Card client2
    And update Kit Status to Card In Progress To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GC
    And user click on Load Card submit button
    And user must be see Load Card success message
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC second client2
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer from 1st to 2nd for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded second
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer from 1st to 3rd for default GC
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card

  Scenario: 10.15 - Card - Default GPR Program - Card To Card Transfer - Pocket MCC Max Limit Exceeded For Pocket
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for max pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit To Card for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Pocket
    When user click on List Pocket
    When user can able to update max limit for GPR client
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer Transfer More than max limit for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer pocket limit message

  Scenario: 10.16 - Card - Default GPR Program - Card To Card Transfer - Pocket MCC Max Limit Exceeded For Pocket
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for max pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Pocket
    When user click on List Pocket
    When user can able to update max limit for GPR client
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer Transfer More than max limit for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer pocket limit message

  Scenario: 10.17 - Card - Default GPR Program - Card To Card Transfer - Insufficient Balance In Debit
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer max limit with default pocket
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer Insufficient balance in debit message

  Scenario: 10.18 - Card - Default GPR Program - Card To Card Transfer - Insufficient Balance In Debit
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer Insufficient balance in debit message

  Scenario: 10.19 - Card - Default GPR Program - Card To Card Transfer - Invalid Pocket Name
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for invalid pocket
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer invalid pocket name message
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for different pocket
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer invalid pocket name message

  Scenario: 10.20 - Card - Default GPR Program - Card To Card Transfer - 2 Different Programs
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login as GPR Retailer user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for GPR To Card
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer For Different Cards for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer debit card and credit card program ids is not same message
    Given user login as GC Default Program user1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC To Card client2
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer For Different Cards for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer debit card and credit card program ids is not same message

  Scenario: 10.21 - Card - Default GPR Program - Card To Card Transfer - Both Card Already Loaded
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR Second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card with Default pocket
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card after update limit second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer second with same pocket for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded second

  Scenario: 10.22 - Card - Default GPR Program - Card To Card Transfer - Both Card Already Loaded With Different Pocket
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    And user must be see added pocket record for default GPR second
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer 10.6 for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message

  Scenario: 10.23 - Card - Default GPR Program - Card To Card Transfer - Paused Card
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for less than pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for pause card for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card

  Scenario: 10.24 - Card - Default GPR Program - Card To Card Transfer - Reversed
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card after update limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer less than pocket limit reversed for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded

  Scenario: 10.25 - Card - Default GPR Program - Card To Card Transfer - Different Debit Card With Same Pocket
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card same pocket second for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user navigate to Dashboard
    Then user must be able to view program balance data after load card
    And user can verify before balance is not equal to after balance
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR To Card
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer second 10.25 for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card

  Scenario: 10.26 - Card - Default GPR Program - Card To Card Transfer - C2C Txn With Other Unloaded Card
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR To Card
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded To Card
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer from To Card for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded second

  Scenario: 11.1 - Card - Default GPR Program - Card Can Be Loaded Again With The Same Pocket Or Diff Pocket After C2C Transaction
    Given user login as GPR Default Program user
    Given user navigate to Dashboard
    Then user must be able to view program balance data before load card
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    And update Kit Status to Card In Progress
    And user can fetch kit details and customer details for default GPR To Card
    And update Kit Status to Card In Progress To Card
    And user can fetch kit details and customer details for default GPR Second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for max pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for max pocket limitToCard for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded To Card
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded second
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer testcase 11.1 for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer success message
    And update Kit Status to Card Loaded
    Given user login as GPR Default Program user
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for max pocket limit testcase 11.1 for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for max pocket limit testcase 11.1 pocket2
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded

  Scenario: 11.2 - Card - Default GPR Program - Sender And Receiver Cards Can't Be Same
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
    When user fill required data for Load Card for max pocket limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Card TO Card Transfer
    When user fill required data for Card To Card Transfer For Same Cards for default GPR
    And user click on Card To Card Transfer submit button
    And user must be see Card To Card Transfer sender and receiver cards can't be same message
