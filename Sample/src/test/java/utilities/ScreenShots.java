package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import reusable.GetDate;

public class ScreenShots {
	
	public static String getScreenShot(WebDriver driver) {
		
		 File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest=new File("./screenshots/"+GetDate.dateTimeFormat()+".png");
		 
		 try {
			FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
			System.out.println("Unable to take screenshot");
		}
		
		return dest.getAbsolutePath();
	}

}
