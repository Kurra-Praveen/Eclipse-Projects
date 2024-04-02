package runner;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import pageObject.WdIoFormPage;
import pageObject.WdIoLoginPage;
import reusable.BaseClass;

public class WdIoLoginTest extends BaseClass {

	@Test
	public void LoginTest() {

		webUtils.findByAccessbilityId(WdIoLoginPage.loginButton).click();

		webUtils.findByAccessbilityId(WdIoLoginPage.userNameFeild).sendKeys("abcde123@gmail.com");

		webUtils.findByAccessbilityId(WdIoLoginPage.passwordFeild).sendKeys("password123");

		webUtils.findByAccessbilityId(WdIoLoginPage.submitLoginButton).click();

		String result = webUtils.getElementById(WdIoLoginPage.status).getText();

		if (result.equalsIgnoreCase("Success")) {

			Assert.assertTrue(true);

		} else {

			Assert.assertTrue(false);
		}

		webUtils.getElementById(WdIoLoginPage.closeStatusWindow).click();
	}
	@Test
	public void submitForm() {

		webUtils.findByAccessbilityId(WdIoFormPage.formsPage).click();

		webUtils.findByAccessbilityId(WdIoFormPage.inputFeild).sendKeys("random-text");

		String result=webUtils.findByAccessbilityId(WdIoFormPage.inputResult).getText();
		
		System.out.println(result);

		webUtils.findByAccessbilityId(WdIoFormPage.toogleBar).click();

		webUtils.findByAccessbilityId(WdIoFormPage.toogleText).getText();

        webUtils.findByAccessbilityId(WdIoFormPage.dropDown).click();
        
         List<MobileElement>dropDownelements=  webUtils.getAllMobileElements(WdIoFormPage.dropDownItems);
         
         for(MobileElement element:dropDownelements) {  
        	 
        	 String text=element.getText();
        	 
        	 if(text.contains("Appium")) {
        		 
        		 element.click();
        		 
        		 break;
        	 }
         }
       
		webUtils.findByAccessbilityId(WdIoFormPage.activeButton).click();

		webUtils.getElementById(WdIoFormPage.message).getText();

		webUtils.getElementById(WdIoFormPage.quitMessagePopUp).click();
	}
	

}
