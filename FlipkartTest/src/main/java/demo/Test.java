package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test {
	
  static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement search=locatorGenerator("xpath#//input[@class='gLFyf']");
		
		search.sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	
	public static WebElement locatorGenerator(String path) {
		
		int i=path.indexOf('#');
		
		String elementPath=  path.substring(i+1);
		 
		String locator=  path.substring(0, i);
				
		switch (locator) {
		
		case "xpath":
			
		return	driver.findElement(By.xpath(elementPath));
		
		case "cssSelector":
			
			return driver.findElement(By.cssSelector(elementPath));
			
		default:
			return null;
		}
	}
}
