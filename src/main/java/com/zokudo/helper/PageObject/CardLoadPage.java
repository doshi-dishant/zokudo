package com.zokudo.helper.PageObject;

import java.io.IOException;

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

public class CardLoadPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(CardLoadPage.class);
	private ButtonHelper bHelper;
	private GenericHelper gHelper;
	private DropDownHelper dHelper;
	private TextBoxHelper tHelper;

	public CardLoadPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		gHelper = new GenericHelper(driver);
		dHelper = new DropDownHelper(driver);
		tHelper = new TextBoxHelper(driver);
	}

	/** Web Elements */

	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement txtMobileNum;

	@FindBy(id = "proxyCardNo")
	@CacheLookup
	private WebElement txtKIT;

	@FindBy(id = "kitNo")
	@CacheLookup
	private WebElement kitNo;

	@FindBy(xpath = "//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtKitNo;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement txtAmount;

	@FindBy(id = "proxyNo")
	@CacheLookup
	private WebElement drpKit;

	@FindBy(id = "loadAmountRequest")
	@CacheLookup
	private WebElement btnLoadCardSubmit;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(xpath = "(//*[text()='ACTIVATED']//following-sibling::td[4])[1]")
	@CacheLookup
	private WebElement mobileNumber;

	private String mobile = "(//*[text()='%s']//preceding-sibling::td[2])[1]";

	private String hashId = "(//td[text()='%s']//following-sibling::td[text()='ACTIVE']//preceding-sibling::td[2])[1]";

	@FindBy(xpath = "(//*[text()='ACTIVATED']//following-sibling::td[4])[last()]")
	@CacheLookup
	private WebElement lastMobileNumber;

	@FindBy(xpath = "(//*[text()='ACTIVATED']//following-sibling::td[6])[1]")
	@CacheLookup
	private WebElement kitNumber;

	@FindBy(xpath = "//*[contains(@aria-labelledby,'customerHashId')]")
	@CacheLookup
	private WebElement drpCustomerNum;

	@FindBy(id = "pocketId")
	@CacheLookup
	private WebElement drpPocket;

	@FindBy(xpath = "//*[normalize-space(text())='Search']")
	@CacheLookup
	private WebElement btnSearchSubmit;

	@FindBy(id = "lockCardId")
	@CacheLookup
	private WebElement btnLockCard;

	@FindBy(id = "terminate")
	@CacheLookup
	private WebElement btnTerminate;

	@FindBy(id = "remarks")
	@CacheLookup
	private WebElement remarks;

	@FindBy(id = "updateRoleBtn")
	@CacheLookup
	private WebElement updateRoleBtn;

	private String msgLoadCardSuccess = "//img[contains(@src,'source')]//following-sibling::div//*[contains(text(),'Card Loaded Successfully with INR')]";

	private String drpCustNoValue = "//li[contains(@id,'select2-customerHashId') and contains(text(),'%s')]";

	private By msgLowPrefundError = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[text()='insufficient balance!prefund has low balance']");

	private By msgMaxMCCError = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Pocket mcc max limit exceeded for pocket')]");

	private By msgArgumentInvalidError = By
			.xpath("//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Arguments are invalid')]");

	private By msgGCOneTimeError = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'GC can be loaded only one time for pocket')]");

	private By msgGCLoadError = By
			.xpath("//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'GC load limit exceeded')]");

	private By balanceLimitExceededError = By
			.xpath("//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Balance limit exceeded')]");

	private By msgMonthlyLoadError = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Monthly load limit exceeded')]");

	private By msgYearlyLoadError = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Yearly load limit exceeded')]");

	private By verifyCardLoaded = By.xpath("//*[@id='editedtable']//td[text()='No Data']");

	private String commonText = "//td[text()='%s']";

	public WebDriver getDriver() {
		return this.driver;
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

	public void selectPocket(String pocketName) {
		if (pocketName == null)
			pocketName = "DEFAULT";
		try {
			dHelper.SelectUsingVisibleValue(drpPocket, pocketName);
		} catch (Exception e) {
			try {
				Select select = new Select(ObjectRepo.driver.findElement(By.id("pocketId")));
				select.selectByVisibleText(pocketName);
			} catch (Exception e2) {
				try {
					Select select = new Select(ObjectRepo.driver.findElement(By.id("pocketId")));
					select.selectByVisibleText("DEFAULT");
				} catch (Exception e3) {
				}
			}
		}
	}

	public void enterKitInSearch(String kit) {
		try {
			tHelper.sendKeys(kitNo, kit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitNo")).sendKeys(kit);
		}
	}

	public void enterAmount(int a) {
		try {
			tHelper.sendKeys(txtAmount, String.valueOf(a));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("amount")).sendKeys(String.valueOf(a));
		}
	}

	public void enterKit(String kit) {
		try {
			tHelper.sendKeys(txtKIT, kit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("proxyCardNo")).sendKeys(kit);
		}
	}

	public void selectKit(String kitNumber) {
		try {
			dHelper.SelectUsingVisibleValue(drpKit, kitNumber);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("proxyNo")));
			select.selectByVisibleText(kitNumber);
		}
	}

	public boolean verifyLoadCardSuccessMessage(int amount) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(msgLoadCardSuccess));
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(By.xpath(msgLoadCardSuccess));
		gHelper.reloadPage();
		Assert.assertTrue(result);
		return result;
	}

	public void clickOnLoadCardSubmitButton() {
		try {
			bHelper.click(btnLoadCardSubmit);
			Thread.sleep(10000);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("loadAmountRequest")).click();
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

	public String fetchCustomerMobileAndKitDetail() {
		clickOnSearchButton();
		clickOnSubmitSearchButton();
		String s = "Click on \"Search\" button\n";
		String mobile = "";
		try {
			Thread.sleep(10000);
			mobile = tHelper.getText(mobileNumber);
			Thread.sleep(10000);
		} catch (Exception e) {
			mobile = ObjectRepo.driver.findElement(By.xpath("(//*[text()='ACTIVATED']//following-sibling::td[4])[1]"))
					.getText();
		}
		s = s + "Get mobile number is " + mobile + "\n";
		String kit = "";
		try {
			kit = tHelper.getText(kitNumber);
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(By.xpath("(//*[text()='ACTIVATED']//following-sibling::td[6])[1]"))
					.getText();
		}
		s = s + "Get kit number is " + kit + "\n";
		return mobile + "####" + kit;
	}

	public String fetchCustomerMobile(String kit) {
		gHelper.reloadPage();
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitInSearch(kit);
		s = s + "Enter \"Kit Number\" : " + kit + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		String mobileNum = "";
		try {
			Thread.sleep(5000);
			mobileNum = tHelper.getText(By.xpath(String.format(mobile, kit)));
		} catch (Exception e) {
			mobileNum = ObjectRepo.driver.findElement(By.xpath(String.format(mobile, kit))).getText();
		}
		s = s + "Verified that customer is present in system";
		InitializeWebDriver.scenario.write(s);
		return mobileNum;
	}

	public void pauseCard(String kit) {
		gHelper.reloadPage();
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitInSearch(kit);
		s = s + "Enter \"Kit Number\" : " + kit + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		try {
			bHelper.click(By.xpath(String.format(commonText, kit)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(commonText, kit))).click();
		}
		s = s + "Click on \"" + kit + "\"\n";
		try {
			bHelper.click(btnLockCard);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("lockCardId")).click();
		}
		s = s + "Click on \"Pause\" button\n";
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		InitializeWebDriver.scenario.write(s);
	}

	public void blockCard(String kit) {
		gHelper.reloadPage();
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterKitInSearch(kit);
		s = s + "Enter \"Kit Number\" : " + kit + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button\n";
		try {
			bHelper.click(By.xpath(String.format(commonText, kit)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(commonText, kit))).click();
		}
		s = s + "Click on \"" + kit + "\"\n";
		try {
			bHelper.click(btnTerminate);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("terminate")).click();
		}
		s = s + "Click on \"Block\" button\n";
		try {
			tHelper.sendKeys(remarks, "block card");
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remarks")).sendKeys("block card");
		}
		s = s + "Enter remark \"block card\"\n";
		try {
			bHelper.click(updateRoleBtn);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("updateRoleBtn")).click();
		}
		s = s + "Click on \"Block\" button\n";
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		InitializeWebDriver.scenario.write(s);
	}

	public String fetchLastCustomerMobileAndKitDetail() {
		clickOnSearchButton();
		String mobile = "";
		try {
			mobile = tHelper.getText(mobileNumber);
		} catch (Exception e) {
			mobile = ObjectRepo.driver.findElement(By.xpath("(//*[text()='ACTIVATED']//following-sibling::td[4])[1]"))
					.getText();
		}

		String kit = "";
		try {
			kit = tHelper.getText(kitNumber);
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(By.xpath("(//*[text()='ACTIVATED']//following-sibling::td[6])[1]"))
					.getText();
		}
		return mobile + "####" + kit;
	}

	public void verifyLoadCardLowPrefundErrorMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgLowPrefundError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgLowPrefundError);
		gHelper.reloadPage();
//		Assert.assertTrue(result);
	}

	public void verifyLoadCardMaxMCCErrorMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgMaxMCCError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgMaxMCCError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyLoadCardArgumentInvalidErrorMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgArgumentInvalidError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgArgumentInvalidError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void clickOnSubmitSearchButton() {
		try {
			bHelper.click(btnSearchSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
	}

	public boolean verifyKitLoaded() {
		return !gHelper.IsElementPresentQuick(verifyCardLoaded);
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
			id = tHelper.getText(By.xpath(String.format(hashId, customerMobileNo)));
		} catch (Exception e) {
			id = ObjectRepo.driver.findElement(By.xpath(String.format(hashId, customerMobileNo))).getText();
		}
		s = s + "Customer hash id is " + id + "\n";
		InitializeWebDriver.scenario.write(s);
		return id;
	}

	public void enterMobileNum(String MobileNum) {
		try {
			tHelper.sendKeys(txtMobileNum, MobileNum);
			log.info(txtMobileNum);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobileNo")).sendKeys(MobileNum);
		}
	}

	public void verifyCardCanBeLoadedOneTimeError() {
		boolean result = gHelper.IsElementPresentQuick(msgGCOneTimeError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgGCOneTimeError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyLoadCardGCLoadLimitExceededError() {
		boolean result = gHelper.IsElementPresentQuick(msgGCLoadError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgGCLoadError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyLoadCardLoadErrorMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgGCOneTimeError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgGCOneTimeError);
		gHelper.reloadPage();
//		Assert.assertTrue(result);
	}

	public void verifyLoadCardBalanceLimitExceededError() {
		boolean result = gHelper.IsElementPresentQuick(balanceLimitExceededError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(balanceLimitExceededError);
		gHelper.reloadPage();
//		Assert.assertTrue(result);
	}

	public void verifyLoadCardMonthlyBalanceLimitExceededError() {
		boolean result = gHelper.IsElementPresentQuick(msgMonthlyLoadError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgMonthlyLoadError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyLoadCardYearlyBalanceLimitExceededError() {
		boolean result = gHelper.IsElementPresentQuick(msgYearlyLoadError);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShot("Load_Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgYearlyLoadError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}
}
