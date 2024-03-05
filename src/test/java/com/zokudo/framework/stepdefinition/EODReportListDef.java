package com.zokudo.framework.stepdefinition;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.EODReportListPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EODReportListDef {

	private EODReportListPage eP = new EODReportListPage(ObjectRepo.driver);

	@Then("^user verify Created At date sequence$")
	public void verify_Created_At_date_sequence() throws Throwable {
		eP.verifyCreatedAtDateSequence();
		InitializeWebDriver.scenario.write("Verified that records are present in created at date sequence");
	}

	@When("^user click on Server Path$")
	public void user_click_on_Server_Path() throws Throwable {
		eP.clickOnServerPath();
		InitializeWebDriver.scenario.write("Click on \"Server Path\"");
	}

	@And("^user must be see downloaded  report$")
	public void userMustBeSeeDownloadedReport() throws Throwable {
		eP.verifyDownloadedReport();
		InitializeWebDriver.scenario.write("Verified that report is downloaded");
	}
}