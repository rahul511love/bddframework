package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/automationTests",
 glue= {"stepdefinitions"},
 plugin = {"html:target/LoginReport", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber/report.html"})

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getReportConfigPath()));
		 }

}
