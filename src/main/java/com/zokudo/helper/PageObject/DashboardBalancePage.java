package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class DashboardBalancePage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(DashboardBalancePage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;

	public DashboardBalancePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
	}

	/** Web Elements */

	@FindBy(xpath = "(//*[@name='daterangepicker_start'])[1]")
	@CacheLookup
	private WebElement txtFromDate;

	@FindBy(xpath = "(//*[@name='daterangepicker_end'])[1]")
	@CacheLookup
	private WebElement txtToDate;

	@FindBy(xpath = "(//button[text()='Apply'])[1]")
	@CacheLookup
	private WebElement btnApply;

	@FindBy(id = "submitBtnId")
	@CacheLookup
	private WebElement btnViewData;

	@FindBy(xpath = "(//li[text()='This Month'])[1]")
	@CacheLookup
	private WebElement thisMonth;

	@FindBy(xpath = "(//li[text()='Last Month'])[1]")
	@CacheLookup
	private WebElement lastMonth;

	@FindBy(xpath = "(//li[text()='Custom Range'])[1]")
	@CacheLookup
	private WebElement customRange;

	@FindBy(name = "loadDateRange")
	@CacheLookup
	private WebElement txtReportRange;

	@FindBy(id = "allprogram")
	@CacheLookup
	private WebElement radioAllProgram;

	@FindBy(id = "client")
	@CacheLookup
	private WebElement radioClient;

	@FindBy(id = "distributor")
	@CacheLookup
	private WebElement radioDistributor;

	@FindBy(id = "clientId")
	@CacheLookup
	private WebElement msClient;

	@FindBy(id = "distributorId")
	@CacheLookup
	private WebElement msDistributor;

	@FindBy(id = "openBalance")
	@CacheLookup
	private WebElement openBalance;

	@FindBy(id = "closeBalance")
	@CacheLookup
	private WebElement closeBalance;

	@FindBy(id = "loadBalance")
	@CacheLookup
	private WebElement loadBalance;

	@FindBy(id = "transactionBalance")
	@CacheLookup
	private WebElement transactionBalance;

	@FindBy(xpath = "//*[@id='clientId']//following-sibling::*//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtClientId;

	@FindBy(xpath = "//*[@id='distributorId']//following-sibling::*//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtDistributorId;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void clickOnSelectDateRange() {
		try {
			bHelper.click(txtReportRange);
			log.info(txtReportRange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.name("loadDateRange")).click();
		}
	}

	public void selectThisMonth() {
		try {
			bHelper.click(thisMonth);
			log.info(thisMonth);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("(//li[text()='This Month'])[1]")).click();
		}
	}

	public void selectCustomRange() {
		try {
			bHelper.click(customRange);
			log.info(customRange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("(//li[text()='Custom Range'])[1]")).click();
		}
	}

	public void selectLastMonth() {
		try {
			bHelper.click(lastMonth);
			log.info(lastMonth);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("(//li[text()='Last Month'])[1]")).click();
		}
	}

	public void selectCustomDates(String start, String end) {
		if (!start.isEmpty()) {
			try {
				tHelper.clearAndSendKeys(txtFromDate, start);
				log.info(txtFromDate);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath("(//*[@name='daterangepicker_start'])[1]")).clear();
				ObjectRepo.driver.findElement(By.xpath("(//*[@name='daterangepicker_start'])[1]")).sendKeys(start);
			}
			try {
				tHelper.clearAndSendKeys(txtToDate, end);
				log.info(txtToDate);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath("(//*[@name='daterangepicker_end'])[1]")).clear();
				ObjectRepo.driver.findElement(By.xpath("(//*[@name='daterangepicker_end'])[1]")).sendKeys(start);
			}
		}
		try {
			bHelper.click(btnApply);
			log.info(btnApply);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("(//button[text()='Apply'])[1]")).click();
		}
	}

	public void clickOnViewData() {
		try {
			bHelper.click(btnViewData);
			log.info(btnViewData);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitBtnId")).click();
		}
	}

	public void verifyClosingBalance() {
		String openingBal = null;
		String loadBal = null;
		String closingBal = null;
		String transactionBal = null;
		try {
			openingBal = tHelper.getText(openBalance).replaceAll("[^0-9]", "");
			log.info(openBalance);
		} catch (Exception e) {
			openingBal = ObjectRepo.driver.findElement(By.id("openBalance")).getText().replaceAll("[^0-9]", "");
		}
		String s = "Opening balance : " + openingBal + "\n";
		System.out.println(openingBal);
		try {
			loadBal = tHelper.getText(loadBalance).replaceAll("[^0-9]", "");
			log.info(loadBalance);
		} catch (Exception e) {
			loadBal = ObjectRepo.driver.findElement(By.id("loadBalance")).getText().replaceAll("[^0-9]", "");
		}
		s = s + "Load balance : " + loadBal + "\n";
		System.out.println(loadBal);
		try {
			closingBal = tHelper.getText(closeBalance).replaceAll("[^0-9]", "");
			log.info(closeBalance);
		} catch (Exception e) {
			closingBal = ObjectRepo.driver.findElement(By.id("closeBalance")).getText().replaceAll("[^0-9]", "");
		}
		s = s + "Closing balance : " + closingBal + "\n";
		try {
			transactionBal = tHelper.getText(transactionBalance).replaceAll("[^0-9]", "");
			log.info(closeBalance);
		} catch (Exception e) {
			transactionBal = ObjectRepo.driver.findElement(By.id("transactionBalance")).getText().replaceAll("[^0-9]",
					"");
		}
		s = s + "Transaction balance : " + transactionBal + "\n";
		System.out.println(transactionBal);
		if (Integer.parseInt(openingBal) + Integer.parseInt(loadBal) - Integer.parseInt(transactionBal) != Integer
				.parseInt(closingBal)) {
			log.error("Balance mis match");
			Assert.assertTrue(false);
		}
		s = s + "Verifed closing balance as per formula";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifyEscrowTrn() {

	}

	public void clickOnAllProgram() {
		try {
			bHelper.click(radioAllProgram);
			log.info(radioAllProgram);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("allprogram")).click();
		}
	}

	public void clickOnClient() {
		try {
			bHelper.click(radioClient);
			log.info(radioClient);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("client")).click();
		}
	}

	public void selectDistributor(String[] distributor) {
		for (int i = 0; i < distributor.length; i++) {
//			try {
//				bHelper.click(msDistributor);
//				log.info(msDistributor);
//			} catch (Exception e) {
//				ObjectRepo.driver.findElement(By.id("distributorId")).click();
//			}
			try {
				tHelper.sendKeys(txtDistributorId, distributor[i] + Keys.ENTER);
				log.info(txtDistributorId);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath(
						"//*[@id='distributorId']//following-sibling::*//input[contains(@class,'select2-search')]"))
						.sendKeys(distributor[i] + Keys.ENTER);
			}
		}
	}

	public void selectClient(String[] client) {
		for (int i = 0; i < client.length; i++) {
//			try {
//				bHelper.click(msClient);
//				log.info(msClient);
//			} catch (Exception e) {
//				ObjectRepo.driver.findElement(By.id("clientId")).click();
//			}
			try {
				tHelper.sendKeys(txtClientId, client[i] + Keys.ENTER);
				log.info(txtClientId);
			} catch (Exception e) {
				ObjectRepo.driver
						.findElement(By.xpath(
								"//*[@id='clientId']//following-sibling::*//input[contains(@class,'select2-search')]"))
						.sendKeys(client[i] + Keys.ENTER);
			}
		}
	}

	public void clickOnDistributor() {
		try {
			bHelper.click(radioDistributor);
			log.info(radioDistributor);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("distributor")).click();
		}
	}

}
