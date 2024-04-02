package utility;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import reusable.ProjectUtilities;


public class Driver {

	public static AppiumDriver<MobileElement> driver;

	public static AppiumDriver<MobileElement> getAppiumDriver() {



		try {
			DesiredCapabilities cap = new DesiredCapabilities();

			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "realme_8");

			cap.setCapability(MobileCapabilityType.UDID, "SCC6BYZPEUY989GI");

			cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");

			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");

			//cap.setCapability(MobileCapabilityType.APP, "./src/test/resources/Android-NativeDemoApp-0.4.0.apk");

			cap.setCapability(ProjectUtilities.APP_PACKAGE, "com.wdiodemoapp");

			cap.setCapability(ProjectUtilities.APP_ACTIVITY, "com.wdiodemoapp.SplashActivity");

			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);


			URL url = new URL(ProjectUtilities.SERVER);

			driver = new AppiumDriver<>(url, cap);

			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

			System.out.println("Application Started...");

		} catch (Exception e) {

		}
		return driver;
	}
}
