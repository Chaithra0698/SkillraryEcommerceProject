package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage 
{
	//DECLARATION
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	
		
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	
	
	//INITIALIZATION
		public TestingPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	//UTILIZATION

		public WebElement getSeleniumtraining() {
			return seleniumtraining;
		}

        public WebElement getCarttab() {
			return carttab;
		}

       public void facebookicon()
       {
    	   facebook.click();
       }

	
}
