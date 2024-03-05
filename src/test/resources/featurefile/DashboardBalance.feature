Feature: Dashboard Balance Scenarios

  Scenario: 1.11 - Dashboard Balance
    Given user login with Admin user
    Given user navigate to Dashboard Balance
    When user click on Select Date Range
    And user select This Month
    And user click on All Programs
    And user click on Filter button
    Then user must be able to view Closing Balance as per defined formula
    And user must be able to view Escrow Transaction as per defined formula
    Given user navigate to Dashboard Balance
    When user click on Select Date Range
    And user select This Month
    And user click on Client and select All
    And user click on Filter button
    Then user must be able to view Closing Balance as per defined formula
    And user must be able to view Escrow Transaction as per defined formula
    Given user navigate to Dashboard Balance
    When user click on Select Date Range
    And user select This Month
    And user click on Distributor and select All
    And user click on Filter button
    Then user must be able to view Closing Balance as per defined formula
    And user must be able to view Escrow Transaction as per defined formula
    Given user navigate to Dashboard Balance
    When user click on Select Date Range
    And user select Last Month
    And user click on Client and select mutliple records
    And user click on Filter button
    Then user must be able to view Closing Balance as per defined formula
    And user must be able to view Escrow Transaction as per defined formula
    Given user navigate to Dashboard Balance
    When user click on Select Date Range
    And user select Last Month
    And user click on Distributor and select mutliple records
    And user click on Filter button
    Then user must be able to view Closing Balance as per defined formula
    And user must be able to view Escrow Transaction as per defined formula
    Given user navigate to Dashboard Balance
    When user click on Select Date Range
    And user select Custom Range
    And user select Custom Dates
    And user click on All Programs
    And user click on Filter button
    Then user must be able to view Closing Balance as per defined formula
    And user must be able to view Escrow Transaction as per defined formula
