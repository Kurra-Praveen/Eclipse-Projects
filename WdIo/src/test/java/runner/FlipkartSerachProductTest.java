package runner;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


import io.appium.java_client.MobileElement;
import pageObject.FlipKartHomePage;
import reusable.BaseClass;
import reusable.ScreenShots;

public class FlipkartSerachProductTest extends BaseClass {

	@Test
	public void SearchMobilesTest() throws Exception {

		ExtentTest test = extentReport.createTest("SearchMobilesTest");

		skipSign();

		test.log(Status.INFO, " Skips flipkart login process");
		
		webUtils.getElementByAndroidUiAuto(FlipKartHomePage.Search_input).click();

		test.log(Status.INFO, "clicks on search icon ");

		webUtils.getElementByXpath(FlipKartHomePage.search_text).sendKeys("Mobiles");

		test.log(Status.INFO, "enters text on search  box ");

		webUtils.getElementByXpath(FlipKartHomePage.FirstSearchSuggestion_link).click();

		test.log(Status.INFO, " clicks first suggestion");

		webUtils.getElementById(FlipKartHomePage.Location_btn).click();

		test.log(Status.INFO, " revoke the location access");

		MobileElement firstSearchProduct = webUtils.getElementByXpath(FlipKartHomePage.FirstSearchProduct_link);

		String searchresult = firstSearchProduct.getText();

		test.log(Status.INFO, searchresult);

		firstSearchProduct.click();

		test.log(Status.INFO, " clicks on first  product");

		webUtils.getElementByAndroidUiAuto(FlipKartHomePage.AddToCart_btn).click();

		test.log(Status.INFO, " clicks on add to cart");

		webUtils.getElementByAndroidUiAuto(FlipKartHomePage.GoToCart_btn).click();

		test.log(Status.INFO, " navigate to cart page");
		
		test.log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShots.captureScreenShots(driver)).build());

	}
}
