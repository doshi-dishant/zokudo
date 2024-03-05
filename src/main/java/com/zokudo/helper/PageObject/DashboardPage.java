package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class DashboardPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(DashboardPage.class);
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;

	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
	}

	/** Web Elements */

	@FindBy(xpath = "//div[contains(@class,'show-cal')]//*[@name='daterangepicker_start']")
	@CacheLookup
	private WebElement txtFromDate;

	@FindBy(id = "program_balance")
	@CacheLookup
	private WebElement programBal;

	public WebDriver getDriver() {
		return this.driver;
	}

	public String verifyProgramBalance() {
		String bal = "";
		try {
			bal = tHelper.getText(programBal);
		} catch (Exception e) {
			bal = ObjectRepo.driver.findElement(By.id("program_balance")).getText();
		}
		if (bal.equals("")) {
			gHelper.reloadPage();
			try {
				bal = tHelper.getText(programBal);
			} catch (Exception e) {
				bal = ObjectRepo.driver.findElement(By.id("program_balance")).getText();
			}
		}
		log.info(programBal);
		System.out.println(bal);
		return bal;
	}

}
