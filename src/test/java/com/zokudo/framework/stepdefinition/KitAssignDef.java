package com.zokudo.framework.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.framework.utility.CSVHelper;
import com.zokudo.helper.PageObject.BulkOperationsPage;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.CustomerPage;
import com.zokudo.helper.PageObject.KitAssignPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KitAssignDef {

	private KitAssignPage kP = new KitAssignPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private BulkOperationsPage bP = new BulkOperationsPage(ObjectRepo.driver);
	private CustomerPage clP = new CustomerPage(ObjectRepo.driver);
	private static String kitDetails, kitDetails1, kitDetails2;
	private static String filePath;
	private static String kitNumber, kitNumber1, kitNumber2, kitNumberToCard;
	private static String GCDistributorName = "Distributor1";
	private static String GPRDistributorName = "Distributor21";
	private static String GCRetailerName = "Retailer1";
	private static String GPRRetailerName = "Retailer211";
	private static String GC1DistributorName = "DistributorGC11";
	private static String GC1RetailerName = "RetailerGC111";
	private static final String lastName = RandomStringUtils.randomAlphabetic(5);
	private static final String address1 = RandomStringUtils.randomAlphabetic(10);
	private static final String address2 = RandomStringUtils.randomAlphabetic(10);
	private static final String postalCode = RandomStringUtils.randomNumeric(6);
	private static final String state = RandomStringUtils.randomAlphabetic(5);
	private static final String city = RandomStringUtils.randomAlphabetic(5);

	@Then("^user can able to check status of Kit No is unassigned for Single Kit$")
	public void user_can_able_to_check_status_of_Kit_No_is_unassigned_for_Single_Kit() throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Verified status of kit number " + kitNumber + "is unassigned");
	}

	@Then("^user must reached to Single/Bulk Kit Assign page validate by URL$")
	public void user_must_reached_to_Single_Bulk_Kit_Assign_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getSingleOrBulkKitAssignURL());
		InitializeWebDriver.scenario.write("Reached to Single/Bulk Kit Assign page");
	}

	@When("^user fill required data for single kit assign$")
	public void user_fill_required_data_for_single_kit_assign() throws Throwable {
		String s = "";
		kP.selectClient(Constants.clientName);
		s = "Select " + Constants.clientName + "\n";
		kP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on kit assign submit button$")
	public void user_click_on_kit_assign_submit_button() throws Throwable {
		kP.clickOnSubmitButton();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Kit Assign success message for single assign$")
	public void user_must_be_see_Kit_Assign_success_message_for_single_assign() throws Throwable {
		kP.verifyKitAssignSuccessMessageForSingleAssign();
		InitializeWebDriver.scenario.write("Verified message \"KIT assigned successfully.\"");
	}

	@Then("^user must be see Kit Assign success message for bulk assign$")
	public void user_must_be_see_Kit_Assign_success_message_for_bulk_assign() throws Throwable {
		kP.verifyKitAssignSuccessMessageForBulkAssign();
		InitializeWebDriver.scenario.write("Verified message \"Bulk KIT Assign file uploaded successfully.\"");
	}

	@Then("^user must be see Kit Assign failure message for bulk assign$")
	public void user_must_be_see_Kit_Assign_failure_messagefor_bulk_assign() throws Throwable {
		kP.verifyKitAssignFailureMessageForBulkAssign();
		InitializeWebDriver.scenario.write("Verified message \"Unable to Assign KIT.\"");
	}

	@Then("^user must reached to List Assigned Kit page validate by URL$")
	public void user_must_reached_to_List_Assigned_Kit_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListAssignedKitURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list assigned kit page");
	}

	@When("^user search for Kit No$")
	public void user_search_for_Kit_No() throws Throwable {
		kP.searchForKitNo(kitNumber);
	}

	@And("^user search for Kit No in Assigned Kit$")
	public void user_search_for_Kit_No_in_Assigned_Kit() throws Throwable {

	}

	@Then("^user must be see result and Kit No status is assigned$")
	public void user_must_be_see_result_and_Kit_No_status_is_assigned() throws Throwable {
		kP.verifyKitStatusIsAssigned(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user must be see result and Kit No status is unassigned$")
	public void user_must_be_see_result_and_Kit_No_status_is_unassigned() throws Throwable {
		kP.verifyKitStatusIsUnassigned(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
	}

	@Then("^user can able to check status of Kit No is assigned$")
	public void user_can_able_to_check_status_of_Kit_No_is_assigned() throws Throwable {
		kP.checkStatusIsAssigned(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@When("^user search for Program$")
	public void user_search_for_Program() throws Throwable {
		kP.searchWithProgram(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Search program " + Constants.GC_ProgramName);
	}

	@Then("^user must be see updated Kit details$")
	public void user_must_be_see_updated_Kit_details() throws Throwable {
		kP.verifyUpdatedDetails();
	}

	@Then("^user must be see searched records$")
	public void user_must_be_see_searched_records() throws Throwable {
		kP.verifyKitIsAssigned(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Kit No is unassigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_Kit_No_is_unassigned_for_Bulk_Kit() throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC_ProgramName);
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
//		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
	}

	@Then("^user can able to check status of Kit Number is unassigned for Bulk Kit for blank exp date$")
	public void user_can_able_to_check_status_of_Kit_Number_is_unassigned_for_Bulk_Kit_for_blank_exp_date()
			throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		kitNumber = RandomStringUtils.randomNumeric(8);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, "" });
//		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
	}

	@Then("^user can able to check status of Kit No is assigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_Kit_No_is_assigned_for_Bulk_Kit() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssigned(Constants.GC_ProgramName);
		kitNumber = cP.getUsedKitNumber(Constants.GC_ProgramName);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GPR Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_GPR_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Default GC1 Client2 Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_Default_GC1_Client2_Kit_No_is_assigned_for_Card_Issue()
			throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GC1 Client2 Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_GC1_Client2_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GC Client2 Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_GC_Client2_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Default GC Client2 Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_Default_GC_Client2_Kit_No_is_assigned_for_Card_Issue()
			throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Default GPR Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_Default_GPR_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GPR_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Default GC Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_Default_GC_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Default GC Kit No is assigned for Card Issue second$")
	public void user_can_able_to_check_status_of_Default_GC_Kit_No_is_assigned_for_Card_Issue_second()
			throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
	}

	@Then("^user can able to check status of Default GC1 Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_Default_GC1_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GC1 Kit No is assigned for Card Issue$")
	public void user_can_able_to_check_status_of_GC1_Kit_No_is_assigned_for_Card_Issue() throws Throwable {
//		kitNumber = kP.verifyKitNoIsAssignedForCardIssue(Constants.GC_ProgramName);
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of Kit No is assigned and unassigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_Kit_No_is_assigned_and_unassigned_for_Bulk_Kit() throws Throwable {
		kitNumber = kP.verifyKitNoIsAssigned(Constants.GC_ProgramName);
		String s = "Status of kit number " + kitNumber + " is assigned\n";
		new GenericHelper(ObjectRepo.driver).reloadPage();
		kitNumber1 = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		s = s + "Status of kit number " + kitNumber1 + " is unassigned\n";
		InitializeWebDriver.scenario.write(s);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, "2024-07-26" });
		values.add(new String[] { kitNumber1, "2024-07-26" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@When("^user fill required data for bulk kit assign$")
	public void user_fill_required_data_for_bulk_kit_assign() throws Throwable {
		kP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		kP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for bulk kit assign with empty sheet$")
	public void user_fill_required_data_for_bulk_kit_assign_with_empty_sheet() throws Throwable {
		filePath = Constants.uploadPath + "bulk_kit_assign_with_empty.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "", "" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		kP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		kP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for bulk kit assign with Invalid Kit No$")
	public void user_fill_required_data_for_bulk_kit_assign_with_invalid_Kit_No() throws Throwable {
		filePath = Constants.uploadPath + "bulk_kit_assign_invalid_kit.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		kitNumber = "123456";
		String s = "Kit no is 123456\n";
		values.add(new String[] { kitNumber, "2024-07-26" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		kP.selectClient(Constants.clientName);
		s = s + "Select " + Constants.clientName + "\n";
		kP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for bulk kit assign with blank expiry date$")
	public void user_fill_required_data_for_bulk_kit_assign_with_blank_expiry_date() throws Throwable {
		filePath = Constants.uploadPath + "bulk_kit_assign_blank_date.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "1234", "" });
		values.add(new String[] { "3445", "" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		kP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		kP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Card Issuance submit button$")
	public void user_click_on_Card_Issuance_submit_button() throws Throwable {
		kP.clickOnCardIssuedSubmitButton();
		String s = "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see Card Issuance success message$")
	public void user_must_be_see_Card_Issuance_success_message() throws Throwable {
		kP.verifyCardIssuedSuccessMessage();
	}

	@And("^update Kit Status to Card Issued To Card$")
	public void update_Kit_Status_to_Card_Issued_To_Card() throws Throwable {
		cP.updateStatus(kitNumberToCard, "Card Issued");
	}

	@Then("^user must be see Card Issuance kyc upgrade message$")
	public void user_must_be_see_Card_Issuance_kyc_upgrade_message() throws Throwable {
		kP.verifyCardIssuedKYCUpgradeMessage();
		InitializeWebDriver.scenario
				.write("Verified message \"Please upgrade to FULL_KYC to receive Zokudo GPR card!\"");
	}

	@Then("^user must be see Card Issuance maximum card limit exceeded message$")
	public void user_must_be_see_Card_Issuance_maximum_card_limit_exceeded_message() throws Throwable {

	}

	@Then("^user must be see Card Issuance multiple GPR cards not allowed message$")
	public void user_must_be_see_Card_Issuance_multiple_GPR_cards_not_allowed_message() throws Throwable {
		kP.verifyCardIssuedMultipleGPRCardNotAllowedMessage();
		InitializeWebDriver.scenario.write("Verified message \"customer is not allowed to have multiple GPR cards!\"");
	}

	@And("^user search for customer details$")
	public void user_search_for_customer_details() throws Throwable {
		kP.searchForCustomerDetails(kitNumber);
	}

	@Then("^user must reached to Card Issuance page validate by URL$")
	public void user_must_reached_to_Card_Issuance_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getCardIssuanceURL());
		InitializeWebDriver.scenario.write("Verified that user reached on card issuance page");
	}

	@Then("^user must be able to see searched customer details$")
	public void user_must_be_able_to_see_searched_customer_details() throws Throwable {
		kP.verifySearchedCustomerDetails(DataConstants.customerMobileNo);
		InitializeWebDriver.scenario
				.write("Verified that customer is present in syatem and customer's mobile number is "
						+ DataConstants.customerMobileNo);
	}

	@Then("^user must be able to see searched card details$")
	public void user_must_be_able_to_see_searched_card_details() throws Throwable {
		kP.verifySearchedCustomerDetails(kitNumber);
		InitializeWebDriver.scenario.write("Verified that kit number " + kitNumber + "is present in syatem");
	}

	@Then("^user not be able to see searched card details$")
	public void user_not_be_able_to_see_searched_card_details() throws Throwable {
		kP.verifySearchedCustomerDetailsNotFound(kitNumber);
		InitializeWebDriver.scenario.write("Verified that customer is not present in syatem");
	}

	@Then("^user can able to check assigned kit no for distributor$")
	public void user_can_able_to_check_assigned_kit_no_for_distributor() throws Throwable {
//		kitNumber = kP.verifyAssignedKitNoForDistributor();
		kitNumber = cP.getKitNumberForDistributor(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check assigned kit no for retailer")
	public void user_can_able_to_check_assigned_kit_no_for_retailer() throws Throwable {
		kitNumber = cP.getKitNumberForRetailer(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check GPR assigned kit no for retailer")
	public void user_can_able_to_check_GPR_assigned_kit_no_for_retailer() throws Throwable {
		kitNumber = cP.getKitNumberForRetailer(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check GC1 assigned kit no for retailer")
	public void user_can_able_to_check_GC1_assigned_kit_no_for_retailer() throws Throwable {
		kitNumber = cP.getKitNumberForRetailer(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check assigned kit no for distributor bulk$")
	public void user_can_able_to_check_assigned_kit_no_for_distributor_bulk() throws Throwable {
//		kitNumber = kP.verifyAssignedKitNoForDistributorForBulk();
		kitNumber = cP.getKitNumberForDistributor(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		filePath = Constants.uploadPath + "gc_bulk_kit_assign_distributor.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
//		kitNumber = cP.getKitNumberForDistributor(Constants.GC_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to check GPR assigned kit no for distributor bulk$")
	public void user_can_able_to_check_GPR_assigned_kit_no_for_distributor_bulk() throws Throwable {
//		kitNumber = kP.verifyAssignedKitNoForDistributorForBulk();
		kitNumber = cP.getKitNumberForDistributor(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		filePath = Constants.uploadPath + "gpr_bulk_kit_assign_distributor.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
//		kitNumber = cP.getKitNumberForDistributor(Constants.GPR_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to check GC1 assigned kit no for distributor bulk$")
	public void user_can_able_to_check_GC1_assigned_kit_no_for_distributor_bulk() throws Throwable {
//		kitNumber = kP.verifyAssignedKitNoForDistributorForBulk();
		kitNumber = cP.getKitNumberForDistributor(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		filePath = Constants.uploadPath + "gc1_bulk_kit_assign_distributor.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
//		kitNumber = cP.getKitNumberForDistributor(Constants.GPR_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to fetch assigned kit no for retailer bulk$")
	public void user_can_able_to_check_assigned_kit_no_for_retailer_bulk() throws Throwable {
//		kitNumber = kP.verifyAssignedKitNoForDistributorForBulk();
		kitNumber = cP.getKitNumberForRetailer(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
//		kitNumber = cP.getKitNumberForRetailer(Constants.GC_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to fetch assigned GPR kit no for retailer bulk$")
	public void user_can_able_to_check_assigned_GPR_kit_no_for_retailer_bulk() throws Throwable {
//		kitNumber = kP.verifyAssignedKitNoForDistributorForBulk();
		kitNumber = cP.getKitNumberForRetailer(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
//		kitNumber = cP.getKitNumberForRetailer(Constants.GPR_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to fetch assigned GC1 kit no for retailer bulk$")
	public void user_can_able_to_check_assigned_GC1_kit_no_for_retailer_bulk() throws Throwable {
//		kitNumber = kP.verifyAssignedKitNoForDistributorForBulk();
		kitNumber = cP.getKitNumberForRetailer(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
//		kitNumber = cP.getKitNumberForRetailer(Constants.GPR_ProgramName);
//		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user must reached to Kit Assign Distributor page validate by URL$")
	public void user_must_reached_to_Kit_Assign_Distributor_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getKitAssignDistributorURL());
		InitializeWebDriver.scenario.write("Verified that user reached on kit assign to distributor page");
	}

	@When("^user fill required data for kit assign to distributor$")
	public void user_fill_required_data_for_kit_assign_to_distributor() throws Throwable {
		kP.selectDistributor(GCDistributorName);
		String s = "Select " + GCDistributorName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see Kit Assign success message for kit assign distributor$")
	public void user_must_be_see_Kit_Assign_success_message_for_kit_assign_distributor() throws Throwable {
		kP.verifyKitAssignSuccessMessageForSingleAssign();
		InitializeWebDriver.scenario.write("Verified message \"KIT assigned successfully.\"");
	}

	@Then("^user can able to check status of Kit No is assigned for distributor$")
	public void user_can_able_to_check_status_of_Kit_No_is_assigned_for_distributor() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributor(kitNumber, GCDistributorName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GPR Kit No is assigned for distributor$")
	public void user_can_able_to_check_status_of_GPR_Kit_No_is_assigned_for_distributor() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributor(kitNumber, GPRDistributorName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GC1 Kit No is assigned for distributor$")
	public void user_can_able_to_check_status_of_GC1_Kit_No_is_assigned_for_distributor() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributor(kitNumber, GC1DistributorName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to verify status of Kit No is assigned for distributor$")
	public void user_can_able_to_verify_status_of_Kit_No_is_assigned_for_distributor() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributorInAdminUser(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@When("^user fill required data for kit assign to distributor bulk$")
	public void user_fill_required_data_for_kit_assign_to_distributor_bulk() throws Throwable {
		kP.selectDistributor(GCDistributorName);
		String s = "Select " + GCDistributorName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GPR kit assign to distributor bulk$")
	public void user_fill_required_data_for_GPR_kit_assign_to_distributor_bulk() throws Throwable {
		kP.selectDistributor(GPRDistributorName);
		String s = "Select " + GPRDistributorName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 kit assign to distributor bulk$")
	public void user_fill_required_data_for_GC1_kit_assign_to_distributor_bulk() throws Throwable {
		kP.selectDistributor(GC1DistributorName);
		String s = "Select " + GPRDistributorName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must reached to Kit Assign Retailer page validate by URL$")
	public void user_must_reached_to_Kit_Assign_Retailer_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getKitAssignRetailerURL());
		InitializeWebDriver.scenario.write("Verified that user reached on kit assign to retailer page");
	}

	@When("^user fill required data for kit assign to retailer$")
	public void user_fill_required_data_for_kit_assign_to_retailer() throws Throwable {
		kP.selectRetailer(GCRetailerName);
		String s = "Select " + GCRetailerName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GPR kit assign to retailer$")
	public void user_fill_required_data_for_GPR_kit_assign_to_retailer() throws Throwable {
		kP.selectRetailer(GPRRetailerName);
		String s = "Select " + GPRRetailerName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 kit assign to retailer$")
	public void user_fill_required_data_for_GC1_kit_assign_to_retailer() throws Throwable {
		kP.selectRetailer(GC1RetailerName);
		String s = "Select " + GC1RetailerName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on retailer kit assign submit button$")
	public void user_click_on_retailer_kit_assign_submit_button() throws Throwable {
		kP.clickOnSubmitButton();
		InitializeWebDriver.scenario.write("Click on\"Submit\" button");
	}

	@Then("^user must be see Kit Assign success message for kit assign retailer$")
	public void user_must_be_see_Kit_Assign_success_message_for_kit_assign_retailer() throws Throwable {
		kP.verifyKitAssignSuccessMessageForSingleAssign();
		InitializeWebDriver.scenario.write("Verified message \"KIT assigned successfully.\"");
	}

	@Then("^user can able to check status of Kit No is assigned for retailer$")
	public void user_can_able_to_check_status_of_Kit_No_is_assigned_for_retailer() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributor(kitNumber, GCRetailerName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GPR Kit No is assigned for retailer$")
	public void user_can_able_to_check_status_of_GPR_Kit_No_is_assigned_for_retailer() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributor(kitNumber, GPRRetailerName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check status of GC1 Kit No is assigned for retailer$")
	public void user_can_able_to_check_status_of_GC1_Kit_No_is_assigned_for_retailer() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributor(kitNumber, GC1RetailerName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to verify status of Kit No is assigned for retailer$")
	public void user_can_able_to_verify_status_of_Kit_No_is_assigned_for_retailer() throws Throwable {
		kP.verifyStatusOfKitNumberAssignedToDistributorInAdminUser(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to verify status of Kit No is activated$")
	public void user_can_able_to_verify_status_of_Kit_No_is_activated() throws Throwable {
		kP.verifyStatusOfKitNumberActivated(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is activated");
	}

	@When("^user fill required data for kit assign to retailer bulk$")
	public void user_fill_required_data_for_kit_assign_to_retailer_bulk() throws Throwable {
		kP.selectRetailer(GCRetailerName);
		kP.selectType("Bulk Kit Assign");
		kP.selectCardType(Constants.cardType);
		kP.uploadSheet(filePath);
	}

	@When("^user fill required data for GPR kit assign to retailer bulk$")
	public void user_fill_required_data_for_GPR_kit_assign_to_retailer_bulk() throws Throwable {
		kP.selectRetailer(GPRRetailerName);
		String s = "Select " + GPRRetailerName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 kit assign to retailer bulk$")
	public void user_fill_required_data_for_GC1_kit_assign_to_retailer_bulk() throws Throwable {
		kP.selectRetailer(GC1RetailerName);
		String s = "Select " + GC1RetailerName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must reached to Download Card page validate by URL$")
	public void user_must_reached_to_Download_Card_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getDownloadCardDetailsURL());
		InitializeWebDriver.scenario.write("Verified that user reached on download card page");
	}

	@When("^user search with issuance date$")
	public void user_search_with_issuance_date() throws Throwable {
		kP.searchWithIssuanceDate();
	}

	@And("^user can able to download card details records$")
	public void user_can_able_to_download_card_details_records() throws Throwable {
		kP.clickOnCardDetailsDownload();
		InitializeWebDriver.scenario.write("Click on \"Download\" button");
	}

	@Then("^user can able to check status of Kit No for GPR program is unassigned for Single Kit$")
	public void user_can_able_to_check_status_of_Kit_No_for_GPR_program_is_unassigned_for_Single_Kit()
			throws Throwable {
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");

	}

	@Then("^user can able to check status of Kit No for GC Default program is unassigned for Single Kit$")
	public void user_can_able_to_check_status_of_Kit_No_for_GC_Default_program_is_unassigned_for_Single_Kit()
			throws Throwable {
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
	}

	@Then("^user can able to check status of Kit No for GC1 Default program is unassigned for Single Kit$")
	public void user_can_able_to_check_status_of_Kit_No_for_GC1_Default_program_is_unassigned_for_Single_Kit()
			throws Throwable {
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
	}

	@Then("^user can able to check status of Kit No for GC1 program is unassigned for Single Kit$")
	public void user_can_able_to_check_status_of_Kit_No_for_GC1_program_is_unassigned_for_Single_Kit()
			throws Throwable {
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
	}

	@Then("^user can able to check status of Kit No for GPR Default program is unassigned for Single Kit$")
	public void user_can_able_to_check_status_of_Kit_No_for_GPR_Default_program_is_unassigned_for_Single_Kit()
			throws Throwable {
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GPR_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
	}

	@When("^user fill required data for GPR program single kit assign$")
	public void user_fill_required_data_for_GPR_program_single_kit_assign() throws Throwable {
		kP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		kP.selectProgram(Constants.GPR_ProgramName);
		s = s + "Select " + Constants.GPR_ProgramName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC Default program single kit assign$")
	public void user_fill_required_data_for_GC_Default_program_single_kit_assign() throws Throwable {
		kP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		kP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 Default program single kit assign$")
	public void user_fill_required_data_for_GC1_Default_program_single_kit_assign() throws Throwable {
		kP.selectClient(Constants.defaultClientName1);
		String s = "Select " + Constants.defaultClientName1 + "\n";
		kP.selectProgram(Constants.GC1_Default_ProgramName);
		s = s + "Select " + Constants.GC1_Default_ProgramName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 program single kit assign$")
	public void user_fill_required_data_for_GC1_program_single_kit_assign() throws Throwable {
		kP.selectClient(Constants.clientName1);
		String s = "Select " + Constants.clientName1 + "\n";
		kP.selectProgram(Constants.GC1_ProgramName);
		s = s + "Select " + Constants.GC1_ProgramName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GPR Default program single kit assign$")
	public void user_fill_required_data_for_GPR_Default_program_single_kit_assign() throws Throwable {
		kP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		kP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user search for GPR Program$")
	public void user_search_for_GPR_Program() throws Throwable {
		kP.searchWithProgram(Constants.GPR_ProgramName);
	}

	@And("^user search for GC Default Program$")
	public void user_search_for_GC_Default_Program() throws Throwable {
		kP.searchWithProgram(Constants.GC_Default_ProgramName);
	}

	@And("^user search for GC1 Default Program$")
	public void user_search_for_GC1_Default_Program() throws Throwable {
		kP.searchWithProgram(Constants.GC1_Default_ProgramName);
	}

	@And("^user search for GC1 Program$")
	public void user_search_for_GC1_Program() throws Throwable {
		kP.searchWithProgram(Constants.GC1_ProgramName);
	}

	@And("^user search for GPR Default Program$")
	public void user_search_for_GPR_Default_Program() throws Throwable {
		kP.searchWithProgram(Constants.GPR_Default_ProgramName);
	}

	@Then("^user can able to check assigned kit no for GPR program for distributor$")
	public void user_can_able_to_check_assigned_kit_no_for_GPR_program_for_distributor() throws Throwable {
		kitNumber = cP.getKitNumberForDistributor(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@Then("^user can able to check assigned kit no for GC1 program for distributor$")
	public void user_can_able_to_check_assigned_kit_no_for_GC1_program_for_distributor() throws Throwable {
		kitNumber = cP.getKitNumberForDistributor(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
	}

	@When("^user fill required data for GPR program kit assign to distributor$")
	public void user_fill_required_data_for_GPR_program_kit_assign_to_distributor() throws Throwable {
		kP.selectDistributor(GPRDistributorName);
		String s = "Select " + GPRDistributorName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 program kit assign to distributor$")
	public void user_fill_required_data_for_GC1_program_kit_assign_to_distributor() throws Throwable {
		kP.selectDistributor(GC1DistributorName);
		String s = "Select " + GC1DistributorName + "\n";
		kP.selectType("Single Kit Assign");
		s = s + "Select Single Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on distributor kit assign submit button$")
	public void user_click_on_distributor_kit_assign_submit_button() throws Throwable {
		kP.clickOnSubmitButton();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user can able to check status of GPR program Kit No is unassigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_GPR_program_Kit_No_is_unassigned_for_Bulk_Kit() throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
		values.add(new String[] { kitNumber, "2024-07-26" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to check status of GC1 program Kit No is unassigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_GC1_program_Kit_No_is_unassigned_for_Bulk_Kit() throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to check status of GC Default program Kit No is unassigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_GC_Default_program_Kit_No_is_unassigned_for_Bulk_Kit()
			throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to check status of GC1 Default program Kit No is unassigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_GC1_Default_program_Kit_No_is_unassigned_for_Bulk_Kit()
			throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@Then("^user can able to check status of GPR Default program Kit No is unassigned for Bulk Kit$")
	public void user_can_able_to_check_status_of_GPR_Default_program_Kit_No_is_unassigned_for_Bulk_Kit()
			throws Throwable {
//		kitNumber = kP.verifyKitNoIsUnassigned(Constants.GC_ProgramName);
		filePath = Constants.uploadPath + "bulk_kit_assign.csv";
		String[] headers = new String[] { "kitNumber", "expiryDate" };
		List<String[]> values = new ArrayList<String[]>();
		kitNumber = cP.getReadyToAssignKitNumber(Constants.GPR_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is unassigned");
		values.add(new String[] { kitNumber, cP.getExpiryDate(kitNumber) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
	}

	@When("^user fill required data for GPR program bulk kit assign$")
	public void user_fill_required_data_for_GPR_program_bulk_kit_assign() throws Throwable {
		kP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		kP.selectProgram(Constants.GPR_ProgramName);
		s = s + "Select " + Constants.GPR_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 program bulk kit assign$")
	public void user_fill_required_data_for_GC1_program_bulk_kit_assign() throws Throwable {
		kP.selectClient(Constants.clientName1);
		String s = "Select " + Constants.clientName1 + "\n";
		kP.selectProgram(Constants.GC1_ProgramName);
		s = s + "Select " + Constants.GC1_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC Default program bulk kit assign$")
	public void user_fill_required_data_for_GC_Default_program_bulk_kit_assign() throws Throwable {
		kP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		kP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GC1 Default program bulk kit assign$")
	public void user_fill_required_data_for_GC1_Default_program_bulk_kit_assign() throws Throwable {
		kP.selectClient(Constants.defaultClientName1);
		String s = "Select " + Constants.defaultClientName1 + "\n";
		kP.selectProgram(Constants.GC1_Default_ProgramName);
		s = s + "Select " + Constants.GC1_Default_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for GPR Default program bulk kit assign$")
	public void user_fill_required_data_for_GPR_Default_program_bulk_kit_assign() throws Throwable {
		kP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		kP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		kP.selectType("Bulk Kit Assign");
		s = s + "Select Bulk Kit Assign\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.uploadSheet(filePath);
		s = s + "Upload file : " + filePath;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be able to see kit status not changed$")
	public void user_must_be_able_to_see_kit_status_not_changed() throws Throwable {
		kP.verifyKitStatusNotChanged(kitNumber);
	}

	@Then("^user must be able to see kit number is not listed$")
	public void user_must_be_able_to_see_kit_number_is_not_listed() throws Throwable {
		kP.verifyKitNotListed(kitNumber);
	}

	@Then("^user can able to fetch existing active customer details$")
	public void user_can_able_to_fetch_existing_active_customer_details() throws Throwable {
		DataConstants.customerMobileNo = kP.fetchActiveCustomer();
		InitializeWebDriver.scenario.write("Active customer's mobile number is " + DataConstants.customerMobileNo);
	}

	@Then("^user can able to fetch existing active Min KYC customer details$")
	public void user_can_able_to_fetch_existing_active_Min_KYC_customer_details() throws Throwable {
		DataConstants.customerMobileNo = kP.fetchActiveMinKYCCustomer();
		InitializeWebDriver.scenario
				.write("Active min kyc customer's mobile number is " + DataConstants.customerMobileNo);
	}

	@And("^user search for uploaded customers$")
	public void user_search_for_uploaded_customers() throws Throwable {
		kP.searchForCustomer();
	}

	@And("^user search for added customer details$")
	public void user_search_for_added_customer_details() throws Throwable {
		kP.searchForAddedCustomer(DataConstants.customerMobileNo);
	}

	@Then("^user can be able to see total count is equal to success count and failure count$")
	public void user_can_be_able_to_see_total_count_is_equal_to_success_count_and_failure_count() throws Throwable {
		kP.verifyUploadedCustomerDetails();
	}

	@Then("^user can able to find searched customer$")
	public void user_can_able_to_find_searched_customer() throws Throwable {
		kP.verifyCustomerAdded(DataConstants.customerMobileNo);
		InitializeWebDriver.scenario.write("Verified that customer is added successfully");
	}

	@Then("^user must be able to fetch customer hash id$")
	public void user_must_be_able_to_fetch_customer_hash_id() throws Throwable {
		DataConstants.customerHashID = kP.fetchCustomerHashId(DataConstants.customerMobileNo);
	}

	@Then("^user must be able to fetch customer hash id for GC Program$")
	public void user_must_be_able_to_fetch_customer_hash_id_for_GC_Program() throws Throwable {
		DataConstants.customerHashID = kP.fetchCustomerHashIdForGCProgram(DataConstants.customerMobileNo);
	}

	@Then("^user must be able to fetch min kyc customer hash id$")
	public void user_must_be_able_to_fetch_min_kyc_customer_hash_id() throws Throwable {
		DataConstants.customerHashID = kP.fetchMinKYCCustomerHashId(DataConstants.customerMobileNo);
	}

	@Then("^user must be able to fetch assigned kit details$")
	public void user_must_be_able_to_fetch_assigned_kit_details() throws Throwable {
		kitDetails = kP.fetchKitDetails(kitNumber);
	}

	@When("^user fill required data for bulk card creation upload$")
	public void user_fill_required_data_for_file_upload_positive() throws Throwable {
		filePath = Constants.uploadPath + "bulk_card_creation.csv";
		String[] headers = new String[] { "customerHashId", "kitNumber", "cardType", "businessId" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, kitNumber, kitDetails.split("#")[1],
				kitDetails.split("#")[0] });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Card Creation");
		s = s + "Select Bulk Card Creation";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user search for card details in card upload summary$")
	public void user_search_for_card_details_in_card_upload_summary() throws Throwable {
		kP.serachCardDetails();
	}

	@And("^user must be see searched card record$")
	public void user_must_be_see_searched_card_record() throws Throwable {
		kP.verifyCardRecord("bulk_card_creation");
		InitializeWebDriver.scenario.write("Verified card uploaded");
	}

	@And("^user must be see searched card record is failed$")
	public void user_must_be_see_searched_card_record_is_failed() throws Throwable {
		kP.verifyCardRecordIsFailed("bulk_card_creation");
		InitializeWebDriver.scenario.write("Verified not card uploaded");
	}

	@And("^update Kit Status to Assigned$")
	public void update_Kit_Status_to_Assigned() throws Throwable {
		cP.updateStatus(kitNumber, "Assigned");
	}

	@And("^update Kit Status to Assigned To Distributor$")
	public void update_Kit_Status_to_Assigned_To_Distributor() throws Throwable {
		cP.updateStatus(kitNumber, "Assigned To Distributor");
	}

	@And("^update Kit Status to Ready To Card Issuance$")
	public void update_Kit_Status_to_Ready_To_Card_Issuance() throws Throwable {
		cP.updateStatus(kitNumber, "Ready To Card Issue");
	}

	@And("^update Kit Status to Card Issued$")
	public void update_Kit_Status_to_Card_Issued() throws Throwable {
		cP.updateStatus(kitNumber, "Card Issued");
	}

	@And("^update Kit Status to Card Issued second$")
	public void update_Kit_Status_to_Card_Issued_second() throws Throwable {
		cP.updateStatus(kitNumber2, "Card Issued");
	}

	@And("^update Kit Status to Card In Progress For Card Issuance$")
	public void update_Kit_Status_to_Card_In_Progress_For_Card_Issuance() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		cP.updateStatus(kitNumber, "Card In Progress");
	}

	@When("^user search for card details in bulk card report$")
	public void user_search_for_card_details_in_bulk_card_report() throws Throwable {
		kP.searchCardDetailsInBulkCardReport(kitNumber);
	}

	@Then("^user can able to find card result and failure reason if bulk upload failed$")
	public void user_can_able_to_find_card_result_and_failure_reason_if_bulk_upload_failed() throws Throwable {
		kP.verifyCardUploadResult(kitNumber);
	}

	@Then("^user can able to find failure reason for bulk card upload$")
	public void user_can_able_to_find_failure_reason_for_bulk_card_upload() throws Throwable {
		kP.verifyCardUpload(kitNumber);
	}

	@When("^user enter required data for Add Customer$")
	public void user_enter_required_data_for_Add_Customer() throws Throwable {
		DataConstants.customerMobileNo = "942" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		clP.enterFirstName(DataConstants.firstName);
		String s = "Enter \"First Name\" : " + DataConstants.firstName + "\n";
		clP.enterLastName(lastName);
		s = s + "Enter \"Last Name\" : " + lastName + "\n";
		clP.enterEmail(DataConstants.email);
		s = s + "Enter \"Email\" : " + DataConstants.email + "\n";
		clP.enterMobile(DataConstants.customerMobileNo);
		s = s + "Enter \"Mobile Number\" : " + DataConstants.customerMobileNo + "\n";
		clP.enterDOB("12/19/1998");
		s = s + "Enter \"DOB\" : 12/19/1998\n";
		clP.selectTitle("Mr.");
		s = s + "Select Mr.\n";
		clP.selectGender("Male");
		s = s + "Select Male\n";
		clP.selectIDType("AADHAAR");
		s = s + "Select AADHAAR\n";
		clP.enterIDNumber(DataConstants.aadharIdNum);
		s = s + "Enter \"ID Number\" : " + DataConstants.aadharIdNum + "\n";
		clP.enterAddress1(address1);
		s = s + "Enter \"Address1\" : " + address1 + "\n";
		clP.enterAddress2(address2);
		s = s + "Enter \"Address2\" : " + address2 + "\n";
		clP.enterPostalCode(postalCode);
		s = s + "Enter \"Postal Code\" : " + postalCode + "\n";
		clP.enterState(state);
		s = s + "Enter \"State\" : " + state + "\n";
		clP.enterCity(city);
		s = s + "Enter \"City\" : " + city;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user fetch Default GC Client1 Kit Nos for Card Issue$")
	public void user_fetch_Default_GC_Client1_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		kitDetails = kP.fetchKitDetails(kitNumber);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@Then("^user fetch Default GC Client2 Kit Nos for Card Issue$")
	public void user_fetch_Default_GC_Client2_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		kitDetails = kP.fetchKitDetails(kitNumber);
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@Then("^user fetch Default GC1 Client1 Kit Nos for Card Issue$")
	public void user_fetch_Default_GC1_Client1_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		kitDetails = kP.fetchKitDetails(kitNumber);
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@Then("^user fetch Default GC1 Client2 Kit Nos for Card Issue$")
	public void user_fetch_Default_GC1_Client2_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		kitDetails = kP.fetchKitDetails(kitNumber);
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_Default_ProgramName1);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_Default_ProgramName1);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@Then("^user fetch GC Client1 Kit Nos for Card Issue$")
	public void user_fetch_GC_Client1_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		kitDetails = kP.fetchKitDetails(kitNumber);
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueKitNumber(Constants.GC_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueKitNumber(Constants.GC_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@Then("^user fetch GC Client2 Kit Nos for Card Issue$")
	public void user_fetch_GC_Client2_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		kitDetails = kP.fetchKitDetails(kitNumber);
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@Then("^user fetch GC1 Client1 Kit Nos for Card Issue$")
	public void user_fetch_GC1_Client1_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		kitDetails = kP.fetchKitDetails(kitNumber);
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueKitNumber(Constants.GC1_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueKitNumber(Constants.GC1_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@Then("^user fetch GC1 Client2 Kit Nos for Card Issue$")
	public void user_fetch_GC1_Client2_Kit_Nos_for_Card_Issue() throws Throwable {
		kitNumber = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber + " is assigned");
		kitDetails = kP.fetchKitDetails(kitNumber);
		cP.updateStatus(kitNumber, "Card In Progress");
		kitNumber1 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber1 + " is assigned");
		kitDetails1 = kP.fetchKitDetails(kitNumber1);
		cP.updateStatus(kitNumber1, "Card In Progress");
		kitNumber2 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber2 + " is assigned");
		kitDetails2 = kP.fetchKitDetails(kitNumber2);
		cP.updateStatus(kitNumber2, "Card In Progress");
//		kitNumber3 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber3 + " is assigned");
//		kitDetails3 = kP.fetchKitDetails(kitNumber3);
//		cP.updateStatus(kitNumber3, "Card In Progress");
//		kitNumber4 = cP.getReadyToCardIssueForClient2KitNumber(Constants.GC1_ProgramName);
//		InitializeWebDriver.scenario.write("Status of kit number " + kitNumber4 + " is assigned");
//		kitDetails4 = kP.fetchKitDetails(kitNumber4);
//		cP.updateStatus(kitNumber4, "Card In Progress");
	}

	@When("^user enter required data for bulk card creation upload$")
	public void user_enter_required_data_for_file_upload_positive() throws Throwable {
		filePath = Constants.uploadPath + "bulk_card_creation.csv";
		String[] headers = new String[] { "customerHashId", "kitNumber", "cardType", "businessId" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, kitNumber, kitDetails.split("#")[1],
				kitDetails.split("#")[0] });
		values.add(new String[] { DataConstants.customerHashID, kitNumber1, kitDetails1.split("#")[1],
				kitDetails.split("#")[0] });
		values.add(new String[] { DataConstants.customerHashID, kitNumber2, kitDetails2.split("#")[1],
				kitDetails.split("#")[0] });
//		values.add(new String[] { DataConstants.customerHashID, kitNumber3, kitDetails3.split("#")[1],
//				kitDetails.split("#")[0] });
//		values.add(new String[] { DataConstants.customerHashID, kitNumber4, kitDetails4.split("#")[1],
//				kitDetails.split("#")[0] });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Card Creation");
		s = s + "Bulk Card Creation";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card Issuance$")
	public void user_fill_required_data_for_Card_Issuance() throws Throwable {
		kP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNo(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card Issuance second$")
	public void user_fill_required_data_for_Card_Issuance_second() throws Throwable {
		kP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNo(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user can fetch kit details for card issuance for default GC To Card client2$")
	public void user_can_fetch_kit_details_for_card_issuance_for_default_GC_To_Card_client2() throws Throwable {
		kitNumberToCard = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get ready to card issue kit : " + kitNumberToCard);
	}

	@And("^user can fetch kit details for card issuance for default GC$")
	public void user_can_fetch_kit_details_for_card_issuance_for_default_GC() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get ready to card issue kit : " + kitNumber);
	}

	@And("^user can fetch kit details for card issuance for default GC client2$")
	public void user_can_fetch_kit_details_for_card_issuance_for_default_GC_client2() throws Throwable {
		kitNumber = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get ready to card issue kit : " + kitNumber);
	}

	@And("^user can fetch kit details for card issuance for default GC second$")
	public void user_can_fetch_kit_details_for_card_issuance_for_default_GC_second() throws Throwable {
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get ready to card issue kit : " + kitNumber2);
	}

	@And("^user can fetch kit details for card issuance for default GC second client2$")
	public void user_can_fetch_kit_details_for_card_issuance_for_default_GC_second_client2() throws Throwable {
		kitNumber2 = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get ready to card issue kit : " + kitNumber2);
	}

	@When("^user fill required data for Card Issuance To Card$")
	public void user_fill_required_data_for_Card_Issuance_To_Card() throws Throwable {
		kP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		kP.selectCardType(Constants.cardType);
		s = s + "Select " + Constants.cardType + "\n";
		kP.selectKitNo(kitNumberToCard);
		s = s + "Select " + kitNumberToCard;
		InitializeWebDriver.scenario.write(s);
	}
}