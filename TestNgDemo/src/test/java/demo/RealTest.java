package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelData;

public class RealTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("Start test");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		String url = "https://amazon.in";
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.manage().window().maximize();

	}
	
	@Test(dataProvider = "excel" ,dataProviderClass = ExcelData.class)
	public void test(String keyword1,String key2) {
			
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(keyword1,Keys.ENTER);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(key2,Keys.ENTER);
		
		
		
	}
	
	@AfterSuite
	public void teardown() {
		
		driver.quit();
	}

}
