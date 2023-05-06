package org.runner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.base.Global;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeExection extends Global {

	@Before(order = 2)
	public void beforeExecutedClass(Scenario scenario) {
		System.out.println("Scenario Starts");
	}

	@After(order = 1)
	public void afterExecutedClass(Scenario scenario) {
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//		String date = simpleDateFormat.format(new Date()).replaceAll("-", "").replaceAll(" ", "").replaceAll(":", "");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File Source = screenshot.getScreenshotAs(OutputType.FILE);
//		File destination = new File(
//				System.getProperty("user.dir") + "\\target\\Screenshot\\" + scenario.getName() + date + ".png");
//		try {
//			FileUtils.copyFile(Source, destination);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if (scenario.isFailed()) {
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
		}
	}


}
