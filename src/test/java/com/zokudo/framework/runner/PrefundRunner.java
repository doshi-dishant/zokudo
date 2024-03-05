
package com.zokudo.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/Prefund.feature" }, glue = {
		"classpath:com.zokudo.framework.stepdefinition",
		"classpath:com.zokudo.framework.helper" }, plugin = { "pretty", "json:target/PrefundRunner.json" })

public class PrefundRunner extends AbstractTestNGCucumberTests {

}
