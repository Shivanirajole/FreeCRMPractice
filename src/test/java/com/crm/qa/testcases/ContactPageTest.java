package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.ContactsPageNew;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.utility.TestUtil;

//import com.opencsv.exceptions.CsvException;

public class ContactPageTest extends TestBase {

	public ContactPageTest() throws IOException {
		super();
		
	}

	SignUpPage signuppage;
	HomePage homepage;
	LoginPage loginpage;
	ContactsPage contactpage;
	ContactsPageNew contactpagenew;
	TestUtil testutil;
	
	//String sheetName="Contacts";


	
	@BeforeMethod
	public void setup() throws Exception {
		System.out.print("*********");
		initilization();
	    loginpage = new LoginPage();
	    contactpage=new ContactsPage();
	     contactpagenew  = new ContactsPageNew();
	     testutil=new TestUtil();
	    signuppage= loginpage.ClickOnLogin();
		homepage =	signuppage.loginwebsite(prop.getProperty("username"),prop.getProperty("password"));
		contactpage =homepage.ClickOnContactLink();
	}

	
//	@Test(priority=1)
//	public void VerifyContactLabelTest() {
//		Assert.assertTrue(contactpage.VerifyContactLabel(),"contact page is missing on the page");
//	}
//	
//	@Test(priority=2)
//	public void CreateNewContactTest() {
//		contactpage.CreateNewContact();
//	}
//	
//	@Test(priority=3)
//	public void VerifyNewContactLabelTest() {
//		Assert.assertTrue(contactpage.VerifyNewContactLabel(),"New contact page is missing on the page");
//	}
	
//	@DataProvider
//	public  Object[][] getCRMTestData() {
//		Object data[][]=TestUtil.getTestData(sheetName);
//		return data;
//	}
	
//	@DataProvider
//    public Object[][] getData() throws IOException, CsvException {
//        return testutil.getCSVData("/Users/shivanirajole/eclipse-workspace/frameworkpractice/src/main/java/com/crm/qa/testdata/FreeCRMData.csv");
//    }
	
	@Test(priority=4)
	public void EnterCredentialsTest( ) throws IOException {
		
		contactpagenew=contactpage.EnterCredentials();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
