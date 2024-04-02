package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.HtmlReports;

public class TestOne {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		HtmlReports htmlReport=new HtmlReports();
		try {
			
		ExtentTest testCaseOne=	htmlReport.createTest("opening calculator");
			
			openCalulator();
			
			testCaseOne.assignAuthor("Praveen");
			testCaseOne.assignCategory("MobileTesting");
			testCaseOne.log(Status.INFO, "opening appilication");
			htmlReport.createReport();
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
	
	}

	public static void openCalulator() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "realme_8");

		cap.setCapability("udid", "SCC6BYZPEUY989GI");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.0");
		
//	   cap.setCapability("appPackage", "com.whereismytrain.android");
//		cap.setCapability("appActivity", "com.whereismytrain.view.activities.HomeActivity");
		
		   cap.setCapability("appPackage", "com.wdiodemoapp");
			cap.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

		URL url = new URL("http://0.0.0.0:4723/wd/hub/");

		driver = new AppiumDriver<MobileElement>(url, cap);

		System.out.println("Application Started...");

	}
}
