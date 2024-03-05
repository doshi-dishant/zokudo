package com.zokudo.framework.stepdefinition;

import com.zokudo.constants.Constants;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.FeeConfigurationPage;

import cucumber.api.java.en.Given;

public class FeeConfigurationDef {
	private FeeConfigurationPage fP = new FeeConfigurationPage(ObjectRepo.driver);
//	private CommonPage cP = new CommonPage(ObjectRepo.driver);

	@Given("^user can able to update card issuance fee for default GC$")
	public void user_can_able_to_update_card_issuance_fee() throws Throwable {
		fP.updateCardIssuanceFee(Constants.GC_Default_ProgramName, "flat", "10", "9", "9");
	}

	@Given("^user can able to update ATM fee for default GC$")
	public void user_can_able_to_update_ATM_fee() throws Throwable {
		fP.updateATMFee(Constants.GC_Default_ProgramName, "flat", "10", "9", "9");
	}

	@Given("^user can able to update card issuance fee for default GC 0 fee$")
	public void user_can_able_to_update_card_issuance_fee_0_fee() throws Throwable {
		fP.updateCardIssuanceFee(Constants.GC_Default_ProgramName, "flat", "0", "0", "0");
	}

	@Given("^user can able to update ATM fee for default GC 0 fee$")
	public void user_can_able_to_update_ATM_fee_0_fee() throws Throwable {
		fP.updateATMFee(Constants.GC_Default_ProgramName, "flat", "0", "0", "0");
	}

}