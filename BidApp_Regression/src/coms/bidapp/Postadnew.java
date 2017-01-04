package src.coms.bidapp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.coms.home.BaseFile;

public class Postadnew extends BaseFile{
			
			int i;
					
			@BeforeClass
			public void initialize() {
				i = 1;								
			}
	
			@Test(invocationCount = 1)												 					//@BeforeSuite annotation describes this method has to run before all suites
		    public void Newusertest() throws Exception { 				
				
				WebDriver driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();							// delete all the cookies
				
				driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	 
		        driver.get("http://connect.triconinfotech.com/corpbuzz-dev/#/"); 	
				
			    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			    
		        driver.findElement(By.id("userEmail")).click();  											// select the company name
		        
		        driver.findElement(By.id("userEmail")).sendKeys("testnguser"+i+"@triconinfotech.com");	
		 		
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			        
		        driver.findElement(By.xpath("//*[@id='get-code']/input")).click();  						// click on generate authentication code button	

		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			        
		        driver.findElement(By.id("next-button")).click();											// Click on next buttons
		        
		        driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td[2]/img")).click();	// Click on menu 
				driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[8]/a")).click();				// Click on Post your add menu
		        
				driver.findElement(By.id("inputTitle")).click();  														// Click on Title
				driver.findElement(By.id("inputTitle")).sendKeys("TestNG - LG moble for Sale!");						// Enter the Title details		
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div/ul")).click();				      // Click on Product		
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/form/div[2]/div[2]/ul/li[7]/i")).click();    		      // Select Product = Mobile
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				driver.findElement(By.xpath("//*[@id='brand_div']/ul")).click();         // Click on Brand			
				driver.findElement(By.xpath("//*[@id='subCategoryDiv']/div[1]/div/div[2]/ul/li[1]")).click();        // Select Brand=LG
				
	/*		 	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     // Click on Brand=Samsung
			 	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[3]")).click();     // Click on Brand=Sony
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[4]")).click();     // Click on Brand=Microsoft
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[5]")).click();     // Click on Brand=Micromax
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[6]")).click();     // Click on Brand=Apple
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[7]")).click();     // Click on Brand=Motorala				
	*/			
				driver.findElement(By.id("model")).click();										// click on Model
				driver.findElement(By.id("model")).sendKeys("Nexus-5");					    	// Enter the Model details
				
				driver.findElement(By.id("ram")).click();										// click on RAM
				driver.findElement(By.id("ram")).sendKeys("8");									// Enter the model details
				
				driver.findElement(By.id("attr_internal_memory")).click();							// click on Internal_memory
				driver.findElement(By.id("attr_internal_memory")).sendKeys("16");					// Enter the Internal_memory details
				
				driver.findElement(By.id("price")).click();									    // click on Price
				driver.findElement(By.id("price")).sendKeys("7500");			 				// Enter the Price details
				
				driver.findElement(By.id("inputDescription")).click();																					// click on inputDescription
				driver.findElement(By.id("inputDescription")).sendKeys("Reach me @ cellphone  - (Post added by TestNG - Selenium)");					// Enter the Description details
				
				driver.findElement(By.id("submit")).click();													// click on Submit					
				
		        i++;		
		        
		        //    driver.close();
		    } 
			
		 /*	@AfterTest
			public void afterSuite() {
					System.out.println("in afterSuite");
					try {
						SendMails.execute("emailable-report.html");
					} catch (Exception e) {
					e.printStackTrace();
				    }
			}	
			*/
}
