package demo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Driver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		AppiumDriver<MobileElement> driver=Driver.getAppiumDriver();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
