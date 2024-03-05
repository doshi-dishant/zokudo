package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class LandingPage extends PageBase {

	private WebDriver driver;
	WaitHelper wHelper = new WaitHelper(ObjectRepo.driver, null);

	private final static Logger log = LoggerHelper.getLogger(LandingPage.class);

	// String random2 = RandomStringUtils.randomAlphabetic(3);

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	/** Web Elements */
	@FindBy(xpath = "//li[contains(@class,'logo')]")
	@CacheLookup
	private WebElement imgLogo;

	/** Public Methods **/

	public WebDriver getDriver() {
		return this.driver;
	}

	public void verifylandingPageTitle() throws InterruptedException {
		wHelper.waitForVisibility(imgLogo);
		Assert.assertEquals(true, imgLogo.isDisplayed());
		Assert.assertTrue(driver.getTitle().contains("ZOKUDO"));
		log.info("Landing Page is verified");
	}

}
