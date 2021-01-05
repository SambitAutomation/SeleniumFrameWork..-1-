package HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "txtUsername")
	private WebElement Username;
	
	@FindBy(id = "txtPassword")
	private WebElement Password;
	
	@FindBy(id = "btnLogin")
	private WebElement SaveButton;
	
	public LoginPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1,this);
	}
	
	public void loginMethod(String username, String password)throws Exception
	{
		Username.sendKeys(username);
		Thread.sleep(2000);
		
		Password.sendKeys(password);
		Thread.sleep(2000);
		
		SaveButton.click();
	}

}
