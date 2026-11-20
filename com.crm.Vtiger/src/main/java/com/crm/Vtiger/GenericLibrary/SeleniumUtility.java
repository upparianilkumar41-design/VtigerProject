package com.crm.Vtiger.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void navToApplication(WebDriver driver,String url) {
		driver.get(url);
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	public void selectOptionFromDropdownByContainText(WebElement address,String Text) {
		Select s = new Select(address);
		s.selectByContainsVisibleText(Text);
	}	
	}

