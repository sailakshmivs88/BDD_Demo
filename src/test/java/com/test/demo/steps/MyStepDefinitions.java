package com.test.demo.steps;


import com.test.demo.pageobjects.PageObjectManager;
import com.test.demo.utilities.FilePeopertiesReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitions {
	

	  
	 	@Given("user launch the application {string}")
	public void user_launch_the_application(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 		System.out.println("test1");
	 	}

    @When("^Click on the login button$")
    public void click_on_the_login_button() throws Throwable {
     PageObjectManager.getLoginPage().login();
    }

    @Then("^Verifies user logged in successfuly$")
    public void verifies_user_logged_in_successfuly() throws Throwable {
     
    }

    @Then("^Verifies user logout successfully$")
    public void verifies_user_logout_successfully() throws Throwable {
     
    }

    @And("^Enter the username \"([^\"]*)\"$")
    public void enter_the_username_something(String strArg1) throws Throwable {
     PageObjectManager.getLoginPage().email(FilePeopertiesReader.propReader("email"));
    }

    @And("^Enter the password \"([^\"]*)\"$")
    public void enter_the_password_something(String strArg1) throws Throwable {
     PageObjectManager.getLoginPage().password(FilePeopertiesReader.propReader("password"));
    }

    @And("^click on the logot button$")
    public void click_on_the_logot_button() throws Throwable {
     
    }

}
