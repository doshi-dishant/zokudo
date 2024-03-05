Feature: Create Program Scenarios

Scenario: 1.1 - Create Default GC Program - Positive
	Given user navigate to Onboard Business
	When user click on Add Business
	Then user must reached to Add Business page validate by URL
	When user fill required data for Add Business
	And user click on Business Submit button
	Then user must be see Add Business success message
	Given user navigate to Onboard Business
	When user click on List Business
	Then user must reached to List Business page validate by URL
	And user must be see added business record
	Given user navigate to Client
	When user click on Add Client
	Then user must reached to Add Client page validate by URL
	When user fill required data for Add Client for default client1
	And user click on Save And Continue button
	Then user must be see Add Client success message
	Given user navigate to Client
	When user click on List Client
	Then user must reached to List Client page validate by URL
	And user must be see added client record
	Given user navigate to Onboard Program
	When user click on Add Program
	Then user must reached to Add Program page validate by URL
	When user fill required data for Add Program
	And user click on Program Submit button
	Then user must be see Add Program success message
	Given user navigate to Onboard Program
	When user click on List Program
	Then user must reached to List Program page validate by URL
	And user must be see added Default GC program record
	
Scenario: 5.1 - Create Default GC1 And Default GPR Program - Positive
	Given user navigate to Onboard Business
	When user click on Add Business
	Then user must reached to Add Business page validate by URL
	When user fill required data for Add Business with Equitas Processor
	And user click on Business Submit button
	Then user must be see Add Business success message
	Given user navigate to Onboard Business
	When user click on List Business
	Then user must reached to List Business page validate by URL
	And user must be see added business record
	Given user navigate to Client
	When user click on Add Client
	Then user must reached to Add Client page validate by URL
	When user fill required data for Add Client for default client2
	And user click on Save And Continue button
	Then user must be see Add Client success message
	Given user navigate to Client
	When user click on List Client
	Then user must reached to List Client page validate by URL
	And user must be see added client record
	Given user navigate to Onboard Program
	When user click on Add Program
	Then user must reached to Add Program page validate by URL
	When user fill required data for Add Program for GC1
	And user click on Program Submit button
	Then user must be see Add Program success message
	Given user navigate to Onboard Program
	When user click on List Program
	Then user must reached to List Program page validate by URL
	And user must be see added Default GC1 program record
	Given user navigate to Onboard Business
	When user click on Add Business
	Then user must reached to Add Business page validate by URL
	When user fill required data for Add Business with Equitas Processor
	And user click on Business Submit button
	Then user must be see Add Business success message
	Given user navigate to Onboard Business
	When user click on List Business
	Then user must reached to List Business page validate by URL
	And user must be see added business record
	Given user navigate to Onboard Program
	When user click on Add Program
	Then user must reached to Add Program page validate by URL
	When user fill required data for Add Program for GPR for client2
	And user click on Program Submit button
	Then user must be see Add Program success message
	Given user navigate to Onboard Program
	When user click on List Program
	Then user must reached to List Program page validate by URL
	And user must be see added Default GPR program1 record

Scenario: 5.2 - Create Super Distributor GC And Super Distributor GPR Program - Positive
	Given user navigate to Onboard Business
	When user click on Add Business
	Then user must reached to Add Business page validate by URL
	When user fill required data for Add Business with Equitas Processor
	And user click on Business Submit button
	Then user must be see Add Business success message
	Given user navigate to Onboard Business
	When user click on List Business
	Then user must reached to List Business page validate by URL
	And user must be see added business record
	Given user navigate to Client
	When user click on Add Client
	Then user must reached to Add Client page validate by URL
	When user fill required data for Add Client for sd client1
	And user click on Save And Continue button
	Then user must be see Add Client success message
	Given user navigate to Client
	When user click on List Client
	Then user must reached to List Client page validate by URL
	And user must be see added client record
	Given user navigate to Onboard Program
	When user click on Add Program
	Then user must reached to Add Program page validate by URL
	When user fill required data for Add Program with Distributor Plan
	And user click on Program Submit button
	Then user must be see Add Program success message
	Given user navigate to Onboard Program
	When user click on List Program
	Then user must reached to List Program page validate by URL
	And user must be see added SD GC program record
	Given user navigate to Onboard Business
	When user click on Add Business
	Then user must reached to Add Business page validate by URL
	When user fill required data for Add Business with Equitas Processor
	And user click on Business Submit button
	Then user must be see Add Business success message
	Given user navigate to Onboard Business
	When user click on List Business
	Then user must reached to List Business page validate by URL
	And user must be see added business record
	Given user navigate to Onboard Program
	When user click on Add Program
	Then user must reached to Add Program page validate by URL
	When user fill required data for Add Program for GPR with Distributor Plan
	And user click on Program Submit button
	Then user must be see Add Program success message
	Given user navigate to Onboard Program
	When user click on List Program
	Then user must reached to List Program page validate by URL
	And user must be see added SD GPR program record
	
Scenario: 5.3 - Create Super Distributor GC1 And Super Distributor GPR Program - Positive
	Given user navigate to Onboard Business
	When user click on Add Business
	Then user must reached to Add Business page validate by URL
	When user fill required data for Add Business with Equitas Processor
	And user click on Business Submit button
	Then user must be see Add Business success message
	Given user navigate to Onboard Business
	When user click on List Business
	Then user must reached to List Business page validate by URL
	And user must be see added business record
	Given user navigate to Client
	When user click on Add Client
	Then user must reached to Add Client page validate by URL
	When user fill required data for Add Client for sd client2
	And user click on Save And Continue button
	Then user must be see Add Client success message
	Given user navigate to Client
	When user click on List Client
	Then user must reached to List Client page validate by URL
	And user must be see added client record
	Given user navigate to Onboard Program
	When user click on Add Program
	Then user must reached to Add Program page validate by URL
	When user fill required data for Add Program for GC1 with Distributor Plan
	And user click on Program Submit button
	Then user must be see Add Program success message
	Given user navigate to Onboard Program
	When user click on List Program
	Then user must reached to List Program page validate by URL
	And user must be see added SD GC1 program record
	Given user navigate to Onboard Business
	When user click on Add Business
	Then user must reached to Add Business page validate by URL
	When user fill required data for Add Business with Equitas Processor
	And user click on Business Submit button
	Then user must be see Add Business success message
	Given user navigate to Onboard Business
	When user click on List Business
	Then user must reached to List Business page validate by URL
	And user must be see added business record
	Given user navigate to Onboard Program
	When user click on Add Program
	Then user must reached to Add Program page validate by URL
	When user fill required data for Add Program for GPR with Distributor Plan for client2
	And user click on Program Submit button
	Then user must be see Add Program success message
	Given user navigate to Onboard Program
	When user click on List Program
	Then user must reached to List Program page validate by URL
	And user must be see added SD GPR program1 record
	
Scenario: 5.4 - Create Distributor And Retailer For GC Program - Positive
	Given user login as Dynamic SD GC user
	Given user navigate to Distributor
	When user navigate to Add Distributor
	Then user must reached to Add Distributor page validate by URL
	When user fill required data for Add Distributor for GC
	And user click on Add Distributor Submit button
	Then user must be see Add Distributor success message
	Given user navigate to Distributor
	When user navigate to List Distributor
	Then user must reached to List Distributor page validate by URL
	When user search for distributor
	Then user must be able to see searched distributor details
	Given user login as Dynamic Distributor GC user
	Given user navigate to Retailer
	When user navigate to Add Retailer
	Then user must reached to Add Retailer page validate by URL
	When user fill required data for Add Retailer for GC
	And user click on Add Retailer Submit button
	Then user must be see Add Retailer success message
	Given user navigate to Retailer
	When user navigate to List Retailer
	Then user must reached to List Retailer page validate by URL
	When user search for retailer
	Then user must be able to see searched retailer details
	Given user login as Dynamic Retailer GC user
	Given user navigate to Customer
	When user click on Add Customer 
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user login as Dynamic Distributor GC user
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user navigate to Customer
	When user click on List Customer 
	Then user must be able to see field KYC Type
	And Field should show Full-KYC and MIN-KYC only
	And user must not be able to see Upgrade KYC button
	And user search in customer list and verify result
	
Scenario: 5.5 - Create Distributor And Retailer For GC1 Program - Positive
	Given user login as Dynamic SD GC1 user
	Given user navigate to Distributor
	When user navigate to Add Distributor
	Then user must reached to Add Distributor page validate by URL
	When user fill required data for Add Distributor for GC1
	And user click on Add Distributor Submit button
	Then user must be see Add Distributor success message
	Given user navigate to Distributor
	When user navigate to List Distributor
	Then user must reached to List Distributor page validate by URL
	When user search for distributor
	Then user must be able to see searched distributor details
	Given user login as Dynamic Distributor GC1 user
	Given user navigate to Retailer
	When user navigate to Add Retailer
	Then user must reached to Add Retailer page validate by URL
	When user fill required data for Add Retailer for GC1
	And user click on Add Retailer Submit button
	Then user must be see Add Retailer success message
	Given user navigate to Retailer
	When user navigate to List Retailer
	Then user must reached to List Retailer page validate by URL
	When user search for retailer
	Then user must be able to see searched retailer details
	Given user login as Dynamic Retailer GC1 user
	Given user navigate to Customer
	When user click on Add Customer 
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user login as Dynamic Distributor GC1 user
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user navigate to Customer
	When user click on List Customer 
	Then user must be able to see field KYC Type
	And Field should show Full-KYC and MIN-KYC only
	And user must not be able to see Upgrade KYC button
	And user search in customer list and verify result
	
Scenario: 5.6 - Create Distributor And Retailer For GPR Program - Positive
	Given user login as Dynamic SD GPR user
	Given user navigate to Distributor
	When user navigate to Add Distributor
	Then user must reached to Add Distributor page validate by URL
	When user fill required data for Add Distributor for GPR
	And user click on Add Distributor Submit button
	Then user must be see Add Distributor success message
	Given user navigate to Distributor
	When user navigate to List Distributor
	Then user must reached to List Distributor page validate by URL
	Given user navigate to Distributor
	When user search for distributor
	Then user must be able to see searched distributor details
	Given user login as Dynamic Distributor GPR user
	Given user navigate to Retailer
	When user navigate to Add Retailer
	Then user must reached to Add Retailer page validate by URL
	When user fill required data for Add Retailer for GPR
	And user click on Add Retailer Submit button
	Then user must be see Add Retailer success message
	Given user navigate to Retailer
	When user navigate to List Retailer
	Then user must reached to List Retailer page validate by URL
	When user search for retailer
	Then user must be able to see searched retailer details
	Given user login as Dynamic Retailer GPR user
	Given user navigate to Customer
	When user click on Add Customer 
	Then user must reached to Add Customer page validate by URL 
	When user fill required data for Add Customer
	And user click on Add Customer Submit button
	Then user must be see Add Customer success message
	Given user login as Dynamic Distributor GPR user
	Given user navigate to Customer
	When user click on List Customer 
	Then user must reached to List Customer page validate by URL 
	And user must be see added customer record
	Given user navigate to Customer
	When user click on List Customer 
	Then user must be able to see field KYC Type
	And Field should show Full-KYC and MIN-KYC only
	And user must not be able to see Upgrade KYC button
	And user search in customer list and verify result
	
Scenario: 5.7 - List Distributor And Retailer - Positive
	Given user login with Admin user
	Given user navigate to Distributor
	When user navigate to List Distributor
	Then user must reached to List Distributor page validate by URL
	When user search for distributor
	Then user must be able to see searched distributor details
	Given user navigate to Retailer
	When user navigate to List Retailer
	Then user must reached to List Retailer page validate by URL
	When user search for retailer
	Then user must be able to see searched retailer details
	Given user navigate to Customer in Admin
	When user click on List Customer 
	Then user must be able to see field KYC Type
	And Field should show Full-KYC and MIN-KYC only
	And user must be able to see Upgrade KYC button
	And user search in customer list and verify result