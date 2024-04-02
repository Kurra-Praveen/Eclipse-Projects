package utility;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Driver {

	public static AppiumDriver<MobileElement> driver;
	
	public static AppiumDriver<MobileElement> getAppiumDriver() {
		

		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapbilitiesEx.DEVICE_NAME, "realme_8");

			cap.setCapability(MobileCapbilitiesEx.UDID, "SCC6BYZPEUY989GI");
			
			cap.setCapability(MobileCapbilitiesEx.PLATFORM_NAME, "Android");
			
			cap.setCapability(MobileCapbilitiesEx.PLATFORM_VERSION, "12.0");

			cap.setCapability(MobileCapbilitiesEx.APP_PACKAGE, "com.wdiodemoapp");
			
			cap.setCapability(MobileCapbilitiesEx.APP_ACTIVITY, "com.wdiodemoapp.SplashActivity");
			
			cap.setCapability(MobileCapbilitiesEx.NEW_COMMAND_TIMEOUT, 120);
			

			URL url = new URL(MobileCapbilitiesEx.SERVER);

			driver = new AppiumDriver<MobileElement>(url, cap);
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			System.out.println("Application Started...");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);
		}
		return driver;
	}
}
