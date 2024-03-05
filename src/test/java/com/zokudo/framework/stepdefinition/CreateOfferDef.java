package com.zokudo.framework.stepdefinition;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.CreateOfferPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateOfferDef {

	private CreateOfferPage cP = new CreateOfferPage(ObjectRepo.driver);
	private CommonPage comP = new CommonPage(ObjectRepo.driver);
	private static String terminal1, tempTerminal;
	private static final String description = RandomStringUtils.randomAlphabetic(5);
	private static final String location = RandomStringUtils.randomAlphabetic(5);
	private static String url;
	private static final String minPrice = "10";
	private static final String maxPrice = "1000";
	private static String merchantId;
	private static String email;
	private static String mobile;
	private static String merchantName;
	private static final String merchantNameNegative = RandomStringUtils.randomAlphabetic(5);
	private static String brandName;

	@Then("^user must reached to Add Brand page validate by URL$")
	public void user_must_reached_to_Add_Brand_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getAddBrandURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add brand page");
	}

	@When("^user fill required data for Add Brand$")
	public void user_fill_required_data_for_Add_Brand() throws Throwable {
		brandName = RandomStringUtils.randomAlphabetic(5);
		url = "http://www." + RandomStringUtils.randomAlphabetic(5) + ".com";
		cP.enterBrandName(brandName);
		String string = "Enter \"Brand Name\" : " + brandName + "\n";
		String s[] = { "Food and Dining" };
		cP.selectBrandCategory(s);
		string = string + "Select food and dining\n";
		cP.enterDescription(description);
		string = string + "Enter \"Description\" : " + description + "\n";
		cP.enterLocation(location);
		string = string + "Enter \"Location\" : " + location + "\n";
		cP.enterWebURL(url);
		string = string + "Enter \"Web URL\" : " + url + "\n";
		cP.enterMinPrice(minPrice);
		string = string + "Enter \"Min Price\" : " + minPrice + "\n";
		cP.enterMaxPrice(maxPrice);
		string = string + "Enter \"Max Price\" : " + maxPrice + "\n";
		cP.uploadFirstCategoryLogo(Constants.uploadPath + "test.jpg");
		string = string + "Upload \"First Category Logo\" : " + Constants.uploadPath + "test.jpg\n";
		cP.uploadSecondCategoryLogo(Constants.uploadPath + "test.jpg");
		string = string + "Upload \"Second Category Logo\" : " + Constants.uploadPath + "test.jpg\n";
		cP.uploadThirdCategoryLogo(Constants.uploadPath + "test.jpg");
		string = string + "Upload \"Third Category Logo\" : " + Constants.uploadPath + "test.jpg\n";
		cP.uploadBrandLogo(Constants.uploadPath + "brand.jpg");
		string = string + "Upload \"Brand Logo\" : " + Constants.uploadPath + "brand.jpg\n";
		cP.uploadOfferLogo(Constants.uploadPath + "offer.jpg");
		string = string + "Upload \"Offer Logo\" : " + Constants.uploadPath + "offer.jpg\n";
		InitializeWebDriver.scenario.write(string);
	}

	@And("^user click on Merchant Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
		cP.clickOnSubmitButton();
		String s = "Click on \"Submit\" button\n";
		comP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see Add Brand success message$")
	public void user_must_be_see_Add_Brand_success_message() throws Throwable {
		cP.verifyAddBrandSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Brand Added Successfully!\"");
	}

	@Then("^user must reached to List Brand page validate by URL$")
	public void user_must_reached_to_List_Brand_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getListBrandURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list brand page");
	}

	@And("^user must be see added branch record$")
	public void user_must_be_see_added_branch_record() throws Throwable {
		cP.verifyBrandRecord(brandName);
		InitializeWebDriver.scenario.write("Verified that brand added successfully");
	}

	@Then("^user must reached to Add Merchant page validate by URL$")
	public void user_must_reached_to_Add_Merchant_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getAddMerchantURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add merchant page");
	}

	@When("^user fill required data for Add Merchant$")
	public void user_fill_required_data_for_Add_Merchant() throws Throwable {
		merchantId = RandomStringUtils.randomAlphabetic(5);
		merchantName = RandomStringUtils.randomAlphabetic(5);
		email = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		mobile = "786" + RandomStringUtils.randomNumeric(7);
		terminal1 = RandomStringUtils.randomAlphabetic(5);
		tempTerminal = terminal1;
		cP.selectBrand(brandName);
		String string = "Select " + brandName + "\n";
		cP.enterMerchantId(merchantId);
		string = string + "Enter \"Merchant Name\" : " + merchantId + "\n";
		cP.enterEmailId(email);
		string = string + "Enter \"Email\" : " + email + "\n";
		cP.enterMobile(mobile);
		string = string + "Enter \"Mobile Number\" : " + mobile + "\n";
		cP.enterMerchantName(merchantName);
		string = string + "Enter \"Merchant Name\" : " + merchantName + "\n";
		String s[] = { terminal1 };
		string = cP.addTerminal(s, string);
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Merchant 11.20$")
	public void user_fill_required_data_for_Add_Merchant_11_20() throws Throwable {
		terminal1 = RandomStringUtils.randomAlphabetic(5);
		cP.selectBrand(brandName);
		String string = "Select " + brandName + "\n";
		cP.enterMerchantId(merchantId);
		string = string + "Enter \"Merchant Name\" : " + merchantId + "\n";
		cP.enterEmailId(email);
		string = string + "Enter \"Email\" : " + email + "\n";
		cP.enterMobile(mobile);
		string = string + "Enter \"Mobile Number\" : " + mobile + "\n";
		cP.enterMerchantName(merchantName);
		string = string + "Enter \"Merchant Name\" : " + merchantName + "\n";
		String s[] = { terminal1 };
		string = cP.addTerminal(s, string);
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Merchant with new terminal$")
	public void user_fill_required_data_for_Add_Merchant_with_new_terminal() throws Throwable {
		terminal1 = RandomStringUtils.randomAlphabetic(5);
		cP.selectBrand(brandName);
		String string = "Select " + brandName + "\n";
		cP.enterMerchantId(merchantId);
		string = string + "Enter \"Merchant Name\" : " + merchantId + "\n";
		cP.enterEmailId(email);
		string = string + "Enter \"Email\" : " + email + "\n";
		cP.enterMobile(mobile);
		string = string + "Enter \"Mobile Number\" : " + mobile + "\n";
		cP.enterMerchantName(merchantName);
		string = string + "Enter \"Merchant Name\" : " + merchantName + "\n";
		String s[] = { terminal1 };
		string = cP.addTerminal(s, string);
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Merchant with new terminal and existing brand$")
	public void user_fill_required_data_for_Add_Merchant_with_new_terminal_and_existing_brand() throws Throwable {
		email = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		mobile = "786" + RandomStringUtils.randomNumeric(7);
		merchantName = RandomStringUtils.randomAlphabetic(5);
		merchantId = RandomStringUtils.randomAlphabetic(5);
		cP.selectBrand(brandName);
		String string = "Select " + brandName + "\n";
		cP.enterMerchantId(merchantId);
		string = string + "Enter \"Merchant Name\" : " + merchantId + "\n";
		cP.enterEmailId(email);
		string = string + "Enter \"Email\" : " + email + "\n";
		cP.enterMobile(mobile);
		string = string + "Enter \"Mobile Number\" : " + mobile + "\n";
		cP.enterMerchantName(merchantName);
		string = string + "Enter \"Merchant Name\" : " + merchantName + "\n";
		String s[] = { terminal1 };
		string = cP.addTerminal(s, string);
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Merchant existing Terminals under Mechant$")
	public void user_fill_required_data_for_Add_Merchant_existing_Terminals_under_Mechant() throws Throwable {
//		merchantName =  RandomStringUtils.randomAlphabetic(5);
		email = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		mobile = "786" + RandomStringUtils.randomNumeric(7);
		cP.selectBrand(brandName);
		String string = "Select " + brandName + "\n";
		cP.enterMerchantId(merchantId);
		string = string + "Enter \"Merchant Name\" : " + merchantId + "\n";
		cP.enterEmailId(email);
		string = string + "Enter \"Email\" : " + email + "\n";
		cP.enterMobile(mobile);
		string = string + "Enter \"Mobile Number\" : " + mobile + "\n";
		cP.enterMerchantName(merchantName);
		string = string + "Enter \"Merchant Name\" : " + merchantName + "\n";
		String s[] = { terminal1 };
		string = cP.addTerminal(s, string);
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Merchant without terminal$")
	public void user_fill_required_data_for_Add_Merchant_without_terminal() throws Throwable {
		merchantId = RandomStringUtils.randomAlphabetic(5);
		merchantName = RandomStringUtils.randomAlphabetic(5);
		email = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		mobile = "786" + RandomStringUtils.randomNumeric(7);
		terminal1 = RandomStringUtils.randomAlphabetic(5);
		cP.selectBrand(brandName);
		String string = "Select " + brandName + "\n";
		cP.enterMerchantId(merchantId);
		string = string + "Enter \"Merchant Name\" : " + merchantId + "\n";
		cP.enterEmailId(email);
		string = string + "Enter \"Email\" : " + email + "\n";
		cP.enterMobile(mobile);
		string = string + "Enter \"Mobile Number\" : " + mobile + "\n";
		cP.enterMerchantName(merchantName);
		string = string + "Enter \"Merchant Name\" : " + merchantName + "\n";
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Merchant negative$")
	public void user_fill_required_data_for_Add_Merchant_negative() throws Throwable {
		cP.selectBrand(brandName);
		String string = "Select " + brandName + "\n";
		cP.enterMerchantId(merchantId);
		string = string + "Enter \"Merchant Name\" : " + merchantId + "\n";
		cP.enterEmailId(email);
		string = string + "Enter \"Email\" : " + email + "\n";
		cP.enterMobile(mobile);
		string = string + "Enter \"Mobile Number\" : " + mobile + "\n";
		cP.enterMerchantName(merchantNameNegative);
		string = string + "Enter \"Merchant Name\" : " + merchantNameNegative + "\n";
		String s[] = { terminal1 };
		string = cP.addTerminal(s, string);
		InitializeWebDriver.scenario.write(string);
	}

	@Then("^user must be see Add Merchant success message$")
	public void user_must_be_see_Add_Merchant_success_message() throws Throwable {
		cP.verifyAddMerchantSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Merchant Added Successfully!\"");
	}

	@And("^user stop$")
	public void user_stop() throws Throwable {
		System.out.println();
	}

	@Then("^user must be see Update Merchant success message$")
	public void user_must_be_see_Update_Merchant_success_message() throws Throwable {
		cP.verifyUpdateMerchantSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Merchant Added Successfully!\"");
	}

	@Then("^user must be see merchant id comibination error message$")
	public void user_must_be_see_merchant_id_comibination_error_message() throws Throwable {
		cP.verifyAddMerchantIdCombinationErrorMessage();
		InitializeWebDriver.scenario.write(
				"Verified message \"Failed to add merchant! The combination of merchantId and one or more TerminalId's is already present\"");
	}

	@Then("^user must be see update merchant id comibination error message$")
	public void user_must_be_see_update_merchant_id_comibination_error_message() throws Throwable {
		cP.verifyUpdateMerchantIdCombinationErrorMessage();
		InitializeWebDriver.scenario.write(
				"Verified message \"Unable to update Merchant.the combination of merchantId and one or more TerminalIds is already present\"");
	}

	@Then("^user must reached to List Merchant page validate by URL$")
	public void user_must_reached_to_List_Merchant_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getListMerchantURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list merchant page");
	}

	@And("^user must be see added merchant record$")
	public void user_must_be_see_added_merchant_record() throws Throwable {
		cP.verifyMerchantRecord(merchantName);
		InitializeWebDriver.scenario.write("Verified that merchant added successfully");
	}

	@And("^user update terminalId$")
	public void user_update_terminalId() throws Throwable {
		cP.clickOnEditButton();
		InitializeWebDriver.scenario.write("Verified that merchant added successfully");
	}

	@And("^verify no terminal added under merchant$")
	public void verify_no_terminal_added_under_merchant() throws Throwable {
		cP.clickOnEditButton();
		cP.verifyTerminalCount(0);
		InitializeWebDriver.scenario.write("Verified that no terminal added under merchant");
	}

	@And("^user add terminal")
	public void user_add_terminal() throws Throwable {
		cP.clickOnEditButton();
		String s[] = { terminal1 };
		String string = cP.addTerminal(s, "");
		InitializeWebDriver.scenario.write(string);
	}

	@And("^user add existig terminal")
	public void user_add_existig_terminal() throws Throwable {
		cP.clickOnEditButton();
		String s[] = { terminal1, tempTerminal };
		String string = cP.addTerminal(s, "");
		InitializeWebDriver.scenario.write(string);
	}

	@And("^user add new terminal")
	public void user_add_new_terminal() throws Throwable {
		cP.clickOnEditButton();
		terminal1 = RandomStringUtils.randomAlphabetic(5);
		String s[] = { terminal1 };
		String string = cP.addTerminal(s, "");
		InitializeWebDriver.scenario.write(string);
	}

	@Then("^user must reached to Create Offer page validate by URL$")
	public void user_must_reached_to_Create_Offer_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getCreateOfferURL());
		InitializeWebDriver.scenario.write("Verified that user reached on create offer page");
	}

	@When("^user fill required data for Create Offer$")
	public void user_fill_required_data_for_Create_Offer() throws Throwable {
		cP.selectBrand(brandName);
		String s = "Select " + brandName + "\n";
		String merchant[] = { merchantName };
		String defaultProgram[] = { "All" };
		s = s + "Select All\n";
//		String lending[] = { "All" };
//		String distributor[] = { "All" };
		cP.selectMerchantId(merchant);
		s = s + "Select " + merchantId + "\n";
		cP.selectDefaultProgramCode(defaultProgram);
		s = s + "Select " + defaultProgram + "\n";
//		mP.selecLendingProgramCode(lending);
//		mP.selecDistributorProgramCode(distributor);
		cP.selectOfferValidity("", "");
		cP.selectCashbackType("Fixed");
		s = s + "Select Fixed\n";
		cP.enterCashbackValue("10");
		s = s + "Enter \"Cashback\" : 10\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Create Offer Percentage$")
	public void user_fill_required_data_for_Create_Offer_Percentage() throws Throwable {
		cP.selectBrand(brandName);
		String s = "Select " + brandName + "\n";
		String merchant[] = { merchantName };
		String defaultProgram[] = { "All" };
		s = s + "Select All\n";
//		String lending[] = { "All" };
//		String distributor[] = { "All" };
		cP.selectMerchantId(merchant);
		s = s + "Select " + merchantId + "\n";
		cP.selectDefaultProgramCode(defaultProgram);
		s = s + "Select " + defaultProgram + "\n";
//		mP.selecLendingProgramCode(lending);
//		mP.selecDistributorProgramCode(distributor);
		cP.selectOfferValidity("", "");
		cP.selectCashbackType("Percentage");
		s = s + "Select Percentage\n";
		cP.enterCashbackValue("10");
		s = s + "Enter \"Cashback\" : 10\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Create Offer distributor$")
	public void user_fill_required_data_for_Create_Offer_distributor() throws Throwable {
		cP.selectBrand(brandName);
		String s = "Select " + brandName + "\n";
		String merchant[] = { merchantName };
		String distributor[] = { "All" };
		s = s + "Select All\n";
		cP.selectMerchantId(merchant);
		s = s + "Select " + merchantId + "\n";
		cP.selecDistributorProgramCode(distributor);
		cP.selectOfferValidity("", "");
		cP.selectCashbackType("Fixed");
		s = s + "Select Fixed\n";
		cP.enterCashbackValue("1.25");
		s = s + "Enter \"Cashback\" : 1.25\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Create Offer distributor Percentage$")
	public void user_fill_required_data_for_Create_Offer_distributor_Percentage() throws Throwable {
		cP.selectBrand(brandName);
		String s = "Select " + brandName + "\n";
		String merchant[] = { merchantName };
		String distributor[] = { "All" };
		s = s + "Select All\n";
		cP.selectMerchantId(merchant);
		s = s + "Select " + merchantId + "\n";
		cP.selecDistributorProgramCode(distributor);
		cP.selectOfferValidity("", "");
		cP.selectCashbackType("Percentage");
		s = s + "Select Percentage\n";
		cP.enterCashbackValue("1.25");
		s = s + "Enter \"Cashback\" : 1.25\n";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Offer Submit button$")
	public void user_click_on_Offer_Submit_button() throws Throwable {
		cP.clickOnOfferSubmitButton();
		InitializeWebDriver.scenario.write("Click on\"Submit\" button");
	}

	@Then("^user must be see Create Offer success message$")
	public void user_must_be_see_Create_Offer_success_message() throws Throwable {
		cP.verifyCreateOfferSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Cashback and brand offer updated successfully\"");
	}

	@Then("^user must reached to List Offer page validate by URL$")
	public void user_must_reached_to_List_Offer_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getListOfferURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list offer page");
	}

	@Then("^user must be see added offer record$")
	public void user_must_be_see_added_offer_record() throws Throwable {
		cP.verifyRecord(brandName);
		InitializeWebDriver.scenario.write("Verified that offer added successfully");
	}

	@Then("^user terminate offer$")
	public void user_terminate_offer() throws Throwable {
		cP.terminateOffer(brandName);
		InitializeWebDriver.scenario.write("Verified that offer is terminated successfully");
	}

	@Then("^user must be see Add Merchant failure message$")
	public void user_must_be_see_Add_Merchant_failure_message() throws Throwable {
		cP.verifyAddMerchantFailureMessage();
		InitializeWebDriver.scenario
				.write("Verified message \"Failed to add merchant! Brand Already Exists for this Merchant.\"");
	}

	@Then("^user must be see Create Offer failure message$")
	public void user_must_be_see_Create_Offer_failure_message() throws Throwable {
		cP.verifyCreateOfferFailureMessage();
		InitializeWebDriver.scenario.write(
				"Verified message \"Offer is active for this Brand and Merchant! Please terminate existing offer to configure new one!\"");
	}
}
