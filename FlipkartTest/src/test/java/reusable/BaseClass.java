package reusable;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pageObject.FlipKartHomePage;
import utility.ConfigData;
import utility.Driver;
import utility.HtmlReports;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;
	public static WebUtils webUtils;
	public static ConfigData config;
	public static HtmlReports extentReport;
	//public static ExcelData excelData;

	@BeforeSuite
	public void setUp() {
		
		config = new ConfigData();
		
		extentReport = new HtmlReports();
		
		//excelData = new ExcelData("Sheet 1");
	}

	@BeforeMethod
	public void initizeDriver() {

		driver = Driver.getAppiumDriver();

		webUtils = new WebUtils(driver);
	}

	@AfterMethod
	public void closeSession(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {

		} else if (result.getStatus() == ITestResult.FAILURE) {

		} else if (result.getStatus() == ITestResult.SKIP) {

		}

		driver.quit();
	}

	@AfterSuite
	public void tearDown() {

		extentReport.createReport();
	}
	
	public void skipSign()  {
		
		List<MobileElement> languageElements =webUtils.getAllMobileElements(FlipKartHomePage.Languagelist_drpDwn);

		for (MobileElement element : languageElements) {

			String language = element.getText();

			if (language.equalsIgnoreCase("English")) {

				element.click();

				break;
			}
		}

		webUtils.getElementById(FlipKartHomePage.LanguageSelection_btn).click();

		try {
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		webUtils.getElementById(FlipKartHomePage.SkipSignIn_arw).click();


	}
}
