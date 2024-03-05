package com.zokudo.helper.PageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.DropDown.DropDownHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.framework.utility.DateTimeHelper;

public class KitAssignPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(KitAssignPage.class);
	private ButtonHelper bHelper;
	private GenericHelper gHelper;
	private DropDownHelper dHelper;
	private TextBoxHelper tHelper;
	private WaitHelper wHelper;

	public KitAssignPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		gHelper = new GenericHelper(driver);
		dHelper = new DropDownHelper(driver);
		tHelper = new TextBoxHelper(driver);
		wHelper = new WaitHelper(driver, ObjectRepo.reader);
	}

	/** Web Elements */

	@FindBy(id = "clientId")
	@CacheLookup
	private WebElement drpClient;

	@FindBy(id = "programId")
	@CacheLookup
	private WebElement drpProgram;

	@FindBy(id = "cardStatus")
	@CacheLookup
	WebElement drpCardStatus;

	@FindBy(id = "businessId")
	@CacheLookup
	private WebElement txtBusinessType;

	@FindBy(id = "uploadTypeId")
	@CacheLookup
	private WebElement drpType;

	@FindBy(id = "cardTypeId")
	@CacheLookup
	private WebElement drpCardType;

	@FindBy(xpath = "//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtKitNo;

	@FindBy(id = "kitNumber")
	@CacheLookup
	private WebElement drpKitNo;

	@FindBy(id = "createCardRequest")
	@CacheLookup
	private WebElement btnCardIssueSubmit;

	@FindBy(xpath = "//*[@id='dateId']//following-sibling::*//button")
	@CacheLookup
	private WebElement datePicker;

	@FindBy(xpath = "//*[contains(@aria-labelledby,'kitNumberId')]")
	@CacheLookup
	private WebElement drpKitNumber;

	@FindBy(xpath = "//*[contains(@aria-labelledby,'customerHashId')]")
	@CacheLookup
	private WebElement drpCustomerNum;

	@FindBy(id = "submitBtnId")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(xpath = "//*[normalize-space(text())='Search']")
	@CacheLookup
	private WebElement btnSearchSubmit;

	@FindBy(id = "kitSheetId")
	@CacheLookup
	private WebElement fileUploadKit;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(id = "kitNo")
	@CacheLookup
	private WebElement txtSearchKitNo;

	@FindBy(xpath = "//*[normalize-space(text())='Filter']")
	@CacheLookup
	private WebElement btnFilter;

	@FindBy(xpath = "//span[contains(@class,'danger')]")
	@CacheLookup
	private WebElement kitUsed;

	@FindBy(xpath = "//span[contains(@class,'success')]")
	@CacheLookup
	private WebElement kitAvail;

	@FindBy(xpath = "//span[contains(@class,'info')]")
	@CacheLookup
	private WebElement totalKitCount;

	@FindBy(id = "reportrange")
	@CacheLookup
	private WebElement reportrange;

	@FindBy(id = "cardDetailsBtn")
	@CacheLookup
	private WebElement btnCardDetails;

	@FindBy(xpath = "//li[text()='Last 30 Days']")
	@CacheLookup
	private WebElement last30Days;

	@FindBy(xpath = "//li[text()='This Month']")
	@CacheLookup
	private WebElement thisMonth;

	@FindBy(id = "programHashId")
	@CacheLookup
	private WebElement drpProgramHashId;

	@FindBy(id = "kitStatus")
	@CacheLookup
	private WebElement drpKitStatus;

	@FindBy(id = "mobile")
	@CacheLookup
	private WebElement txtSearchMobileNum;

	@FindBy(id = "distributorId")
	@CacheLookup
	private WebElement drpDistributor;

	@FindBy(id = "retailerId")
	@CacheLookup
	private WebElement drpRetailer;

//	@FindBy(xpath = "(//td[text()='ACTIVE']//preceding-sibling::td[text()='FULL_KYC']//preceding-sibling::td[6])[1]")
	@FindBy(xpath = "(//td[7])[1]")
	@CacheLookup
	private WebElement fetchActiveCustomer;

	@FindBy(id = "statusId")
	@CacheLookup
	private WebElement drpKYCType;

	@FindBy(id = "statusId2")
	@CacheLookup
	private WebElement drpStatus;

	@FindBy(xpath = "(//td[text()='ACTIVE']//preceding-sibling::td[text()='MIN_KYC']//preceding-sibling::td[6])[1]")
	@CacheLookup
	private WebElement fetchActiveMinKYCCustomer;

	@FindBy(xpath = "(//td[text()='FULL_KYC']//following-sibling::td[text()='ACTIVE']//preceding-sibling::td[2])[1]")
	@CacheLookup
	private WebElement fetchCustomerHashID;

	@FindBy(xpath = "(//td[text()='MIN_KYC']//following-sibling::td[text()='ACTIVE']//preceding-sibling::td[2])[1]")
	@CacheLookup
	private WebElement fetchMinCustomerHashID;

	@FindBy(xpath = "(//td[text()='MIN_KYC']//following-sibling::td[text()='ACTIVE']//preceding-sibling::td[2])[1]")
	@CacheLookup
	private WebElement fetchMinKYCCustomerHashID;

	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement txtMobileNum;

	private String failureReason = "//*[text()='%s']//following-sibling::td[6]";

	private By successCount1 = By.xpath("(//*[contains(@class,'success')])[1]");

	private By failureCount1 = By.xpath("(//*[contains(@class,'danger')])[1]");

	private By totalCount1 = By.xpath("(//td//button[contains(@class,'primary')])[1]");

//	private By drpKitNumberOptions = By.xpath("//ul[contains(@id,'kitNumberId')]//li");

	private By fetchKitNo = By.xpath("(//td[text()='ASSIGNED']//preceding-sibling::td[5])[1]");

	private By fetchKitNoBulk = By.xpath(
			"(//td[text()='ASSIGNED']//preceding-sibling::td[text()='-']//preceding-sibling::td[text()='-']//preceding-sibling::td[3])[1]");

	private String drpKitNoValue = "//li[contains(@id,'select2-kitNumberId') and contains(text(),'%s')]";

	String fetchKitNumber = "(//td[text()='%s']//following-sibling::td)[1]";

	private String unassignedStatus = "//td[text()='%s']//following-sibling::td[text()='UNASSIGNED']";

	private String assignedStatus = "//td[text()='%s']//following-sibling::td[text()='ASSIGNED']";

	private String activatedStatus = "//td[text()='%s']//following-sibling::td[text()='ACTIVATED']";

	private By msgKitAssignSuccessForSingleAssign = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[text()='KIT assigned successfully.']");

	private By msgKitAssignSuccessForBulkAssign = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Bulk KIT Assign file uploaded successfully.']");

	private By msgKitAssignFailureForBulkAssign = By
			.xpath("//img[contains(@src,'x')]//following-sibling::div//*[text()='Unable to Assign KIT.']");

	private By msgCardIssueSuccess = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[text()='Card Created Successfully']");

//	public String customerMobile = "//*[text()='%s']";

	public String customer = "(//*[text()='%s'])[1]";

	public String fetchBusinessType = "//td[text()='%s']//following-sibling::td[2]";

	public String fetchCardType = "//td[text()='%s']//following-sibling::td[6]";

	private String success = "(//td[text()='%s']//following-sibling::td//button[contains(@class,'success')])[1]";
//	private String verifyKitStatus = "";

	private By msgCardIssuanceKYC = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[text()='Please upgrade to FULL_KYC to receive Zokudo GPR card!']");

	private By msgCardIssuanceMultiCards = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[text()='customer is not allowed to have multiple GPR cards!']");

	public WebDriver getDriver() {
		return this.driver;
	}

	private String drpCustNoValue = "//li[contains(@id,'select2-customerHashId') and contains(text(),'%s')]";

	public void selectClient(String client) {
		try {
			dHelper.SelectUsingVisibleValue(drpClient, client);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("clientId")));
			s.selectByVisibleText(client);
		}
	}

	public void selectProgram(String program) {
		try {
			dHelper.SelectUsingVisibleValue(drpProgram, program);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("programId")));
			s.selectByVisibleText(program);
		}
	}

	public void enterBusinessType(String businessType) {
		tHelper.sendKeys(txtBusinessType, businessType);
	}

	public void selectType(String type) {
		try {
			dHelper.SelectUsingVisibleValue(drpType, type);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("uploadTypeId")));
			s.selectByVisibleText(type);
		}
	}

	public void selectCardType(String cardType) {
		try {
			dHelper.SelectUsingVisibleValue(drpCardType, cardType);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("cardTypeId")));
			s.selectByVisibleText(cardType);
		}
	}

	public void selectKitNumber(String kitNumber) {
		try {
			bHelper.click(drpKitNumber);
			log.info(drpKitNumber);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'kitNumberId')]")).click();
		}
		try {
			tHelper.sendKeys(txtKitNo, kitNumber);
			log.info(txtKitNo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//input[contains(@class,'select2-search')]")).sendKeys(kitNumber);
		}
		try {
			bHelper.click(By.xpath(String.format(drpKitNoValue, kitNumber)));
			log.info(By.xpath(String.format(drpKitNoValue, kitNumber)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(drpKitNoValue, kitNumber))).click();
		}
	}

	public void selectExpiryDate() {
		bHelper.click(datePicker);
		new DateTimeHelper();
		bHelper.click(By.xpath("//*[text()='" + DateTimeHelper.getCurrentDate("dd") + "']"));
	}

	public void clickOnSubmitButton() {
		try {
			bHelper.click(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitBtnId")).click();
		}
	}

	public void uploadSheet(String filePath) {
		try {
			tHelper.sendKeys(fileUploadKit, filePath);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitSheetId")).sendKeys(filePath);
		}
	}

	public String verifyKitNoIsUnassigned(String programName) {
		String kit = null;
		clickOnSearchButton();
		selectProgram(programName);
		try {
			dHelper.SelectUsingVisibleValue(drpCardStatus, "UNASSIGNED");
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("cardStatus")));
			s.selectByVisibleText("UNASSIGNED");
		}
		clickOnSubmitSearchButton();
		wHelper.hardWait(3000);
		try {
			kit = tHelper.getText(By.xpath(String.format(fetchKitNumber, programName)));
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(By.xpath(String.format(fetchKitNumber, programName))).getText();
		}
		return kit;
	}

	public void verifyKitAssignSuccessMessageForSingleAssign() {
		boolean result = gHelper.IsElementPresentQuick(msgKitAssignSuccessForSingleAssign);
		if (!result)
			log.error(msgKitAssignSuccessForSingleAssign);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyKitAssignSuccessMessageForBulkAssign() {
		boolean result = gHelper.IsElementPresentQuick(msgKitAssignSuccessForBulkAssign);
		if (!result)
			log.error(msgKitAssignSuccessForBulkAssign);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void searchForKitNo(String kitNumber) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitNumberInSearch(kitNumber);
		s = s + "Enter \"Kit Number\" : " + kitNumber + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Search\" button";
		InitializeWebDriver.scenario.write(s);
	}

	public void clickOnSubmitSearchButton() {
		try {
			bHelper.click(btnSearchSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
	}

	public void verifyKitIsAssigned(String kitNumber) {
//		clickOnSearchButton();
//		enterKitNumberInSearch(kitNumber);
//		clickOnSubmitSearchButton();
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(assignedStatus, kitNumber)));
		if (!result)
			log.error(By.xpath(String.format(assignedStatus, kitNumber)));
		Assert.assertTrue(result);
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

	public void enterKitNumberInSearch(String kitNumber) {
		try {
			tHelper.sendKeys(txtSearchKitNo, kitNumber);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitNo")).sendKeys(kitNumber);
		}
	}

	public void checkStatusIsAssigned(String kitNumber) {
		clickOnSearchButton();
		enterKitNumberInSearch(kitNumber);
		clickOnSubmitSearchButton();
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(assignedStatus, kitNumber)));
		if (!result)
			log.error(By.xpath(String.format(assignedStatus, kitNumber)));
		Assert.assertTrue(result);
	}

	public void searchWithProgram(String programName) {
		selectProgram(programName);
		String s = "Select " + programName + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifyUpdatedDetails() {
		String usedKit = null, availKit = null, totalKit = null, s = "";
		try {
			usedKit = tHelper.getText(kitUsed);
		} catch (Exception e) {
			usedKit = ObjectRepo.driver.findElement(By.xpath("//span[contains(@class,'danger')]")).getText();
		}
		s = "Get \"Used Kits\" : " + usedKit + "\n";
		try {
			availKit = tHelper.getText(kitAvail);
		} catch (Exception e) {
			availKit = ObjectRepo.driver.findElement(By.xpath("//span[contains(@class,'success')]")).getText();
		}
		s = s + "Get \"Avail Kits\" : " + availKit + "\n";
		try {
			totalKit = tHelper.getText(totalKitCount);
		} catch (Exception e) {
			totalKit = ObjectRepo.driver.findElement(By.xpath("//span[contains(@class,'info')]")).getText();
		}
		s = s + "Get \"Total Kits\" : " + totalKit;
		InitializeWebDriver.scenario.write(s);
		if (usedKit.isEmpty())
			Assert.assertTrue(false);
		if (availKit.isEmpty())
			Assert.assertTrue(false);
		if (totalKit.isEmpty())
			Assert.assertTrue(false);
	}

	public void verifyKitStatusIsAssigned(String kitNumber) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(assignedStatus, kitNumber)));
		if (!result)
			log.error(By.xpath(String.format(assignedStatus, kitNumber)));
		Assert.assertTrue(result);
	}

	public String verifyKitNoIsAssigned(String programName) {
		String kit = null;
		clickOnSearchButton();
		selectProgram(programName);
		try {
			dHelper.SelectUsingVisibleValue(drpCardStatus, "ASSIGNED");
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("cardStatus")));
			s.deselectByVisibleText("ASSIGNED");
		}
		clickOnSubmitSearchButton();
		wHelper.hardWait(3000);
		try {
			kit = tHelper.getText(By.xpath(String.format(fetchKitNumber, programName)));
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(By.xpath(String.format(fetchKitNumber, programName))).getText();
		}
		return kit;
	}

	public void verifyKitAssignFailureMessageForBulkAssign() {
		boolean result = gHelper.IsElementPresentQuick(msgKitAssignFailureForBulkAssign);
		if (!result)
			log.error(msgKitAssignFailureForBulkAssign);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void selectLast30Day() {
		clickOnDatePicker();
		try {
			bHelper.click(last30Days);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//li[text()='Last 30 Days']")).click();
		}
		clickOnFilterSearch();
	}

	public void selectThisMonth() {
		clickOnDatePicker();
		try {
			bHelper.click(last30Days);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//li[text()='Last 30 Days']")).click();
		}
		clickOnFilterSearch();
	}

	public void clickOnDatePicker() {
		try {
			bHelper.click(reportrange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("reportrange")).click();
		}
	}

	public void clickOnFilterSearch() {
		try {
			bHelper.click(btnFilter);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Filter']")).click();
		}
	}

	public void selectKitStatusAssigned() {
		try {
			dHelper.SelectUsingVisibleValue(drpKitStatus, "Assigned");
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("kitStatus")));
			s.selectByVisibleText("Assigned");
		}
	}

	public void selectKitStatusActivated() {
		try {
			dHelper.SelectUsingVisibleValue(drpKitStatus, "Activated");
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("kitStatus")));
			s.selectByVisibleText("Activated");
		}
	}

	public void selectProgramSearch(String programName) {
		try {
			dHelper.SelectUsingVisibleValue(drpProgramHashId, programName);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
			s.selectByVisibleText(programName);
		}
	}

	public String verifyKitNoIsAssignedForCardIssue(String programName) {
		clickOnSearchButton();
		selectLast30Day();
		selectProgramSearch(programName);
		dHelper.SelectUsingVisibleValue(drpKitStatus, "Assigned");
		clickOnSubmitSearchButton();
		String kit;
		wHelper.hardWait(3000);
		try {
			kit = tHelper.getText(fetchKitNo);
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(fetchKitNo).getText();
		}
		return kit;
	}

	public void selectKitNo(String kitNumber) {
		try {
			dHelper.SelectUsingValue(drpKitNo, kitNumber);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("kitNumber")));
			s.selectByValue(kitNumber);
		}
	}

	public void clickOnCardIssuedSubmitButton() {
		try {
			bHelper.click(btnCardIssueSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("createCardRequest")).click();
		}
	}

	public void verifyCardIssuedSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardIssueSuccess);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot(InitializeWebDriver.scenario.getName() + "_Message");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgCardIssueSuccess);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void searchForCustomerDetails(String kitNumber) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitNumberInSearch(kitNumber);
		s = s + "Enter \"Kit Number\" : " + kitNumber + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifySearchedCustomerDetails(String customerMobileNo) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(customer, customerMobileNo)));
		if (!result)
			log.error(By.xpath(String.format(customer, customerMobileNo)));
		Assert.assertTrue(result);
	}

	public String verifyAssignedKitNoForDistributor() {
		clickOnSearchButton();
		selectKitStatusAssigned();
		clickOnSubmitSearchButton();
		String kit;
		wHelper.hardWait(3000);
		try {
			kit = tHelper.getText(fetchKitNo);
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(fetchKitNo).getText();
		}
		return kit;
	}

	public void selectDistributor(String Distributor) {
		try {
			dHelper.SelectUsingVisibleValue(drpDistributor, Distributor);
			log.info(drpDistributor);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("distributorId")));
			s.selectByVisibleText(Distributor);
		}
	}

	public void verifyStatusOfKitNumberAssignedToDistributor(String kitNumber, String companyName) {
//		companyName="Aparna EnterPrises";
		clickOnSearchButton();
		enterKitNumberInSearch(kitNumber);
		clickOnSubmitSearchButton();
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(assignedStatus, companyName)));
		if (!result)
			log.error(By.xpath(String.format(assignedStatus, companyName)));
		Assert.assertTrue(result);
	}

	public void verifyStatusOfKitNumberAssignedToDistributorInAdminUser(String kitNumber) {
		clickOnSearchButton();
		enterKitNumberInSearch(kitNumber);
		clickOnSubmitSearchButton();
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(assignedStatus, kitNumber)));
		if (!result)
			log.error(By.xpath(String.format(assignedStatus, kitNumber)));
		Assert.assertTrue(result);
	}

	public void selectRetailer(String Retailer) {
//		Retailer = "Aparna EnterPrises";
		try {
			dHelper.SelectUsingVisibleValue(drpRetailer, Retailer);
			log.info(drpRetailer);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("retailerId")));
			s.selectByVisibleText(Retailer);
		}
	}

	public void clickOnCardDetailsDownload() {
		try {
			bHelper.click(btnCardDetails);
			log.info(btnCardDetails);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("cardDetailsBtn")).click();
		}
	}

	public void searchWithIssuanceDate() {
		clickOnDatePicker();
		String s = "Click on date picker\n";
		try {
			bHelper.click(last30Days);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//li[text()='Last 30 Days']")).click();
		}
		s = s + "Click on last 30 days";
		InitializeWebDriver.scenario.write(s);
	}

	public String verifyAssignedKitNoForDistributorForBulk() {
		clickOnSearchButton();
		selectKitStatusAssigned();
		clickOnSubmitSearchButton();
		String kit;
		wHelper.hardWait(3000);
		try {
			kit = tHelper.getText(fetchKitNoBulk);
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(fetchKitNoBulk).getText();
		}
		return kit;
	}

	public void verifyKitStatusNotChanged(String kitNumber) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitNumberInSearch(kitNumber);
		s = s + "Enter \"Kit Number\" : " + kitNumber + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		boolean status = gHelper.IsElementPresentQuick(By.xpath(String.format(customer, kitNumber)));
		Assert.assertTrue(status);
		s = s + "Verified that kit status is not changed";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifyKitNotListed(String kitNumber) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitNumberInSearch(kitNumber);
		s = s + "Enter \"Kit Number\" : " + kitNumber + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		boolean status = gHelper.IsElementPresentQuick(By.xpath(String.format(customer, kitNumber)));
		Assert.assertFalse(status);
		s = s + "Verified that kit not present";
		InitializeWebDriver.scenario.write(s);
	}

	public String fetchActiveCustomer() {
		String number = "";
		clickOnSearchButton();
//		selectKYC("FULL_KYC");
//		selectStatus("Active");
		clickOnSubmitSearchButton();
		try {
			number = tHelper.getText(fetchActiveCustomer);
		} catch (Exception e) {
			number = ObjectRepo.driver.findElement(By.xpath("(//td[7])[1]")).getText();
		}
		return number;
	}

	public String fetchActiveMinKYCCustomer() {
		String number = "";
		clickOnSearchButton();
		selectKYC("MIN_KYC");
		selectStatus("Active");
		clickOnSubmitSearchButton();
		try {
			number = tHelper.getText(fetchActiveMinKYCCustomer);
		} catch (Exception e) {
			number = ObjectRepo.driver.findElement(By.xpath(
					"(//td[text()='ACTIVE']//preceding-sibling::td[text()='MIN_KYC']//preceding-sibling::td[6])[1]"))
					.getText();
		}
		return number;
	}

	public void selectKYC(String KYC) {
		try {
			dHelper.SelectUsingVisibleValue(drpKYCType, KYC);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("statusId")));
			s.selectByVisibleText(KYC);
		}
	}

	public void selectStatus(String status) {
		try {
			dHelper.SelectUsingVisibleValue(drpStatus, status);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("statusId2")));
			s.selectByVisibleText(status);
		}
	}

	public void verifyUploadedCustomerDetails() {
		int fcount = 0, scount = 0, tcount = 0;
		String s = "";
		wHelper.hardWait(5000);
		try {
			fcount = Integer.parseInt(tHelper.getText(failureCount1));
		} catch (Exception e) {
			fcount = Integer
					.parseInt(ObjectRepo.driver.findElement(By.xpath("(//*[contains(@class,'danger')])[1]")).getText());
		}
		s = "Fail count is " + fcount + "\n";
		try {
			scount = Integer.parseInt(tHelper.getText(successCount1));
		} catch (Exception e) {
			scount = Integer.parseInt(
					ObjectRepo.driver.findElement(By.xpath("(//*[contains(@class,'success')])[1]")).getText());
		}
		s = s + "Success count is " + scount + "\n";
		try {
			tcount = Integer.parseInt(tHelper.getText(totalCount1));
		} catch (Exception e) {
			tcount = Integer.parseInt(
					ObjectRepo.driver.findElement(By.xpath("(//td//button[contains(@class,'primary')])[1]")).getText());
		}
		s = s + "Total count is " + tcount;
		if (tcount != fcount + scount)
			Assert.assertTrue(false);
		InitializeWebDriver.scenario.write(s);

	}

	public void searchForCustomer() {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		selectLast30Day();
		s = s + "Click on last 30 days";
		InitializeWebDriver.scenario.write(s);
	}

	public void searchForAddedCustomer(String customerMobileNo) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		try {
			tHelper.sendKeys(txtSearchMobileNum, customerMobileNo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobile")).sendKeys(customerMobileNo);
		}
		s = s + "Enter \"Mobile Number\" : " + customerMobileNo + "\n";
		clickOnFilterSearch();
		s = s + "Click on \"Submit\" button\n";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifyCustomerAdded(String customerMobileNo) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(customer, customerMobileNo)));
		if (!result)
			log.error(By.xpath(String.format(customer, customerMobileNo)));
		Assert.assertTrue(result);
	}

	public void enterMobileNum(String MobileNum) {
		try {
			tHelper.sendKeys(txtMobileNum, MobileNum);
			log.info(txtMobileNum);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobileNo")).sendKeys(MobileNum);
		}
	}

	public String fetchCustomerHashId(String customerMobileNo) {
		String id = "";
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterMobileNum(customerMobileNo);
		s = s + "Enter \"Mobile Number\" : " + customerMobileNo + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		try {
			id = tHelper.getText(fetchCustomerHashID);
		} catch (Exception e) {
			id = ObjectRepo.driver.findElement(By.xpath(
					"(//td[text()='FULL_KYC']//following-sibling::td[text()='ACTIVE']//preceding-sibling::td[2])[1]"))
					.getText();
		}
		s = s + "Customer hash id is " + id;
		InitializeWebDriver.scenario.write(s);
		return id;
	}

	public String fetchKitDetails(String kitNumber) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitNumberInSearch(kitNumber);
		s = s + "Enter \"Kit Number\" : " + kitNumber + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		String businessType, cardType;
		try {
			businessType = tHelper.getText(By.xpath(String.format(fetchBusinessType, kitNumber)));
		} catch (Exception e) {
			businessType = ObjectRepo.driver.findElement(By.xpath(String.format(fetchBusinessType, kitNumber)))
					.getText();
		}
		s = s + "business type is " + businessType;
		try {
			cardType = tHelper.getText(By.xpath(String.format(fetchCardType, kitNumber)));
		} catch (Exception e) {
			cardType = ObjectRepo.driver.findElement(By.xpath(String.format(fetchCardType, kitNumber))).getText();
		}
		s = s + "Card type is " + cardType;
		InitializeWebDriver.scenario.write(s);
		gHelper.reloadPage();
		return businessType + "#" + cardType;
	}

	public void serachCardDetails() {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		clickOnDatePicker();
		s = s + "Click on date picker\n";
		try {
			bHelper.click(thisMonth);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//li[text()='This Month']")).click();
		}
		s = s + "Click on this month\n";
		clickOnFilterSearch();
		s = s + "Click on \"Submit\" button\n";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifyCardRecord(String string) {
		int i = 0;
		try {
			i = Integer.parseInt(tHelper.getText(By.xpath(String.format(success, string))));
		} catch (Exception e) {
			i = Integer.parseInt(ObjectRepo.driver.findElement(By.xpath(String.format(success, string))).getText());
		}
		if (i == 0)
			Assert.assertTrue(false);
	}

	public void verifyStatusOfKitNumberActivated(String kitNumber) {
		clickOnSearchButton();
		enterKitNumberInSearch(kitNumber);
		clickOnSubmitSearchButton();
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(activatedStatus, kitNumber)));
		if (!result)
			log.error(By.xpath(String.format(activatedStatus, kitNumber)));
		Assert.assertTrue(result);
	}

	public String fetchFullKYCCustomerHashId(String customerMobileNo) {
		return null;
	}

	public void verifyCardIssuedKYCUpgradeMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardIssuanceKYC);
		if (!result)
			log.error(msgCardIssuanceKYC);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void searchCardDetailsInBulkCardReport(String kitNumber) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		try {
			tHelper.sendKeys(drpKitNo, kitNumber);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitNumber")).sendKeys(kitNumber);
		}
		s = s + "Select " + kitNumber + "\n";
		clickOnFilterSearch();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);

	}

	public void verifyCardUploadResult(String kitNumber) {
		String result;
		try {
			result = tHelper.getText(By.xpath(String.format(failureReason, kitNumber)));
		} catch (Exception e) {
			result = ObjectRepo.driver.findElement(By.xpath(String.format(failureReason, kitNumber))).getText();
		}
		InitializeWebDriver.scenario.write("Failure reason is " + result);
		if (!result.equalsIgnoreCase("null"))
			Assert.assertTrue(false);
	}

	public String verifyCardUpload(String kitNumber) {
		String result;
		try {
			result = tHelper.getText(By.xpath(String.format(failureReason, kitNumber)));
		} catch (Exception e) {
			result = ObjectRepo.driver.findElement(By.xpath(String.format(failureReason, kitNumber))).getText();
		}
		InitializeWebDriver.scenario.write("Failure reason is " + result);
		return result;
	}

	public void verifyKitStatusIsUnassigned(String kitNumber) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(unassignedStatus, kitNumber)));
		if (!result)
			log.error(By.xpath(String.format(unassignedStatus, kitNumber)));
		Assert.assertTrue(result);
	}

	public String fetchMinKYCCustomerHashId(String customerMobileNo) {
		String id = "";
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterMobileNum(customerMobileNo);
		s = s + "Enter \"Mobile Number\" : " + customerMobileNo + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		try {
			id = tHelper.getText(fetchMinKYCCustomerHashID);
		} catch (Exception e) {
			id = ObjectRepo.driver.findElement(By.xpath(
					"(//td[text()='MIN_KYC']//following-sibling::td[text()='ACTIVE']//preceding-sibling::td[2])[1]"))
					.getText();
		}
		s = s + "Customer hash id is " + id;
		InitializeWebDriver.scenario.write(s);
		return id;
	}

	public String fetchCustomerHashIdForGCProgram(String customerMobileNo) {
		String id = "";
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterMobileNum(customerMobileNo);
		s = s + "Enter \"Mobile Number\" : " + customerMobileNo + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		try {
			id = tHelper.getText(fetchMinCustomerHashID);
		} catch (Exception e) {
			id = ObjectRepo.driver.findElement(By.xpath(
					"(//td[text()='MIN_KYC']//following-sibling::td[text()='ACTIVE']//preceding-sibling::td[2])[1]"))
					.getText();
		}
		s = s + "Customer hash id is " + id;
		InitializeWebDriver.scenario.write(s);
		return id;
	}

	public void verifyCardRecordIsFailed(String string) {

		int i = 0;
		try {
			i = Integer.parseInt(tHelper.getText(By.xpath(String.format(success, string))));
		} catch (Exception e) {
			i = Integer.parseInt(ObjectRepo.driver.findElement(By.xpath(String.format(success, string))).getText());
		}
		if (i != 0)
			Assert.assertTrue(false);

	}

	public void verifyCardIssuedMultipleGPRCardNotAllowedMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardIssuanceMultiCards);
		if (!result)
			log.error(msgCardIssuanceMultiCards);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifySearchedCustomerDetailsNotFound(String kitNumber) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(customer, kitNumber)));
		if (result)
			log.error(By.xpath(String.format(customer, kitNumber)));
		Assert.assertFalse(result);
	}

	public void selectCustomerMobile(String customerMobileNo) {
		try {
			bHelper.click(drpCustomerNum);
			log.info(drpCustomerNum);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'customerHashId')]")).click();
		}
		try {
			tHelper.sendKeys(txtKitNo, customerMobileNo);
			log.info(customerMobileNo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//input[contains(@class,'select2-search')]"))
					.sendKeys(customerMobileNo);
		}
		try {
			bHelper.click(By.xpath(String.format(drpCustNoValue, customerMobileNo)));
			log.info(By.xpath(String.format(drpCustNoValue, customerMobileNo)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(drpCustNoValue, customerMobileNo))).click();
		}
	}

}
