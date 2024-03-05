Feature: Pocket Scenarios

  Scenario: 1.2 - Add Pocket - Positive
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Pocket
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record

  Scenario: 1.3 - Add Pocket - Negative
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Pocket negative
    And user click on Pocket Submit button
    Then user must be see Add Pocket failure message