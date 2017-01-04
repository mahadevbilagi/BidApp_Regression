/*package com.bidapp;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.BASTORE;
import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.home.BaseFile;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class SNTest extends BASTORE {

	
	 driver.get("http://connect.triconinfotech.com/bidproj/#/");
     driver.findElement(By.id("userEmail")).sendKeys("mahadev@triconinfotech.com");
     driver.findElement(By.xpath(".//*[@id='get-code']/input")).click();
     Thread.sleep(500);
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.open('http://connect.triconinfotech.com/bidprojservices/user/mahadev@triconinfotech.com','_blank');");
     
     Set <String> set=driver.getWindowHandles();
     System.out.println(set.size());
     Iterator <String> it=set.iterator();
     String parent=it.next();
     String child=it.next();

     driver.switchTo().window(child);
     String str=driver.getPageSource();
     System.out.println(str);
     String strOrig = '"'+"security_code"+'"'+":";
     int intIndex = str.indexOf(strOrig);
     int quoteIndex=str.indexOf('"', intIndex+17);
     System.out.println(quoteIndex);
     if (intIndex == -1) {
                         System.out.println("Hello not found");
                } else {
                         System.out.println("Found Hello at index " + intIndex);
                         securityCode=str.substring(intIndex + 17, quoteIndex);
                         // String Temp = str.substring(intIndex+17, quoteIndex);
                }
    
             driver.switchTo().window(parent);
             driver.findElement(By.id("securityCode")).sendKeys(securityCode);
     driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row a#next-button.btn")).click();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      }

}
*/