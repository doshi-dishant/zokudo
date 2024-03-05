
package com.zokudo.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/EODReportList.feature" }, glue = {
		"classpath:com.zokudo.framework.stepdefinition",
		"classpath:com.zokudo.framework.helper" }, plugin = { "pretty", "json:target/EODReportListRunner.json" })

public class EODReportListRunner extends AbstractTestNGCucumberTests {

}
