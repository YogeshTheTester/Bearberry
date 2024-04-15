package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage
       {

	WebDriver dr;
	
	public HomePage(WebDriver dr)
	{
		super(dr);
	}
	
@FindBy(xpath="//header/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]") 
WebElement Linklogin;

public void LoginLink()
{
	Linklogin.click();
}


       }





