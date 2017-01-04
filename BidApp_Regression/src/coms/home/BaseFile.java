package src.coms.home;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import src.coms.mails.SendMails;

public class BaseFile {		
	   
//	String pathToChromeServer="D://Softwares//chromedriver.exe";
	
	  //  public static WebDriver driver = new FirefoxDriver();		 //Declared as public static to use same webdriver instance publicly\\
	
	  //public static WebDriver driver = new FirefoxDriver();		 //Declared as public static to use same webdriver instance publicly
	
	    /* public WebDriver driver;
			  
	    public WebDriver getDriver() {     // for chrome
			return driver;
		}

		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}  */

		@BeforeTest												 //@BeforeSuite annotation describes this method has to run before all suites
	    public void setup() throws Exception { 
	    
				
	    	   /* driver.manage().deleteAllCookies();
	    	    * System.setProperty("webdriver.chrome.driver",pathToChromeServer);	    	 // for chrome
	    	    setDriver(new ChromeDriver());*/
	    	    
		        /*driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	 
		        driver.get("http://connect.triconinfotech.com/corpbuzz-dev/#/"); 	*/         
/*		 		
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
		 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
		         
	    } 
	    
	 /*  @AfterTest													//@AfterSuite annotation describes this method has to run after execution of all suites
	    public void tearDown() throws Exception { 
	    	
			 if (BaseFile.driver != null) {
        		BaseFile.driver.quit();
		}*/
	    
	    
	   /* @AfterSuite
		 public  void Mail() throws Exception { 
		
			SendMailTestGayathri.execute("emailable-report.html");	
	    }*/
		
		@AfterSuite
		 public void Mail() throws Exception { 
		
			SendMails.execute("emailable-report.html");			
							
		}		
		
}


















/*package com.home;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.connect.email.SendMailTestGayathri;

public class BaseFile {		
	   
	    public static WebDriver driver = new FirefoxDriver();		 //Declared as public static to use same webdriver instance publicly
	   
	    @BeforeTest												 //@BeforeSuite annotation describes this method has to run before all suites
	    public void setup() throws Exception { 
	    	
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	 
		        driver.get("http://connect.triconinfotech.com/corpbuzz-dev/#/"); 	         
		         
//		     	driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row div#get-code.col-xs-2 input")).click();     // click on generate key
//				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				String securityCode=null;
		 		
		 		driver.findElement(By.id("userEmail")).sendKeys("mahadev@triconinfotech.com");
		 		driver.findElement(By.xpath(".//*[@id='get-code']/input")).click();
		 		try {
		 				Thread.sleep(500);
		 			} catch (InterruptedException e) {
		 				e.printStackTrace();
		 			}
		 		
		 		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 		jse.executeScript("window.open('http://connect.triconinfotech.com/bidprojservices/user/mahadev@triconinfotech.com','_blank');");
		 		
		 		Set <String> set=driver.getWindowHandles();
		 		System.out.println(set.size());
		 		Iterator <String> it=set.iterator();
		 		String parent=it.next();
		 		String child=it.next();
		 		
		 		driver.switchTo().window(child);
		 		String str=driver.getPageSource();
		 	//	System.out.println(str);
		 		String strOrig = '"'+"security_code"+'"'+":";
		 		int intIndex = str.indexOf(strOrig);
		 		int quoteIndex=str.indexOf('"', intIndex+17);
		 	//	System.out.println(quoteIndex);
		 		if (intIndex == -1) 
		 			{
		 			     System.out.println("Hello not found");
		 		    }
		 			else{
		 		             System.out.println("Found Hello at index " + intIndex);
		 		             securityCode=str.substring(intIndex + 17, quoteIndex);
		 		             // String Temp = str.substring(intIndex+17, quoteIndex);
		 			    }
	
		 		 driver.switchTo().window(parent);
		 		 driver.findElement(By.id("securityCode")).sendKeys(securityCode);
		 		 driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row a#next-button.btn")).click();
		 		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		         
	    } 
	    
	    @AfterTest													//@AfterSuite annotation describes this method has to run after execution of all suites
	    public void tearDown() throws Exception { 
	    	
//			driver.close(); 
	         
	    } 
	    
	    @AfterSuite
		 public  void Mail() throws Exception { 
		
			SendMailTestGayathri.execute("emailable-report.html");	
	    }
}*/