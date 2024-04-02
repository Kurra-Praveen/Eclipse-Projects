package demo;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Driver;

public class TestIngDrag {

	
	@Test
	public void dragNdrop() {
		
		AppiumDriver<MobileElement>driver=Driver.getAppiumDriver();
		
		driver.findElementByAccessibilityId("Drag").click();
		
		int size=driver.findElementsByAccessibilityId("drag-l2").size();
		
		System.out.println(size);
	}
}
