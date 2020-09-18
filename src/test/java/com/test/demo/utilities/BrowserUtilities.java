package com.test.demo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtilities {
public static WebDriver driver;

public static WebDriver getWebDriver() {
	if(driver==null) {
		 launchBrowser();
	}
	return driver;
}
public static void launchBrowser(){
	if(FilePeopertiesReader.propReader("browser").toLowerCase().equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get(FilePeopertiesReader.propReader("url"));
	//return driver;
	}
//	return null;
	
}
}
