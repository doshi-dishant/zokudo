package com.zokudo.framework.stepdefinition;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.RetailerPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RetailerDef {
	private RetailerPage rP = new RetailerPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);

	@Then("^user must reached to Add Retailer page validate by URL$")
	public void user_must_reached_to_Add_Retailer_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getAddRetailerURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add retailer page");
	}

	@Then("^user must reached to List Retailer page validate by URL$")
	public void user_must_reached_to_List_Retailer_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListRetailerURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list retailer page");
	}

	@When("^user fill required data for Add Retailer for GC$")
	public void user_fill_required_data_for_Add_Retailer_for_GC() throws Throwable {
		String ret_companyName = RandomStringUtils.randomAlphabetic(4);
		String ret_fullName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.ret_mobileNumber = "987" + RandomStringUtils.randomNumeric(7);
		DataConstants.GCRetailerUseName = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		String ret_password = "123456";
		String ret_nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String ret_cityzenship = RandomStringUtils.randomAlphabetic(5);
		String ret_address = RandomStringUtils.randomAlphabetic(5);
		rP.enterCompanyName(ret_companyName);
		String s = "Enter \"Company Name\" : " + ret_companyName + "\n";
		rP.enterFullName(ret_fullName);
		s = s + "Enter \"Full Name\" : " + ret_fullName + "\n";
		rP.enterMobileNum(DataConstants.ret_mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + DataConstants.ret_mobileNumber + "\n";
		rP.enterEmail(DataConstants.GCRetailerUseName);
		s = s + "Enter \"Email\" : " + DataConstants.GCRetailerUseName + "\n";
		rP.enterPass(ret_password);
		s = s + "Enter \"Password\" : " + ret_password + "\n";
		rP.enterConfirmPassword(ret_password);
		s = s + "Enter \"Confirm Password\" : " + ret_password + "\n";
		rP.enterNameOfDirector(ret_nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + ret_nameOfDirector + "\n";
		rP.enterCitizenShip(ret_cityzenship);
		s = s + "Enter \"Citizenship\" : " + ret_cityzenship + "\n";
		rP.enterAddress(ret_address);
		s = s + "Enter \"Address\" : " + ret_address + "\n";
		rP.enterDOB("10/18/1994");
		s = s + "Enter \"DOB\" : 10/18/1994";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Retailer for GC1$")
	public void user_fill_required_data_for_Add_Retailer_for_GC1() throws Throwable {
		String ret_companyName = RandomStringUtils.randomAlphabetic(4);
		String ret_fullName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.ret_mobileNumber = "987" + RandomStringUtils.randomNumeric(7);
		DataConstants.GC1RetailerUseName = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		String ret_password = "123456";
		String ret_nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String ret_cityzenship = RandomStringUtils.randomAlphabetic(5);
		String ret_address = RandomStringUtils.randomAlphabetic(5);
		rP.enterCompanyName(ret_companyName);
		String s = "Enter \"Company Name\" : " + ret_companyName + "\n";
		rP.enterFullName(ret_fullName);
		s = s + "Enter \"Full Name\" : " + ret_fullName + "\n";
		rP.enterMobileNum(DataConstants.ret_mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + DataConstants.ret_mobileNumber + "\n";
		rP.enterEmail(DataConstants.GC1RetailerUseName);
		s = s + "Enter \"Email\" : " + DataConstants.GC1RetailerUseName + "\n";
		rP.enterPass(ret_password);
		s = s + "Enter \"Password\" : " + ret_password + "\n";
		rP.enterConfirmPassword(ret_password);
		s = s + "Enter \"Confirm Password\" : " + ret_password + "\n";
		rP.enterNameOfDirector(ret_nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + ret_nameOfDirector + "\n";
		rP.enterCitizenShip(ret_cityzenship);
		s = s + "Enter \"Citizenship\" : " + ret_cityzenship + "\n";
		rP.enterAddress(ret_address);
		s = s + "Enter \"Address\" : " + ret_address + "\n";
		rP.enterDOB("10/18/1994");
		s = s + "Enter \"DOB\" : 10/18/1994";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Retailer for GPR$")
	public void user_fill_required_data_for_Add_Retailer_for_GPR() throws Throwable {
		String ret_companyName = RandomStringUtils.randomAlphabetic(4);
		String ret_fullName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.ret_mobileNumber = "987" + RandomStringUtils.randomNumeric(7);
		DataConstants.GPRRetailerUseName = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		String ret_password = "123456";
		String ret_nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String ret_cityzenship = RandomStringUtils.randomAlphabetic(5);
		String ret_address = RandomStringUtils.randomAlphabetic(5);
		rP.enterCompanyName(ret_companyName);
		String s = "Enter \"Company Name\" : " + ret_companyName + "\n";
		rP.enterFullName(ret_fullName);
		s = s + "Enter \"Full Name\" : " + ret_fullName + "\n";
		rP.enterMobileNum(DataConstants.ret_mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + DataConstants.ret_mobileNumber + "\n";
		rP.enterEmail(DataConstants.GPRRetailerUseName);
		s = s + "Enter \"Email\" : " + DataConstants.GPRRetailerUseName + "\n";
		rP.enterPass(ret_password);
		s = s + "Enter \"Password\" : " + ret_password + "\n";
		rP.enterConfirmPassword(ret_password);
		s = s + "Enter \"Confirm Password\" : " + ret_password + "\n";
		rP.enterNameOfDirector(ret_nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + ret_nameOfDirector + "\n";
		rP.enterCitizenShip(ret_cityzenship);
		s = s + "Enter \"Citizenship\" : " + ret_cityzenship + "\n";
		rP.enterAddress(ret_address);
		s = s + "Enter \"Address\" : " + ret_address + "\n";
		rP.enterDOB("10/18/1994");
		s = s + "Enter \"DOB\" : 10/18/1994";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Add Retailer Submit button$")
	public void user_click_on_Add_Retailer_Submit_button() throws Throwable {
		rP.clickOnSubmitRetailer();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Add Retailer success message$")
	public void user_must_be_see_Add_Retailer_success_message() throws Throwable {
		rP.verifyAddRetailerSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Agent added successfully\"");
	}

	@When("^user search for retailer$")
	public void user_search_for_retailer() throws Throwable {
		rP.searchRetailer(DataConstants.ret_mobileNumber);
	}

	@Then("^user must be able to see searched retailer details$")
	public void user_must_be_able_to_see_searched_retailer_details() throws Throwable {
		rP.verifyRetailerAdded(DataConstants.ret_mobileNumber);
		InitializeWebDriver.scenario.write("Verified retailer added successfully");
	}
}
