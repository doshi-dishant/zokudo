
package com.zokudo.framework.interfaces;

import com.zokudo.framework.configuration.browser.BrowserType;

public interface IconfigReader {
	public BrowserType getBrowser();

	public String getAdminURL();

	public String getAdminUserName();

	public String getAdminPassword();

	public String getGCDefaultProgramURL();

	public String getGCDefaultProgramUserName();

	public String getGCDefaultProgramPassword();

	public String getGPRDefaultProgramURL();

	public String getGPRDefaultProgramUserName();

	public String getGPRDefaultProgramPassword();

	public String getGCResellerURL();

	public String getGCResellerUserName();

	public String getGCResellerPassword();

	public String getGPRResellerURL();

	public String getGPRResellerUserName();

	public String getGPRResellerPassword();

	public String getGCSuperDistributorURL();

	public String getGCSuperDistributorUserName();

	public String getGCSuperDistributorPassword();

	public String getGPRSuperDistributorURL();

	public String getGPRSuperDistributorUserName();

	public String getGPRSuperDistributorPassword();

	public String getGCDistributorURL();

	public String getGCDistributorUserName();

	public String getGCDistributorPassword();

	public String getGPRDistributorURL();

	public String getGPRDistributorUserName();

	public String getGPRDistributorPassword();

	public String getGCRetailerURL();

	public String getGCRetailerUserName();

	public String getGCRetailerPassword();

	public String getGPRRetailerURL();

	public String getGPRRetailerUserName();

	public String getGPRRetailerPassword();

	public int getPageLoadTimeOut();

	public int getImplicitWait();

	public int getExplicitWait();

	public int getPollingTime();

	public String getAddBusinessURL();

	public String getListBusinessURL();

	public String getAddClientURL();

	public String getListClientURL();

	public String getAddProgramURL();

	public String getListProgramURL();

	public String getAddPocketURL();

	public String getListPocketURL();

	public String getAddBrandURL();

	public String getListBrandURL();

	public String getAddMerchantURL();

	public String getListMerchantURL();

	public String getCreateOfferURL();

	public String getListOfferURL();

	public String getListCustomerURL();

	public String getAddCustomerURL();

	public String getCardTransactionReportURl();

	public String getCardLoadReversalReportURl();

	public String getCardIssuanceURL();

	public String getCardListURL();

	public String getLoadCardURL();

	public String getCardToCardTransferURL();

	public String getLoadReversalURL();

	public String getBulkUploadURL();

	public String getCardUploadSummaryURL();

	public String getEODReportListURL();

	public String getPrefundListURL();

	public String getListInventoryURL();

	public String getInventorySummaryURL();

	public String getCardInventoryUploadURL();

	public String getBulkCardInvUploadSummaryURL();

	public String getBulkCardInvReportURL();

	public String getSingleOrBulkKitAssignURL();

	public String getListAssignedKitURL();

	public String getKitAssignDistributorURL();

	public String getDownloadCardDetailsURL();

	public String getAddRetailerURL();

	public String getListRetailerURL();

	public String getKitAssignRetailerURL();

	public String getAddDistributorURL();

	public String getListDistributorURL();

	public String getCustomerUploadSummaryURL();

	public String getBulkCustomerReportURL();

	public String getBulkCardReportURL();

	public String getBulkCardLoadReportURL();

	public String getGC1DefaultProgramURL();

	public String getGC1DefaultProgramUserName();

	public String getGC1DefaultProgramPassword();

	public String getGC1SuperDistributorURL();

	public String getGC1SuperDistributorUserName();

	public String getGC1SuperDistributorPassword();

	public String getGC1DistributorURL();

	public String getGC1DistributorUserName();

	public String getGC1DistributorPassword();

	public String getGC1RetailerURL();

	public String getGC1RetailerUserName();

	public String getGC1RetailerPassword();

	public String getGCDefaultProgramURL1();

	public String getGCDefaultProgramUserName1();

	public String getGCDefaultProgramPassword1();

	public String getGC1DefaultProgramURL1();

	public String getGC1DefaultProgramUserName1();

	public String getGC1DefaultProgramPassword1();

	public String getGCDistributorURL1();

	public String getGCDistributorUserName1();

	public String getGCDistributorPassword1();

	public String getGCRetailerURL1();

	public String getGPRRetailerURL1();

	public String getGCRetailerUserName1();

	public String getGCRetailerPassword1();

	public String getGC1RetailerURL1();

	public String getGC1RetailerUserName1();

	public String getGC1RetailerPassword1();

	public String getListVirtualAccountURL();

	public String getPrefundRequestURL();

	public String getSetWalletLimitURL();

	public String getSetKYCLimitURL();

	public String getKYCListURL();

	public String getGCLendingURL();

	public String getGCLendingUserName();

	public String getGCLendingPassword();

	public String getGPRLendingURL();

	public String getGPRLendingUserName();

	public String getGPRLendingPassword();

	public String getSetMCCMarkupURL();

	public String getListMCCMarkupURL();

	public String getMCCMarkupUploadSummaryURL();

	public String getMCCMarkupUploadReportURL();

	public String getFeeConfigurationURL();

	public String getGPRRetailerUserName1();

	public String getGPRRetailerPassword1();
}
