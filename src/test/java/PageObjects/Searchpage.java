package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends BasePage {

	
	public Searchpage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='filter_name']")
	WebElement SearchBar;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[4]/div[1]/button[1]/i[1]")
	WebElement searchclcick;
	
	
	
	
	public void searchdata() 
	{
		SearchBar.sendKeys("t-shirt");
	}
	public void search() 
	{
		searchclcick.click();
	}
}
