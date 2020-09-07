package com.test.demo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtilities {

public static WebDriver launchBrowser(WebDriver driver,String url,String browserName){
	if(browserName.toLowerCase().equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	return driver;
	}
	return null;
}
}
