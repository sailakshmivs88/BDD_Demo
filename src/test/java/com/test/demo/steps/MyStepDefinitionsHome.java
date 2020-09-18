package com.test.demo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.demo.pageobjects.LoginPage;
import com.test.demo.pageobjects.PageObjectManager;
import com.test.demo.utilities.BrowserUtilities;
import com.test.demo.utilities.FilePeopertiesReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitionsHome {
	   
	   @Given("^user not launch the application \"([^\"]*)\"$")
	    public void user_not_launch_the_application_something(String strArg1) throws Throwable {
	   // driver.close();
		   System.out.println("test2");
		   PageObjectManager.getHomePage().click_cusotmer_dropdown();
		   System.out.println("gjhgkjh");
		   
	   }
}
