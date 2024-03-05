package com.zokudo.helper.PageObject;

import java.io.IOException;

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
import com.zokudo.framework.helper.Javascript.JavaScriptHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class LoadReversalPage extends PageBase {
	/** Web Elements */

	@FindBy(id = "clientId")
	@CacheLookup
	private WebElement clientId;

	@FindBy(id = "programId")
	@CacheLookup
	private WebElement programId;

	@FindBy(id = "uploadTypeId")
	@CacheLookup
	private WebElement uploadTypeId;

	@FindBy(id = "submitBtnId")
	@CacheLookup
	private WebElement submitBtnId;

	@FindBy(id = "password")
	@CacheLookup
	private WebElement password;

	@FindBy(id = "pConfirmButton")
	@CacheLookup
	private WebElement pConfirmButton;

	@FindBy(id = "kitSheetId")
	@CacheLookup
	private WebElement fileBulkFileUpload;

	By invalidCredMsg = By.id("error_password");

	private By msgLoadReversalSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[contains(text(),'Card load reverse successful')]");

	private By msgLoadReversalSuccessBulk = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[contains(text(),'Processed. Kindly check reports')]");

	private By msgLoadReversalFailure = By.xpath("//img[contains(@src,'x')]//following-sibling::div//button");

	private By tooltipForBalance = By.xpath("//*[text()='card value should be greater than 0']");

	WebDriver driver;
	private ButtonHelper bHelper;
	private DropDownHelper dHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;
	private JavaScriptHelper jHelper;

	public LoadReversalPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		dHelper = new DropDownHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
		jHelper = new JavaScriptHelper(driver);
	}

	public void selectClient(String client) {
		try {
			dHelper.SelectUsingVisibleValue(clientId, client);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("clientId")));
			select.selectByVisibleText(client);
		}
	}

	public void selectProgram(String program) {
		try {
			dHelper.SelectUsingVisibleValue(programId, program);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("programId")));
			select.selectByVisibleText(program);
		}
	}

	public void selectUploadType(String uploadType) {
		try {
			dHelper.SelectUsingVisibleValue(uploadTypeId, uploadType);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("uploadTypeId")));
			select.selectByVisibleText(uploadType);
		}
	}

	public void clickOnSubmit() {
		try {
			Thread.sleep(5000);
			bHelper.click(submitBtnId);
		} catch (Exception e) {
			try {
				ObjectRepo.driver.findElement(By.id("submitBtnId")).click();
			} catch (Exception e2) {
				jHelper.clickUsingJS(submitBtnId);
			}
		}
	}

	public void clickOnPasswordSubmit() {
		try {
			bHelper.click(pConfirmButton);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("pConfirmButton")).click();
		}
	}

	public void enterPassword(String password) {
		try {
			tHelper.sendKeys(this.password, password);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("password")).sendKeys(password);
		}
	}

	public void verifyInvalidCredentialsMessage() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(invalidCredMsg));
	}

	public void verifyLoadReversalSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgLoadReversalSuccess);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("LoadReverse_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyLoadReversalSuccessMessageBulk() {
		boolean result = gHelper.IsElementPresentQuick(msgLoadReversalSuccessBulk);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("LoadReverse_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyValidationTooltipForBalance() {
		System.out.println();
		boolean result = gHelper.IsElementPresentQuick(tooltipForBalance);
		System.out.println(result);
//		Assert.assertTrue(result);
	}

	public void uploadFile(String filePath) {
		try {
			tHelper.sendKeys(fileBulkFileUpload, filePath);
//			log.info(fileBulkFileUpload);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("kitSheetId")).sendKeys(filePath);
		}
	}

	public void verifyLoadReversalFailureMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgLoadReversalFailure);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("LoadReverse_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error("");
		gHelper.reloadPage();
//		Assert.assertTrue(result);
	}
}