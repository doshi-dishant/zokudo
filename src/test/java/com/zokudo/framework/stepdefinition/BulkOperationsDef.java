package com.zokudo.framework.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.framework.utility.CSVHelper;
import com.zokudo.helper.PageObject.BulkOperationsPage;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.KitAssignPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BulkOperationsDef {

	private BulkOperationsPage bP = new BulkOperationsPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private KitAssignPage kP = new KitAssignPage(ObjectRepo.driver);
	private static final String lastName = RandomStringUtils.randomAlphabetic(5);
	private static String filePath, kitNum, businessType, cardType, kitDetails;

	@Then("^user must reached to Bulk Upload page validate by URL$")
	public void user_must_reached_to_Bulk_Upload_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getBulkUploadURL());
		InitializeWebDriver.scenario.write("Verified that user reached on bulk upload page");
	}

	@Then("^user must reached to Bulk Report page validate by URL$")
	public void user_must_reached_to_Bulk_Report_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getBulkCardReportURL());
		InitializeWebDriver.scenario.write("Verified that user reached on bulk report page");
	}

	@Then("^user can able to search assigned kit$")
	public void user_can_able_to_search_assigned_kit() throws Throwable {
		kitNum = cP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get assigned kit : " + kitNum);
		kitDetails = kP.fetchKitDetails(kitNum);
//		String[] searchDetails = bP.searchAssignKitDetails(kitDetails).split("#");
		businessType = kitDetails.split("#")[0];
		cardType = kitDetails.split("#")[1];
	}

	@Then("^user can able to search assigned kit for negative$")
	public void user_can_able_to_search_assigned_kit_for_negative() throws Throwable {
//		bP.searchAssignKitDetails(programName).split("#");
	}

	@When("^user fill required data for file upload positive$")
	public void user_fill_required_data_for_file_upload_positive() throws Throwable {
		bP.downloadCardCreationFormat();
		filePath = Constants.uploadPath + "positive.csv";
		String[] headers = new String[] { "customerHashId", "kitNumber", "cardType", "businessId" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "4b16d080-594e-4f28-a73d-6e18b7ff96ee", kitNum, cardType, businessType });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Card Creation");
		s = s + "Select bulk card creation";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Bulk Upload submit button$")
	public void user_click_on_Bulk_Upload_submit_button() throws Throwable {
		bP.clickOnBulkUploadSubmit();
		String s = "Click on \"Submit\" button";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see success message$")
	public void user_must_be_see_success_message() throws Throwable {
		bP.verifySuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Processed. Kindly check reports\"");
	}

	@When("^user search for positive record$")
	public void user_search_for_positive_record() throws Throwable {
		bP.search();
	}

	@When("^user search for negative record$")
	public void user_search_for_negative_record() throws Throwable {
		bP.search();
	}

	@Then("^user must be see searched record is passed$")
	public void user_must_be_see_searched_record_passed() throws Throwable {
		bP.verifySuccess("positive");
	}

	@Then("^user must be see searched record is failed$")
	public void user_must_be_see_searched_record_failed() throws Throwable {
		bP.verifyFailure("positive");
	}

	@When("^user fill required data for file upload negative$")
	public void user_fill_required_data_for_file_upload_negative() throws Throwable {
		bP.downloadCardCreationFormat();
		bP.uploadBulkFile(Constants.uploadPath + "positive.csv");
		String s = "Upload file : " + Constants.uploadPath + "positive.csv\n";
		bP.selectOperationType("Bulk Card Creation");
		s = s + "Select bulk card creation";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^Download Card Creation Format$")
	public void Download_Card_Creation_Format() throws Throwable {
		bP.downloadCardCreationFormat();
		InitializeWebDriver.scenario.write("Click on \"Download\" button");
	}

	@Then("^user fill required data for file upload for customer same details$")
	public void user_fill_required_data_for_file_upload_for_customer_same_details() throws Throwable {
		bP.downloadRegistrationFormat();
		filePath = Constants.uploadPath + "bulk_customer_upload.csv";
		String[] headers = new String[] { "firstName", "lastName", "mobile", "email", "preferredName",
				"mobileCountryCode", "birthday", "title", "gender", "idType", "idNumber", "countryOfIssue",
				"idExpiryDate", "address1", "address2", "city", "state", "country", "zipCode" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(
				new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, DataConstants.email,
						DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR", DataConstants.aadharIdNum,
						"India", "1994-10-10", "Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Register");
		s = s + "Select bulk register";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user fill required data for file upload for customer with 2 char in first name or in lastname$")
	public void user_fill_required_data_for_file_upload_for_customer_with_2_char_in_first_name_or_in_lastname()
			throws Throwable {
		bP.downloadRegistrationFormat();
		DataConstants.customerMobileNo = "99" + RandomStringUtils.randomNumeric(8);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(2);
		String lastName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		filePath = Constants.uploadPath + "bulk_customer_upload.csv";
		String[] headers = new String[] { "firstName", "lastName", "mobile", "email", "preferredName",
				"mobileCountryCode", "birthday", "title", "gender", "idType", "idNumber", "countryOfIssue",
				"idExpiryDate", "address1", "address2", "city", "state", "country", "zipCode" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(
				new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, DataConstants.email,
						DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR", DataConstants.aadharIdNum,
						"India", "1994-10-10", "Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		DataConstants.customerMobileNo = "99" + RandomStringUtils.randomNumeric(8);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		lastName = RandomStringUtils.randomAlphabetic(2);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		values.add(
				new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, DataConstants.email,
						DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR", DataConstants.aadharIdNum,
						"India", "1994-10-10", "Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Register");
		s = s + "Select bulk register";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user fill required data for file upload for 101 customers$")
	public void user_fill_required_data_for_file_upload_for_101_customers() throws Throwable {
		bP.downloadRegistrationFormat();
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		List<String[]> values = new ArrayList<String[]>();
		filePath = Constants.uploadPath + "bulk_customer_upload.csv";
		String[] headers = new String[] { "firstName", "lastName", "mobile", "email", "preferredName",
				"mobileCountryCode", "birthday", "title", "gender", "idType", "idNumber", "countryOfIssue",
				"idExpiryDate", "address1", "address2", "city", "state", "country", "zipCode" };
		for (int i = 0; i < 101; i++) {
			DataConstants.customerMobileNo = "99" + RandomStringUtils.randomNumeric(8);
			String lastName = RandomStringUtils.randomAlphabetic(5);
			DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
			DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
			values.add(new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo,
					DataConstants.email, DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR",
					DataConstants.aadharIdNum, "India", "1994-10-10", "Address 1", "Address 2", "Bangalore",
					"Karnataka", "India", "560076" });
		}
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Register");
		s = s + "Select bulk register";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user fill required data for file upload for customer with special char$")
	public void user_fill_required_data_for_file_upload_for_customer_with_special_char() throws Throwable {
		bP.downloadRegistrationFormat();
		DataConstants.customerMobileNo = "99" + RandomStringUtils.randomNumeric(8);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(4) + "&";
		String lastName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		filePath = Constants.uploadPath + "bulk_customer_upload.csv";
		String[] headers = new String[] { "firstName", "lastName", "mobile", "email", "preferredName",
				"mobileCountryCode", "birthday", "title", "gender", "idType", "idNumber", "countryOfIssue",
				"idExpiryDate", "address1", "address2", "city", "state", "country", "zipCode" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(
				new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, DataConstants.email,
						DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR", DataConstants.aadharIdNum,
						"India", "1994-10-10", "Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		DataConstants.customerMobileNo = "99" + RandomStringUtils.randomNumeric(8);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		lastName = RandomStringUtils.randomAlphabetic(4) + "&";
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		values.add(
				new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, DataConstants.email,
						DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR", DataConstants.aadharIdNum,
						"India", "1994-10-10", "Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Register");
		s = s + "Select bulk register";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user fill required data for file upload for customer with number$")
	public void user_fill_required_data_for_file_upload_for_customer_with_number() throws Throwable {
		bP.downloadRegistrationFormat();
		DataConstants.customerMobileNo = "99" + RandomStringUtils.randomNumeric(8);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(4) + "4";
		String lastName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		filePath = Constants.uploadPath + "bulk_customer_upload.csv";
		String[] headers = new String[] { "firstName", "lastName", "mobile", "email", "preferredName",
				"mobileCountryCode", "birthday", "title", "gender", "idType", "idNumber", "countryOfIssue",
				"idExpiryDate", "address1", "address2", "city", "state", "country", "zipCode" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(
				new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, DataConstants.email,
						DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR", DataConstants.aadharIdNum,
						"India", "1994-10-10", "Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		DataConstants.customerMobileNo = "99" + RandomStringUtils.randomNumeric(8);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		lastName = RandomStringUtils.randomAlphabetic(4) + "2";
		DataConstants.email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		DataConstants.aadharIdNum = RandomStringUtils.randomNumeric(12);
		values.add(
				new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, DataConstants.email,
						DataConstants.firstName, "91", "1998-10-10", "Mr", "M", "AADHAAR", DataConstants.aadharIdNum,
						"India", "1994-10-10", "Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Register");
		s = s + "Select bulk register";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user fill required data for file upload for customer positive$")
	public void user_fill_required_data_for_file_upload_for_customer_positive() throws Throwable {
		bP.downloadRegistrationFormat();
		filePath = Constants.uploadPath + "bulk_customer_upload.csv";
		DataConstants.customerMobileNo = "943" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		String lastName = RandomStringUtils.randomAlphabetic(5);
		String email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		String idNum = RandomStringUtils.randomNumeric(12);
		String[] headers = new String[] { "firstName", "lastName", "mobile", "email", "preferredName",
				"mobileCountryCode", "birthday", "title", "gender", "idType", "idNumber", "countryOfIssue",
				"idExpiryDate", "address1", "address2", "city", "state", "country", "zipCode" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, email,
				DataConstants.firstName, "91", "1994-10-10", "Mr", "M", "AADHAAR", idNum, "India", "2094-10-10",
				"Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		DataConstants.customerMobileNo2 = "943" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		lastName = RandomStringUtils.randomAlphabetic(5);
		email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		idNum = RandomStringUtils.randomNumeric(12);
		values.add(new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo2, email,
				DataConstants.firstName, "91", "1994-10-10", "Mr", "M", "AADHAAR", idNum, "India", "2094-10-10",
				"Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Register");
		s = s + "Select bulk register";
		InitializeWebDriver.scenario.write(s);
	}
}