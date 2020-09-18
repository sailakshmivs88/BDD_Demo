package com.test.demo.pageobjects;

import org.openqa.selenium.WebDriver;

import com.test.demo.utilities.BrowserUtilities;

public class PageObjectManager{
	public static LoginPage loginPage;
	public static HomePage homePage;
	
	public static LoginPage getLoginPage() {
		return loginPage=new LoginPage(BrowserUtilities.getWebDriver());
	}
	
	public static HomePage getHomePage() {
		return homePage=new HomePage(BrowserUtilities.getWebDriver());
	}
}
