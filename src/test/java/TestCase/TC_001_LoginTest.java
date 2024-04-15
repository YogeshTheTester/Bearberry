package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyACCPage;
import TestBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {
	
           @Test(groups= {"sanity","master "})
	     public void Verify_login() {
        	   logger.info("Staring of login Test ");
        	   logger.debug("Capturing application debug logs");
        	   
    try 
        {  
    	     // Homepage 
         	 HomePage hp= new HomePage(dr);
	    	 logger.info("CLick action on login link ");
	    	 hp.LoginLink();   // homepage login link 
	    	 
	    	 // FOR LOgin page 
	    	 LoginPage lp=new LoginPage(dr);
	    	logger.info("Enterig the valid data to login ");
	    	 lp.setEmail(p.getProperty("Email"));            //p is properties file in file reader 
	    	 lp.setPassword(p.getProperty("Pawd"));
	    	 
	    	 
	    	 lp.clickloginbtn();  // after filling whole data click action on login button 
	    	 
             

	    	 MyACCPage Mp= new MyACCPage(dr);
	         boolean targetpage = Mp.isMyACCPageExists();
	         if (targetpage==true) 
	         {
				logger.info("Login Test Passed ");
			     Assert.assertTrue(true);
			 }
	         else 
	         {
				logger.error("Login Test failed");
				Assert.fail();
			 }
	        
        }
        	   catch (Exception e) 
        	   {
        		   Assert.fail();
			    }
	    	 logger.info("***Login test finished ***");
	    	 
	     }
	
}
