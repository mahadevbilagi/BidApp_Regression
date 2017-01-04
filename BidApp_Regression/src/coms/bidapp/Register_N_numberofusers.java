package src.coms.bidapp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.TemporaryFilesystem;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.coms.home.BaseFile;
import src.coms.mails.SendMails;

public class Register_N_numberofusers extends BaseFile{
			
			int i;
					
			@BeforeClass
			public void initialize() {
				i = 8631;								
			}
	
			@Test(invocationCount = 500)												 					//@BeforeSuite annotation describes this method has to run before all suites
		    public void Newusertest() throws Exception { 				
				
				
				WebDriver driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();							// delete all the cookies
				
				driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	 
		        driver.get("http://connect.triconinfotech.com/corpbuzz-dev/#/"); 	
				
			    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			    
		        driver.findElement(By.id("organizationName")).click();  							// select the company name
		        driver.findElement(By.id("organizationName")).sendKeys("Tricon Infotech");
		        
		 		driver.findElement(By.id("next-button")).click();									// Click on next buttons
		 		
		 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 		
		        driver.findElement(By.id("firstName")).click();  									// Enter the First name
		        driver.findElement(By.id("firstName")).sendKeys("TestngUser"+i);						
		        

		        driver.findElement(By.id("lastName")).click();  									// Enter the First name
		        driver.findElement(By.id("lastName")).sendKeys("Tester");						
		        			        			        
		        driver.findElement(By.id("rEmail")).click();  										// select the company email id
		        driver.findElement(By.id("rEmail")).sendKeys("testnguser"+i+"@triconinfotech.com");
		        			  
		        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[6]/input")).click();  	// click on generate authentication code button			        			        
		        
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			        
		        driver.findElement(By.id("authCode")).click();  									// select the company email id
		        
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			        
		        driver.findElement(By.id("registerBtn")).click();  									// select the company name			 		
		 		
		        i++;		
		        
		        driver.quit();
		    } 
			
			@AfterTest
			public void afterSuite() {
				
					System.out.println("in afterSuite");
					try {
						SendMails.execute("emailable-report.html");
					} catch (Exception e) {
	
						e.printStackTrace();
					}
				
			     TemporaryFilesystem.getDefaultTmpFS().deleteTemporaryFiles();				
			}	
}
