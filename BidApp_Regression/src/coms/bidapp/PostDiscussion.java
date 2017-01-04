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

public class PostDiscussion extends BaseFile{
			
			int i;
					
			@BeforeClass
			public void initialize() {
				i = 364;								
			}
	
			@Test(invocationCount = 144)												 					//@BeforeSuite annotation describes this method has to run before all suites
		    public void NewPost() throws Exception { 				
				
				
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
			//	driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[8]/a")).click();				// Click on Post your add menu
		        
		        driver.findElement(By.xpath("//*[@id='right_menu']/ul/li[9]/a")).click();					// Click on Post Discussion
		      
		        driver.findElement(By.id("inputTitle")).click();																// Click on Title
		        driver.findElement(By.id("inputTitle")).sendKeys("TestNG Post Discussion - "+i);								// Enter Title details
		        
		        driver.findElement(By.id("inputDescription")).click();																// Click on Post your Query
		        driver.findElement(By.id("inputDescription")).sendKeys("TestNG Post Discussion TestNG Post Discussion TestNG Post Discussion TestNG Post Discussion TestNG Post Discussion - "+i);	// Enter the details		  
		        
		        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/form/div[3]/tags-input/div/div")).click();					// Click on Add a tag
		        
		        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/form/div[3]/tags-input/div/div")).sendKeys("Java"+"Keys.SPACE");		// Enter the Tag details - 1
		        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/form/div[3]/tags-input/div/div")).sendKeys("Keys.SPACE");		// Enter the Tag details - 1
		        
		        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/form/div[3]/tags-input/div/div")).sendKeys("TestNg"+"Keys.SPACE");		// Enter the Tag details - 2
		       // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/form/div[3]/tags-input/div/div")).sendKeys("Keys.SPACE");		// Enter the Tag details - 2        
		        
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[4]/span[1]/label/input")).click();			// Select Discussion type = Opinion
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[4]/span[1]/label/input")).click();			// Click once again on Opinion radio button 
		        
//		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[4]/span[2]/label/input")).click();			// Select Discussion type = Topic
//		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[4]/span[2]/label/input")).click();
		        
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).click();														// Click on first Opinion
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).sendKeys("Yes");												// Enter the first opinion 		 
		        
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[5]/div/input[3]")).click();						// Click on + after first opinion
		        
		      
		        driver.findElement(By.xpath("//div/div[2]/input[@id='opinionValue']")).click();						   // Click on 2nd Opinion
		        driver.findElement(By.xpath("//div/div[2]/input[@id='opinionValue']")).sendKeys("No");					// Enter the 2nd opinion
		        
		        /*driver.findElement(By.xpath("//*[@id='opinionValue']")).sendKeys("No");				// Enter the first opinion
		        
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).click();						// Click on first Opinion
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).sendKeys("Yes");				// Enter the first opinion  
		        
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).click();						// Click on first Opinion
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).sendKeys("Yes");				// Enter the first opinion  
		        
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).click();						// Click on first Opinion
		        driver.findElement(By.xpath("//*[@id='opinionValue']")).sendKeys("Yes");				// Enter the first opinion  		        	      
*/		        
		        driver.findElement(By.id("resultDate")).click();
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[6]/span/input[1]")).sendKeys("2015-10-29");					// Enter the result date
		        driver.findElement(By.id("myTime")).sendKeys("20:30:00");																			// Pass the time
		        
		        driver.findElement(By.id("freezeDate")).click();
		        driver.findElement(By.xpath(".//*[@id='freezeDate']")).sendKeys("2015-10-29");												// Enter the freeze date
		        driver.findElement(By.id("freezeTime")).sendKeys("20:30:00");																			// Pass the  freeze time
		        
		        
		        driver.findElement(By.id("submit")).click();				// Click on Submit button
		        
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
