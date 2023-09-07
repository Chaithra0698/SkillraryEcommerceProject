package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SkilraryDemoLoginPage 
{
	//address of courses
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	//address of dropdown
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	//INITIALIZATION
		public SkilraryDemoLoginPage  (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

  //UTILIZATION
		public WebElement getCoursetab() 
		{
			return coursetab;
		}

       public void seleniumtrainingtab()
       {
    	   seleniumtraining.click();
       }


	 public WebElement getCoursedd() 
	  {
		return coursedd;
	  }


	
	 
		
		

}
