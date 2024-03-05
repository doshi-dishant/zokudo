package com.zokudo.helper.PageObject;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zokudo.constants.Constants;
import com.zokudo.framework.helper.BasePageObject.PageBase;
import com.zokudo.framework.helper.Button.ButtonHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.helper.TextBox.TextBoxHelper;
import com.zokudo.framework.list.ListHelper;

public class EODReportListPage extends PageBase {

	private WebDriver driver;

	private final static Logger log = LoggerHelper.getLogger(EODReportListPage.class);
	private ButtonHelper bHelper;
	private TextBoxHelper tHelper;
	private ListHelper lHelper;

	public EODReportListPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		bHelper = new ButtonHelper(driver);
		tHelper = new TextBoxHelper(driver);
		lHelper = new ListHelper(driver);
	}

	/** Web Elements */

	@FindBy(xpath = "//tr[1]//a[1]")
	@CacheLookup
	private WebElement serverPath;

	private By tableValues = By.xpath("//tr//td[2]");

	public WebDriver getDriver() {
		return this.driver;
	}

	public void verifyCreatedAtDateSequence() {
		List<WebElement> elements = lHelper.getList(tableValues);
		List<String> list = new ArrayList<String>();
		for (WebElement element : elements) {
			list.add(tHelper.getText(element).replace("T", " ").substring(0, 19));
			List<String> newList = new ArrayList<String>(list);
			Collections.sort(newList, new Comparator<String>() {
				DateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				@Override
				public int compare(String o1, String o2) {
					try {
						return f.parse(o1).compareTo(f.parse(o2));
					} catch (ParseException e) {
						throw new IllegalArgumentException(e);
					}
				}
			});
			if (!newList.equals(newList))
				Assert.assertTrue(false);
		}

	}

	public void clickOnServerPath() {
		File dir = new File(Constants.DOWNLOAD_DIR);
		if (!dir.exists())
			dir.mkdir();
		bHelper.click(serverPath);
		log.info(serverPath);
	}

	public void verifyDownloadedReport() {
		File dir = new File(Constants.DOWNLOAD_DIR);
		File[] dirContents = dir.listFiles();
		if (dirContents.length <= 0)
			Assert.assertTrue(false);
	}

}
