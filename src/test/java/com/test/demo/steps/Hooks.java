package com.test.demo.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.test.demo.utilities.BrowserUtilities;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BrowserUtilities{

	 @AfterStep
	   public void screenShot(Scenario scenario) { 
		  // driver.close();
		 embedScreenshot(scenario);
	   }
	 @After
	 public void tearDown() {
		 driver.close();
	 }
	 public byte[] embedScreenshot(Scenario scenario) {
			byte[] srcBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(srcBytes, "image/png",scenario.getName());
			return srcBytes;
		}
	@Before
	public void init() {
		System.out.println("tesgt");
		BrowserUtilities.launchBrowser();
	}
}
