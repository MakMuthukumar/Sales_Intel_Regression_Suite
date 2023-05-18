package org.runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.Global;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features\\New_UI_View\\", glue = { "org.stepdefinition",
		"org.runner" }, dryRun = false, monochrome = true, tags = { "@First1,@Sanity1" }, plugin = {
				"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty",
				"html:src\\test\\resources\\Reports\\HTML", "json:src\\test\\resources\\Reports\\Json\\cucumber.json",
				"junit:src\\test\\resources\\Reports\\XML\\cucumber.xml" })
public class Runner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void allureReportCleanup() throws Throwable {
		String allureFile = System.getProperty("user.dir") + "\\allure-results";
		String cucumberFile = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Reports\\CucumberReports\\cucumber-html-reports";
		File allureFileDirectoy = new File(allureFile);

		if (allureFileDirectoy.isDirectory()) {
			try {
				FileUtils.cleanDirectory(allureFileDirectoy);
				Thread.sleep(2000);
				System.out.println("Previously generated Allure Execution Files Deleted Permanently");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		File cucumberFileDirectory = new File(cucumberFile);
		if (cucumberFileDirectory.isDirectory()) {
			try {
				FileUtils.cleanDirectory(cucumberFileDirectory);
				Thread.sleep(2000);
				System.out.println("Previously generated Cucumber Reort Execution Files Deleted Permanently");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@AfterSuite
	public void cucumberReportGenerate() {
		Global.generateJVMReport(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\Json\\cucumber.json");
	}

}
