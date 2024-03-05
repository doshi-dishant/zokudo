Feature: Card Inventory Scenarios 

Scenario: 2.1 - Bulk Card Upload With GC Program- Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Program
	Then user can able to check Business Type
	When user click on choose file and hit submit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is unassigned and can download	
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Summary
	Then user must reached to Bulk Card Inv Upload Summary page validate by URL
	When user click on Search Tab
	And user select Daterange and Program and hit Filter
	Then user can check Uploaded file results
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Report
	Then user must reached to Bulk Inventory Upload Report page validate by URL
	When user click on Search Tab
	And user select Daterange/fileName/kit/Program and hit Filter
	Then user can see Uploaded file result Status for kit
		
Scenario: 2.3 - Bulk Card Upload - Already Uploaded Cards - Negative
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Program 
	Then user can able to check Business Type
	When user click on choose file and hit submit for already uploaded
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can't able to see already uploaded program cards
	When user click on Bulk Inventory Upload Summary 
	Then user can check FailureCount is equal to TotalCount
	When user click on Bulk Inventory Upload Report
	Then user can see program for status as failureReason
	
Scenario: 2.4 - Bulk Card Upload - Few Cards Already Uploaded - Negative
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Program  
	Then user can able to check Business Type
	When user click on choose file and hit submit with few already uploaded
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can't able to see already uploaded program cards
	When user click on Bulk Inventory Upload Summary 
	Then user can check FailureCount is equal to TotalCount
	When user click on Bulk Inventory Upload Report
	Then user can see program for status as failureReason
	
Scenario: 2.5 - Bulk Card Upload - Empty File Uploaded - Negative
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Program  
	Then user can able to check Business Type
	When user click on choose file and hit submit with empty file
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can't able to see already uploaded program cards
	When user click on Bulk Inventory Upload Summary 
	Then user can check FailureCount is equal to TotalCount
	When user click on Bulk Inventory Upload Report
	Then user can see program for status as failureReason

Scenario: 2.6 - Bulk Card Upload - Already Uploaded Card From Different Program - Negative
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select new Program
	Then user can able to check Business Type
	When user choose file consist of already uploaded card from different program and hit submit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can't able to see uploaded program cards
	When user click on Bulk Inventory Upload Summary 
	Then user can check FailureCount is equal to TotalCount
	When user click on Bulk Inventory Upload Report
	Then user can see program for status as failureReason
	
Scenario: 2.7 - Bulk Card Upload - Consist Of Invalid KitNo And MaskedNo - Negative
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Program
	Then user can able to check Business Type
	When user choose file consist of invalid KitNo and MaskedNo and hit submit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can't able to see uploaded program cards
	When user click on Bulk Inventory Upload Summary 
	Then user can check FailureCount is equal to TotalCount
	When user click on Bulk Inventory Upload Report
	Then user can see program for status as failureReason
	
Scenario: 2.18 - Bulk Card Upload With GPR Program- Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select GPR Program
	Then user can able to check Business Type
	When user click on choose file for GPR program and hit submit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to check status of Kit No is unassigned and can download 	
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Summary
	Then user must reached to Bulk Card Inv Upload Summary page validate by URL
	When user click on Search Tab
	And user select Daterange and GPR Program and hit Filter
	Then user can check Uploaded file results
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Report
	Then user must reached to Bulk Inventory Upload Report page validate by URL
	When user click on Search Tab
	And user select Daterange/fileName/kit/GPRProgram and hit Filter
	Then user can see Uploaded file result Status for kit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to verify kit is uploaded with unassign status
	
Scenario: 3.9 - Bulk Card Upload With Default GPR Program- Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Default GPR Program
	Then user can able to check Business Type
	When user click on choose file for Default GPR program and hit submit
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Summary
	Then user must reached to Bulk Card Inv Upload Summary page validate by URL
	When user click on Search Tab
	And user select Daterange and Default GPR Program and hit Filter
	Then user can check Uploaded file results
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Report
	Then user must reached to Bulk Inventory Upload Report page validate by URL
	When user click on Search Tab
	And user select Daterange/fileName/kit/DefaultGPRProgram and hit Filter
	Then user can see Uploaded file result Status for kit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to verify kit is uploaded with unassign status
	
Scenario: 3.14 - Bulk Card Upload With Default GC Program- Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Default GC Program
	Then user can able to check Business Type
	When user click on choose file for Default GC program and hit submit
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Summary
	Then user must reached to Bulk Card Inv Upload Summary page validate by URL
	When user click on Search Tab
	And user select Daterange and Default GC Program and hit Filter
	Then user can check Uploaded file results
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Report
	Then user must reached to Bulk Inventory Upload Report page validate by URL
	When user click on Search Tab
	And user select Daterange/fileName/kit/DefaultGCProgram and hit Filter
	Then user can see Uploaded file result Status for kit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to verify kit is uploaded with unassign status
	
Scenario: 4.1 - Bulk Card Upload With Default GC1 Program- Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select Default GC1 Program
	Then user can able to check Business Type
	When user click on choose file for Default GC1 program and hit submit
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Summary
	Then user must reached to Bulk Card Inv Upload Summary page validate by URL
	When user click on Search Tab
	And user select Daterange and Default GC1 Program and hit Filter
	Then user can check Uploaded file results
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Report
	Then user must reached to Bulk Inventory Upload Report page validate by URL
	When user click on Search Tab
	And user select Daterange/fileName/kit/DefaultGC1Program and hit Filter
	Then user can see Uploaded file result Status for kit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to verify kit is uploaded with unassign status
	
Scenario: 4.6 - Bulk Card Upload With GC1 Program- Positive
	Given user login with Admin user
	Given user navigate to Card Inventory
	When user click on Bulk Card  
	Then user must reached to Card Inventory Upload page validate by URL
	When user select GC1 Program
	Then user can able to check Business Type
	When user click on choose file for GC1 program and hit submit
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Summary
	Then user must reached to Bulk Card Inv Upload Summary page validate by URL
	When user click on Search Tab
	And user select Daterange and GC1 Program and hit Filter
	Then user can check Uploaded file results
	Given user navigate to Card Inventory
	When user click on Bulk Inventory Upload Report
	Then user must reached to Bulk Inventory Upload Report page validate by URL
	When user click on Search Tab
	And user select Daterange/fileName/kit/DefaultGC1Program and hit Filter
	Then user can see Uploaded file result Status for kit
	Given user navigate to Card Inventory
	When user navigate to List Inventory
	Then user can able to verify kit is uploaded with unassign status