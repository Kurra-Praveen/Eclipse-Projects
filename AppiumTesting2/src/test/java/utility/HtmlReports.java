package utility;

import java.io.File;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import bsh.Capabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HtmlReports {
	
	public ExtentReports extentReports;
	ExtentSparkReporter spark;
	
	public HtmlReports() {
		
		File fis=new File("./ExtentReports/sample.html");
		
		extentReports=new ExtentReports();
		
		spark=new ExtentSparkReporter(fis);
		
		spark.config().setDocumentTitle("Appium testing");
		
		extentReports.attachReporter(spark);
	}
	
	public ExtentTest createTest(String testCaseName) {
		
		return extentReports.createTest(testCaseName);
	}
	
  public void createReport() {
	  
	  extentReports.flush();
  }
 
}
