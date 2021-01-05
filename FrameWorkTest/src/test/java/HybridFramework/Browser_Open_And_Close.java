package HybridFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Browser_Open_And_Close {
	
	   protected WebDriver driver;
	   
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	@AfterTest
	public void closeBrowser()throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
