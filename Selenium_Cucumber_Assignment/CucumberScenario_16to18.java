package Selenium_Cucumber_Assignment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:CucumberReports/Extent-Cucumber-reports/CucumberExtent.html" }, 
glue = {"stepdefinitions" }, 
tags = { "@Directory" }, 
format = { "pretty",
				"html:CucumberReports/cucumber-reports/cucumber-pretty",
				"json:CucumberReports/cucumber-reports/CucumberTestReport.json",
				"junit:CucumberReports/cucumber-reports/Cucumber.xml",
				"rerun:CucumberReports/cucumber-reports/rerun.txt" },
monochrome = true)

public class CucumberScenario_16to18 {

}
