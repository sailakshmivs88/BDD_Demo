package com.test.demo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(css = "#Email")
	public WebElement email;
	@FindBy(css="#Password")
	public WebElement password;
	@FindBy(css="[value='Log in']")
	public WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void email(String value) {
		email.clear();
		email.sendKeys(value);
		}
	public void password(String value) {
		password.clear();
		password.sendKeys(value);
	}
	public void login() {
		login.click();
	}
}
