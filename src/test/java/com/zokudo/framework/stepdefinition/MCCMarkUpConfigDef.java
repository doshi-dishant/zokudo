package com.zokudo.framework.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.RandomStringUtils;

import com.zokudo.constants.Constants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.framework.utility.CSVHelper;
import com.zokudo.helper.PageObject.CardInventoryPage;
//import com.zokudo.helper.PageObject.CommonPage;
import com.zokudo.helper.PageObject.MCCMarkUpConfigPage;
import com.zokudo.helper.PageObject.PocketPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MCCMarkUpConfigDef {
	private MCCMarkUpConfigPage mP = new MCCMarkUpConfigPage(ObjectRepo.driver);
	private PocketPage pP = new PocketPage(ObjectRepo.driver);
	private CardInventoryPage cIP = new CardInventoryPage(ObjectRepo.driver);
	private String filePath;
//	private CommonPage cP = new CommonPage(ObjectRepo.driver);
	private static String markUpValue, channel, tempMcc1, tempMcc2;

	private String generateRandomIntValue(int digit) {
		String result = RandomStringUtils.randomNumeric(digit);
		while (Integer.parseInt(result) == 0)
			result = RandomStringUtils.randomNumeric(digit);
		return result;
	}

	@When("^user fill required data for set mcc markup for default gpr program ECOM$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gpr_program_ECOM() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "ECOM";
		mP.selectProgram(Constants.GPR_Default_ProgramName);
		String s = "Select " + Constants.GPR_Default_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gpr program ECOM for digit 1 decimal 1$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gpr_program_ECOM_for_digit_1_decimal_1()
			throws Throwable {
		markUpValue = generateRandomIntValue(1) + "." + generateRandomIntValue(1);
		channel = "ECOM";
		mP.selectProgram(Constants.GPR_Default_ProgramName);
		String s = "Select " + Constants.GPR_Default_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gc program POS$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gc_program_POS() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GC_Default_ProgramName);
		String s = "Select " + Constants.GC_Default_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gpr program POS$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gpr_program_POS() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_Default_ProgramName);
		String s = "Select " + Constants.GPR_Default_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { tempMcc1, tempMcc2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gpr program POS fixed digit$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gpr_program_POS_fixed_digit() throws Throwable {
		markUpValue = "10";
		channel = "POS";
		mP.selectProgram(Constants.GPR_Default_ProgramName);
		String s = "Select " + Constants.GPR_Default_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { tempMcc1, tempMcc2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gpr program POS with existing mcc$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gpr_program_POS_existing_mcc() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_Default_ProgramName);
		String s = "Select " + Constants.GPR_Default_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
//		String mccGroup1 = pP.getMCCGroup();
//		String mccGroup2 = pP.get2ndMCCGroup();
//		tempMcc1 = mccGroup1;
//		tempMcc2 = mccGroup2;
		String[] mcc = { tempMcc1, tempMcc2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gpr program POS$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gpr_program_POS() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_ProgramName);
		String s = "Select " + Constants.GPR_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gpr program POS existing mcc$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gpr_program_POS_existing_mcc()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_ProgramName);
		String s = "Select " + Constants.GPR_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String[] mcc = { tempMcc1, tempMcc2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gpr program POS 2 decimal$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gpr_program_POS_2_decimal() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + RandomStringUtils.randomNumeric(3);
		channel = "POS";
		mP.selectProgram(Constants.GPR_ProgramName);
		String s = "Select " + Constants.GPR_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gpr program POS greter than 100 percent")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gpr_program_POS_greter_than_100_percent()
			throws Throwable {
		markUpValue = RandomStringUtils.randomNumeric(3) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_ProgramName);
		String s = "Select " + Constants.GPR_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gc program POS$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gc_program_POS() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GC_ProgramName);
		String s = "Select " + Constants.GC_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gc program POS existing mcc$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gc_program_POS_existing_mcc() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GC_ProgramName);
		String s = "Select " + Constants.GC_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String[] mcc = { tempMcc1, tempMcc2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gc program POS with digit 2 decimal 1$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gc_program_POS_with_digit_2_decimal_1()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GC_ProgramName);
		String s = "Select " + Constants.GC_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { mccGroup1, mccGroup2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gpr program contactless")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gpr_program_contactless() throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "CONTACTLESS";
		mP.selectProgram(Constants.GPR_Default_ProgramName);
		String s = "Select " + Constants.GPR_Default_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		String[] mcc = { tempMcc1, tempMcc2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gpr program ECOM duplicate request$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gpr_program_ECOM_duplicate_request()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "ECOM";
		mP.selectProgram(Constants.GPR_Default_ProgramName);
		String s = "Select " + Constants.GPR_Default_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String[] mcc = { tempMcc1, tempMcc2 };
		pP.selectMCCGroup(mcc);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gc program POS for bulk upload$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gc_program_POS_for_bulk_upload()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GC_Default_ProgramName);
		String s = "Select " + Constants.GC_Default_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		Pattern pattern = Pattern.compile("(\\(\\d{4})\\)");
		Matcher matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\(\\d{4})\\)");
		matcher = pattern.matcher(mccGroup2);
		if (matcher.find())
			mccGroup2 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup2);
		if (matcher.find())
			mccGroup2 = matcher.group(0);
		filePath = Constants.uploadPath + "mcc_config.csv";
		String[] headers = new String[] { "code" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { mccGroup1 });
		values.add(new String[] { mccGroup2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		mP.toggleBulkUpload();
		s = s + "Enter clicked on bulk upload toggle\n";
		mP.uploadSheet(filePath);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gc program POS for bulk upload with one existing mcc")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gc_program_POS_for_bulk_upload_with_one_existing_mcc()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GC_Default_ProgramName);
		String s = "Select " + Constants.GC_Default_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		tempMcc1 = mccGroup1;
		Pattern pattern = Pattern.compile("(\\(\\d{4})\\)");
		Matcher matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\(\\d{4})\\)");
		matcher = pattern.matcher(tempMcc2);
		if (matcher.find())
			tempMcc2 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(tempMcc2);
		if (matcher.find())
			tempMcc2 = matcher.group(0);
		filePath = Constants.uploadPath + "mcc_config.csv";
		String[] headers = new String[] { "code" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { mccGroup1 });
		values.add(new String[] { tempMcc2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		mP.toggleBulkUpload();
		s = s + "Enter clicked on bulk upload toggle\n";
		mP.uploadSheet(filePath);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gpr program POS for bulk upload$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gpr_program_POS_for_bulk_upload()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_ProgramName);
		String s = "Select " + Constants.GPR_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		Pattern pattern = Pattern.compile("(\\(\\d{4})\\)");
		Matcher matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\(\\d{4})\\)");
		matcher = pattern.matcher(mccGroup2);
		if (matcher.find())
			mccGroup2 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup2);
		if (matcher.find())
			mccGroup2 = matcher.group(0);
		filePath = Constants.uploadPath + "mcc_config.csv";
		String[] headers = new String[] { "code" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { mccGroup1 });
		values.add(new String[] { mccGroup2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		mP.toggleBulkUpload();
		s = s + "Enter clicked on bulk upload toggle\n";
		mP.uploadSheet(filePath);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gpr program POS for bulk upload blank$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gpr_program_POS_for_bulk_upload_blank()
			throws Throwable {
		tempMcc1 = "";
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_ProgramName);
		String s = "Select " + Constants.GPR_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		filePath = Constants.uploadPath + "mcc_config.csv";
		String[] headers = new String[] { "code" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { "" });
		values.add(new String[] { "" });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		mP.toggleBulkUpload();
		s = s + "Enter clicked on bulk upload toggle\n";
		mP.uploadSheet(filePath);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for retailer gpr program POS for bulk upload invalid mcc$")
	public void user_fill_required_data_for_set_mcc_markup_for_retailer_gpr_program_POS_for_bulk_upload_invalid_mcc()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GPR_ProgramName);
		String s = "Select " + Constants.GPR_ProgramName + "\n";
		mP.selectProgramType("GPR");
		s = s + "Select GPR\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		filePath = Constants.uploadPath + "mcc_config.csv";
		String[] headers = new String[] { "code" };
		List<String[]> values = new ArrayList<String[]>();
		tempMcc1 = RandomStringUtils.randomNumeric(4);
		tempMcc2 = RandomStringUtils.randomNumeric(4);
		values.add(new String[] { tempMcc1 });
		values.add(new String[] { tempMcc2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		mP.toggleBulkUpload();
		s = s + "Enter clicked on bulk upload toggle\n";
		mP.uploadSheet(filePath);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gc program ECOM for bulk upload$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gc_program_ECOM_for_bulk_upload()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "ECOM";
		mP.selectProgram(Constants.GC_Default_ProgramName);
		String s = "Select " + Constants.GC_Default_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		String mccGroup1 = pP.getMCCGroup();
		String mccGroup2 = pP.get2ndMCCGroup();
		tempMcc1 = mccGroup1;
		tempMcc2 = mccGroup2;
		Pattern pattern = Pattern.compile("(\\(\\d{4})\\)");
		Matcher matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\(\\d{4})\\)");
		matcher = pattern.matcher(mccGroup2);
		if (matcher.find())
			mccGroup2 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup2);
		if (matcher.find())
			mccGroup2 = matcher.group(0);
		filePath = Constants.uploadPath + "mcc_config.csv";
		String[] headers = new String[] { "code" };
		List<String[]> values = new ArrayList<String[]>();
		values.add(new String[] { mccGroup1 });
		values.add(new String[] { mccGroup2 });
		CSVHelper.writeDataLineByLineInCSV(filePath, headers, values);
		mP.toggleBulkUpload();
		s = s + "Enter clicked on bulk upload toggle\n";
		mP.uploadSheet(filePath);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@When("^user fill required data for set mcc markup for default gc program POS for bulk upload duplicate$")
	public void user_fill_required_data_for_set_mcc_markup_for_default_gc_program_POS_for_bulk_upload_duplicate()
			throws Throwable {
		markUpValue = generateRandomIntValue(2) + "." + generateRandomIntValue(1);
		channel = "POS";
		mP.selectProgram(Constants.GC_Default_ProgramName);
		String s = "Select " + Constants.GC_Default_ProgramName + "\n";
		mP.selectProgramType("GC");
		s = s + "Select GC\n";
		mP.selectChannel(channel);
		s = s + "Select " + channel + "\n";
		mP.toggleBulkUpload();
		s = s + "Enter clicked on bulk upload toggle\n";
		mP.uploadSheet(filePath);
		mP.enterMarkUpValue(markUpValue);
		s = s + "Enter " + markUpValue + "\n";
		InitializeWebDriver.scenario.write(s);
	}

	@And("^user click on mcc markup submit button$")
	public void user_click_on_mcc_markup_submit_button() throws Throwable {
		mP.clickOnSubmit();
		InitializeWebDriver.scenario.write("Click on \"Submit\" button\n");
	}

	@Then("^user verify add markup success message$")
	public void user_verify_add_markup_success_message() throws Throwable {
		mP.verifyAddMarkupSuccessMessage();
		InitializeWebDriver.scenario.write("Verified message \"Markup Added\"");
	}

	@Then("^user verify add markup success message for bulk$")
	public void user_verify_add_markup_success_message_for_bulk() throws Throwable {
		mP.verifyAddMarkupSuccessMessageForBulk();
		InitializeWebDriver.scenario.write("Verified message \"Processed, Kindly check reports\"");
	}

	@Then("^user verify add markup already exist message$")
	public void user_verify_add_markup_already_exist_message() throws Throwable {
		mP.verifyAddMarkupAlreadyExistMessage();
		InitializeWebDriver.scenario.write("Verified message \"Markup already exists.\"");
	}

	@Then("^user verify add markup already exist message for edit$")
	public void user_verify_add_markup_already_exist_message_for_edit() throws Throwable {
		mP.verifyAddMarkupAlreadyExistMessageForEdit();
		InitializeWebDriver.scenario.write("Verified message \"Markup already exists.\"");
	}

	@And("^user can able to edit mcc$")
	public void user_can_able_to_edit_mcc() throws Throwable {
		mP.removeMCC();
		String mccGroup1 = pP.getMCCGroup();
		tempMcc1 = mccGroup1;
		String[] mcc = { mccGroup1 };
		pP.selectMCCGroup(mcc);
		InitializeWebDriver.scenario.write("Verified user can able to edit mcc");
		System.out.println();
	}

	@Then("^user verify markup added$")
	public void user_verify_markup_added() throws Throwable {
		mP.verifyMarkup(markUpValue, channel);
		InitializeWebDriver.scenario.write("Verified that markup added successfully");
	}

	@Then("^user verify markup not added$")
	public void user_verify_markup_not_added() throws Throwable {
		mP.verifyMarkupNotAdded(markUpValue, channel);
		InitializeWebDriver.scenario.write("Verified that markup not added");
	}

	@Then("^user can able to verify invalid markup validation message$")
	public void user_can_able_to_verify_invalid_markup_validation_message() throws Throwable {
		mP.VerifyInvalidMarkupMessage();
		InitializeWebDriver.scenario.write("Verified that invalid markup value validation message is displayed");
	}

	@And("^user search records$")
	public void user_search_records() throws Throwable {
		mP.search();
		InitializeWebDriver.scenario.write("Navigate to \"MCC Markup Upload Summary\"");
	}

	@And("^user search record$")
	public void user_search_record() throws Throwable {
		mP.clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		cIP.SelectDateRange();
		s = s + "Click on date range\nClick on last 7 days\n";
		cIP.clickOnFilterButton();
		s = s + "Click on \"Filter\" button";
		InitializeWebDriver.scenario.write("Navigate to \"MCC Markup Upload Summary\"");
	}

	@And("^user verify failure reason if failed$")
	public void user_verify_failure_reason_if_failed() throws Throwable {
		String mccGroup1 = tempMcc1;
		Pattern pattern = Pattern.compile("(\\(\\d{4})\\)");
		Matcher matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		pattern = Pattern.compile("(\\d{4})");
		matcher = pattern.matcher(mccGroup1);
		if (matcher.find())
			mccGroup1 = matcher.group(0);
		String reason = mP.getFailureReason(mccGroup1);
		System.out.println(reason);
	}
}