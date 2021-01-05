package PageObjectModel_POM;

import org.apache.tools.ant.types.resources.LogOutputResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "PIM")
	private WebElement pimclicking;
	
	@FindBy(linkText = "Add Employee")
	private WebElement AddingNewEmployee;
	
	@FindBy(id = "firstName")
	private WebElement FirstName;
	
	@FindBy(id = "lastName")
	private WebElement LastName;
	
	@FindBy(id = "btnSave")
	private WebElement SaveButton;
	
	@FindBy(id = "welcome")
	private WebElement welcomeButton;
	
	@FindBy(linkText = "Logout")
	private WebElement LogoutButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void creatingNewEmployee(String FirstNAME, String LastNAME)throws Exception
	{
		pimclicking.click();
		Thread.sleep(1000);
		
		AddingNewEmployee.click();
		Thread.sleep(1000);
		
		FirstName.sendKeys(FirstNAME);
		
		LastName.sendKeys(LastNAME);
		Thread.sleep(2000);
		SaveButton.click();
		
		welcomeButton.click();
		Thread.sleep(2000);
		
		LogoutButton.click();
	}

}
