package reusable;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.ConfigData;
import utility.Driver;
import utility.HtmlReports;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;
	public static WebUtils webUtils;
	public static ConfigData config;
	public static HtmlReports extentReport;
	
	public static ExtentTest test;

	@BeforeSuite
	public void setUp() {

		config = new ConfigData();

		extentReport = new HtmlReports();

	
	}

	@BeforeClass
	public void initizeDriver() {

		driver = Driver.getAppiumDriver();
		
	}
	
//	@BeforeMethod
//	public void activateMethods() {
//		
//		webUtils=new WebUtils(driver,test);
//	}
//	

	@AfterMethod
	public void closeSession(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ProjectUtilities.captureScreenShots(driver)).build());

		} else if (result.getStatus() == ITestResult.FAILURE) {

			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ProjectUtilities.captureScreenShots(driver)).build());

		} else if (result.getStatus() == ITestResult.SKIP) {

			test.skip( MediaEntityBuilder.createScreenCaptureFromPath(ProjectUtilities.captureScreenShots(driver)).build());
		}


	}

	@AfterClass
	public void quitDriver() {

		driver.quit();
	}


	@AfterSuite
	public void tearDown() {

		extentReport.createReport();
	}




}
