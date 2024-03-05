package com.zokudo.helper.PageObject;

import java.util.List;

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
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class CreateOfferPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(CreateOfferPage.class);
	private ButtonHelper bHelper;
	private DropDownHelper dHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;
	private WaitHelper wHelper;

	public CreateOfferPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		dHelper = new DropDownHelper(driver);
		gHelper = new GenericHelper(driver);
		wHelper = new WaitHelper(driver, ObjectRepo.reader);
	}

	/** Web Elements */

	@FindBy(xpath = "//*[text()='Pocket']")
	@CacheLookup
	private WebElement from;

	@FindBy(xpath = "//div[contains(@class,'page-sidebar')]")
	@CacheLookup
	private WebElement m;

	@FindBy(id = "brandName")
	@CacheLookup
	private WebElement txtBrandName;

	@FindBy(id = "brandCategory")
	@CacheLookup
	private WebElement drpBrandCategory;

	@FindBy(xpath = "//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtMCCGroup;

	@FindBy(id = "description")
	@CacheLookup
	private WebElement txtDescription;

	@FindBy(id = "mechantLocation")
	@CacheLookup
	private WebElement txtMechantLocation;

	@FindBy(id = "webUrl")
	@CacheLookup
	private WebElement txtWebUrl;

	@FindBy(id = "minPrice")
	@CacheLookup
	private WebElement txtMinPrice;

	@FindBy(id = "maxPrice")
	@CacheLookup
	private WebElement txtMaxPrice;

	@FindBy(id = "categoryLogo1")
	@CacheLookup
	private WebElement fileCategoryLogo1;

	@FindBy(id = "categoryLogo2")
	@CacheLookup
	private WebElement fileCategoryLogo2;

	@FindBy(id = "categoryLogo3")
	@CacheLookup
	private WebElement fileCategoryLogo3;

	@FindBy(id = "brandLogo")
	@CacheLookup
	private WebElement fileBrandLogo;

	@FindBy(id = "offerLogo")
	@CacheLookup
	private WebElement fileOfferLogo;

	@FindBy(id = "merchantRequest")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(id = "brandId")
	@CacheLookup
	private WebElement drpBrandId;

	@FindBy(id = "mId")
	@CacheLookup
	private WebElement txtMerchantId;

	@FindBy(id = "emailId")
	@CacheLookup
	private WebElement txtEmail;

	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement txtMobile;

	@FindBy(id = "merchantName")
	@CacheLookup
	private WebElement txtMerchantName;

	@FindBy(id = "terminalAddBtn")
	@CacheLookup
	private WebElement iconPlus;

	@FindBy(xpath = "//*[normalize-space(text())='Add Terminal']")
	@CacheLookup
	private WebElement btnTerminalAdd;

	@FindBy(xpath = "//button[text()='ADD']")
	@CacheLookup
	private WebElement btnAdd;

	@FindBy(id = "merchantId")
	@CacheLookup
	private WebElement drpMerchantId;

	@FindBy(id = "defaultCheckId")
	@CacheLookup
	private WebElement cbDefault;

	@FindBy(id = "defaultProgramCode")
	@CacheLookup
	private WebElement drpDefaultProgram;

	@FindBy(id = "lendingCheckId")
	@CacheLookup
	private WebElement cbLendingId;

	@FindBy(id = "lendingProgramCode")
	@CacheLookup
	private WebElement drpLendingProgramCode;

	@FindBy(id = "distributorCheckId")
	@CacheLookup
	private WebElement cbDistributorId;

	@FindBy(id = "distributorProgramCode")
	@CacheLookup
	private WebElement drpDistributorProgramCode;

	@FindBy(id = "category")
	@CacheLookup
	private WebElement drpCategory;

	@FindBy(id = "reportrange")
	@CacheLookup
	private WebElement txtReportRange;

	@FindBy(name = "daterangepicker_start")
	@CacheLookup
	private WebElement txtFromDate;

	@FindBy(name = "daterangepicker_end")
	@CacheLookup
	private WebElement txtToDate;

	@FindBy(xpath = "//button[text()='Apply']")
	@CacheLookup
	private WebElement btnApply;

	@FindBy(id = "cashbackPoint")
	@CacheLookup
	private WebElement txtCashbackValue;

	@FindBy(id = "submitButton")
	@CacheLookup
	private WebElement btnOfferSubmit;

	@FindBy(xpath = "//span[contains(@aria-owns,'merchantId')]//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtMerchantIdSearch;

	@FindBy(xpath = "//span[contains(@aria-owns,'defaultProgramCode')]//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtDefaultProgramCodeSearch;

	@FindBy(xpath = "//span[contains(@aria-owns,'lendingProgramCode')]//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtLendingProgramCodeSearch;

	@FindBy(xpath = "//span[contains(@aria-owns,'distributorProgramCode')]//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtDistributorProgramCodeSearch;

	@FindBy(xpath = "//a[contains(@onclick,'Search')]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(id = "brandName")
	@CacheLookup
	private WebElement txSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Filter']")
	@CacheLookup
	private WebElement btnFilter;

	@FindBy(xpath = "//*[normalize-space(text())='Search']")
	@CacheLookup
	private WebElement btnSearchMerchant;

	@FindBy(id = "blockBtnId\"")
	@CacheLookup
	private WebElement blockBtnId;

	@FindBy(id = "terminateButton")
	@CacheLookup
	private WebElement terminateButton;

	@FindBy(xpath = "//*[text()='Edit']")
	@CacheLookup
	private WebElement btnEdit;

	private String txtTerminal = "(//*[@name='terminalId'])[%s]";

	private By msgBrandSuccess = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[text()='Brand Added Successfully!']");

	private By msgMerchantSuccess = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[text()='Merchant Added Successfully!']");

	private By msgMerchantUpdateSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Merchant Updated Successfully!']");

	private By msgMerchantFailure = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Failed to add merchant! Brand Already Exists for this Merchant.')]");

	private By msgMerchantIdCombinationError = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Failed to add merchant! the combination of merchantId and one or more TerminalIds is already present!')]");

	private By msgMerchantIdUpdateError = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Unable to update Merchant.the combination of merchantId and one or more TerminalIds is already present!')]");

	private By msgOfferSuccess = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Cashback and brand offer updated successfully']");

	private By msgOfferFailure = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[contains(text(),'Offer') and contains(text(),'is active for this Brand and Merchant! Please terminate existing offer to configure new one!')]");

	private By terminateMessage = By.xpath(
			"//img[contains(@src,'source')]//following-sibling::div//*[text()='Merchant Cashback Offers terminated successfully!']");

	private By removeTerminals = By.xpath("//*[contains(@class,'delete-record')]");

	private String verifyRecord = "(//td[contains(text(),'%s')])[1]";

//	private String drpValue = "//li[contains(@id,'select2') and text()='%s']";

	private String terminalCount = "//*[text()='Terminal Count : %s']";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void enterBrandName(String brandName) {
		try {
			tHelper.sendKeys(txtBrandName, brandName);
			log.info(txtBrandName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("brandName")).sendKeys(brandName);
		}
	}

	public void selectBrandCategory(String[] category) {
		log.info(drpBrandCategory);
		for (int i = 0; i < category.length; i++) {
//			bHelper.click(drpBrandCategory);
//			log.info(drpBrandCategory);
			try {
				tHelper.sendKeys(txtMCCGroup, category[i] + Keys.ENTER);
				log.info(txtMCCGroup);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath("//input[contains(@class,'select2-search')]"))
						.sendKeys(category[i] + Keys.ENTER);
			}
		}
	}

	public void enterDescription(String description) {
		try {
			tHelper.sendKeys(txtDescription, description);
			log.info(txtDescription);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("description")).sendKeys(description);
		}
	}

	public void enterLocation(String location) {
		if (!location.isEmpty()) {
			try {
				tHelper.sendKeys(txtMechantLocation, location);
				log.info(txtMechantLocation);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("mechantLocation")).sendKeys(location);
			}
		}
	}

	public void enterWebURL(String url) {
		try {
			tHelper.sendKeys(txtWebUrl, url);
			log.info(txtWebUrl);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("webUrl")).sendKeys(url);
		}
	}

	public void enterMinPrice(String minPrice) {
		try {
			tHelper.sendKeys(txtMinPrice, minPrice);
			log.info(txtMinPrice);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("minPrice")).sendKeys(minPrice);
		}
	}

	public void enterMaxPrice(String maxPrice) {
		try {
			tHelper.sendKeys(txtMaxPrice, maxPrice);
			log.info(txtMaxPrice);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("maxPrice")).sendKeys(maxPrice);
		}
	}

	public void uploadFirstCategoryLogo(String path) {
		if (!path.isEmpty()) {
			try {
				tHelper.sendKeys(fileCategoryLogo1, path);
				log.info(fileCategoryLogo1);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("categoryLogo1")).sendKeys(path);
			}
		}
	}

	public void uploadSecondCategoryLogo(String path) {
		if (!path.isEmpty()) {
			try {
				tHelper.sendKeys(fileCategoryLogo2, path);
				log.info(fileCategoryLogo2);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("categoryLogo2")).sendKeys(path);
			}
		}
	}

	public void uploadThirdCategoryLogo(String path) {
		if (!path.isEmpty()) {
			try {
				tHelper.sendKeys(fileCategoryLogo3, path);
				log.info(fileCategoryLogo3);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("categoryLogo3")).sendKeys(path);
			}
		}
	}

	public void uploadBrandLogo(String path) {
		try {
			tHelper.sendKeys(fileBrandLogo, path);
			log.info(fileBrandLogo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("brandLogo")).sendKeys(path);
		}
	}

	public void uploadOfferLogo(String path) {
		try {
			tHelper.sendKeys(fileOfferLogo, path);
			log.info(fileOfferLogo);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("offerLogo")).sendKeys(path);
		}
	}

	public void clickOnSubmitButton() {
		try {
			Thread.sleep(5000);
			bHelper.click(btnSubmit);
			log.info(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[@id='merchantRequest']")).click();
		}
	}

	public void verifyAddBrandSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgBrandSuccess);
		if (!result)
			log.error(msgBrandSuccess);
		Assert.assertTrue(result);
	}

	public void clickOnSearch() {
		try {
			bHelper.click(btnSearch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
		}
	}

	public void clickOnFilter() {
		try {
			bHelper.click(btnFilter);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Filter']")).click();
		}
	}

	public void enterBrandInSearch(String brandName) {
		try {
			tHelper.sendKeys(txSearch, brandName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("brandName")).sendKeys(brandName);
		}
	}

	public void verifyRecord(String search) {
		clickOnSearch();
		enterBrandInSearch(search);
//		clickOnFilter();
		try {
			bHelper.click(btnSearchMerchant);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, search)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, search)));
		Assert.assertTrue(result);
	}

	public void verifyBrandRecord(String search) {
		clickOnSearch();
		enterBrandInSearch(search);
		clickOnFilter();
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, search)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, search)));
		Assert.assertTrue(result);
	}

	public void verifyAddMerchantSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgMerchantSuccess);
		if (!result)
			log.error(msgMerchantSuccess);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyUpdateMerchantSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgMerchantUpdateSuccess);
		if (!result)
			log.error(msgMerchantUpdateSuccess);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void selectBrand(String brand) {
		try {
			dHelper.SelectUsingVisibleValue(drpBrandId, brand);
			log.info(drpBrandId);
		} catch (Exception e) {
			Select select = new Select(ObjectRepo.driver.findElement(By.id("brandId")));
			select.selectByVisibleText(brand);
		}
	}

	public void enterMerchantId(String merchantId) {
		try {
			tHelper.sendKeys(txtMerchantId, merchantId);
			log.info(txtMerchantId);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mId")).sendKeys(merchantId);
		}
	}

	public void enterEmailId(String email) {
		try {
			tHelper.sendKeys(txtEmail, email);
			log.info(txtEmail);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("emailId")).sendKeys(email);
		}
	}

	public void enterMobile(String mobile) {
		try {
			tHelper.sendKeys(txtMobile, mobile);
			log.info(txtMobile);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("mobileNo")).sendKeys(mobile);
		}
	}

	public void enterMerchantName(String merchantName) {
		try {
			tHelper.sendKeys(txtMerchantName, merchantName);
			log.info(txtMerchantName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("merchantName")).sendKeys(merchantName);
		}
	}

	public String addTerminal(String[] terminals, String s) {
		clickOnPlusIcon();
		wHelper.hardWait(1200);
		s = s + "Click on \"+\" icon\n";
		removeAllExistingTerminal();
		for (int i = 0; i < terminals.length; i++) {
			try {
				bHelper.click(btnTerminalAdd);
				wHelper.hardWait(1200);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Add Terminal']")).click();
			}
			log.info(btnTerminalAdd);
			s = s + "Click on \"Add\" button\n";
			try {
				tHelper.sendKeys(By.xpath(String.format(txtTerminal, i + 1)), terminals[i]);
				log.info(By.xpath(String.format(txtTerminal, i + 1)));
				s = s + "Enter \"Terminal Name\" : " + terminals[i] + "\n";
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath(String.format(txtTerminal, i + 1))).sendKeys(terminals[i]);
			}
		}
		wHelper.hardWait(1200);
		try {
			bHelper.click(btnAdd);
			log.info(btnAdd);
			s = s + "Click on \"Add\" button\n";
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//button[text()='ADD']")).click();
		}
		return s;
	}

	private void clickOnPlusIcon() {
		try {
			bHelper.click(iconPlus);
			log.info(iconPlus);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("terminalAddBtn")).click();
		}
	}

	private void removeAllExistingTerminal() {
		List<WebElement> list = gHelper.getElements(removeTerminals);
		for (int i = 0; i < list.size(); i++) {
			try {
				bHelper.click(list.get(i));
				gHelper.acceptAlert();
				gHelper.acceptAlert();
				gHelper.acceptAlert();
				clickOnPlusIcon();
				list = gHelper.getElements(removeTerminals);
			} catch (Exception e) {
				list.get(i).click();
			}
		}
	}

	public void verifyCreateOfferSuccessMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgOfferSuccess);
		if (!result)
			log.error(msgOfferSuccess);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void clickOnOfferSubmitButton() {
		try {
			bHelper.click(btnOfferSubmit);
			log.info(btnOfferSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitButton")).click();
		}
	}

	public void selectMerchantId(String[] merchantId) {
		for (int i = 0; i < merchantId.length; i++) {
			try {
				bHelper.click(drpMerchantId);
				log.info(drpMerchantId);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath(
						"//select[@id='merchantId']//following-sibling::*//input[contains(@class,'select2-search')]"))
						.click();
			}
			try {
				tHelper.sendKeys(txtMerchantIdSearch, merchantId[i] + Keys.ENTER);
				log.info(txtMerchantIdSearch);
			} catch (Exception e) {
				ObjectRepo.driver
						.findElement(By.xpath(
								"//span[contains(@aria-owns,'merchantId')]//input[contains(@class,'select2-search')]"))
						.sendKeys(merchantId[i] + Keys.ENTER);
			}
		}
	}

	public void selectDefaultProgramCode(String[] programCode) {
		if (programCode.length != 0) {
			try {
				bHelper.click(cbDefault);
				log.info(cbDefault);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.id("defaultCheckId")).click();
			}
			for (int i = 0; i < programCode.length; i++) {
				try {
					bHelper.click(drpDefaultProgram);
					log.info(drpDefaultProgram);
				} catch (Exception e) {
					ObjectRepo.driver.findElement(By.xpath(
							"//select[@id='defaultProgramCode']//following-sibling::*//input[contains(@class,'select2-search')]"))
							.click();
				}
				try {
					tHelper.sendKeys(txtDefaultProgramCodeSearch, programCode[i] + Keys.ENTER);
					log.info(txtDefaultProgramCodeSearch);
				} catch (Exception e) {
					ObjectRepo.driver.findElement(By.xpath(
							"//span[contains(@aria-owns,'defaultProgramCode')]//input[contains(@class,'select2-search')]"))
							.sendKeys(programCode[i] + Keys.ENTER);
				}
			}
		}
	}

	public void selecLendingProgramCode(String[] lendingCode) {
		if (lendingCode.length != 0) {
			bHelper.click(cbLendingId);
			log.info(cbDefault);
			for (int i = 0; i < lendingCode.length; i++) {
				try {
					bHelper.click(drpLendingProgramCode);
					log.info(drpLendingProgramCode);
				} catch (Exception e) {
					ObjectRepo.driver.findElement(By.xpath(
							"//select[@id='lendingProgramCode']//following-sibling::*//input[contains(@class,'select2-search')]"))
							.click();
				}
				try {
					tHelper.sendKeys(txtLendingProgramCodeSearch, lendingCode[i] + Keys.ENTER);
					log.info(txtLendingProgramCodeSearch);
				} catch (Exception e) {
					ObjectRepo.driver.findElement(By.xpath(
							"//span[contains(@aria-owns,'lendingProgramCode')]//input[contains(@class,'select2-search')]"))
							.sendKeys(lendingCode[i] + Keys.ENTER);
				}
			}
		}
	}

	public void selecDistributorProgramCode(String[] distributorCode) {
		if (distributorCode.length != 0) {
			bHelper.click(cbDistributorId);
			log.info(cbDistributorId);
			for (int i = 0; i < distributorCode.length; i++) {
				try {
					bHelper.click(drpDistributorProgramCode);
					log.info(drpDistributorProgramCode);
				} catch (Exception e) {
					ObjectRepo.driver.findElement(By.xpath(
							"//select[@id='distributorProgramCode']//following-sibling::*//input[contains(@class,'select2-search')]"))
							.click();
				}
				try {
					tHelper.sendKeys(txtDistributorProgramCodeSearch, distributorCode[i] + Keys.ENTER);
					log.info(txtDistributorProgramCodeSearch);
				} catch (Exception e) {
					ObjectRepo.driver.findElement(By.xpath(
							"//span[contains(@aria-owns,'distributorProgramCode')]//input[contains(@class,'select2-search')]"))
							.sendKeys(distributorCode[i] + Keys.ENTER);
				}
			}
		}
	}

	public void selectCategory(String category) {
		dHelper.SelectUsingVisibleValue(drpCategory, category);
		log.info(drpCategory);
	}

	public void selectOfferValidity(String start, String end) {
		if (!start.isEmpty()) {
			bHelper.click(txtReportRange);
			log.info(txtReportRange);
			tHelper.clearAndSendKeys(txtFromDate, start);
			log.info(txtFromDate);
			tHelper.clearAndSendKeys(txtToDate, end);
			log.info(txtToDate);
			bHelper.click(btnApply);
			log.info(btnApply);
		}
	}

	public void selectCashbackType(String cashbackType) {
		try {
			bHelper.click(By.id(cashbackType.toLowerCase()));
			log.info(By.id(cashbackType.toLowerCase()));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id(cashbackType.toLowerCase())).click();
		}
	}

	public void enterCashbackValue(String value) {
		try {
			tHelper.sendKeys(txtCashbackValue, value);
			log.info(txtCashbackValue);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("cashbackPoint")).sendKeys(value);
		}
	}

	public void verifyAddMerchantFailureMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgMerchantFailure);
		if (!result)
			log.error(msgMerchantFailure);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyCreateOfferFailureMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgOfferFailure);
		if (!result)
			log.error(msgOfferFailure);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyMerchantRecord(String merchantId) {
		searchMerchant(merchantId);
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, merchantId)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, merchantId)));
		Assert.assertTrue(result);
	}

	public void searchMerchant(String merchantId) {
		try {
			bHelper.click(btnSearch);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//a[contains(@onclick,'Search')]")).click();
		}
		try {
			tHelper.sendKeys(txtMerchantId, merchantId);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[@id='merchantName']")).sendKeys(merchantId);
		}
		try {
			bHelper.click(btnSearchMerchant);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[normalize-space(text())='Search']")).click();
		}
	}

	public void terminateOffer(String brandname) {
		try {
			bHelper.click(blockBtnId);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("blockBtnId\"")).click();
		}
		try {
			bHelper.click(terminateButton);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("terminateButton")).click();
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		Assert.assertTrue(gHelper.IsElementPresentQuick(terminateMessage));
		gHelper.reloadPage();
	}

	public void clickOnEditButton() {
		try {
			bHelper.click(btnEdit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[text()='Edit']")).click();
		}
	}

	public void verifyTerminalCount(int i) {
		Assert.assertTrue(gHelper.IsElementPresentQuick(By.xpath(String.format(terminalCount, i))));
	}

	public void verifyAddMerchantIdCombinationErrorMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgMerchantIdCombinationError);
		if (!result)
			log.error(msgMerchantIdCombinationError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}

	public void verifyUpdateMerchantIdCombinationErrorMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgMerchantIdUpdateError);
		if (!result)
			log.error(msgMerchantIdUpdateError);
		gHelper.reloadPage();
		Assert.assertTrue(result);
	}
}