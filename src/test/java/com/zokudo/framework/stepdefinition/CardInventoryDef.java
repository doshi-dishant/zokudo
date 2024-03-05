package com.zokudo.framework.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.framework.utility.CSVHelper;
import com.zokudo.helper.PageObject.CardInventoryPage;
import com.zokudo.helper.PageObject.CommonPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CardInventoryDef {

	private CardInventoryPage cIP = new CardInventoryPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private static String filePath;
//	private static String maskedNumber = "XXXX-XXXX-XXXX-" + RandomStringUtils.randomNumeric(4);
//	private static String kitNum = RandomStringUtils.randomNumeric(8);
	private static String kitNum;
	private static String maskedNumber = "XXXX-XXXX-XXXX-";
	private static String expDate;
	private static String maskedNumber1 = "XXXX-XXXX-XXXX-" + RandomStringUtils.randomNumeric(4);
	private static String kitNum1;

	@Then("^user must reached to Card Inventory Upload page validate by URL$")
	public void user_must_reached_to_Card_Inventory_Upload_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getCardInventoryUploadURL());
		InitializeWebDriver.scenario.write("Verified that user reached on card inventory upload page");
	}

	@When("^user select Program$")
	public void user_select_Program() throws Throwable {
		cIP.selectProgram(Constants.GC_ProgramName);
	}

	@When("^user select GPR Program$")
	public void user_select_GPR_Program() throws Throwable {
		cIP.selectProgram(Constants.GPR_ProgramName);
	}

	@When("^user select Default GPR Program$")
	public void user_select_Default_GPR_Program() throws Throwable {
		cIP.selectProgram(Constants.GPR_Default_ProgramName);
	}

	@When("^user select Default GC Program$")
	public void user_select_Default_GC_Program() throws Throwable {
		cIP.selectProgram(Constants.GC_Default_ProgramName);
	}

	@When("^user select Default GC1 Program$")
	public void user_select_Default_GC1_Program() throws Throwable {
		cIP.selectProgram(Constants.GC1_Default_ProgramName);
	}

	@When("^user select GC1 Program$")
	public void user_select_GC1_Program() throws Throwable {
		cIP.selectProgram(Constants.GC1_ProgramName);
	}

	@Then("^user can able to check Business Type$")
	public void user_can_able_to_check_Business_Type() throws Throwable {
		cIP.verifyBusinessProgram();
		InitializeWebDriver.scenario.write("Verified business type");
	}

	@When("^user click on choose file and hit submit$")
	public void user_click_on_choose_file_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
		kitNum = cP.getUnusedKitNumber(Constants.GC_ProgramName);
		String s = "Get unused kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
		values.add(new String[] { kitNum, expDate, maskedNumber });
//		kitNum = cP.getUnusedKitNumber(Constants.GC_ProgramName);
//		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
//		expDate = cP.getExpiryDate(kitNum);
//		values.add(new String[] { kitNum, expDate, maskedNumber });
//		kitNum = cP.getUnusedKitNumber(Constants.GC_ProgramName);
//		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
//		expDate = cP.getExpiryDate(kitNum);
//		values.add(new String[] { kitNum, expDate, maskedNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file for GPR program and hit submit$")
	public void user_click_on_choose_file_for_GPR_program_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "gpr_card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
//		kitNum = RandomStringUtils.randomNumeric(8);
//		maskedNumber = maskedNumber + RandomStringUtils.randomNumeric(4);
//		expDate = "2024-07-26";
//		values.add(new String[] { kitNum, expDate, maskedNumber });
		kitNum = cP.getUnusedKitNumber(Constants.GPR_ProgramName);
		String s = "Get unused kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
		values.add(new String[] { kitNum, expDate, maskedNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file for Default GPR program and hit submit$")
	public void user_click_on_choose_file_for_Default_GPR_program_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "default_gpr_card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
//		kitNum = RandomStringUtils.randomNumeric(8);
//		maskedNumber = maskedNumber + RandomStringUtils.randomNumeric(4);
//		expDate = "2024-07-26";
//		values.add(new String[] { kitNum, expDate, maskedNumber });
		kitNum = cP.getUnusedKitNumber(Constants.GPR_Default_ProgramName);
		String s = "Get unused kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
		values.add(new String[] { kitNum, expDate, maskedNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file for Default GC program and hit submit$")
	public void user_click_on_choose_file_for_Default_GC_program_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "default_gc_card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
//		kitNum = RandomStringUtils.randomNumeric(8);
//		maskedNumber = maskedNumber + RandomStringUtils.randomNumeric(4);
//		expDate = "2024-07-26";
//		values.add(new String[] { kitNum, expDate, maskedNumber });
		kitNum = cP.getUnusedKitNumber(Constants.GC_Default_ProgramName);
		String s = "Get unused kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
		values.add(new String[] { kitNum, expDate, maskedNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file for Default GC1 program and hit submit$")
	public void user_click_on_choose_file_for_Default_GC1_program_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "default_gc1_card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
//		kitNum = RandomStringUtils.randomNumeric(8);
//		maskedNumber = maskedNumber + RandomStringUtils.randomNumeric(4);
//		expDate = "2024-07-26";
//		values.add(new String[] { kitNum, expDate, maskedNumber });
		kitNum = cP.getUnusedKitNumber(Constants.GC1_Default_ProgramName);
		String s = "Get unused kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
		values.add(new String[] { kitNum, expDate, maskedNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file for GC1 program and hit submit$")
	public void user_click_on_choose_file_for_GC1_program_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "default_gc1_card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
//		kitNum = RandomStringUtils.randomNumeric(8);
//		maskedNumber = maskedNumber + RandomStringUtils.randomNumeric(4);
//		expDate = "2024-07-26";
//		values.add(new String[] { kitNum, expDate, maskedNumber });
		kitNum = cP.getUnusedKitNumber(Constants.GC1_ProgramName);
		String s = "Get unused kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
		values.add(new String[] { kitNum, expDate, maskedNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file and hit submit for already uploaded$")
	public void user_click_on_choose_file_and_hit_submit_for_already_uploaded() throws Throwable {
		kitNum = cP.getUsedKitNumber(Constants.GC_ProgramName);
		String s = "Get used kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
//		 DataConstants.kitNumber = kitNum;
		filePath = Constants.uploadPath + "card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNum, expDate, maskedNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file and hit submit with few already uploaded$")
	public void user_click_on_choose_file_and_hit_submit_with_few_already_uploaded() throws Throwable {
//		 DataConstants.kitNumber = kitNum;
		kitNum = cP.getUsedKitNumber(Constants.GC_ProgramName);
		String s = "Get used kit : " + kitNum + "\n";
		maskedNumber = "XXXX-XXXX-XXXX-" + cP.getMaskedNumber(kitNum);
		s = s + "Masked number ; " + maskedNumber + "\n";
		kitNum1 = RandomStringUtils.randomNumeric(8);
		s = s + "Get random kit : " + kitNum1 + "\n";
		maskedNumber1 = "XXXX-XXXX-XXXX-" + RandomStringUtils.randomNumeric(4);
		s = s + "Random masked number ; " + maskedNumber + "\n";
		filePath = Constants.uploadPath + "card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
		expDate = cP.getExpiryDate(kitNum);
		s = s + "Expiry date : " + expDate + "\n";
		values.add(new String[] { kitNum, expDate, maskedNumber });
		values.add(new String[] { kitNum1, expDate, maskedNumber1 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file and hit submit with empty file$")
	public void user_click_on_choose_file_and_hit_submit_with_empty_file() throws Throwable {
//		 DataConstants.kitNumber = kitNum;
		filePath = Constants.uploadPath + "card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "", "", "" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user choose file consist of already uploaded card from different program and hit submit$")
	public void user_choose_file_consist_of_already_uploaded_card_from_different_program_and_hit_submit()
			throws Throwable {
//		 DataConstants.kitNumber = kitNum;
		filePath = Constants.uploadPath + "card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "73000118", "30-06-2026", "XXXX-XXXX-XXXX-7418" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user choose file consist of invalid KitNo and MaskedNo and hit submit$")
	public void user_choose_file_consist_of_invalid_KitNo_and_MaskedNo_and_hit_submit() throws Throwable {
//		 DataConstants.kitNumber = kitNum;
		filePath = Constants.uploadPath + "card_upload.csv";
		String[] headers = new String[] { "kit", "expiryDate", "maskedNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "123Q5678", "30-06-2026", "XXXX-XXXX-XXXX-0000" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		cIP.clickonUploadFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can able to check status of Kit No is unassigned and can download$")
	public void user_can_able_to_check_status_of_Kit_No_is_unassigned_and_can_download() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListInventoryURL());
		String s = "Verified that user reached on list inventory page\n";
		cIP.verifyStatusUnAssigned(kitNum);
		s = s + "Verified kit status is unassigned";
		InitializeWebDriver.scenario.write(s);
//		cIP.clickonDownload();
	}

	@Then("^user must reached to Bulk Card Inv Upload Summary page validate by URL$")
	public void user_must_reached_to_Bulk_Card_Inv_Upload_Summary_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getBulkCardInvUploadSummaryURL());
		InitializeWebDriver.scenario.write("Verified that user reached on bulk card inventory upload summary page");
	}

	@When("^user click on Search Tab$")
	public void user_click_on_Search_Tab() throws Throwable {
		cIP.clickOnSearchButton();
		InitializeWebDriver.scenario.write("Click on \"Search\" button");
	}

	@When("^user select Daterange and Program and hit Filter$")
	public void user_select_Daterange_and_Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.selectProgramName(Constants.GC_ProgramName);
		s = s + "Select" + Constants.GC_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user select Daterange and GPR Program and hit Filter$")
	public void user_select_Daterange_and_GPR_Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.selectProgramName(Constants.GPR_ProgramName);
		s = s + "Select" + Constants.GPR_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user select Daterange and Default GPR Program and hit Filter$")
	public void user_select_Daterange_and_Default_GPR_Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.selectProgramName(Constants.GPR_Default_ProgramName);
		s = s + "Select" + Constants.GPR_Default_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user select Daterange and Default GC Program and hit Filter$")
	public void user_select_Daterange_and_Default_GC_Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.selectProgramName(Constants.GC_Default_ProgramName);
		s = s + "Select" + Constants.GC_Default_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user select Daterange and Default GC1 Program and hit Filter$")
	public void user_select_Daterange_and_Default_GC1_Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.selectProgramName(Constants.GC1_Default_ProgramName);
		s = s + "Select" + Constants.GC1_Default_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user select Daterange and GC1 Program and hit Filter$")
	public void user_select_Daterange_and_GC1_Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.selectProgramName(Constants.GC1_ProgramName);
		s = s + "Select" + Constants.GC1_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can check Uploaded file results$")
	public void user_can_check_Uploaded_file_results() throws Throwable {
		cIP.verifyUpdatedDetails();
	}

	@Then("^user must reached to Bulk Inventory Upload Report page validate by URL$")
	public void user_must_reached_to_Bulk_Inventory_Upload_Report_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getBulkCardInvReportURL());
		InitializeWebDriver.scenario.write("Verified that user reached on bulk inventory upload report page");
	}

	@And("^user select Daterange/fileName/kit/Program and hit Filter$")
	public void user_select_Daterange_fileName_kit_Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.enterKitNumber(kitNum);
		s = s + "Enter \"Kit Number\" : " + kitNum + "\n";
		cIP.selectProgramName(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user select Daterange/fileName/kit/GPRProgram and hit Filter$")
	public void user_select_Daterange_fileName_kit_GPRProgram_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.enterKitNumber(kitNum);
		s = s + "Enter \"Kit Number\" : " + kitNum + "\n";
		cIP.selectProgramName(Constants.GPR_ProgramName);
		s = s + "Select " + Constants.GPR_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user select Daterange/fileName/kit/DefaultGPRProgram and hit Filter$")
	public void user_select_Daterange_fileName_kit_DefaultGPRProgram_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.enterKitNumber(kitNum);
		s = s + "Enter \"Kit Number\" : " + kitNum + "\n";
		cIP.selectProgramName(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user select Daterange/fileName/kit/DefaultGCProgram and hit Filter$")
	public void user_select_Daterange_fileName_kit_DefaultGCProgram_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.enterKitNumber(kitNum);
		s = s + "Enter \"Kit Number\" : " + kitNum + "\n";
		cIP.selectProgramName(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user select Daterange/fileName/kit/DefaultGC1Program and hit Filter$")
	public void user_select_Daterange_fileName_kit_DefaultGC1Program_and_hit_Filter() throws Throwable {
		cIP.SelectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on last 7 days\n";
		cIP.enterKitNumber(kitNum);
		s = s + "Enter \"Kit Number\" : " + kitNum + "\n";
		cIP.selectProgramName(Constants.GC1_Default_ProgramName);
		s = s + "Select " + Constants.GC1_Default_ProgramName + "\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can see Uploaded file result Status for kit$")
	public void user_can_see_Uploaded_file_result_Status_for_kit() throws Throwable {
		cIP.verifyStatusApprove(kitNum);
		InitializeWebDriver.scenario.write("Verified that status is approved");
	}

	@Then("^user can't able to see already uploaded program cards$")
	public void user_can_t_able_to_see_already_uploaded_program_cards() throws Throwable {
		cIP.verifyStatusUnAssigned(kitNum);
		InitializeWebDriver.scenario.write("Verified that status is unassign");
	}

	@Then("^user can check FailureCount is equal to TotalCount$")
	public void user_can_check_FailureCount_is_equal_to_TotalCount() throws Throwable {
		cIP.verifyUpdatedDetails();
	}

	@Then("^user can see program for status as failureReason$")
	public void user_can_see_program_for_status_as_failureReason() throws Throwable {
		cIP.verifyFailureReasonField();
		InitializeWebDriver.scenario.write("Verified failure reason");
	}

	@When("^user click on choose file for new Cards and hit submit$")
	public void user_click_on_choose_file_for_new_Cards_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "3.csv";
		cIP.clickonUploadFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on choose file for already uploaded cards and hit submit$")
	public void user_click_on_choose_file_for_already_uploaded_cards_and_hit_submit() throws Throwable {
		filePath = Constants.uploadPath + "2.csv";
		cIP.clickonUploadFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		cIP.clickOnBulkUploadSubmit();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can see results for only new cards get uploaded$")
	public void user_can_see_results_for_only_new_cards_get_uploaded() throws Throwable {
		cIP.verifyStatusUnAssigned(kitNum);
		InitializeWebDriver.scenario.write("Verified status is unassigned");
	}

	@Then("^user can check results for Total counts$")
	public void user_can_check_results_for_Total_counts() throws Throwable {
		cIP.verifyUpdatedDetails();
	}

	@Then("^user can check program status results$")
	public void user_can_check_program_status_results() throws Throwable {
		cIP.verifyFailureReasonField();
		String s = "Verified failure reason\n";
		cIP.verifyStatusFail();
		s = s + "Verified status is failed";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user select new Program$")
	public void user_select_new_Program() throws Throwable {
		cIP.selectProgram(Constants.GPR_ProgramName);
	}

	@Then("^user can't able to see uploaded program cards$")
	public void user_can_t_able_to_see_uploaded_program_cards() throws Throwable {
		cIP.verifyStatusUnAssigned(kitNum);
		InitializeWebDriver.scenario.write("Verified status is unassigned");
	}

	@Then("^user can able to verify kit is uploaded with unassign status$")
	public void user_can_able_to_verify_kit_is_uploaded_with_unassign_status() throws Throwable {
		cIP.verifyKitStatusUnAssigned(kitNum);
		InitializeWebDriver.scenario.write("Verified status is unassigned");
	}

	@And("^update Kit Status to Ready To Assign$")
	public void update_Kit_Status_to_Ready_To_Assign() throws Throwable {
		cP.updateStatus(kitNum, "Ready To Assign");
	}
}