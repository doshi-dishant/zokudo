package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zokudo.constants.Constants;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class NavigationPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(NavigationPage.class);
	private ButtonHelper bHelper;
	private GenericHelper gHelper;
	private WaitHelper wHelper;

	public NavigationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		gHelper = new GenericHelper(driver);
		wHelper = new WaitHelper(driver, ObjectRepo.reader);
	}

	/** Web Elements */
	private By checkBulkOperationMenuIsOpen = By
			.xpath("//li[contains(@class,'openable active')]//*[text()='Bulk Operations']");

	@FindBy(xpath = "//*[text()='Bulk Operations']")
	@CacheLookup
	private WebElement menuBulkOperations;

	@FindBy(xpath = "//*[text()='Bulk Upload']")
	@CacheLookup
	private WebElement subMenuBulkUpload;

	@FindBy(xpath = "//*[text()='Card Upload Summary']")
	@CacheLookup
	private WebElement subMenuCardUploadSummary;

	@FindBy(xpath = "//*[text()='Bulk Card Report']")
	@CacheLookup
	private WebElement subMenuBulkCardReport;

	@FindBy(xpath = "//*[text()='Bulk Card Load Report']")
	@CacheLookup
	private WebElement subMenuBulkCardLoadReport;

	private By checkCardsMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='Cards']");

	@FindBy(xpath = "//*[text()='Cards']")
	@CacheLookup
	private WebElement menuCard;

	@FindBy(xpath = "//*[text()='Transaction Report']")
	@CacheLookup
	private WebElement subMenuTransactionReport;

	@FindBy(xpath = "//*[text()='Load Reversal Report']")
	@CacheLookup
	private WebElement subMenuLoadReversalReport;

	private By checkCardInventoryMenuIsOpen = By
			.xpath("//li[contains(@class,'openable active')]//*[text()='Card Inventory']");

	@FindBy(xpath = "//*[text()='Card Inventory']")
	@CacheLookup
	private WebElement menuCardInventory;

	@FindBy(xpath = "//*[text()='List Inventory']")
	@CacheLookup
	private WebElement submenulistInventory;

	@FindBy(xpath = "//*[text()='Bulk Card Upload']")
	@CacheLookup
	private WebElement submenuBulkCardInventory;

	@FindBy(xpath = "//*[text()='Bulk Inventory Upload Summary']")
	@CacheLookup
	private WebElement submenuBulkInvUploadSummary;

	@FindBy(xpath = "//*[text()='Bulk Inventory Upload Report']")
	@CacheLookup
	private WebElement submenuBulkInvUploadReport;

	private By checkOnboardBusinessMenuIsOpen = By
			.xpath("//li[contains(@class,'openable active')]//*[text()='Onboard Business']");

	@FindBy(xpath = "//*[text()='Onboard Business']")
	@CacheLookup
	private WebElement menuOnboardBusiness;

	@FindBy(xpath = "//*[text()='Add Business']")
	@CacheLookup
	private WebElement subMenuAddBusiness;

	@FindBy(xpath = "//*[text()='List Business ']")
	@CacheLookup
	private WebElement subMenuListBusiness;

	private By checkMerchantMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='Merchant']");

	@FindBy(xpath = "//*[text()='Merchant']")
	@CacheLookup
	private WebElement menuMerchant;

	@FindBy(xpath = "//*[text()='Add Brand']")
	@CacheLookup
	private WebElement subMenuAddBrand;

	@FindBy(xpath = "//*[text()='List Brand']")
	@CacheLookup
	private WebElement subMenuListBrand;

	@FindBy(xpath = "//*[text()='Create Offer']")
	@CacheLookup
	private WebElement subMenuCreateOffer;

	@FindBy(xpath = "//*[text()='List Offer']")
	@CacheLookup
	private WebElement subMenuListOffer;

	@FindBy(xpath = "//*[text()='Add Merchant']")
	@CacheLookup
	private WebElement subMenuAddMerchant;

	@FindBy(xpath = "//*[text()='Merchant List']")
	@CacheLookup
	private WebElement subMenuListMerchant;

	private By checkClientMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='Client']");

	@FindBy(xpath = "//*[text()='Client']")
	@CacheLookup
	private WebElement menuClient;

	@FindBy(xpath = "//*[text()='Add Client']")
	@CacheLookup
	private WebElement subMenuAddClient;

	@FindBy(xpath = "//*[text()='List Client']")
	@CacheLookup
	private WebElement subMenuListClient;

	By checkCustomerMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='Customer']");

	@FindBy(xpath = "//*[text()='Customer']")
	@CacheLookup
	private WebElement menuCustomer;

	@FindBy(xpath = "//*[text()='Add Customer']")
	@CacheLookup
	private WebElement subMenuAddCustomer;

	@FindBy(xpath = "//*[text()='Customer List']")
	@CacheLookup
	private WebElement subMenuListCustomer;

	@FindBy(xpath = "//*[text()='Dashboard Balance']")
	@CacheLookup
	private WebElement menuDashboardBalance;

	@FindBy(xpath = "//*[text()='Dashboard']")
	@CacheLookup
	private WebElement menuDashboard;

	By checkEODReportListMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='EOD Report List']");

	@FindBy(xpath = "//*[text()='EOD Report List']")
	@CacheLookup
	private WebElement menuEODReportList;

	@FindBy(xpath = "//*[text()='Report List']")
	@CacheLookup
	private WebElement subMenuReportList;

	By checkKitAssignMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='KIT Assign']");

	By checkDistributor = By.xpath("//li[contains(@class,'openable active')]//*[text()='Distributor']");

	By checkRetailer = By.xpath("//li[contains(@class,'openable active')]//*[text()='Retailer']");

	By checkCardDetails = By.xpath("//li[contains(@class,'openable active')]//*[text()='Card Details']");

	@FindBy(xpath = "//*[text()='Card Details']")
	@CacheLookup
	private WebElement menuCardDetails;

	@FindBy(xpath = "//*[text()='Distributor']")
	@CacheLookup
	private WebElement menuDistributor;

	@FindBy(xpath = "//*[text()='Add Distributor']")
	@CacheLookup
	private WebElement subMenuAddDistributor;

	@FindBy(xpath = "//*[text()='Add Retailer']")
	@CacheLookup
	private WebElement subMenuAddRetailer;

	@FindBy(xpath = "//*[text()=' KIT Assign Distributor']")
	@CacheLookup
	private WebElement subMenuKitAssignDistributor;

	@FindBy(xpath = "//*[text()=' KIT Assign Retailer']")
	@CacheLookup
	private WebElement subMenuKitAssignRetailer;

	@FindBy(xpath = "//*[text()='List Retailer']")
	@CacheLookup
	private WebElement subMenuListRetailer;

	@FindBy(xpath = "//*[text()='List Distributor']")
	@CacheLookup
	private WebElement subMenuListDistributor;

	@FindBy(xpath = "//*[text()='Retailer']")
	@CacheLookup
	private WebElement menuRetailer;

	@FindBy(xpath = "//*[text()='KIT Assign']")
	@CacheLookup
	private WebElement menuKITAssign;

	@FindBy(xpath = "//*[text()='Single/Bulk KIT Assign']")
	@CacheLookup
	private WebElement subMenuSingleOrBulkKitAssign;

	@FindBy(xpath = "//*[text()='Card Issuance']")
	@CacheLookup
	private WebElement subMenuCardIssuance;

	@FindBy(xpath = "//*[text()='Download Card Details']")
	@CacheLookup
	private WebElement subMenuDownloadCardDetails;

	@FindBy(xpath = "//*[text()='Card List']")
	@CacheLookup
	private WebElement subMenuCardList;

	@FindBy(xpath = "//*[text()='Load Card']")
	@CacheLookup
	private WebElement subMenuLoadCard;

	@FindBy(xpath = "//*[text()='Card TO Card Transfer']")
	@CacheLookup
	private WebElement subMenuCardToCardTransfer;

	@FindBy(xpath = "//*[text()='Load Reversal']")
	@CacheLookup
	private WebElement subMenuLoadReversal;

	@FindBy(xpath = "//*[text()='List Assigned KIT']")
	@CacheLookup
	private WebElement subMenuListAssignedKIT;

	@FindBy(xpath = "//*[text()='List Inventory']")
	@CacheLookup
	private WebElement subMenuListInventory;

	@FindBy(xpath = "//*[text()='Inventory Summary']")
	@CacheLookup
	private WebElement subMenuInventorySummary;

	private By checkOnboardProgramMenuIsOpen = By
			.xpath("//li[contains(@class,'openable active')]//*[text()='Onboard Program']");

	@FindBy(xpath = "//*[text()='Onboard Program']")
	@CacheLookup
	private WebElement menuOnboardProgram;

	@FindBy(xpath = "//*[text()='Add Program']")
	@CacheLookup
	private WebElement subMenuAddProgram;

	@FindBy(xpath = "//*[text()='List Program']")
	@CacheLookup
	private WebElement subMenuListProgram;

	By checkPocketMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='Pocket']");

	@FindBy(xpath = "//*[text()='Pocket']")
	@CacheLookup
	private WebElement menuPocket;

	@FindBy(xpath = "//*[text()='Add Pocket']")
	@CacheLookup
	private WebElement subMenuAddPocket;

	@FindBy(xpath = "//*[text()='List Pocket ']")
	@CacheLookup
	private WebElement subMenuListPocket;

	By checkPrefundMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='Prefund']");

	@FindBy(xpath = "//*[text()='Prefund']")
	@CacheLookup
	private WebElement menuPrefund;

	@FindBy(xpath = "//*[text()='List Prefund']")
	@CacheLookup
	private WebElement subMenuListPrefund;

	@FindBy(xpath = "//*[text()='Customer Upload Summary']")
	@CacheLookup
	private WebElement subMenuCustomerUploadSummary;

	@FindBy(xpath = "//*[text()='Bulk Customer Report']")
	@CacheLookup
	private WebElement subMenuBulkCustomerReport;

	By checkVirtualAccountMenuIsOpen = By
			.xpath("//li[contains(@class,'openable active')]//*[text()='Virtual Account']");

	@FindBy(xpath = "//*[text()='Virtual Account']")
	@CacheLookup
	private WebElement menuVirtualAccount;

	@FindBy(xpath = "//*[text()='List Virtual Account']")
	@CacheLookup
	private WebElement subMenuListVirtualAccount;

	@FindBy(xpath = "//*[text()='Prefund Request']")
	@CacheLookup
	private WebElement subMenuPrefundRequest;

	By checkLimitMenuIsOpen = By.xpath("//li[contains(@class,'openable active')]//*[text()='Limit']");

	@FindBy(xpath = "//*[text()='Limit']")
	@CacheLookup
	private WebElement menuLimit;

	@FindBy(xpath = "//*[text()='Set Wallet Limit']")
	@CacheLookup
	private WebElement subMenuSetWalletLimit;

	@FindBy(xpath = "//*[text()='Set KYC Limit']")
	@CacheLookup
	private WebElement subMenuSetKYCLimit;

	@FindBy(xpath = "//*[text()='Kyc List']")
	@CacheLookup
	private WebElement subMenuKYCList;

	private By checkMCCMarkUpConfigMenuIsOpen = By
			.xpath("//li[contains(@class,'openable active')]//*[text()='MCC Mark-Up Config']");

	@FindBy(xpath = "//*[text()='MCC Mark-Up Config']")
	@CacheLookup
	private WebElement menuMCCMarkUpConfig;

	@FindBy(xpath = "//*[text()='SET MCC Markup']")
	@CacheLookup
	private WebElement subMenuSetMCCMarkup;

	@FindBy(xpath = "//*[text()='List MCC Markup']")
	@CacheLookup
	private WebElement subMenuListMCCMarkup;

	@FindBy(xpath = "//*[text()='MCC Markup Upload Summary']")
	@CacheLookup
	private WebElement subMenuMCCMarkupUploadSummary;

	@FindBy(xpath = "//*[text()='MCC Markup Upload Report']")
	@CacheLookup
	private WebElement subMenuMCCMarkupUploadReport;

	@FindBy(xpath = "//*[text()='Fee Configuration']")
	@CacheLookup
	private WebElement subMenuFeeConfiguration;

	@FindBy(xpath = "//*[text()='Fee | Revenue Management']")
	@CacheLookup
	private WebElement menuFeeRevenueManagement;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void navigateToBulkOperations() {
		try {
			if (!gHelper.IsElementPresentQuick(checkBulkOperationMenuIsOpen)) {
				bHelper.click(menuBulkOperations);
				log.info(menuBulkOperations);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToBulkUpload() {
		try {
			bHelper.click(subMenuBulkUpload);
			log.info(subMenuBulkUpload);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getBulkUploadURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCardUploadSummary() {
		try {
			bHelper.click(subMenuCardUploadSummary);
			log.info(subMenuCardUploadSummary);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCardUploadSummaryURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToBulkCardReport() {
		try {
			bHelper.click(subMenuBulkCardReport);
			log.info(subMenuBulkCardReport);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getBulkCardReportURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToBulkCardLoadReport() {
		try {
			bHelper.click(subMenuBulkCardLoadReport);
			log.info(subMenuBulkCardLoadReport);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getBulkCardLoadReportURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCard() {
		try {
			if (!gHelper.IsElementPresentQuick(checkCardsMenuIsOpen)) {
				bHelper.click(menuCard);
				log.info(menuCard);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToTransactionReport() {
		try {
			bHelper.click(subMenuTransactionReport);
			log.info(subMenuTransactionReport);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCardTransactionReportURl());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToLoadReversalReport() {
		try {
			bHelper.click(subMenuLoadReversalReport);
			log.info(subMenuLoadReversalReport);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCardLoadReversalReportURl());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void clickonCardInventory() {
		try {
			if (!gHelper.IsElementPresentQuick(checkCardInventoryMenuIsOpen)) {
				bHelper.click(menuCardInventory);
				log.info(menuCardInventory);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToBulkCardupload() {
		try {
			bHelper.click(submenuBulkCardInventory);
			log.info(submenuBulkCardInventory);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCardInventoryUploadURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToBulkInvUploadReport() {
		try {
			bHelper.click(submenuBulkInvUploadReport);
			log.info(submenuBulkInvUploadReport);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getBulkCardInvReportURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void clickonListInventory() {
		try {
			bHelper.click(submenulistInventory);
			log.info(submenulistInventory);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListInventoryURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToBulkInvUploadSummary() {
		try {
			bHelper.click(submenuBulkInvUploadSummary);
			log.info(submenuBulkInvUploadSummary);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getBulkCardInvUploadSummaryURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToOnboardBusiness() {
		try {
			if (!gHelper.IsElementPresentQuick(checkOnboardBusinessMenuIsOpen)) {
				bHelper.click(menuOnboardBusiness);
				log.info(menuOnboardBusiness);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToAddBusiness() {
		try {
			bHelper.click(subMenuAddBusiness);
			log.info(subMenuAddBusiness);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddBusinessURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListBusiness() {
		try {
			bHelper.click(subMenuListBusiness);
			log.info(subMenuListBusiness);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListBusinessURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToMerchant() {
		try {
			if (!gHelper.IsElementPresentQuick(checkMerchantMenuIsOpen)) {
				bHelper.click(menuMerchant);
				log.info(menuMerchant);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToAddBrand() {
		try {
			bHelper.click(subMenuAddBrand);
			log.info(subMenuAddBrand);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddBrandURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListBrand() {
		try {
			bHelper.click(subMenuListBrand);
			log.info(subMenuListBrand);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListBrandURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToAddMerchant() {
		try {
			bHelper.click(subMenuAddMerchant);
			log.info(subMenuAddMerchant);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddMerchantURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListMerchant() {
		try {
			bHelper.click(subMenuListMerchant);
			log.info(subMenuListMerchant);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListMerchantURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCreateOffer() {
		try {
			bHelper.click(subMenuCreateOffer);
			log.info(subMenuCreateOffer);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCreateOfferURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListOffer() {
		try {
			bHelper.click(subMenuListOffer);
			log.info(subMenuListOffer);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListOfferURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToClient() {
		try {
			if (!gHelper.IsElementPresentQuick(checkClientMenuIsOpen)) {
				bHelper.click(menuClient);
				log.info(menuClient);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToAddClient() {
		try {
			bHelper.click(subMenuAddClient);
			log.info(subMenuAddClient);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddClientURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListClient() {
		try {
			bHelper.click(subMenuListClient);
			log.info(subMenuListClient);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListBusinessURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCustomer() {
		try {
			if (!gHelper.IsElementPresentQuick(checkCustomerMenuIsOpen)) {
				bHelper.click(menuCustomer);
				log.info(menuCustomer);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToAddCustomer() {
		try {
			bHelper.click(subMenuAddCustomer);
			log.info(subMenuAddCustomer);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddCustomerURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListCustomer() {
		try {
			bHelper.click(subMenuListCustomer);
			log.info(subMenuListCustomer);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListCustomerURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToDashboardBalance() {
		try {
			bHelper.click(menuDashboardBalance);
			log.info(menuDashboardBalance);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[text()='Dashboard Balance']")).click();
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToDashboard() {
		try {
			bHelper.click(menuDashboard);
			log.info(menuDashboard);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + "index");
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToEODReportList() {
		try {
			if (!gHelper.IsElementPresentQuick(checkEODReportListMenuIsOpen)) {
				bHelper.click(menuEODReportList);
				log.info(menuEODReportList);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToReportList() {
		try {
			bHelper.click(subMenuReportList);
			log.info(subMenuReportList);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getEODReportListURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCardInventory() {
		try {
			if (!gHelper.IsElementPresentQuick(checkCardInventoryMenuIsOpen)) {
				bHelper.click(menuCardInventory);
				log.info(menuCardInventory);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToDistributor() {
		try {
			if (!gHelper.IsElementPresentQuick(checkDistributor)) {
				bHelper.click(menuDistributor);
				log.info(menuDistributor);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void clickOnAddDistributor() {
		try {
			bHelper.click(subMenuAddDistributor);
			log.info(subMenuAddDistributor);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddDistributorURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCardDetails() {
		try {
			if (!gHelper.IsElementPresentQuick(checkCardDetails)) {
				bHelper.click(menuCardDetails);
				log.info(menuCardDetails);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToRetailer() {
		try {
			if (!gHelper.IsElementPresentQuick(checkRetailer)) {
				bHelper.click(menuRetailer);
				log.info(menuRetailer);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToKitAssign() {
		try {
			if (!gHelper.IsElementPresentQuick(checkKitAssignMenuIsOpen)) {
				bHelper.click(menuKITAssign);
				log.info(menuKITAssign);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToSingleOrBulkKitAssign() {
		try {
			bHelper.click(subMenuSingleOrBulkKitAssign);
			log.info(subMenuSingleOrBulkKitAssign);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getSingleOrBulkKitAssignURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToDownloadCardDetails() {
		try {
			bHelper.click(subMenuDownloadCardDetails);
			log.info(subMenuDownloadCardDetails);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getDownloadCardDetailsURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListAssignedKit() {
		try {
			bHelper.click(subMenuListAssignedKIT);
			log.info(subMenuListAssignedKIT);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListAssignedKitURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListInventory() {
		try {
			bHelper.click(subMenuListInventory);
			log.info(subMenuListInventory);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListInventoryURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToInventorySummary() {
		try {
			bHelper.click(subMenuInventorySummary);
			log.info(subMenuInventorySummary);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getInventorySummaryURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCardIssuance() {
		try {
			bHelper.click(subMenuCardIssuance);
			log.info(subMenuCardIssuance);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCardIssuanceURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCardList() {
		try {
			bHelper.click(subMenuCardList);
			log.info(subMenuCardList);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCardListURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToLoadCard() {
		try {
			bHelper.click(subMenuLoadCard);
			log.info(subMenuLoadCard);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getLoadCardURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCardToCardTransfer() {
		try {
			bHelper.click(subMenuCardToCardTransfer);
			log.info(subMenuCardToCardTransfer);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCardToCardTransferURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToOnboardProgram() {
		try {
			if (!gHelper.IsElementPresentQuick(checkOnboardProgramMenuIsOpen)) {
				bHelper.click(menuOnboardProgram);
				log.info(menuOnboardProgram);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToAddProgram() {
		try {
			bHelper.click(subMenuAddProgram);
			log.info(subMenuAddProgram);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddProgramURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToListProgram() {
		try {
			bHelper.click(subMenuListProgram);
			log.info(subMenuListProgram);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListProgramURL());
		}
		wHelper.hardWait(3000);
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToPocket() {
		try {
			if (!gHelper.IsElementPresentQuick(checkPocketMenuIsOpen)) {
				bHelper.click(menuPocket);
				log.info(menuPocket);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToAddPocket() {
		try {
			bHelper.click(subMenuAddPocket);
			log.info(subMenuAddPocket);
			wHelper.hardWait(5000);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddPocketURL());
			wHelper.hardWait(5000);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		}
	}

	public void navigateToListPocket() {
		try {
			bHelper.click(subMenuListPocket);
			log.info(subMenuListPocket);
			wHelper.hardWait(5000);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListPocketURL());
			wHelper.hardWait(5000);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		}
	}

	public void navigateToPrefund() {
		try {
			if (!gHelper.IsElementPresentQuick(checkPrefundMenuIsOpen)) {
				bHelper.click(menuPrefund);
				log.info(menuPrefund);
			}
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
		}
	}

	public void navigateToListPrefund() {
		try {
			bHelper.click(subMenuListPrefund);
			log.info(subMenuListPrefund);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getPrefundListURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToCustomerUploadSummary() {
		try {
			bHelper.click(subMenuCustomerUploadSummary);
			log.info(subMenuCustomerUploadSummary);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getCustomerUploadSummaryURL());
		}
	}

	public void navigateToBulkCustomerReport() {
		try {
			bHelper.click(subMenuBulkCustomerReport);
			log.info(subMenuBulkCustomerReport);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getBulkCustomerReportURL());
		}
	}

	public void clickOnKitAssignRetailer() {
		try {
			bHelper.click(subMenuKitAssignRetailer);
			log.info(subMenuKitAssignRetailer);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getKitAssignRetailerURL());
		}
	}

	public void clickOnKitAssignDistributor() {
		try {
			bHelper.click(subMenuKitAssignDistributor);
			log.info(subMenuKitAssignDistributor);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getKitAssignDistributorURL());
		}
	}

	public void clickOnListDistributor() {
		try {
			bHelper.click(subMenuListDistributor);
			log.info(subMenuListDistributor);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListDistributorURL());
		}
	}

	public void clickOnListRetailer() {
		try {
			bHelper.click(subMenuListRetailer);
			log.info(subMenuListRetailer);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListRetailerURL());
		}
	}

	public void clickOnAddRetailer() {
		try {
			bHelper.click(subMenuAddRetailer);
			log.info(subMenuAddRetailer);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getAddRetailerURL());
		}
	}

	public void navigateToVirtualAccount() {
		try {
			if (!gHelper.IsElementPresentQuick(checkVirtualAccountMenuIsOpen)) {
				bHelper.click(menuVirtualAccount);
				log.info(menuVirtualAccount);
			}
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
		}
	}

	public void navigateToListVirtualAccount() {
		try {
			bHelper.click(subMenuListVirtualAccount);
			log.info(subMenuListVirtualAccount);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListVirtualAccountURL());
		}
	}

	public void navigateToPrefundRequest() {
		try {
			bHelper.click(subMenuPrefundRequest);
			log.info(subMenuPrefundRequest);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getPrefundRequestURL());
		}
	}

	public void navigateToLimit() {
		try {
			if (!gHelper.IsElementPresentQuick(checkLimitMenuIsOpen)) {
				bHelper.click(menuLimit);
				log.info(menuLimit);
			}
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
		}
	}

	public void navigateToSetWalletLimit() {
		try {
			bHelper.click(subMenuSetWalletLimit);
			log.info(subMenuSetWalletLimit);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getSetWalletLimitURL());
		}
	}

	public void navigateToSetKYCLimit() {
		try {
			bHelper.click(subMenuSetKYCLimit);
			log.info(subMenuSetKYCLimit);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getSetKYCLimitURL());
		}
	}

	public void navigateToKYCList() {
		try {
			bHelper.click(subMenuKYCList);
			log.info(subMenuKYCList);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getKYCListURL());
		}
	}

	public void navigateToLoadReversal() {
		try {
			bHelper.click(subMenuLoadReversal);
			log.info(subMenuLoadReversal);
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getLoadReversalURL());
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToMCCMarkupConfig() {
		try {
			if (!gHelper.IsElementPresentQuick(checkMCCMarkUpConfigMenuIsOpen)) {
				bHelper.click(menuMCCMarkUpConfig);
				log.info(menuMCCMarkUpConfig);
			}
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToSetMCCMarkup() {
		try {
			bHelper.click(subMenuSetMCCMarkup);
			log.info(subMenuSetMCCMarkup);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getSetMCCMarkupURL());
		}
	}

	public void navigateToListMCCMarkup() {
		try {
			bHelper.click(subMenuListMCCMarkup);
			log.info(subMenuListMCCMarkup);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getListMCCMarkupURL());
		}
	}

	public void navigateToMCCMarkupUploadSummary() {
		try {
			bHelper.click(subMenuMCCMarkupUploadSummary);
			log.info(subMenuMCCMarkupUploadSummary);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getMCCMarkupUploadSummaryURL());
		}
	}

	public void navigateToMCCMarkupUploadReport() {
		try {
			bHelper.click(subMenuMCCMarkupUploadReport);
			log.info(subMenuMCCMarkupUploadReport);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getMCCMarkupUploadReportURL());
		}
	}

	public void navigateFeeRevenueManagement() {
		try {
			bHelper.click(menuFeeRevenueManagement);
			log.info(menuFeeRevenueManagement);
		} catch (Exception e) {
		}
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
		gHelper.acceptAlert();
	}

	public void navigateToFeeConfiguration() {
		try {
			bHelper.click(subMenuFeeConfiguration);
			log.info(subMenuFeeConfiguration);
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
			gHelper.acceptAlert();
		} catch (Exception e) {
			ObjectRepo.driver.get(Constants.URL + ObjectRepo.reader.getMCCMarkupUploadReportURL());
		}
	}

}
