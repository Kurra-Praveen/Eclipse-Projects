package runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusable.GetDate;
import uiStore.AmazonProductsUi;
import utilities.ConfigData;
import utilities.ScreenShots;

public class Test {
	
	public static String fun(String key) {
		
		return key;
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		
		String s="//div[@id='hmenu-content']//descendant::div[contains(text(),\"%1$s\")]";
		
		String f=String.format(s, "men's wear");
		
				
		
		System.out.println(f.toString());
		
		
//		
//		ConfigData cfg=new ConfigData();
//		
//		int x=cfg.getNumericData("Implycit-Wait");
//		
//		String f=cfg.getStringData("url");
//		
//		System.out.println(x+"  "+f);
//		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get(f);
//		
//		//String path=ScreenShots.getScreenShot(driver);
//		
//		File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	 
//		 File dest=new File("./screenshots/"+GetDate.dateTimeFormat()+".jpg");
//		 
//		 try {
//			FileUtils.copyFile(src, dest);
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//			
//			System.out.println("Unable to take screenshot");
//		}
//		
//	 System.out.println(dest.getAbsolutePath());
//		
//		System.out.println(src);
//		
//		Thread.sleep(5000);
//		
//		driver.quit();
		
	}
}