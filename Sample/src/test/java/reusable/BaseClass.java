package reusable;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.AmazonProductsPage;
import utilities.Browser;
import utilities.ConfigData;
import utilities.ExcelData;
import utilities.GetExtentReports;
import utilities.ScreenShots;

public class BaseClass {
	public static WebDriver driver;
	public static AmazonProductsPage products;
	public static GetExtentReports exreport;
	public static ExtentTest test;
	public static ExtentReports reports;
	public static ExcelData excel;
	public static ConfigData cfg;

	@BeforeSuite
	public void start() {

		cfg = new ConfigData();

		exreport = new GetExtentReports();

		reports = exreport.reports;

		excel = new ExcelData();

	}

	@BeforeClass
	public void initialize() {

		driver = Browser.getDriver(driver, cfg.getStringData("Browser"));

		products = new AmazonProductsPage();
	}

	@AfterMethod
	public void status(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {

			test.pass("Passes").addScreenCaptureFromPath(ScreenShots.getScreenShot(driver));

		} else if (result.getStatus() == ITestResult.FAILURE) {

			test.fail("Test case Failed").addScreenCaptureFromPath(ScreenShots.getScreenShot(driver));
		}
		
		

	}
	


	@AfterSuite
	public void endTest() {
		
		exreport.addSystemConfiguration(driver);		
		
		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.quit();
		
		reports.flush();
	}
}
