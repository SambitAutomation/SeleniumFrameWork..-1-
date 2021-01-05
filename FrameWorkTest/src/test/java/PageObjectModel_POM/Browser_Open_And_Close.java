package PageObjectModel_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Browser_Open_And_Close {
  
	protected WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser()throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
