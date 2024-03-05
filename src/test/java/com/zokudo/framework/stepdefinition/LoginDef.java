package com.zokudo.framework.stepdefinition;

import com.zokudo.constants.DataConstants;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.LoginPage;

import cucumber.api.java.en.Given;

public class LoginDef {
	private LoginPage lP = new LoginPage(ObjectRepo.driver);

	@Given("^user login as GC Default Program user$")
	public void user_login_as_GC_Default_Program_user() throws Throwable {
		lP.loginAsGCDefaultProgramUser();
	}

	@Given("^user login as GPR Default Program user$")
	public void user_login_as_GPR_Default_Program_user() throws Throwable {
		lP.loginAsGPRDefaultProgramUser();
	}

	@Given("^user login with Admin user$")
	public void user_login_with_Admin_user() throws Throwable {
		lP.loginOtherUser(ObjectRepo.reader.getAdminURL(), ObjectRepo.reader.getAdminUserName(),
				ObjectRepo.reader.getAdminPassword());
	}

	@Given("^user login as GC Reseller user$")
	public void user_login_as_GC_Reseller_user() throws Throwable {
		lP.loginAsGCResellerUser();
	}

	@Given("^user login as GC Distributor user$")
	public void user_login_as_GC_Distributor_user() throws Throwable {
		String url = ObjectRepo.reader.getGCDistributorURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGCDistributorUserName(),
				ObjectRepo.reader.getGCDistributorPassword());
	}

	@Given("^user login as GC Retailer user$")
	public void user_login_as_GC_Retailer_user() throws Throwable {
		String url = ObjectRepo.reader.getGCRetailerURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGCRetailerUserName(), ObjectRepo.reader.getGCRetailerPassword());
	}

	@Given("^user login as GC Super Distributor user$")
	public void user_login_as_GC_Super_Distributor_user() throws Throwable {
		lP.loginAsGCSuperDistributorUser();
	}

	@Given("^user login as GPR Super Distributor user$")
	public void user_login_as_GPR_Super_Distributor_user() throws Throwable {
		lP.loginAsGPRSuperDistributorUser();
	}

	@Given("^user login as GPR Distributor user$")
	public void user_login_as_GPR_Distributor_user() throws Throwable {
		lP.loginAsGPRDistributorUser();
	}

	@Given("^user login as GPR Retailer user$")
	public void user_login_as_GPR_Retailer_user() throws Throwable {
		lP.loginAsGPRRetailerUser();
	}

	@Given("^user login as GC1 Default Program user$")
	public void user_login_as_GC1_Default_Program_user() throws Throwable {
		String url = ObjectRepo.reader.getGC1DefaultProgramURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGC1DefaultProgramUserName(),
				ObjectRepo.reader.getGC1DefaultProgramPassword());
	}

	@Given("^user login as GC1 Super Distributor user$")
	public void user_login_as_GC1_Super_Distributor_user() throws Throwable {
		String url = ObjectRepo.reader.getGC1SuperDistributorURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGC1SuperDistributorUserName(),
				ObjectRepo.reader.getGC1SuperDistributorPassword());
	}

	@Given("^user login as GC1 Distributor user$")
	public void user_login_as_GC1_Distributor_user() throws Throwable {
		String url = ObjectRepo.reader.getGC1DistributorURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGC1DistributorUserName(),
				ObjectRepo.reader.getGC1DistributorPassword());
	}

	@Given("^user login as GC1 Retailer user$")
	public void user_login_as_GC1_Retailer_user() throws Throwable {
		String url = ObjectRepo.reader.getGC1RetailerURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGC1RetailerUserName(), ObjectRepo.reader.getGC1RetailerPassword());
	}

	@Given("^user login as GC Default Program user1$")
	public void user_login_as_GC_Default_Program_user1() throws Throwable {
		String url = ObjectRepo.reader.getGCDefaultProgramURL1();
		lP.loginOtherUser(url, ObjectRepo.reader.getGCDefaultProgramUserName1(),
				ObjectRepo.reader.getGCDefaultProgramPassword1());
	}
	
	@Given("^user login as GPR Default Program user1$")
	public void user_login_as_GPR_Default_Program_user1() throws Throwable {
		String url = ObjectRepo.reader.getGCDefaultProgramURL1();
		lP.loginOtherUser(url, ObjectRepo.reader.getGCDefaultProgramUserName1(),
				ObjectRepo.reader.getGCDefaultProgramPassword1());
	}

	@Given("^user login as GC1 Default Program user1$")
	public void user_login_as_GC1_Default_Program_user1() throws Throwable {
		String url = ObjectRepo.reader.getGC1DefaultProgramURL1();
		lP.loginOtherUser(url, ObjectRepo.reader.getGC1DefaultProgramUserName1(),
				ObjectRepo.reader.getGC1DefaultProgramPassword1());
	}

	@Given("^user login as GC Distributor user1$")
	public void user_login_as_GC_Distributor_user1() throws Throwable {
		String url = ObjectRepo.reader.getGCDistributorURL1();
		lP.loginOtherUser(url, ObjectRepo.reader.getGCDistributorUserName1(),
				ObjectRepo.reader.getGCDistributorPassword1());
	}

	@Given("^user login as GC Retailer user1$")
	public void user_login_as_GC_Retailer_user1() throws Throwable {
		String url = ObjectRepo.reader.getGCRetailerURL1();
		lP.loginOtherUser(url, ObjectRepo.reader.getGCRetailerUserName1(), ObjectRepo.reader.getGCRetailerPassword1());
	}

	@Given("^user login as GPR Retailer user1$")
	public void user_login_as_GPR_Retailer_user1() throws Throwable {
		String url = ObjectRepo.reader.getGPRRetailerURL1();
		lP.loginOtherUser(url, ObjectRepo.reader.getGPRRetailerUserName1(), ObjectRepo.reader.getGPRRetailerPassword1());
	}

	@Given("^user login as GC1 Retailer user1$")
	public void user_login_as_GC1_Retailer_user1() throws Throwable {
		String url = ObjectRepo.reader.getGC1RetailerURL1();
		lP.loginOtherUser(url, ObjectRepo.reader.getGC1RetailerUserName1(),
				ObjectRepo.reader.getGC1RetailerPassword1());
	}

	@Given("^user login as Dynamic Default GC user$")
	public void user_login_as_Dynamic_Default_GC_user() throws Throwable {
		String url = DataConstants.DefaultGCURL;
		lP.loginOtherUser(url, DataConstants.DefaultGCUserName, "123456");
	}

	@Given("^user login as Dynamic Default GC1 user$")
	public void user_login_as_Dynamic_Default_GC1_user() throws Throwable {
		String url = DataConstants.DefaultGC1URL;
		lP.loginOtherUser(url, DataConstants.DefaultGC1UserName, "123456");
	}

	@Given("^user login as Dynamic Default GPR user$")
	public void user_login_as_Dynamic_Default_GPR_user() throws Throwable {
		String url = DataConstants.DefaultGPRURL;
		lP.loginOtherUser(url, DataConstants.DefaultGPRUserName, "123456");
	}

	@Given("^user login as Dynamic Default GPR user1$")
	public void user_login_as_Dynamic_Default_GPR_user1() throws Throwable {
		String url = DataConstants.DefaultGPRURL1;
		lP.loginOtherUser(url, DataConstants.DefaultGPRUserName, "123456");
	}

	@Given("^user login as Dynamic SD GC user$")
	public void user_login_as_Dynamic_SD_GC_user() throws Throwable {
		String url = DataConstants.SuperDistributorGCURL;
		lP.loginOtherUser(url, DataConstants.SuperDistributorGCUserName, "123456");
	}

	@Given("^user login as Dynamic SD GC1 user$")
	public void user_login_as_Dynamic_SD_GC1_user() throws Throwable {
		String url = DataConstants.SuperDistributorGC1URL;
		lP.loginOtherUser(url, DataConstants.SuperDistributorGC1UserName, "123456");
	}

	@Given("^user login as Dynamic SD GPR user$")
	public void user_login_as_Dynamic_SD_GPR_user() throws Throwable {
		String url = DataConstants.SuperDistributorGPRURL;
		lP.loginOtherUser(url, DataConstants.SuperDistributorGPRUserName, "123456");
	}

	@Given("^user login as Dynamic SD GPR user1$")
	public void user_login_as_Dynamic_SD_GPR_user1() throws Throwable {
		String url = DataConstants.SuperDistributorGPRURL1;
		lP.loginOtherUser(url, DataConstants.SuperDistributorGPRUserName, "123456");
	}

	@Given("^user login as Dynamic Distributor GC user$")
	public void user_login_as_Dynamic_Distributor_GC_user() throws Throwable {
		String url = DataConstants.SuperDistributorGCURL;
		lP.loginOtherUser(url, DataConstants.GCDistributorUseName, "123456");
	}

	@Given("^user login as Dynamic Retailer GC user$")
	public void user_login_as_Dynamic_Retailer_GC_user() throws Throwable {
		String url = DataConstants.SuperDistributorGCURL;
		lP.loginOtherUser(url, DataConstants.GCRetailerUseName, "123456");
	}

	@Given("^user login as Dynamic Distributor GC1 user$")
	public void user_login_as_Dynamic_Distributor_GC1_user() throws Throwable {
		String url = DataConstants.SuperDistributorGC1URL;
		lP.loginOtherUser(url, DataConstants.GC1DistributorUseName, "123456");
	}

	@Given("^user login as Dynamic Retailer GC1 user$")
	public void user_login_as_Dynamic_Retailer_GC1_user() throws Throwable {
		String url = DataConstants.SuperDistributorGC1URL;
		lP.loginOtherUser(url, DataConstants.GC1RetailerUseName, "123456");
	}

	@Given("^user login as Dynamic Distributor GPR user$")
	public void user_login_as_Dynamic_Distributor_GPR_user() throws Throwable {
		String url = DataConstants.SuperDistributorGPRURL;
		lP.loginOtherUser(url, DataConstants.GPRDistributorUseName, "123456");
	}

	@Given("^user login as Dynamic Retailer GPR user$")
	public void user_login_as_Dynamic_Retailer_GPR_user() throws Throwable {
		String url = DataConstants.SuperDistributorGPRURL;
		lP.loginOtherUser(url, DataConstants.GPRRetailerUseName, "123456");
	}

	@Given("^user login as GC Lending user$")
	public void user_login_as_GC_Lending_user() throws Throwable {
		String url = ObjectRepo.reader.getGCLendingURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGCLendingUserName(), ObjectRepo.reader.getGCLendingPassword());
	}

	@Given("^user login as GPR Lending user$")
	public void user_login_as_GPR_Lending_user() throws Throwable {
		String url = ObjectRepo.reader.getGPRLendingURL();
		lP.loginOtherUser(url, ObjectRepo.reader.getGPRLendingUserName(), ObjectRepo.reader.getGPRLendingPassword());
	}

}