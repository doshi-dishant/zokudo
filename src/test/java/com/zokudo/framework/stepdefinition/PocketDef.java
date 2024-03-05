package com.zokudo.framework.stepdefinition;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.PocketPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PocketDef {

	private PocketPage pP = new PocketPage(ObjectRepo.driver);
	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private static final String prefix = "Automation_";
	private static final String pocketNameNegative = "Automation_" + RandomStringUtils.randomAlphabetic(5);
	private static final String Limit_500 = "500";
	private static final String Limit_1000 = "1000";

	@Then("^user must reached to Add Pocket page validate by URL$")
	public void user_must_reached_to_Add_Pocket_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getAddPocketURL());
		InitializeWebDriver.scenario.write("Verified that user reached on add pocket page");
	}

	@When("^user fill required data for Add Pocket$")
	public void user_fill_required_data_for_Add_Pocket() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket = prefix + RandomStringUtils.randomAlphabetic(5);
		pP.selectClient(DataConstants.clientName);
		String string = "Select" + DataConstants.clientName + "\n";
		pP.selectProgram(DataConstants.programName);
		string = string + "Select " + DataConstants.programName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket + "\n";
		String[] s = { " Veterinary Services (0742)" };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Pocket negative$")
	public void user_fill_required_data_for_Add_Pocket_negative() throws Throwable {
		pP.selectClient(DataConstants.clientName);
		String string = "Select" + DataConstants.clientName + "\n";
		pP.selectProgram(DataConstants.programName);
		string = string + "Select " + DataConstants.programName + "\n";
		pP.enterPocketName(pocketNameNegative);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket + "\n";
		String[] s = { " Veterinary Services (0742)" };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@And("^user click on Pocket Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
		pP.clickOnSubmitButton();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button");
	}

	@Then("^user must be see Add Pocket success message$")
	public void user_must_be_see_Add_Pocket_success_message() throws Throwable {
		pP.verifyAddPocketSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Pocket created successfully!\"");
	}

	@Then("^user must reached to List Pocket page validate by URL$")
	public void user_must_reached_to_List_Pocket_page_validate_by_URL() throws Throwable {
		cP.verifyURL(Constants.URL + ObjectRepo.reader.getListPocketURL());
		InitializeWebDriver.scenario.write("Verified that user reached on list pocket page");
	}

	@And("^user must be see added pocket record$")
	public void user_must_be_see_added_pocket_record() throws Throwable {
		pP.verifyRecord(DataConstants.programName, DataConstants.Travel_Default_GC_Pocket);
	}

	@And("^user must be see added pocket record for default GC$")
	public void user_must_be_see_added_pocket_record_for_default_GC() throws Throwable {
		pP.verifyRecord(Constants.GC_Default_ProgramName, DataConstants.Travel_Default_GC_Pocket);
	}

	@And("^user must be see added pocket record for default GC client2$")
	public void user_must_be_see_added_pocket_record_for_default_GC_client2() throws Throwable {
		pP.verifyRecord(Constants.GC_Default_ProgramName1, DataConstants.Travel_Default_GC_Pocket2);
	}

	@And("^user must be see added pocket record for default GC client2 less limit$")
	public void user_must_be_see_added_pocket_record_for_default_GC_client2_less_limit() throws Throwable {
		pP.verifyRecord(Constants.GC_Default_ProgramName1, DataConstants.Travel_Default_GC_Pocket3);
	}

	@And("^user must be see added pocket record for default GC client2 second$")
	public void user_must_be_see_added_pocket_record_for_default_GC_client2_second() throws Throwable {
		pP.verifyRecord(Constants.GC_Default_ProgramName1, DataConstants.pocketName2);
	}

	@And("^user must be see added pocket record for default GC second$")
	public void user_must_be_see_added_pocket_record_for_default_GC_second() throws Throwable {
		pP.verifyRecord(Constants.GC_Default_ProgramName, DataConstants.pocketName2);
	}

	@And("^user must be see added pocket record for default GPR second$")
	public void user_must_be_see_added_pocket_record_for_default_GPR_second() throws Throwable {
		pP.verifyRecord(Constants.GPR_Default_ProgramName, DataConstants.pocketName2);
	}

	@And("^user must be see added pocket record for GC$")
	public void user_must_be_see_added_pocket_record_for_GC() throws Throwable {
		pP.verifyRecord(Constants.GC_ProgramName, DataConstants.Travel_Default_GC_Pocket);
	}

	@And("^user must be see added pocket record for default GC1$")
	public void user_must_be_see_added_pocket_record_for_default_GC1() throws Throwable {
		pP.verifyRecord(Constants.GC1_Default_ProgramName1, DataConstants.Travel_Default_GC_Pocket);
	}

	@And("^user must be see added pocket record for GC1$")
	public void user_must_be_see_added_pocket_record_for_GC1() throws Throwable {
		pP.verifyRecord(Constants.GC1_ProgramName, DataConstants.Travel_Default_GC_Pocket);
	}

	@When("^user fill required data for Add Travel Pocket for default GC client$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_client() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName);
		String string = "Select " + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName);
		string = string + "Select " + Constants.GC_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC client for update limit$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_client_for_update_limit()
			throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName);
		String string = "Select " + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName);
		string = string + "Select " + Constants.GC_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
		DataConstants.Travel_Default_GC_Pocket = DataConstants.Pocket;
	}

	@When("^user fill required data for Add Travel Pocket for default GC client2$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_client2() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket2 = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName2);
		String string = "Select " + Constants.defaultClientName2 + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName1);
		string = string + "Select " + Constants.GC_Default_ProgramName1 + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket2);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket2 + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC client2 less limit$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_client2_less_limit() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket3 = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName2);
		String string = "Select " + Constants.defaultClientName2 + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName1);
		string = string + "Select " + Constants.GC_Default_ProgramName1 + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket3);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket3 + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_500);
		string = string + "Enter \"Max Limit\" : " + Limit_500;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC client2 second$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_client2_second() throws Throwable {
		DataConstants.pocketName2 = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName2);
		String string = "Select " + Constants.defaultClientName2 + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName1);
		string = string + "Select " + Constants.GC_Default_ProgramName1 + "\n";
		pP.enterPocketName(DataConstants.pocketName2);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.pocketName2 + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC client second$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_client_second() throws Throwable {
		DataConstants.pocketName2 = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName);
		String string = "Select " + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName);
		string = string + "Select " + Constants.GC_Default_ProgramName;
		pP.enterPocketName(DataConstants.pocketName2);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.pocketName2 + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_500);
		string = string + "Enter \"Max Limit\" : " + Limit_500;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Expences Pocket for default GPR client second$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_Default_GPR_client_second() throws Throwable {
		DataConstants.Expences_Default_GPR_Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName);
		String string = "Select " + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GPR_Default_ProgramName);
		string = string + "Select " + Constants.GPR_Default_ProgramName;
		pP.enterPocketName(DataConstants.Expences_Default_GPR_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for GC client$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_GC_client() throws Throwable {
		DataConstants.Travel_GC_Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.clientName);
		String string = "Select " + Constants.clientName + "\n";
		pP.selectProgram(Constants.GC_ProgramName);
		string = string + "Select " + Constants.GC_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_GC_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for Lending GC client$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_lending_GC_client() throws Throwable {
		DataConstants.Travel_Lending_GC_Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.lendingClientName);
		String string = "Select " + Constants.lendingClientName + "\n";
		pP.selectProgram(Constants.GC_Lending_ProgramName);
		string = string + "Select " + Constants.GC_Lending_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Lending_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Lending_GC_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for GC1 client$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_GC1_client() throws Throwable {
		DataConstants.Travel_GC1_Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.gc1ClientName);
		String string = "Select " + Constants.gc1ClientName + "\n";
		pP.selectProgram(Constants.GC1_ProgramName);
		string = string + "Select " + Constants.GC1_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_GC1_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC1 client$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC1_client() throws Throwable {
		DataConstants.Travel_Default_GC1_Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName3);
		String string = "Select" + Constants.defaultClientName3 + "\n";
		pP.selectProgram(Constants.GC1_Default_ProgramName1);
		string = string + "Select " + Constants.GC1_Default_ProgramName1 + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC1_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC1 client update pocket limit$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC1_client_update_pocket_limit()
			throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName3);
		String string = "Select" + Constants.defaultClientName3 + "\n";
		pP.selectProgram(Constants.GC1_Default_ProgramName1);
		string = string + "Select " + Constants.GC1_Default_ProgramName1 + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC1_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC1 client1$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC1_client1() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName1);
		String string = "Select" + Constants.defaultClientName1 + "\n";
		pP.selectProgram(Constants.GC1_Default_ProgramName);
		string = string + "Select " + Constants.GC1_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@And("^user must be see added pocket record for default GPR$")
	public void user_must_be_see_added_pocket_record_for_default_GPR() throws Throwable {
		pP.verifyRecord(Constants.GPR_Default_ProgramName, DataConstants.Expences_Default_GPR_Pocket);
	}

	@And("^user must be see added pocket record for default GPR bonus pocket$")
	public void user_must_be_see_added_pocket_record_for_default_GPR_bonus_pocket() throws Throwable {
		pP.verifyRecord(Constants.GPR_Default_ProgramName, DataConstants.Bonus_Default_GPR_Pocket);
	}

	@And("^user must be see added pocket record for GPR$")
	public void user_must_be_see_added_pocket_record_for_GPR() throws Throwable {
		pP.verifyRecord(Constants.GPR_ProgramName, DataConstants.Expences_GPR_Pocket);
	}

	@And("^user must be see added pocket record for GPR bonus pocket$")
	public void user_must_be_see_added_pocket_record_for_GPR_bonus_pocket() throws Throwable {
		pP.verifyRecord(Constants.GPR_ProgramName, DataConstants.Bonus_GPR_Pocket);
	}

	@And("^user must be see added pocket record for GPR pocket2$")
	public void user_must_be_see_added_pocket_record_for_GPR_pocket2() throws Throwable {
		pP.verifyRecord(Constants.GPR_ProgramName, DataConstants.Expences_GPR_Pocket2);
	}

	@When("^user fill required data for Add Expences Pocket for default GPR client$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_Default_GPR_client() throws Throwable {
		DataConstants.Expences_Default_GPR_Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GPR_Default_ProgramName);
		string = string + "Select " + Constants.GPR_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Expences_Default_GPR_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Expences Pocket for default GPR client pocket2$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_Default_GPR_client_pocket2() throws Throwable {
		DataConstants.Expences_Default_GPR_Pocket2 = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GPR_Default_ProgramName);
		string = string + "Select " + Constants.GPR_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Expences_Default_GPR_Pocket2);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Expences_Default_GPR_Pocket2 + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	public static void main(String[] args) {
		int pocketLimit = 4000;
		try {
			pocketLimit = (int) ((2345.75 + 1000) / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(pocketLimit);
	}

	@When("^user fill required data for Add Expences Pocket for default GPR client 3 times program balance$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_Default_GPR_client_3_times_program_balance()
			throws Throwable {
		DataConstants.Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		DataConstants.tempPocketName = DataConstants.Pocket;
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GPR_Default_ProgramName);
		string = string + "Select " + Constants.GPR_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		int pocketLimit = 4000;
		try {
			pocketLimit = (int) ((DataConstants.balance + 1000) / 3);
		} catch (Exception e) {
		}
		pP.enterMaxLimit(String.valueOf(pocketLimit));
		string = string + "Enter \"Max Limit\" : " + pocketLimit;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC client 3 times program balance$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_client_3_times_program_balance()
			throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		DataConstants.tempPocketName = DataConstants.Pocket;
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName);
		string = string + "Select " + Constants.GC_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		int pocketLimit = 4000;
		try {
			pocketLimit = (int) ((DataConstants.balance + 1000) / 3);
		} catch (Exception e) {
		}
		pP.enterMaxLimit(String.valueOf(pocketLimit));
		string = string + "Enter \"Max Limit\" : " + pocketLimit;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC with 0 max limit$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC_with_0_max_limit() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName);
		string = string + "Select " + Constants.GC_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit("0");
		string = string + "Enter \"Max Limit\" : 0";
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC1 with 0 max limit$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC1_with_0_max_limit() throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.defaultClientName3);
		String string = "Select" + Constants.defaultClientName3 + "\n";
		pP.selectProgram(Constants.GC1_Default_ProgramName1);
		string = string + "Select " + Constants.GC1_Default_ProgramName1 + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit("0");
		string = string + "Enter \"Max Limit\" : 0";
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for GC with 0 max limit$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_GC_with_0_max_limit() throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GC_ProgramName);
		string = string + "Select " + Constants.GC_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit("0");
		string = string + "Enter \"Max Limit\" : 0";
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for GC1 with 0 max limit$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_GC1_with_0_max_limit() throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.gc1ClientName);
		String string = "Select" + Constants.gc1ClientName + "\n";
		pP.selectProgram(Constants.GC1_ProgramName);
		string = string + "Select " + Constants.GC1_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit("0");
		string = string + "Enter \"Max Limit\" : 0";
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Expences Pocket for GPR with 0 max limit$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_GPR_with_0_max_limit() throws Throwable {
		DataConstants.Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GPR_ProgramName);
		string = string + "Select " + Constants.GPR_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit("0");
		string = string + "Enter \"Max Limit\" : 0";
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Expences Pocket for default GPR with 0 max limit$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_Default_GPR_with_0_max_limit() throws Throwable {
		DataConstants.Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GPR_Default_ProgramName);
		string = string + "Select " + Constants.GPR_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit("0");
		string = string + "Enter \"Max Limit\" : 0";
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for default GC1 client 3 times program balance$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_Default_GC1_client_3_times_program_balance()
			throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		DataConstants.tempPocketName = DataConstants.Pocket;
		pP.selectClient(Constants.defaultClientName3);
		String string = "Select" + Constants.defaultClientName3 + "\n";
		pP.selectProgram(Constants.GC1_Default_ProgramName1);
		string = string + "Select " + Constants.GC1_Default_ProgramName1 + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		int pocketLimit = 4000;
		try {
			pocketLimit = (int) ((DataConstants.balance + 1000) / 3);
		} catch (Exception e) {
		}
		pP.enterMaxLimit(String.valueOf(pocketLimit));
		string = string + "Enter \"Max Limit\" : " + pocketLimit;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for GC client 3 times program balance$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_GC_client_3_times_program_balance() throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		DataConstants.tempPocketName = DataConstants.Pocket;
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GC_ProgramName);
		string = string + "Select " + Constants.GC_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		int pocketLimit = 4000;
		try {
			pocketLimit = (int) ((DataConstants.balance + 1000) / 3);
		} catch (Exception e) {
		}
		pP.enterMaxLimit(String.valueOf(pocketLimit));
		string = string + "Enter \"Max Limit\" : " + pocketLimit;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Travel Pocket for GC1 client 3 times program balance$")
	public void user_fill_required_data_for_Add_Travel_Pocket_for_GC1_client_3_times_program_balance()
			throws Throwable {
		DataConstants.Pocket = "Travel_" + RandomStringUtils.randomAlphanumeric(5);
		DataConstants.tempPocketName = DataConstants.Pocket;
		pP.selectClient(Constants.gc1ClientName);
		String string = "Select" + Constants.gc1ClientName + "\n";
		pP.selectProgram(Constants.GC1_ProgramName);
		string = string + "Select " + Constants.GC1_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		int pocketLimit = 4000;
		try {
			pocketLimit = (int) ((DataConstants.balance + 1000) / 3);
		} catch (Exception e) {
		}
		pP.enterMaxLimit(String.valueOf(pocketLimit));
		string = string + "Enter \"Max Limit\" : " + pocketLimit;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Expences Pocket for GPR client 3 times program balance$")
	public void user_fill_required_data_for_Add_Expences_Pocket_Default_GPR_client_3_times_program_balance()
			throws Throwable {
		DataConstants.Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		DataConstants.tempPocketName = DataConstants.Pocket;
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GPR_ProgramName);
		string = string + "Select " + Constants.GPR_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		int pocketLimit = 4000;
		try {
			pocketLimit = (int) ((DataConstants.balance + 1000) / 3);
		} catch (Exception e) {
		}
		pP.enterMaxLimit(String.valueOf(pocketLimit));
		string = string + "Enter \"Max Limit\" : " + pocketLimit;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Expences Pocket for GPR client$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_GPR_client() throws Throwable {
		DataConstants.Expences_GPR_Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GPR_ProgramName);
		string = string + "Select " + Constants.GPR_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Expences_GPR_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Expences_GPR_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Expences Pocket for GPR client pocket2$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_GPR_client_pocket2() throws Throwable {
		DataConstants.Expences_GPR_Pocket2 = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GPR_ProgramName);
		string = string + "Select " + Constants.GPR_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Expences_GPR_Pocket2);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Expences_GPR_Pocket2 + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_500);
		string = string + "Enter \"Max Limit\" : " + Limit_500;
		InitializeWebDriver.scenario.write(string);
	}

	@Then("^user must be see Add Pocket failure message$")
	public void user_must_be_see_Add_Pocket_failure_message() throws Throwable {
		pP.verifyAddPocketFailureMessage();
		InitializeWebDriver.scenario
				.write("Verified message \"This client with this mcc group is already associated with the pocket!\"");
	}

	@When("^user fill required data for Add Vacation Pocket for default GC client$")
	public void user_fill_required_data_for_Add_Vacation_Pocket_for_Default_GC_client() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket = "Vacation_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GC_Default_ProgramName);
		string = string + "Select " + Constants.GC_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Vacation Pocket for GC client$")
	public void user_fill_required_data_for_Add_Vacation_Pocket_for_GC_client() throws Throwable {
		DataConstants.Travel_Default_GC_Pocket = "Vacation_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GC_ProgramName);
		string = string + "Select " + Constants.GC_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Travel_Default_GC_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Bonus Pocket for default GPR client$")
	public void user_fill_required_data_for_Add_Bonus_Pocket_for_Default_GPR_client() throws Throwable {
		DataConstants.Bonus_Default_GPR_Pocket = "Bonus_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.defaultClientName);
		String string = "Select" + Constants.defaultClientName + "\n";
		pP.selectProgram(Constants.GPR_Default_ProgramName);
		string = string + "Select " + Constants.GPR_Default_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Travel_Default_GC_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Bonus_Default_GPR_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user fill required data for Add Bonus Pocket for GPR client$")
	public void user_fill_required_data_for_Add_Bonus_Pocket_for_GPR_client() throws Throwable {
		DataConstants.Bonus_GPR_Pocket = "Bonus_" + RandomStringUtils.randomAlphanumeric((5));
		pP.selectClient(Constants.clientName);
		String string = "Select" + Constants.clientName + "\n";
		pP.selectProgram(Constants.GPR_ProgramName);
		string = string + "Select " + Constants.GPR_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Bonus_GPR_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Bonus_GPR_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@When("^user can able to update max limit for GC$")
	public void user_can_able_to_update_max_limit_for_GC() throws Throwable {
		DataConstants.limit = 20000;
		pP.updateLimit(Constants.GC_Default_ProgramName, DataConstants.Travel_Default_GC_Pocket,
				String.valueOf(DataConstants.limit));
	}

	@When("^user can able to update max limit for GC update pocket limit$")
	public void user_can_able_to_update_max_limit_for_GC_update_pocket_limit() throws Throwable {
		DataConstants.limit = 20000;
		pP.updateLimit(Constants.GC_Default_ProgramName, DataConstants.Pocket, String.valueOf(DataConstants.limit));
	}

	@When("^user can able to update max limit for GC1 update pocket limit$")
	public void user_can_able_to_update_max_limit_for_GC1_update_pocket_limit() throws Throwable {
		DataConstants.limit = 20000;
		pP.updateLimit(Constants.GC1_Default_ProgramName1, DataConstants.Pocket, String.valueOf(DataConstants.limit));
	}

	@When("^user can able to update max limit for GC client2$")
	public void user_can_able_to_update_max_limit_for_GC_client2() throws Throwable {
		DataConstants.limit = 500;
		pP.updateLimit(Constants.GC_Default_ProgramName1, DataConstants.Travel_Default_GC_Pocket2,
				String.valueOf(DataConstants.limit));
	}

	@When("^user can able to update max limit for GPR client$")
	public void user_can_able_to_update_max_limit_for_GPR_client() throws Throwable {
		DataConstants.limit = 750;
		pP.updateLimit(Constants.GPR_Default_ProgramName, DataConstants.Expences_Default_GPR_Pocket,
				String.valueOf(DataConstants.limit));
	}

	@When("^user can able to update max limit for GC1$")
	public void user_can_able_to_update_max_limit_for_GC1() throws Throwable {
		DataConstants.limit = 20000;
		pP.updateLimit(Constants.GC1_Default_ProgramName1, DataConstants.Travel_Default_GC1_Pocket,
				String.valueOf(DataConstants.limit));
	}

	@When("^user search pocket for GC$")
	public void user_search_pocket_for_GC() throws Throwable {
		DataConstants.Pocket = "Travel";
		pP.searchPocket(Constants.GC_Default_ProgramName);
	}

	@When("^user search pocket for GC1$")
	public void user_search_pocket_for_GC1() throws Throwable {
		DataConstants.Pocket = "Travel";
		pP.searchPocket(Constants.GC1_Default_ProgramName1);
	}

	@When("^user search pocket for GPR$")
	public void user_search_pocket_for_GPR() throws Throwable {
		DataConstants.Pocket = "Travel";
		pP.searchPocket(Constants.GPR_Default_ProgramName);
	}

	@Then("^user can able to see searched pocket$")
	public void user_can_able_to_see_searched_pocket() throws Throwable {
		pP.searchPocket(DataConstants.Travel_Default_GC_Pocket);
	}

	@Then("^user can able to view mcc list$")
	public void user_can_able_to_view_mcc_list() throws Throwable {
		pP.clickOnViewMCCList(DataConstants.Travel_Default_GC_Pocket);
		String s = "Click on \"View MCC List\" button of " + DataConstants.Travel_Default_GC_Pocket + "\n";
		List<String> mcc = pP.getMCCList();
		System.out.println(mcc);
		s = s + mcc;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can able to view mcc list for default GC1$")
	public void user_can_able_to_view_mcc_list_for_default_GC1() throws Throwable {
		pP.clickOnViewMCCList(DataConstants.Travel_Default_GC1_Pocket);
		String s = "Click on \"View MCC List\" button of " + DataConstants.Travel_Default_GC1_Pocket + "\n";
		List<String> mcc = pP.getMCCList();
		System.out.println(mcc);
		s = s + mcc;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can able to view mcc list for default GC$")
	public void user_can_able_to_view_mcc_list_for_default_GC() throws Throwable {
		pP.clickOnViewMCCList(DataConstants.Travel_Default_GC_Pocket);
		String s = "Click on \"View MCC List\" button of " + DataConstants.Travel_Default_GC_Pocket + "\n";
		List<String> mcc = pP.getMCCList();
		System.out.println(mcc);
		s = s + mcc;
		InitializeWebDriver.scenario.write(s);
	}

	@Then("^user can able to view mcc list for default GPR$")
	public void user_can_able_to_view_mcc_list_for_default_GPR() throws Throwable {
		pP.clickOnViewMCCList(DataConstants.Expences_Default_GPR_Pocket);
		String s = "Click on \"View MCC List\" button of " + DataConstants.Expences_Default_GPR_Pocket + "\n";
		List<String> mcc = pP.getMCCList();
		System.out.println(mcc);
		s = s + mcc;
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user search for Expense pocket$")
	public void user_search_for_Expense_pocket() throws Throwable {
		DataConstants.Pocket = "Expences";
		pP.verifyRecord(Constants.GPR_Default_ProgramName, DataConstants.Expences_Default_GPR_Pocket);
	}

	@When("^user fill required data for Add Expences Pocket for Lending GPR client$")
	public void user_fill_required_data_for_Add_Expences_Pocket_for_lending_GPR_client() throws Throwable {
		DataConstants.Expences_Lending_GPR_Pocket = "Expences_" + RandomStringUtils.randomAlphanumeric(5);
		pP.selectClient(Constants.lendingClientName);
		String string = "Select" + Constants.lendingClientName + "\n";
		pP.selectProgram(Constants.GPR_Lending_ProgramName);
		string = string + "Select " + Constants.GPR_Lending_ProgramName + "\n";
		pP.enterPocketName(DataConstants.Expences_Lending_GPR_Pocket);
		string = string + "Enter \"Pocket Name\" : " + DataConstants.Expences_Lending_GPR_Pocket + "\n";
		String mccGroup = pP.getMCCGroup();
		String[] s = { mccGroup };
		pP.selectMCCGroup(s);
		pP.enterMaxLimit(Limit_1000);
		string = string + "Enter \"Max Limit\" : " + Limit_1000;
		InitializeWebDriver.scenario.write(string);
	}

	@And("^user must be see added pocket record for lending GPR$")
	public void user_must_be_see_added_pocket_record_for_lending_GPR() throws Throwable {
		pP.verifyRecord(Constants.GPR_Lending_ProgramName, DataConstants.Travel_Default_GC_Pocket);
	}

	@And("^user must be see added pocket record for lending GC$")
	public void user_must_be_see_added_pocket_record_for_lending_GC() throws Throwable {
		pP.verifyRecord(Constants.GC_Lending_ProgramName, DataConstants.Travel_Default_GC_Pocket);
	}

//	@Then("^user must be verified that pocket name is default and max limit is 0$")
	public void user_must_be_verified_that_pocket_name_is_default_and_max_limit_is_0() throws Throwable {
		pP.verifyPocketNameAndMaxLimit();
		InitializeWebDriver.scenario.write("Verified pocket name and max limit is 0");
	}

	@Then("^user must be verified that pocket name and max limit for default GC$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_default_GC() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Travel_Default_GC_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for GC$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_GC() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Travel_GC_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for GC1$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_GC1() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Travel_GC1_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for GPR$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_GPR() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Expences_GPR_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for lending GPR$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_lending_GPR() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Expences_Lending_GPR_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for default GC1$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_default_GC1() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Travel_Default_GC1_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for lending GC$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_lending_GC() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Travel_Lending_GC_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for default GPR$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_default_GPR() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Expences_Default_GPR_Pocket);
	}

	@Then("^user must be verified that pocket name and max limit for default GPR pocket2$")
	public void user_must_be_verified_that_pocket_name_and_max_limit_for_default_GPR_pocket2() throws Throwable {
		pP.verifyPocketNameAndMaxLimit(DataConstants.Expences_Default_GPR_Pocket2);
	}
}
