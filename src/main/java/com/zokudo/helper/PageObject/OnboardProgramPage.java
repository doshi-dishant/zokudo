package com.zokudo.helper.PageObject;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import com.zokudo.framework.list.ListHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class OnboardProgramPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(OnboardProgramPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private DropDownHelper dHelper;
	private GenericHelper gHelper;
	private ListHelper lHelper;

	public OnboardProgramPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		dHelper = new DropDownHelper(driver);
		gHelper = new GenericHelper(driver);
		lHelper = new ListHelper(driver);
	}

	/** Web Elements */

	@FindBy(id = "programName")
	@CacheLookup
	private WebElement txtProgramName;

	@FindBy(id = "clientId")
	@CacheLookup
	private WebElement drpClient;

	@FindBy(id = "programPlan")
	@CacheLookup
	private WebElement drpProgramPlan;

	@FindBy(id = "corporateProcessorId")
	@CacheLookup
	private WebElement drpBusinessType;

	@FindBy(id = "reloadableGprGc")
	@CacheLookup
	private WebElement drpReloadableCardType;

	@FindBy(id = "cardType")
	@CacheLookup
	private WebElement drpCardType;

	@FindBy(xpath = "//*[contains(@aria-labelledby,'subBinNumber')]")
	@CacheLookup
	private WebElement drpSubBinRange;

	private By drpSubBinRangeOptions = By.xpath("//ul[contains(@id,'subBinNumber')]//li");

	@FindBy(xpath = "//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtSubBinRange;

	@FindBy(id = "programSubmitButton")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(xpath = "//*[contains(@aria-labelledby,'clientCode')]")
	@CacheLookup
	private WebElement drpClientCode;

	@FindBy(xpath = "//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtClient;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Search']")
	@CacheLookup
	private WebElement btnSearchSubmit;

	@FindBy(id = "hosturlId")
	@CacheLookup
	private WebElement hosturlId;

	private By msgSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Program onboarded successfully!']");

	private String verifyRecord = "//td[text()='%s']";

	private String drpValue = "//li[contains(@id,'select2-subBinNumber') and text()='%s']";

	private String url = "//*[text()='%s']//following-sibling::td//button[contains(@onclick,'showHost')]";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void enterProgramName(String programName) {
		try {
			tHelper.sendKeys(txtProgramName, programName);
			log.info(txtProgramName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("programName")).sendKeys(programName);
		}
	}

	public void selectClient(String client) {
		try {
			dHelper.SelectUsingVisibleValue(drpClient, client);
			log.info(drpClient);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("clientId")));
			s.selectByVisibleText(client);
		}
	}

	public void selectProgramPlan(String programPlan) {
		try {
			dHelper.SelectUsingVisibleValue(drpProgramPlan, programPlan);
			log.info(drpProgramPlan);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("programPlan")));
			s.selectByVisibleText(programPlan);
		}
	}

	public void selectBusinessType(String businessType) {
		try {
			dHelper.SelectUsingVisibleValue(drpBusinessType, businessType);
			log.info(drpBusinessType);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("corporateProcessorId")));
			s.selectByVisibleText(businessType);
		}
	}

	public void selectReloadableCardType(String reloadableCardType) {
		try {
			dHelper.SelectUsingVisibleValue(drpReloadableCardType, reloadableCardType);
			log.info(drpReloadableCardType);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("reloadableGprGc")));
			s.selectByVisibleText(reloadableCardType);
		}
	}

	public void selectCardType(String cardType) {
		try {
			dHelper.SelectUsingVisibleValue(drpCardType, cardType);
			log.info(drpCardType);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("cardType")));
			s.selectByVisibleText(cardType);
		}
	}

	public String selectSubBinRange(String s) {
		try {
			bHelper.click(drpSubBinRange);
			log.info(drpSubBinRange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'subBinNumber')]")).click();
		}
		s = s + "Click on \"Sub-bin Range\" dropdown\n";
		List<WebElement> list;
		try {
			list = lHelper.getList(drpSubBinRangeOptions);
		} catch (Exception e) {
			list = ObjectRepo.driver.findElements(By.xpath("//ul[contains(@id,'subBinNumber')]//li"));
		}
		String subBinRange = list.get(ThreadLocalRandom.current().nextInt(0, list.size())).getText();
		int count = 0;
		while (subBinRange.equals("65") && count == 3) {
			subBinRange = list.get(ThreadLocalRandom.current().nextInt(0, list.size())).getText();
			count++;
		}
		s = s + "Sub-bin range is " + subBinRange + "\n";
		try {
			tHelper.sendKeys(txtSubBinRange, subBinRange);
			log.info(txtSubBinRange);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//input[contains(@class,'select2-search')]")).sendKeys(subBinRange);
		}
		s = s + "Enter \"Sub-bin Range\" : " + subBinRange + "\n";
		try {
			bHelper.click(By.xpath(String.format(drpValue, subBinRange)));
			log.info(By.xpath(String.format(drpValue, subBinRange)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(drpValue, subBinRange))).click();
		}
		s = s + "Click on \"" + subBinRange + "\"";
		return s;
	}

	public void clickOnSubmitButton() {
		try {
			bHelper.click(btnSubmit);
			log.info(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("programSubmitButton")).click();
		}
	}

	public void verifyAddProgramSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgSuccess);
		if (!result)
			log.error(msgSuccess);
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

	public void clickOnSubmitSearchButton() {
		try {
			bHelper.click(btnSearchSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
	}

	public void verifyRecord(String clientName, String programName) {
		clickOnSearchButton();
		try {
			bHelper.click(drpClientCode);
			log.info(drpClientCode);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'clientCode')]")).click();
		}
		try {
			tHelper.sendKeys(txtClient, clientName + Keys.ENTER);
			log.info(txtClient);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//input[contains(@class,'select2-search')]"))
					.sendKeys(clientName + Keys.ENTER);
		}
		clickOnSubmitSearchButton();
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, programName)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, programName)));
		Assert.assertTrue(result);
	}

	public String getHostURL(String programName) {
		String hostURL = "";
		try {
			bHelper.click(By.xpath(String.format(url, programName)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(url, programName))).click();
		}
		try {
			hostURL = tHelper.getText(hosturlId);
		} catch (Exception e) {
			hostURL = ObjectRepo.driver.findElement(By.id("hosturlId")).getText();
		}
		gHelper.reloadPage();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		return hostURL;
	}
}
