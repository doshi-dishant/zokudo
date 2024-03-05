package com.zokudo.helper.PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class CardToCardTransferPage extends PageBase {

	private WebDriver driver;
	private TextBoxHelper tHelper;
	private ButtonHelper bHelper;
	private GenericHelper gHelper;
	private CardLoadPage clP;

	public CardToCardTransferPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		tHelper = new TextBoxHelper(driver);
		bHelper = new ButtonHelper(driver);
		gHelper = new GenericHelper(driver);
		clP = new CardLoadPage(driver);
	}

	/** Web Elements */

	@FindBy(xpath = "(//*[text()='ACTIVATED']//following-sibling::td[4])[2]")
	@CacheLookup
	private WebElement toCardMobile;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(xpath = "//button[contains(@onclick,'Filter')]")
	@CacheLookup
	private WebElement btnFilter;

	@FindBy(id = "kitNumber")
	@CacheLookup
	private WebElement txtKitNumber;

	@FindBy(xpath = "(//*[text()='ACTIVATED']//following-sibling::td[6])[2]")
	@CacheLookup
	private WebElement toCardKitNumber;

	@FindBy(id = "debitProxyCardNumber")
	@CacheLookup
	private WebElement debitProxyCardNumber;

	@FindBy(id = "creditProxyCardNumber")
	@CacheLookup
	private WebElement creditProxyCardNumber;

	@FindBy(id = "pocketName")
	@CacheLookup
	private WebElement txtPocketName;

	@FindBy(id = "submitButton")
	@CacheLookup
	private WebElement btnCardToCardTransferSubmit;

	private By msgCardToCardTransferSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[contains(text(),'wallet To wallet transfer Successfully with INR')]");

	private By msgCardToCardTransferInsufficientBalanceInDebit = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'error!while transfer balance wallet to wallet: Insufficient balance in debit')]");

	private By msgCardToCardTransferPocketLimit = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'error!while transfer balance wallet to wallet: Pocket mcc max limit exceeded for pocket')]");

	private By msgCardToCardTransferInvalidPocketName = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'error!while transfer balance wallet to wallet: Invalid pocket name')]");

	private By msgCardToCardTransferSameCards = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'error!while transfer balance wallet to wallet: sender and receiver cards can') and contains(text(),'t be same')]");

	private By msgCardToCardGCCanNotBeLoaded = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'error!while transfer balance wallet to wallet: GC can be loaded only one time for pocket')]");

	private By msgCardToCardDebitAndCreditCardNotSame = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'error!while transfer balance wallet to wallet: debit card and credit card program ids is not same')]");

	private String result = "(//td[text()='%s']//following-sibling::*[2])[1]";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void clickOnCardToCardTransferSubmitButton() {
		try {
			bHelper.click(btnCardToCardTransferSubmit);
			Thread.sleep(10000);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitButton")).click();
		}
	}

	public String fetchCustomerMobileAndKitDetailToCard() {
		clP.clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		String mobile = "";
		try {
			Thread.sleep(10000);
			mobile = tHelper.getText(toCardMobile);
		} catch (Exception e) {
			mobile = ObjectRepo.driver.findElement(By.xpath("(//*[text()='ACTIVATED']//following-sibling::td[4])[2]"))
					.getText();
		}
		s = s + "Get mobile number is " + mobile + "\n";
		String kit = "";
		try {
			kit = tHelper.getText(toCardKitNumber);
		} catch (Exception e) {
			kit = ObjectRepo.driver.findElement(By.xpath("(//*[text()='ACTIVATED']//following-sibling::td[6])[2]"))
					.getText();
		}
		s = s + "Get kit number is " + kit + "\n";
		return mobile + "####" + kit;
	}

	public void enterFromCard(String kitNumber) {
		try {
			tHelper.sendKeys(debitProxyCardNumber, kitNumber);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("debitProxyCardNumber")).sendKeys(kitNumber);
		}
	}

	public void enterToCard(String kitNumberToCard) {
		try {
			tHelper.sendKeys(creditProxyCardNumber, kitNumberToCard);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("creditProxyCardNumber")).sendKeys(kitNumberToCard);
		}
	}

	public void enterPocket(String pocketName) {
		try {
			tHelper.sendKeys(txtPocketName, pocketName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("pocketName")).sendKeys(pocketName);
		}
	}

	public void verifyCardToCardTransferSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardToCardTransferSuccess);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("Card2Card_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyCardToCardTransferPocketLimitMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardToCardTransferPocketLimit);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShotSuccess(InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyCardToCardTransferInsufficientBalanceInDebitMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardToCardTransferInsufficientBalanceInDebit);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShotSuccess(InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyCardToCardTransferInvalidPocketNameMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardToCardTransferInvalidPocketName);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShotSuccess(InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyCardToCardTransferDebitCardAndCreditCardProgramIdsIsNotSameMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardToCardDebitAndCreditCardNotSame);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShotSuccess(InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyCardToCardTransferGCCanBeLoadedOnlyOneTimeForPocketMessage(int amount) {
		boolean result = gHelper.IsElementPresentQuick(msgCardToCardGCCanNotBeLoaded);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShotSuccess(InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyCardToCardTransferSenderAndReceiverCardsCanNotBeSameMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCardToCardTransferSameCards);
		try {
			new GenericHelper(ObjectRepo.driver).takeScreenShotSuccess(InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
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

	public void clickOnFilterButton() {
		try {
			bHelper.click(btnFilter);
		} catch (Exception e) {
			try {
				Thread.sleep(3000);
				ObjectRepo.driver.findElement(By.xpath("//button[contains(@onclick,'Filter')]")).click();
			} catch (Exception e2) {
				ObjectRepo.driver.findElement(By.xpath("//button[contains(@onclick,'Filter')]")).click();
			}
		}
	}

	public void searchReport(String kitNumber) {
		clickOnSearchButton();
		String s = "Click on search button\n";
		enterKit(kitNumber);
		s = s + "Enter " + kitNumber + "\n";
		clickOnFilterButton();
		s = s + "Click on filter button\n";
		String reason;
		try {
			reason = tHelper.getText(By.xpath(String.format(result, kitNumber)));
		} catch (Exception e) {
			reason = ObjectRepo.driver.findElement(By.xpath(String.format(result, kitNumber))).getText();
		}
		System.out.println(reason);
		s = s + "Reason is " + reason;
		InitializeWebDriver.scenario.write(s);
	}

	public void enterKit(String kitNumber) {
		try {
			tHelper.sendKeys(txtKitNumber, kitNumber);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitNumber")).sendKeys(kitNumber);
		}
	}

}
