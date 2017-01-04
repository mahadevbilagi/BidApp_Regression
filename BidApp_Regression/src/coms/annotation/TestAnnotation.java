package src.coms.annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.coms.mails.SendMails;

public class TestAnnotation {

	int count;

	@BeforeClass
	public void initialize() {
		count = 0;
	}

	@Test(invocationCount = 5)
	public void testCount() {
		count++;
		System.out.println("in test case:" + count); // test case 1

	}

	@AfterTest
	public void afterSuite() {
		System.out.println("in afterSuite");
		try {
			SendMails.execute("emailable-report.html");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}

/*
 * @Test public void testCase1() { System.out.println("in test case 1"); // test
 * case 1 }
 * 
 * @Test public void testCase2() { System.out.println("in test case 2"); // test
 * case 2 }
 * 
 * @Test public void testCase3() { System.out.println("in test case 3"); // test
 * case 2 }
 * 
 * @BeforeMethod public void beforeMethod() {
 * System.out.println("in beforeMethod"); }
 * 
 * @AfterMethod public void afterMethod() {
 * System.out.println("in afterMethod"); }
 * 
 * @BeforeMethod public void beforeMethod1() {
 * System.out.println("in beforeMethod"); }
 * 
 * @BeforeClass public void beforeClass() {
 * System.out.println("in beforeClass"); }
 * 
 * @AfterClass public void afterClass() { System.out.println("in afterClass"); }
 * 
 * @BeforeTest public void beforeTest() { System.out.println("in beforeTest"); }
 * 
 * @AfterTest public void afterTest() { System.out.println("in afterTest"); }
 * 
 * @BeforeSuite public void beforeSuite() {
 * System.out.println("in beforeSuite"); }
 * 
 * @AfterSuite public void afterSuite() { System.out.println("in afterSuite");
 * try { SendMail.execute("emailable-report.html"); } catch (Exception e) { //
 * TODO Auto-generated catch block e.printStackTrace(); }
 */
