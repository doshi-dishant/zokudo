Feature: Create Offer Scenarios

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
    Given user login with Admin user
    Given user navigate to Merchant
    When user click on Add Merchant
    Then user must reached to Add Merchant page validate by URL
    When user fill required data for Add Merchant negative
    And user click on Merchant Submit button
    Then user must be see Add Merchant failure message

  Scenario: 1.6 - Create Offer - Negative
    Given user login with Admin user
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer
    And user click on Offer Submit button
    Then user must be see Create Offer failure message

  Scenario: 11.12 - Create Offer - Default & Distributor
    Given user login with Admin user
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
    When user fill required data for Create Offer distributor
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record

  Scenario: 11.13 - Create Offer - Default & Distributor - Percentage
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
    When user fill required data for Create Offer Percentage
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
    When user fill required data for Create Offer distributor Percentage
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record

  Scenario: 11.14 - Create Offer - Can Not Create New Offer For Existing Offer Percentage
    Given user login with Admin user
    Given user navigate to Merchant
    When user click on Create Offer
    Then user must reached to Create Offer page validate by URL
    When user fill required data for Create Offer Percentage
    And user click on Offer Submit button
    Then user must be see Create Offer failure message

  Scenario: 11.15 - Create Offer - Terminate Existing Offer & Create New
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
    When user fill required data for Create Offer Percentage
    And user click on Offer Submit button
    Then user must be see Create Offer success message
    Given user navigate to Merchant
    When user click on List Offer
    Then user must reached to List Offer page validate by URL
    And user must be see added offer record
    When user terminate offer
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

  Scenario: 11.16 - Add Merchant - Blank Terminal Id
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
    Given user login with Admin user
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
