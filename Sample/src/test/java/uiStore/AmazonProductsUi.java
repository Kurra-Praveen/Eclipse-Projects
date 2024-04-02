package uiStore;

import org.openqa.selenium.By;

/**
 * @author Praveen Kurra
 *
 */

public class AmazonProductsUi {

	protected By menuBar = By.xpath("//a[@id='nav-hamburger-menu']");

	protected String categeory = "//div[@id='hmenu-content']//descendant::div[contains(text(),\"%1$s\")]";

	protected String subcategeory = "//div[@id='hmenu-content']//descendant::a[contains(text(),\"%1$s\")]";
		
	protected String categeory1 = "//div[@id='1']//descendant::div[contains(text(),\"%1$s\")]";

	
	
	
	/**
	 * 
	 * @param actual format string
	 * @param insert into that format string
	 * @return the By element from org.openqa.selenium.By
	 */
	public By getFormattedString(String actual, String insert) {
		
		
		
		String sb=String.format(actual, insert);

		return By.xpath(sb);

	}
	
}









//StringBuffer sb = new StringBuffer(actual);
//
//int index = sb.indexOf("?");
//
//sb.replace(index, index + 1, "");
//
//sb.insert(index, insert);