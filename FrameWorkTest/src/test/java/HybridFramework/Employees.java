package HybridFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employees extends Browser_Open_And_Close{
	
	@Test(dataProvider = "getData" )
	public void accessingData(String userNAme, String pwd, String firstNAME, String LASTNAME) throws Exception
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginMethod(userNAme, pwd);

		
		HomePage homepage=new HomePage(driver);
		homepage.addingNewEmployeeMethod(firstNAME, LASTNAME);
		
		
	}
	
	@DataProvider(name = "getData")
	public String[][] providingData()throws Exception
	{
		
		ExcelHelper helper=new ExcelHelper();
	String[][] data=	helper.gettingData("E:\\emp.xlsx","Sheet1");
	
	return data;
	}
	
	
	
	
	
	

}
