package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class ClientPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(ClientPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;

	public ClientPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
	}

	/** Web Elements */

	@FindBy(id = "entityName")
	@CacheLookup
	private WebElement txtCompanyName;

	@FindBy(id = "firstName")
	@CacheLookup
	private WebElement txtFullName;

	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement txtMobile;

	@FindBy(id = "emailId")
	@CacheLookup
	private WebElement txtEmail;

	@FindBy(id = "password")
	@CacheLookup
	private WebElement txtPassword;

	@FindBy(id = "clientLogo")
	@CacheLookup
	private WebElement fileLogo;

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
	private WebElement dateDirectorDOB;

	@FindBy(id = "copyOfDirector")
	@CacheLookup
	private WebElement fileDirectorIDProofFront;

	@FindBy(id = "copyOfDirectorBack")
	@CacheLookup
	private WebElement fileDirectorIDProofBack;

	@FindBy(id = "gstCertificate")
	@CacheLookup
	private WebElement fileGSTCert;

	@FindBy(id = "incorporationCertificate")
	@CacheLookup
	private WebElement fileIncorporationCert;

	@FindBy(id = "projectionCommitment")
	@CacheLookup
	private WebElement fileProjectionCommitment;

	@FindBy(id = "companyPAN")
	@CacheLookup
	private WebElement fileCompanyPAN;

	@FindBy(id = "oneTimeFee")
	@CacheLookup
	private WebElement txtOneTimeFee;

	@FindBy(id = "revenueSharing")
	@CacheLookup
	private WebElement txtRevenueSharing;

	@FindBy(id = "monthlyMaintenance")
	@CacheLookup
	private WebElement txtMonthlyMaintenance;

	@FindBy(id = "physicalCardCost")
	@CacheLookup
	private WebElement txtPhysicalCardCost;

	@FindBy(id = "virtualCardCost")
	@CacheLookup
	private WebElement txtVirtualCardCost;

	@FindBy(id = "remarks")
	@CacheLookup
	private WebElement txtRemarks;

	@FindBy(id = "commercialDocument")
	@CacheLookup
	private WebElement fileCommercialDocument;

	@FindBy(id = "submit_button")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(id = "otpSubmitButton")
	@CacheLookup
	private WebElement btnOTPSubmit;

	@FindBy(id = "otp")
	@CacheLookup
	private WebElement txtOTP;

	@FindBy(id = "commercialSubmitButton")
	@CacheLookup
	private WebElement btnComSubmit;

	private By msgSuccess = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[text()='Client Added Successfully']");

	private By msgCommericalSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Commercial added successfully!']");

	private String verifyRecord = "//td[text()='%s']";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void clickOnSaveAndContinueButton() {
		try {
			bHelper.click(btnSubmit);
			log.info(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submit_button")).click();
		}
	}

	public void verifyAddClientSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgSuccess);
		if (!result)
			log.error(msgSuccess);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void enterCompanyName(String companyName) {
		try {
			tHelper.sendKeys(txtCompanyName, companyName);
			log.info(txtCompanyName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("entityName")).sendKeys(companyName);
		}
	}

	public void enterFullName(String fullName) {
		try {
			tHelper.sendKeys(txtFullName, fullName);
			log.info(txtFullName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("firstName")).sendKeys(fullName);
		}
	}

	public void enterMobileNumber(String mobile) {
		try {
			tHelper.sendKeys(txtMobile, mobile);
			log.info(txtMobile);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobileNo")).sendKeys(mobile);
		}
	}

	public void enterEmail(String email) {
		try {
			tHelper.sendKeys(txtEmail, email);
			log.info(txtEmail);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("emailId")).sendKeys(email);
		}
	}

	public void enterPassword(String password) {
		try {
			tHelper.sendKeys(txtPassword, password);
			log.info(txtPassword);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("password")).sendKeys(password);
		}
	}

	public void uploadClientLogo(String logoPath) {
		try {
			tHelper.sendKeys(fileLogo, logoPath);
			log.info(fileLogo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("clientLogo")).sendKeys(logoPath);
		}
	}

	public void enterNameOfDirector(String nameOfDirector) {
		try {
			tHelper.sendKeys(txtNameOfDirector, nameOfDirector);
			log.info(txtNameOfDirector);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("nameOfDirector")).sendKeys(nameOfDirector);
		}
	}

	public void enterCitizenship(String citizenship) {
		try {
			tHelper.sendKeys(txtCitizenShip, citizenship);
			log.info(txtCitizenShip);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("citizenship")).sendKeys(citizenship);
		}
	}

	public void enterAddress(String address) {
		try {
			tHelper.sendKeys(txtAddress, address);
			log.info(txtAddress);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("address")).sendKeys(address);
		}
	}

	public void enterDirectorDOB(String directorDOB) {
		try {
			tHelper.sendKeys(dateDirectorDOB, directorDOB);
			log.info(dateDirectorDOB);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("dobofDirector")).sendKeys(directorDOB);
		}
	}

	public void uploadDirectorIDProofFront(String directorIDProofFrontPath) {
		if (!directorIDProofFrontPath.isEmpty()) {
			try {
				tHelper.sendKeys(fileDirectorIDProofFront, directorIDProofFrontPath);
				log.info(fileDirectorIDProofFront);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("copyOfDirector")).sendKeys(directorIDProofFrontPath);
			}
		}
	}

	public void uploadDirectorIDProofBack(String directorIDProofBackPath) {
		if (!directorIDProofBackPath.isEmpty()) {
			try {
				tHelper.sendKeys(fileDirectorIDProofBack, directorIDProofBackPath);
				log.info(fileDirectorIDProofBack);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("copyOfDirectorBack")).sendKeys(directorIDProofBackPath);
			}
		}
	}

	public void uploadGSTCertificate(String gstCertPath) {
		if (!gstCertPath.isEmpty()) {
			try {
				tHelper.sendKeys(fileGSTCert, gstCertPath);
				log.info(fileGSTCert);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("gstCertificate")).sendKeys(gstCertPath);
			}
		}
	}

	public void uploadCompanyPAN(String companyPANPath) {
		if (!companyPANPath.isEmpty()) {
			try {
				tHelper.sendKeys(fileCompanyPAN, companyPANPath);
				log.info(fileCompanyPAN);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("companyPAN")).sendKeys(companyPANPath);
			}
		}
	}

	public void uploadIncorporationCertificate(String incorporationCertPath) {
		if (!incorporationCertPath.isEmpty()) {
			try {
				tHelper.sendKeys(fileIncorporationCert, incorporationCertPath);
				log.info(fileIncorporationCert);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("incorporationCertificate")).sendKeys(incorporationCertPath);
			}
		}
	}

	public void uploadProjectionCommitment(String projectionCommitmentPath) {
		if (!projectionCommitmentPath.isEmpty()) {
			try {
				tHelper.sendKeys(fileProjectionCommitment, projectionCommitmentPath);
				log.info(fileProjectionCommitment);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("projectionCommitment")).sendKeys(projectionCommitmentPath);
			}
		}
	}

	public void verifyRecord(String comapnyName) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, comapnyName)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, comapnyName)));
		Assert.assertTrue(result);
	}

	public void enterOneTimeFee(String onetimefee) {
		try {
			tHelper.sendKeys(txtOneTimeFee, onetimefee);
			log.info(txtOneTimeFee);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("oneTimeFee")).sendKeys(onetimefee);
		}
	}

	public void enterRevenueSharing(String revenuesharing) {
		try {
			tHelper.sendKeys(txtRevenueSharing, revenuesharing);
			log.info(txtRevenueSharing);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("revenueSharing")).sendKeys(revenuesharing);
		}
	}

	public void enterMonthlyMaintenance(String monthlymaintenance) {
		try {
			tHelper.sendKeys(txtMonthlyMaintenance, monthlymaintenance);
			log.info(txtMonthlyMaintenance);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("monthlyMaintenance")).sendKeys(monthlymaintenance);
		}
	}

	public void enterPhysicalCardCost(String physicalcardcost) {
		try {
			tHelper.sendKeys(txtPhysicalCardCost, physicalcardcost);
			log.info(txtPhysicalCardCost);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("physicalCardCost")).sendKeys(physicalcardcost);
		}
	}

	public void enterVirtualCardCost(String virtualcardcost) {
		try {
			tHelper.sendKeys(txtVirtualCardCost, virtualcardcost);
			log.info(txtVirtualCardCost);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("virtualCardCost")).sendKeys(virtualcardcost);
		}
	}

	public void enterRemarks(String remarks) {
		try {
			tHelper.sendKeys(txtRemarks, remarks);
			log.info(txtRemarks);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("remarks")).sendKeys(remarks);
		}
	}

	public void uploadCommercialDocument(String commercialDoc) {
		try {
			tHelper.sendKeys(fileCommercialDocument, commercialDoc);
			log.info(fileCommercialDocument);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("commercialDocument")).sendKeys(commercialDoc);
		}
	}

	public void clickOnCommercialSubmit() {
		try {
			bHelper.click(btnComSubmit);
			log.info(btnComSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("commercialSubmitButton")).click();
		}
	}

	public void verifyAddCommercialSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCommericalSuccess);
		if (!result)
			log.error(msgCommericalSuccess);
		Assert.assertTrue(result);
	}

	public void enterOTP(String otp) {
		try {
			tHelper.sendKeys(txtOTP, otp);
			log.info(txtOTP);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("otp")).sendKeys(otp);
		}
	}

	public void clickOnOTPSubmit() {
		try {
			bHelper.click(btnOTPSubmit);
			log.info(btnOTPSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("otpSubmitButton")).click();
		}
	}

	public void verifyOTPMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgCommericalSuccess);
		if (!result)
			log.error(msgCommericalSuccess);
		Assert.assertTrue(result);
	}

	public void clickOnOkButtonForClient() {
		Actions action = new Actions(ObjectRepo.driver);
		action.moveToElement(ObjectRepo.driver.findElement(msgSuccess), 0, 10).click().build().perform();
	}
}
