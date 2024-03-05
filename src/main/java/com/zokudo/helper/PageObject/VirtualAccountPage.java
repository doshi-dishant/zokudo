package com.zokudo.helper.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zokudo.framework.helper.BasePageObject.PageBase;

public class VirtualAccountPage extends PageBase {

	private WebDriver driver;

//	private final static Logger log = LoggerHelper.getLogger(VirtualAccountPage.class);
//	private ButtonHelper bHelper;
//	private GenericHelper gHelper;
//	private DropDownHelper dHelper;
//	private TextBoxHelper tHelper;

	public VirtualAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
//		bHelper = new ButtonHelper(driver);
//		gHelper = new GenericHelper(driver);
//		dHelper = new DropDownHelper(driver);
//		tHelper = new TextBoxHelper(driver);
	}

	/** Web Elements */

	By msgSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Virtual account configured successfully']");

	public WebDriver getDriver() {
		return this.driver;
	}

	public void fetchAccountNumber() {

	}
}
