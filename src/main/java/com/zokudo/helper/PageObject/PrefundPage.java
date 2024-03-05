package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class PrefundPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(PrefundPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;

	public PrefundPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
	}

	/** Web Elements */

	@FindBy(id = "remarks")
	@CacheLookup
	private WebElement remarks;

	@FindBy(xpath = "(//*[@id='updateAcceptRoleBtn'])[1]")
	@CacheLookup
	private WebElement updateAcceptRoleBtn;

	@FindBy(xpath = "(//*[@id='updateRejectRoleBtn'])[1]")
	@CacheLookup
	private WebElement updateRejectRoleBtn;

	@FindBy(id = "requestId")
	@CacheLookup
	private WebElement requestId;

	@FindBy(id = "requesterName")
	@CacheLookup
	private WebElement requesterName;

	@FindBy(id = "challanNo")
	@CacheLookup
	private WebElement challanNo;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement amount;

	@FindBy(id = "remitterName")
	@CacheLookup
	private WebElement remitterName;

	@FindBy(id = "remetterAccountNo")
	@CacheLookup
	private WebElement remetterAccountNo;

	@FindBy(id = "remetterIfsc")
	@CacheLookup
	private WebElement remetterIfsc;

	@FindBy(id = "remetterBank")
	@CacheLookup
	private WebElement remetterBank;

	@FindBy(id = "remetterBranch")
	@CacheLookup
	private WebElement remetterBranch;

	@FindBy(id = "remetterUtr")
	@CacheLookup
	private WebElement remetterUtr;

	@FindBy(id = "payMethod")
	@CacheLookup
	private WebElement payMethod;

	@FindBy(id = "creditAccountNo")
	@CacheLookup
	private WebElement creditAccountNo;

	@FindBy(id = "inwardRefNum")
	@CacheLookup
	private WebElement inwardRefNum;

	@FindBy(id = "creditTime")
	@CacheLookup
	private WebElement creditTime;

	@FindBy(id = "paymentRequest")
	@CacheLookup
	private WebElement paymentRequest;

	private By verifyRecord = By.xpath("(//td)[1]");

//	private String verifyActionBtn = "//*[text()='%s']//following-sibling::*//*[@id='blockBtnId\"']";

	private By verifyActionButton = By.xpath("(//*[@id='blockBtnId\"'])[1]");

	private String actionButton = "//*[text()='%s']//following-sibling::*//button[@id='blockBtnId\"']";

//	private String verifyActionLabel = "//*[text()='%s']//following-sibling::*//*[text()='Approve/Reject']";

	private By verifyActLabel = By.xpath("(//*[text()='Approve/Reject'])[1]");

//	private String verifyStatus = "//*[text()='%s']//following-sibling::*//*[text()='Approve/Reject']";

	private By verifyApproved = By.xpath("(//*[text()='Approved'])[1]");

	private By verifyRejected = By.xpath("(//*[text()='Declined'])[1]");

	private By msgSuccess = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[text()='Prefund Request Successfully']");

	private String verifyPrefundRecord = "//*[text()='%s']";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void verifyPrefundList() {
		boolean result = gHelper.IsElementPresentQuick(verifyRecord);
		if (!result)
			log.error(verifyRecord);
		Assert.assertTrue(result);
	}

	public void verifyActionButton() {
		boolean status;
		try {
			status = gHelper.IsElementPresentQuick(verifyActionButton);
		} catch (Exception e) {
			status = ObjectRepo.driver.findElement(By.xpath("(//*[@id='blockBtnId\"'])[1]")).isDisplayed();
		}
		Assert.assertTrue(status);
	}

	public void verifyActionButtonLabel() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(verifyActLabel));
	}

	public void clickOnActionButton() {
		try {
			bHelper.click(ObjectRepo.driver.findElement(verifyActionButton));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(verifyActionButton).click();
		}
	}

	public void enterRemark(String Remarks) {
		try {
			tHelper.sendKeys(remarks, Remarks);
			log.info(remarks);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remarks")).sendKeys(Remarks);
		}
	}

	public void selectAction(String status) {
		if (status.toLowerCase().equals("approve")) {
			bHelper.click(updateAcceptRoleBtn);
			log.info(updateAcceptRoleBtn);
		} else {
			bHelper.click(updateRejectRoleBtn);
			log.info(updateRejectRoleBtn);
		}
	}

	public void verifyStatus(String status) {
		if (status.toLowerCase().equals("approve")) {
			Assert.assertTrue(gHelper.IsElementPresentQuick(verifyApproved));
		} else {
			Assert.assertTrue(gHelper.IsElementPresentQuick(verifyRejected));
		}
	}

	public void verifyActionButtonNotVisible() {
		Assert.assertFalse(gHelper.IsElementPresentQuick(verifyActionButton));
	}

	public void enterRequestID(String RequestID) {
		try {
			tHelper.sendKeys(requestId, RequestID);
			log.info(requestId);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("requestId")).sendKeys(RequestID);
		}
	}

	public void enterRequestName(String RequestName) {
		try {
			tHelper.sendKeys(requesterName, RequestName);
			log.info(requesterName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("requesterName")).sendKeys(RequestName);
		}
	}

	public void enterChallanNo(String ChallanNo) {
		try {
			tHelper.sendKeys(challanNo, ChallanNo);
			log.info(remetterIfsc);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("challanNo")).sendKeys(ChallanNo);
		}
	}

	public void enterAmount(String Amount) {
		try {
			tHelper.sendKeys(amount, Amount);
			log.info(amount);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("amount")).sendKeys(Amount);
		}
	}

	public void enterRemitterName(String RemitterName) {
		try {
			tHelper.sendKeys(remitterName, RemitterName);
			log.info(remitterName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remitterName")).sendKeys(RemitterName);
		}
	}

	public void enterRemetterAccountNumber(String RemetterAccountNumber) {
		try {
			tHelper.sendKeys(remetterAccountNo, RemetterAccountNumber);
			log.info(remetterAccountNo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remetterAccountNo")).sendKeys(RemetterAccountNumber);
		}
	}

	public void enterRemetterIFSC(String RemetterIFSC) {
		try {
			tHelper.sendKeys(remetterIfsc, RemetterIFSC);
			log.info(remetterIfsc);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remetterIfsc")).sendKeys(RemetterIFSC);
		}
	}

	public void enterRemetterBank(String RemetterBank) {
		try {
			tHelper.sendKeys(remetterBank, RemetterBank);
			log.info(remetterBank);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remetterBank")).sendKeys(RemetterBank);
		}
	}

	public void enterRemetterBranch(String RemetterBranch) {
		try {
			tHelper.sendKeys(remetterBranch, RemetterBranch);
			log.info(remetterBranch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remetterBranch")).sendKeys(RemetterBranch);
		}
	}

	public void enterRemetterUTR(String RemetterBranch) {
		try {
			tHelper.sendKeys(remetterUtr, RemetterBranch);
			log.info(remetterUtr);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remetterUtr")).sendKeys(RemetterBranch);
		}
	}

	public void enterPayMethod(String PayMethod) {
		try {
			tHelper.sendKeys(payMethod, PayMethod);
			log.info(payMethod);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("payMethod")).sendKeys(PayMethod);
		}
	}

	public void enterCreditAccountNumber(String CreditAccountNumber) {
		try {
			tHelper.sendKeys(creditAccountNo, CreditAccountNumber);
			log.info(creditAccountNo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("creditAccountNo")).sendKeys(CreditAccountNumber);
		}
	}

	public void enterInwardRefNumber(String InwardRefNumber) {
		try {
			tHelper.sendKeys(inwardRefNum, InwardRefNumber);
			log.info(inwardRefNum);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("inwardRefNum")).sendKeys(InwardRefNumber);
		}
	}

	public void enterCreditTime(String CreditTime) {
		try {
			tHelper.sendKeys(creditTime, CreditTime);
			log.info(creditTime);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("creditTime")).sendKeys(CreditTime);
		}
	}

	public void clickOnSubmitRequest() {
		try {
			bHelper.click(paymentRequest);
			log.info(paymentRequest);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("paymentRequest")).click();
		}
	}

	public void verifyPrefundRequestSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgSuccess);
		if (!result)
			log.error(msgSuccess);
		Assert.assertTrue(result);
	}

	public void verifyAddedPrefundRequest(String record) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyPrefundRecord, record)));
		if (!result)
			log.error(By.xpath(String.format(verifyPrefundRecord, record)));
		Assert.assertTrue(result);
	}

	public void clickOnActionButton(String string) {
		try {
			bHelper.click(ObjectRepo.driver.findElement(By.xpath(String.format(actionButton, string))));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(actionButton, string))).click();
		}
	}
}
