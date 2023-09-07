package Scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.SkilraryDemoLoginPage;
import pomPages.AddtoCartPage;

public class TestCase1 extends BaseClass 
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.childWindow(driver);
		SkilraryDemoLoginPage sd =new SkilraryDemoLoginPage(driver);
		utilities.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddtoCartPage d = new AddtoCartPage(driver);
		utilities.doubleClick(driver, d.getAddbtn());
		d.AddtoCartbtn();
		utilities.alterPop(driver);
		
		
	}

}
