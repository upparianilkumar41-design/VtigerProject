package com.crm.Vtiger.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {
public static WebDriver driver;
FileUtility f = new FileUtility();
SeleniumUtility sutility = new SeleniumUtility();
@BeforeSuite
public void connectToDatabase() {
	Reporter.log("database connected successfully",true);
}
@Parameters("browser")
@BeforeTest
public void launchBrowser(String BROWSER) throws IOException {
	if (BROWSER.equals("chrome")) {
		driver = new ChromeDriver();
	} else if (BROWSER.equals("firefox")) {
		driver = new FirefoxDriver();
	} else if (BROWSER.equals("edge")) {
		driver = new EdgeDriver();
	} else {
        driver = new ChromeDriver();
	} 
	//driver = new ChromeDriver();
	sutility.maximizeWindow(driver);
	sutility.implicitwait(driver);
   String URL = f.readDataFromProperty("url");
   sutility.navToApplication(driver, URL);
	Reporter.log("lanched browser and nav to vtiger",true);
}

@BeforeMethod
public void loginToVitiger() throws IOException {
	LoginPage lp = new LoginPage(driver);
	String un = f.readDataFromProperty("username");
	String pw = f.readDataFromProperty("password");
	lp.loginToVtiger(driver, un, pw);
	
	Reporter.log("logged in successfully",true);
}

@AfterMethod
public void logoutfromVtiger() {
	HomePage hp = new HomePage(driver);
	hp.logout(driver);
	Reporter.log("logged out from vtiger",true);
}

@AfterTest
public void closeBrowser() {
	sutility.closeBrowser(driver);
    Reporter.log("browser closed successfully",true);
}

@AfterSuite
public void disconnectedWithDatabase() {
	Reporter.log("database is disconnected",true);
}
}
