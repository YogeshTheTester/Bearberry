package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyACCPage;
import TestBase.BaseClass;
import Utilities.DataProviders;

public class TC_DataDrivenTest_002 extends BaseClass {
      
	 @Test(dataProvider="LoginData",dataProviderClass =DataProviders.class )
	 public void verify_loginData(String email,String password,String exp)
	 {
		 logger.info("** Starting Datda drivern Test**");
		 try
		 {
		 
		 HomePage hp= new HomePage(dr);
    	 logger.info("CLick action on login link ");
    	 hp.LoginLink();   // homepage login link 
    	 
    	 // FOR LOgin page 
    	 LoginPage lp=new LoginPage(dr);
    	logger.info("Enterig the excel  data to login ");
    	 lp.setEmail(email);            //p is properties file in filereader 
    	 lp.setPassword("password");
    	 
    	 
    	 lp.clickloginbtn();  // after filling whole data clicka ction on login button 
    	 


    	 MyACCPage Mp= new MyACCPage(dr);
         boolean targetpage = Mp.isMyACCPageExists();
		 
		 if (exp.equalsIgnoreCase("valid"))
	   {
			if (targetpage==true) 
			{
				Mp.clicklogoutlnk();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
	   }
		 if (exp.equalsIgnoreCase("Invalid"))
		 {
			 if (targetpage==true)
			 {
				Mp.clicklogoutlnk();
				Assert.assertTrue(false);
			 }			
		 else 
		    {
			Assert.assertTrue(true);
		    }
		   }
		 }
		 catch (Exception e) 
		 {
			Assert.fail();// TODO: handle exception
		}
		 logger.info("**Finished data driven test**");
	 }
	
}
