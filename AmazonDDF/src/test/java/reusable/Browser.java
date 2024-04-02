package reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import  utilities.FinalVariables;

public class Browser {
	
	public static WebDriver startBrwser(WebDriver driver, String browserName,String url) {


		if (browserName.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browserName.equals("Edge")) {

			WebDriverManager.edgedriver().setup();

			driver=new EdgeDriver();


		} else {

			System.out.println("Sorry this browser Doesnt support");
		}

		driver.manage().window().maximize();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(FinalVariables.IMPLICITLY_WAIT, TimeUnit.SECONDS);

		return driver;

	}

	public static void quitBrowser(WebDriver driver) {

		driver.quit();
	}

}


