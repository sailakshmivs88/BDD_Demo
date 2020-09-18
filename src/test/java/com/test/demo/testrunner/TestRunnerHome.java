package com.test.demo.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
        features = "src/test/resources/Features/Login.feature"
        ,glue={"com.test.demo.steps"},
        dryRun = false,plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
       
        )
 
public class TestRunnerHome extends AbstractTestNGCucumberTests {

	@DataProvider
	public  Object[][] scenarios(){
		return super.scenarios();
	}
}
