package com.zokudo.helper.PageObject;

import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zokudo.constants.Constants;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Javascript.JavaScriptHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.Navigation.NavigationHelper;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.framework.utility.ExcelHelper;

public class CommonPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(CommonPage.class);
	private NavigationHelper nHelper;
	private ButtonHelper bHelper;
	private JavaScriptHelper jHelper;

	public CommonPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		nHelper = new NavigationHelper(driver);
		bHelper = new ButtonHelper(driver);
		jHelper = new JavaScriptHelper(driver);
	}

	/** Web Elements */

	@FindBy(xpath = "//h4[contains(@class,'body')]//following-sibling::*//*[@id='confirmButton']")
	@CacheLookup
	private WebElement btnOk;

	@FindBy(xpath = "(//h4[contains(@class,'body')]//following-sibling::*//*[text()='OK'])[last()]")
	@CacheLookup
	private WebElement btnErrorOk;

	@FindBy(xpath = "//button[text()='Confirm']")
	@CacheLookup
	private WebElement btnConfirm;

	/** Public Methods **/

	public WebDriver getDriver() {
		return this.driver;
	}

	public void clickOnOkButton() {
		try {
			bHelper.click(btnOk);
			log.info(btnOk);
		} catch (Exception e) {
			try {
				ObjectRepo.driver
						.findElement(
								By.xpath("//h4[contains(@class,'body')]//following-sibling::*//*[@id='confirmButton']"))
						.click();
			} catch (Exception e2) {
				ObjectRepo.driver.navigate().refresh();
				ObjectRepo.driver.get(ObjectRepo.driver.getCurrentUrl());
			}
		}
	}

	public void clickOnOkButtonForErrors() {
		try {
			bHelper.click(btnErrorOk);
			log.info(btnErrorOk);
		} catch (Exception e) {
			jHelper.clickUsingJS(btnErrorOk);
		}
	}

	public void clickOnConfirmButton() {
		try {
			bHelper.click(btnConfirm);
			log.info(btnConfirm);
			Thread.sleep(3000);
		} catch (Exception e) {
			try {
				Thread.sleep(3000);
				ObjectRepo.driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			} catch (Exception e2) {
				ObjectRepo.driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			}
		}
	}

	public void verifyURL(String url) {
		if (!url.equalsIgnoreCase(nHelper.getCurrentUrl())) {
			log.error("URL mis match");
			System.err.println("############");
			System.err.println(url);
			System.err.println(nHelper.getCurrentUrl());
			System.err.println("############");
//			Assert.assertTrue(false, "URL mis match");
			ObjectRepo.driver.get(url);
		}
	}

	public String getUnusedKitNumber(String programName) {
		String kit = null;
		String fileName = System.getProperty("user.dir") + "/src/main/resources/uploads/" + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.isEmpty()) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Fresh Kit Num : " + kit + " ####");
					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Ready To Assign");
					break;
				}
			}
		}
		return kit;
	}

	public String getUsedKitNumber(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (!status.isEmpty()) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Used Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 2, "Used");
					break;
				}
			}
		}
		return kit;
	}

	public String getReadyToAssignKitNumber(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Ready To Assign")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Ready To Assign Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Assigned");
					break;
				}
			}
		}
		return kit;
	}

	public String getMaskedNumber(String kitNum) {
		String fileName = Constants.uploadPath + "Kits.xls";
		Map<String, Map<Integer, Map<String, String>>> map = ExcelHelper.readCompleteExcelFile(fileName);
		return map.get("Kits").get(ExcelHelper.findRow(map.get("Kits"), kitNum)).get("Masked Num").toString();
	}

	public String getExpiryDate(String kitNum) {
		String fileName = Constants.uploadPath + "Kits.xls";
		Map<String, Map<Integer, Map<String, String>>> map = ExcelHelper.readCompleteExcelFile(fileName);
		return map.get("Kits").get(ExcelHelper.findRow(map.get("Kits"), kitNum)).get("Exp Date").toString();
	}

	public String getKitNumberForDistributor(String programName) {
		String kit = null;
		String fileName = System.getProperty("user.dir") + "/src/main/resources/uploads/" + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Assigned")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### For Distributor Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Assigned To Distributor");
					break;
				}
			}
		}
		return kit;
	}

	public String getKitNumberForRetailer(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Assigned To Distributor")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### For Retailer Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Ready To Card Issue");
					break;
				}
			}
		}
		return kit;
	}

	public String getReadyToCardIssueKitNumber(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Ready To Card Issue")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Ready For Card Issue Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Card Issued");
					break;
				}
			}
		}
		return kit;
	}

	public void updateStatus(String kitNum, String status) {
		String fileName = Constants.uploadPath + "Kits.xls";
		Map<String, Map<Integer, Map<String, String>>> map = ExcelHelper.readCompleteExcelFile(fileName);
		ExcelHelper.setCellData(fileName, "Kits", ExcelHelper.findRow(map.get("Kits"), kitNum), 4, status);
	}

	public String getReadyToCardIssueForClient2KitNumber(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Ready To Card Issue - Client2")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Ready For Card Issue Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Card Issued");
					break;
				}
			}
		}
		return kit;
	}

	public String getCardIssuedKitNumber(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Card Issued")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Card Issued Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Card Loaded");
					break;
				}
			}
		}
		return kit;
	}

	public String getCardIssuedToClient2KitNumber(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Card Issued - Client2")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Card Issued Kit Num : " + kit + " ####");
//					ExcelHelper.setCellData(fileName, "Kits", i, 4, "Card Loaded");
					break;
				}
			}
		}
		return kit;
	}

	public String getCardLoadedKitNumber(String programName) {
		String kit = null;
		String fileName = Constants.uploadPath + "Kits.xls";
		int rows = ExcelHelper.getRowCount(fileName, "Kits");
		for (int i = 1; i <= rows; i++) {
			String status = ExcelHelper.getCellData(fileName, "Kits", i, 4);
			if (status.equalsIgnoreCase("Card Loaded")) {
				String program = ExcelHelper.getCellData(fileName, "Kits", i, 1);
				if (program.equalsIgnoreCase(programName)) {
					kit = ExcelHelper.getCellData(fileName, "Kits", i, 0);
					System.out.println("#### Card Loaded Kit Num : " + kit + " ####");
					break;
				}
			}
		}
		return kit;
	}
}
