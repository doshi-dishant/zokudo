package com.zokudo.framework.stepdefinition;

import com.zokudo.constants.Constants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.LimitPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LimitDef {
	private LimitPage lP = new LimitPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);

	@Given("^user click on edit wallet limit$")
	public void user_click_on_edit_wallet_limit() throws Throwable {
		lP.clickOnEditWalletLimit();
		InitializeWebDriver.scenario.write("Click on wallet limit edit button");
	}

	@Then("^user must be reached on set wallet limit page$")
	public void user_must_be_reached_on_set_wallet_limit_page() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getSetWalletLimitURL());
		InitializeWebDriver.scenario.write("Verified that user reached on set wallet limit page");
	}

	@When("^user fill updated wallet limits$")
	public void user_fill_updated_wallet_limits() throws Throwable {
		String s = "";
		lP.enterDailyLimit("100000");
		s = "Enter \"Daily Limit\" : 100000\n";
		lP.enterMonthlyLimit("3000000");
		s = s + "Enter \"Monthly Limit\" : 3000000\n";
		lP.enterAnnuallyLimit("36500000");
		s = s + "Enter \"Annually Limit\" : 36500000\n";
		lP.enterDailyCount("100");
		s = s + "Enter \"Daily Count\" : 100\n";
		lP.enterMonthlyCount("3000");
		s = s + "Enter \"Monthly Count\" : 300\n";
		lP.enterAnnuallyCount("365000");
		s = s + "Enter \"Annually Count\" : 365000";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on submit button for wallet limit$")
	public void user_click_on_submit_button_for_wallet_limit() throws Throwable {
		lP.clickOnSubmitWalletLimit();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user can able to see success message for wallet limit$")
	public void user_can_able_to_see_success_message_for_wallet_limit() throws Throwable {
		lP.verifySetWalletLimitSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Customer limits updated successfully\"");
	}

	@Given("^user click on edit kyc limit$")
	public void user_click_on_edit_kyc_limit() throws Throwable {
		lP.clickOnEditKYCLimit();
		InitializeWebDriver.scenario.write("Click on \"Edit\" button");
	}

	@Then("^user must be reached on set kyc limit page$")
	public void user_must_be_reached_on_set_kyc_limit_page() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getSetKYCLimitURL());
		InitializeWebDriver.scenario.write("Verified that user reached on set kyc limit page");
	}

	@When("^user fill updated full kyc limits$")
	public void user_fill_updated_full_kyc_limits() throws Throwable {
		String s = "";
		lP.enterAnnualLoadLimit("36500000");
		s = "Enter \"Annually Limit\" : 36500000\n";
		lP.enterMonthlyLoadLimit("3000000");
		s = s + "Enter \"Monthly Limit\" : 3000000\n";
		lP.enterBalanceLimit(String.valueOf(Constants.BalanceLimit));
		s = s + "Enter \"Balance Limit\" : " + Constants.BalanceLimit + "\n";
		lP.selectAccountType("FULL-KYC");
		s = s + "Select \"Account Type\" : FULL-KYC";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill updated min kyc limits$")
	public void user_fill_updated_min_kyc_limits() throws Throwable {
		String s = "";
		lP.enterAnnualLoadLimit("12000");
		s = "Enter \"Annual Load Limit\" : 12000\n";
		lP.enterMonthlyLoadLimit("1000");
		s = s + "Enter \"Monthly Load Limit\" : 1000\n";
		lP.enterBalanceLimit("500");
		s = s + "Enter \"Balance Limit\" : 500\n";
		lP.selectAccountType("MIN-KYC");
		s = s + "Select \"Account Type\" : MIN-KYC\n";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on submit button for kyc limit$")
	public void user_click_on_submit_button_for_kyc_limit() throws Throwable {
		lP.clickOnSubmitWalletLimit();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user can able to see success message for kyc limit$")
	public void user_can_able_to_see_success_message_for_kyc_limit() throws Throwable {
		lP.verifySetKYCLimitSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Customer kyc limits updated successfully\"");
	}
}