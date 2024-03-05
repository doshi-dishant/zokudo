Feature: MCC MarkUp-Config Scenarios

  Scenario: 11.5 MCC Markup Config Default GPR - Markup Added
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program ECOM
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program ECOM duplicate request
    And user click on mcc markup submit button
    Then user verify add markup already exist message
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program POS with existing mcc
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added

  Scenario: 11.6  MCC Markup Config Default GC - Bulk
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gc program POS for bulk upload
    And user click on mcc markup submit button
    Then user verify add markup success message for bulk
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Summary
    And user search records
    Then user can check results for Total counts
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Report
    And user search record
    And user verify failure reason if failed
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gc program POS for bulk upload duplicate
    And user click on mcc markup submit button
    Then user verify add markup success message for bulk
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Summary
    And user search records
    Then user can check results for Total counts
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Report
    And user search record
    And user verify failure reason if failed
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup not added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gc program ECOM for bulk upload
    And user click on mcc markup submit button
    Then user verify add markup success message for bulk
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Summary
    And user search records
    Then user can check results for Total counts
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Report
    And user search record
    And user verify failure reason if failed
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added

  Scenario: 11.7  MCC Markup Config - Able To Edit MCC
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program ECOM
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program ECOM duplicate request
    And user click on mcc markup submit button
    Then user verify add markup already exist message for edit
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gc program POS for bulk upload
    And user click on mcc markup submit button
    Then user verify add markup success message for bulk
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Summary
    And user search records
    Then user can check results for Total counts
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Report
    And user search record
    And user verify failure reason if failed
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added

  Scenario: 11.8 MCC Markup Config - All Programs
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program ECOM for digit 1 decimal 1
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program POS fixed digit
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gc program POS with digit 2 decimal 1
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gpr program POS
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added

  Scenario: 11.9  MCC Markup Config - Markup Values
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gpr program POS 2 decimal
    And user click on mcc markup submit button
    Then user can able to verify invalid markup validation message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup not added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gpr program POS greter than 100 percent
    And user click on mcc markup submit button
    Then user can able to verify invalid markup validation message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup not added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gpr program POS for bulk upload
    And user click on mcc markup submit button
    Then user verify add markup success message for bulk
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Summary
    And user search records
    Then user can check results for Total counts
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Report
    And user search record
    And user verify failure reason if failed
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added

  Scenario: 11.10  MCC Markup Config - Blank Sheet, Invalid MCC Sheet
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gpr program POS for bulk upload blank
    And user click on mcc markup submit button
    Then user verify add markup success message for bulk
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Summary
    And user search records
    Then user can check results for Total counts
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Report
    And user search record
    And user verify failure reason if failed
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gpr program POS for bulk upload invalid mcc
    And user click on mcc markup submit button
    Then user verify add markup success message for bulk
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Summary
    And user search records
    Then user can check results for Total counts
    Given user navigate to MCC Mark-Up Config
    When user navigate to MCC Markup Upload Report
    And user search record
    And user verify failure reason if failed

  Scenario: 11.11  MCC Markup Config - Contactless
    Given user login with Admin user
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for default gpr program contactless
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gpr program POS existing mcc
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
    Given user navigate to MCC Mark-Up Config
    When user navigate to Set MCC MarkUp
    When user fill required data for set mcc markup for retailer gc program POS existing mcc
    And user click on mcc markup submit button
    Then user verify add markup success message
    Given user navigate to MCC Mark-Up Config
    When user navigate to List MCC MarkUp
    Then user verify markup added
