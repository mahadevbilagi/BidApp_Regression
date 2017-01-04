package src.coms.bidapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import src.coms.home.BaseFile;

public class Existinguser extends BaseFile {
	
			public static WebDriver driver = new FirefoxDriver();
	
			@BeforeTest												 //@BeforeSuite annotation describes this method has to run before all suites
		    public void Existingusertest() throws Exception { 
			 		
			        driver.findElement(By.id("userEmail")).click();
			        driver.findElement(By.id("userEmail")).clear();
			 		driver.findElement(By.id("userEmail")).sendKeys("mahadev@triconinfotech.com");
			 		driver.findElement(By.xpath(".//*[@id='get-code']/input")).click();
			 		try {
			 				Thread.sleep(500);
			 			} catch (InterruptedException e) {
			 				e.printStackTrace();
			 			}
			 		
			 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		 		
			 		driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row a#next-button.btn")).click();
			 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			         
		    } 	

}
