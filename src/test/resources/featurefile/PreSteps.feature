Feature: Pre Steps

  Scenario: Pocket Create Default GC
    Given user login with Admin user
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC client
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GC

  Scenario: Pocket Create Default GC - Client 2
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC client2
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GC client2

  Scenario: Pocket Create Default GC - Client 2 Less Limit
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC client2 less limit
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GC client2 less limit

  Scenario: Pocket Create Default GPR
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for default GPR client
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for default GPR

  Scenario: Pocket Create Retailer GPR
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for GPR client
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GPR

  Scenario: Pocket Create Retailer GPR - Pocket 2
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for GPR client pocket2
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be see added pocket record for GPR pocket2

  Scenario: Pocket Create Default GC1
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for default GC1 client
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be verified that pocket name and max limit for default GC1

  Scenario: Pocket Create Retailer GC
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for GC client
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be verified that pocket name and max limit for GC

  Scenario: Pocket Create Retailer GC1
    Given user navigate to Pocket
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Travel Pocket for GC1 client
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be verified that pocket name and max limit for GC1

  #Scenario: Pocket Create Lending GPR
    #Given user navigate to Pocket
    #When user click on Add Pocket
    #Then user must reached to Add Pocket page validate by URL
    #When user fill required data for Add Expences Pocket for Lending GPR client
    #And user click on Pocket Submit button
    #Then user must be see Add Pocket success message
    #Given user navigate to Pocket
    #When user click on List Pocket
    #Then user must reached to List Pocket page validate by URL
    #And user must be verified that pocket name and max limit for lending GPR

  #Scenario: Pocket Create Default GPR - Bonus
    #Given user navigate to Pocket
    #When user click on Add Pocket
    #Then user must reached to Add Pocket page validate by URL
    #When user fill required data for Add Bonus Pocket for default GPR client
    #And user click on Pocket Submit button
    #Then user must be see Add Pocket success message
    #Given user navigate to Pocket
    #When user click on List Pocket
    #Then user must reached to List Pocket page validate by URL
    #And user must be see added pocket record for default GPR bonus pocket

  #Scenario: Pocket Create Retailer GC - Bonus
    #When user click on Add Pocket
    #Then user must reached to Add Pocket page validate by URL
    #When user fill required data for Add Bonus Pocket for GPR client
    #And user click on Pocket Submit button
    #Then user must be see Add Pocket success message
    #Given user navigate to Pocket
    #When user click on List Pocket
    #Then user must reached to List Pocket page validate by URL
    #And user must be see added pocket record for GPR bonus pocket

  #Scenario: Pocket Create Lending GC
    #When user click on Add Pocket
    #Then user must reached to Add Pocket page validate by URL
    #When user fill required data for Add Travel Pocket for Lending GC client
    #And user click on Pocket Submit button
    #Then user must be see Add Pocket success message
    #Given user navigate to Pocket
    #When user click on List Pocket
    #Then user must reached to List Pocket page validate by URL
    #And user must be verified that pocket name and max limit for lending GC

  Scenario: Pocket Create Default GPR - Client 2
    When user click on Add Pocket
    Then user must reached to Add Pocket page validate by URL
    When user fill required data for Add Expences Pocket for default GPR client pocket2
    And user click on Pocket Submit button
    Then user must be see Add Pocket success message
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must reached to List Pocket page validate by URL
    And user must be verified that pocket name and max limit for default GPR pocket2
