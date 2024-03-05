package com.zokudo.framework.stepdefinition;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.ClientPage;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.OnboardBusinessPage;
import com.zokudo.helper.PageObject.OnboardProgramPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateProgramDef {

	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private OnboardBusinessPage oBP = new OnboardBusinessPage(ObjectRepo.driver);
	private ClientPage clP = new ClientPage(ObjectRepo.driver);
	private OnboardProgramPage oPP = new OnboardProgramPage(ObjectRepo.driver);

	@Then("^user must reached to Add Business page validate by URL$")
	public void user_must_reached_to_Add_Business_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getAddBusinessURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add business page");
	}

	@When("^user fill required data for Add Business$")
	public void user_fill_required_data_for_Add_Businessuser_fill_required_data_for_Add_Business() throws Throwable {
		DataConstants.businessName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.businessType = RandomStringUtils.randomAlphabetic(5);
		oBP.enterBusinessName(DataConstants.businessName);
		String s = "Enter \"Business Name\" : " + DataConstants.businessName + "\n";
		oBP.enterBusinessType(DataConstants.businessType);
		s = s + "Enter \"Business Type\" : " + DataConstants.businessType + "\n";
		oBP.selectProcessor("Test");
		s = s + "Select Test";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Business with Equitas Processor$")
	public void user_fill_required_data_for_Add_Businessuser_fill_required_data_for_Add_Business_with_Equitas_Processor()
			throws Throwable {
		DataConstants.businessName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.businessType = RandomStringUtils.randomAlphabetic(5);
		oBP.enterBusinessName(DataConstants.businessName);
		String s = "Enter \"Business Name\" : " + DataConstants.businessName + "\n";
		oBP.enterBusinessType(DataConstants.businessType);
		s = s + "Enter \"Business Type\" : " + DataConstants.businessType + "\n";
		oBP.selectProcessor("Equitas");
		s = s + "Select Equitas";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Business Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
		oBP.clickOnSubmitButton();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Add Business success message$")
	public void user_must_be_see_Add_Business_success_message() throws Throwable {
		oBP.verifyAddBusinessSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Processor code created successfully!\"");
	}

	@And("^user click on Ok button$")
	public void user_click_on_Ok_button() throws Throwable {
		cP.clickOnOkButton();
		InitializeWebDriver.scenario.write("Click on \"Ok\" button");
	}

	@And("^user click on Ok button for Client$")
	public void user_click_on_Ok_button_for_client() throws Throwable {
		clP.clickOnOkButtonForClient();
		InitializeWebDriver.scenario.write("Click on \"Ok\" button");
	}

	@Then("^user must reached to List Business page validate by URL$")
	public void user_must_reached_to_List_Business_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListBusinessURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list business page");

	}

	@And("^user must be see added business record$")
	public void user_must_be_see_added_business_record() throws Throwable {
		oBP.verifyRecord(DataConstants.businessName);
		InitializeWebDriver.scenario.write("Verified that business added successfully");
	}

	@Then("^user must reached to Add Client page validate by URL$")
	public void user_must_reached_to_Add_Client_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getAddClientURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add client page");
	}

	@And("^user click on Save And Continue button$")
	public void user_click_on_Save_And_Continue_button() throws Throwable {
		clP.clickOnSaveAndContinueButton();
		InitializeWebDriver.scenario.write("Click on \"Save & Continue\" button");
	}

	@Then("^user must be see Add Client success message$")
	public void user_must_be_see_Add_Client_success_message() throws Throwable {
		clP.verifyAddClientSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Client Added Successfully\"");
	}

	@Given("^user fill required data for Commercial Setup$")
	public void user_fill_required_data_for_Commercial_Setup() throws Throwable {
		String oneTimeFee = RandomStringUtils.randomNumeric(3);
		String revenueSharing = RandomStringUtils.randomNumeric(3);
		String monthlyMaintenance = RandomStringUtils.randomNumeric(3);
		String physicalCardCost = RandomStringUtils.randomNumeric(3);
		String virtualCardCost = RandomStringUtils.randomNumeric(3);
		String remarks = RandomStringUtils.randomAlphabetic(5);
		clP.enterOneTimeFee(oneTimeFee);
		String s = "Enter \"One Time Fee\" : " + oneTimeFee + "\n";
		clP.enterRevenueSharing(revenueSharing);
		s = s + "Enter \"Revenue Sharing\" : " + revenueSharing + "\n";
		clP.enterMonthlyMaintenance(monthlyMaintenance);
		s = s + "Enter \"Monthly Maintenance\" : " + monthlyMaintenance + "\n";
		clP.enterPhysicalCardCost(physicalCardCost);
		s = s + "Enter \"Physical Card Cost\" : " + physicalCardCost + "\n";
		clP.enterVirtualCardCost(virtualCardCost);
		s = s + "Enter \"Virtual Card Cost\" : " + virtualCardCost + "\n";
		clP.enterRemarks(remarks);
		s = s + "Enter \"Remarks\" : " + remarks + "\n";
		clP.uploadCommercialDocument(Constants.uploadPath + "cert.jpg");
		s = s + "Upload \"Commercial Document\" : " + Constants.uploadPath + "cert.jpg";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on Commercial Submit button$")
	public void user_click_on_Commercial_Submit_button() throws Throwable {
		clP.clickOnCommercialSubmit();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Add Commercial success message$")
	public void user_must_be_see_Add_Commercial_success_message() throws Throwable {
		clP.verifyAddCommercialSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Commercial added successfully!\"");
	}

	@Given("^user enters OTP$")
	public void user_enters_OTP() throws Throwable {
		clP.enterOTP("");
		InitializeWebDriver.scenario.write("Enter \"OTP\" : ");
	}

	@When("^user click on OTP Submit button$")
	public void user_click_on_OTP_Submit_button() throws Throwable {
		clP.clickOnOTPSubmit();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Message$")
	public void user_must_be_see_Message() throws Throwable {
		clP.verifyOTPMessage();
	}

	@Then("^user must reached to List Client page validate by URL$")
	public void user_must_reached_to_List_Client_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListClientURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list client page");
	}

	@And("^user must be see added client record$")
	public void user_must_be_see_added_client_record() throws Throwable {
		clP.verifyRecord(DataConstants.clientName);
		InitializeWebDriver.scenario.write("Verified that client added successfully");
	}

	@Then("^user must reached to Add Program page validate by URL$")
	public void user_must_reached_to_Add_Program_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getAddProgramURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add program page");
	}

	@When("^user fill required data for Add Program$")
	public void user_fill_required_data_for_Add_Program() throws Throwable {
		DataConstants.DefaultGCProgramName = "DEF_GC_" + RandomStringUtils.randomAlphabetic(8);
		DataConstants.programName = DataConstants.DefaultGCProgramName;
		oPP.selectClient(DataConstants.DefaultClient1);
		String s = "Select " + DataConstants.DefaultClient1 + "\n";
		oPP.enterProgramName(DataConstants.DefaultGCProgramName);
		s = s + "Enter \"Program Name\" : " + DataConstants.DefaultGCProgramName;
		oPP.selectProgramPlan("Default");
		s = s + "Program Plan Default\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GC");
		s = s + "Select GC\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Program with Distributor Plan$")
	public void user_fill_required_data_for_Add_Program_with_Distributor_Plan() throws Throwable {
		DataConstants.SuperDistributorGCProgramName = "SD_GC_" + RandomStringUtils.randomAlphabetic(9);
		DataConstants.programName = DataConstants.SuperDistributorGCProgramName;
		oPP.selectClient(DataConstants.SuperDistributorClient1);
		String s = "Select " + DataConstants.SuperDistributorClient1 + "\n";
		oPP.enterProgramName(DataConstants.SuperDistributorGCProgramName);
		s = s + "Enter \"Program Name\" : " + DataConstants.SuperDistributorGCProgramName;
		oPP.selectProgramPlan("Distributor");
		s = s + "Program Plan Distributor\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GC");
		s = s + "Select GC\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Program for GC1$")
	public void user_fill_required_data_for_Add_Program_for_GC1() throws Throwable {
		DataConstants.DefaultGC1ProgramName = "DEF_GC1_" + RandomStringUtils.randomAlphabetic(7);
		DataConstants.programName = DataConstants.DefaultGC1ProgramName;
		oPP.selectClient(DataConstants.DefaultClient2);
		String s = "Select " + DataConstants.DefaultClient2 + "\n";
		oPP.enterProgramName(DataConstants.DefaultGC1ProgramName);
		s = s + "Enter \"Program Name\" : " + DataConstants.DefaultGC1ProgramName;
		oPP.selectProgramPlan("Default");
		s = s + "Program Plan Default\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GC1");
		s = s + "Select GC1\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Program for GPR$")
	public void user_fill_required_data_for_Add_Program_for_GPR() throws Throwable {
		DataConstants.DefaultGPRProgramName = "DEF_GPR_" + RandomStringUtils.randomAlphabetic(7);
		DataConstants.programName = DataConstants.DefaultGPRProgramName;
		oPP.selectClient(DataConstants.DefaultClient1);
		String s = "Select " + DataConstants.DefaultClient1 + "\n";
		oPP.enterProgramName(DataConstants.DefaultGPRProgramName);
		s = s + "Enter \"Program Name\" : " + DataConstants.DefaultGPRProgramName;
		oPP.selectProgramPlan("Default");
		s = s + "Program Plan Default\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GPR");
		s = s + "Select GPR\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Program for GPR for client2$")
	public void user_fill_required_data_for_Add_Program_for_GPR_for_client2() throws Throwable {
		DataConstants.DefaultGPRProgramName1 = "DEF_GPR_" + RandomStringUtils.randomAlphabetic(7);
		DataConstants.programName = DataConstants.DefaultGPRProgramName1;
		oPP.selectClient(DataConstants.DefaultClient2);
		String s = "Select " + DataConstants.DefaultClient2 + "\n";
		oPP.enterProgramName(DataConstants.DefaultGPRProgramName1);
		s = s + "Enter \"Program Name\" : " + DataConstants.DefaultGPRProgramName1;
		oPP.selectProgramPlan("Default");
		s = s + "Program Plan Default\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GPR");
		s = s + "Select GPR\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Program for GPR with Distributor Plan$")
	public void user_fill_required_data_for_Add_Program_for_GPR_with_Distributor_Plan() throws Throwable {
		DataConstants.SuperDistributorGPRProgramName = "SD_GPR_" + RandomStringUtils.randomAlphabetic(8);
		DataConstants.programName = DataConstants.SuperDistributorGPRProgramName;
		oPP.selectClient(DataConstants.SuperDistributorClient1);
		String s = "Select " + DataConstants.SuperDistributorClient1 + "\n";
		oPP.enterProgramName(DataConstants.SuperDistributorGPRProgramName);
		s = s + "Enter \"Program Name\" : " + DataConstants.SuperDistributorGPRProgramName;
		oPP.selectProgramPlan("Distributor");
		s = s + "Program Plan Distributor\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GPR");
		s = s + "Select GPR\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Program for GPR with Distributor Plan for client2$")
	public void user_fill_required_data_for_Add_Program_for_GPR_with_Distributor_Plan_for_client2() throws Throwable {
		DataConstants.SuperDistributorGPRProgramName1 = "SD_GPR_" + RandomStringUtils.randomAlphabetic(8);
		DataConstants.programName = DataConstants.SuperDistributorGPRProgramName1;
		oPP.selectClient(DataConstants.SuperDistributorClient2);
		String s = "Select " + DataConstants.SuperDistributorClient2 + "\n";
		oPP.enterProgramName(DataConstants.SuperDistributorGPRProgramName1);
		s = s + "Enter \"Program Name\" : " + DataConstants.SuperDistributorGPRProgramName1;
		oPP.selectProgramPlan("Distributor");
		s = s + "Program Plan Distributor\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GPR");
		s = s + "Select GPR\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Program for GC1 with Distributor Plan$")
	public void user_fill_required_data_for_Add_Program_for_GC1_with_Distributor_Plan() throws Throwable {
		DataConstants.SuperDistributorGC1ProgramName = "SD_GC1_" + RandomStringUtils.randomAlphabetic(8);
		DataConstants.programName = DataConstants.SuperDistributorGC1ProgramName;
		oPP.selectClient(DataConstants.SuperDistributorClient2);
		String s = "Select " + DataConstants.SuperDistributorClient2 + "\n";
		oPP.enterProgramName(DataConstants.SuperDistributorGC1ProgramName);
		s = s + "Enter \"Program Name\" : " + DataConstants.DefaultGCProgramName;
		oPP.selectProgramPlan("Distributor");
		s = s + "Program Plan Distributor\n";
		oPP.selectBusinessType(DataConstants.businessType);
		s = s + "Select " + DataConstants.businessType + "\n";
		oPP.selectReloadableCardType("GC1");
		s = s + "Select GC1\n";
		oPP.selectCardType("Virtual");
		s = s + "Select Virtual\n";
		s = oPP.selectSubBinRange(s);
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Program Submit button$")
	public void user_click_on_Program_Submit_button() throws Throwable {
		oPP.clickOnSubmitButton();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Add Program success message$")
	public void user_must_be_see_Add_Program_success_message() throws Throwable {
		oPP.verifyAddProgramSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Program onboarded successfully!\"");
	}

	@Then("^user must reached to List Program page validate by URL$")
	public void user_must_reached_to_List_Program_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListProgramURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list program page");
	}

	@And("^user must be see added Default GC program record$")
	public void user_must_be_see_added_Default_GC_program_record() throws Throwable {
		oPP.verifyRecord(DataConstants.DefaultClient1, DataConstants.DefaultGCProgramName);
		String s = "Verified that program added successfully\n";
		DataConstants.DefaultGCURL = oPP.getHostURL(DataConstants.DefaultGCProgramName);
		s = s + "Host URL : " + DataConstants.DefaultGCURL;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see added Default GC1 program record$")
	public void user_must_be_see_added_Default_GC1_program_record() throws Throwable {
		oPP.verifyRecord(DataConstants.DefaultClient2, DataConstants.DefaultGC1ProgramName);
		String s = "Verified that program added successfully\n";
		DataConstants.DefaultGC1URL = oPP.getHostURL(DataConstants.DefaultGC1ProgramName);
		s = s + "Host URL : " + DataConstants.DefaultGC1ProgramName;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see added Default GPR program record$")
	public void user_must_be_see_added_Default_GPR_program_record() throws Throwable {
		oPP.verifyRecord(DataConstants.DefaultClient1, DataConstants.DefaultGPRProgramName);
		String s = "Verified that program added successfully\n";
		DataConstants.DefaultGPRURL = oPP.getHostURL(DataConstants.DefaultGPRProgramName);
		s = s + "Host URL : " + DataConstants.DefaultGPRProgramName;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see added Default GPR program1 record$")
	public void user_must_be_see_added_Default_GPR_program1_record() throws Throwable {
		oPP.verifyRecord(DataConstants.DefaultClient2, DataConstants.DefaultGPRProgramName1);
		String s = "Verified that program added successfully\n";
		DataConstants.DefaultGPRURL1 = oPP.getHostURL(DataConstants.DefaultGPRProgramName1);
		s = s + "Host URL : " + DataConstants.DefaultGPRProgramName1;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see added SD GC program record$")
	public void user_must_be_see_added_SD_GC_program_record() throws Throwable {
		oPP.verifyRecord(DataConstants.SuperDistributorClient1, DataConstants.SuperDistributorGCProgramName);
		String s = "Verified that program added successfully\n";
		DataConstants.SuperDistributorGCURL = oPP.getHostURL(DataConstants.SuperDistributorGCProgramName);
		s = s + "Host URL : " + DataConstants.SuperDistributorGCProgramName;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see added SD GC1 program record$")
	public void user_must_be_see_added_SD_GC1_program_record() throws Throwable {
		oPP.verifyRecord(DataConstants.SuperDistributorClient2, DataConstants.SuperDistributorGC1ProgramName);
		String s = "Verified that program added successfully\n";
		DataConstants.SuperDistributorGC1URL = oPP.getHostURL(DataConstants.SuperDistributorGC1ProgramName);
		s = s + "Host URL : " + DataConstants.SuperDistributorGC1ProgramName;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see added SD GPR program record$")
	public void user_must_be_see_added_SD_GPR_program_record() throws Throwable {
		oPP.verifyRecord(DataConstants.SuperDistributorClient1, DataConstants.SuperDistributorGPRProgramName);
		String s = "Verified that program added successfully\n";
		DataConstants.SuperDistributorGPRURL = oPP.getHostURL(DataConstants.SuperDistributorGPRProgramName);
		s = s + "Host URL : " + DataConstants.SuperDistributorGPRProgramName;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see added SD GPR program1 record$")
	public void user_must_be_see_added_SD_GPR_program1_record() throws Throwable {
		oPP.verifyRecord(DataConstants.SuperDistributorClient2, DataConstants.SuperDistributorGPRProgramName1);
		String s = "Verified that program added successfully\n";
		DataConstants.SuperDistributorGPRURL1 = oPP.getHostURL(DataConstants.SuperDistributorGPRProgramName1);
		s = s + "Host URL : " + DataConstants.SuperDistributorGPRProgramName1;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Client for default client1$")
	public void user_fill_required_data_for_Add_Client_for_default_client1() throws Throwable {
		DataConstants.DefaultClient1 = RandomStringUtils.randomAlphabetic(5);
		DataConstants.clientName = DataConstants.DefaultClient1;
		String fullName = RandomStringUtils.randomAlphabetic(5);
		String mobileNumber = "941" + RandomStringUtils.randomNumeric(7);
		DataConstants.DefaultGCUserName = RandomStringUtils.randomAlphabetic(3) + "@test.com";
		DataConstants.DefaultGPRUserName = DataConstants.DefaultGCUserName;
		String nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String citizenship = RandomStringUtils.randomAlphabetic(5);
		String address = RandomStringUtils.randomAlphabetic(5);
		clP.enterCompanyName(DataConstants.DefaultClient1);
		String s = "Enter \"Company Name\" : " + DataConstants.DefaultClient1 + "\n";
		clP.enterFullName(fullName);
		s = s + "Enter \"Full Name\" : " + fullName + "\n";
		clP.enterMobileNumber(mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + mobileNumber + "\n";
		clP.enterEmail(DataConstants.DefaultGCUserName);
		s = s + "Enter \"Email\" : " + DataConstants.DefaultGCUserName + "\n";
		clP.enterPassword("123456");
		s = s + "Enter \"Password\" : 123456\n";
		clP.uploadClientLogo(Constants.uploadPath + "client_logo.jpg");
		s = s + "Upload \"Clien tLogo\" : " + Constants.uploadPath + "client_logo.jpg" + "\n";
		clP.enterNameOfDirector(nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + nameOfDirector + "\n";
		clP.enterCitizenship(citizenship);
		s = s + "Enter \"Citizenship\" : " + citizenship + "\n";
		clP.enterAddress(address);
		s = s + "Enter \"Address\" : " + address + "\n";
		clP.enterDirectorDOB("18/07/1995");
		s = s + "Enter \"DOB\" : 18/07/1995";
		InitializeWebDriver.scenario.write(s);
//		clP.uploadDirectorIDProofFront(Constants.uploadPath + "id_front.jpg");
//		clP.uploadDirectorIDProofBack(Constants.uploadPath + "id_back.jpg");
//		clP.uploadGSTCertificate(Constants.uploadPath + "cert.jpg");
//		clP.uploadCompanyPAN(Constants.uploadPath + "pan.jpg");
//		clP.uploadIncorporationCertificate(Constants.uploadPath + "inc_cert.jpg");
//		clP.uploadProjectionCommitment(Constants.uploadPath + "commitment.jpg");
	}

	@When("^user fill required data for Add Client for default client2$")
	public void user_fill_required_data_for_Add_Client_for_default_client2() throws Throwable {
		DataConstants.DefaultClient2 = RandomStringUtils.randomAlphabetic(5);
		DataConstants.clientName = DataConstants.DefaultClient2;
		String fullName = RandomStringUtils.randomAlphabetic(5);
		String mobileNumber = "941" + RandomStringUtils.randomNumeric(7);
		DataConstants.DefaultGC1UserName = RandomStringUtils.randomAlphabetic(3) + "@test.com";
		DataConstants.DefaultGPRUserName = DataConstants.DefaultGC1UserName;
		String nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String citizenship = RandomStringUtils.randomAlphabetic(5);
		String address = RandomStringUtils.randomAlphabetic(5);
		clP.enterCompanyName(DataConstants.DefaultClient2);
		String s = "Enter \"Company Name\" : " + DataConstants.DefaultClient2 + "\n";
		clP.enterFullName(fullName);
		s = s + "Enter \"Full Name\" : " + fullName + "\n";
		clP.enterMobileNumber(mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + mobileNumber + "\n";
		clP.enterEmail(DataConstants.DefaultGC1UserName);
		s = s + "Enter \"Email\" : " + DataConstants.DefaultGC1UserName + "\n";
		clP.enterPassword("123456");
		s = s + "Enter \"Password\" : 123456\n";
		clP.uploadClientLogo(Constants.uploadPath + "client_logo.jpg");
		s = s + "Upload \"Clien tLogo\" : " + Constants.uploadPath + "client_logo.jpg" + "\n";
		clP.enterNameOfDirector(nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + nameOfDirector + "\n";
		clP.enterCitizenship(citizenship);
		s = s + "Enter \"Citizenship\" : " + citizenship + "\n";
		clP.enterAddress(address);
		s = s + "Enter \"Address\" : " + address + "\n";
		clP.enterDirectorDOB("18/07/1995");
		s = s + "Enter \"DOB\" : 18/07/1995";
		InitializeWebDriver.scenario.write(s);
//		clP.uploadDirectorIDProofFront(Constants.uploadPath + "id_front.jpg");
//		clP.uploadDirectorIDProofBack(Constants.uploadPath + "id_back.jpg");
//		clP.uploadGSTCertificate(Constants.uploadPath + "cert.jpg");
//		clP.uploadCompanyPAN(Constants.uploadPath + "pan.jpg");
//		clP.uploadIncorporationCertificate(Constants.uploadPath + "inc_cert.jpg");
//		clP.uploadProjectionCommitment(Constants.uploadPath + "commitment.jpg");
	}

	@When("^user fill required data for Add Client for sd client1$")
	public void user_fill_required_data_for_Add_Client_for_sd_client1() throws Throwable {
		DataConstants.SuperDistributorClient1 = RandomStringUtils.randomAlphabetic(5);
		DataConstants.clientName = DataConstants.SuperDistributorClient1;
		String fullName = RandomStringUtils.randomAlphabetic(5);
		String mobileNumber = "941" + RandomStringUtils.randomNumeric(7);
		DataConstants.SuperDistributorGCUserName = RandomStringUtils.randomAlphabetic(3) + "@test.com";
		DataConstants.SuperDistributorGPRUserName = DataConstants.SuperDistributorGCUserName;
		String nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String citizenship = RandomStringUtils.randomAlphabetic(5);
		String address = RandomStringUtils.randomAlphabetic(5);
		clP.enterCompanyName(DataConstants.SuperDistributorClient1);
		String s = "Enter \"Company Name\" : " + DataConstants.SuperDistributorClient1 + "\n";
		clP.enterFullName(fullName);
		s = s + "Enter \"Full Name\" : " + fullName + "\n";
		clP.enterMobileNumber(mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + mobileNumber + "\n";
		clP.enterEmail(DataConstants.SuperDistributorGCUserName);
		s = s + "Enter \"Email\" : " + DataConstants.SuperDistributorGCUserName + "\n";
		clP.enterPassword("123456");
		s = s + "Enter \"Password\" : 123456\n";
		clP.uploadClientLogo(Constants.uploadPath + "client_logo.jpg");
		s = s + "Upload \"Clien tLogo\" : " + Constants.uploadPath + "client_logo.jpg" + "\n";
		clP.enterNameOfDirector(nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + nameOfDirector + "\n";
		clP.enterCitizenship(citizenship);
		s = s + "Enter \"Citizenship\" : " + citizenship + "\n";
		clP.enterAddress(address);
		s = s + "Enter \"Address\" : " + address + "\n";
		clP.enterDirectorDOB("18/07/1995");
		s = s + "Enter \"DOB\" : 18/07/1995";
		InitializeWebDriver.scenario.write(s);
//		clP.uploadDirectorIDProofFront(Constants.uploadPath + "id_front.jpg");
//		clP.uploadDirectorIDProofBack(Constants.uploadPath + "id_back.jpg");
//		clP.uploadGSTCertificate(Constants.uploadPath + "cert.jpg");
//		clP.uploadCompanyPAN(Constants.uploadPath + "pan.jpg");
//		clP.uploadIncorporationCertificate(Constants.uploadPath + "inc_cert.jpg");
//		clP.uploadProjectionCommitment(Constants.uploadPath + "commitment.jpg");
	}

	@When("^user fill required data for Add Client for sd client2$")
	public void user_fill_required_data_for_Add_Client_for_sd_client2() throws Throwable {
		DataConstants.SuperDistributorClient2 = RandomStringUtils.randomAlphabetic(5);
		DataConstants.clientName = DataConstants.SuperDistributorClient2;
		String fullName = RandomStringUtils.randomAlphabetic(5);
		String mobileNumber = "941" + RandomStringUtils.randomNumeric(7);
		DataConstants.SuperDistributorGC1UserName = RandomStringUtils.randomAlphabetic(3) + "@test.com";
		DataConstants.SuperDistributorGPRUserName1 = DataConstants.SuperDistributorGC1UserName;
		String nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String citizenship = RandomStringUtils.randomAlphabetic(5);
		String address = RandomStringUtils.randomAlphabetic(5);
		clP.enterCompanyName(DataConstants.SuperDistributorClient2);
		String s = "Enter \"Company Name\" : " + DataConstants.SuperDistributorClient2 + "\n";
		clP.enterFullName(fullName);
		s = s + "Enter \"Full Name\" : " + fullName + "\n";
		clP.enterMobileNumber(mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + mobileNumber + "\n";
		clP.enterEmail(DataConstants.SuperDistributorGC1UserName);
		s = s + "Enter \"Email\" : " + DataConstants.SuperDistributorGC1UserName + "\n";
		clP.enterPassword("123456");
		s = s + "Enter \"Password\" : 123456\n";
		clP.uploadClientLogo(Constants.uploadPath + "client_logo.jpg");
		s = s + "Upload \"Clien tLogo\" : " + Constants.uploadPath + "client_logo.jpg" + "\n";
		clP.enterNameOfDirector(nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + nameOfDirector + "\n";
		clP.enterCitizenship(citizenship);
		s = s + "Enter \"Citizenship\" : " + citizenship + "\n";
		clP.enterAddress(address);
		s = s + "Enter \"Address\" : " + address + "\n";
		clP.enterDirectorDOB("18/07/1995");
		s = s + "Enter \"DOB\" : 18/07/1995";
		InitializeWebDriver.scenario.write(s);
//		clP.uploadDirectorIDProofFront(Constants.uploadPath + "id_front.jpg");
//		clP.uploadDirectorIDProofBack(Constants.uploadPath + "id_back.jpg");
//		clP.uploadGSTCertificate(Constants.uploadPath + "cert.jpg");
//		clP.uploadCompanyPAN(Constants.uploadPath + "pan.jpg");
//		clP.uploadIncorporationCertificate(Constants.uploadPath + "inc_cert.jpg");
//		clP.uploadProjectionCommitment(Constants.uploadPath + "commitment.jpg");
	}

//	@And("^print details$")
//	public void print_details() throws Throwable {
//		System.err.println("================================================================");
//		System.out.println(DataConstants.DefaultGCURL + " : DefaultGCURL");
//		System.out.println(DataConstants.DefaultGC1URL + " : DefaultGC1URL");
//		System.out.println(DataConstants.DefaultGPRURL + " : DefaultGPRURL");
//		System.out.println(DataConstants.DefaultGPRURL1 + " : DefaultGPRURL1");
//		System.out.println(DataConstants.SuperDistributorGCURL + " : SuperDistributorGCURL");
//		System.out.println(DataConstants.SuperDistributorGC1URL + " : SuperDistributorGC1URL");
//		System.out.println(DataConstants.SuperDistributorGPRURL + " : SuperDistributorGPRURL");
//		System.out.println(DataConstants.SuperDistributorGPRURL1 + " : SuperDistributorGPRURL1");
//		System.err.println("================================================================");
//		System.err.println("================================================================");
//		System.out.println(DataConstants.DefaultClient1 + " : DefaultClient1");
//		System.out.println(DataConstants.DefaultGCUserName + " : DefaultGCUserName");
//		System.out.println(DataConstants.DefaultGCProgramName + " : DefaultGCProgramName");
//		System.out.println(DataConstants.DefaultGPRUserName + " : DefaultGPRUserName");
//		System.out.println(DataConstants.DefaultGPRProgramName + " : DefaultGPRProgramName");
//
//		System.out.println(DataConstants.DefaultClient2 + " : DefaultClient2");
//		System.out.println(DataConstants.DefaultGC1UserName + " : DefaultGC1UserName");
//		System.out.println(DataConstants.DefaultGC1ProgramName + " : DefaultGC1ProgramName");
//		System.out.println(DataConstants.DefaultGPRUserName1 + " : DefaultGPRUserName1");
//		System.out.println(DataConstants.DefaultGPRProgramName1 + " : DefaultGPRProgramName1");
//
//		System.out.println(DataConstants.SuperDistributorClient1 + " : SDClient1");
//		System.out.println(DataConstants.SuperDistributorGCUserName + " : SDGCUserName");
//		System.out.println(DataConstants.SuperDistributorGPRUserName + " : SDGPRUserName");
//		System.out.println(DataConstants.SuperDistributorGCProgramName + " : SDGCProgramName");
//		System.out.println(DataConstants.SuperDistributorGPRProgramName + " : SDGPRProgramName");
//
//		System.out.println(DataConstants.SuperDistributorClient2 + " : SDClient2");
//		System.out.println(DataConstants.SuperDistributorGC1UserName + " : SDGC1UserName");
//		System.out.println(DataConstants.SuperDistributorGC1ProgramName + " : SDGC1ProgramName");
//		System.out.println(DataConstants.SuperDistributorGPRProgramName1 + " : SDGPRProgramName1");
//		System.err.println("================================================================");
//	}
}
