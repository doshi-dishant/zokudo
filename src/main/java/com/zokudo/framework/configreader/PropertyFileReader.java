package com.zokudo.framework.configreader;

import java.util.Properties;

import com.zokudo.framework.interfaces.IconfigReader;
import com.zokudo.framework.utility.ResourceHelper;

public class PropertyFileReader implements IconfigReader {

	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper.getResourcePathInputStream("configfile/" + "config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public com.zokudo.framework.configuration.browser.BrowserType getBrowser() {
		return com.zokudo.framework.configuration.browser.BrowserType.valueOf(prop.getProperty("Browser"));
	}

	public String getWaitTime() {
		String time = prop.getProperty("wait.explicit.seconds");
		if (time != null)
			return time;
		else
			throw new RuntimeException("Time  is  not specified in the Configuration.properties file.");

	}

	@Override
	public String getAdminURL() {
		return prop.getProperty("AdminURL");
	}

	@Override
	public String getAdminUserName() {
		return prop.getProperty("AdminUserName");
	}

	@Override
	public String getAdminPassword() {
		return prop.getProperty("AdminPassword");
	}

	@Override
	public String getGCDefaultProgramURL() {
		return prop.getProperty("GCDefaultProgramURL");
	}

	@Override
	public String getGCDefaultProgramUserName() {
		return prop.getProperty("GCDefaultProgramUserName");
	}

	@Override
	public String getGCDefaultProgramPassword() {
		return prop.getProperty("GCDefaultProgramPassword");
	}

	@Override
	public String getGPRDefaultProgramURL() {
		return prop.getProperty("GPRDefaultProgramURL");
	}

	@Override
	public String getGPRDefaultProgramUserName() {
		return prop.getProperty("GPRDefaultProgramUserName");
	}

	@Override
	public String getGPRDefaultProgramPassword() {
		return prop.getProperty("GPRDefaultProgramPassword");
	}

	@Override
	public String getGCResellerURL() {
		return prop.getProperty("GCResellerURL");
	}

	@Override
	public String getGCResellerUserName() {
		return prop.getProperty("GCResellerUserName");
	}

	@Override
	public String getGCResellerPassword() {
		return prop.getProperty("GCResellerPassword");
	}

	@Override
	public String getGPRResellerURL() {
		return prop.getProperty("GPRResellerURL");
	}

	@Override
	public String getGPRResellerUserName() {
		return prop.getProperty("GPRResellerUserName");
	}

	@Override
	public String getGPRResellerPassword() {
		return prop.getProperty("GPRResellerPassword");
	}

	@Override
	public String getGCSuperDistributorURL() {
		return prop.getProperty("GCSuperDistributorURL");
	}

	@Override
	public String getGCSuperDistributorUserName() {
		return prop.getProperty("GCSuperDistributorUserName");
	}

	@Override
	public String getGCSuperDistributorPassword() {
		return prop.getProperty("GCSuperDistributorPassword");
	}

	@Override
	public String getGPRSuperDistributorURL() {
		return prop.getProperty("GPRSuperDistributorURL");
	}

	@Override
	public String getGPRSuperDistributorUserName() {
		return prop.getProperty("GPRSuperDistributorUserName");
	}

	@Override
	public String getGPRSuperDistributorPassword() {
		return prop.getProperty("GPRSuperDistributorPassword");
	}

	@Override
	public String getGCDistributorURL() {
		return prop.getProperty("GCDistributorURL");
	}

	@Override
	public String getGCDistributorUserName() {
		return prop.getProperty("GCDistributorUserName");
	}

	@Override
	public String getGCDistributorPassword() {
		return prop.getProperty("GCDistributorPassword");
	}

	@Override
	public String getGPRDistributorURL() {
		return prop.getProperty("GPRDistributorURL");
	}

	@Override
	public String getGPRDistributorUserName() {
		return prop.getProperty("GPRDistributorUserName");
	}

	@Override
	public String getGPRDistributorPassword() {
		return prop.getProperty("GPRDistributorPassword");
	}

	@Override
	public String getGCRetailerURL() {
		return prop.getProperty("GCRetailerURL");
	}

	@Override
	public String getGCRetailerUserName() {
		return prop.getProperty("GCRetailerUserName");
	}

	@Override
	public String getGCRetailerPassword() {
		return prop.getProperty("GCRetailerPassword");
	}

	@Override
	public String getGPRRetailerURL() {
		return prop.getProperty("GPRRetailerURL");
	}

	@Override
	public String getGPRRetailerUserName() {
		return prop.getProperty("GPRRetailerUserName");
	}

	@Override
	public String getGPRRetailerPassword() {
		return prop.getProperty("GPRRetailerPassword");
	}

	@Override
	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	@Override
	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplicitWait"));
	}

	@Override
	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}

	@Override
	public int getPollingTime() {
		return Integer.parseInt(prop.getProperty("PollingTime"));
	}

	@Override
	public String getAddBusinessURL() {
		return prop.getProperty("AddBusinessURL");
	}

	@Override
	public String getListBusinessURL() {
		return prop.getProperty("ListBusinessURL");
	}

	@Override
	public String getAddClientURL() {
		return prop.getProperty("AddClientURL");
	}

	@Override
	public String getListClientURL() {
		return prop.getProperty("ListClientURL");
	}

	@Override
	public String getAddProgramURL() {
		return prop.getProperty("AddProgramURL");
	}

	@Override
	public String getListProgramURL() {
		return prop.getProperty("ListProgramURL");
	}

	@Override
	public String getAddPocketURL() {
		return prop.getProperty("AddPocketURL");
	}

	@Override
	public String getListPocketURL() {
		return prop.getProperty("ListPocketURL");
	}

	@Override
	public String getAddBrandURL() {
		return prop.getProperty("AddBrandURL");
	}

	@Override
	public String getListBrandURL() {
		return prop.getProperty("ListBrandURL");
	}

	@Override
	public String getAddMerchantURL() {
		return prop.getProperty("AddMerchantURL");
	}

	@Override
	public String getListMerchantURL() {
		return prop.getProperty("ListMerchantURL");
	}

	@Override
	public String getCreateOfferURL() {
		return prop.getProperty("CreateOfferURL");
	}

	@Override
	public String getListOfferURL() {
		return prop.getProperty("ListOfferURL");
	}

	@Override
	public String getListCustomerURL() {
		return prop.getProperty("ListCustomerURL");
	}

	@Override
	public String getAddCustomerURL() {
		return prop.getProperty("AddCustomerURL");
	}

	@Override
	public String getCardTransactionReportURl() {
		return prop.getProperty("CardTransactionReportURl");
	}

	@Override
	public String getCardIssuanceURL() {
		return prop.getProperty("CardIssuanceURL");
	}

	@Override
	public String getCardListURL() {
		return prop.getProperty("CardListURL");
	}

	@Override
	public String getLoadCardURL() {
		return prop.getProperty("LoadCardURL");
	}

	@Override
	public String getBulkUploadURL() {
		return prop.getProperty("BulkUploadURL");
	}

	@Override
	public String getCardUploadSummaryURL() {
		return prop.getProperty("CardUploadSummaryURL");
	}

	@Override
	public String getEODReportListURL() {
		return prop.getProperty("EODReportListURL");
	}

	@Override
	public String getPrefundListURL() {
		return prop.getProperty("PrefundListURL");
	}

	@Override
	public String getListInventoryURL() {
		return prop.getProperty("ListInventoryURL");
	}

	@Override
	public String getInventorySummaryURL() {
		return prop.getProperty("InventorySummaryURL");
	}

	@Override
	public String getCardInventoryUploadURL() {
		return prop.getProperty("CardInventoryUploadURL");
	}

	@Override
	public String getBulkCardInvUploadSummaryURL() {
		return prop.getProperty("BulkCardInvUploadSummaryURL");
	}

	@Override
	public String getBulkCardInvReportURL() {
		return prop.getProperty("BulkCardInvReportURL");
	}

	@Override
	public String getSingleOrBulkKitAssignURL() {
		return prop.getProperty("SingleOrBulkKitAssignURL");
	}

	@Override
	public String getListAssignedKitURL() {
		return prop.getProperty("ListAssignedKitURL");
	}

	@Override
	public String getKitAssignDistributorURL() {
		return prop.getProperty("KitAssignDistributorURL");
	}

	@Override
	public String getDownloadCardDetailsURL() {
		return prop.getProperty("DownloadCardDetailsURL");
	}

	@Override
	public String getAddRetailerURL() {
		return prop.getProperty("AddRetailerURL");
	}

	@Override
	public String getListRetailerURL() {
		return prop.getProperty("ListRetailerURL");
	}

	@Override
	public String getKitAssignRetailerURL() {
		return prop.getProperty("KitAssignRetailerURL");
	}

	@Override
	public String getAddDistributorURL() {
		return prop.getProperty("AddDistributorURL");
	}

	@Override
	public String getListDistributorURL() {
		return prop.getProperty("ListDistributorURL");
	}

	@Override
	public String getCustomerUploadSummaryURL() {
		return prop.getProperty("CustomerUploadSummaryURL");
	}

	@Override
	public String getBulkCustomerReportURL() {
		return prop.getProperty("BulkCustomerReportURL");
	}

	@Override
	public String getBulkCardReportURL() {
		return prop.getProperty("BulkCardReportURL");
	}

	@Override
	public String getGC1DefaultProgramURL() {
		return prop.getProperty("GC1DefaultProgramURL");
	}

	@Override
	public String getGC1DefaultProgramUserName() {
		return prop.getProperty("GC1DefaultProgramUserName");
	}

	@Override
	public String getGC1DefaultProgramPassword() {
		return prop.getProperty("GC1DefaultProgramPassword");
	}

	@Override
	public String getGC1SuperDistributorURL() {
		return prop.getProperty("GC1SuperDistributorURL");
	}

	@Override
	public String getGC1SuperDistributorUserName() {
		return prop.getProperty("GC1SuperDistributorUserName");
	}

	@Override
	public String getGC1SuperDistributorPassword() {
		return prop.getProperty("GC1SuperDistributorPassword");
	}

	@Override
	public String getGC1DistributorURL() {
		return prop.getProperty("GC1DistributorURL");
	}

	@Override
	public String getGC1DistributorUserName() {
		return prop.getProperty("GC1DistributorUserName");
	}

	@Override
	public String getGC1DistributorPassword() {
		return prop.getProperty("GC1DistributorPassword");
	}

	@Override
	public String getGC1RetailerURL() {
		return prop.getProperty("GC1RetailerURL");
	}

	@Override
	public String getGC1RetailerUserName() {
		return prop.getProperty("GC1RetailerUserName");
	}

	@Override
	public String getGC1RetailerPassword() {
		return prop.getProperty("GC1RetailerPassword");
	}

	@Override
	public String getGCDefaultProgramURL1() {
		return prop.getProperty("GCDefaultProgramURL1");
	}

	@Override
	public String getGCDefaultProgramUserName1() {
		return prop.getProperty("GCDefaultProgramUserName1");
	}

	@Override
	public String getGCDefaultProgramPassword1() {
		return prop.getProperty("GCDefaultProgramPassword1");
	}

	@Override
	public String getGC1DefaultProgramURL1() {
		return prop.getProperty("GC1DefaultProgramURL1");
	}

	@Override
	public String getGC1DefaultProgramUserName1() {
		return prop.getProperty("GC1DefaultProgramUserName1");
	}

	@Override
	public String getGC1DefaultProgramPassword1() {
		return prop.getProperty("GC1DefaultProgramPassword1");
	}

	@Override
	public String getGCDistributorURL1() {
		return prop.getProperty("GCDistributorURL1");
	}

	@Override
	public String getGCDistributorUserName1() {
		return prop.getProperty("GCDistributorUserName1");
	}

	@Override
	public String getGCDistributorPassword1() {
		return prop.getProperty("GCDistributorPassword1");
	}

	@Override
	public String getGCRetailerURL1() {
		return prop.getProperty("GCRetailerURL1");
	}

	@Override
	public String getGCRetailerUserName1() {
		return prop.getProperty("GCRetailerUserName1");
	}

	@Override
	public String getGCRetailerPassword1() {
		return prop.getProperty("GCRetailerPassword1");
	}

	@Override
	public String getGC1RetailerURL1() {
		return prop.getProperty("GC1RetailerURL1");
	}

	@Override
	public String getGC1RetailerUserName1() {
		return prop.getProperty("GC1RetailerUserName1");
	}

	@Override
	public String getGC1RetailerPassword1() {
		return prop.getProperty("GC1RetailerPassword1");
	}

	@Override
	public String getBulkCardLoadReportURL() {
		return prop.getProperty("CardLoadBulkReport");
	}

	@Override
	public String getListVirtualAccountURL() {
		return prop.getProperty("ListVirtualAccount");
	}

	@Override
	public String getPrefundRequestURL() {
		return prop.getProperty("PrefundRequestURL");
	}

	@Override
	public String getSetWalletLimitURL() {
		return prop.getProperty("SetWalletLimitURL");
	}

	@Override
	public String getSetKYCLimitURL() {
		return prop.getProperty("SetKYCLimitURL");
	}

	@Override
	public String getKYCListURL() {
		return prop.getProperty("KYCListURL");
	}

	@Override
	public String getGCLendingURL() {
		return prop.getProperty("GCLendingURL");
	}

	@Override
	public String getGCLendingUserName() {
		return prop.getProperty("GCLendingUserName");
	}

	@Override
	public String getGCLendingPassword() {
		return prop.getProperty("GCLendingPassword");
	}

	@Override
	public String getGPRLendingURL() {
		return prop.getProperty("GPRLendingURL");
	}

	@Override
	public String getGPRLendingUserName() {
		return prop.getProperty("GPRLendingUserName");
	}

	@Override
	public String getGPRLendingPassword() {
		return prop.getProperty("GPRLendingPassword");
	}

	@Override
	public String getCardToCardTransferURL() {
		return prop.getProperty("CardToCardTransferURL");
	}

	@Override
	public String getLoadReversalURL() {
		return prop.getProperty("LoadReversalURL");
	}

	@Override
	public String getSetMCCMarkupURL() {
		return prop.getProperty("AddMarkUpURL");
	}

	@Override
	public String getListMCCMarkupURL() {
		return prop.getProperty("ListMccMarkupURL");
	}

	@Override
	public String getMCCMarkupUploadSummaryURL() {
		return prop.getProperty("MCCMarkupUploadSummaryURL");
	}

	@Override
	public String getMCCMarkupUploadReportURL() {
		return prop.getProperty("MCCMarkupUploadReportURL");
	}

	@Override
	public String getGPRRetailerURL1() {
		return prop.getProperty("GPRRetailerURL1");
	}

	@Override
	public String getGPRRetailerUserName1() {
		return prop.getProperty("GPRRetailerUserName1");
	}

	@Override
	public String getGPRRetailerPassword1() {
		return prop.getProperty("GPRRetailerPassword1");
	}

	@Override
	public String getFeeConfigurationURL() {
		return prop.getProperty("FeeConfigurationURL");
	}

	@Override
	public String getCardLoadReversalReportURl() {
		return prop.getProperty("LoadReversalReportURL");
	}

}
