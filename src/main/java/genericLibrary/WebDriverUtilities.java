package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//1.Handling droprdown
	
 public void dropDown(WebElement driver , String text)
	{
		Select s = new Select(driver);
		s.selectByVisibleText(text);
	}
   
 //2.Handling mouse over
  
 public void mouseHover(WebDriver driver , WebElement ele)
 {
	 Actions a = new Actions(driver);
	 a.moveToElement(ele).perform();
 }
 
 //3.Handling double click
 
 public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
 
 //4.Handling Rightclick
 
 public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
 
 //5.Handling drag and drop
 
 public void dragdrop(WebDriver driver, WebElement src,WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src,target).perform();
	}
 //6.Shifting controlto frame
 
 public void switchFrame(WebDriver driver,String value) 
 {
	 driver.switchTo().frame(value);
 }
 
 //7.shifting control to normal web page
 public void switchbackFrame(WebDriver driver) 
 {
	 driver.switchTo().defaultContent();
 }
 
 //8.shifting control to popup
 
 public void alterPop(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
 
 //9.shifting control to child window
 public void childWindow(WebDriver driver)
	{
		Set<String> child =driver.getWindowHandles();	
		for(String b :child)
		{
			driver.switchTo().window(b);
		}
		}
 
 //10.handling scrollbar
 public void Scrollar(WebDriver driver,int x , int y)
 {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("windows.scrollBy("+x+","+y+")");
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
}
