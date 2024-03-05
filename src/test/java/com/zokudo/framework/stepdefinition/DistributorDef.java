package com.zokudo.framework.stepdefinition;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.DistributorPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DistributorDef {
	private DistributorPage dP = new DistributorPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);

	@Then("^user must reached to Add Distributor page validate by URL$")
	public void user_must_reached_to_Add_Distributor_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getAddDistributorURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add distributor page");
	}

	@When("^user fill required data for Add Distributor for GC$")
	public void user_fill_required_data_for_Add_Distributor_for_GC() throws Throwable {
		String dis_companyName = RandomStringUtils.randomAlphabetic(4);
		String dis_fullName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.dis_mobileNumber = "982" + RandomStringUtils.randomNumeric(7);
		DataConstants.GCDistributorUseName = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		String dis_password = "123456";
		String dis_nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String dis_cityzenship = RandomStringUtils.randomAlphabetic(5);
		String dis_address = RandomStringUtils.randomAlphabetic(5);
		dP.enterCompanyName(dis_companyName);
		String s = "Enter \"Company Name\" : " + dis_companyName + "\n";
		dP.enterFullName(dis_fullName);
		s = s + "Enter \"Full Name\" : " + dis_fullName + "\n";
		dP.enterMobileNum(DataConstants.dis_mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + DataConstants.dis_mobileNumber + "\n";
		dP.enterEmail(DataConstants.GCDistributorUseName);
		s = s + "Enter \"Email\" : " + DataConstants.GCDistributorUseName + "\n";
		dP.enterPass(dis_password);
		s = s + "Enter \"Password\" : " + dis_password + "\n";
		dP.enterConfirmPassword(dis_password);
		s = s + "Enter \"Confirm Password\" : " + dis_password + "\n";
		dP.enterNameOfDirector(dis_nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + dis_nameOfDirector + "\n";
		dP.enterCitizenShip(dis_cityzenship);
		s = s + "Enter \"Citizenship\" : " + dis_cityzenship + "\n";
		dP.enterAddress(dis_address);
		s = s + "Enter \"Address\" : " + dis_address + "\n";
		dP.enterDOB("10/18/1994");
		s = s + "Enter \"DOB\" : 10/18/1994";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Distributor for GC1$")
	public void user_fill_required_data_for_Add_Distributor_for_GC1() throws Throwable {
		String dis_companyName = RandomStringUtils.randomAlphabetic(4);
		String dis_fullName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.dis_mobileNumber = "982" + RandomStringUtils.randomNumeric(7);
		DataConstants.GC1DistributorUseName = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		String dis_password = "123456";
		String dis_nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String dis_cityzenship = RandomStringUtils.randomAlphabetic(5);
		String dis_address = RandomStringUtils.randomAlphabetic(5);
		dP.enterCompanyName(dis_companyName);
		String s = "Enter \"Company Name\" : " + dis_companyName + "\n";
		dP.enterFullName(dis_fullName);
		s = s + "Enter \"Full Name\" : " + dis_fullName + "\n";
		dP.enterMobileNum(DataConstants.dis_mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + DataConstants.dis_mobileNumber + "\n";
		dP.enterEmail(DataConstants.GC1DistributorUseName);
		s = s + "Enter \"Email\" : " + DataConstants.GC1DistributorUseName + "\n";
		dP.enterPass(dis_password);
		s = s + "Enter \"Password\" : " + dis_password + "\n";
		dP.enterConfirmPassword(dis_password);
		s = s + "Enter \"Confirm Password\" : " + dis_password + "\n";
		dP.enterNameOfDirector(dis_nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + dis_nameOfDirector + "\n";
		dP.enterCitizenShip(dis_cityzenship);
		s = s + "Enter \"Citizenship\" : " + dis_cityzenship + "\n";
		dP.enterAddress(dis_address);
		s = s + "Enter \"Address\" : " + dis_address + "\n";
		dP.enterDOB("10/18/1994");
		s = s + "Enter \"DOB\" : 10/18/1994";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Add Distributor for GPR$")
	public void user_fill_required_data_for_Add_Distributor_for_GPR() throws Throwable {
		String dis_companyName = RandomStringUtils.randomAlphabetic(4);
		String dis_fullName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.dis_mobileNumber = "982" + RandomStringUtils.randomNumeric(7);
		DataConstants.GPRDistributorUseName = RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@test.com";
		String dis_password = "123456";
		String dis_nameOfDirector = RandomStringUtils.randomAlphabetic(5);
		String dis_cityzenship = RandomStringUtils.randomAlphabetic(5);
		String dis_address = RandomStringUtils.randomAlphabetic(5);
		dP.enterCompanyName(dis_companyName);
		String s = "Enter \"Company Name\" : " + dis_companyName + "\n";
		dP.enterFullName(dis_fullName);
		s = s + "Enter \"Full Name\" : " + dis_fullName + "\n";
		dP.enterMobileNum(DataConstants.dis_mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + DataConstants.dis_mobileNumber + "\n";
		dP.enterEmail(DataConstants.GPRDistributorUseName);
		s = s + "Enter \"Email\" : " + DataConstants.GPRDistributorUseName + "\n";
		dP.enterPass(dis_password);
		s = s + "Enter \"Password\" : " + dis_password + "\n";
		dP.enterConfirmPassword(dis_password);
		s = s + "Enter \"Confirm Password\" : " + dis_password + "\n";
		dP.enterNameOfDirector(dis_nameOfDirector);
		s = s + "Enter \"Name Of Director\" : " + dis_nameOfDirector + "\n";
		dP.enterCitizenShip(dis_cityzenship);
		s = s + "Enter \"Citizenship\" : " + dis_cityzenship + "\n";
		dP.enterAddress(dis_address);
		s = s + "Enter \"Address\" : " + dis_address + "\n";
		dP.enterDOB("10/18/1994");
		s = s + "Enter \"DOB\" : 10/18/1994";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user search for distributor$")
	public void user_search_for_distributor() throws Throwable {
		dP.searchDistributor(DataConstants.dis_mobileNumber);
	}

	@Then("^user must be able to see searched distributor details$")
	public void user_must_be_able_to_see_searched_distributor_details() throws Throwable {
		dP.verifyDistributorAdded(DataConstants.dis_mobileNumber);
		InitializeWebDriver.scenario.write("Verified that distributor added successfully");
	}

	@And("^user click on Add Distributor Submit button$")
	public void user_click_on_Add_Distributor_Submit_button() throws Throwable {
		dP.clickOnSubmitDistributor();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Add Distributor success message$")
	public void user_must_be_see_Add_Distributor_success_message() throws Throwable {
		dP.verifyAddDistributorSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Distributor Added Successfully\"");
	}

	@Then("^user must reached to List Distributor page validate by URL$")
	public void user_must_reached_to_List_Distributor_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListDistributorURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list distributor page");
	}

}
