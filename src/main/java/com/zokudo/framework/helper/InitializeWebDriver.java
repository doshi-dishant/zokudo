
package com.zokudo.framework.helper;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.zokudo.constants.Constants;
import com.zokudo.framework.configreader.PropertyFileReader;
import com.zokudo.framework.configuration.browser.BrowserType;
import com.zokudo.framework.configuration.browser.ChromeBrowser;
import com.zokudo.framework.configuration.browser.FirefoxBrowser;
import com.zokudo.framework.configuration.browser.HtmlUnitBrowser;
import com.zokudo.framework.configuration.browser.IExploreBrowser;
import com.zokudo.framework.configuration.browser.PhantomJsBrowser;
import com.zokudo.framework.exception.NoSuitableDriverFoundException;
import com.zokudo.framework.helper.Generic.GenericHelper;
import com.zokudo.framework.helper.Logger.LoggerHelper;
import com.zokudo.framework.settings.ObjectRepo;
import com.zokudo.helper.PageObject.LoginPage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class InitializeWebDriver {

	private Logger oLog = LoggerHelper.getLogger(InitializeWebDriver.class);
//	private Logger LOGGER = LogManager.getLogger(InitializeWebDriver.class);
//	private static ExtentTest test;
//	private static boolean flag;
	public static Scenario scenario;

	public InitializeWebDriver(PropertyFileReader reader) {
		ObjectRepo.reader = reader;
	}

	@SuppressWarnings("deprecation")
	public WebDriver standAloneStepUp(BrowserType bType) throws Exception {
		try {
			oLog.info(bType);
//			System.err.println("###################");
//			System.out.println("Environment : " + System.getProperty("environment"));
//			System.err.println("###################");
			switch (bType) {
			case Chrome:
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();
				return chrome.getChromeDriver(chrome.getChromeCapabilities());

			case Firefox:
				FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
				return firefox.getFirefoxDriver(firefox.getFirefoxCapabilities());

			case HtmlUnitDriver:
				HtmlUnitBrowser htmlUnit = HtmlUnitBrowser.class.newInstance();
				return htmlUnit.getHtmlUnitDriver(htmlUnit.getHtmlUnitDriverCapabilities());

			case Iexplorer:
				IExploreBrowser iExplore = IExploreBrowser.class.newInstance();
				return iExplore.getIExplorerDriver(iExplore.getIExplorerCapabilities());

			case PhantomJs:
				PhantomJsBrowser jsBrowser = PhantomJsBrowser.class.newInstance();
				return jsBrowser.getPhantomJsDriver(jsBrowser.getPhantomJsService(),
						jsBrowser.getPhantomJsCapability());

			default:
				throw new NoSuitableDriverFoundException(" Driver Not Found : " + ObjectRepo.reader.getBrowser());
			}
		} catch (Exception e) {
			oLog.equals(e);
			throw e;
		}
	}

	@Before({ "~@firefox", "~@chrome", "~@phantomjs", "~@iexplorer" })
	public void before(Scenario scenario) throws Exception {
		setUpDriver(scenario, ObjectRepo.reader.getBrowser());
		oLog.info(ObjectRepo.reader.getBrowser());
	}

	@After({ "~@firefox", "~@chrome", "~@phantomjs", "~@iexplorer" })
	public void after(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	@Before(order = 4, value = { "@iexplorer" })
	public void beforeExplorer(Scenario scenario) throws Exception {
		setUpDriver(scenario, BrowserType.Iexplorer);
		oLog.info(BrowserType.Iexplorer);
	}

	@After(order = 4, value = { "@iexplorer" })
	public void afterExplorer(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	@Before(order = 3, value = { "@firefox" })
	public void beforeFirefox(Scenario scenario) throws Exception {
		setUpDriver(scenario, BrowserType.Firefox);
		oLog.info(BrowserType.Firefox);
	}

	@After(order = 3, value = { "@firefox" })
	public void afterFirefox(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	@Before(order = 2, value = { "@chrome" })
	public void beforeChrome(Scenario scenario) throws Exception {
		setUpDriver(scenario, BrowserType.Chrome);
		oLog.info(BrowserType.Chrome);
	}

	@After(order = 2, value = { "@chrome" })
	public void afterChrome(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	@Before(order = 1, value = { "@phantomjs" })
	public void beforePhantomjs(Scenario scenario) throws Exception {
		setUpDriver(scenario, BrowserType.PhantomJs);
		oLog.info(BrowserType.PhantomJs);
	}

	@After(order = 1, value = { "@phantomjs" })
	public void afterPhantomjs(Scenario scenario) throws Exception {
		tearDownDriver(scenario);
		oLog.info("");
	}

	public void setUpDriver(Scenario scenario, BrowserType bType) throws Exception {
		InitializeWebDriver.scenario = scenario;
//		flag = false;
//		String scenarioName = scenario.getName();
//		test = TestRunner
		if (!Boolean.parseBoolean(System.getProperty("API"))) {
			if (Constants.loginCounter == 0) {
				ObjectRepo.driver = standAloneStepUp(bType);
				oLog.debug("InitializeWebDrive : " + ObjectRepo.driver.hashCode());
				ObjectRepo.driver.manage().timeouts().pageLoadTimeout(ObjectRepo.reader.getPageLoadTimeOut(),
						TimeUnit.SECONDS);
				ObjectRepo.driver.manage().timeouts().implicitlyWait(ObjectRepo.reader.getImplicitWait(),
						TimeUnit.SECONDS);
				ObjectRepo.driver.manage().window().maximize();
				ObjectRepo.driver.get(ObjectRepo.reader.getAdminURL());
//			Robot robot = new Robot();
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			robot.keyRelease(KeyEvent.VK_MINUS);
				LoginPage lP = new LoginPage(ObjectRepo.driver);
//			try {
//				((JavascriptExecutor) ObjectRepo.driver).executeScript(
//						"document.querySelectorAll('.rc-anchor rc-anchor-normal rc-anchor-light').forEach(function(element) {element.remove();});");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
				lP.enterUserName(ObjectRepo.reader.getAdminUserName());
				lP.enterPass(ObjectRepo.reader.getAdminPassword());
				lP.clickOnLogInButton();
				Constants.loginCounter++;
			}
		}
	}

	public void tearDownDriver(Scenario scenario) throws Exception {
		try {
			if (ObjectRepo.driver != null) {
				if (scenario.isFailed())
					scenario.write(new GenericHelper(ObjectRepo.driver).takeScreenShot(scenario.getName()));
//				ObjectRepo.driver.quit();
//				ObjectRepo.reader = null;
//				ObjectRepo.driver = null;
//				oLog.info("Shutting Down the driver");
			}
		} catch (Exception e) {
			oLog.error(e);
			throw e;
		}
	}
}
