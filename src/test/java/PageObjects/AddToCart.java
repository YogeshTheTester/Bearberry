package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {

	public AddToCart(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//body/section[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	WebElement productname;			
	
	@FindBy(xpath = "//select[@id='input-option469']")
    WebElement please_select;
	
	@FindBy(xpath = "//*[@id=\"input-option469\"]/option[2]")
	WebElement targetele;
		
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement addtocart;	
	
	@FindBy(xpath = "//span[@id='cart-total']")
	WebElement item;
   
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	WebElement EmptyCart;
	
	@FindBy(xpath = "//body/section[1]/div[2]/div[1]/div[1]")
	WebElement MsgAddingCart;
	
	public void nameofproduct() 
	{
		productname.click();
	}
	
	public void selectProduct() 
	{
		please_select.click();
	}
	public void selectsize() 
	{
		targetele.click();
	}	
	
	public void addingcart() 
	{
		addtocart.click();
	}
	
	public void viewitemlist() 
	{
		item.click();
	}
	
	public boolean isViewCartEmpty() 
	{
		try 
		{
			return(EmptyCart.isDisplayed());
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			return (false);
		}	
  }
	public boolean MsgFOrAddingCart() 
	{
		try 
		{
			return(MsgAddingCart.isDisplayed());
		}
		catch (Exception e) {
			// TODO: handle exception
			return (false);
		}
}
}
