package PageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	@FindBy(id = "txtUsername")
	private WebElement TypeUserName;
	
	@FindBy(id = "txtPassword")
	private WebElement TypePassword;
	
	@FindBy(id = "btnLogin")
	private WebElement LoginButtn;
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void LoginMethod(String Username, String Password)throws Exception
	{
		TypeUserName.sendKeys(Username);
		Thread.sleep(2000);
		
		TypePassword.sendKeys(Password);
		Thread.sleep(2000);
		
		LoginButtn.click();
	}
	
}
