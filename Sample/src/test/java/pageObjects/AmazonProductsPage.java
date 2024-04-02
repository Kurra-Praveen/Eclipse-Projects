package pageObjects;

import org.openqa.selenium.By;

import reusable.Helper;
import uiStore.AmazonProductsUi;

/**
 * @author Praveen Kurra
 *
 */
public class AmazonProductsPage extends AmazonProductsUi{
	
	Helper help=new Helper();
	
	/**
	 * 
	 * @return it's void method and does the clicking operation
	 * 
	 */
	public void clickMenu() {
		help.click(menuBar);
	}

	/**
	 * 
	 * @param categeoryName and clicks that categeory
	 */
	public void clickCategeory(String categeoryName) {
		
		By element=getFormattedString(categeory, categeoryName);
		
		help.click(element);
	}
	
	/**
	 * 
	 * @param subCategeoryName and clicks that categeory
	 */
	public void clickSubCategeory(String subCategeoryName) {
		
		By element=getFormattedString(subcategeory, subCategeoryName);
		
		help.click(element);
	}
}
