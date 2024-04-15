package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.AddToCart;
import PageObjects.CheckoutPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.Searchpage;
import TestBase.BaseClass;

public class TC_005CheckOutTestCase  extends BaseClass {
	
     @Test(groups= {"sanity","master "})   
	@SuppressWarnings({ "deprecation", "unused"})
	public void Verify_Checkout() 	
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
 	  
 	     dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
 	     logger.info("Click action on please select size  ");
 	     Ad.selectProduct();
 	  
 	 dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
 	 logger.info("Click action on selected size");
	 Ad.selectsize();
	 
	 dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS); 	  
 	 logger.info("Adding product to the cart");
	 Ad.addingcart();
	  
	
	  dr.navigate().refresh();
	  logger.info("Checking item list of added product ");
	  Ad.viewitemlist();
	  
	  dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
      CheckoutPage Cp=new CheckoutPage(dr);
    
       	logger.info("Click action at checkout of view items");
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	Cp.checkingout1();  
       	
        logger.info("CLcik on Bill new address ");
          	Cp.BiilAdd();
      logger.info("Entering the First Name for Bill Details ");
       	Cp.BillFirstName();  
    	logger.info("Entering the last name for Bill details");
       	Cp.BillLastName();
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
    	logger.info("Entering the Comapny name for Bill details");
       	Cp.BillComapnyName();       	
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
   
       	
    	logger.info("Entering the Address 1 for Bill details");
       	Cp.BillAddress1();
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
    	logger.info("Entering the Address 2 for Bill details");
       	Cp.BillAddress2();
    	logger.info("Entering the City name for Bill details");
       	Cp.BillCityname();       	
    	logger.info("Entering the Post code for Bill details");
       	Cp.BillPostCode();
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	
       	
       logger.info("Click on the Country for Bill details");
       WebElement CountryName =dr.findElement(By.xpath("//select[@id='input-payment-country']"));
   	   Select dropdown =new Select(CountryName);
       logger.info("Entering the Country name for Bill details");
   	   dropdown.selectByValue("81");
   	   
   	   
    	logger.info("Click on  the Region Bill details");   	
       	WebElement RegionName=dr.findElement(By.xpath("//select[@id='input-payment-zone']"));
       	Select dropdown1=new Select(RegionName);
       	logger.info("Entering the Region name for Bill details");
       	dropdown1.selectByValue("1259");
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
    	logger.info("Click on the Continue to the Delivery Details");
       	Cp.BillContinue();
       	
       
       	WebElement DelNewAdd =dr.findElement(By.xpath("//body/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[3]/label[1]/input[1]"));
       	JavascriptExecutor js = (JavascriptExecutor)dr;
    	js.executeScript("arguments[0].click();",DelNewAdd);
       	

       	
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	logger.info("Entering First name for delivery");
       	Cp.DFirstName();
       
       
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	logger.info("Entering the last name for Delivery"); 
       	Cp.DLastName();
       	
       	//dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	logger.info("Entering the comapny name for delivery");
       	Cp.DCompanyName();    	
       	     
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
    	logger.info("Entering the Delivery addres 1");
       	Cp.DAdderess1();
       	
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	logger.info("Entering the Delivery addres 2");
       	Cp.DAdderess2();
       	
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	logger.info("Entering the Delivery City name ");
       	Cp.DCityName();
       	
//       	logger.info("Entering the delivery postal code ");
//       	Cp.Dpost();
       	
       	logger.info("Entering the country name for delivery details");
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	WebElement DCountryName =dr.findElement(By.xpath("//select[@id='input-shipping-country']"));
        Select dropdown2 =new Select(DCountryName);
        logger.info("Entering the Country name for Delivery details");
    	dropdown2.selectByValue("100");
       	  
    	   logger.info("Entering the Region name for delivery details");
    	   dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
    	   WebElement DRegioName =dr.findElement(By.xpath("//select[@id='input-shipping-zone']"));
       	   Select dropdown3 =new Select(DRegioName);
           logger.info("Entering the Region  name for Bill details");
       	   dropdown3.selectByValue("1514");   
       	
           dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	   logger.info("Click on continue button of delivery");
       	   Cp.DcontinuBtn();
         //  dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);    	   
       	   logger.info("Clicking on delivery method continue button");
       	   Cp.DeliveryMethod();
       	   
           dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);  
       	   logger.info("Clicking on Payment Cash on delivery option");
       	   WebElement COD= dr.findElement(By.xpath("//input[@value=\"cod\"]"));
       	   js.executeScript("arguments[0].click","COD");
//       	   Cp.PayMethod();       	   
       	   
       	   dr.manage().timeouts().implicitlyWait( 12,TimeUnit.SECONDS); 
       	   logger.info("Accepting teh Terms And Condition");
       	   Cp.TCond();
          	  
       	   dr.manage().timeouts().implicitlyWait( 11,TimeUnit.SECONDS);  
       	   logger.info("Clcik on continue near TC ");
       	   Cp.Paybutton();
       	  
           dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
    	   logger.info("clcik on confirm order");
       	   try 
       	   {
       		Cp.MakepConfirmPayment();
		  } 
       	   catch (Exception e) 
       	   {
			// TODO: handle exception
       		   return;
		 }   	   
       	   
       	dr.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
       	   boolean plcedorder=Cp.IsMyOrderPLaced();
       	   if (plcedorder==true) 
       	   {
			logger.info("Order placed succefully");
			Assert.assertTrue(true);
		   } 
       	   else
       	   {
             logger.info("Order not placed check what went wrong");
             Assert.fail();
		   } 
    				
	}
	
	
}
