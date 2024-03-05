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
import com.zokudo.framework.settings.ObjectRepo;

public class OnboardBusinessPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(OnboardBusinessPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private DropDownHelper dHelper;
	private GenericHelper gHelper;

	public OnboardBusinessPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		dHelper = new DropDownHelper(driver);
		gHelper = new GenericHelper(driver);
	}

	/** Web Elements */

	@FindBy(id = "corporateNameId")
	@CacheLookup
	private WebElement txtBusinessName;

	@FindBy(id = "corporateCodeId")
	@CacheLookup
	private WebElement txtBusinessType;

	@FindBy(id = "processorId")
	@CacheLookup
	private WebElement drpProcessor;

	@FindBy(id = "submitBtnId")
	@CacheLookup
	private WebElement btnSubmit;

	private By msgSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Processor code created successfully!']");

	private String verifyRecord = "//td[text()='%s']";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void enterBusinessName(String businessName) {
		try {
			tHelper.sendKeys(txtBusinessName, businessName);
			log.info(txtBusinessName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("corporateNameId")).sendKeys(businessName);
		}
	}

	public void enterBusinessType(String businessType) {
		try {
			tHelper.sendKeys(txtBusinessType, businessType);
			log.info(txtBusinessType);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("corporateCodeId")).sendKeys(businessType);
		}
	}

	public void selectProcessor(String processor) {
		try {
			dHelper.SelectUsingVisibleValue(drpProcessor, processor);
			log.info(drpProcessor);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("processorId")));
			s.selectByVisibleText(processor);
		}
	}

	public void clickOnSubmitButton() {
		try {
			bHelper.click(btnSubmit);
			log.info(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitBtnId")).click();
		}
	}

	public void verifyAddBusinessSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgSuccess);
		if (!result)
			log.error(msgSuccess);
		Assert.assertTrue(result);
	}

	public void verifyRecord(String businessName) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, businessName)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, businessName)));
		Assert.assertTrue(result);
	}
}
