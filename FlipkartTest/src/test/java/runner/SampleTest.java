package runner;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pageObject.SamplePage;
import reusable.BaseClass;


public class SampleTest extends BaseClass {
	
	@Test
	public void SearchMobilesTest() throws Exception {
		
		ExtentTest test = extentReport.createTest("SearchMobilesTest");
		
		skipSign();
		
		test.log(Status.INFO, " Skips flipkart login process");

		webUtils.clickButton(SamplePage.Search_input);
		
		test.log(Status.INFO, "clicks on search icon ");

		webUtils.enterText(SamplePage.search_text, "Mobiles");
		
		test.log(Status.INFO, "enters text on search  box ");

		webUtils.clickButton(SamplePage.FirstSearchSuggestion_link);

		test.log(Status.INFO, " clicks first suggestion");
		
		webUtils.clickButton(SamplePage.Location_btn);
		
		test.log(Status.INFO, " revoke the location access");

		String searchresult = webUtils.getText(SamplePage.FirstSearchProduct_link);

		System.out.println(searchresult);
		
		test.log(Status.INFO, searchresult);

		webUtils.clickButton(SamplePage.FirstSearchProduct_link);
		
		test.log(Status.INFO, " clicks on first  product");

		webUtils.clickButton(SamplePage.AddToCart_btn);
		
		test.log(Status.INFO, " clicks on add to cart");

		webUtils.clickButton(SamplePage.GoToCart_btn);
		
		test.log(Status.INFO, " navigate to cart page");
	
		
	}
}
