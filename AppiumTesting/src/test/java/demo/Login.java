package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import io.appium.java_client.touch.offset.PointOption;
import utility.AppiumServer;
import utility.Driver;
import utility.HtmlReports;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		
		
		HtmlReports report=new HtmlReports();
		
	   ExtentTest test=report.createTest("Test One");
	   test.info("clicked");
	   
	   ExtentTest testTwo=report.createTest("Test two");
	   testTwo.info("anbd");
	   
	   ExtentTest testThree=report.createTest("Test Three");
	  testThree.info("d j");
	   
	   ExtentTest testfour=report.createTest("Test four");
	   testfour.info("kx s");
	   
	   report.createReport();
	   
	   
		
		
		
		
		
		
		
		
		
  //  AppiumServer server=new AppiumServer();
		
	//	AppiumDriver<MobileElement> driver= Driver.getAppiumDriver();
//		
//		MobileElement login=driver.findElementByAccessibilityId("Webview");
//		
//		login.click();
//		
//		String text="Committed Community";
//		
//		String s="new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(text(\""+text+"\").instance(0))";
		
	
	////	server.closeServer();
		
//		Thread.sleep(5000);
//		
//		
//		driver.findElement(MobileBy.AndroidUIAutomator(s));
		
		
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + text + "\")"));
		


	}
}
