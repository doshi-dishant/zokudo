
package com.zokudo.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/DashboardBalance.feature" }, glue = {
		"classpath:com.zokudo.framework.stepdefinition",
		"classpath:com.zokudo.framework.helper" }, plugin = { "pretty", "json:target/DashboardBalanceRunner.json" })

public class DashboardBalanceRunner extends AbstractTestNGCucumberTests {

}
