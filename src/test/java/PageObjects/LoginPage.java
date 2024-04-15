package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailfield;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Passowrdfiled;
	
	@FindBy(xpath="//body/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[1]")
	WebElement LoginButtonFiled;
	
	
	
	public void setEmail(String email)
	{
		emailfield.sendKeys(email);
	}
	
	public void setPassword (String password )
	{
		Passowrdfiled.sendKeys(password);
	}
	
	public void clickloginbtn()
	{
		LoginButtonFiled.click();
	}
	
	
	
}
