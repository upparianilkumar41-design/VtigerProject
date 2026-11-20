package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.Vtiger.GenericLibrary.BaseClass;

public class OrganizationPage  {

	//decleration
@FindBy(xpath = "//img[@title='Create Organization...']")
private WebElement plusicon;

@FindBy(name = "accountname")
private WebElement Orgname;

@FindBy(xpath = "//td[text()='Email ']/following-sibling::td/child::input")
private WebElement emailaddress;

@FindBy(name = "rating")
private WebElement ratingaddress;

@FindBy(name = "industry")
private WebElement industrydrop;

@FindBy(name = "accounttype")
private WebElement typedrop;

@FindBy(name = "bill_street")
private WebElement billingaddresss;

@FindBy(name = "ship_street")
private WebElement shippingaddress;

@FindBy(id = "bill_city")
private WebElement billingcity;

@FindBy(id = "ship_city")
private WebElement shippigcity;

@FindBy(id = "bill_state")
private WebElement billingstate;

@FindBy(id = "ship_city")
private WebElement shippigstate;

@FindBy(id = "bill_country")
private WebElement billingcountry;

@FindBy(id = "ship_country")
private WebElement shippigcountry;

@FindBy(name = "description")
private WebElement desp;

@FindBy(name = "button")
private WebElement savebtn;

@FindBy(name = "button")
private WebElement cancelbtn;


//initialization
public OrganizationPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//utilization
public WebElement getPlusicon() {
	return plusicon;
}

public WebElement getOrgname() {
	return Orgname;
}

public WebElement getEmailaddress() {
	return emailaddress;
}

public WebElement getRatingaddress() {
	return ratingaddress;
}

public WebElement getIndustrydrop() {
	return industrydrop;
}

public WebElement getTypedrop() {
	return typedrop;
}

public WebElement getBillingaddresss() {
	return billingaddresss;
}

public WebElement getShippingaddress() {
	return shippingaddress;
}

public WebElement getBillingcity() {
	return billingcity;
}

public WebElement getShippigcity() {
	return shippigcity;
}

public WebElement getBillingstate() {
	return billingstate;
}

public WebElement getShippigstate() {
	return shippigstate;
}

public WebElement getBillingcountry() {
	return billingcountry;
}

public WebElement getShippigcountry() {
	return shippigcountry;
}

public WebElement getDesp() {
	return desp;
}

public WebElement getSavebtn() {
	return savebtn;
}

public WebElement getCancelbtn() {
	return cancelbtn;
}
}





