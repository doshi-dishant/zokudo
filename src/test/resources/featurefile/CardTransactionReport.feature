Feature: Card Transaction Report Scenarios

  Scenario: 1.16 - Card - Admin User - Transaction Report - Positive
    Given user login as GC Default Program user
    Given user navigate to Card
    When user click on Transaction Report
    Then user must reached to Transaction Report page validate by URL
    And user download card transaction report
    When user select date range and hit Submit
    Then user must be see transaction details
    When user apply status filter
    Then user must be see transaction details as per filter

  Scenario: 1.17 - Card - Program User - Transaction Report - Positive
    Given user navigate to Card
    When user click on Transaction Report
    Then user must reached to Transaction Report page validate by URL
    And user download card transaction report
    When user select date range and hit Submit
    Then user must be see transaction details
    When user apply status filter
    Then user must be see transaction details as per filter

  Scenario: 1.18 - Card - Program User - Transaction Report - Negative
    Given user navigate to Card
    When user click on Transaction Report
    Then user must reached to Transaction Report page validate by URL
    When user select date range and hit Submit
    Then user must be see transaction details
    When user apply kit filter
    Then user must not be able to see transaction details as per filter
