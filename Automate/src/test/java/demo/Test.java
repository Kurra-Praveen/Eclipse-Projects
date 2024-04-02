package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://forms.office.com/r/zv3yZNC4bM");
		
		driver.findElement(By.xpath("(//div[@class='office-form-textfield'])[1]//input"))
		.sendKeys("Praveen");
		driver.findElement(By.xpath("(//div[@class='office-form-textfield'])[2]//input"))
		.sendKeys("Kurra");
		driver.findElement(By.xpath("(//div[@class='office-form-textfield'])[3]//input"))
		.sendKeys("Tuni");
		driver.findElement(By.xpath("(//div[@class='button-content'])[2]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
