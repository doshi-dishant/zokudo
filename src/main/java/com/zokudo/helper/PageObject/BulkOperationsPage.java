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
import com.zokudo.framework.settings.ObjectRepo;

public class BulkOperationsPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(BulkOperationsPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;
	private DropDownHelper dHelper;
	private KitAssignPage kP;

	public BulkOperationsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
		dHelper = new DropDownHelper(driver);
		kP = new KitAssignPage(driver);
	}

	/** Web Elements */

	@FindBy(id = "bulkFileId")
	@CacheLookup
	private WebElement fileBulkFileUpload;

	@FindBy(id = "operationId")
	@CacheLookup
	private WebElement drpOperationId;

	@FindBy(id = "uploadDoc")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(id = "reportrange")
	@CacheLookup
	private WebElement reportrange;

	@FindBy(xpath = "//*[text()='This Month']")
	@CacheLookup
	private WebElement thisMonth;

	@FindBy(xpath = "//a[text()='Download Card Creation Format']")
	@CacheLookup
	private WebElement downloadCardCreationFormat;

	@FindBy(xpath = "//a[text()='Download Registration Format']")
	@CacheLookup
	private WebElement downloadRegistrationFormat;

	@FindBy(xpath = "//a[text()='Download Load Card Format']")
	@CacheLookup
	private WebElement downloadLoadCardFormat;

	By uploadSuccess = By.xpath("//*[text()='Processed. Kindly check reports']");

	private String danger = "(//td[text()='%s']//following-sibling::td//button[contains(@class,'danger')])[1]";

	private String success = "(//td[text()='%s']//following-sibling::td//button[contains(@class,'success')])[1]";

//	private By fetchKitNumber = By.xpath("(//td[text()='ASSIGNED']//preceding-sibling::td[5])[last()]");

//	private By fetchBusinessId = By.xpath("(//td[text()='ASSIGNED']//preceding-sibling::td[3])[last()]");

	private String fetchBusinessId = "//td[text()='%s']//following-sibling::td[2]";

//	private By fetchCardType = By.xpath("(//td[text()='ASSIGNED']//following-sibling::td[1])[last()]");

	private String fetchCardType = "//td[text()='%s']//following-sibling::td[6]";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void uploadBulkFile(String path) {
		try {
			tHelper.sendKeys(fileBulkFileUpload, path);
			log.info(fileBulkFileUpload);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("bulkFileId")).sendKeys(path);
		}
	}

	public void selectOperationType(String string) {
		try {
			dHelper.SelectUsingVisibleValue(drpOperationId, string);
			log.info(drpOperationId);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("operationId")));
			s.selectByVisibleText(string);
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

	public void verifySuccessMessage() {
		boolean status = false;
		try {
			status = gHelper.IsElementPresentQuick(uploadSuccess);
		} catch (Exception e) {
			status = ObjectRepo.driver.findElement(By.xpath("//*[text()='Processed. Kindly check reports']"))
					.isDisplayed();
		}
		Assert.assertTrue(status);
	}

	public void search() {
		try {
			bHelper.click(btnSearch);
			log.info(btnSearch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
		}
		String s = "Click on \"Search\" button\n";
		try {
			bHelper.click(reportrange);
			log.info(reportrange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("reportrange")).click();
		}
		s = s + "Click on report range\n";
		try {
			bHelper.click(thisMonth);
			log.info(thisMonth);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[text()='This Month']")).click();
		}
		s = s + "Click on this month";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifySuccess(String string) {
		int i = 0;
		try {
			i = Integer.parseInt(tHelper.getText(By.xpath(String.format(success, string))));
		} catch (Exception e) {
			i = Integer.parseInt(ObjectRepo.driver.findElement(By.xpath(String.format(success, string))).getText());
		}
		InitializeWebDriver.scenario.write("Success count is " + i);
		if (i == 0)
			Assert.assertTrue(false);
	}

	public void verifyFailure(String string) {
		int i = 0;
		try {
			i = Integer.parseInt(tHelper.getText(By.xpath(String.format(danger, string))));
		} catch (Exception e) {
			i = Integer.parseInt(ObjectRepo.driver.findElement(By.xpath(String.format(danger, string))).getText());
		}
		InitializeWebDriver.scenario.write("Failure count is " + i);
		if (i == 0)
			Assert.assertTrue(false);
	}

	public String searchAssignKitDetails(String kitNum) {
		String cardType = "", businessType = "";
		kP.clickOnSearchButton();
//		kP.selectProgram(programName);
//		kP.selectKitStatusAssigned();
		kP.enterKitNumberInSearch(kitNum);
		kP.clickOnSubmitSearchButton();
//		wHelper.hardWait(3000);
//		try {
//			kit = tHelper.getText(fetchKitNumber);
//		} catch (Exception e) {
//			kit = ObjectRepo.driver.findElement(fetchKitNumber).getText();
//		}
		try {
			businessType = tHelper.getText(By.xpath(String.format(fetchBusinessId, kitNum)));
		} catch (Exception e) {
			businessType = ObjectRepo.driver.findElement(By.xpath(String.format(fetchBusinessId, kitNum))).getText();
		}
		try {
			cardType = tHelper.getText(By.xpath(String.format(fetchCardType, kitNum)));
		} catch (Exception e) {
			cardType = ObjectRepo.driver.findElement(By.xpath(String.format(fetchCardType, kitNum))).getText();
		}
		return businessType + "#" + cardType;
	}

	public void downloadCardCreationFormat() {
		try {
			bHelper.click(downloadCardCreationFormat);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[text()='Download Card Creation Format']")).click();
		}   
		gHelper.handleDownloadBar();
	}

	public void downloadLoadCardFormat() {
		try {
			bHelper.click(downloadLoadCardFormat);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[text()='Download Load Card Format']")).click();
		}
		gHelper.handleDownloadBar();
	}

	public void downloadRegistrationFormat() {
		try {
			bHelper.click(downloadRegistrationFormat);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[text()='Download Registration Format']")).click();
		}
		gHelper.handleDownloadBar();
	}

}
