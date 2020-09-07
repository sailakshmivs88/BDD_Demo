package com.test.demo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.demo.pageobjects.LoginPage;
import com.test.demo.utilities.BrowserUtilities;
import com.test.demo.utilities.FilePeopertiesReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitions extends BrowserUtilities{
	private WebDriver driver;
	LoginPage loginpage;
	@Before
	public void init() {
		System.out.println("tesgt");
		driver=BrowserUtilities.launchBrowser(driver, "https://admin-demo.nopcommerce.com/", "chrome");
	loginpage=new LoginPage(driver);
	}
//
//	@AfterStep
//	public void screenshot() {
//		
//	}
	
	   @After 
	   public void teardown() { 
		   driver.close();
	   }
	 	@Given("user launch the application {string}")
	public void user_launch_the_application(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 		driver.manage().window().maximize();
	 		driver.get(FilePeopertiesReader.propReader("url"));
	 	}
	/*
	 * @Given("user launch the application {string}") public void
	 * user_launch_the_application(String string) { // Write code here that turns
	 * the phrase above into concrete actions
	 * driver.findElement(By.cssSelector("#Email")).clear();
	 * driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");
	 * }
	 */
	
//    @Given("^user launch the application \"([^\"]*)\"$")
//    public void user_launch_the_application_something(String strArg1) throws Throwable {
//     
//    }

    @When("^Click on the login button$")
    public void click_on_the_login_button() throws Throwable {
     loginpage.login();
    }

    @Then("^Verifies user logged in successfuly$")
    public void verifies_user_logged_in_successfuly() throws Throwable {
     
    }

    @Then("^Verifies user logout successfully$")
    public void verifies_user_logout_successfully() throws Throwable {
     
    }

    @And("^Enter the username \"([^\"]*)\"$")
    public void enter_the_username_something(String strArg1) throws Throwable {
     loginpage.email(FilePeopertiesReader.propReader("email"));
    }

    @And("^Enter the password \"([^\"]*)\"$")
    public void enter_the_password_something(String strArg1) throws Throwable {
     loginpage.password(FilePeopertiesReader.propReader("password"));
    }

    @And("^click on the logot button$")
    public void click_on_the_logot_button() throws Throwable {
     
    }

}
