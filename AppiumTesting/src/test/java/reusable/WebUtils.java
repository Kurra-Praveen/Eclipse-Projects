package reusable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class WebUtils {

	public AppiumDriver<MobileElement> driver;
	
	TouchActions  action=new TouchActions(driver);
	//TouchAction action2 = new TouchAction((AppiumDriver<MobileElement>) driver);
	

	public WebUtils(AppiumDriver<MobileElement> driver) {

		this.driver = driver;
	}

	public MobileElement findByAccessbilityId(String id) {

		return driver.findElementByAccessibilityId(id);

	}

	public MobileElement getElementById(By id) {

		return driver.findElement(id);
	}

	public List<MobileElement> getAllMobileElements(By id) {

		return driver.findElements(id);
	}
	
	public void dragAndDrop(MobileElement source,MobileElement target) {
		
		action.dragAndDrop(source, target).build().perform();
	}
	
	public static String getCurrentDateTimeFormat() {
		
		DateFormat cusFormat=new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
		
		Date date=new Date();
		
		return cusFormat.format(date);
	}
}
