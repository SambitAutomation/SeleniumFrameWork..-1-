package HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(linkText = "PIM")
	private WebElement pimLinkClick;
	
	@FindBy(linkText = "Add Employee")
	private WebElement addingNewEmployee;
	
	@FindBy(id = "firstName")
	private WebElement FirstName;
	
	@FindBy(id = "lastName")
	private WebElement LastName;
	
	@FindBy(id = "btnSave")
	private WebElement SaveButton;
	
	@FindBy(id = "welcome")
	private WebElement WelcomeLink;
	
	@FindBy(linkText = "Logout")
	private WebElement LoggingOut;
	
	public HomePage(WebDriver driver2)
	{
		PageFactory.initElements(driver2,this);
	}
	
	public void addingNewEmployeeMethod(String firstname, String lastname)throws Exception
	{
	        pimLinkClick.click();
	        
	        addingNewEmployee.click();
    
		FirstName.sendKeys(firstname);
		Thread.sleep(2000);
		
		LastName.sendKeys(lastname);
		Thread.sleep(2000);
		
		SaveButton.click();
		
		WelcomeLink.click();
		
		Thread.sleep(2000);
		
		LoggingOut.click();
}
}