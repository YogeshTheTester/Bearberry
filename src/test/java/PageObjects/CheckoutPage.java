package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage  extends BasePage {
	 	
	public CheckoutPage (WebDriver dr) {
		super(dr);		
			}
	
	// For Bill address data
	@FindBy(xpath = "//header/div[1]/div[1]/div[5]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]")
	WebElement CheckoutAtItem;
	
	@FindBy(xpath = "//body/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/label[1]/input[1]")
	WebElement BilLNewAdd;	
	
	@FindBy(xpath = "//input[@id='input-payment-firstname']")
	WebElement FirstName1;	
	
	@FindBy(xpath = "//input[@id='input-payment-lastname']")
	WebElement LastName1;
	
	@FindBy(xpath = "//input[@id='input-payment-company']")
	WebElement BCompany1;

	@FindBy(xpath = "//input[@id='input-payment-address-1']")
	WebElement BAdd1;		
	
	@FindBy(xpath = "//input[@id='input-payment-address-2']")
	WebElement BAdd2;
	
		@FindBy(xpath = "//input[@id='input-payment-city']")
	WebElement BCity1;	
		
	@FindBy(xpath = "//input[@id='input-payment-postcode']")
	WebElement BPostCode;	
	
	@FindBy(xpath = "//input[@id='button-payment-address']")
	WebElement BContinueBtn;
	
	
public void checkingout1() 
	{
		CheckoutAtItem.click();
	}	
public void BiilAdd() 
	{
		BilLNewAdd.click();
	}
public void BillFirstName()
	{
		FirstName1.sendKeys("a");
	}		
public void BillLastName() 
    {
	LastName1.sendKeys("b");
	}	
public void BillComapnyName() 
    {
	BCompany1.sendKeys("gento");
    }	
public void BillAddress1() 
    {
	BAdd1.sendKeys( "Realm");
    }
public void BillAddress2() 
     {
	BAdd2.sendKeys("Realm2");
     }
public void BillCityname() 
     {
	BCity1.sendKeys("Hell");
     }
public void BillPostCode() 
     {
	BPostCode.sendKeys("94043");
     }
public void BillContinue()
{
	BContinueBtn.click();
}

            // For Delivery Details



@FindBy(xpath = "//input[@id='input-shipping-firstname']")
WebElement FirstName2;

@FindBy(xpath = "//input[@id='input-shipping-lastname'and @class=\"form-control\"]")
WebElement LastName2;

@FindBy(xpath = "//input[@id='input-shipping-company']")
WebElement Dcompany;

@FindBy(xpath = "//input[@id='input-shipping-address-1']")
WebElement DAdd1;

@FindBy(xpath = "//input[@id='input-shipping-address-2']")
WebElement DAdd2;

@FindBy(xpath = "//input[@id='input-shipping-city']")
WebElement DCity;

@FindBy(xpath = "//input[@id='input-shipping-postcode']")
WebElement DPostCode;

@FindBy(xpath = "//input[@id='button-shipping-address']")
WebElement DContBtn;

@FindBy(xpath = "//input[@id='button-shipping-method']")
WebElement DmethoContinue;

//@FindBy(xpath = "//input[@value=\"cod\"]")
//WebElement Pay;

@FindBy(xpath = "//input[@type=\"checkbox\"]")
WebElement TC;

@FindBy(xpath = "//input[@id='button-payment-method']")
WebElement PayBtn;

@FindBy(xpath = "//input[@id='button-confirm' and @value=\"Confirm Order\"]")
WebElement ConfirmPay;

@FindBy(xpath = "//h1[contains(text(),'Your order has been placed!')]")
WebElement Orderplace;

public void DFirstName()
{
	FirstName2.sendKeys("Bablu");
}
public void DLastName()
{
	LastName2.sendKeys("Rajwade");
}
public void DCompanyName()
{
	Dcompany.sendKeys("ABC");
}
public void DAdderess1()
{
	DAdd1.sendKeys("Alphabet\r\n"+ "1600 Amphitheatre Parkway\r\n "+ "Mountain View, CA 94043");
}
public void DAdderess2()
{
	DAdd2.sendKeys("Chief Financial Officer\r\n"+ "1600 Amphitheatre Pkwy\r\n"+ "Mountain View, CA 94043\r\n"+ "(650) 253-0000");
}
public void DCityName()
{
	DCity.sendKeys("Mountain View");
}
//public void Dpost()
//{
//	DPostCode.sendKeys("94043");
//}
public void DcontinuBtn() 
{
	DContBtn.click();
}
public void DeliveryMethod() 
{
	DmethoContinue.click();
}
//public void PayMethod() 
//{
//	Pay.click();
//}
public void TCond() 
{
	TC.click();
}
public void Paybutton() 
{
	PayBtn.click();
}
public void MakepConfirmPayment() 
{
	ConfirmPay.click();
}

public boolean IsMyOrderPLaced()
{
	try
	{
		return(Orderplace.isDisplayed());
	} 
	catch (Exception e)
	{
		// TODO: handle exception
		return(false);
	}
}

    }















