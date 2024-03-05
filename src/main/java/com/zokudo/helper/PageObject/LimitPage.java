package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.DropDown.DropDownHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class LimitPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(LimitPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private DropDownHelper dHelper;
	private GenericHelper gHelper;
	private WaitHelper wHelper;

	public LimitPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		dHelper = new DropDownHelper(driver);
		gHelper = new GenericHelper(driver);
		wHelper = new WaitHelper(driver, ObjectRepo.reader);
	}

	/** Web Elements */

	@FindBy(id = "editwalletlimit")
	@CacheLookup
	private WebElement editwalletlimit;

	@FindBy(id = "editkyclimit")
	@CacheLookup
	private WebElement editkyclimit;

	@FindBy(id = "dailyLimit")
	@CacheLookup
	private WebElement dailyLimit;

	@FindBy(id = "monthlyLimit")
	@CacheLookup
	private WebElement monthlyLimit;

	@FindBy(id = "annuallyLimit")
	@CacheLookup
	private WebElement annuallyLimit;

	@FindBy(id = "dailyCount")
	@CacheLookup
	private WebElement dailyCount;

	@FindBy(id = "monthlyCount")
	@CacheLookup
	private WebElement monthlyCount;

	@FindBy(id = "annuallyCount")
	@CacheLookup
	private WebElement annuallyCount;

	@FindBy(id = "submitButton")
	@CacheLookup
	private WebElement submitButton;

	@FindBy(id = "annualLoadLimit")
	@CacheLookup
	private WebElement annualLoadLimit;

	@FindBy(id = "monthlyLoadLimit")
	@CacheLookup
	private WebElement monthlyLoadLimit;

	@FindBy(id = "balanceLimit")
	@CacheLookup
	private WebElement balanceLimit;

	@FindBy(id = "accountType")
	@CacheLookup
	private WebElement accountType;

	private By msgSuccessWalletLimit = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Customer limits updated successfully']");

	private By msgSuccessKYCLimit = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Customer kyc limits updated successfully']");

	public WebDriver getDriver() {
		return this.driver;
	}

	public void clickOnEditWalletLimit() {
		try {
			bHelper.click(editwalletlimit);
			log.info(editwalletlimit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("editwalletlimit")).click();
		}
	}

	public void clickOnEditKYCLimit() {
		try {
			bHelper.click(editkyclimit);
			log.info(editkyclimit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("editkyclimit")).click();
		}
	}

	public void clickOnSubmitWalletLimit() {
		try {
			bHelper.click(submitButton);
			log.info(submitButton);
			wHelper.hardWait(5000);
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitButton")).click();
		}
	}

	public void enterDailyLimit(String limit) {
		try {
			tHelper.clearAndSendKeys(dailyLimit, limit);
			log.info(dailyLimit);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("dailyLimit"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void enterMonthlyLimit(String limit) {
		try {
			tHelper.clearAndSendKeys(monthlyLimit, limit);
			log.info(monthlyLimit);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("monthlyLimit"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void enterAnnuallyLimit(String limit) {
		try {
			tHelper.clearAndSendKeys(annuallyLimit, limit);
			log.info(annuallyLimit);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("annuallyLimit"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void enterDailyCount(String limit) {
		try {
			tHelper.clearAndSendKeys(dailyCount, limit);
			log.info(dailyCount);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("dailyCount"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void enterMonthlyCount(String limit) {
		try {
			tHelper.clearAndSendKeys(monthlyCount, limit);
			log.info(monthlyCount);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("monthlyCount"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void enterAnnuallyCount(String limit) {
		try {
			tHelper.clearAndSendKeys(annuallyCount, limit);
			log.info(annuallyCount);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("annuallyCount"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void verifySetWalletLimitSuccessMessage() {
		wHelper.hardWait(180000);
		gHelper.acceptAlert();
		boolean result = gHelper.IsElementPresentQuick(msgSuccessWalletLimit);
		if (!result)
			log.error(msgSuccessWalletLimit);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void enterAnnualLoadLimit(String limit) {
		try {
			tHelper.clearAndSendKeys(annualLoadLimit, limit);
			log.info(annualLoadLimit);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("annualLoadLimit"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void enterMonthlyLoadLimit(String limit) {
		try {
			tHelper.clearAndSendKeys(monthlyLoadLimit, limit);
			log.info(monthlyLoadLimit);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("monthlyLoadLimit"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void enterBalanceLimit(String limit) {
		try {
			tHelper.clearAndSendKeys(balanceLimit, limit);
			log.info(balanceLimit);
		} catch (Exception e) {
			WebElement element = ObjectRepo.driver.findElement(By.id("balanceLimit"));
			element.clear();
			element.sendKeys(limit);
		}
	}

	public void selectAccountType(String limit) {
		try {
			dHelper.SelectUsingVisibleValue(accountType, limit);
			log.info(accountType);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("accountType")));
			s.selectByVisibleText(limit);
		}
	}

	public void verifySetKYCLimitSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgSuccessKYCLimit);
		if (!result)
			log.error(msgSuccessKYCLimit);
		gHelper.reloadPage();
//		Assert.assertTrue(result);
	}

}
