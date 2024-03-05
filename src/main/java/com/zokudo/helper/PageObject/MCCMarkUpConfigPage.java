package com.zokudo.helper.PageObject;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.DropDown.DropDownHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class MCCMarkUpConfigPage extends PageBase {

	private WebDriver driver;
	private CommonPage cP;
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private DropDownHelper dHelper;
	private GenericHelper gHelper;

	public MCCMarkUpConfigPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		dHelper = new DropDownHelper(driver);
		gHelper = new GenericHelper(driver);
		cP = new CommonPage(driver);
	}

	/** Web Elements */

	@FindBy(id = "programHashId")
	@CacheLookup
	private WebElement programHashId;

	@FindBy(id = "programType")
	@CacheLookup
	private WebElement programType;

	@FindBy(id = "channel")
	@CacheLookup
	private WebElement channel;

	@FindBy(id = "markUpValue")
	@CacheLookup
	private WebElement markUpValue;

	@FindBy(id = "submitButton")
	@CacheLookup
	private WebElement submitButton;

	@FindBy(id = "slider")
	@CacheLookup
	private WebElement slider;

	@FindBy(id = "mccSheetId")
	@CacheLookup
	private WebElement mccSheetId;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(xpath = "//button[contains(text(),'Filter')]")
	@CacheLookup
	private WebElement btnFilter;

	@FindBy(id = "reportrange")
	@CacheLookup
	private WebElement reportrange;

	@FindBy(xpath = "//*[text()='This Month']")
	@CacheLookup
	private WebElement thisMonth;

	private By error_markUpValue = By.id("error_markUpValue");

	private By msgAddMarkupSuccess = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[contains(text(),'MarkUp Added.')]");

	private By msgAddMarkupSuccessBulk = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[contains(text(),'Processed, Kindly check reports')]");

	private By msgAddMarkupAlreadyExist = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Error while saving mcc markup. Markup already exists.')]");

	private String removedMCC = "//*[contains(@class,'selection__choice__remove')]";

	private String markup = "(//*[text()='%s']//preceding-sibling::td[text()='%s'])[1]";

	private String failureReason = "(//*[text()='%s']//following-sibling::td[2])[1]";

	private final static Logger log = LoggerHelper.getLogger(MCCMarkUpConfigPage.class);

	public WebDriver getDriver() {
		return this.driver;
	}

	public void selectProgram(String program) {
		try {
			dHelper.SelectUsingVisibleValue(programHashId, program);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
			select.selectByVisibleText(program);
		}
	}

	public void selectProgramType(String programType) {
		try {
			dHelper.SelectUsingVisibleValue(this.programType, programType);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("programType")));
			select.selectByVisibleText(programType);
		}
	}

	public void selectChannel(String channel) {
		try {
			dHelper.SelectUsingVisibleValue(this.channel, channel);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("channel")));
			select.selectByVisibleText(channel);
		}
	}

	public void enterMarkUpValue(String markUpValue) {
		try {
			tHelper.sendKeys(this.markUpValue, markUpValue);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("markUpValue")).sendKeys(markUpValue);
		}
	}

	public void clickOnSubmit() {
		try {
			bHelper.click(submitButton);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitButton")).click();
		}
	}

	public void verifyAddMarkupSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgAddMarkupSuccess);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("AddMarkup_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyMarkup(String markUpValue, String channel) {
		if (markUpValue.startsWith("0"))
			markUpValue = markUpValue.substring(1);
		Assert.assertTrue(gHelper.IsElementPresentQuick(By.xpath(String.format(markup, markUpValue, channel))));
	}

	public void verifyMarkupNotAdded(String markUpValue, String channel) {
		if (markUpValue.startsWith("0"))
			markUpValue = markUpValue.substring(1);
		Assert.assertFalse(gHelper.IsElementPresentQuick(By.xpath(String.format(markup, markUpValue, channel))));
	}

	public void verifyAddMarkupAlreadyExistMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgAddMarkupAlreadyExist);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("AddMarkup_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyAddMarkupAlreadyExistMessageForEdit() {
		boolean result = gHelper.IsElementPresentQuick(msgAddMarkupAlreadyExist);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("AddMarkup_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		cP.clickOnOkButtonForErrors();
		Assert.assertTrue(result);
	}

	public void toggleBulkUpload() {
		try {
			Actions action = new Actions(ObjectRepo.driver);
			action.sendKeys(Keys.ESCAPE).build().perform();
			bHelper.click(slider);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("slider")).click();
		}
	}

	public void uploadSheet(String filePath) {
		try {
			tHelper.sendKeys(mccSheetId, filePath);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mccSheetId")).sendKeys(filePath);
		}
	}

	public void verifyAddMarkupSuccessMessageForBulk() {
		boolean result = gHelper.IsElementPresentQuick(msgAddMarkupSuccessBulk);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess("AddMarkup_" + InitializeWebDriver.scenario.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		if (!result)
//			log.error(By.xpath(String.format(msgLoadCardSuccess, amount)));
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void search() {
		clickOnSearchButton();
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
		s = s + "Click on this month\n";
		try {
			bHelper.click(btnFilter);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//button[contains(text(),'Filter')]")).click();
		}
		s = s + "Click on \"Filter\" button\n";
		InitializeWebDriver.scenario.write(s);
	}

	public void clickOnSearchButton() {
		try {
			bHelper.click(btnSearch);
			log.info(btnSearch);
		} catch (Exception e) {
			try {
				ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
			} catch (Exception e2) {
				e2.printStackTrace();
				e2.printStackTrace();
			}
		}
	}

	public String getFailureReason(String mcc) {
		String result;
		try {
			result = tHelper.getText(By.xpath(String.format(failureReason, mcc)));
		} catch (Exception e) {
			try {
				result = ObjectRepo.driver.findElement(By.xpath(String.format(failureReason, mcc))).getText();
			} catch (Exception e2) {
				result = "";
			}
		}
		return result;
	}

	public void removeMCC() {
		try {
			List<WebElement> list = gHelper.getElements(By.xpath(removedMCC));
			for (int i = 0; i < list.size(); i++) {
				try {
					new Actions(ObjectRepo.driver).sendKeys(Keys.ESCAPE).build().perform();
					Thread.sleep(2000);
					bHelper.click(By.xpath("(" + removedMCC + ")[1]"));
				} catch (Exception e) {
					ObjectRepo.driver.findElement(By.xpath("(" + removedMCC + ")[1]")).click();
				}
			}
		} catch (Exception e) {
//			e.printStackTrace();
		}
		new Actions(ObjectRepo.driver).sendKeys(Keys.ESCAPE).build().perform();
	}

	public void VerifyInvalidMarkupMessage() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(error_markUpValue));
	}
}
