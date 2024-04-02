package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Driver;

public class Flipkart {

	AppiumDriver<MobileElement> driver;
   @Test
	public void testTwo() throws InterruptedException {

		// languge selection
		// com.flipkart.android:id/tv_text(id)
       driver=Driver.getAppiumDriver();
		List<MobileElement> languageElements = driver.findElementsById("com.flipkart.android:id/tv_text");

		for (MobileElement element : languageElements) {

			String language = element.getText();

			if (language.equalsIgnoreCase("English")) {

				element.click();

				break;
			}
		}

		// selection
		// com.flipkart.android:id/select_btn(id)
		driver.findElementById("com.flipkart.android:id/select_btn").click();

		// close selection
		// com.google.android.gms:id/cancel

		Thread.sleep(5000);

		//driver.findElementById("com.google.android.gms:id/cancel");

		// skip login
		// com.flipkart.android:id/custom_back_icon

		driver.findElement(By.id("com.flipkart.android:id/custom_back_icon")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}
}
