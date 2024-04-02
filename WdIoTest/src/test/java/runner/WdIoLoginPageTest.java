package runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObject.WdIoLoginPage;
import reusable.BaseClass;
import reusable.ProjectUtilities;
import reusable.WebUtils;


public class WdIoLoginPageTest extends BaseClass {

	@Test
	public void login() {

		test=extentReport.createTest("Login test");
		
		webUtils=new WebUtils(driver,test);

		webUtils.clickButton(WdIoLoginPage.loginButton,Status.INFO,"Clicks on loginButton");

		webUtils.enterText(WdIoLoginPage.userNameFeild, config.getData("username"),Status.INFO);

		String password=config.getData("password");

		webUtils.enterText(WdIoLoginPage.passwordFeild, ProjectUtilities.getDecryptedValue(password),Status.INFO);

		webUtils.clickButton(WdIoLoginPage.submitLoginButton,Status.INFO,"Clicks on submit button");

		String result=webUtils.getText(WdIoLoginPage.status);

		if (result.equalsIgnoreCase("Success")) {

			Assert.assertTrue(true);

			test.log(Status.INFO,"assertion passed");

		} else {

			Assert.assertTrue(false);

			test.log(Status.INFO,"assertion failed");
		}

		webUtils.clickButton(WdIoLoginPage.closeStatusWindow,Status.INFO,"close the status window");

	}



}
