Feature: Dashboard Scenarios 
	
Scenario: 1.12 - Dashboard - All User Program Balance Data
	Given user navigate to Dashboard
	Then user must be able to view program balance data
	Given user login as GC Distributor user
	Then user must be able to view program balance data
	Given user login as GC Retailer user
	Then user must be able to view program balance data