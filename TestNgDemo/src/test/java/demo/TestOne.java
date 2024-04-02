package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	WebDriver driver;
	
	@BeforeSuite
	public void Intialize(){
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
	}
	
	@Test
	public void ActualTest() {
		
		driver.get("https://amazon.in");
	}

	
}
