package com.zokudo.helper.PageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class CustomerPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(CustomerPage.class);
	private ButtonHelper bHelper;
	private GenericHelper gHelper;
	private TextBoxHelper tHelper;
	private DropDownHelper dHelper;

	public CustomerPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		gHelper = new GenericHelper(driver);
		tHelper = new TextBoxHelper(driver);
		dHelper = new DropDownHelper(driver);
	}

	/** Web Elements */

	@FindBy(id = "firstName")
	@CacheLookup
	private WebElement txtFirstName;

	@FindBy(id = "lastName")
	@CacheLookup
	private WebElement txtLastName;

	@FindBy(id = "emailId")
	@CacheLookup
	private WebElement txtEmail;

	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement txtMobile;

	@FindBy(id = "dob")
	@CacheLookup
	private WebElement dateDOB;

	@FindBy(id = "title")
	@CacheLookup
	private WebElement drpTitle;

	@FindBy(id = "gender")
	@CacheLookup
	private WebElement drpGender;

	@FindBy(id = "idType")
	@CacheLookup
	private WebElement drpIDType;

	@FindBy(id = "idNumber")
	@CacheLookup
	private WebElement txtIDNum;

	@FindBy(id = "expiryDate")
	@CacheLookup
	private WebElement dateExpiryDate;

	@FindBy(id = "address1")
	@CacheLookup
	private WebElement txtAdd1;

	@FindBy(id = "address2")
	@CacheLookup
	private WebElement txtAdd2;

	@FindBy(id = "zipCode")
	@CacheLookup
	private WebElement txtZip;

	@FindBy(id = "state")
	@CacheLookup
	private WebElement txtState;

	@FindBy(id = "city")
	@CacheLookup
	private WebElement txtCity;

	@FindBy(id = "customerRequest")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Search']")
	@CacheLookup
	private WebElement btnFilterSearch;

	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement txtFilterMobile;

	@FindBy(xpath = "//*[normalize-space(text())='Proceed']")
	@CacheLookup
	private WebElement btnProceed;

	@FindBy(xpath = "//*[@id='successModal']//*[@class='close']")
	@CacheLookup
	private WebElement btnClose;

	private String upgKYC = "//*[text()='%s']//following-sibling::*//*[text()='Upgrade Kyc']";

	private By drpKYCType = By.id("statusId");

	private String verifyRecord = "(//td[text()='%s'])[last()]";

	public String customer = "(//*[text()='%s'])[1]";

	private String failureReason = "//*[text()='%s']//following-sibling::td[6]";

	// private By upgSuccess = By.xpath("//*[text()='KYC successfully upgraded to
	// FULL_KYC!']");

	private By msgSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Customer Registered Successfully']");

	private By verifyKYCField = By.xpath("//th[text()='Kyc Type']");

	private By btnUpgradeKYC = By.xpath("(//*[text()='Upgrade Kyc'])[1]");

	private By msgDuplicateNumber = By
			.xpath("//img[contains(@src,'x')]//following-sibling::div//*[text()='mobile number already exist']");

	private By msg101Firstname = By
			.xpath("//img[contains(@src,'x')]//following-sibling::div//*[text()='First Name already exits 101 times']");

	public WebDriver getDriver() {
		return this.driver;
	}

	public void verifyRecord(String comapnyName) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, comapnyName)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, comapnyName)));
		Assert.assertTrue(result);
	}

	public void verifySuccessMessage() {

	}

	public void enterFirstName(String firstname) {
		try {
			tHelper.sendKeys(txtFirstName, firstname);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("firstName")).sendKeys(firstname);
		}
	}

	public void enterLastName(String lastname) {
		try {
			tHelper.sendKeys(txtLastName, lastname);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("lastName")).sendKeys(lastname);
		}
	}

	public void enterEmail(String email) {
		try {
			tHelper.sendKeys(txtEmail, email);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("emailId")).sendKeys(email);
		}
	}

	public void enterMobile(String mobile) {
		try {
			tHelper.sendKeys(txtMobile, mobile);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobileNo")).sendKeys(mobile);
		}
	}

	public void enterDOB(String string) {
		try {
			tHelper.sendKeys(dateDOB, string);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("dob")).sendKeys(string);
		}
	}

	public void selectTitle(String title) {
		try {
			dHelper.SelectUsingVisibleValue(drpTitle, title);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("title")));
			s.selectByVisibleText(title);
		}
	}

	public void selectGender(String gender) {
		try {
			dHelper.SelectUsingVisibleValue(drpGender, gender);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("gender")));
			s.selectByVisibleText(gender);
		}
	}

	public void selectIDType(String idType) {
		try {
			dHelper.SelectUsingVisibleValue(drpIDType, idType);
		} catch (Exception e) {
			Select s = new Select(ObjectRepo.driver.findElement(By.id("idType")));
			s.selectByVisibleText(idType);
		}
	}

	public void enterIDNumber(String aadharidnum) {
		try {
			tHelper.sendKeys(txtIDNum, aadharidnum);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("idNumber")).sendKeys(aadharidnum);
		}
	}

	public void enterAddress1(String address1) {
		try {
			tHelper.sendKeys(txtAdd1, address1);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("address1")).sendKeys(address1);
		}
	}

	public void enterAddress2(String address2) {
		try {
			tHelper.sendKeys(txtAdd2, address2);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("address2")).sendKeys(address2);
		}
	}

	public void enterPostalCode(String postalcode) {
		try {
			tHelper.sendKeys(txtZip, postalcode);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("zipCode")).sendKeys(postalcode);
		}
	}

	public void enterState(String state) {
		try {
			tHelper.sendKeys(txtState, state);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("state")).sendKeys(state);
		}
	}

	public void enterCity(String city) {
		try {
			tHelper.sendKeys(txtCity, city);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("city")).sendKeys(city);
		}
	}

	public void clickOnSubmitButton() {
		try {
			Thread.sleep(2000);
			bHelper.click(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("customerRequest")).click();
		}
	}

	public void verifyAddCustomerSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgSuccess);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyKYCTypeField() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(verifyKYCField));
	}

	public void verifyKYCTypes() {
		clickOnSearch();
		List<String> values = dHelper.getAllDropDownValues(drpKYCType);
		if (values.size() > 3)
			Assert.assertTrue(false);
	}

	public void verifyUpgradeKYCButtonNotVisible() {
		Assert.assertFalse(gHelper.IsElementPresentQuick(btnUpgradeKYC));
	}

	public void search(String firstname, String mobile) {
		try {
			dHelper.SelectUsingVisibleValue(drpKYCType, "MIN_KYC");
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("statusId")));
			select.selectByVisibleText("MIN_KYC");
		}
		String s = "Select MIN_KYC\n";
		clickOnFilterSearch();
		Assert.assertTrue(gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, firstname))));
		try {
			tHelper.sendKeys(txtFilterMobile, mobile);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobileNo")).sendKeys(mobile);
		}
		s = s + "Enter \"Mobile Number\" : " + mobile + "\n";
		clickOnFilterSearch();
		s = s + "Click on \"Filter\" button\n";
		Assert.assertTrue(gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, firstname))));
		s = s + "Verified that customer is present in system";
		InitializeWebDriver.scenario.write(s);
	}

	private void clickOnFilterSearch() {
		try {
			bHelper.click(btnFilterSearch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
	}

	public void verifyUpgradeKYCButton() {
		Assert.assertTrue(gHelper.IsElementPresentQuick(btnUpgradeKYC));
	}

	public void clickOnUpgradeKYC(String firstname) {
		try {
			bHelper.click(By.xpath(String.format(upgKYC, firstname)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(upgKYC, firstname))).click();
		}
		try {
			bHelper.click(btnProceed);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Proceed']")).click();
		}
	}

	public void verifyUpgradeKYCStatus() {
//		boolean status = gHelper.IsElementPresentQuick(upgSuccess);
		gHelper.reloadPage();
//		Assert.assertTrue(status);
	}

	public void verifyAddCustomerDuplicateDetailsMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgDuplicateNumber);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyRecordNotFound(String firstName) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, firstName)));
		if (result)
			log.error(By.xpath(String.format(verifyRecord, firstName)));
		Assert.assertFalse(result);
	}

	public void verfyCustomerAdded(String customerMobileNo) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(customer, customerMobileNo)));
		if (!result)
			log.error(By.xpath(String.format(customer, customerMobileNo)));
		Assert.assertTrue(result);
	}

	public void getAlertForFirstName() {
		String errorMsg = gHelper.getAlert();
		gHelper.acceptAlert();
		if (!errorMsg.equalsIgnoreCase("please enter  minimum 3 characters in  first name field"))
			Assert.assertTrue(false);
	}

	public void getAlertForLastName() {
		String errorMsg = gHelper.getAlert();
		gHelper.acceptAlert();
		if (!errorMsg.equalsIgnoreCase("please enter  minimum 3 characters in  last name field"))
			Assert.assertTrue(false);
	}

	public String verifyCardUploadResult(String mobile) {
		String result;
		try {
			result = tHelper.getText(By.xpath(String.format(failureReason, mobile)));
		} catch (Exception e) {
			result = ObjectRepo.driver.findElement(By.xpath(String.format(failureReason, mobile))).getText();
		}
		return result;
	}

	public void verifyAddCustomer101FirstnameExitsMessage() {
		boolean result = gHelper.IsElementPresentQuick(msg101Firstname);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyOnlyOneRecord(String firstName) {
		int result = ObjectRepo.driver.findElements(By.xpath(String.format(verifyRecord, firstName))).size();
		if (result > 1)
			Assert.assertTrue(false);
	}

	public void searchForRecordInKYCList(String customerMobileNo) {
		clickOnSearch();
		String s = "Click on \"Search\" button\n";
		enterMobile(customerMobileNo);
		s = s + "Enter \"Mobile Number\" : " + customerMobileNo + "\n";
		clickOnFilterSearch();
		s = s + "Click on \"Submit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	public void clickOnSearch() {
		try {
			bHelper.click(btnSearch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
		}
	}

	public void verifySearchedRecordInKYCList(String customerMobileNo) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(customer, customerMobileNo)));
		if (!result)
			log.error(By.xpath(String.format(customer, customerMobileNo)));
	}

}
