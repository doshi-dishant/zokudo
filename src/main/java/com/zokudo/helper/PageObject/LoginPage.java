package com.zokudo.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class LoginPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(LoginPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;
	private WaitHelper wHelper;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
		wHelper = new WaitHelper(driver, ObjectRepo.reader);
	}

	/** Web Elements */

	@FindBy(id = "username_new")
	@CacheLookup
	private WebElement txtEmail;

	@FindBy(id = "password_new_show")
	@CacheLookup
	private WebElement txtPassword;

	@FindBy(id = "newLoginBtn")
	@CacheLookup
	private WebElement btnLogin;

	private By btnSignOut = By.xpath("//*[contains(@data-box,'signout')]");

	@FindBy(xpath = "//*[text()='Yes']")
	@CacheLookup
	private WebElement btnYes;

	/** Public Methods **/

	public WebDriver getDriver() {
		return this.driver;
	}

	public void enterUserName(String username) {
		try {
			tHelper.sendKeys(txtEmail, username);
			log.info(username);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("username_new")).sendKeys(username);
		}
	}

	public void enterPass(String userpwd) {
		try {
			tHelper.sendKeys(txtPassword, userpwd);
			log.info(txtPassword);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("password_new_show")).sendKeys(userpwd);
		}
	}

	public void clickOnLogInButton() {
		try {
			bHelper.click(btnLogin);
			log.info(btnLogin);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("newLoginBtn")).click();
		}
	}

	public void signout() {
		if (gHelper.IsElementPresentQuick(btnSignOut)) {
			bHelper.click(btnSignOut);
			log.info(btnSignOut);
			bHelper.click(btnYes);
			log.info(btnYes);
		}
	}

	public void loginOtherUser(String url, String username, String password) {
		wHelper.hardWait(1000);
		ObjectRepo.driver.get(url);
		String s = "Hit URL : " + url + " in browser\n";
		wHelper.hardWait(3000);
		signout();
		s = s + "Performed sign out if already logged in\n";
		enterUserName(username);
		s = s + "Enter \"User Name\" : " + username + "\n";
		enterPass(password);
		s = s + "Enter \"Password\" : " + password + "\n";
		clickOnLogInButton();
		if (gHelper.IsElementPresentQuick(By.xpath(
				"//img[contains(@src,'x')]//following-sibling::div//*[text()='User not found!invalid username']"))
				|| gHelper.IsElementPresentQuick(By.id("username_new"))) {
			ObjectRepo.driver.get(url);
			s = s + "Hit URL : " + url + " in browser\n";
			enterUserName(username);
			s = s + "Enter \"User Name\" : " + username + "\n";
			enterPass(password);
			s = s + "Enter \"Password\" : " + password + "\n";
			clickOnLogInButton();
			s = s + "Click on \"Log In\" button\n";
		} else
			s = s + "Click on \"Log In\" button\n";
		InitializeWebDriver.scenario.write(s);
	}

	public void loginAsGCDefaultProgramUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGCDefaultProgramURL(), ObjectRepo.reader.getGCDefaultProgramUserName(),
				ObjectRepo.reader.getGCDefaultProgramPassword());
	}

	public void loginAsGPRDefaultProgramUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGPRDefaultProgramURL(), ObjectRepo.reader.getGPRDefaultProgramUserName(),
				ObjectRepo.reader.getGPRDefaultProgramPassword());
	}

	public void loginAsGCDistributorUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGCDistributorURL(), ObjectRepo.reader.getGCDistributorUserName(),
				ObjectRepo.reader.getGCDistributorPassword());
	}

	public void loginAsGPRDistributorUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGPRDistributorURL(), ObjectRepo.reader.getGPRDistributorUserName(),
				ObjectRepo.reader.getGPRDistributorPassword());
	}

	public void loginAsGCResellerUser() {
		wHelper.hardWait(3000);
		ObjectRepo.driver.get(ObjectRepo.reader.getGCResellerURL());
		loginOtherUser(ObjectRepo.reader.getGCResellerURL(), ObjectRepo.reader.getGCResellerUserName(),
				ObjectRepo.reader.getGCResellerPassword());
	}

	public void loginAsGPRResellerUser() {
		wHelper.hardWait(3000);
		ObjectRepo.driver.get(ObjectRepo.reader.getGPRResellerURL());
		loginOtherUser(ObjectRepo.reader.getGPRResellerURL(), ObjectRepo.reader.getGPRResellerUserName(),
				ObjectRepo.reader.getGPRResellerPassword());
	}

	public void loginAsGCSuperDistributorUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGCSuperDistributorURL(), ObjectRepo.reader.getGCSuperDistributorUserName(),
				ObjectRepo.reader.getGCSuperDistributorPassword());
	}

	public void loginAsGPRSuperDistributorUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGPRSuperDistributorURL(),
				ObjectRepo.reader.getGPRSuperDistributorUserName(), ObjectRepo.reader.getGPRSuperDistributorPassword());
	}

	public void loginAsGCRetailerUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGCRetailerURL(), ObjectRepo.reader.getGCRetailerUserName(),
				ObjectRepo.reader.getGCRetailerPassword());
	}

	public void loginAsGPRRetailerUser() {
		wHelper.hardWait(3000);
		loginOtherUser(ObjectRepo.reader.getGPRRetailerURL(), ObjectRepo.reader.getGPRRetailerUserName(),
				ObjectRepo.reader.getGPRRetailerPassword());
	}

}
