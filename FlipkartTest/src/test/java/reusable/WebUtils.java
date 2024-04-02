package reusable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class WebUtils {

	public  AppiumDriver<MobileElement> driver;

	public WebDriverWait wait;

	public WebUtils(AppiumDriver<MobileElement> driver) {

		this.driver = driver;

		wait = new WebDriverWait(driver, 120);
	}

	public MobileElement findByAccessbilityId(String id) {

		return driver.findElementByAccessibilityId(id);

	}

	public  MobileElement locatorGenerator(String path) {

		int i = path.indexOf('#');

		String elementPath = path.substring(i + 1);

		String locator = path.substring(0, i);

		switch (locator) {

		case "xpath":

			return driver.findElementByXPath(elementPath);

		case "cssSelector":

			return driver.findElementByCssSelector(elementPath);
			
		case "id":

			return driver.findElementById(elementPath);
			
		case "UIAutomator":

			return driver.findElement(MobileBy.AndroidUIAutomator(elementPath));

		default:
			return null;
		}
	}

	public MobileElement getElementById(By id) {

		return driver.findElement(id);
	}

	public List<MobileElement> getAllMobileElements(By id) {

		return driver.findElements(id);
	}

	public static String getCurrentDateTimeFormat() {

		DateFormat cusFormat = new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");

		Date date = new Date();

		return cusFormat.format(date);
	}

	public MobileElement getElementByXpath(String xpath) {

		return driver.findElementByXPath(xpath);
	}

	public void waitUntilElementDisplayed(MobileElement elemnt) {

		wait.until(ExpectedConditions.elementToBeClickable(elemnt));

	}

	public MobileElement getElementByAndroidUiAuto(String expression) {

		return driver.findElement(MobileBy.AndroidUIAutomator(expression));
	}
	
	public void clickButton(String path) {
		
		MobileElement element=locatorGenerator(path);
		
		element.click();
	}
	
	public void enterText(String path,String text) {
		

		MobileElement element=locatorGenerator(path);
		
		element.sendKeys(text);
		
	}
	
	public String getText(String path) {
		
		MobileElement element=locatorGenerator(path);
		
		return element.getText();
	}

}
