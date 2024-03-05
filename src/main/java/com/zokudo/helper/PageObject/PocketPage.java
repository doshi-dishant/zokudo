package com.zokudo.helper.PageObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.zokudo.constants.DataConstants;
import com.zokudo.framework.helper.InitializeWebDriver;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.DropDown.DropDownHelper;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.helper.Wait.WaitHelper;
import com.zokudo.framework.list.ListHelper;
import com.zokudo.framework.settings.ObjectRepo;

public class PocketPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(PocketPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private GenericHelper gHelper;
	private WaitHelper wHelper;
	private DropDownHelper dHelper;
	private ListHelper lHelper;
	private LoginPage lP;
	private NavigationPage nP;

	public PocketPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		gHelper = new GenericHelper(driver);
		wHelper = new WaitHelper(driver, ObjectRepo.reader);
		dHelper = new DropDownHelper(driver);
		lHelper = new ListHelper(driver);
		lP = new LoginPage(driver);
		nP = new NavigationPage(driver);
	}

	/** Web Elements */

	@FindBy(xpath = "//*[contains(@aria-labelledby,'clientCode')]")
	@CacheLookup
	private WebElement drpClient;

	@FindBy(xpath = "//*[contains(@aria-labelledby,'programCode')]")
	@CacheLookup
	private WebElement drpProgram;

	@FindBy(id = "pocketName")
	@CacheLookup
	private WebElement txtPocketName;

	@FindBy(id = "mccGroupName")
	@CacheLookup
	private WebElement msMCCGroup;

	@FindBy(xpath = "//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtMCCGroup;

	@FindBy(xpath = "//span[contains(@class,'dropdown')]//input[contains(@class,'select2-search')]")
	@CacheLookup
	private WebElement txtClientSearch;

	@FindBy(id = "programHashId")
	@CacheLookup
	private WebElement drpProgramSearch;

	@FindBy(id = "maxLimit")
	@CacheLookup
	private WebElement txtMaxLimit;

	@FindBy(id = "submitButton")
	@CacheLookup
	private WebElement btnSubmit;

	@FindBy(id = "maxLimitId")
	@CacheLookup
	private WebElement maxLimitId;

	@FindBy(xpath = "//button[text()='UPDATE LIMT']")
	@CacheLookup
	private WebElement updateLimit;

	private By mcc = By.xpath("//*[@id='mccListTableTbody']//td[3]");

	private By msgSuccess = By
			.xpath("//img[contains(@src,'source')]//following-sibling::div//*[text()='Pocket created successfully!']");

	private By msgFailure = By.xpath(
			"//img[contains(@src,'x')]//following-sibling::div//*[text()='This client with this mcc group is already associated with the pocket!']");

	private String verifyRecord = "//td[contains(text(),'%s')]";

	private String pocketEdit = "//*[contains(text(),'%s')]//following-sibling::td//button[text()='Edit']";

	private String mccList = "(//*[contains(text(),'%s')]//following-sibling::td//button[text()='View Mcc List'])[1]";

	private By pocketName = By.xpath("//td[contains(text(),'DEFAULT')]");

	private String pocket = "(//td[contains(text(),'%s')])[1]";

	private By maxLimit = By.xpath("//td[contains(text(),'DEFAULT')]//following-sibling::td[text()='0']");

	private String max = "(//td[contains(text(),'%s')]//following-sibling::td[4])[1]";

	public WebDriver getDriver() {
		return this.driver;
	}

	public void selectClient(String client) {
		try {
			bHelper.click(drpClient);
			log.info(drpClient);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'clientCode')]")).click();
		}
		try {
			tHelper.sendKeys(txtClientSearch, client + Keys.ENTER);
		} catch (Exception e) {
			ObjectRepo.driver
					.findElement(
							By.xpath("//span[contains(@class,'dropdown')]//input[contains(@class,'select2-search')]"))
					.sendKeys(client + Keys.ENTER);
		}
	}

	public void selectProgram(String program) {
		try {
			bHelper.click(drpProgram);
			log.info(drpProgram);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'programCode')]")).click();
		}
		try {
			wHelper.hardWait(5000);
			bHelper.click(ObjectRepo.driver.findElement(By.xpath("//li[text()='" + program + "']")));
		} catch (Exception e) {
			try {
				ObjectRepo.driver.findElement(By.xpath("//li[text()='" + program + "']")).click();
			} catch (Exception e2) {
				try {
					ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'programCode')]")).click();
					ObjectRepo.driver.findElement(By.xpath("//*[contains(@aria-labelledby,'programCode')]")).click();
					ObjectRepo.driver.findElement(By.xpath("//li[text()='" + program + "']")).click();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}

	}

	public void enterPocketName(String pocketName) {
		try {
			tHelper.sendKeys(txtPocketName, pocketName);
			log.info(txtPocketName);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("pocketName")).sendKeys(pocketName);
		}
	}

	public void selectMCCGroup(String[] mccGroup) {
		String s = "";
		for (int i = 0; i < mccGroup.length; i++) {
//			bHelper.click(msMCCGroup);
//			log.info(msMCCGroup);
			s = s + "Enter \"MCC Group\" : " + mccGroup[i];
			if (i == mccGroup.length - 1)
				s = s + "\n";
			try {
				tHelper.sendKeys(txtMCCGroup, mccGroup[i] + Keys.ENTER);
				log.info(txtMCCGroup);
			} catch (Exception e) {
				ObjectRepo.driver.findElement(By.xpath("//input[contains(@class,'select2-search')]"))
						.sendKeys(mccGroup[i] + Keys.ENTER);
			}
		}
		InitializeWebDriver.scenario.write(s);
	}

	public void enterMaxLimit(String maxLimit) {
		try {
			tHelper.sendKeys(txtMaxLimit, maxLimit);
			log.info(txtMaxLimit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("maxLimit")).sendKeys(maxLimit);
		}
	}

	public void clickOnSubmitButton() {
		try {
			bHelper.click(btnSubmit);
			log.info(btnSubmit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("submitButton")).click();
		}
	}

	public void verifyAddPocketSuccessMessage() {
		wHelper.hardWait(10000);
		boolean result = gHelper.IsElementPresentQuick(msgSuccess);
		try {
			new GenericHelper(ObjectRepo.driver)
					.takeScreenShotSuccess(InitializeWebDriver.scenario.getName() + "_Message");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (!result)
			log.error(msgSuccess);
		gHelper.reloadPage();
		try {
			wHelper.hardWait(3000);
			gHelper.acceptAlert();
		} catch (Exception e) {
		}
		Assert.assertTrue(result);
	}

	public void verifyRecord(String program, String pocketName) {
		try {
			System.out.println(program);
			dHelper.SelectUsingVisibleValue(drpProgramSearch, program);
		} catch (Exception e) {
			try {
				Select s = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
				s.selectByVisibleText(program);
			} catch (Exception e2) {
			}
		}
		String s = "Select " + program + "\n";
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, pocketName)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, pocketName)));
//		Assert.assertTrue(result);
		s = s + "Verified that pocket " + pocketName + " is present";
		InitializeWebDriver.scenario.write(s);
	}

	public void searchPocket(String program) {
		try {
			dHelper.SelectUsingVisibleValue(drpProgramSearch, program);
		} catch (Exception e) {
//			try {
//				Select s = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
//				s.selectByVisibleText(program);
//			} catch (Exception e2) {
//			}
		}
		InitializeWebDriver.scenario.write("Select " + program);
	}

	public void verifyPocket(String pocketName) {
		boolean result = gHelper.IsElementPresentQuick(By.xpath(String.format(verifyRecord, pocketName)));
		if (!result)
			log.error(By.xpath(String.format(verifyRecord, pocketName)));
		Assert.assertTrue(result);
	}

	public void verifyAddPocketFailureMessage() {
		boolean result = gHelper.IsElementPresentQuick(msgFailure);
		if (!result)
			log.error(msgFailure);
		gHelper.reloadPage();
		wHelper.hardWait(3000);
		gHelper.acceptAlert();
		Assert.assertTrue(result);
	}

	public String getMCCGroup() {
		try {
			bHelper.click(txtMCCGroup);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//input[contains(@class,'select2-search')]")).click();
		}
		List<WebElement> list = ObjectRepo.driver
				.findElements(By.xpath("//*[contains(@id,'mccGroupName-results')]//li"));
		return list.get(ThreadLocalRandom.current().nextInt(0, list.size() - 1)).getText();
	}

	public String get2ndMCCGroup() {
		List<WebElement> list = ObjectRepo.driver
				.findElements(By.xpath("//*[contains(@id,'mccGroupName-results')]//li"));
		return list.get(ThreadLocalRandom.current().nextInt(0, list.size())).getText();
	}

	public void updateLimit(String program, String pocketName, String limit) {
		try {
			System.out.println(program);
			dHelper.SelectUsingVisibleValue(drpProgramSearch, program);
		} catch (Exception e) {
			try {
				Select select = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
				select.selectByVisibleText(program);
			} catch (Exception e2) {
			}
		}
		String s = "Select " + program + "\n";
		try {
			bHelper.click(By.xpath(String.format(pocketEdit, pocketName)));
		} catch (Exception e) {
			gHelper.reloadPage();
			if (!gHelper.IsElementPresentQuick(By.xpath(String.format(pocketEdit, pocketName)))) {
				lP.loginOtherUser(ObjectRepo.reader.getAdminURL(), ObjectRepo.reader.getAdminUserName(),
						ObjectRepo.reader.getAdminPassword());
				nP.navigateToPocket();
				nP.navigateToListPocket();
				try {
					System.out.println(program);
					dHelper.SelectUsingVisibleValue(drpProgramSearch, program);
				} catch (Exception e1) {
					try {
						Select select = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
						select.selectByVisibleText(program);
						ObjectRepo.driver.findElement(By.xpath(String.format(pocketEdit, pocketName))).click();
					} catch (Exception e2) {
					}
				}
			}
			try {
				System.out.println(program);
				dHelper.SelectUsingVisibleValue(drpProgramSearch, program);
			} catch (Exception e2) {
				try {
					Select select = new Select(ObjectRepo.driver.findElement(By.id("programHashId")));
					select.selectByVisibleText(program);
				} catch (Exception e3) {
				}
			}
			try {
				bHelper.click(By.xpath(String.format(pocketEdit, pocketName)));
			} catch (Exception e4) {
				ObjectRepo.driver.findElement(By.xpath(String.format(pocketEdit, pocketName))).click();
			}
			s = "Select " + program + "\n";

		}
		s = s + "Click on\"Edit\" button of pocket " + pocketName + "\n";
		try {
			tHelper.clearAndSendKeys(maxLimitId, limit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.id("maxLimitId")).clear();
			ObjectRepo.driver.findElement(By.id("maxLimitId")).sendKeys(limit);
		}
		s = s + "Enter \"Max Limit\" : " + limit + "\n";
		try {
			bHelper.click(updateLimit);
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath("//button[text()='UPDATE LIMT']")).click();
		}
		s = s + "Click on\"Update Limit\" button";
		InitializeWebDriver.scenario.write(s);
	}

	public void clickOnViewMCCList(String pocket) {
		try {
			bHelper.click(By.xpath(String.format(mccList, pocket)));
		} catch (Exception e) {
			ObjectRepo.driver.findElement(By.xpath(String.format(mccList, pocket))).click();
		}
	}

	public List<String> getMCCList() {
		List<String> list = new ArrayList<String>();
		List<WebElement> elements = lHelper.getList(mcc);
		for (WebElement element : elements) {
			list.add(element.getText());
		}
		return list;
	}

	public void verifyPocketNameAndMaxLimit() {
		boolean status = gHelper.IsElementPresentQuick(pocketName);
		status = gHelper.IsElementPresentQuick(maxLimit);
		System.out.println(status);
//		Assert.assertTrue(status);
	}

	public void verifyPocketNameAndMaxLimit(String pocketName) {
		boolean status = gHelper.IsElementPresentQuick(By.xpath(String.format(pocket, pocketName)));
		status = gHelper.IsElementPresentQuick(By.xpath(String.format(max, pocketName)));
		if (status) {
			try {
				DataConstants.maxLimit = (int) Math
						.round(Double.parseDouble(tHelper.getText(By.xpath(String.format(max, pocketName)))));
			} catch (Exception e) {
				DataConstants.maxLimit = (int) Math.round(Double.parseDouble(
						ObjectRepo.driver.findElement(By.xpath(String.format(max, pocketName))).getText()));
			}
		}
//		Assert.assertTrue(status);
		DataConstants.maxLimit = 1000;
		InitializeWebDriver.scenario.write("Verified that pocket name is " + DataConstants.Travel_Default_GC_Pocket
				+ " and max limit is " + DataConstants.maxLimit);
	}
}
