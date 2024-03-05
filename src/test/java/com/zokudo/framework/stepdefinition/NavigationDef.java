package com.zokudo.framework.stepdefinition;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.NavigationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationDef {
	private NavigationPage nP = new NavigationPage(ObjectRepo.driver);

	@Given("^user navigate to Bulk Operations$")
	public void user_navigate_to_Bulk_Operations() throws Throwable {
		nP.navigateToBulkOperations();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Operations\"");
	}

	@When("^user click on Bulk Upload$")
	public void user_click_on_Bulk_Upload() throws Throwable {
		nP.navigateToBulkUpload();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Upload\"");
	}

	@And("^user click on Card Upload Summary$")
	public void user_click_on_Card_Upload_Summary() throws Throwable {
		nP.navigateToCardUploadSummary();
		InitializeWebDriver.scenario.write("Navigate to \"Card Upload Summary\"");
	}

	@And("^user click on Bulk Card Report$")
	public void user_click_on_Bulk_Card_Report() throws Throwable {
		nP.navigateToBulkCardReport();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Card Report\"");
	}

	@And("^user click on Bulk Card Load Report$")
	public void user_click_on_Bulk_Card_Load_Report() throws Throwable {
		nP.navigateToBulkCardLoadReport();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Card Load Report\"");
	}

	@Given("^user navigate to Card$")
	public void user_navigate_to_Card() throws Throwable {
		nP.navigateToCard();
		InitializeWebDriver.scenario.write("Navigate to \"Cards\"");
	}

	@When("^user click on Transaction Report$")
	public void user_click_on_Transaction_Report() throws Throwable {
		nP.navigateToTransactionReport();
		InitializeWebDriver.scenario.write("Navigate to \"Transaction Report\"");
	}

	@When("^user click on Load Reversal Report$")
	public void user_click_on_Load_Reversal_Report() throws Throwable {
		nP.navigateToLoadReversalReport();
		InitializeWebDriver.scenario.write("Navigate to \"Load Reversal Report\"");
	}

	@When("^user click on Bulk Card$")
	public void user_click_on_Bulk_Card() throws Throwable {
		nP.navigateToBulkCardupload();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Card\"");
	}

	@When("^user click on Bulk Inventory Upload Summary$")
	public void user_click_on_Bulk_Inventory_Upload_Summary() throws Throwable {
		nP.navigateToBulkInvUploadSummary();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Inventory Upload Summary\"");
	}

	@When("^user click on Customer Upload Summary$")
	public void user_click_on_Customer_Upload_Summary() throws Throwable {
		nP.navigateToCustomerUploadSummary();
		InitializeWebDriver.scenario.write("Navigate to \"Customer Upload Summary\"");
	}

	@When("^user click on Bulk Customer Report$")
	public void user_click_on_Bulk_Customer_Report() throws Throwable {
		nP.navigateToBulkCustomerReport();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Customer Report\"");
	}

	@When("^user click on Bulk Inventory Upload Report$")
	public void user_click_on_Bulk_Inventory_Upload_Report() throws Throwable {
		nP.navigateToBulkInvUploadReport();
		InitializeWebDriver.scenario.write("Navigate to \"Bulk Inventory Upload Report\"");
	}

	@Given("^user navigate to Onboard Business$")
	public void user_navigate_to_Onboard_Business() throws Throwable {
		nP.navigateToOnboardBusiness();
		InitializeWebDriver.scenario.write("Navigate to \"Onboard Business\"");
	}

	@When("^user click on Add Business$")
	public void user_click_on_Add_Business() throws Throwable {
		nP.navigateToAddBusiness();
		InitializeWebDriver.scenario.write("Navigate to \"Add Business\"");
	}

	@When("^user click on List Business$")
	public void user_click_on_List_Business() throws Throwable {
		nP.navigateToListBusiness();
		InitializeWebDriver.scenario.write("Navigate to \"List Business\"");
	}

	@Given("^user navigate to Merchant$")
	public void user_navigate_to_Merchant() throws Throwable {
		nP.navigateToMerchant();
		InitializeWebDriver.scenario.write("Navigate to \"Merchant\"");
	}

	@When("^user click on Add Brand$")
	public void user_click_on_Add_Brand() throws Throwable {
		nP.navigateToAddBrand();
		InitializeWebDriver.scenario.write("Navigate to \"Add Brand\"");
	}

	@When("^user click on List Brand$")
	public void user_click_on_List_Brand() throws Throwable {
		nP.navigateToListBrand();
		InitializeWebDriver.scenario.write("Navigate to \"List Brand\"");
	}

	@When("^user click on Add Merchant$")
	public void user_click_on_Add_Merchant() throws Throwable {
		nP.navigateToAddMerchant();
		InitializeWebDriver.scenario.write("Navigate to \"Add Merchant\"");
	}

	@When("^user click on List Merchant$")
	public void user_click_on_List_Merchant() throws Throwable {
		nP.navigateToListMerchant();
		InitializeWebDriver.scenario.write("Navigate to \"List Merchant\"");
	}

	@When("^user click on Create Offer$")
	public void user_click_on_Create_Offer() throws Throwable {
		nP.navigateToCreateOffer();
		InitializeWebDriver.scenario.write("Navigate to \"Create Offer\"");
	}

	@When("^user click on List Offer$")
	public void user_click_on_List_Offer() throws Throwable {
		nP.navigateToListOffer();
		InitializeWebDriver.scenario.write("Navigate to \"List Offer\"");
	}

	@Given("^user navigate to Client$")
	public void user_navigate_to_Client() throws Throwable {
		nP.navigateToClient();
		InitializeWebDriver.scenario.write("Navigate to \"Client\"");
	}

	@When("^user click on Add Client$")
	public void user_click_on_Add_Client() throws Throwable {
		nP.navigateToAddClient();
		InitializeWebDriver.scenario.write("Navigate to \"Add Client\"");
	}

	@When("^user click on List Client$")
	public void user_click_on_List_Client() throws Throwable {
		nP.navigateToListClient();
		InitializeWebDriver.scenario.write("Navigate to \"List Client\"");
	}

	@Given("^user navigate to Onboard Program$")
	public void user_navigate_to_Onboard_Program() throws Throwable {
		nP.navigateToOnboardProgram();
		InitializeWebDriver.scenario.write("Navigate to \"Onboard Program\"");
	}

	@When("^user click on Add Program$")
	public void user_click_on_Add_Program() throws Throwable {
		nP.navigateToAddProgram();
		InitializeWebDriver.scenario.write("Navigate to \"Add Program\"");
	}

	@When("^user click on List Program$")
	public void user_click_on_List_Program() throws Throwable {
		nP.navigateToListProgram();
		InitializeWebDriver.scenario.write("Navigate to \"List Program\"");
	}

	@Given("^user navigate to Customer$")
	public void user_navigate_to_Customer() throws Throwable {
		nP.navigateToCustomer();
		InitializeWebDriver.scenario.write("Navigate to \"Customer\"");
	}

	@Given("^user navigate to Customer in Admin$")
	public void user_navigate_to_Customer_in_admin() throws Throwable {
		nP.navigateToCustomer();
		InitializeWebDriver.scenario.write("Navigate to \"Customer\" in admin");
	}

	@When("^user click on List Customer$")
	public void user_click_on_List_Customer() throws Throwable {
		nP.navigateToListCustomer();
		InitializeWebDriver.scenario.write("Navigate to \"List Customer\"");
	}

	@When("^user click on Add Customer$")
	public void user_must_be_see_added_customer_record() throws Throwable {
		nP.navigateToAddCustomer();
		InitializeWebDriver.scenario.write("Navigate to \"Add Customer\"");
	}

	@Given("^user navigate to Dashboard Balance$")
	public void user_navigate_to_Dashboard_Balance() throws Throwable {
		nP.navigateToDashboardBalance();
		InitializeWebDriver.scenario.write("Navigate to \"Dashboard Balance\"");
	}

	@Given("^user navigate to EOD Report List$")
	public void user_navigate_to_EOD_Report_List() throws Throwable {
		nP.navigateToEODReportList();
		InitializeWebDriver.scenario.write("Navigate to \"EOD Report List\"");
	}

	@When("^user click on Report List$")
	public void user_click_on_Report_List() throws Throwable {
		nP.navigateToReportList();
		InitializeWebDriver.scenario.write("Navigate to \"Report List\"");
	}

	@Given("^user navigate to Dashboard$")
	public void user_navigate_to_Dashboard() throws Throwable {
		nP.navigateToDashboard();
		InitializeWebDriver.scenario.write("Navigate to \"Dashboard\"");
	}

	@Given("^user navigate to Card Inventory$")
	public void user_navigate_to_Card_Inventory() throws Throwable {
		nP.navigateToCardInventory();
		InitializeWebDriver.scenario.write("Navigate to \"Card Inventory\"");
	}

	@When("^user navigate to List Inventory$")
	public void user_navigate_to_List_Inventory() throws Throwable {
		nP.navigateToListInventory();
		InitializeWebDriver.scenario.write("Navigate to \"List Inventory\"");
	}

	@Given("^user navigate to Kit Assign$")
	public void user_navigate_to_Kit_Assign() throws Throwable {
		nP.navigateToKitAssign();
		InitializeWebDriver.scenario.write("Navigate to \"Kit Assign\"");
	}

	@When("^user click on Single/Bulk Kit Assign$")
	public void user_click_on_Single_Bulk_Kit_Assign() throws Throwable {
		nP.navigateToSingleOrBulkKitAssign();
		InitializeWebDriver.scenario.write("Navigate to \"Single/Bulk Kit Assign\"");
	}

	@When("^user click on List Assigned Kit$")
	public void user_click_on_List_Assigned_Kit() throws Throwable {
		nP.navigateToListAssignedKit();
		InitializeWebDriver.scenario.write("Navigate to \"List Assigned Kit\"");
	}

	@When("^user navigate to Inventory Summary$")
	public void user_navigate_to_Inventory_Summary() throws Throwable {
		nP.navigateToInventorySummary();
		InitializeWebDriver.scenario.write("Navigate to \"Inventory Summary\"");
	}

	@When("^user click on Card Issuance$")
	public void user_click_on_Card_Issuance() throws Throwable {
		nP.navigateToCardIssuance();
		InitializeWebDriver.scenario.write("Navigate to \"Card Issuance\"");
	}

	@Then("^user click on Card List$")
	public void user_click_on_Card_List() throws Throwable {
		nP.navigateToCardList();
		InitializeWebDriver.scenario.write("Navigate to \"Card List\"");
	}

	@When("^user click on Load Card$")
	public void user_click_on_Load_Card() throws Throwable {
		nP.navigateToLoadCard();
		InitializeWebDriver.scenario.write("Navigate to \"Load Card\"");
	}

	@When("^user click on Card TO Card Transfer$")
	public void user_click_on_Card_TO_Card_Transfer() throws Throwable {
		nP.navigateToCardToCardTransfer();
		InitializeWebDriver.scenario.write("Navigate to \"Card TO Card Transfer\"");
	}

	@When("^user click on Load Reversal$")
	public void user_click_on_Load_Reversal() throws Throwable {
		nP.navigateToLoadReversal();
		InitializeWebDriver.scenario.write("Navigate to \"Load Reversal\"");
	}

	@Given("^user navigate to Distributor$")
	public void user_navigate_to_Distributor() throws Throwable {
		nP.navigateToDistributor();
		InitializeWebDriver.scenario.write("Navigate to \"Distributor\"");
	}

	@When("^user navigate to Add Distributor$")
	public void user_navigate_to_Add_Distributor() throws Throwable {
		nP.clickOnAddDistributor();
		InitializeWebDriver.scenario.write("Navigate to \"Add Distributor\"");
	}

	@When("^user navigate to Add Retailer$")
	public void user_navigate_to_Add_Retailer() throws Throwable {
		nP.clickOnAddRetailer();
		InitializeWebDriver.scenario.write("Navigate to \"Add Retailer\"");
	}

	@When("^user navigate to List Retailer$")
	public void user_navigate_to_List_Retailer() throws Throwable {
		nP.clickOnListRetailer();
		InitializeWebDriver.scenario.write("Navigate to \"List Retailer\"");
	}

	@When("^user click on Kit Assign Retailer$")
	public void user_click_on_Kit_Assign_Retailer() throws Throwable {
		nP.clickOnKitAssignRetailer();
		InitializeWebDriver.scenario.write("Navigate to \"Kit Assign Retailer\"");
	}

	@When("^user click on Kit Assign Distributor$")
	public void user_click_on_Kit_Assign_Distributor() throws Throwable {
		nP.clickOnKitAssignDistributor();
		InitializeWebDriver.scenario.write("Navigate to \"Kit Assign Distributor\"");
	}

	@When("^user navigate to List Distributor$")
	public void user_navigate_to_List_Distributor() throws Throwable {
		nP.clickOnListDistributor();
		InitializeWebDriver.scenario.write("Navigate to \"List Distributor\"");
	}

	@Given("^user navigate to Retailer$")
	public void user_navigate_to_Retailer() throws Throwable {
		nP.navigateToRetailer();
		InitializeWebDriver.scenario.write("Navigate to \"Retailer\"");
	}

	@Given("^user navigate to Card Details$")
	public void user_navigate_to_Card_Details() throws Throwable {
		nP.navigateToCardDetails();
		InitializeWebDriver.scenario.write("Navigate to \"Card Details\"");
	}

	@When("^user click on Download Card Details$")
	public void user_click_on_Download_Card_Details() throws Throwable {
		nP.navigateToDownloadCardDetails();
		InitializeWebDriver.scenario.write("Navigate to \"Download Card Details\"");
	}

	@Given("^user navigate to Pocket$")
	public void user_navigate_to_Pocket() throws Throwable {
		nP.navigateToPocket();
		InitializeWebDriver.scenario.write("Navigate to \"Pocket\"");
	}

	@When("^user click on Add Pocket$")
	public void user_click_on_Add_Pocket() throws Throwable {
		nP.navigateToAddPocket();
		InitializeWebDriver.scenario.write("Navigate to \"Add Pocket\"");
	}

	@When("^user click on List Pocket$")
	public void user_click_on_List_Pocket() throws Throwable {
		nP.navigateToListPocket();
		InitializeWebDriver.scenario.write("Navigate to \"List Pocket\"");
	}

	@When("^user navigate to Prefund$")
	public void user_navigate_to_Prefund() throws Throwable {
		nP.navigateToPrefund();
		InitializeWebDriver.scenario.write("Navigate to \"Prefund\"");
	}

	@And("^user click on Prefund List$")
	public void user_click_on_Prefund_List() throws Throwable {
		nP.navigateToListPrefund();
		InitializeWebDriver.scenario.write("Navigate to \"Prefund List\"");
	}

	@And("^user click on Prefund Request$")
	public void user_click_on_Prefund_Request() throws Throwable {
		nP.navigateToPrefundRequest();
		InitializeWebDriver.scenario.write("Navigate to \"Prefund Request\"");
	}

	@Given("^user navigate to Virtual Account$")
	public void user_navigate_to_Virtual_Account() throws Throwable {
		nP.navigateToVirtualAccount();
		InitializeWebDriver.scenario.write("Navigate to \"Virtual Account\"");
	}

	@When("^user navigate to List Virtual Account$")
	public void user_navigate_to_List_Virtual_Account() throws Throwable {
		nP.navigateToListVirtualAccount();
		InitializeWebDriver.scenario.write("Navigate to \"List Virtual Account\"");
	}

	@Given("^user navigate to Limit$")
	public void user_navigate_to_Limit() throws Throwable {
		nP.navigateToLimit();
		InitializeWebDriver.scenario.write("Navigate to \"Limit\"");
	}

	@When("^user navigate to Set Wallet Limit$")
	public void user_navigate_to_Set_Wallet_Limit() throws Throwable {
		nP.navigateToSetWalletLimit();
		InitializeWebDriver.scenario.write("Navigate to \"Set Wallet Limit\"");
	}

	@When("^user navigate to Set KYC Limit$")
	public void user_navigate_to_Set_KYC_Limit() throws Throwable {
		nP.navigateToSetKYCLimit();
		InitializeWebDriver.scenario.write("Navigate to \"Set KYC Limit\"");
	}

	@When("^user click on KYC List$")
	public void user_click_on_KYC_List() throws Throwable {
		nP.navigateToKYCList();
		InitializeWebDriver.scenario.write("Navigate to \"KYC List\"");
	}

	@Given("^user navigate to MCC Mark-Up Config$")
	public void user_navigate_to_MCC_Mark_Up_Config() throws Throwable {
		nP.navigateToMCCMarkupConfig();
		InitializeWebDriver.scenario.write("Navigate to \"MCC Mark-Up Config\"");
	}

	@When("^user navigate to Set MCC MarkUp$")
	public void user_navigate_to_Set_MCC_MarkUp() throws Throwable {
		nP.navigateToSetMCCMarkup();
		InitializeWebDriver.scenario.write("Navigate to \"Set MCC MarkUp\"");
	}

	@When("^user navigate to List MCC MarkUp$")
	public void user_navigate_to_List_MCC_MarkUp() throws Throwable {
		nP.navigateToListMCCMarkup();
		InitializeWebDriver.scenario.write("Navigate to \"List MCC MarkUp\"");
	}

	@When("^user navigate to MCC Markup Upload Summary$")
	public void user_navigate_to_MCC_Markup_Upload_Summary() throws Throwable {
		nP.navigateToMCCMarkupUploadSummary();
		InitializeWebDriver.scenario.write("Navigate to \"MCC Markup Upload Summary\"");
	}

	@When("^user navigate to MCC Markup Upload Report$")
	public void user_navigate_to_MCC_Markup_Upload_Report() throws Throwable {
		nP.navigateToMCCMarkupUploadReport();
		InitializeWebDriver.scenario.write("Navigate to \"MCC Markup Upload Report\"");
	}

	@When("^user navigate to Fee Configuration$")
	public void user_navigate_to_Fee_Configuration() throws Throwable {
		nP.navigateToFeeConfiguration();
		InitializeWebDriver.scenario.write("Navigate to \"Fee Configuration\"");
	}

	@Given("^user navigate to Fee Or Revenue Management$")
	public void user_navigate_to_Fee_Or_Revenue_Management() throws Throwable {
		nP.navigateFeeRevenueManagement();
		InitializeWebDriver.scenario.write("Navigate to \"Fee | Revenue Management\"");
	}
}