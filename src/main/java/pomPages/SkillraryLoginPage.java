package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SkillraryLoginPage 
{
  //Declaration
	
	//address of gear webelement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//adress od skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(name="q")
	private WebElement searchtb;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;

	//INITIALIZATION
			public SkillraryLoginPage (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//UTILIZATION
     public void gearsbutton()
     {
    	 gearsbtn.click();
     }
     
     public void skillrarydemoapplication()
     {
    	 skillrarydemoapp.click();
     }
     
     public void searchTextbox(String name)
     {
    	 searchtb.sendKeys(name);
     }
     
     public void gobutton()
     {
    	 searchbtn.click();
     }
     
     
     
}
