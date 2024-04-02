package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestTwo {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {

		try {
			openCal();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}

	public static void openCal() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("appium:deviceName", "realme_8");
		desiredCapabilities.setCapability("appium:udid", "SCC6BYZPEUY989GI");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:platformVersion", "12.0");
		desiredCapabilities.setCapability("appium:appPackage", "com.coloros.calculator");
		desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub/");

		driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);

		System.out.println("Application Started...");
		
		
		MobileElement first_numbe=driver.findElement(By.id(mobile_element(5)));
		
		MobileElement second_number=driver.findElement(By.id(mobile_element(6)));
		
		first_numbe.click();
		
		driver.findElement(By.id("com.coloros.calculator:id/op_add")).click();
		
		
		second_number.click();
		
		driver.findElement(By.id("com.coloros.calculator:id/eq")).click();
		
		String result=driver.findElement(By.id("com.coloros.calculator:id/result")).getText();
		
		System.out.println("Result is -> "+result);
	}
	
	public static String mobile_element(int number) {
		
		String id="com.coloros.calculator:id/digit_";
		
		return id+number;
	}
}
