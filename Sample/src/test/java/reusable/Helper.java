package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper extends BaseClass{
	
	public void click(By element) {
		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		driver.findElement(element).click();
	}

}
