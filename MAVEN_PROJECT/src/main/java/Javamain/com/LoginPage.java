package Javamain.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="user_name")
	private WebElement usernameTb;
	
	@FindBy(name="user_password")
	private WebElement passwordTb;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	
	@FindBy(xpath="//div[contains(text(),'You must specify a valid ')]")
	private WebElement errormsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getusernameTb()
	{
		return usernameTb;
	}
	public WebElement getpasswordTb()
	{
		return passwordTb;
	}
	public WebElement getloginBtn()
	{
		return loginBtn;
	}
	public WebElement geterrormeg()
	{
		return errormsg;
	}
	public void loginToApp(String username ,String password) 
	{
		getusernameTb().sendKeys(username);
		getpasswordTb().sendKeys(password);
		getloginBtn().click();
	}
}
	
	
	
	

