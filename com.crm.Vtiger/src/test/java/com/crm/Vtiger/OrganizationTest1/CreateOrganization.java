package com.crm.Vtiger.OrganizationTest1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Vtiger.GenericLibrary.BaseClass;
import com.crm.Vtiger.GenericLibrary.FileUtility;
import com.crm.Vtiger.GenericLibrary.ListenerImplimentation;
import com.crm.Vtiger.GenericLibrary.SeleniumUtility;

import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
 @Listeners(ListenerImplimentation.class)
public class CreateOrganization extends BaseClass{
	@Test
	public void Createorg() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		hp.getOrglink().click();
		
		OrganizationPage op = new OrganizationPage(driver);
		op.getPlusicon().click();
		
		FileUtility f = new FileUtility();
		String name = f.readDataFromExcelString("Organizationdetails", 1, 1);
		op.getOrgname().sendKeys(name);
		
	String email = f.readDataFromExcelString("Organizationdetails", 1, 2);
	op.getEmailaddress().sendKeys(email);
	WebElement industry = op.getIndustrydrop();
	SeleniumUtility s = new SeleniumUtility();
	s.selectOptionFromDropdownByContainText(industry,"Education");
	WebElement type = op.getTypedrop();
	s.selectOptionFromDropdownByContainText(type,"Customer");
	String billingaddress = f.readDataFromExcelString("Organizationdetails", 1, 3);
	String shippingaddress = f.readDataFromExcelString("Organizationdetails", 1, 4);
	op.getBillingaddresss().sendKeys(billingaddress);
	op.getShippingaddress().sendKeys(shippingaddress);
	
	String billingcity = f.readDataFromExcelString("Organizationdetails", 1, 5);
	String shippingcity = f.readDataFromExcelString("Organizationdetails", 1, 6);
	op.getBillingcity().sendKeys(billingcity);
	op.getShippigcity().sendKeys(shippingcity);
	
	String billingstate = f.readDataFromExcelString("Organizationdetails34", 1, 7);
	String shippingstate = f.readDataFromExcelString("Organizationdetails", 1, 8);
	op.getBillingcity().sendKeys(billingstate);
	op.getShippigcity().sendKeys(shippingstate);
	
	String billingcountry = f.readDataFromExcelString("Organizationdetails", 1, 9);
	String shippingcountry = f.readDataFromExcelString("Organizationdetails", 1, 10);
	op.getBillingcity().sendKeys(billingcountry);
	op.getShippigcity().sendKeys(shippingcountry);
	
	String description = f.readDataFromExcelString("Organizationdetails", 1,11);
	op.getDesp().sendKeys(description);
	
	op.getSavebtn().click();
	}
	
	public void Createorg1() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		hp.getOrglink().click();
		
		OrganizationPage op = new OrganizationPage(driver);
		op.getPlusicon().click();
		
		FileUtility f = new FileUtility();
		String name = f.readDataFromExcelString("Organizationdetails", 1, 1);
		op.getOrgname().sendKeys(name);
		
	String email = f.readDataFromExcelString("Organizationdetails", 1, 2);
	op.getEmailaddress().sendKeys(email);
	WebElement industry = op.getIndustrydrop();
	SeleniumUtility s = new SeleniumUtility();
	s.selectOptionFromDropdownByContainText(industry,"Education");
	WebElement type = op.getTypedrop();
	s.selectOptionFromDropdownByContainText(type,"Customer");
	String billingaddress = f.readDataFromExcelString("Organizationdetails", 1, 3);
	String shippingaddress = f.readDataFromExcelString("Organizationdetails", 1, 4);
	op.getBillingaddresss().sendKeys(billingaddress);
	op.getShippingaddress().sendKeys(shippingaddress);
	
	String billingcity = f.readDataFromExcelString("Organizationdetails", 1, 5);
	String shippingcity = f.readDataFromExcelString("Organizationdetails", 1, 6);
	op.getBillingcity().sendKeys(billingcity);
	op.getShippigcity().sendKeys(shippingcity);
	
	String billingstate = f.readDataFromExcelString("Organizationdetails34", 1, 7);
	String shippingstate = f.readDataFromExcelString("Organizationdetails", 1, 8);
	op.getBillingcity().sendKeys(billingstate);
	op.getShippigcity().sendKeys(shippingstate);
	
	String billingcountry = f.readDataFromExcelString("Organizationdetails", 1, 9);
	String shippingcountry = f.readDataFromExcelString("Organizationdetails", 1, 10);
	op.getBillingcity().sendKeys(billingcountry);
	op.getShippigcity().sendKeys(shippingcountry);
	
	String description = f.readDataFromExcelString("Organizationdetails", 1,11);
	op.getDesp().sendKeys(description);
	
	op.getSavebtn().click();
	}
}
