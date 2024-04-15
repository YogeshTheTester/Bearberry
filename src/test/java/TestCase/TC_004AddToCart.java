package TestCase;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AddToCart;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.Searchpage;
import TestBase.BaseClass;

public class TC_004AddToCart  extends BaseClass {	
	
	@SuppressWarnings("deprecation")
	@Test(groups= {"sanity","master "})
	public void verify_addingcart()
	{			
		// Home page 
     HomePage hp= new HomePage(dr);
   	 logger.info("CLick action on login link ");
   	 hp.LoginLink();   // home page login link 
   	 
   	 // FOR LOgin page 
     LoginPage lp=new LoginPage(dr);
   	 logger.info("Enterig the valid data to login ");
   	 lp.setEmail(p.getProperty("Email"));            //p is properties file in file reader 
   	 lp.setPassword(p.getProperty("Pawd"));
   	    	 
   	 lp.clickloginbtn();  // after filling whole data click action on login button 
		
        Searchpage Sc= new Searchpage(dr);
       
		logger.info("Entering the seacrh data ");
		Sc.searchdata();
		
		logger.info("Clicking on  the seacrh data ");
		Sc.search();  	  
	 	 
 	   AddToCart Ad=new AddToCart(dr);
 	  
 	   logger.info("Click action on product name ");
 	   Ad.nameofproduct();
 	  
 	   logger.info("Click action on please select size  ");
 	   Ad.selectProduct();
 	  
 	   logger.info("Click action on selected size");
       Ad.selectsize();

	   dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
			 
 	  	   	  
 	  logger.info("Adding product to the cart");
 	  
	  Ad.addingcart();
	  boolean Tp=Ad.MsgFOrAddingCart();
  	   if (Tp==true) 
  	   {
		logger.info("Product added to the cart succefully");
		Assert.assertTrue(true);
	   } 
  	   else
  	   {
        logger.info("Product Not added to the cart");
        Assert.fail();
	   }
	  
	  dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
	  logger.info("Checking item list of added product ");
	  Ad.viewitemlist();
	  
	   boolean target=Ad.isViewCartEmpty();
	   if (target==true)
	   {
		logger.info("View cart is empty ");
		Assert.assertTrue(true);
	   }
	   else
	   {
        logger.info("**View cart is not empty **");
        Assert.fail();
	   }
	   
	     }	

	}


