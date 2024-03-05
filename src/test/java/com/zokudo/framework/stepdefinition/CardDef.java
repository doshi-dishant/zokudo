package com.zokudo.framework.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;

import com.zokudo.constants.APIConstants;
import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.API.APIHelper;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.framework.utility.CSVHelper;
import com.zokudo.helper.PageObject.BulkOperationsPage;
import com.zokudo.helper.PageObject.CardLoadPage;
import com.zokudo.helper.PageObject.CardToCardTransferPage;
import com.zokudo.helper.PageObject.CardTransactionReportPage;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.KitAssignPage;
import com.zokudo.helper.PageObject.LoadReversalPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class CardDef {

	private CardTransactionReportPage cP = new CardTransactionReportPage(ObjectRepo.driver);
	private CommonPage comP = new CommonPage(ObjectRepo.driver);
	private CardLoadPage clP = new CardLoadPage(ObjectRepo.driver);
	private BulkOperationsPage bP = new BulkOperationsPage(ObjectRepo.driver);
	private CardToCardTransferPage c2cP = new CardToCardTransferPage(ObjectRepo.driver);
	private LoadReversalPage lrP = new LoadReversalPage(ObjectRepo.driver);
	private KitAssignPage kaP = new KitAssignPage(ObjectRepo.driver);
	private static int Amount_250 = 250;
	private static int Amount_400 = 400;
	private static int Amount_450 = 450;
	private static int Amount_500 = 500;
	private static int Amount_600 = 600;
	private static int Amount_1000 = 1000;
	private static int Amount_2000 = 2000;
	private static int amount = 0;
	private static String kitNumber, kitNumberToCard, kitNumber2, kitNumber3, kitNumber4, kitNumber5;
	private static String filePath;
	private APIHelper api = new APIHelper();
	private Response response;
	private String SingleCardReversal = "Single Card Reversal";
	private String BulkCardReversal = "Bulk Card Reversal";

	@Then("^user must reached to Transaction Report page validate by URL$")
	public void user_must_reached_to_Transaction_Report_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getCardTransactionReportURl());
		InitializeWebDriver.scenario.write("Verified that user reached on transaction report page");
	}

	@When("^user select date range and hit Submit$")
	public void user_select_date_range_and_hit_Submit() throws Throwable {
		cP.selectDateRange();
		String s = "Click on date range\n";
		s = s + "Click on this month\n";
		cP.clickOnSubmit();
		s = s + "Click on\"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user download card transaction report$")
	public void user_download_card_transaction_report() throws Throwable {
		cP.clickOnDownload();
		String s = "Click on \"Download\" button\n";
		File dir = new File(Constants.DOWNLOAD_DIR);
		File[] dirContents = dir.listFiles();
		boolean result = false;
		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().toString().contains("Card_Transaction_Report"))
				result = true;
		}
		Assert.assertTrue(result);
		s = s + "Verified that file is downloaded";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see transaction details$")
	public void user_must_be_see_transaction_details() throws Throwable {
		cP.verifyTransactionDetail();
		InitializeWebDriver.scenario.write("Transaction details verified");
	}

	@When("^user apply status filter$")
	public void user_apply_status_filter() throws Throwable {
		cP.applyStatusFilter("Approved");
		String s = "Select approved\n";
		cP.clickOnSubmit();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must be see transaction details as per filter$")
	public void user_must_be_see_transaction_details_as_per_filter() throws Throwable {
		cP.verifyFilteredTransactionDetail();
		InitializeWebDriver.scenario.write("Transaction details verified");
	}

	@Then("^user must not be able to see transaction details as per filter$")
	public void user_must_not_be_able_to_see_transaction_details_as_per_filter() throws Throwable {
		cP.verifyTransactionDetailNotDisplay();
		InitializeWebDriver.scenario.write("Transaction details verified");
	}

	@When("^user apply kit filter$")
	public void user_apply_kit_filter() throws Throwable {
		cP.applyKITFilter("31000075");
		String s = "Enter \"Kit Number\" : 31000075\n";
		cP.clickOnSubmit();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user must reached to Load Card page validate by URL$")
	public void user_must_reached_to_Load_Card_page_validate_by_URL() throws Throwable {
		comP.verifyURL(Constants.URL + ObjectRepo.reader.getLoadCardURL());
		InitializeWebDriver.scenario.write("Verified that user reached on load card page");
	}

	@When("^user fill required data for Load Card for default GC$")
	public void user_fill_required_data_for_Load_Card_for_default_GC() throws Throwable {
		amount = 0;
		Amount_1000 = 1000;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_default_GPR() throws Throwable {
		amount = 0;
		Amount_1000 = 1000;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for retailer GC$")
	public void user_fill_required_data_for_Load_Card_for_retailer_GC() throws Throwable {
		amount = 0;
		Amount_1000 = 1000;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for retailer GC1$")
	public void user_fill_required_data_for_Load_Card_for_retailer_GC1() throws Throwable {
		amount = 0;
		Amount_1000 = 1000;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_GC1_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for retailer GPR$")
	public void user_fill_required_data_for_Load_Card_for_retailer_GPR() throws Throwable {
		amount = 0;
		Amount_1000 = 1000;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for default GC1$")
	public void user_fill_required_data_for_Load_Card_for_default_GC1() throws Throwable {
		amount = 0;
		Amount_1000 = 1000;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for defult GPR$")
	public void user_fill_required_data_for_Load_Card_for_defult_GPR() throws Throwable {
		amount = 0;
		Amount_1000 = 1000;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card with Default pocket$")
	public void user_fill_required_data_for_Load_Card_with_Default_pocket() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket("DEFAULT");
		s = s + "Select DEFAULT\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card after update limit for default GC$")
	public void user_fill_required_data_for_Load_Card_after_update_limit_for_default_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card after update limit for default GPR$")
	public void user_fill_required_data_for_Load_Card_after_update_limit_for_default_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card after update limit for default GC client2$")
	public void user_fill_required_data_for_Load_Card_after_update_limit_for_default_GC_client2() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket2);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket2 + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card after update limit second$")
	public void user_fill_required_data_for_Load_Card_after_update_limit_second() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.pocketName2);
		s = s + "Select " + DataConstants.pocketName2 + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card second$")
	public void user_fill_required_data_for_Load_Card_second() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.pocketName2);
		s = s + "Select " + DataConstants.pocketName2 + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card same pocket second$")
	public void user_fill_required_data_for_Load_Card_same_pocket_second() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card same pocket second for default GPR$")
	public void user_fill_required_data_for_Load_Card_same_pocket_second_for_default_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card To Card$")
	public void user_fill_required_data_for_Load_Card_To_Card() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNoToCard);
		String s = "Select " + DataConstants.customerMobileNoToCard + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumberToCard);
		s = s + "Select " + kitNumberToCard;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC client2$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC_client2()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket2);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket2 + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC client2 15.1$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC_client2_15_1()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for GC$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for GPR second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_GPR_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC default pocket second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC_default_pocket_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket("DEFAULT");
		s = s + "Select DEFAULT\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default pocket second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_pocket_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket("DEFAULT");
		s = s + "Select DEFAULT\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for pocket2 second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_pocket2_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket2);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket2 + "\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for GC default pocket second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_GC_default_pocket_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket("DEFAULT");
		s = s + "Select DEFAULT\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC less limit$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC_less_limit()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GPR less limit$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GPR_less_limit()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC less limit second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC_less_limit_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GPR less limit second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GPR_less_limit_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC pocket2$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC_pocket2()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket2);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket2 + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC pocket2 less limit second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC_pocket2_less_limit_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket3);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket3 + "\n";
		Amount_500 = 500;
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for lending GC$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_lending_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Lending_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Lending_GC_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GC1$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GC1()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for retailer GC$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_retailer_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for retailer GC1$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_retailer_GC1()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_GC1_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for lending GPR$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_lending_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Lending_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Lending_GPR_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for retailer GPR$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_retailer_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GPR second with default pocket$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GPR_second_with_default_pocket()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket("DEFAULT");
		s = s + "Select DEFAULT\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit for default GPR second with default pocket second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_for_default_GPR_second_with_default_pocket_second()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket("DEFAULT");
		s = s + "Select DEFAULT\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit second pocket second kit$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_second_pocket_second_kit()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.pocketName2);
		s = s + "Select " + DataConstants.pocketName2 + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit second$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_second() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc remaining allowed limit second different pocket$")
	public void user_fill_required_data_for_Load_Card_for_kyc_remaining_allowed_limit_second_different_pocket()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.pocketName2);
		s = s + "Select " + DataConstants.pocketName2 + "\n";
		Amount_1000 = 1000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for kyc more than remaining monthly limit$")
	public void user_fill_required_data_for_Load_Card_for_kyc_more_than_remaining_monthly_limit() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingMonthlyLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for default GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_default_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for retailer GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_retailer_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for retailer GC1$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_retailer_GC1()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_GC1_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for lending GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_lending_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Lending_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Lending_GC_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for default GC1$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_default_GC1()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for lending GPR$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_lending_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Lending_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Lending_GPR_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for retailer GPR$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_retailer_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc allowed limit for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_allowed_limit_for_default_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		int amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAllowedLimit));
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc balance limit for default GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_balance_limit_for_default_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		int amount = 11000;
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than kyc balance limit for retailer GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_balance_limit_for_retailer_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		int amount = 11000;
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than monthly allowed limit$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_monthly_allowed_limit() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
//		amount = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingMonthlyLimit));
		Amount_1000 = 2000;
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for default GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_default_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for retailer GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_retailer_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for retailer GC1$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_retailer_GC1()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_GC1_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for default GC1$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_default_GC1()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_default_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for lending GPR$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_lending_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Lending_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Lending_GPR_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for lending GC$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_lending_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Lending_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Lending_GC_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for more than yearly allowed limit for retailer GPR$")
	public void user_fill_required_data_for_Load_Card_for_more_than_kyc_yearly_allowed_limit_for_retailer_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		Amount_1000 = (int) (100 + Double.parseDouble(DataConstants.beforeRemainingAnnualLimit));
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card more than balance limit for default GC$")
	public void user_fill_required_data_for_Load_Card_more_than_balance_limit_for_default_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000 + Constants.BalanceLimit);
		s = s + "Enter \"Amount\" : " + Amount_1000 + Constants.BalanceLimit + "\n";
		amount = Amount_1000 + Constants.BalanceLimit;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card more than balance limit for retailer GC$")
	public void user_fill_required_data_for_Load_Card_more_than_balance_limit_for_retailer_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000 + Constants.BalanceLimit);
		s = s + "Enter \"Amount\" : " + Amount_1000 + Constants.BalanceLimit + "\n";
		amount = Amount_1000 + Constants.BalanceLimit;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card more than balance limit for default GC1$")
	public void user_fill_required_data_for_Load_Card_more_than_balance_limit_for_default_GC1() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		clP.enterAmount(Amount_1000 + Constants.BalanceLimit);
		s = s + "Enter \"Amount\" : " + Amount_1000 + Constants.BalanceLimit + "\n";
		amount = Amount_1000 + Constants.BalanceLimit;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card Negative for retailer GPR$")
	public void user_fill_required_data_for_Load_Card_Negative_for_retailer_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		clP.enterAmount(DataConstants.balance + 1000);
		s = s + "Enter \"Amount\" : " + DataConstants.balance + 1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card Negative for default GPR$")
	public void user_fill_required_data_for_Load_Card_Negative_for_default_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(DataConstants.balance + 1000);
		s = s + "Enter \"Amount\" : " + DataConstants.balance + 1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card Negative for retailer GC$")
	public void user_fill_required_data_for_Load_Card_Negative_for_retailer_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		clP.enterAmount(DataConstants.balance + 1000);
		s = s + "Enter \"Amount\" : " + DataConstants.balance + 1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card Negative for retailer GC1$")
	public void user_fill_required_data_for_Load_Card_Negative_for_retailer_GC1() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_GC1_Pocket + "\n";
		clP.enterAmount(DataConstants.balance + 1000);
		s = s + "Enter \"Amount\" : " + DataConstants.balance + 1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card Negative for default GC$")
	public void user_fill_required_data_for_Load_Card_Negative_for_default_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(DataConstants.balance + 1000);
		s = s + "Enter \"Amount\" : " + DataConstants.balance + 1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card Negative for default GC1$")
	public void user_fill_required_data_for_Load_Card_Negative_for_default_GC1() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		clP.enterAmount(DataConstants.balance + 1000);
		s = s + "Enter \"Amount\" : " + DataConstants.balance + 1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card max limit$")
	public void user_fill_required_data_for_Load_Card_max_limit() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.maxLimit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card max limit for retailer GC$")
	public void user_fill_required_data_for_Load_Card_max_limit_for_retailer_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.maxLimit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card max limit for retailer GC1$")
	public void user_fill_required_data_for_Load_Card_max_limit_for_retailer_GC1() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_GC1_Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.maxLimit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card max limit for retailer GPR$")
	public void user_fill_required_data_for_Load_Card_max_limit_for_retailer_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.maxLimit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card max limit for default GC1$")
	public void user_fill_required_data_for_Load_Card_max_limit_for_default_GC1() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.maxLimit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card max limit for default GPR$")
	public void user_fill_required_data_for_Load_Card_max_limit_for_default_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.maxLimit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card 0 amount$")
	public void user_fill_required_data_for_Load_Card_0_amount() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Pocket);
		s = s + "Select " + DataConstants.Pocket + "\n";
		clP.enterAmount(amount);
		s = s + "Enter \"Amount\" : " + amount + "\n";
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card load limit for default GC$")
	public void user_fill_required_data_for_Load_Card_load_limit_for_default_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.limit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card load limit update pocket limit$")
	public void user_fill_required_data_for_Load_Card_load_limit_update_pocket_limit() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Pocket);
		s = s + "Select " + DataConstants.Pocket + "\n";
		clP.enterAmount(Amount_1000 + DataConstants.limit + Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + DataConstants.limit + Amount_1000 + "\n";
		amount = Amount_1000 + DataConstants.limit + Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see Load Card success message$")
	public void user_must_be_see_Load_Card_success_message() throws Throwable {
		clP.verifyLoadCardSuccessMessage(amount);
		InitializeWebDriver.scenario
				.write("Verified message \"" + String.format("Card Loaded Successfully with INR %s", amount) + "\"");
	}

	@And("^user must be see Load Card program can be loaded one time error message$")
	public void user_must_be_see_Load_Card_program_can_be_loaded_one_time_error_message() throws Throwable {
		clP.verifyCardCanBeLoadedOneTimeError();
		InitializeWebDriver.scenario.write("Verified message \"GC can be loaded only one time for pocket\"");
	}

	@And("^user must be see Load Card failure message$")
	public void user_must_be_see_Load_Card_failure_message() throws Throwable {
		clP.verifyLoadCardLowPrefundErrorMessage();
		InitializeWebDriver.scenario.write("Verified message \"Prefund is low\"");
	}

	@And("^user must be see Load Card max mcc error message$")
	public void user_must_be_see_Load_Card_max_mcc_error_message() throws Throwable {
		clP.verifyLoadCardMaxMCCErrorMessage();
		InitializeWebDriver.scenario.write("Verified message \"Pocket mcc max limit exceeded for pocket\"");
	}

	@And("^user must be see Load Card argument invalid error message$")
	public void user_must_be_see_Load_Card_argument_invalid_error_message() throws Throwable {
		clP.verifyLoadCardArgumentInvalidErrorMessage();
		InitializeWebDriver.scenario.write("Verified message \"\"Arguments are invalid\"");
	}

	@And("^user must be see Load Card max load error message$")
	public void user_must_be_see_Load_Card_load_error_message() throws Throwable {
		clP.verifyLoadCardLoadErrorMessage();
		InitializeWebDriver.scenario.write("Verified message \"GC can be loaded only one time for pocket\"");
	}

	@And("^user must be see Load Card GC load limit exceeded error message$")
	public void user_must_be_see_Load_Card_GC_load_limit_exceeded_error_message() throws Throwable {
		clP.verifyLoadCardGCLoadLimitExceededError();
		InitializeWebDriver.scenario.write("Verified message \"GC load limit exceeded\"");
	}

	@And("^user must be see Load Card Balance limit exceeded error message$")
	public void user_must_be_see_Load_Card_Balance_limit_exceeded_error_message() throws Throwable {
		clP.verifyLoadCardBalanceLimitExceededError();
		InitializeWebDriver.scenario.write("Verified message \"Balance limit exceeded\"");
	}

	@And("^user must be see Load Card Monthly Balance limit exceeded error message$")
	public void user_must_be_see_Load_Card_Monthly_Balance_limit_exceeded_error_message() throws Throwable {
		clP.verifyLoadCardMonthlyBalanceLimitExceededError();
		InitializeWebDriver.scenario.write("Verified message \"Balance limit exceeded\"");
	}

	@And("^user can able to pause card$")
	public void user_can_able_to_pause_card() throws Throwable {
		clP.pauseCard(kitNumber);
	}

	@And("^user can able to pause card second$")
	public void user_can_able_to_pause_card_second() throws Throwable {
		clP.pauseCard(kitNumber2);
	}

	@And("^user can able to block card$")
	public void user_can_able_to_block_card() throws Throwable {
		clP.blockCard(kitNumber);
	}

	@And("^user can able to block card second$")
	public void user_can_able_to_block_card_second() throws Throwable {
		clP.blockCard(kitNumber2);
	}

	@And("^user can able to block card third$")
	public void user_can_able_to_block_card_third() throws Throwable {
		clP.blockCard(kitNumber3);
	}

	@And("^user can able to pause card To Card$")
	public void user_can_able_to_pause_card_To_Card() throws Throwable {
		clP.pauseCard(kitNumberToCard);
	}

	@And("^user can fetch kit details and customer details for default GC$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for default GC client2$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_client2() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for retailer GPR client2$")
	public void user_can_fetch_kit_details_and_customer_details_for_retailer_GPR_client2() throws Throwable {
		kitNumber = comP.getCardIssuedToClient2KitNumber(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for retailer GC client2$")
	public void user_can_fetch_kit_details_and_customer_details_for_retailer_GC_client2() throws Throwable {
		kitNumber = comP.getCardIssuedToClient2KitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for default GC client2 second$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_client2_second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for default GC client2 card loaded$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_client2_card_loaded() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for default GC second$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for default GC1 second$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1_second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for default GC second client2$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_second_client2() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for default GPR second$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for default GPR third$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_third() throws Throwable {
		kitNumber3 = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber3);
		DataConstants.customerMobileNo3 = clP.fetchCustomerMobile(kitNumber3);
	}

	@And("^user can fetch kit details and customer details for default GPR forth$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_forth() throws Throwable {
		kitNumber4 = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber4);
		DataConstants.customerMobileNo4 = clP.fetchCustomerMobile(kitNumber4);
	}

	@And("^user can fetch kit details and customer details for default GC third$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_third() throws Throwable {
		kitNumber3 = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber3);
		DataConstants.customerMobileNo3 = clP.fetchCustomerMobile(kitNumber3);
	}

	@And("^user can fetch kit details and customer details for default GC forth$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_forth() throws Throwable {
		kitNumber4 = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber4);
		DataConstants.customerMobileNo4 = clP.fetchCustomerMobile(kitNumber4);
	}

	@And("^user can fetch kit details and customer details for default GC1 third$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1_third() throws Throwable {
		kitNumber3 = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber3);
		DataConstants.customerMobileNo3 = clP.fetchCustomerMobile(kitNumber3);
	}

	@And("^user can fetch kit details and customer details for default GC1 forth$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1_forth() throws Throwable {
		kitNumber4 = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber4);
		DataConstants.customerMobileNo4 = clP.fetchCustomerMobile(kitNumber4);
	}

	@And("^user can fetch kit details and customer details for default GC1 fifth$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1_fifth() throws Throwable {
		kitNumber5 = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber5);
		DataConstants.customerMobileNo5 = clP.fetchCustomerMobile(kitNumber5);
	}

	@And("^user can fetch kit details and customer details for GC third$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC_third() throws Throwable {
		kitNumber3 = comP.getCardIssuedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber3);
		DataConstants.customerMobileNo3 = clP.fetchCustomerMobile(kitNumber3);
	}

	@And("^user can fetch kit details and customer details for GC second$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC_second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for GPR second$")
	public void user_can_fetch_kit_details_and_customer_details_for_GPR_second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for GC forth$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC_forth() throws Throwable {
		kitNumber4 = comP.getCardIssuedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber4);
		DataConstants.customerMobileNo4 = clP.fetchCustomerMobile(kitNumber4);
	}

	@And("^user can fetch kit details and customer details for GC fifth$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC_fifth() throws Throwable {
		kitNumber5 = comP.getCardIssuedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber5);
		DataConstants.customerMobileNo5 = clP.fetchCustomerMobile(kitNumber5);
	}

	@And("^update Kit Status to Card In Progress$")
	public void update_Kit_Status_to_Card_In_Progress() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		comP.updateStatus(kitNumber, "Card In Progress");
	}

	@And("^update Kit Status to Card In Progress second$")
	public void update_Kit_Status_to_Card_In_Progress_second() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		comP.updateStatus(kitNumber2, "Card In Progress");
	}

	@And("^update Kit Status to Card In Progress third$")
	public void update_Kit_Status_to_Card_In_Progress_third() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		comP.updateStatus(kitNumber3, "Card In Progress");
	}

	@And("^update Kit Status to Card In Progress forth$")
	public void update_Kit_Status_to_Card_In_Progress_forth() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		comP.updateStatus(kitNumber4, "Card In Progress");
	}

	@And("^update Kit Status to Card In Progress fifth$")
	public void update_Kit_Status_to_Card_In_Progress_fifth() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		comP.updateStatus(kitNumber5, "Card In Progress");
	}

	@And("^update Kit Status to Card In Progress To Card$")
	public void update_Kit_Status_to_Card_In_Progress_To_Card() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		comP.updateStatus(kitNumberToCard, "Card In Progress");
	}

	@And("^update Kit Status to Card In Progress client2$")
	public void update_Kit_Status_to_Card_In_Progress_client2() throws Throwable {
//		cP.updateStatus(kitNumber, "Card Issued");
		comP.updateStatus(kitNumber2, "Card In Progress");
	}

	@And("^user can fetch kit details and customer details for GC$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for GC To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumberToCard);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
	}

	@And("^user can fetch kit details and customer details for GPR$")
	public void user_can_fetch_kit_details_and_customer_details_for_GPR() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for GPR To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_GPR_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GPR_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumberToCard);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
	}

	@And("^user can fetch kit details and customer details for lending GC To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_lending_GC_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC_Lending_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumberToCard);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
	}

	@And("^user can fetch kit details and customer details for lending GPR To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_lending_GPR_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GPR_Lending_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumberToCard);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
	}

	@And("^user can fetch kit details and customer details for default GC1$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for default GC1 8 bunch$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1_8_bunch() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for default GC1 To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumberToCard);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
	}

	@And("^user can fetch kit details and customer details for GC1$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC1() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for GC1 second$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC1_second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber2);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
	}

	@And("^user can fetch kit details and customer details for GC1 third$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC1_third() throws Throwable {
		kitNumber3 = comP.getCardIssuedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber3);
		DataConstants.customerMobileNo3 = clP.fetchCustomerMobile(kitNumber3);
	}

	@And("^user can fetch kit details and customer details for GC1 forth$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC1_forth() throws Throwable {
		kitNumber4 = comP.getCardIssuedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber4);
		DataConstants.customerMobileNo4 = clP.fetchCustomerMobile(kitNumber4);
	}

	@And("^user can fetch kit details and customer details for GC1 fifth$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC1_fifth() throws Throwable {
		kitNumber5 = comP.getCardIssuedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber5);
		DataConstants.customerMobileNo5 = clP.fetchCustomerMobile(kitNumber5);
	}

	@And("^user can fetch kit details and customer details for GC1 To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC1_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumberToCard);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
	}

	@And("^user can fetch kit details and customer details for default GC for file upload$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_for_file_upload() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for GC for file upload$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC_for_file_upload() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for GC1 for file upload$")
	public void user_can_fetch_kit_details_and_customer_details_for_GC1_for_file_upload() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for default GC1 for file upload$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC1_for_file_upload() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for default GC$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_default_GC() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for GC$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_GC() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for GC1$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_GC1() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for default GC1$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_default_GC1() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for default GC for file upload$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_default_GC_for_file_upload() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC_Default_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for GC for file upload$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_GC_for_file_upload() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for GC1 for file upload$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_GC1_for_file_upload() throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC1_ProgramName);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch used kit details and customer details for default GC1 for file upload$")
	public void user_can_fetch_used_kit_details_and_customer_details_for_default_GC1_for_file_upload()
			throws Throwable {
		kitNumber = comP.getCardLoadedKitNumber(Constants.GC1_Default_ProgramName1);
		InitializeWebDriver.scenario.write("Get issue kit : " + kitNumber);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
	}

	@And("^user can fetch kit details and customer details for default GPR$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
//		String[] details = clP.fetchCustomerMobileAndKitDetail().split("####");
//		DataConstants.customerMobileNo = details[0];
//		kitNumber = details[1];
	}

	@And("^user can fetch kit details and customer details for default GPR To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
//		String[] details = c2cP.fetchCustomerMobileAndKitDetailToCard().split("####");
//		DataConstants.customerMobileNoToCard = details[0];
//		kitNumberToCard = details[1];
	}

	@And("^user can fetch kit details and customer details for default GPR Second$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_Second() throws Throwable {
		kitNumber2 = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		DataConstants.customerMobileNo2 = clP.fetchCustomerMobile(kitNumber2);
//		String[] details = c2cP.fetchCustomerMobileAndKitDetailToCard().split("####");
//		DataConstants.customerMobileNo2 = details[0];
//		kitNumber2 = details[1];
	}

	@And("^user can fetch kit details and customer details for default GC To Card$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_To_Card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
//		String[] details = c2cP.fetchCustomerMobileAndKitDetailToCard().split("####");
//		DataConstants.customerMobileNoToCard = details[0];
//		kitNumberToCard = details[1];
	}

	@And("^user can fetch kit details and customer details for default GC To Card client2$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_To_Card_client2() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName1);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
//		String[] details = c2cP.fetchCustomerMobileAndKitDetailToCard().split("####");
//		DataConstants.customerMobileNoToCard = details[0];
//		kitNumberToCard = details[1];
	}

	@And("^user can fetch kit details for card issuance for default GC To Card$")
	public void user_can_fetch_kit_details_for_card_issuance_for_default_GC_To_Card() throws Throwable {
		kitNumberToCard = comP.getReadyToCardIssueKitNumber(Constants.GC_Default_ProgramName);
	}

	@And("^user can fetch kit details and customer details for default GC card$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GC_card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
//		String[] details = c2cP.fetchCustomerMobileAndKitDetailToCard().split("####");
//		DataConstants.customerMobileNoToCard = details[0];
//		kitNumberToCard = details[1];
	}

	@And("^user can fetch kit details and customer details for default GPR card$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
//		String[] details = c2cP.fetchCustomerMobileAndKitDetailToCard().split("####");
//		DataConstants.customerMobileNoToCard = details[0];
//		kitNumberToCard = details[1];
	}

	@And("^user can fetch kit details and customer details for default GPR client2 card$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_client2_card() throws Throwable {
		kitNumberToCard = comP.getCardIssuedKitNumber(Constants.GC_Default_ProgramName1);
		DataConstants.customerMobileNoToCard = clP.fetchCustomerMobile(kitNumberToCard);
//		String[] details = c2cP.fetchCustomerMobileAndKitDetailToCard().split("####");
//		DataConstants.customerMobileNoToCard = details[0];
//		kitNumberToCard = details[1];
	}

	@And("^user can fetch kit details and customer details for default GPR for file upload$")
	public void user_can_fetch_kit_details_and_customer_details_for_default_GPR_for_file_upload() throws Throwable {
//		kitNumber = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		String[] details = clP.fetchCustomerMobileAndKitDetail().split("####");
		kitNumber = details[1];
		DataConstants.customerMobileNo = details[0];
	}

	@And("^user can fetch kit details and customer details for GPR for file upload$")
	public void user_can_fetch_kit_details_and_customer_details_for_GPR_for_file_upload() throws Throwable {
//		kitNumber = comP.getCardIssuedKitNumber(Constants.GPR_Default_ProgramName);
		String[] details = clP.fetchCustomerMobileAndKitDetail().split("####");
		kitNumber = details[1];
		DataConstants.customerMobileNo = details[0];
	}

	@And("^user click on Load Card submit button$")
	public void user_click_on_Load_Card_submit_button() throws Throwable {
		clP.clickOnLoadCardSubmitButton();
		String s = "Click on \"Submit\" button\n";
		comP.clickOnConfirmButton();
		s = s + "Click on \"Confirm\" button";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on Card To Card Transfer submit button$")
	public void user_click_on_Card_To_Card_Transfer_submit_button() throws Throwable {
		c2cP.clickOnCardToCardTransferSubmitButton();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button\n");
	}

	@And("^user click on Load Reversal submit button$")
	public void user_click_on_Load_Reversal_submit_button() throws Throwable {
		lrP.clickOnSubmit();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button\n");
	}

	@And("^user enters the random password as confirmed password$")
	public void user_enters_the_random_password_as_confirmed_password() throws Throwable {
		String pwd = RandomStringUtils.randomNumeric(6);
		lrP.enterPassword(pwd);
		String s = "Enter \"" + pwd + "\"\n";
		lrP.clickOnPasswordSubmit();
		s = s + "Click on \"Submit\" button\n";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user enters the correct password as confirmed password$")
	public void user_enters_the_correct_password_as_confirmed_password() throws Throwable {
		String pwd = ObjectRepo.reader.getAdminPassword();
		lrP.enterPassword(pwd);
		String s = "Enter \"" + pwd + "\"\n";
		lrP.clickOnPasswordSubmit();
		s = s + "Click on \"Submit\" button\n";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user should display with Invalid credentials message$")
	public void user_should_display_with_Invalid_credentials_message() throws Throwable {
		lrP.verifyInvalidCredentialsMessage();
		InitializeWebDriver.scenario.write("Verify \"Invalid credentials!\" message\n");
	}

	@When("^user fill required data for file upload for load card$")
	public void user_fill_required_data_for_file_upload_for_load_card() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card 15.14$")
	public void user_fill_required_data_for_file_upload_for_load_card_15_14() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card second$")
	public void user_fill_required_data_for_file_upload_for_load_card_second() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID2, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_default_GC() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_retailer_GC() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_retailer_GC1() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_retailer_GPR() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_default_GC1() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_default_GPR() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000), "prefund",
				"INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for 2 different pocket with same kit for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_2_different_pocket_with_same_kit_for_default_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_same_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_400), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, DataConstants.Bonus_Default_GPR_Pocket,
				String.valueOf(Amount_400), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for 2 different pocket with same kit for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_2_different_pocket_with_same_kit_for_retailer_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_same_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_400), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, DataConstants.Bonus_GPR_Pocket,
				String.valueOf(Amount_400), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with 3 same record$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_3_same_record() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_3_same_records_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with 3 same record for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_3_same_record_for_retailer_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_3_same_records_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with 3 same record for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_3_same_record_for_default_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_3_same_records_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_250), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card 12.5 first 2 kit$")
	public void user_fill_required_data_for_file_upload_for_load_card_12_5_first_2_kit() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_12.5.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID2, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card 12.5 last 2 kit$")
	public void user_fill_required_data_for_file_upload_for_load_card_12_5_last_2_kit() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_12.5.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID3, pocket,
				String.valueOf(DataConstants.beforeBalance / 2 + Amount_1000), "prefund", "INR", kitNumber3 });
		values.add(new String[] { DataConstants.customerHashID4, pocket,
				String.valueOf(DataConstants.beforeBalance / 2), "prefund", "INR", kitNumber4 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card 12.6 last 3 kit$")
	public void user_fill_required_data_for_file_upload_for_load_card_12_6_last_3_kit() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_12.6.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID3, pocket,
				String.valueOf(DataConstants.beforeBalance / 3 + Amount_1000), "prefund", "INR", kitNumber3 });
		values.add(new String[] { DataConstants.customerHashID4, pocket,
				String.valueOf(DataConstants.beforeBalance / 3 + Amount_1000), "prefund", "INR", kitNumber4 });
		values.add(new String[] { DataConstants.customerHashID5, pocket,
				String.valueOf(DataConstants.beforeBalance / 3 + Amount_1000), "prefund", "INR", kitNumber5 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card for default pocket with same kit$")
	public void user_fill_required_data_for_file_upload_for_load_card_for_default_pocket_with_same_kit()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_same_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_400), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with 0 amount$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_0_amount() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_with_0_amount.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, "0", "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid customer for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_customer_for_default_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_with_invalid_customer_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(
				new String[] { "cajkj-njnjf-vwvw", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid kit$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_kit() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"12345678" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid kit for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_kit_for_retailer_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"12345678" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid kit for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_kit_for_retailer_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"12345678" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid kit for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_kit_for_retailer_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"12345678" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid kit for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_kit_for_default_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"12345678" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid kit for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_kit_for_default_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"12345678" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid kit for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_kit_for_default_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_kit_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"12345678" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid funding channel$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_funding_channel() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_fundChannel_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "TEST", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid funding channel for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_funding_channel_for_retailer_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_fundChannel_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "TEST", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid funding channel for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_funding_channel_for_retailer_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_fundChannel_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "TEST", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid funding channel for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_funding_channel_for_retailer_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_fundChannel_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "TEST", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid funding channel for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_funding_channel_for_default_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_fundChannel_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "TEST", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid funding channel for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_funding_channel_for_default_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_fundChannel_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "TEST", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid funding channel for defalt GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_funding_channel_for_defalt_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_fundChannel_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "TEST", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid currency code for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_currency_code_for_default_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_currencyCode_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "USD",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "EUR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "JPY",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid currency code for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_currency_code_for_retailer_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_currencyCode_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "USD",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "EUR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "JPY",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid currency code for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_currency_code_for_retailer_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_currencyCode_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "USD",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "EUR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "JPY",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid currency code for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_currency_code_for_retailer_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_currencyCode_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "USD",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "EUR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "JPY",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid currency code for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_currency_code_for_default_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_currencyCode_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "USD",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "EUR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "JPY",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid currency code for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_currency_code_for_default_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_currencyCode_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "USD",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "EUR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "JPY",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with incomplete details for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_incomplete_details_for_default_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_incomplete_detail_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		values.add(new String[] { DataConstants.customerHashID, "", String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, "", "prefund", "INR", kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "", "INR",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "",
				kitNumber });
		values.add(new String[] { DataConstants.customerHashID, pocket, String.valueOf(Amount_1000), "prefund", "INR",
				"" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid customerHashId$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_customerHashId() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_customerHashId_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "abc", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid customerHashId for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_customerHashId_for_retailer_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_customerHashId_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "abc", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid customerHashId for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_customerHashId_for_retailer_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_customerHashId_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "abc", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid customerHashId for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_customerHashId_for_retailer_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_customerHashId_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "abc", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid customerHashId for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_customerHashId_for_default_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_customerHashId_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "abc", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid customerHashId for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_customerHashId_for_default_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_customerHashId_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "abc", pocket, String.valueOf(Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with differnet pocket name$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_differnet_pocket_name() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_different_pocket_name_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, "Travel", String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid pocket for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_pocket_for_default_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_pocket_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, "Bonus", String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid pocket for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_pocket_for_retailer_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_pocket_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, "Bonus", String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid pocket for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_pocket_for_retailer_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_pocket_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, "Bonus", String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid pocket for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_pocket_for_default_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_pocket_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, "Bonus", String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card with invalid pocket for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_with_invalid_pocket_for_default_GPR()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_2_different_pocket_with_invalid_pocket_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.customerHashID, "Bonus", String.valueOf(Amount_1000), "prefund", "INR",
				kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card more than balance limit bunch8 for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_more_than_balance_limit_bunch8_for_default_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000 + 10000),
				"prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card more than balance limit bunch8 for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_more_than_balance_limit_bunch8_for_retailer_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT", String.valueOf(Amount_1000 + 10000),
				"prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card more than balance limit for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_more_than_balance_limit_for_retailer_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + Constants.BalanceLimit), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card more than balance limit for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_more_than_balance_limit_for_default_GC()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + Constants.BalanceLimit), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card more than balance limit for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_more_than_balance_limit_for_default_GC1()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + Constants.BalanceLimit), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card negative for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_negative_for_retailer_GC() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + DataConstants.balance), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card negative for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_negative_for_retailer_GC1() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + DataConstants.balance), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card negative for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_negative_for_default_GC() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + DataConstants.balance), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card negative for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_negative_for_retailer_GPR() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + DataConstants.balance), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card negative for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_negative_for_default_GPR() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + DataConstants.balance), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card negative for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_negative_for_default_GC1() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(Amount_1000 + DataConstants.balance), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card max limit$")
	public void user_fill_required_data_for_file_upload_for_load_card_max_limit() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket,
				String.valueOf(Amount_1000 + DataConstants.maxLimit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card max limit for retailer GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_max_limit_for_retailer_GC() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket,
				String.valueOf(Amount_1000 + DataConstants.maxLimit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card max limit for retailer GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_max_limit_for_retailer_GC1() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket,
				String.valueOf(Amount_1000 + DataConstants.maxLimit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card max limit for retailer GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_max_limit_for_retailer_GPR() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket,
				String.valueOf(Amount_1000 + DataConstants.maxLimit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card max limit for default GC1$")
	public void user_fill_required_data_for_file_upload_for_load_card_max_limit_for_default_GC1() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC1_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket,
				String.valueOf(Amount_1000 + DataConstants.maxLimit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card max limit for default GPR$")
	public void user_fill_required_data_for_file_upload_for_load_card_max_limit_for_default_GPR() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Expences_Default_GPR_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, pocket,
				String.valueOf(Amount_1000 + DataConstants.maxLimit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card load limit for default GC$")
	public void user_fill_required_data_for_file_upload_for_load_card_load_limit_for_default_GC() throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Travel_Default_GC_Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(DataConstants.limit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for file upload for load card load limit update pocket limit$")
	public void user_fill_required_data_for_file_upload_for_load_card_load_limit_update_pocket_limit()
			throws Throwable {
		bP.downloadLoadCardFormat();
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "userHashId", "pocketName", "amount", "fundingChannel", "currencyCode",
				"proxyCardNumber" };
		List<String[]> values = new ArrayList<String[]>();
		String pocket = DataConstants.Pocket;
		if (pocket == null)
			pocket = "DEFAULT";
		values.add(new String[] { DataConstants.customerHashID, "DEFAULT",
				String.valueOf(DataConstants.limit + Amount_1000), "prefund", "INR", kitNumber });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Load Amount");
		s = s + "Select bulk load amount";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user search for card load status$")
	public void user_search_for_card_load_status() throws Throwable {
//		cP.enterKitInSearch(kitNumber);
	}

	@Then("^user can able to find result and failure reason if failed$")
	public void user_can_able_to_find_result_and_failure_reason_if_failed() throws Throwable {
		String result = cP.getFailureReason();
		System.out.println(result);
//		if (!result.equalsIgnoreCase("null"))
//			Assert.assertTrue(false);
	}

	@Then("^user can able to find result and failure reason if failed for failured$")
	public void user_can_able_to_find_result_and_failure_reason_if_failed_for_failure() throws Throwable {
		String result = cP.getFailureReason();
		System.out.println(result);
		String processorStatus = cP.getProcessorStatus();
		if (processorStatus.equalsIgnoreCase("true"))
			if (result.equalsIgnoreCase("null"))
				Assert.assertTrue(false);
		InitializeWebDriver.scenario.write("Error message : " + result);
	}

	@Then("^user can able to find result and failure reason$")
	public void user_can_able_to_find_result_and_failure_reason() throws Throwable {
		String result = cP.getFailureReason();
		System.out.println(result);
//		if (result.equalsIgnoreCase("true"))
//			Assert.assertTrue(false);
	}

	@Then("^user can able to find transaction record$")
	public void user_can_able_to_find_transaction_record() throws Throwable {
		cP.verifyTransactionReport(kitNumber);
	}

	@Then("^user can fetch account number$")
	public void user_can_fetch_account_number() throws Throwable {
//		vp.fetchAccountNumber();
		DataConstants.accountNumberClient1 = "ZOKUDO252621000069";
		InitializeWebDriver.scenario.write("Account number is ZOKUDO252621000069");
		DataConstants.accountNumberClient2 = "ZOKUDO252621000062";
		InitializeWebDriver.scenario.write("Account number is ZOKUDO252621000062");
	}

	@And("^user can fetch kit details and customer details$")
	public void user_can_fetch_kit_details_and_customer_details() throws Throwable {
		String[] details = clP.fetchCustomerMobileAndKitDetail().split("####");
		DataConstants.customerMobileNo = details[0];
		kitNumber = details[1];
	}

	@And("^user can verify before balance is not equal to after balance$")
	public void user_can_verify_before_balance_is_not_equal_to_after_balance() throws Throwable {
		if (DataConstants.afterBalance != DataConstants.beforeBalance - Amount_1000)
			System.out.println(DataConstants.afterBalance + "|" + DataConstants.beforeBalance);
//			Assert.assertTrue(false);
	}

	@And("^user can verify before balance is equal to after balance$")
	public void user_can_verify_before_balance_is_equal_to_after_balance() throws Throwable {
		if (DataConstants.afterBalance != DataConstants.beforeBalance)
			System.out.println(DataConstants.afterBalance + "|" + DataConstants.beforeBalance);
//			Assert.assertTrue(false);
	}

	@And("^update Kit Status to Card Loaded$")
	public void update_Kit_Status_to_Assigned() throws Throwable {
		comP.updateStatus(kitNumber, "Card Loaded");
	}

	@And("^update Kit Status to Card Loaded To Card$")
	public void update_Kit_Status_to_Assigned_To_Card() throws Throwable {
		comP.updateStatus(kitNumberToCard, "Card Loaded");
	}

	@And("^update Kit Status to Card Loaded second$")
	public void update_Kit_Status_to_Assigned_second() throws Throwable {
		comP.updateStatus(kitNumber2, "Card Loaded");
	}

	@Then("^user can be able to fetch customer hash id from mobile number$")
	public void user_can_be_able_to_fetch_customer_hash_id_from_mobile_number() throws Throwable {
		DataConstants.customerHashID = clP.fetchCustomerHashId(DataConstants.customerMobileNo);
	}

	@Then("^user can be able to fetch customer hash id from mobile number2$")
	public void user_can_be_able_to_fetch_customer_hash_id_from_mobile_number2() throws Throwable {
		DataConstants.customerHashID2 = clP.fetchCustomerHashId(DataConstants.customerMobileNo2);
	}

	@Then("^user can be able to fetch customer hash id from mobile number3$")
	public void user_can_be_able_to_fetch_customer_hash_id_from_mobile_number3() throws Throwable {
		DataConstants.customerHashID3 = clP.fetchCustomerHashId(DataConstants.customerMobileNo3);
	}

	@Then("^user can be able to fetch customer hash id from mobile number4$")
	public void user_can_be_able_to_fetch_customer_hash_id_from_mobile_number4() throws Throwable {
		DataConstants.customerHashID4 = clP.fetchCustomerHashId(DataConstants.customerMobileNo4);
	}

	@Then("^user can be able to fetch customer hash id from mobile number5$")
	public void user_can_be_able_to_fetch_customer_hash_id_from_mobile_number5() throws Throwable {
		DataConstants.customerHashID5 = clP.fetchCustomerHashId(DataConstants.customerMobileNo5);
	}

	@And("^user check kyc limit before transaction$")
	public void user_check_kyc_limit_before_transaction() throws Throwable {
		response = api.postWithHeader(APIConstants.LimitURL,
				"{ \"mobileNumber\":\"" + DataConstants.customerMobileNo + "\"}");
		InitializeWebDriver.scenario.write("Response ==> " + response.getBody().asString());
		Map<String, Object> responseMap = response.path("details");
		DataConstants.beforeRemainingMonthlyLimit = responseMap.get("remainingMonthlyLimit").toString();
		DataConstants.beforeRemainingAllowedLimit = responseMap.get("remainingAllowedLimit").toString();
		DataConstants.beforeRemainingAnnualLimit = responseMap.get("remainingAnnualLimit").toString();
	}

	@And("^user check kyc limit before transaction for To Card$")
	public void user_check_kyc_limit_before_transaction_for_To_Card() throws Throwable {
		response = api.postWithHeader(APIConstants.LimitURL,
				"{ \"mobileNumber\":\"" + DataConstants.customerMobileNoToCard + "\"}");
		InitializeWebDriver.scenario.write("Response ==> " + response.getBody().asString());
		Map<String, Object> responseMap = response.path("details");
		DataConstants.beforeRemainingMonthlyLimit1 = responseMap.get("remainingMonthlyLimit").toString();
		DataConstants.beforeRemainingAllowedLimit1 = responseMap.get("remainingAllowedLimit").toString();
		DataConstants.beforeRemainingAnnualLimit1 = responseMap.get("remainingAnnualLimit").toString();
	}

	@And("^user check kyc limit after transaction$")
	public void user_check_kyc_limit_after_transaction() throws Throwable {
		response = api.postWithHeader(APIConstants.LimitURL,
				"{ \"mobileNumber\":\"" + DataConstants.customerMobileNo + "\"}");
		InitializeWebDriver.scenario.write("Response ==> " + response.getBody().asString());
		Map<String, Object> responseMap = response.path("details");
		DataConstants.afterRemainingMonthlyLimit = responseMap.get("remainingMonthlyLimit").toString();
		DataConstants.afterRemainingAllowedLimit = responseMap.get("remainingAllowedLimit").toString();
		DataConstants.afterRemainingAnnualLimit = responseMap.get("remainingAnnualLimit").toString();
	}

	@And("^user check kyc limit after transaction for To Card$")
	public void user_check_kyc_limit_after_transaction_for_To_Card() throws Throwable {
		response = api.postWithHeader(APIConstants.LimitURL,
				"{ \"mobileNumber\":\"" + DataConstants.customerMobileNoToCard + "\"}");
		InitializeWebDriver.scenario.write("Response ==> " + response.getBody().asString());
		Map<String, Object> responseMap = response.path("details");
		DataConstants.afterRemainingMonthlyLimit1 = responseMap.get("remainingMonthlyLimit").toString();
		DataConstants.afterRemainingAllowedLimit1 = responseMap.get("remainingAllowedLimit").toString();
		DataConstants.afterRemainingAnnualLimit1 = responseMap.get("remainingAnnualLimit").toString();
	}

	@And("^user can verify limit$")
	public void user_can_verify_limit() throws Throwable {
		if (Double.parseDouble(DataConstants.afterRemainingMonthlyLimit) >= Double
				.parseDouble(DataConstants.beforeRemainingMonthlyLimit))
			Assert.assertTrue(false);
		if (Double.parseDouble(DataConstants.afterRemainingAllowedLimit) >= Double
				.parseDouble(DataConstants.beforeRemainingAllowedLimit))
			Assert.assertTrue(false);
		if (Double.parseDouble(DataConstants.afterRemainingAnnualLimit) >= Double
				.parseDouble(DataConstants.beforeRemainingAnnualLimit))
			Assert.assertTrue(false);
	}

	@And("^user can verify limit is not updated$")
	public void user_can_verify_limit_is_not_updated() throws Throwable {
		if (Double.parseDouble(DataConstants.afterRemainingMonthlyLimit) != Double
				.parseDouble(DataConstants.beforeRemainingMonthlyLimit))
			Assert.assertTrue(false);
		if (Double.parseDouble(DataConstants.afterRemainingAllowedLimit) != Double
				.parseDouble(DataConstants.beforeRemainingAllowedLimit))
			Assert.assertTrue(false);
		if (Double.parseDouble(DataConstants.afterRemainingAnnualLimit) != Double
				.parseDouble(DataConstants.beforeRemainingAnnualLimit))
			Assert.assertTrue(false);
	}

	@And("^user can verify limit for To Card$")
	public void user_can_verify_limit_for_To_Card() throws Throwable {
		if (Double.parseDouble(DataConstants.afterRemainingMonthlyLimit1) != Double
				.parseDouble(DataConstants.beforeRemainingMonthlyLimit1))
			Assert.assertTrue(false);
		if (Double.parseDouble(DataConstants.afterRemainingAllowedLimit1) != Double
				.parseDouble(DataConstants.beforeRemainingAllowedLimit1))
			Assert.assertTrue(false);
		if (Double.parseDouble(DataConstants.afterRemainingAnnualLimit1) != Double
				.parseDouble(DataConstants.beforeRemainingAnnualLimit1))
			Assert.assertTrue(false);
	}

	@And("^user can fetch kit details and customer details for lending GPR$")
	public void user_can_fetch_kit_details_and_customer_details_for_lending_GPR() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GPR_Lending_ProgramName);
//		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
//		String[] details = clP.fetchCustomerMobileAndKitDetail().split("####");
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
//		kitNumber = details[1];
	}

	@And("^user can fetch kit details and customer details for lending GC$")
	public void user_can_fetch_kit_details_and_customer_details_for_lending_GC() throws Throwable {
		kitNumber = comP.getCardIssuedKitNumber(Constants.GC_Lending_ProgramName);
//		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
//		String[] details = clP.fetchCustomerMobileAndKitDetail().split("####");
		DataConstants.customerMobileNo = clP.fetchCustomerMobile(kitNumber);
//		kitNumber = details[1];
	}

	@When("^user fill required data for Card To Card Transfer for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_default_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for default GC less then debit card balance from card1 to card3$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_default_GC_less_then_debit_card_balance_from_card1_to_card3()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber3);
		s = s + "Enter " + kitNumber3 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for default GC less then debit card balance from card2 to card4$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_default_GC_less_then_debit_card_balance_from_card2_to_card4()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber2);
		String s = "Enter " + kitNumber2 + "\n";
		c2cP.enterToCard(kitNumber4);
		s = s + "Enter " + kitNumber4 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for default GPR less then debit card balance from card1 to card3$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_default_GPR_less_then_debit_card_balance_from_card1_to_card3()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber3);
		s = s + "Enter " + kitNumber3 + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for default GPR less then debit card balance from card2 to card4$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_default_GPR_less_then_debit_card_balance_from_card2_to_card4()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber2);
		String s = "Enter " + kitNumber2 + "\n";
		c2cP.enterToCard(kitNumber4);
		s = s + "Enter " + kitNumber4 + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for lending GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_lending_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Lending_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Lending_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for lending GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_lending_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Expences_Lending_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Lending_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for retailer GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_retailer_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for retailer GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_retailer_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for retailer GC1$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_retailer_GC1() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_GC1_Pocket);
		s = s + "Enter " + DataConstants.Travel_GC1_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for default GC1$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_default_GC1() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC1_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer 10.6$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_10_6() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer 10.6 for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_10_6_for_default_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer 10.6 for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_10_6_for_default_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_default_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer max limit with default pocket$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_max_limit_with_default_pocket() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket("default");
		s = s + "Enter Default\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer second with same pocket$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_second_same_pocket() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer second with same pocket for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_second_same_pocket_for_default_GPR()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer Insufficient balance in debit$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_Insufficient_balance_in_debit() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer less than pocket limit for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_less_than_pocket_limit_for_default_GC()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer less than pocket limit for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_less_than_pocket_limit_for_default_GPR()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GC client2$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GC_client2() throws Throwable {
		lrP.selectClient(Constants.defaultClientName2);
		String s = "Select " + Constants.defaultClientName2 + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName1);
		s = s + "Select " + Constants.GC_Default_ProgramName1 + "\n";
		lrP.selectUploadType(SingleCardReversal);
		s = s + "Select " + SingleCardReversal + "\n";
		kaP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(SingleCardReversal);
		s = s + "Select " + SingleCardReversal + "\n";
		kaP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client2$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client2() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(SingleCardReversal);
		s = s + "Select " + SingleCardReversal + "\n";
		kaP.selectKitNumber(kitNumber2);
		s = s + "Select " + kitNumber2 + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GC client$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GC_client() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		lrP.selectUploadType(SingleCardReversal);
		s = s + "Select " + SingleCardReversal + "\n";
		kaP.selectKitNumber(kitNumber);
		s = s + "Select " + kitNumber + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GC client second$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GC_client_second() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		lrP.selectUploadType(SingleCardReversal);
		s = s + "Select " + SingleCardReversal + "\n";
		kaP.selectKitNumber(kitNumber2);
		s = s + "Select " + kitNumber2 + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GC client invalid amount bulk$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GC_client_invalid_amount_bulk() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_500) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GC client 0 amount bulk$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GC_client_0_amount_bulk() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, "0" });
		values.add(new String[] { kitNumber, "" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client bulk$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client_bulk() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client bulk default second$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client_bulk_default_second()
			throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber2, String.valueOf(Amount_1000) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client bulk wrong amount$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client_bulk_wrong_amount() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_500) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client bulk wrong program$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client_bulk_wrong_program() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client bulk 0 balance$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client_bulk_0_balance() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, "0" });
		values.add(new String[] { kitNumber, "" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client bulk for total balance$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client_bulk_for_total_balance()
			throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		values.add(new String[] { kitNumber2, String.valueOf(Amount_2000) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GC client bulk$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GC_client_bulk() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName);
		s = s + "Select " + Constants.GC_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		values.add(new String[] { kitNumber2, String.valueOf(Amount_500) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GC client bulk client2$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GC_client_bulk_client2() throws Throwable {
		lrP.selectClient(Constants.defaultClientName2);
		String s = "Select " + Constants.defaultClientName2 + "\n";
		lrP.selectProgram(Constants.GC_Default_ProgramName1);
		s = s + "Select " + Constants.GC_Default_ProgramName1 + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		values.add(new String[] { kitNumber2, String.valueOf(Amount_500) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for retailer GPR client bulk$")
	public void user_fill_required_data_for_Load_Reversal_for_retailer_GPR_client_bulk() throws Throwable {
		lrP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		lrP.selectProgram(Constants.GPR_ProgramName);
		s = s + "Select " + Constants.GPR_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		values.add(new String[] { kitNumber2, String.valueOf(Amount_500) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for retailer GC client bulk$")
	public void user_fill_required_data_for_Load_Reversal_for_retailer_GC_client_bulk() throws Throwable {
		lrP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		lrP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		values.add(new String[] { kitNumber2, String.valueOf(Amount_500) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for GC client bulk$")
	public void user_fill_required_data_for_Load_Reversal_for_GC_client_bulk() throws Throwable {
		lrP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		lrP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		values.add(new String[] { kitNumber2, String.valueOf(Amount_500) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for GC client bulk different program sceanario$")
	public void user_fill_required_data_for_Load_Reversal_for_GC_client_bulk_different_program_sceanario()
			throws Throwable {
		lrP.selectClient(Constants.clientName);
		String s = "Select " + Constants.clientName + "\n";
		lrP.selectProgram(Constants.GC_ProgramName);
		s = s + "Select " + Constants.GC_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { kitNumber, String.valueOf(Amount_1000) });
		values.add(new String[] { kitNumber2, String.valueOf(Amount_1000) });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Reversal for default GPR client bulk blank sheet$")
	public void user_fill_required_data_for_Load_Reversal_for_default_GPR_client_bulk_blank_sheet() throws Throwable {
		lrP.selectClient(Constants.defaultClientName);
		String s = "Select " + Constants.defaultClientName + "\n";
		lrP.selectProgram(Constants.GPR_Default_ProgramName);
		s = s + "Select " + Constants.GPR_Default_ProgramName + "\n";
		lrP.selectUploadType(BulkCardReversal);
		s = s + "Select " + BulkCardReversal + "\n";
		filePath = Constants.uploadPath + "bulk_load_card_upload.csv";
		String[] headers = new String[] { "proxyCardNumber", "amount" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "", "" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		lrP.uploadFile(filePath);
		s = s + "Upload file : " + filePath + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer less than pocket limit reversed$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_less_than_pocket_limit_reversed() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer less than pocket limit reversed for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_less_than_pocket_limit_reversed_for_default_GPR()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer less than pocket limit second$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_less_than_pocket_limit_second() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for pause card for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_pause_card_for_default_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for pause card for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_pause_card_for_default_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer Transfer More than max limit$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_Transfer_More_than_max_limit() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_600);
		s = s + "Enter \"Amount\" : " + Amount_600 + "\n";
		amount = Amount_600;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer Transfer More than max limit for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_Transfer_More_than_max_limit_for_default_GPR()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_600);
		s = s + "Enter \"Amount\" : " + Amount_600 + "\n";
		amount = Amount_600;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer Transfer More than max limit for default GC pocket2$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_Transfer_More_than_max_limit_for_default_GC_pocket2()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket2);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket2 + "\n";
		clP.enterAmount(Amount_600);
		s = s + "Enter \"Amount\" : " + Amount_600 + "\n";
		amount = Amount_600;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer from To Card$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_from_To_Card() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer from To Card for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_from_To_Card_for_default_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer second$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_second() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber2);
		String s = "Enter " + kitNumber2 + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.pocketName2);
		s = s + "Enter " + DataConstants.pocketName2 + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer second 10.25$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_second_10_25() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber2);
		String s = "Enter " + kitNumber2 + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer second 10.25 for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_second_10_25_for_default_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber2);
		String s = "Enter " + kitNumber2 + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer to first card$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_to_first_card() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber2);
		String s = "Enter " + kitNumber2 + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.pocketName2);
		s = s + "Enter " + DataConstants.pocketName2 + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer testcase 11.1$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_testcase_11_1() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer testcase 11.1 for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_testcase_11_1_for_default_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer Reversed$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_Reversed() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer Reversed 10.9 for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_Reversed_10_9_for_default_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer For Same Cards for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_For_Same_Cards_for_default_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer For Same Cards for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_For_Same_Cards_for_default_GPR() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer For Different Cards$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_For_Different_Cards() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer For Different Cards for default GPR$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_For_Different_Cards_for_default_GPR()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Enter " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer Reversed with Different pocket$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_Reversed_with_Different_pocket() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumberToCard);
		String s = "Enter " + kitNumberToCard + "\n";
		c2cP.enterToCard(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		c2cP.enterPocket(DataConstants.pocketName2);
		s = s + "Enter " + DataConstants.pocketName2 + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for invalid pocket$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_invalid_pocket() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		String pocket = RandomStringUtils.randomAlphabetic(3);
		c2cP.enterPocket(pocket);
		s = s + "Enter " + pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for different pocket$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_different_pocket() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		String pocket = "Export";
		c2cP.enterPocket(pocket);
		s = s + "Enter " + pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer for greater than debit card balance for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_for_greater_than_debit_card_balance_for_default_GC()
			throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_450);
		s = s + "Enter \"Amount\" : " + Amount_450 + "\n";
		amount = Amount_450;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user must be see Load Reversal success message$")
	public void user_must_be_see_Load_Reversal_success_message() throws Throwable {
		lrP.verifyLoadReversalSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Card load reverse successful\"");
	}

	@And("^user must be see Load Reversal success message bulk$")
	public void user_must_be_see_Load_Reversal_success_message_bulk() throws Throwable {
		lrP.verifyLoadReversalSuccessMessageBulk();
		InitializeWebDriver.scenario.write("Verified message \"Processed. Kindly check reports\"");
	}

	@And("^user must be see Load Reversal failure message$")
	public void user_must_be_see_Load_Reversal_failure_message() throws Throwable {
		lrP.verifyLoadReversalFailureMessage();
		InitializeWebDriver.scenario.write("Verified message \"\"");
	}

	@And("^user must be see card value should be greater than 0 message$")
	public void user_must_be_card_value_should_be_greater_than_0_message() throws Throwable {
		lrP.verifyValidationTooltipForBalance();
		InitializeWebDriver.scenario.write("Verified message \"card value should be greater than 0\"");
	}

	@And("^user must be see Card To Card Transfer success message$")
	public void user_must_be_see_Carf_To_Card_Transfer_success_message() throws Throwable {
		c2cP.verifyCardToCardTransferSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"wallet To wallet transfer Successfully with INR\"");
	}

	@And("^user must be see Card To Card Transfer sender and receiver cards can't be same message$")
	public void user_must_be_see_Carf_To_Card_Transfer_sender_and_receiver_cards_can_not_be_same_message()
			throws Throwable {
		c2cP.verifyCardToCardTransferSenderAndReceiverCardsCanNotBeSameMessage();
		InitializeWebDriver.scenario.write(
				"Verified message \"error!while transfer balance wallet to wallet: debit card and credit card program ids is not same\"");
	}

	@And("^user must be see Card To Card Transfer pocket limit message$")
	public void user_must_be_see_Carf_To_Card_Transfer_pocket_limit_message() throws Throwable {
		c2cP.verifyCardToCardTransferPocketLimitMessage();
		InitializeWebDriver.scenario.write(
				"Verified message \"error!while transfer balance wallet to wallet: Pocket mcc max limit exceeded for pocket\"");
	}

	@And("^user must be see Card To Card Transfer Insufficient balance in debit message$")
	public void user_must_be_see_Carf_To_Card_Transfer_Insufficient_balance_in_debit_message() throws Throwable {
		c2cP.verifyCardToCardTransferInsufficientBalanceInDebitMessage();
		InitializeWebDriver.scenario.write(
				"Verified message \"error!while transfer balance wallet to wallet: Insufficient balance in debit\"");
	}

	@And("^user must be see Card To Card Transfer invalid pocket name message$")
	public void user_must_be_see_Carf_To_Card_Transfer_invalid_pocket_name_message() throws Throwable {
		c2cP.verifyCardToCardTransferInvalidPocketNameMessage();
		InitializeWebDriver.scenario
				.write("Verified message \"error!while transfer balance wallet to wallet: Invalid pocket name\"");
	}

	@And("^user must be see Card To Card Transfer GC can be loaded only one time for Pocket message$")
	public void user_must_be_see_Carf_To_Card_Transfer_GC_can_be_loaded_only_one_time_for_Pocket_message()
			throws Throwable {
		c2cP.verifyCardToCardTransferGCCanBeLoadedOnlyOneTimeForPocketMessage(Amount_1000);
		InitializeWebDriver.scenario.write(
				"Verified message \"error!while transfer balance wallet to wallet: GC can be loaded only one time for pocket\"");
	}

	@And("^user must be see Card To Card Transfer GPR can be loaded only one time for Pocket message$")
	public void user_must_be_see_Carf_To_Card_Transfer_GPR_can_be_loaded_only_one_time_for_Pocket_message()
			throws Throwable {
		c2cP.verifyCardToCardTransferGCCanBeLoadedOnlyOneTimeForPocketMessage(Amount_1000);
		InitializeWebDriver.scenario.write(
				"Verified message \"error!while transfer balance wallet to wallet: GC can be loaded only one time for pocket\"");
	}

	@And("^user must be see Card To Card Transfer debit card and credit card program ids is not same message$")
	public void user_must_be_see_Carf_To_Card_Transfer_invalid_debit_card_and_credit_card_program_ids_is_not_same_message()
			throws Throwable {
		c2cP.verifyCardToCardTransferDebitCardAndCreditCardProgramIdsIsNotSameMessage();
		InitializeWebDriver.scenario.write("Verified message \"debit card and credit card program ids is not same\"");
	}

	@When("^user fill required data for Load Card for max pocket limit$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limit() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for max pocket limit for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limit_for_default_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for max pocket limit for default GC pocket2$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limit_for_default_GC_pocket2() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket2);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket2 + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for max pocket limit testcase 11.1$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limit_testcase_11_1() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for max pocket limit testcase 11.1 for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limit_testcase_11_1_for_default_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for max pocket limit testcase 11.1 pocket2$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limit_testcase_11_1_pocket2() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.pocketName2);
		s = s + "Select " + DataConstants.pocketName2 + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for max pocket limitToCard$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limitToCard() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNoToCard);
		String s = "Select " + DataConstants.customerMobileNoToCard + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumberToCard);
		s = s + "Select " + kitNumberToCard;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for max pocket limitToCard for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_max_pocket_limitToCard_for_default_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNoToCard);
		String s = "Select " + DataConstants.customerMobileNoToCard + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_1000);
		s = s + "Enter \"Amount\" : " + Amount_1000 + "\n";
		amount = Amount_1000;
		clP.selectKit(kitNumberToCard);
		s = s + "Select " + kitNumberToCard;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Pocket);
		s = s + "Select " + DataConstants.Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit for default GC$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_for_default_GC() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_for_default_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit for retailer GPR$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_for_retailer_GPR() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Expences_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_GPR_Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit for default GPR bunch12$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_for_default_GPR_bunch12()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo);
		String s = "Select " + DataConstants.customerMobileNo + "\n";
		clP.selectPocket(DataConstants.Pocket);
		s = s + "Select " + DataConstants.Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		clP.selectKit(kitNumber);
		s = s + "Select " + kitNumber;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit To Card for case 15$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_To_Card_for_case_15()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNoToCard);
		String s = "Select " + DataConstants.customerMobileNoToCard + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_250);
		s = s + "Enter \"Amount\" : " + Amount_250 + "\n";
		amount = Amount_250;
		clP.selectKit(kitNumberToCard);
		s = s + "Select " + kitNumberToCard;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit To Card$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_To_Card() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNoToCard);
		String s = "Select " + DataConstants.customerMobileNoToCard + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumberToCard);
		s = s + "Select " + kitNumberToCard;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit To Card for default GPR$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_To_Card_for_default_GPR()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNoToCard);
		String s = "Select " + DataConstants.customerMobileNoToCard + "\n";
		clP.selectPocket(DataConstants.Expences_Default_GPR_Pocket);
		s = s + "Select " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		clP.selectKit(kitNumberToCard);
		s = s + "Select " + kitNumberToCard;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit second$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_second() throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Load Card for less than pocket limit second for default GC$")
	public void user_fill_required_data_for_Load_Card_for_less_than_pocket_limit_second_for_default_GC()
			throws Throwable {
		amount = 0;
		clP.selectCustomerMobile(DataConstants.customerMobileNo2);
		String s = "Select " + DataConstants.customerMobileNo2 + "\n";
		clP.selectPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Select " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_400);
		s = s + "Enter \"Amount\" : " + Amount_400 + "\n";
		amount = Amount_400;
		clP.selectKit(kitNumber2);
		s = s + "Select " + kitNumber2;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user fill required data for file upload for 2 customer")
	public void user_fill_required_data_for_file_upload_for_2_customer() throws Throwable {
		bP.downloadRegistrationFormat();
		DataConstants.customerMobileNo = "943" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		String lastName = RandomStringUtils.randomAlphabetic(5);
		String email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		String idNum = RandomStringUtils.randomNumeric(12);
		filePath = Constants.uploadPath + "bulk_customer_upload.csv";
		String[] headers = new String[] { "firstName", "lastName", "mobile", "email", "preferredName",
				"mobileCountryCode", "birthday", "title", "gender", "idType", "idNumber", "countryOfIssue",
				"idExpiryDate", "address1", "address2", "city", "state", "country", "zipCode" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo, email,
				DataConstants.firstName, "91", "1994-10-10", "Mr", "M", "AADHAAR", idNum, "India", "2094-10-10",
				"Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		DataConstants.customerMobileNo2 = "943" + RandomStringUtils.randomNumeric(7);
		DataConstants.firstName = RandomStringUtils.randomAlphabetic(5);
		lastName = RandomStringUtils.randomAlphabetic(5);
		email = RandomStringUtils.randomAlphabetic(7).toLowerCase() + "@test.com";
		idNum = RandomStringUtils.randomNumeric(12);
		values.add(new String[] { DataConstants.firstName, lastName, DataConstants.customerMobileNo2, email,
				DataConstants.firstName, "91", "1994-10-10", "Mr", "M", "AADHAAR", idNum, "India", "2094-10-10",
				"Address 1", "Address 2", "Bangalore", "Karnataka", "India", "560076" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		bP.uploadBulkFile(filePath);
		String s = "Upload file : " + filePath + "\n";
		bP.selectOperationType("Bulk Register");
		s = s + "Select bulk register";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer from 1st to 2nd for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_from_1st_to_2nd_for_default_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumber2);
		s = s + "Enter " + kitNumber2 + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for Card To Card Transfer from 1st to 3rd for default GC$")
	public void user_fill_required_data_for_Card_To_Card_Transfer_from_1st_to_3rd_for_default_GC() throws Throwable {
		amount = 0;
		c2cP.enterFromCard(kitNumber);
		String s = "Enter " + kitNumber + "\n";
		c2cP.enterToCard(kitNumberToCard);
		s = s + "Enter " + kitNumberToCard + "\n";
		c2cP.enterPocket(DataConstants.Travel_Default_GC_Pocket);
		s = s + "Enter " + DataConstants.Travel_Default_GC_Pocket + "\n";
		clP.enterAmount(Amount_500);
		s = s + "Enter \"Amount\" : " + Amount_500 + "\n";
		amount = Amount_500;
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user search for reversal report$")
	public void user_search_for_reversal_report() throws Throwable {
		c2cP.searchReport(kitNumber);
	}

	@And("^user search for reversal report second$")
	public void user_search_for_reversal_report_second() throws Throwable {
		c2cP.searchReport(kitNumber2);
	}
}