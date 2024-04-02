package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	/**
	 * 
	 * @param driver object
	 * @param name of the driver you want
	 * @return the driver with the required parameters
	 */
	public static WebDriver getDriver(WebDriver driver,String name)  {
		
		ConfigData cfg=new ConfigData();
		
		if(name.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
//			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		else if (name.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "./Drivers//msedgedriver.exe");
			
			//WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
			
		}else {
			
			System.out.println("Sorry this browser is not supported");
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(cfg.getNumericData("Implycit-Wait"),TimeUnit.SECONDS);
		
		driver.get(cfg.getStringData("url"));
		
		return driver;
	}
	

}
