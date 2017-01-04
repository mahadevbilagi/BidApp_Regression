package src.coms.bidapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import src.coms.home.BaseFile;

public class Notification extends BaseFile{
			
			public static WebDriver driver = new FirefoxDriver();
	
			@BeforeMethod														 //@Test annotation describes this method as a test method
		  	public void Testpagecontents() {
		
				String ExpectedText="BidApp";
				String ActualText=driver.getTitle();
				Assert.assertEquals(ActualText, ExpectedText, "Failed to land in right page!!");
				
			}			
			
			@Test (description="Testeachpage", groups="Notification")
			public void TestpagelinkandText(){
				
				driver.findElement(By.xpath(".//*[@id='footer']/table/tbody/tr/td[1]/a/img")).click();
				String ExpectedText="Notification page";
				String ActualText=driver.findElement(By.xpath("html/body/div[1]/div[2]/h2")).getText();				
				Assert.assertEquals(ActualText, ExpectedText, "Failed to verify Page header name!!");
							
			}		    
		
}
