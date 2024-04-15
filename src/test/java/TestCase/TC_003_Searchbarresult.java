package TestCase;

import org.testng.annotations.Test;

import PageObjects.Searchpage;
import TestBase.BaseClass;

public class TC_003_Searchbarresult extends BaseClass 
{
   
	@Test(groups= {"sanity","master "})
    public void Verify_serarch() {
   	 
		Searchpage Sc= new Searchpage(dr);
		
		logger.info("Entering the seacrh data ");
		Sc.searchdata();
		
		logger.info("Clicking on  the seacrh data ");
		Sc.search();
		
		
		
		
   	   
	}
	
}
   	   

