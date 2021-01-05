package DataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FrameworkStart {

protected WebDriver driver=null;
	
	@BeforeTest
	public void OpenBrowser()
	{
	
	     driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}
	
	@AfterTest
	public void CloseBrowser()throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
