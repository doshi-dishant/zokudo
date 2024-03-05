package com.zokudo.framework.stepdefinition;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.PrefundPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrefundDef {

	private PrefundPage pP = new PrefundPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private String status = "Approve";
	private String remarks = RandomStringUtils.randomAlphabetic(3);
//	private String prefundName = "KrunalUTR390";
	private String amount = "100";

	@Then("^user must able to view Prefund List$")
	public void verify_prefund_list() throws Throwable {
		new WaitHelper(ObjectRepo.driver, ObjectRepo.reader).hardWait(5000);
		pP.verifyPrefundList();
		InitializeWebDriver.scenario.write("Verified that prefund list is present");
	}

	@Then("^user must able to view Action button$")
	public void user_must_able_to_view_Action_button() throws Throwable {
		pP.verifyActionButton();
		InitializeWebDriver.scenario.write("Verified that \"Active\" button is present");
	}

	@And("^user must be able to see Approve/Reject label on Action Button$")
	public void user_must_be_able_to_see_ApproveorReject_label_on_Action_Button() throws Throwable {
		pP.verifyActionButtonLabel();
		InitializeWebDriver.scenario.write("Verified that \"Approve/Reject\" label is present");
	}

	@When("^user click on Action button$")
	public void user_click_on_Action_button() throws Throwable {
		pP.clickOnActionButton();
		InitializeWebDriver.scenario.write("Click on \"Active\" button");
	}

	@And("^user enter remarks and do ACCEPT/REJECT$")
	public void user_enter_remarks_and_do_ACCEPTorREJECT() throws Throwable {
		pP.enterRemark(remarks);
		String s = "Enter \"Remark\" : " + remarks + "\n";
		pP.selectAction(status);
		s = s + "Select " + status;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^status must be changed as per selection$")
	public void status_must_be_changed_as_per_selection() throws Throwable {
		pP.verifyStatus(status);
		InitializeWebDriver.scenario.write("Verified status is changed as per selection");
	}

	@Then("^user can not be able to view Action button$")
	public void user_can_not_be_able_to_view_Action_button() throws Throwable {
		pP.verifyActionButtonNotVisible();
		InitializeWebDriver.scenario.write("Verified \"Active\" button is not present");
	}

	@When("^user fill required data for prefund request$")
	public void user_fill_required_data_for_prefund_request() throws Throwable {
		String requestID = RandomStringUtils.randomAlphanumeric(5);
		DataConstants.requesterName = RandomStringUtils.randomAlphabetic(5);
		String challanNumber = RandomStringUtils.randomAlphanumeric(5);
		String remetterName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.utr = RandomStringUtils.randomAlphanumeric(5);
		String inwardRefNumber = RandomStringUtils.randomAlphanumeric(5);
		pP.enterRequestID(requestID);
		String s = "Enter \"Request ID\"" + requestID + "\n";
		pP.enterRequestName(DataConstants.requesterName);
		s = s + "Enter \"Request Name\" : " + DataConstants.requesterName + "\n";
		pP.enterChallanNo(challanNumber);
		s = s + "Enter \"Challan Number\" : " + challanNumber + "\n";
		pP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		pP.enterRemitterName(remetterName);
		s = s + "Enter \"Remetter Name\" : " + remetterName + "\n";
		pP.enterRemetterAccountNumber(DataConstants.accountNumberClient1);
		s = s + "Enter \"Remetter Account Number\" : " + DataConstants.accountNumberClient1 + "\n";
		pP.enterRemetterIFSC("SBIN0000301");
		s = s + "Enter \"Remetter IFSC\" : SBIN0000301\n";
		pP.enterRemetterBank("State Bank Of India");
		s = s + "Enter \"Remetter Bank\" : State Bank Of India\n";
		pP.enterRemetterBranch("AHMEDABAD MAIN");
		s = s + "Enter \"Remetter Branch\" : AHMEDABAD MAIN\n";
		pP.enterRemetterUTR(DataConstants.utr);
		s = s + "Enter \"Remetter UTR\" : " + DataConstants.utr + "\n";
		pP.enterPayMethod("NEFT");
		s = s + "Enter \"Pay Method\" : NEFT\n";
		pP.enterCreditAccountNumber(DataConstants.accountNumberClient1);
		s = s + "Enter \"Credit Account Number\" : " + DataConstants.accountNumberClient1 + "\n";
		pP.enterInwardRefNumber(inwardRefNumber);
		s = s + "Enter \"Inward Ref Number\" : " + inwardRefNumber + "\n";
		pP.enterCreditTime("18-10-1994");
		s = s + "Enter \"Credit Time\" : 18-10-1994";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for prefund request for client2$")
	public void user_fill_required_data_for_prefund_request_for_client2() throws Throwable {
		String requestID = RandomStringUtils.randomAlphanumeric(5);
		DataConstants.requesterName = RandomStringUtils.randomAlphabetic(5);
		String challanNumber = RandomStringUtils.randomAlphanumeric(5);
		String remetterName = RandomStringUtils.randomAlphabetic(5);
		DataConstants.utr = RandomStringUtils.randomAlphanumeric(5);
		String inwardRefNumber = RandomStringUtils.randomAlphanumeric(5);
		pP.enterRequestID(requestID);
		String s = "Enter \"Request ID\"" + requestID + "\n";
		pP.enterRequestName(DataConstants.requesterName);
		s = s + "Enter \"Request Name\" : " + DataConstants.requesterName + "\n";
		pP.enterChallanNo(challanNumber);
		s = s + "Enter \"Challan Number\" : " + challanNumber + "\n";
		pP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		pP.enterRemitterName(remetterName);
		s = s + "Enter \"Remetter Name\" : " + remetterName + "\n";
		pP.enterRemetterAccountNumber(DataConstants.accountNumberClient2);
		s = s + "Enter \"Remetter Account Number\" : " + DataConstants.accountNumberClient2 + "\n";
		pP.enterRemetterIFSC("SBIN0000301");
		s = s + "Enter \"Remetter IFSC\" : SBIN0000301\n";
		pP.enterRemetterBank("State Bank Of India");
		s = s + "Enter \"Remetter Bank\" : State Bank Of India\n";
		pP.enterRemetterBranch("AHMEDABAD MAIN");
		s = s + "Enter \"Remetter Branch\" : AHMEDABAD MAIN\n";
		pP.enterRemetterUTR(DataConstants.utr);
		s = s + "Enter \"Remetter UTR\" : " + DataConstants.utr + "\n";
		pP.enterPayMethod("NEFT");
		s = s + "Enter \"Pay Method\" : NEFT\n";
		pP.enterCreditAccountNumber(DataConstants.accountNumberClient2);
		s = s + "Enter \"Credit Account Number\" : " + DataConstants.accountNumberClient2 + "\n";
		pP.enterInwardRefNumber(inwardRefNumber);
		s = s + "Enter \"Inward Ref Number\" : " + inwardRefNumber + "\n";
		pP.enterCreditTime("18-10-1994");
		s = s + "Enter \"Credit Time\" : 18-10-1994";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user click on submit prefund request$")
	public void user_click_on_submit_prefund_request() throws Throwable {
		pP.clickOnSubmitRequest();
		String s = "Click on \"Submit\" button\n";
		cP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user can able to see prefund success message$")
	public void user_can_able_to_see_prefund_success_message() throws Throwable {
		pP.verifyPrefundRequestSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Prefund Request Successfully\"");
	}

	@When("^user can able to see added prefund request$")
	public void user_can_able_to_see_added_prefund_request() throws Throwable {
		pP.verifyAddedPrefundRequest(DataConstants.requesterName + DataConstants.utr);
		InitializeWebDriver.scenario.write("Verified that prefund request is added");
	}

	@And("^user can able to see action button for added prefund request$")
	public void user_can_able_to_see_action_button_for_added_prefund_request() throws Throwable {
		pP.clickOnActionButton(DataConstants.requesterName + DataConstants.utr);
		InitializeWebDriver.scenario.write("Click on \"Active\" button");
	}

	@When("^user approved request$")
	public void user_approved_request() throws Throwable {
		pP.enterRemark(remarks);
		String s = "Enter \"Remark\" : " + remarks + "\n";
		pP.selectAction(status);
		s = s + "Select" + status;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can able to see approved status$")
	public void user_can_able_to_see_approved_status() throws Throwable {
		pP.verifyStatus(status);
		InitializeWebDriver.scenario.write("Verified that status is approved");
	}
}