package com.test.demo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="/html/body/div[3]/div[2]/div/ul/li[4]/a")
	public WebElement customer;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void click_cusotmer_dropdown() {
		customer.click();
	}
}
