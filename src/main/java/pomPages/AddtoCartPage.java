package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCartPage 
{
	//DECLARATION
	//address of add to cart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	//address of + icon
	@FindBy(id="add")
	private WebElement addbtn;
	
	
	//INITIALIZATION
	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//UTILIZATION
	
	public void AddtoCartbtn() {
		 cartbtn.click();
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
}
