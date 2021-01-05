package PageObjectModel_POM;

import org.testng.annotations.Test;

public class Employee extends  Browser_Open_And_Close
{
     @Test(invocationCount = 2)
     public void newEMPdata()throws Exception
     {
    	 driver.get("https://opensource-demo.orangehrmlive.com/");
    	 
    	 Login_Page logOne=new Login_Page(driver);
    	 logOne.LoginMethod("admin","admin123");
    	 
    	 HomePage Homedata=new HomePage(driver);
    	 Homedata.creatingNewEmployee("ala", "blb");
    	 
     }
	 
	
	
}
