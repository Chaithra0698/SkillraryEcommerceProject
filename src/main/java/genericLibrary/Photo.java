package genericLibrary;

import org.openqa.selenium.WebDriver;
import java.util.Date;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Photo 
{
	public void getPhoto(WebDriver driver,String name) throws IOException
	{
		Date d = new Date();
		String currentdate= d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(IPathConstant.photoPath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
