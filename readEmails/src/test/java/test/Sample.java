package test;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1675921604&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d9c74c630-3a20-1661-4bf4-f385fd6706d3&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("seleniumwithjava@outlook.com",Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Selenium@12");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.id("idBtn_Back")).click();
		/*
		driver.findElement(By.xpath("//*[text()='Inbox']")).click();
		
		 List<WebElement>elements=   driver.findElements(By.xpath("//*[@class='zXLz3']//div[@class='hcptT']"));
		 
		 for (WebElement ele:elements) {
			 
			 ele.click();
			 
			List<WebElement> content= driver.findElements(By.xpath("//*[@class='x_gmail_quote']//following::tr"));
	      
			for(WebElement contentElement:content) {
				
				String text=contentElement.getText();
				
				System.out.println(text);
			}
		
		 }
		 
		// driver.quit();
		*/ 
		
		Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//span[text()='New mail']")).click();
		 
		 driver.findElement(By.xpath("(//div[@role='textbox'])[1]")).sendKeys("kurrapraveen14@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Add a subject']")).sendKeys("sample testing");
		 
		 driver.findElement(By.xpath("//*[@id='editorParent_1']")).click();
		 
		 driver.findElement(By.xpath("//*[@id='editorParent_1']//div")).sendKeys("ghss");
		 
		 driver.findElement(By.id("620_21_8")).click();
		 
		WebElement browse= driver.findElement(By.xpath("//*[text()='Browse this computer']"));
		
		browse.click();
		
		//driver.findElement(By.xpath("//*[@title='Send (Ctrl+Enter)']")).click();
		
		   // creating object of Robot class
		
		Thread.sleep(5000);
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("appium commands.txt");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		 
	    driver.findElement(By.xpath("//*[@title='Send (Ctrl+Enter)']")).click();
	}
}
