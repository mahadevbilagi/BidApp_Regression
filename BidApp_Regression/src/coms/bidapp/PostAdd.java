package src.coms.bidapp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import src.coms.home.BaseFile;

public class PostAdd extends BaseFile {
	
	    public static WebDriver driver = new FirefoxDriver();
	
		@BeforeMethod
		public void PostAddPage() throws InterruptedException{								
		     
			driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td[2]/img")).click();	// Click on menu 
			driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[8]/a")).click();				// Click on Post your add menu
			
			String ExpectedText = "Post your Ad";
			String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h4/label")).getText();
			Assert.assertEquals(ActualText, ExpectedText,"Failed to read the text 'Post Free Ad'!!");

		}

		@Test
		public void PostAddMobile() throws InterruptedException, IOException {			
		

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
			
			driver.findElement(By.id("internal_memory")).click();							// click on Internal_memory
			driver.findElement(By.id("internal_memory")).sendKeys("16");					// Enter the Internal_memory details
			
			driver.findElement(By.id("price")).click();									// click on Price
			driver.findElement(By.id("price")).sendKeys("7500");			 				// Enter the Price details
			
			driver.findElement(By.id("inputDescription")).click();																					// click on inputDescription
			driver.findElement(By.id("inputDescription")).sendKeys("Reach me @ cellphone  - (Post added by TestNG - Selenium)");					// Enter the Description details
			
		/*	WebElement element= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[5]/div/a"));
			element.sendKeys("C://Users//mahadev//Desktop//BuySell//Test.png");
			*/
			
			
		 /*   driver.findElement(By.id("fileupload")).sendKeys("C:/Users/mahadev/Desktop/BuySell/Test.png"); // Add your file path
		    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[5]/div/a")).click();*/
			
		  /*  Thread.sleep(20000);			    
		    Runtime.getRuntime().exec("C:/Program Files (x86)/AutoIt3/AutoIt3.exe");
		    
			WebElement element = driver.findElement(By.name("file"));
			element.click();	               //Which calls the autoit exe file
			Runtime.getRuntime().exec("G:/Tutorial/AutoItScripts/upload.exe");
			Thread.sleep(20000);*/
			
			/*WinWaitActive("File Upload")
			Send("G:\Tutorial\AutoItScripts\TestScripts\Test.doc")
			Send("{ENTER}")
		    */
			
			/*WebElement element1= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[5]/div/a"));
			element1.sendKeys("C://Users//mahadev//Desktop//BuySell//Test.png");*/
			
	/*		WebElement UploadImg1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[5]/div/a"));
			UploadImg1.click();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			WebElement frame1 =driver.switchTo().activeElement();
			frame1.sendKeys("C://Users//mahadev//Desktop//BuySell//Test.png");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			WebElement UploadImg2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[5]/div/a"));
			UploadImg2.click();
			WebElement frame2 =driver.switchTo().activeElement();
			frame2.sendKeys("C://Users//mahadev//Desktop//BuySell//Blue.png");
			*/
			
			/*JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].setAttribute('style', arguments[1])", driver.findElement(By.xpath("//input[@type='file']")), "0");
			Thread.sleep(20000);
			js.executeScript("arguments[0].setAttribute('class', arguments[1])", driver.findElement(By.xpath("//input[@type='file']/../../div[2]")), "a");
			Thread.sleep(20000);
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C://Users//mahadev//Desktop//BuySell//Test.png");
			Thread.sleep(20000);*/
			
			driver.findElement(By.id("submit")).click();													// click on Submit				
			
	/*		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[2]")).click();     // Select Product = Tablet	
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[3]")).click();     // Select Product = Car
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[4]")).click();     // Select Product = LAPTOP
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[5]")).click();     // Select Product = Bike
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[6]")).click();     // Select Product = Rent Room
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[7]")).click();     // Select Product = Share Room					
*/						
		}
		
		/*@Test
		public void PostAddTablet() {

			driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td[2]/img")).click();	
			driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[8]/a")).click();
			
			String ExpectedText = "Post your Ad";
			String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h4/label")).getText();
			Assert.assertEquals(ActualText, ExpectedText,"Failed to read the text 'Post Free Ad'!!");
			
			driver.findElement(By.id("inputTitle")).click();  															// Click on Title
			driver.findElement(By.id("inputTitle")).sendKeys("TestNG - Apple Tablet for Sale!");						// Enter the Title details		
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}		
			driver.findElement(By.id("product_div")).click();				      // Click on Product
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[2]")).click();    		  // Select Product = Tablet
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div/ul/span")).click();         // Click on Brand					
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[5]")).click();     // Select Brand=Apple
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li")).click();        // Select Brand=LG			
		 	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     // Click on Brand=Samsung
		 	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[3]")).click();     // Click on Brand=Sony
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[4]")).click();     // Click on Brand=Micromax
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[5]")).click();     // Click on Brand=Apple
							
			
			driver.findElement(By.id("model")).click();													// click on Model
			driver.findElement(By.id("model")).sendKeys("IPad Mini");									// Enter the Model details
			
			driver.findElement(By.id("ram")).click();													// click on RAM
			driver.findElement(By.id("ram")).sendKeys("8");												// Enter the model details
			
			driver.findElement(By.id("internal_memory")).click();										// click on Internal_memory
			driver.findElement(By.id("internal_memory")).sendKeys("16");								// Enter the Internal_memory details
			
			driver.findElement(By.id("processor")).click();												// click on processor
			driver.findElement(By.id("processor")).sendKeys("ARM Cortex-A8");							// Enter the processor details
			
			driver.findElement(By.id("price")).click();													// click on Price
			driver.findElement(By.id("price")).sendKeys("25000.00");									// Enter the Price details				
			
			driver.findElement(By.id("inputDescription")).click();																					// click on inputDescription
			driver.findElement(By.id("inputDescription")).sendKeys("Reach me @ cellphone  - (Post added by TestNG - Selenium)");					// Enter the Description details
			
			driver.findElement(By.id("submit")).click();													// click on Submit		
			
		}*/
		
		
		/*@Test
		public void PostAddCar() {

			driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td[2]/img")).click();	
			driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[8]/a")).click();
			
			String ExpectedText = "Post your Ad";
			String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h4/label")).getText();
			Assert.assertEquals(ActualText, ExpectedText,"Failed to read the text 'Post Free Ad'!!");

			driver.findElement(By.id("inputTitle")).click();  														// Click on Title
			driver.findElement(By.id("inputTitle")).sendKeys("TestNG - Car for Sale!");								// Enter the Title details			
						
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
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[3]")).click();     // Select Product = CAR
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div/ul/span")).click();        	   // Click on Brand					
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li/span[2]")).click();     // Click on Brand = Maruti		
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li/span[3]")).click();     // Click on Brand = Audi
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li/span[4]")).click();     // Click on Brand = Jaguar
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li/span[5]")).click();     // Click on Brand = Honda
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li/span[6]")).click();     // Click on Brand = BMW
						
			driver.findElement(By.id("model")).click();												// click on Model
			driver.findElement(By.id("model")).sendKeys("Ikon");									// Enter the Model details
			
			driver.findElement(By.id("odometer_reading")).click();									// click on odometer_reading
			driver.findElement(By.id("odometer_reading")).sendKeys("5000");							// Enter the odometer_reading details
				
			driver.findElement(By.id("year")).click();												// click on year
			driver.findElement(By.id("year")).sendKeys("2004");										// Enter the year details
			
			driver.findElement(By.id("price")).click();												// click on Price
			driver.findElement(By.id("price")).sendKeys("25000.00");								// Enter the Price details
			
			driver.findElement(By.id("inputDescription")).click();																					// click on inputDescription
			driver.findElement(By.id("inputDescription")).sendKeys("Reach me @ cellphone  - (Post added by TestNG - Selenium)");					// Enter the Description details
			
			driver.findElement(By.id("submit")).click();													// click on Submit		
			
		}
		*/

		/*@Test
		public void PostAddLaptop() {

			driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td[2]/img")).click();	
			driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[8]/a")).click();
			
			String ExpectedText = "Post your Ad";
			String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h4/label")).getText();
			Assert.assertEquals(ActualText, ExpectedText,"Failed to read the text 'Post Free Ad'!!");

			driver.findElement(By.id("inputTitle")).click();  														// Click on Title
			driver.findElement(By.id("inputTitle")).sendKeys("TestNG - LAPTOP for Sale!");								// Enter the Title details			
					
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
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[4]")).click();     		  // Select Product = Laptop
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div/ul")).click();         	 	// Click on Brand					
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li")).click();     		// Click on Brand = Dell
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     	// Click on Brand = Samsung
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     	// Click on Brand = Sony
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     	// Click on Brand = Acer
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     	// Click on Brand = Lenovo
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     	// Click on Brand = IBM			
			
			driver.findElement(By.id("model")).click();														// click on Model
			driver.findElement(By.id("model")).sendKeys("Dell-Inspirion");											// Enter the Model details
			
			driver.findElement(By.id("ram")).click();														// click on ram
			driver.findElement(By.id("ram")).sendKeys("4");													// Enter the ram details
				
			driver.findElement(By.id("hard_disk")).click();													// click on hard_disk
			driver.findElement(By.id("hard_disk")).sendKeys("1");											// Enter the hard_disk details
				
			driver.findElement(By.id("processor")).click();													// click on processor
			driver.findElement(By.id("processor")).sendKeys("Intel Core I7");								// Enter the processor details
			
			driver.findElement(By.id("price")).click();														// click on Price
			driver.findElement(By.id("price")).sendKeys("35000.00");										// Enter the Price details
			
			driver.findElement(By.id("inputDescription")).click();																					// click on inputDescription
			driver.findElement(By.id("inputDescription")).sendKeys("Reach me @ cellphone  - (Post added by TestNG - Selenium)");					// Enter the Description details
			
			driver.findElement(By.id("submit")).click();													// click on Submit		
			 
		}*/
				
		/*@Test
		public void PostAddBike() {

			driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td[2]/img")).click();	
			driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[8]/a")).click();
			
			String ExpectedText = "Post your Ad";
			String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h4/label")).getText();
			Assert.assertEquals(ActualText, ExpectedText,"Failed to read the text 'Post Free Ad'!!");

			driver.findElement(By.id("inputTitle")).click();  														// Click on Title
			driver.findElement(By.id("inputTitle")).sendKeys("TestNG - Bike for Sale!");								// Enter the Title details			
					
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
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[2]/div[2]/ul/li[5]")).click();     		  // Select Product = Bike
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div/ul")).click();         	 	// Click on Brand					
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li")).click();     		// Click on Brand = Yamaha
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[2]")).click();     	// Click on Brand = CBR
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[3]")).click();     	// Click on Brand = Pulsar
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/ul/li[4]")).click();     	// Click on Brand = Suzuki
		 			
			driver.findElement(By.id("model")).click();												// click on Model
			driver.findElement(By.id("model")).sendKeys("CBR 150R");									// Enter the Model details
			
			driver.findElement(By.id("odometer_reading")).click();									// click on odometer_reading
			driver.findElement(By.id("odometer_reading")).sendKeys("6000");							// Enter the odometer_reading details
				
			driver.findElement(By.id("year")).click();												// click on year
			driver.findElement(By.id("year")).sendKeys("2008");										// Enter the year details
			
			driver.findElement(By.id("price")).click();												// click on Price
			driver.findElement(By.id("price")).sendKeys("27000.00");								// Enter the Price details
			
			driver.findElement(By.id("inputDescription")).click();																					// click on inputDescription
			driver.findElement(By.id("inputDescription")).sendKeys("Reach me @ cellphone  - (Post added by TestNG - Selenium)");					// Enter the Description details
			
			driver.findElement(By.id("submit")).click();													// click on Submit		
			 
		}
		*/
}
