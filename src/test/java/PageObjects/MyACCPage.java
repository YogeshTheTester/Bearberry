package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyACCPage extends BasePage {

	public MyACCPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//h2[contains(text(),'My Account')]")
	WebElement myaccHeading;
	
	@FindBy(xpath="//body/section[1]/div[2]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[12]/a[1]")
	WebElement logoutlcick;
	
	public Boolean isMyACCPageExists() 
	{
	try {
		return(myaccHeading.isDisplayed());
	    } 
	catch (Exception e) {
		// TODO: handle excep
		return(false);
	                    }	
	}
	
	public void clicklogoutlnk() {
		logoutlcick.click(); 
		
	}	
	
}
