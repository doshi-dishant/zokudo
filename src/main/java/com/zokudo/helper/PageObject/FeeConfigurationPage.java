package com.zokudo.helper.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class FeeConfigurationPage extends PageBase {

	private WebDriver driver;

//	private final static Logger log = LoggerHelper.getLogger(FeeConfigurationPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
//	private DropDownHelper dHelper;
	private GenericHelper gHelper;
//	private WaitHelper wHelper;

	public FeeConfigurationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
//		dHelper = new DropDownHelper(driver);
		gHelper = new GenericHelper(driver);
//		wHelper = new WaitHelper(driver, ObjectRepo.reader);
	}

	/** Web Elements */

	@FindBy(id = "programName")
	@CacheLookup
	private WebElement programName;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(xpath = "//button[contains(@onclick,'openUpdateClientFeesModal')]")
	@CacheLookup
	private WebElement btnUpdate;

	@FindBy(id = "updateButton")
	@CacheLookup
	private WebElement updateButton;

	@FindBy(xpath = "//*[normalize-space(text())='Search']")
	@CacheLookup
	private WebElement btnSearchSubmit;

	@FindBy(xpath = "//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'enableInput')]")
	@CacheLookup
	private WebElement txtIssuanceFee;

	@FindBy(xpath = "//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'cgst')]")
	@CacheLookup
	private WebElement txtCGST;

	@FindBy(xpath = "//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'sgst')]")
	@CacheLookup
	private WebElement txtSGST;

	@FindBy(xpath = "//*[@id='paginationn_fees']//*[normalize-space(text())='Next']")
	@CacheLookup
	private WebElement btnNext;

	String feeType = "//*[text()='ISSUANCE_FEE']//following-sibling::*//*[@class='%s']";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void clickOnSearchButton() {
		try {
			bHelper.click(btnSearch);
		} catch (Exception e) {
			try {
				Thread.sleep(3000);
				ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
			} catch (Exception e2) {
				ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
			}
		}
	}

	public void clickOnSubmitSearchButton() {
		try {
			bHelper.click(btnSearchSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
	}

	public void clickOnUpdateButton() {
		try {
			bHelper.click(updateButton);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("updateButton")).click();
		}
	}

	public void clickOnUpdateProgramButton() {
		try {
			Thread.sleep(5000);
			bHelper.click(btnUpdate);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//button[contains(@onclick,'openUpdateClientFeesModal')]")).click();
		}
	}

	public void clickOnNextButton() {
		try {
			bHelper.click(btnNext);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Next']")).click();
		}
	}

	public void clickOnFeeType(String type) {
		try {
			bHelper.click(By.xpath(String.format(feeType, type)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(feeType, type))).click();
		}
	}

	public void enterProgramName(String program) {
		try {
			tHelper.clearAndSendKeys(programName, program);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("programName")).clear();
			ObjectRepo.driver.findElement(By.id("programName")).sendKeys(program);
		}
	}

	public void enterFee(String fee) {
		try {
			tHelper.clearAndSendKeys(txtIssuanceFee, fee);
		} catch (Exception e) {
			ObjectRepo.driver
					.findElement(By
							.xpath("//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'enableInput')]"))
					.clear();
			ObjectRepo.driver
					.findElement(By
							.xpath("//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'enableInput')]"))
					.sendKeys(fee);
		}
	}

	public void enterSGST(String sgst) {
		try {
			tHelper.clearAndSendKeys(txtSGST, sgst);
		} catch (Exception e) {
			ObjectRepo.driver
					.findElement(By.xpath("//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'sgst')]"))
					.clear();
			ObjectRepo.driver
					.findElement(By.xpath("//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'sgst')]"))
					.sendKeys(sgst);
		}
	}

	public void enterCGST(String cgst) {
		try {
			tHelper.clearAndSendKeys(txtCGST, cgst);
		} catch (Exception e) {
			ObjectRepo.driver
					.findElement(By.xpath("//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'cgst')]"))
					.clear();
			ObjectRepo.driver
					.findElement(By.xpath("//*[text()='ISSUANCE_FEE']//following-sibling::*//*[contains(@id,'cgst')]"))
					.sendKeys(cgst);
		}
	}

	public void searchProgram(String program) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterProgramName(program);
		s = s + "Enter \"Program\" : " + program + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Search\" button\n";
		InitializeWebDriver.scenario.write(s);
	}

	public void updateCardIssuanceFee(String program, String type, String fee, String cgst, String sgst) {
		searchProgram(program);
		clickOnUpdateProgramButton();
		String s = "Click on \"Update\" button\n";
		if (!gHelper.IsElementPresentQuick(By.xpath(String.format(feeType, type)))) {
			clickOnNextButton();
			s = s + "Click on \"Next\" button\n";
		}
		clickOnFeeType(type);
		s = s + "Select \"Fee Type\" : " + type + "\n";
		enterFee(fee);
		s = s + "Enter \"Fee\" : " + fee + "\n";
		enterCGST(cgst);
		s = s + "Enter \"CGST\" : " + cgst + "\n";
		enterSGST(sgst);
		s = s + "Enter \"SGST\" : " + sgst + "\n";
		clickOnUpdateButton();
		InitializeWebDriver.scenario.write(s);
	}

	public void updateATMFee(String program, String type, String fee, String cgst, String sgst) {
		searchProgram(program);
		clickOnUpdateProgramButton();
		String s = "Click on \"Update\" button\n";
		if (!gHelper.IsElementPresentQuick(By.xpath(String.format(feeType, type)))) {
			clickOnNextButton();
			s = s + "Click on \"Next\" button\n";
		}
		clickOnFeeType(type);
		s = s + "Select \"Fee Type\" : " + type + "\n";
		enterFee(fee);
		s = s + "Enter \"Fee\" : " + fee + "\n";
		enterCGST(cgst);
		s = s + "Enter \"CGST\" : " + cgst + "\n";
		enterSGST(sgst);
		s = s + "Enter \"SGST\" : " + sgst + "\n";
		clickOnUpdateButton();
		InitializeWebDriver.scenario.write(s);
	}

}
