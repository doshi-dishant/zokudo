package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.DropDown.DropDownHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class CardTransactionReportPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(CardTransactionReportPage.class);
	private ButtonHelper bHelper;
	private GenericHelper gHelper;
	private DropDownHelper dHelper;
	private TextBoxHelper tHelper;

	public CardTransactionReportPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		gHelper = new GenericHelper(driver);
		dHelper = new DropDownHelper(driver);
		tHelper = new TextBoxHelper(driver);
	}

	/** Web Elements */

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(id = "transactionDownload")
	@CacheLookup
	private WebElement btnDownload;

	@FindBy(id = "kitNumber")
	@CacheLookup
	private WebElement kitNumber;

	@FindBy(xpath = "(//td)[7]")
	@CacheLookup
	private WebElement status;

	@FindBy(xpath = "(//td)[5]")
	@CacheLookup
	private WebElement processorStatus;

	@FindBy(id = "reportrange")
	@CacheLookup
	private WebElement reportrange;

	@FindBy(xpath = "//*[text()='This Month']")
	@CacheLookup
	private WebElement thisMonth;

	@FindBy(id = "cardStatus")
	@CacheLookup
	private WebElement drpStatus;

	@FindBy(xpath = "//*[text()='Search']")
	@CacheLookup
	private WebElement btnFilterSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Filter']")
	@CacheLookup
	private WebElement btnFilter;

	@FindBy(id = "proxyCardNo")
	@CacheLookup
	private WebElement txtKIT;

	private By tableValues = By.xpath("//tr[@id='xyz']//th[text()='Created At']");

	private By tableValuesStatus = By.xpath("(//tr//td[text()='Approved'])[last()]");

	private By noData = By.xpath("//td[text()='No Data']");

	private String commonText = "(//*[text()='%s'])[1]";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void selectDateRange() {
		clickOnSearchButton();
		try {
			bHelper.click(reportrange);
			log.info(reportrange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("reportrange")).click();
		}
		try {
			bHelper.click(thisMonth);
			log.info(thisMonth);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[text()='This Month']")).click();
		}
	}

	private void clickOnSearchButton() {
		try {
			bHelper.click(btnSearch);
			log.info(btnSearch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
		}
	}

	public void clickOnSubmit() {
		try {
			bHelper.click(btnFilterSearch);
			log.info(btnFilterSearch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[text()='Search']")).click();
		}
	}

	public void verifyTransactionDetail() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(tableValues));
	}

	public void applyStatusFilter(String status) {
		try {
			dHelper.SelectUsingVisibleValue(drpStatus, status);
			log.info(drpStatus);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("cardStatus")));
			select.deselectByVisibleText(status);
		}
	}

	public void applyKITFilter(String kit) {
		try {
			tHelper.sendKeys(txtKIT, kit);
			log.info(txtKIT);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("proxyCardNo")).sendKeys(kit);
		}
	}

	public void verifyFilteredTransactionDetail() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(tableValuesStatus));
	}

	public void verifyTransactionDetailNotDisplay() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(noData));
	}

	public void clickOnDownload() {
		try {
			bHelper.click(btnDownload);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("transactionDownload")).click();
		}
	}

	public void enterKitInSearch(String kit) {
		try {
			tHelper.sendKeys(kitNumber, kit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitNumber")).sendKeys(kit);
		}
	}

	public String getFailureReason() {
		String result = "";
		try {
			result = tHelper.getText(status);
		} catch (Exception e) {
			result = ObjectRepo.driver.findElement(By.xpath("(//td)[7]")).getText();
		}
		return result;
	}

	public String getProcessorStatus() {
		String result = "";
		try {
			result = tHelper.getText(processorStatus);
		} catch (Exception e) {
			result = ObjectRepo.driver.findElement(By.xpath("(//td)[5]")).getText();
		}
		return result;
	}

	public void verifyTransactionReport(String kitNumber2) {
		System.out.println(gHelper.IsElementPresentQuick(By.xpath(String.format(commonText, kitNumber2))));
		Assert.assertTrue(false);
	}
}
