package Scripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.SkilraryDemoLoginPage;
import pomPages.AddtoCartPage;
import pomPages.TestingPage;

import pomPages.SkillraryLoginPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkilraryDemoLoginPage sd =new SkilraryDemoLoginPage(driver);
		utilities.childWindow(driver);
		utilities.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
		utilities.dragdrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
			
	}
}
