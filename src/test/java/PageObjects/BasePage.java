package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
			static WebDriver dr;
		
		public BasePage(WebDriver dr)
		{
			BasePage.dr=dr;
			PageFactory.initElements(dr,this);
		}
	}


