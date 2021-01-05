package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employees extends FrameworkStart
{

	@Test(dataProvider = "GetData")
	public void empData(String Username, String Password)
	{
		
		try
		{
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys(Username);
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		 
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys(Password);
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
		
		action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("(//img[@alt=''])[1]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@DataProvider(name = "GetData")
	public String[][] getuserdata()throws Exception
	{
		ExcelHelper HelperData=new ExcelHelper();
		String[][] data=HelperData.getDataFromSheet("E:\\emp.xlsx","Sheet1");
	   
		return data;
	}
	
}
