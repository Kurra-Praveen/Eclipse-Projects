package reusable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class WebUtils extends BaseClass {

	public static AppiumDriver<MobileElement> driver;

	public WebDriverWait wait;
	
	public static ExtentTest test;

	public WebUtils(AppiumDriver<MobileElement> driver, ExtentTest test) {

		WebUtils.driver = driver;
		
		WebUtils.test=test;

		wait = new WebDriverWait(WebUtils.driver, 120);
	}

	public MobileElement getMobileElement(String path) {

		int i = path.indexOf('#');

		String elementPath = path.substring(i + 1);

		String locator = path.substring(0, i);

		switch (locator) {

		case "xpath":

			try {
				return driver.findElementByXPath(elementPath);

			} catch (Exception e) {

				e.printStackTrace();
			}

		case "cssSelector":

			try {
				return driver.findElementByCssSelector(elementPath);

			} catch (WebDriverException e) {

				e.printStackTrace();
			}

		case "id":

			try {
				return driver.findElementById(elementPath);
			} catch (Exception e) {

				e.printStackTrace();
			}

		case "UIAutomator":

			try {
				return driver.findElement(MobileBy.AndroidUIAutomator(elementPath));
			} catch (Exception e) {

				e.printStackTrace();
			}

		case "accesbilityId":

			try {
				return driver.findElementByAccessibilityId(elementPath);

			} catch (Exception e) {

				e.printStackTrace();
			}

		default:
			return null;
		}
	}

	public List<MobileElement> getAllMobileElements(String path) {

		int i = path.indexOf('#');

		String elementPath = path.substring(i + 1);

		String locator = path.substring(0, i);

		switch (locator) {

		case "xpath":

			try {

				return driver.findElementsByXPath(elementPath);

			} catch (Exception e) {

				e.printStackTrace();

				return null;

			}

		case "cssSelector":

			try {

				return driver.findElementsByCssSelector(elementPath);

			} catch (Exception e) {

				e.printStackTrace();

				return null;
			}

		case "id":

			try {
				return driver.findElementsById(elementPath);
			} catch (Exception e) {

				e.printStackTrace();

				return null;
			}

		case "UIAutomator":

			try {
				return driver.findElements(MobileBy.AndroidUIAutomator(elementPath));
			} catch (Exception e) {

				e.printStackTrace();

				return null;
			}

		case "accesbilityId":

			try {
				return driver.findElementsByAccessibilityId(elementPath);

			} catch (Exception e) {

				e.printStackTrace();

				return null;
			}

		default:

			System.out.println("Please Provide valid path");
			return null;
		}
	}

	public static String getCurrentDateTimeFormat() {

		DateFormat cusFormat = new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");

		Date date = new Date();

		return cusFormat.format(date);
	}


	public void clickButton(String path , Status status, String text) {

		MobileElement element = getMobileElement(path);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));

		element.click();
		
		test.log(status, text);
	}

	public void enterText(String path, String text,Status status) {

		MobileElement element = getMobileElement(path);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));

		element.sendKeys(text);
		
		test.log(status,"entered the "+text);

	}

	public String getText(String path) {

		MobileElement element;

		element = getMobileElement(path);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));

		String text= element.getText();
		
		test.log(Status.INFO,text);
		
		return text;
	}


}
