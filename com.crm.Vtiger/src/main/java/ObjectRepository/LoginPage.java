package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //decleration
	@FindBy(name = "user_name")
	private WebElement usertbx;
	
	@FindBy(name = "user_password")
	private WebElement pwtbx;
	
	@FindBy(id = "submitButton")
	private WebElement lgbtn;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getUsertbx() {
		return usertbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	//bussion logic
	public void loginToVtiger(WebDriver driver,String un,String pw) {
		LoginPage lp = new LoginPage(driver);
		lp.getUsertbx().sendKeys(un);
		lp.getPwtbx().sendKeys(pw);
		lp.getLgbtn().click();
	}
}
