
package reusable;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenShots {

 public static String captureScreenShots(AppiumDriver<MobileElement> driver) {
	 
	 File src=  ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File dest=new File("./ScreenShots/"+WebUtils.getCurrentDateTimeFormat()+".png");
	 
	 try {
		 
		 FileUtils.copyFile(src, dest);
		 
	 }catch (Exception e) {
		 
		System.out.println("unable to capture screenshot");
		
		e.printStackTrace();
	}
	 return dest.getAbsolutePath();
	 
	   
 }



}
