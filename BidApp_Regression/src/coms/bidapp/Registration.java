package src.coms.bidapp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import src.coms.home.BaseFile;

public class Registration extends BaseFile {
	
	public static WebDriver driver = new FirefoxDriver();

	@BeforeMethod
	// @Test annotation describes this method as a test method
	public void RegistrationPage() {

		String ExpectedText = "Welcome to CorpBuzz";
		String ActualText = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/h3")).getText();
		Assert.assertEquals(ActualText, ExpectedText,"Failed to land on Welcome page!!");

	}

	@Test
	public void Pagetitle() {

		String ExpectedText = "CorpBuzz";
		String ActualText = driver.getTitle();
		Assert.assertEquals(ActualText, ExpectedText,"Failed to find the page title!!");

	}

	@Test
	public void CheckWelcomeNote() {

		String ExpectedText = "CorpBuzz helps you to sell your products within an organization.";
		String ActualText = driver.findElement(By.xpath("/html/body/div/div/div/div/p")).getText();
		Assert.assertEquals(ActualText, ExpectedText,"Failed to check the welcome note!!");

	}

	@Test
	public void CheckLabel1() {

		String ExpectedText = "New User ?";
		String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h5")).getText();
		Assert.assertEquals(ActualText, ExpectedText,"Failed to check the welcome note!!");

	}

	@Test(description = "Test Placeholder text", groups = "RegistrationPage")
	public void NewUserPlaceholdertext() {
		String ExpectedText = "Enter your company Name";
		String ActualText = driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row div.col-xs-12 input#organizationName.form-control")).getAttribute("placeholder");
		Assert.assertEquals(ActualText, ExpectedText,"Failed to verify Placeholder textname!!");

	}

	@Test
	public void CheckLabel2() {

		String ExpectedText = "OR";
		String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h3")).getText();
		Assert.assertEquals(ActualText, ExpectedText,"Failed to check the welcome note!!");

	}

	@Test
	public void CheckLabel3() {

		String ExpectedText = "Existing User";
		String ActualText = driver.findElement(By.xpath("/html/body/div/div[3]/h5")).getText();
		Assert.assertEquals(ActualText, ExpectedText,"Failed to check the lable!!");

	}

	@Test
	public void ExistingUserPlaceholdertext() {
		String ExpectedText = "Your corporate email";
		String ActualText = driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row div.col-xs-10 input#userEmail.form-control")).getAttribute("placeholder");
		Assert.assertEquals(ActualText, ExpectedText,"Failed to verify Placeholder textname!!");

	}

	@Test
	public void SecurityCodePlaceholdertext() {
		String ExpectedText = "Security code";
		String ActualText = driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row div.col-xs-8 input#securityCode.form-control")).getAttribute("placeholder");
		Assert.assertEquals(ActualText, ExpectedText,"Failed to verify Placeholder textname!!");

	}

	@Test
	public void ReadToken() {
		String ExpectedText = "Security code";
		String ActualText = driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row div.col-xs-8 input#securityCode.form-control")).getAttribute("placeholder");
		Assert.assertEquals(ActualText, ExpectedText,"Failed to verify Placeholder textname!!");

	}

	@Test
	public void GenerateKey() {
		driver.findElement(By.cssSelector("html body div.ng-scope div.container div.row div#get-code.col-xs-2 input")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void SelectKey() throws JSONException {
		
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

}
