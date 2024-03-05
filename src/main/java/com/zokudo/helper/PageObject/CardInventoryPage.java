package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.DropDown.DropDownHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class CardInventoryPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(CardInventoryPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;
	private DropDownHelper dHelper;
	private WaitHelper wHelper;

	public CardInventoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
		dHelper = new DropDownHelper(driver);
		wHelper = new WaitHelper(driver, ObjectRepo.reader);
	}

	private By drpbusiness = By.id("businessId");

	@FindBy(id = "programId")
	@CacheLookup
	private WebElement drpProgram;

	@FindBy(id = "bulkFileId")
	@CacheLookup
	private WebElement bulkfileupload;

	@FindBy(id = "uploadDoc")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(id = "kitNo")
	@CacheLookup
	private WebElement txtSearchKitNo;

//	private String status = "//*[text()='%s']//following-sibling::td[text()='UNASSIGNED']";
	private By status = By.xpath("(//td[text()='UNASSIGNED'])[1]");

	private By FailReason = By.xpath("(//td[contains(text(),'Card Detail')])[1]");

	private By FailReason2 = By.xpath("(//td[contains(text(),'null')])[1]");

	private By StatusFailure = By.xpath("(//td[(text()='FAILURE')])[1]");

	private By StatusApproved = By.xpath("(//td[(text()='APPROVED')])[1]");

	private By successCount1 = By.xpath("(//*[contains(@class,'success')])[1]");

	private By failureCount1 = By.xpath("(//*[contains(@class,'danger')])[1]");

	private By totalCount1 = By.xpath("(//*[contains(@class,'primary')])[1]");

	@FindBy(id = "inventoryKitList")
	@CacheLookup
	private WebElement btndownload;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(id = "reportrange")
	@CacheLookup
	private WebElement btnreportRange;

	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	private WebElement dateRange;

	@FindBy(xpath = "//button[contains(text(),'Filter')]")
	@CacheLookup
	private WebElement btnFilter;

	@FindBy(id = "fileName")
	@CacheLookup
	private WebElement fileName;

	@FindBy(id = "kitNumber")
	@CacheLookup
	private WebElement kitNumber;

	@FindBy(id = "programHashId")
	@CacheLookup
	private WebElement programHashId;

	@FindBy(xpath = "//a[text()='Download Format ']")
	@CacheLookup
	private WebElement downloadFormat;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void selectProgram(String program) {
		try {
			dHelper.SelectUsingVisibleValue(drpProgram, program);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("programId")));
			s.selectByVisibleText(program);
		}
		InitializeWebDriver.scenario.write("Select " + program);
	}

	public void verifyBusinessProgram() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(drpbusiness));
	}

	public void clickonUploadFile(String filePath) {
		try {
			tHelper.sendKeys(bulkfileupload, filePath);
			log.info(bulkfileupload);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("bulkFileId")).click();
		}
	}

	public void clickOnBulkUploadSubmit() {
		try {
			bHelper.click(btnSubmit);
			log.info(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("uploadDoc")).click();
		}
	}

	public void verifyStatusUnAssigned(String kitNum) {
		boolean result = gHelper.IsElementPresentQuick(status);
//		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(status, kitNum)));
		if (!result)
			log.error(status);
		Assert.assertTrue(result);
	}

	public void clickonDownload() {
		try {
			bHelper.click(btndownload);
			log.info(btndownload);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("inventoryKitList")).click();
		}
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

	public void SelectDateRange() {
		try {
			bHelper.click(btnreportRange);
			log.info(btnreportRange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("reportrange")).click();
		}
		try {
			bHelper.click(dateRange);
			log.info(dateRange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//li[contains(text(),'Last 7 Days')]")).click();
		}
	}

	public void clickOnFilterButton() {
		try {
			bHelper.click(btnFilter);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//button[contains(text(),'Filter')]")).click();
		}
	}

	public void verifyUpdatedDetails() {
		String fcount = null, scount = null, tcount = null;
		wHelper.hardWait(5000);
		try {
			fcount = tHelper.getText(failureCount1);
		} catch (Exception e) {
			fcount = ObjectRepo.driver.findElement(By.xpath("(//*[contains(@class,'danger')])[1]")).getText();
		}
		String s = "Failure count : " + fcount + "\n";
		try {
			scount = tHelper.getText(successCount1);
		} catch (Exception e) {
			scount = ObjectRepo.driver.findElement(By.xpath("(//*[contains(@class,'success')])[1]")).getText();
		}
		s = s + "Success count : " + scount + "\n";
		try {
			tcount = tHelper.getText(totalCount1);
		} catch (Exception e) {
			tcount = ObjectRepo.driver.findElement(By.xpath("(//*[contains(@class,'primary')])[1]")).getText();
		}
		s = s + "Total count : " + tcount;
		InitializeWebDriver.scenario.write(s);
		if (fcount.isEmpty())
			Assert.assertTrue(false);
		if (scount.isEmpty())
			Assert.assertTrue(false);
		if (tcount.isEmpty())
			Assert.assertTrue(false);

	}

	public void enterFileName(String filename) {
		try {
			tHelper.sendKeys(fileName, filename);
			log.info(fileName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("fileName")).sendKeys(filename);
		}
	}

	public void enterKitNumber(String kitNum) {
		try {
			tHelper.sendKeys(kitNumber, kitNum);
			log.info(kitNumber);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitNumber")).sendKeys(kitNum);
		}
	}

	public void selectProgramName(String program) {
		try {
			dHelper.SelectUsingVisibleValue(programHashId, program);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
			s.selectByVisibleText(program);
		}
	}

	public void verifyStatusApprove(String kitNum) {
		boolean result = gHelper.IsElementPresentQuick(StatusApproved);
		if (!result)
			log.error(StatusApproved);
		Assert.assertTrue(result);
	}

	public void verifyStatusFail() {
		boolean result = gHelper.IsElementPresentQuick(StatusFailure);
		if (!result)
			log.error(StatusFailure);
		Assert.assertTrue(result);
	}

	public void verifyFailureReasonField() {
		boolean result = gHelper.IsElementPresentQuick(FailReason);
		if (!result)
			log.error(FailReason);
		Assert.assertTrue(result);
	}

	public void verifyFailureReasonField1() {
		boolean result = gHelper.IsElementPresentQuick(FailReason2);
		if (!result)
			log.error(FailReason2);
		Assert.assertTrue(result);
	}

	public void verifyUserCanNotAbleToViewProgram(String kitNum) {
		boolean result = gHelper.IsElementPresentQuick(status);
//		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(status, kitNum)));
		if (result)
			log.error(status);
		Assert.assertFalse(result);
	}

	public void enterKitNumberInSearch(String kitNumber) {
		try {
			tHelper.sendKeys(txtSearchKitNo, kitNumber);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitNo")).sendKeys(kitNumber);
		}
	}

	public void verifyKitStatusUnAssigned(String kitNum) {
		clickOnSearchButton();
		enterKitNumberInSearch(kitNum);
	}

	public void downloadFormat() {
		try {
			bHelper.click(downloadFormat);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[text()='Download Format ']")).click();
		}
		gHelper.handleDownloadBar();
	}
}
