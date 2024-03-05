package com.zokudo.framework.stepdefinition;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.CustomerPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerDef {

	private CustomerPage clP = new CustomerPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private static final String lastName = RandomStringUtils.randomAlphabetic(5);
	private static final String address1 = RandomStringUtils.randomAlphabetic(10);
	private static final String address2 = RandomStringUtils.randomAlphabetic(10);
	private static final String postalCode = RandomStringUtils.randomNumeric(6);
	private static final String state = RandomStringUtils.randomAlphabetic(5);
	private static final String city = RandomStringUtils.randomAlphabetic(5);

	@Then("^user must reached to List Customer page validate by URL$")
	public void user_must_reached_to_List_Customer_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListCustomerURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list customer page");
	}

	@And("^user must be see added customer record$")
	public void user_must_be_see_added_customer_record() throws Throwable {
		clP.verifyRecord(DataConstants.firstName);
		InitializeWebDriver.scenario.write("Verified that customer is added successfully");
	}

	@When("^user must reached to Add Customer page validate by URL$")
	public void user_must_reached_to_Add_Customer_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getAddCustomerURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add customer page");
	}

	@When("^user fill required data for Add Customer$")
	public void user_fill_required_data_for_Add_Customer() throws Throwable {
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
		s = s + "Enter \"state\" : " + state + "\n";
		clP.enterCity(city);
		s = s + "Enter \"City\" : " + city;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Add Customer Submit button$")
	public void user_click_on_Add_Customer_Submit_button() throws Throwable {
		clP.clickOnSubmitButton();
		String s = "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see Add Customer success message$")
	public void user_must_be_see_Add_Customer_success_message() throws Throwable {
		clP.verifyAddCustomerSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Customer Registered Successfully\"");
	}

	@Then("^user must be able to see field KYC Type$")
	public void user_must_be_able_to_see_field_KYC_Type() throws Throwable {
		clP.verifyKYCTypeField();
		InitializeWebDriver.scenario.write("Verified that KYC Type field is present");
	}

	@And("^Field should show Full-KYC and MIN-KYC only$")
	public void field_should_show_FullKYC_and_MinKYC_only() throws Throwable {
		clP.verifyKYCTypes();
		InitializeWebDriver.scenario.write("Verified that Full-KYC & Min-KYC fields are present in dropdown");
	}

	@And("^user must not be able to see Upgrade KYC button$")
	public void user_must_not_be_able_to_see_Upgrade_KYC_button() throws Throwable {
		clP.verifyUpgradeKYCButtonNotVisible();
		InitializeWebDriver.scenario.write("Verified that \"Upgrade KYC\" button is not present");
	}

	@And("^user search in customer list and verify result$")
	public void user_search_in_customer_list_and_verify_result() throws Throwable {
		clP.search(DataConstants.firstName, DataConstants.customerMobileNo);
	}

	@And("^user must be able to see Upgrade KYC button$")
	public void user_must_be_able_to_see_Upgrade_KYC_button() throws Throwable {
		clP.verifyUpgradeKYCButton();
		InitializeWebDriver.scenario.write("Verified that \"Upgrade KYC\" button is present");
	}

	@And("^user click on Upgrade KYC$")
	public void user_click_on_Upgrade_KYC() throws Throwable {
		clP.clickOnUpgradeKYC(DataConstants.firstName);
		InitializeWebDriver.scenario.write("Click on \"Upgrade KYC\" button of " + DataConstants.firstName);
	}

	@And("^status must be changed$")
	public void status_must_be_changed() throws Throwable {
		clP.verifyUpgradeKYCStatus();
		InitializeWebDriver.scenario.write("Verified that status is changed after upgrade kyc");
	}

	@When("^user fill required data for Add Customer With 3 Char In Firstname And 3 Char In Lastname$")
	public void user_fill_required_data_for_Add_Customer_With_3_Char_In_Firstname_And_3_Char_In_Lastname()
			throws Throwable {
		DataConstants.customerMobileNo = "942" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(3);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		clP.enterFirstName(DataConstants.firstName);
		String s = "Enter \"First Name\" : " + DataConstants.firstName + "\n";
		String lastName = RandomStringUtils.randomAlphabetic(3);
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
		s = s + "Enter \"state\" : " + state + "\n";
		clP.enterCity(city);
		s = s + "Enter \"City\" : " + city;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user enter required data for Add Customer with same details$")
	public void user_enter_required_data_for_Add_Customer_with_same_details() throws Throwable {
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
		s = s + "Enter \"state\" : " + state + "\n";
		clP.enterCity(city);
		s = s + "Enter \"City\" : " + city;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see Add Customer duplicate details error message$")
	public void user_must_be_see_Add_Customer_duplicate_details_error_message() throws Throwable {
		clP.verifyAddCustomerDuplicateDetailsMessage();
		InitializeWebDriver.scenario.write("Verified message \"mobile number already exist\"");
	}

	@Then("^user must be see Add Customer 101 firstname exits error message$")
	public void user_must_be_see_Add_Customer_101_firstname_exits_error_message() throws Throwable {
		clP.verifyAddCustomer101FirstnameExitsMessage();
		InitializeWebDriver.scenario.write("Verified message \"First Name already exits 101 times\"");
	}

	@And("^user must not able to see added customer record$")
	public void user_must_not_able_to_see_added_customer_record() throws Throwable {
		clP.verifyRecordNotFound(DataConstants.customerMobileNo);
		InitializeWebDriver.scenario.write("Verified customer is not present in system");
	}

	@Then("^user can not able to find searched customer$")
	public void user_can_able_to_find_searched_customer() throws Throwable {
		clP.verfyCustomerAdded(DataConstants.customerMobileNo);
		InitializeWebDriver.scenario.write("Verified customer is present in system");
	}

	@When("^user fill required data for Add Customer With 2 Char In Firstname$")
	public void user_fill_required_data_for_Add_Customer_With_2_Char_In_Firstname() throws Throwable {
		DataConstants.customerMobileNo = "942" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(2);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		clP.enterFirstName(DataConstants.firstName);
		String s = "Enter \"First Name\" : " + DataConstants.firstName + "\n";
		String lastName = RandomStringUtils.randomAlphabetic(3);
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

	@Then("^user verify first name error message in alert$")
	public void user_verify_first_name_error_message_in_alert() throws Throwable {
		clP.getAlertForFirstName();
		InitializeWebDriver.scenario
				.write("Get alert message : \"please enter  minimum 3 characters in  first name field\"");
	}

	@Then("^user verify last name error message in alert$")
	public void user_verify_last_name_error_message_in_alert() throws Throwable {
		clP.getAlertForLastName();
		InitializeWebDriver.scenario
				.write("Get alert message : \"please enter  minimum 3 characters in  last name field\"");
	}

	@When("^user fill required data for Add Customer With 2 Char In Lastname$")
	public void user_fill_required_data_for_Add_Customer_With_2_Char_In_Lastname() throws Throwable {
		DataConstants.customerMobileNo = "942" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		clP.enterFirstName(DataConstants.firstName);
		String s = "Enter \"First Name\" : " + DataConstants.firstName + "\n";
		String lastName = RandomStringUtils.randomAlphabetic(2);
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
		s = s + "Enter \"state\" : " + state + "\n";
		clP.enterCity(city);
		s = s + "Enter \"City\" : " + city;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user can able to see failure reason if failed$")
	public void user_can_able_to_see_failure_reason_if_failed() throws Throwable {
		String failure_reason = clP.verifyCardUploadResult(DataConstants.customerMobileNo);
		InitializeWebDriver.scenario.write("Failure reason is " + failure_reason);
		System.out.println(failure_reason);
	}

	@And("^user must not able to see more than one customer record$")
	public void user_must_not_able_to_see_more_than_one_customer_record() throws Throwable {
		clP.verifyOnlyOneRecord(DataConstants.firstName);
		InitializeWebDriver.scenario.write("Verified that customer is present in system only one time");
	}

	@When("^user search for record in customer kyc list$")
	public void user_search_for_record_in_customer_kyc_list() throws Throwable {
		clP.searchForRecordInKYCList(DataConstants.customerMobileNo);
	}

	@When("^user can be able to see result for searched record in customer kyc list$")
	public void user_can_be_able_to_see_result_for_searched_record_in_customer_kyc_list() throws Throwable {
		clP.verifySearchedRecordInKYCList(DataConstants.customerMobileNo);
		InitializeWebDriver.scenario.write("Verified that customer is present in kyc list");
	}

}