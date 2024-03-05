package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
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
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class DistributorPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(DistributorPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;

	public DistributorPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
	}

	/** Web Elements */
	@FindBy(id = "companyName")
	@CacheLookup
	private WebElement txtCompanyName;

	@FindBy(id = "fullName")
	@CacheLookup
	private WebElement txtFullName;

	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement txtMobileNum;

	@FindBy(id = "emailId")
	@CacheLookup
	private WebElement txtEmail;

	@FindBy(id = "password")
	@CacheLookup
	private WebElement txtPassword;

	@FindBy(id = "repassword")
	@CacheLookup
	private WebElement txtConfirmPassword;

	@FindBy(id = "nameOfDirector")
	@CacheLookup
	private WebElement txtNameOfDirector;

	@FindBy(id = "citizenship")
	@CacheLookup
	private WebElement txtCitizenShip;

	@FindBy(id = "address")
	@CacheLookup
	private WebElement txtAddress;

	@FindBy(id = "dobofDirector")
	@CacheLookup
	private WebElement txtDOB;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Search']")
	@CacheLookup
	private WebElement btnSearchSubmit;

	@FindBy(id = "submit_button")
	@CacheLookup
	private WebElement btnSubmitDistributor;

	private By msgAddDistributorSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Distributor Added Successfully']");

	public String commonText = "(//*[text()='%s'])[1]";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void enterCompanyName(String CompanyName) {
		try {
			Thread.sleep(3000);
			tHelper.sendKeys(txtCompanyName, CompanyName);
			log.info(txtCompanyName);
		} catch (Exception e) {
			try {
				ObjectRepo.driver.findElement(By.id("companyName")).sendKeys(CompanyName);
			} catch (Exception e2) {
				ObjectRepo.driver.findElement(By.id("companyName")).sendKeys(CompanyName);
			}
		}
	}

	public void enterFullName(String FullName) {
		try {
			tHelper.sendKeys(txtFullName, FullName);
			log.info(txtFullName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("fullName")).sendKeys(FullName);
		}
	}

	public void enterMobileNum(String MobileNum) {
		try {
			tHelper.sendKeys(txtMobileNum, MobileNum);
			log.info(txtMobileNum);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobileNo")).sendKeys(MobileNum);
		}
	}

	public void enterEmail(String Email) {
		try {
			tHelper.sendKeys(txtEmail, Email);
			log.info(txtEmail);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("emailId")).sendKeys(Email);
		}
	}

	public void enterPassword(String Password) {
		try {
			tHelper.sendKeys(txtPassword, Password);
			log.info(txtPassword);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("password")).sendKeys(Password);
		}
	}

	public void enterConfirmPassword(String ConfirmPassword) {
		try {
			tHelper.sendKeys(txtConfirmPassword, ConfirmPassword);
			log.info(txtConfirmPassword);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("repassword")).sendKeys(ConfirmPassword);
		}
	}

	public void enterNameOfDirector(String NameOfDirector) {
		try {
			tHelper.sendKeys(txtNameOfDirector, NameOfDirector);
			log.info(txtNameOfDirector);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("nameOfDirector")).sendKeys(NameOfDirector);
		}
	}

	public void enterCitizenShip(String CitizenShip) {
		try {
			tHelper.sendKeys(txtCitizenShip, CitizenShip);
			log.info(txtCitizenShip);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("citizenship")).sendKeys(CitizenShip);
		}
	}

	public void enterAddress(String Address) {
		try {
			tHelper.sendKeys(txtAddress, Address);
			log.info(txtAddress);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("address")).sendKeys(Address);
		}
	}

	public void enterDOB(String DOB) {
		try {
			tHelper.sendKeys(txtDOB, DOB);
			log.info(txtDOB);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("dobofDirector")).sendKeys(DOB);
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

	public void clickOnSubmitSearchButton() {
		try {
			bHelper.click(btnSearchSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
	}

	public void searchDistributor(String mobileNumber) {
		clickOnSearchButton();
		String s = "Click on \"Search\" button\n";
		enterMobileNum(mobileNumber);
		s = s + "Enter \"Mobile Number\" : " + mobileNumber + "\n";
		clickOnSubmitSearchButton();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	public void verifyDistributorAdded(String mobileNumber) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(commonText, mobileNumber)));
		if (!result)
			log.error(By.xpath(String.format(commonText, mobileNumber)));
		Assert.assertTrue(result);
	}

	public void clickOnSubmitDistributor() {
		try {
			bHelper.click(btnSubmitDistributor);
			log.info(btnSubmitDistributor);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submit_button")).click();
		}
	}

	public void verifyAddDistributorSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgAddDistributorSuccess);
		if (!result)
			log.error(msgAddDistributorSuccess);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

}
