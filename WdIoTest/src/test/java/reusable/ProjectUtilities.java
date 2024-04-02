package reusable;

import java.io.File;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class ProjectUtilities implements MobileCapabilityType{


	public static String APP_PACKAGE="appPackage";
	public static String APP_ACTIVITY="appActivity";
	public static String SERVER="http://0.0.0.0:4723/wd/hub/";


	public static String getDecryptedValue(String encryptedValue) {

		byte []encryptedBytes=encryptedValue.getBytes();

		byte[]decryptedValue=  Base64.getDecoder().decode(encryptedBytes);

		return new String(decryptedValue);
	}

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
	 static interface mycapbilitieses extends MobileCapabilityType {

			String APP_PACKAGE="appPackage";
			String APP_ACTIVITY="appActivity";
			String SERVER="http://0.0.0.0:4723/wd/hub/";
		}

}
