package com.test.demo.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
        features = "src/test/resources/Login.feature"
        ,glue={"com.test.demo.steps"}
        )
 
public class TestRunner extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = true)
	public  Object[][] scenarios(){
		return super.scenarios();
	}
}
