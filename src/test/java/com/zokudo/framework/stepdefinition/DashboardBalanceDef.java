package com.zokudo.framework.stepdefinition;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.DashboardBalancePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardBalanceDef {

	private DashboardBalancePage dbP = new DashboardBalancePage(ObjectRepo.driver);

	@When("^user click on Select Date Range$")
	public void user_click_on_Select_Date_Range() throws Throwable {
		dbP.clickOnSelectDateRange();
		InitializeWebDriver.scenario.write("Click on select date range");
	}

	@And("^user click on All Programs$")
	public void user_click_on_All_Program() throws Throwable {
		dbP.clickOnAllProgram();
		InitializeWebDriver.scenario.write("Click on \"All Program\"");
	}

	@And("^user click on Client and select All$")
	public void user_click_on_Client_and_select_All() throws Throwable {
		dbP.clickOnClient();
		String s = "Click on \"Client\"\n";
		dbP.selectClient(new String[] { "All" });
		s = s + "Select All";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Distributor and select All$")
	public void user_click_on_Distributor_and_select_All() throws Throwable {
		dbP.clickOnDistributor();
		String s = "Click on \"Distributor\"\n";
		dbP.selectDistributor(new String[] { "All" });
		s = s + "Select All";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Distributor and select mutliple records$")
	public void user_click_on_Distributor_and_select_multiple_records() throws Throwable {
		dbP.clickOnDistributor();
		String s = "Click on \"Distributor\"\n";
		dbP.selectDistributor(new String[] { "FunLoad", "Company Name" });
		s = s + "Select FunLoad\n";
		s = s + "Select Company Name";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Client and select mutliple records$")
	public void user_click_on_Client_and_select_mutliple_records() throws Throwable {
		dbP.clickOnClient();
		String s = "Click on \"Client\"\n";
		dbP.selectClient(new String[] { "Zokudo Mumbai", "HTPL" });
		s = s + "Select Zokudo Mumbai\n";
		s = s + "Select HTPL";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user select This Month$")
	public void user_select_This_Month() throws Throwable {
		dbP.selectThisMonth();
		InitializeWebDriver.scenario.write("Click on this month");
	}

	@And("^user select Last Month$")
	public void user_select_Last_Month() throws Throwable {
		dbP.selectLastMonth();
		InitializeWebDriver.scenario.write("Click on last month");
	}

	@And("^user select Custom Range$")
	public void user_select_Custom_Range() throws Throwable {
		dbP.selectCustomRange();
		InitializeWebDriver.scenario.write("Click on custom range");
	}

	@And("^user select Custom Dates$")
	public void user_select_Custom_Dates() throws Throwable {
		dbP.selectCustomDates("", "");
	}

	@And("^user click on Filter button$")
	public void user_click_on_Filter_button() throws Throwable {
		dbP.clickOnViewData();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be able to view Closing Balance as per defined formula$")
	public void user_must_be_able_to_view_Closing_Balance_as_per_defined_formula() throws Throwable {
		dbP.verifyClosingBalance();
	}

	@And("^user must be able to view Escrow Transaction as per defined formula$")
	public void user_must_be_able_to_view_Escrow_Transaction_as_per_defined_formula() throws Throwable {
		dbP.verifyEscrowTrn();
		InitializeWebDriver.scenario.write("Verified Escrow Transaction");
	}
}