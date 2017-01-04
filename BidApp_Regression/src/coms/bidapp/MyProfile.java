package src.coms.bidapp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import src.coms.home.BaseFile;

public class MyProfile extends BaseFile {
	
		public static WebDriver driver = new FirefoxDriver();
	
		@BeforeMethod
		public void Myprofilepage() throws InterruptedException{
			
//			driver.findElement(By.xpath("/html/body/div/b/b/div/div/table/tbody/tr/td[2]/a/img")).click();	// Click on Dash board icon			
	
			driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td[2]/img")).click();	// Click on menu 			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
		//	driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li/a[2]")).click();				// Click on My profile menu			
			driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li/a")).click();				// Click on My profile menu			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			
			String ExpectedText="My Profile";
			WebElement ActualText=driver.findElement(By.xpath("/html/body/div/div[2]/h3"));
			Assert.assertEquals(ActualText, ExpectedText, "Failed to land in My Profile page!!");
		}	
	
		@Test
		public void EditMyProfile() throws InterruptedException, IOException {			
			
					
		//	driver.findElement(By.xpath("/html/body/div/div[2]/button")).click();				// Click on Edit buttons		
			driver.findElement(By.xpath("/html/body/div/div[2]/button")).click();				// Click on Edit buttons
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				
			driver.findElement(By.id("designation")).clear();
			driver.findElement(By.id("designation")).sendKeys("QA-Engineer");
			
			driver.findElement(By.id("firstname")).clear();						
			driver.findElement(By.id("firstname")).sendKeys("MAHADEV");
			
			driver.findElement(By.id("lastname")).clear();						
			driver.findElement(By.id("lastname")).sendKeys("IS");
			
			driver.findElement(By.id("dob")).clear();						
			driver.findElement(By.id("dob")).sendKeys("1986-05-14");
			
			//  driver.findElement(By.  radio button  gender selection pending
			
			driver.findElement(By.id("mobile")).clear();
			driver.findElement(By.id("mobile")).sendKeys("9964317933");
			
			driver.findElement(By.id("extension")).clear();							
			driver.findElement(By.id("extension")).sendKeys("522");
			
			driver.findElement(By.id("city")).clear();
			driver.findElement(By.id("city")).sendKeys("Bangalore");	
			
			driver.findElement(By.id("pin")).clear();							
			driver.findElement(By.id("pin")).sendKeys("560034");
			
			driver.findElement(By.id("country")).clear();							
			driver.findElement(By.id("country")).sendKeys("INDIA");
			
			driver.findElement(By.id("address")).clear();
			driver.findElement(By.id("address")).sendKeys("Koramangala");
			
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys("080-2340566");
			
			driver.findElement(By.xpath("/html/body/div/div[2]/button[2]")).click();				// Click on Save button
			
		}	
			
}
