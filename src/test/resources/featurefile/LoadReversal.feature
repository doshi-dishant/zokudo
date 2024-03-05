Feature: Load Reversal Scenarios

  Scenario: 11.3 Card - Default GC Program - Load Reversal
    Given user login as GC Default Program user1
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GC pocket2
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client2
    And user click on Load Reversal submit button
    And user enters the random password as confirmed password
    And user should display with Invalid credentials message
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message

  Scenario: 11.4 Card - Default GC Program - Load Reversal
    Given user login as GC Default Program user1
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC client2
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client2
    And user click on Load Reversal submit button
    And user must be see card value should be greater than 0 message
    Given user login as GC Default Program user1
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client2
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message

  Scenario: 14.11 - Card - Default GPR Program - Load Reversal
    Given user login as GPR Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client
    And user click on Load Reversal submit button
    And user enters the random password as confirmed password
    And user should display with Invalid credentials message
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message

  Scenario: 14.12 Card - Default GC Program - Load Reversal
    Given user login as GPR Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client
    And user click on Load Reversal submit button
    And user must be see card value should be greater than 0 message
    Given user login as GPR Default Program user
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message

  Scenario: 14.13 - Card - Default GPR Program - Load Reversal - Revers All Available Pockets Balance Of GPR Card
    Given user login as GPR Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit second pocket second kit
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message

  Scenario: 14.14 - Card - Default GPR Program - Load Reversal - Bulk
    Given user login as GPR Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GPR Second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit second different pocket
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client bulk for total balance
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message bulk

  Scenario: 14.15 - Card - Default GPR Program - Load Reversal - Blank Or Invalid Kit
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client bulk blank sheet
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal failure message
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client bulk
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal failure message

  Scenario: 14.16 - Card - Default GC Program - Load Reversal - Requested Amount & Wallet Balance Not Matched
    Given user login as GC Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client invalid amount bulk
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal failure message

  Scenario: 14.16 - Card - Default GC Program - Load Reversal - Requested Amount & Wallet Balance Not Matched
    Given user login as GC Default Program user
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client 0 amount bulk
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal failure message

  Scenario: 14.18 - Card - Default GPR Program - Load Reversal - Card Not Found With Program Id
    Given user login as GC Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GPR client bulk
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal failure message

  Scenario: 14.19 - Card - Default GC Program - Load Reversal - Card Load Reverse Allowed If The Card Is Paused
    Given user login as GC Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    And update Kit Status to Card In Progress
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded second
    Given user login with Admin user
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card
    Given user navigate to Card
    Then user click on Card List
    And user can able to pause card second
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client second
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message

  Scenario: 14.20 - Card - Default GC Program - Load Reversal - Card Load Reverse Allowed If The Card Is Blocked
    Given user login as GC Default Program user
    Given user navigate to Pocket
    When user click on List Pocket
    Then user must be verified that pocket name and max limit for default GPR
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC
    And update Kit Status to Card In Progress
    Given user navigate to Card
    Then user click on Card List
    And user can fetch kit details and customer details for default GC second
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit for default GPR
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user navigate to Card
    When user click on Load Card
    Then user must reached to Load Card page validate by URL
    When user fill required data for Load Card for kyc remaining allowed limit second
    And user click on Load Card submit button
    And user must be see Load Card success message
    And update Kit Status to Card Loaded
    Given user login with Admin user
    Given user navigate to Card
    Then user click on Card List
    And user can able to block card
    Given user navigate to Card
    Then user click on Card List
    And user can able to block card second
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message
    Given user navigate to Card
    When user click on Load Reversal
    When user fill required data for Load Reversal for default GC client second
    And user click on Load Reversal submit button
    And user enters the correct password as confirmed password
    And user must be see Load Reversal success message
