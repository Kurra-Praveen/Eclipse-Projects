package runner;

import java.util.List;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;
import pageObject.WdIoFormPage;
import reusable.BaseClass;
import reusable.WebUtils;


public class WdIoFormPageTest extends BaseClass  {


	@Test
	public void Form() {

		test=extentReport.createTest("Login Form");
		
		webUtils=new WebUtils(driver,test);
		
		webUtils.clickButton(WdIoFormPage.formsPage ,Status.INFO,"clicks on formPage");

		webUtils.enterText(WdIoFormPage.inputFeild, "Praveen",Status.INFO);

		MobileElement inputResult=webUtils.getMobileElement(WdIoFormPage.inputResult);

		String result=inputResult.getText();

		System.out.println(result);

		webUtils.clickButton(WdIoFormPage.toogleBar,Status.INFO,"Clicked on Toogle Bar");

		String toogleResult=webUtils.getText(WdIoFormPage.toogleText);

		System.out.println(toogleResult);

		webUtils.clickButton(WdIoFormPage.dropDown,Status.INFO,"Clicked on dropdown ");


        List<MobileElement>dropDownelements=  webUtils.getAllMobileElements(WdIoFormPage.dropDownItems);

        for(MobileElement element:dropDownelements) {

       	 String text=element.getText();

       	 if(text.contains("Appium")) {

       		 element.click();

       		test.log(Status.INFO,"click on appium list");

       		 break;
       	 }
        }

		webUtils.clickButton(WdIoFormPage.activeButton,Status.INFO,"Clicked on active Button");

		String popMessage=webUtils.getText(WdIoFormPage.message);

		System.out.println(popMessage);

		webUtils.clickButton(WdIoFormPage.quitMessagePopUp,Status.INFO,"Clicks on popupmessage");



	}
}
