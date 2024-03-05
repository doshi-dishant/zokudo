package com.zokudo.framework.stepdefinition;

import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.DashboardPage;

import cucumber.api.java.en.Then;

public class DashboardDef {

	private DashboardPage dP = new DashboardPage(ObjectRepo.driver);

	@Then("^user must be able to view program balance data$")
	public void verify_program_balance() throws Throwable {
		try {
			DataConstants.balance = (int) Math.round(Double.parseDouble(dP.verifyProgramBalance()));
		} catch (Exception e) {
			DataConstants.balance = 0;
		}
		InitializeWebDriver.scenario.write("Program balance : " + DataConstants.balance);
	}

	@Then("^user must be able to view program balance data before load card$")
	public void verify_program_balance_data_before_load_card() throws Throwable {
		try {
			DataConstants.beforeBalance = (int) Math.round(Double.parseDouble(dP.verifyProgramBalance()));
		} catch (Exception e) {
			DataConstants.beforeBalance = 0;
		}
		InitializeWebDriver.scenario.write("Program balance : " + DataConstants.beforeBalance);
	}

	@Then("^user must be able to view program balance data before card issue$")
	public void verify_program_balance_data_before_card_issue() throws Throwable {
		try {
			DataConstants.beforeBalance = (int) Math.round(Double.parseDouble(dP.verifyProgramBalance()));
		} catch (Exception e) {
			DataConstants.beforeBalance = 0;
		}
		InitializeWebDriver.scenario.write("Program balance : " + DataConstants.beforeBalance);
	}

	@Then("^user must be able to view program balance data after load card")
	public void verify_program_balance_data_after_load_card() throws Throwable {
		try {
			DataConstants.afterBalance = (int) Math.round(Double.parseDouble(dP.verifyProgramBalance()));
		} catch (Exception e) {
			DataConstants.afterBalance = 0;
		}
		InitializeWebDriver.scenario.write("Program balance : " + DataConstants.afterBalance);
	}

	@Then("^user must be able to view program balance data after card issue")
	public void verify_program_balance_data_after_card_issue() throws Throwable {
		try {
			DataConstants.afterBalance = (int) Math.round(Double.parseDouble(dP.verifyProgramBalance()));
		} catch (Exception e) {
			DataConstants.afterBalance = 0;
		}
		InitializeWebDriver.scenario.write("Program balance : " + DataConstants.afterBalance);
	}
	
}